package org.heat.dofus.network.netty;

import io.netty.buffer.ByteBuf;
import org.heat.shared.io.LegacyWriter;

import java.math.BigInteger;

public final class NettyDataWriter extends LegacyWriter {
    class Buf {
        final Buf parent;
        final ByteBuf buf;
        final int start;
        final int length;

        Buf(Buf parent, ByteBuf buf, int start, int length) {
            this.parent = parent;
            this.buf = buf;
            this.start = start;
            this.length = length;
        }
    }

    private Buf buf;

    private NettyDataWriter(ByteBuf buf) {
        this.buf = new Buf(null, buf, buf.readerIndex(), 0);
    }

    public static NettyDataWriter of(ByteBuf buf) {
        return new NettyDataWriter(buf);
    }

    public ByteBuf getUnderlyingBuf() {
        return buf.buf;
    }

    public void unwrap() {
        int index = 0;
        Buf root = null;
        for (Buf cur = buf; cur.parent != null; cur = cur.parent) {
            root = cur.parent;
            index += cur.start;
        }

        if (root == null) return;

        root.buf.writerIndex(index + buf.length);
        root.buf.readerIndex(index);

        buf = root;
    }

    @Override
    public void writeBytes(byte[] bytes) {
        buf.buf.writeBytes(bytes);
    }

    @Override
    public void writeInt8(byte int8) {
        buf.buf.writeByte(int8);
    }

    @Override
    public void writeUInt8(short uint8) {
        buf.buf.writeByte(uint8);
    }

    @Override
    public void writeInt16(short int16) {
        buf.buf.writeShort(int16);
    }

    @Override
    public void writeUInt16(int uint16) {
        buf.buf.writeShort(uint16);
    }

    @Override
    public void writeInt32(int int32) {
        buf.buf.writeInt(int32);
    }

    @Override
    public void writeUInt32(long uint32) {
        buf.buf.writeShort((int) (uint32 >> 16));
        buf.buf.writeShort((int) uint32);
    }

    @Override
    public void writeInt64(long int64) {
        buf.buf.writeLong(int64);
    }

    @Override
    public void writeUInt64(BigInteger uint64) {
        buf.buf.writeInt(uint64.shiftRight(32).intValue());
        buf.buf.writeInt(uint64.intValue());
    }

    @Override
    public int getRemaining() {
        return buf.buf.writableBytes();
    }

    @Override
    public int getPosition() {
        return buf.buf.writerIndex();
    }

    @Override
    public void setPosition(int position) {
        if (position > buf.buf.writerIndex()) {
            buf.buf.ensureWritable(position - buf.buf.writerIndex());
        }
        buf.buf.writerIndex(position);
    }

    @Override
    public void slice(int offset, int length) {
        buf = new Buf(buf, buf.buf.slice(offset, length).resetWriterIndex(), offset, length);
    }

    @Override
    public NettyDataReader reader() {
        return new NettyDataReader(buf.buf.duplicate());
    }
}
