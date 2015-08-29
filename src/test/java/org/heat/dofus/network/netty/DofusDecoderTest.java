package org.heat.dofus.network.netty;

import com.ankamagames.dofus.network.MessageReceiver;
import com.ankamagames.dofus.network.messages.game.basic.BasicNoOperationMessage;
import com.ankamagames.dofus.network.messages.handshake.ProtocolRequired;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.heat.shared.tests.CollectionMatchers.allIs;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DofusDecoderTest {

    private DofusDecoder decoder;

    @Before
    public void setUp() throws Exception {
        decoder = new DofusDecoder(MessageReceiver.createNewReceiver());
    }

    @Test
    public void testDecode() throws Exception {
        // given
        ChannelHandlerContext ctx = mock(ChannelHandlerContext.class);
        List<Object> out = new LinkedList<>();

        ByteBuf in = Unpooled.buffer(11, 11);
        in.writeShort(1 << 2 | 1);
        in.writeByte(8);
        in.writeInt(42);
        in.writeInt(0xbeef);

        // when
        decoder.decode(ctx, in, out);

        // then
        assertEquals("number of decoded messages", 1, out.size());

        ProtocolRequired msg = (ProtocolRequired) out.get(0);
        assertEquals("decoded required version", 42, msg.requiredVersion);
        assertEquals("decoded current version", 0xbeef, msg.currentVersion);
    }

    @Test
    public void testDecodeMultiple() throws Exception {
        // given
        ChannelHandlerContext ctx = mock(ChannelHandlerContext.class);
        List<Object> out = new LinkedList<>();

        ByteBuf in = Unpooled.buffer(4, 4);
        in.writeShort(BasicNoOperationMessage.PROTOCOL_ID << 2);
        in.writeShort(BasicNoOperationMessage.PROTOCOL_ID << 2);

        // when
        decoder.decode(ctx, in, out);

        // then
        assertEquals("number of decoded messages", 2, out.size());
        assertThat("messages", out, allIs(instanceOf(BasicNoOperationMessage.class)));
    }

    @Test
    public void testDecodeStream() throws Exception {
        // given
        ChannelHandlerContext ctx = mock(ChannelHandlerContext.class);

        AtomicReference<Object> out = new AtomicReference<>();

        List<ByteBuf> stream = Arrays.asList(
                Unpooled.copiedBuffer(new byte[]{0}), // static header (2 bytes)
                Unpooled.copiedBuffer(new byte[]{5}),
                Unpooled.copiedBuffer(new byte[]{8}), // length header (1 byte)
                Unpooled.copiedBuffer(new byte[]{0, 0, 0}), // body (8 bytes)
                Unpooled.copiedBuffer(new byte[]{42}),
                Unpooled.copiedBuffer(new byte[]{0}),
                Unpooled.copiedBuffer(new byte[]{0}),
                Unpooled.copiedBuffer(new byte[]{(byte) 0xbe}),
                Unpooled.copiedBuffer(new byte[]{(byte) 0xef})
        );

        // when
        when(ctx.alloc()).thenReturn(new UnpooledByteBufAllocator(false));

        when(ctx.fireChannelRead(any())).thenAnswer(invocation -> {
            out.set(invocation.getArguments()[0]);
            return ctx;
        });

        for (ByteBuf buf : stream) {
            decoder.channelRead(ctx, buf);
        }

        // then
        ProtocolRequired msg = (ProtocolRequired) out.get();
        assertEquals("decoded required version", 42, msg.requiredVersion);
        assertEquals("decoded current version", 0xbeef, msg.currentVersion);
    }
}