package org.heat.dofus.network.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import org.heat.dofus.network.DofusProtocol;
import org.heat.dofus.network.NetworkComponentFactory;
import org.heat.dofus.network.NetworkMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public final class DofusDecoder extends ByteToMessageDecoder {
    public static final Logger log = LoggerFactory.getLogger(DofusDecoder.class);

    private final NetworkComponentFactory<NetworkMessage> factory;

    public DofusDecoder(NetworkComponentFactory<NetworkMessage> factory) {
        this.factory = Objects.requireNonNull(factory, "factory");
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        while (in.isReadable()) {
            if (!in.isReadable(2)) {
                break;
            }

            // NOTE(Blackrush):
            //  mark message origin
            //  location where we'll reset if there is not enough data to actually deserialize
            in.markReaderIndex();

            int staticHeader = in.readUnsignedShort();

            int protocolId = DofusProtocol.getProtocolId(staticHeader);
            byte typeLen = DofusProtocol.getTypeLen(staticHeader);

            if (!in.isReadable(typeLen)) {
                // NOTE(Blackrush):
                //  some bytes has been read
                //  we might need them later
                //  so get back where we were
                in.resetReaderIndex();
                break;
            }

            int len = DofusProtocol.readMessageLen(NettyDataReader.of(in), typeLen);

            if (!in.isReadable(len)) {
                // see NOTE(Blackrush)
                in.resetReaderIndex();
                break;
            }

            Optional<NetworkMessage> opt = factory.create(protocolId);

            if (!opt.isPresent()) {
                log.warn("receive a message with id={}, but factory couldn't create it", protocolId);

                // NOTE(Blackrush): skip non-deserializable bytes
                in.skipBytes(len);
                continue;
            }

            NetworkMessage msg = opt.get();
            msg.deserialize(NettyDataReader.of(in));

            out.add(msg);
        }
    }
}
