package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import org.msgpack.core.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public class MessageBufferU extends MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final ByteBuffer wrap;

    MessageBufferU(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
        this.wrap = ByteBuffer.wrap(bArr, i10, i11).slice();
    }

    private void resetBufferPosition() {
        this.wrap.position(0);
        this.wrap.limit(this.size);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public byte[] array() {
        if (hasArray()) {
            return this.wrap.array();
        }
        return null;
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void copyTo(int i10, MessageBuffer messageBuffer, int i11, int i12) {
        try {
            this.wrap.position(i10);
            messageBuffer.putByteBuffer(i11, this.wrap, i12);
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public boolean getBoolean(int i10) {
        return this.wrap.get(i10) != 0;
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public byte getByte(int i10) {
        return this.wrap.get(i10);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void getBytes(int i10, int i11, ByteBuffer byteBuffer) {
        try {
            this.wrap.position(i10);
            this.wrap.limit(i10 + i11);
            byteBuffer.put(this.wrap);
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public double getDouble(int i10) {
        return this.wrap.getDouble(i10);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public float getFloat(int i10) {
        return this.wrap.getFloat(i10);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public int getInt(int i10) {
        return this.wrap.getInt(i10);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public long getLong(int i10) {
        return this.wrap.getLong(i10);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public short getShort(int i10) {
        return this.wrap.getShort(i10);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public boolean hasArray() {
        return !this.wrap.isDirect();
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putBoolean(int i10, boolean z10) {
        this.wrap.put(i10, z10 ? (byte) 1 : (byte) 0);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putByte(int i10, byte b10) {
        this.wrap.put(i10, b10);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putByteBuffer(int i10, ByteBuffer byteBuffer, int i11) {
        if (byteBuffer.hasArray()) {
            putBytes(i10, byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), i11);
            byteBuffer.position(byteBuffer.position() + i11);
            return;
        }
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i11);
            this.wrap.position(i10);
            this.wrap.put(byteBuffer);
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putBytes(int i10, byte[] bArr, int i11, int i12) {
        try {
            this.wrap.position(i10);
            this.wrap.put(bArr, i11, i12);
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putDouble(int i10, double d10) {
        this.wrap.putDouble(i10, d10);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putFloat(int i10, float f10) {
        this.wrap.putFloat(i10, f10);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putInt(int i10, int i11) {
        this.wrap.putInt(i10, i11);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putLong(int i10, long j10) {
        this.wrap.putLong(i10, j10);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putMessageBuffer(int i10, MessageBuffer messageBuffer, int i11, int i12) {
        putByteBuffer(i10, messageBuffer.sliceAsByteBuffer(i11, i12), i12);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putShort(int i10, short s10) {
        this.wrap.putShort(i10, s10);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public ByteBuffer sliceAsByteBuffer(int i10, int i11) {
        try {
            this.wrap.position(i10);
            this.wrap.limit(i10 + i11);
            return this.wrap.slice();
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public byte[] toByteArray() {
        int size = size();
        byte[] bArr = new byte[size];
        getBytes(0, bArr, 0, size);
        return bArr;
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public MessageBufferU slice(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        int i12 = i10 + i11;
        Preconditions.checkArgument(i12 <= size());
        try {
            this.wrap.position(i10);
            this.wrap.limit(i12);
            return new MessageBufferU(this.base, ((long) i10) + this.address, i11, this.wrap.slice());
        } finally {
            resetBufferPosition();
        }
    }

    MessageBufferU(ByteBuffer byteBuffer) {
        super(byteBuffer);
        this.wrap = byteBuffer.slice();
    }

    private MessageBufferU(Object obj, long j10, int i10, ByteBuffer byteBuffer) {
        super(obj, j10, i10);
        this.wrap = byteBuffer;
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void getBytes(int i10, byte[] bArr, int i11, int i12) {
        try {
            this.wrap.position(i10);
            this.wrap.get(bArr, i11, i12);
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public ByteBuffer sliceAsByteBuffer() {
        return sliceAsByteBuffer(0, this.size);
    }
}
