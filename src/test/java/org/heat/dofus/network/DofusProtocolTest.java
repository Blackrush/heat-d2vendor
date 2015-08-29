package org.heat.dofus.network;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.heat.dofus.network.netty.NettyDataReader;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DofusProtocolTest {

    @Test
    public void headerComputation() {
        assertThat(DofusProtocol.subComputeStaticHeader(1, (byte) 1), equalTo(5));

        assertThat(DofusProtocol.getProtocolId(5), equalTo(1));
        assertThat(DofusProtocol.getTypeLen(5), equalTo((byte) 1));
    }

    @Test
    public void typeLenComputation() {
        assertThat(DofusProtocol.computeTypeLen(0), equalTo((byte) 0));
        assertThat(DofusProtocol.computeTypeLen(100), equalTo((byte) 1));
        assertThat(DofusProtocol.computeTypeLen(1000), equalTo((byte) 2));
        assertThat(DofusProtocol.computeTypeLen(100000), equalTo((byte) 3));

        ByteBuf buf = Unpooled.buffer();

        buf.writeByte(100); // 1 byte
        buf.writeShort(1000); // 2 bytes
        buf.writeMedium(100000); // 3 bytes

        assertThat(DofusProtocol.readMessageLen(NettyDataReader.of(buf), (byte) 0), equalTo(0));
        assertThat(DofusProtocol.readMessageLen(NettyDataReader.of(buf), (byte) 1), equalTo(100));
        assertThat(DofusProtocol.readMessageLen(NettyDataReader.of(buf), (byte) 2), equalTo(1000));
        assertThat(DofusProtocol.readMessageLen(NettyDataReader.of(buf), (byte) 3), equalTo(100000));
    }

}
