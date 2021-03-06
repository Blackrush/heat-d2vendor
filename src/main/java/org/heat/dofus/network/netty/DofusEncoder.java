package org.heat.dofus.network.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import org.heat.dofus.network.DofusProtocol;
import org.heat.dofus.network.NetworkMessage;

import static org.heat.dofus.network.DofusProtocol.MAX_HEADER_LEN;

public final class DofusEncoder extends ChannelOutboundHandlerAdapter {
    @Override
    public void write(ChannelHandlerContext ctx, Object o, ChannelPromise promise) throws Exception {
        if (!(o instanceof NetworkMessage)) {
            ctx.write(o, promise);
            return;
        }

        NetworkMessage msg = (NetworkMessage) o;

        ByteBuf body = writeBody(ctx, msg);
        ByteBuf header = writeHeader(ctx, msg.getProtocolId(), body.readableBytes());

        // NOTE(Blackrush): cheap operation, just glueing header and body together
        CompositeByteBuf buffer = ctx.alloc().compositeBuffer(2);
        buffer.addComponents(header.slice(), body.slice());
        buffer.writerIndex(header.readableBytes() + body.readableBytes());

        // kick off serialized buffer
        ctx.write(buffer, promise);
    }

    private ByteBuf writeBody(ChannelHandlerContext ctx, NetworkMessage msg) {
        if (!msg.isAlwaysEmpty()) {
            // NOTE(Blackrush): costly operation,
            //      we now the message isn't empty so we can undoubtebly 2^4-1 bytes
            //      this might take up to 2^24-1 bytes

            ByteBuf buf = ctx.alloc().buffer(0xF, DofusProtocol.MAX_MESSAGE_LEN);
            msg.serialize(NettyDataWriter.of(buf));
            return buf;
        } else {
            // NOTE(Blackrush): cheap operation, no alloc at all actually
            return Unpooled.EMPTY_BUFFER;
        }
    }

    private ByteBuf writeHeader(ChannelHandlerContext ctx, int protocolId, int len) {
        // NOTE(Blackrush): cheap operation, a header cannot exceed a specific number of bytes
        ByteBuf buf = ctx.alloc().buffer(MAX_HEADER_LEN, MAX_HEADER_LEN);
        DofusProtocol.writeHeader(NettyDataWriter.of(buf), protocolId, len);
        return buf;
    }
}
