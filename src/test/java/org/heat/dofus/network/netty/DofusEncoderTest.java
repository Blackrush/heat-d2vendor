package org.heat.dofus.network.netty;

import com.ankamagames.dofus.network.NetworkMetadata;
import com.ankamagames.dofus.network.messages.game.approach.HelloGameMessage;
import com.ankamagames.dofus.network.messages.handshake.ProtocolRequired;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DofusEncoderTest {
    private DofusEncoder encoder;

    @Before
    public void setUp() throws Exception {
        encoder = new DofusEncoder();

    }

    @Test
    public void testEncode() throws Exception {
        // given
        ChannelHandlerContext ctx = mock(ChannelHandlerContext.class);
        ChannelPromise promise = mock(ChannelPromise.class);
        ProtocolRequired msg = new ProtocolRequired(NetworkMetadata.REQUIRED_BUILD, NetworkMetadata.CURRENT_BUILD);
        AtomicReference<ByteBuf> out = new AtomicReference<>();

        // when
        when(ctx.alloc()).thenReturn(new UnpooledByteBufAllocator(false));

        when(ctx.write(any(), eq(promise))).thenAnswer(invocation -> {
            out.set((ByteBuf) invocation.getArguments()[0]);
            return mock(ChannelFuture.class);
        });

        encoder.write(ctx, msg, promise);

        // then
        ByteBuf buf = out.get();
        assertEquals("buf readable bytes", 11, buf.readableBytes());
        assertEquals("static header", 1 << 2 | 1, buf.readShort());
        assertEquals("length header", 8, buf.readByte());
        assertEquals("required build", NetworkMetadata.REQUIRED_BUILD, buf.readInt());
        assertEquals("current build", NetworkMetadata.CURRENT_BUILD, buf.readInt());
        assertEquals("buf readable bytes", 0, buf.readableBytes());
    }

    @Test
    public void testEncodeAlwaysEmptyMessage() throws Exception {
        // given
        ChannelHandlerContext ctx = mock(ChannelHandlerContext.class);
        ChannelPromise promise = mock(ChannelPromise.class);
        HelloGameMessage msg = HelloGameMessage.i;
        AtomicReference<ByteBuf> out = new AtomicReference<>();

        // when
        when(ctx.alloc()).thenReturn(new UnpooledByteBufAllocator(false));

        when(ctx.write(any(), eq(promise))).thenAnswer(invocation -> {
            out.set((ByteBuf) invocation.getArguments()[0]);
            return mock(ChannelFuture.class);
        });

        encoder.write(ctx, msg, promise);

        // then
        ByteBuf buf = out.get();
        assertEquals("buf readable bytes", 2, buf.readableBytes());
        assertEquals("static header", 101 << 2, buf.readShort());
        assertEquals("buf readable bytes", 0, buf.readableBytes());
    }
}