package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import org.msgpack.core.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public class MessageBufferBE extends MessageBuffer {
    MessageBufferBE(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public double getDouble(int i10) {
        return MessageBuffer.unsafe.getDouble(this.base, this.address + ((long) i10));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public float getFloat(int i10) {
        return MessageBuffer.unsafe.getFloat(this.base, this.address + ((long) i10));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public int getInt(int i10) {
        return MessageBuffer.unsafe.getInt(this.base, this.address + ((long) i10));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public long getLong(int i10) {
        return MessageBuffer.unsafe.getLong(this.base, this.address + ((long) i10));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public short getShort(int i10) {
        return MessageBuffer.unsafe.getShort(this.base, this.address + ((long) i10));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putDouble(int i10, double d10) {
        MessageBuffer.unsafe.putDouble(this.base, this.address + ((long) i10), d10);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putInt(int i10, int i11) {
        MessageBuffer.unsafe.putInt(this.base, this.address + ((long) i10), i11);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putLong(int i10, long j10) {
        MessageBuffer.unsafe.putLong(this.base, this.address + ((long) i10), j10);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putShort(int i10, short s10) {
        MessageBuffer.unsafe.putShort(this.base, this.address + ((long) i10), s10);
    }

    MessageBufferBE(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public MessageBufferBE slice(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        Preconditions.checkArgument(i10 + i11 <= size());
        return new MessageBufferBE(this.base, this.address + ((long) i10), i11);
    }

    private MessageBufferBE(Object obj, long j10, int i10) {
        super(obj, j10, i10);
    }
}
