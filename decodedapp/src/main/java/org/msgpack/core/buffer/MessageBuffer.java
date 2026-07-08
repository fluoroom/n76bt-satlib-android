package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import org.msgpack.core.Preconditions;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public class MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int ARRAY_BYTE_BASE_OFFSET;
    private static final String BIGENDIAN_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferBE";
    private static final String DEFAULT_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBuffer";
    private static final String UNIVERSAL_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferU";
    static final boolean isUniversalBuffer;
    static final int javaVersion;
    private static final Constructor<?> mbArrConstructor;
    private static final Constructor<?> mbBBConstructor;
    static final Unsafe unsafe;
    protected final long address;
    protected final Object base;
    protected final ByteBuffer reference;
    protected final int size;

    /* JADX WARN: Removed duplicated region for block: B:103:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018a  */
    static {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.buffer.MessageBuffer.<clinit>():void");
    }

    MessageBuffer(byte[] bArr, int i10, int i11) {
        this.base = bArr;
        this.address = ARRAY_BYTE_BASE_OFFSET + i10;
        this.size = i11;
        this.reference = null;
    }

    public static MessageBuffer allocate(int i10) {
        if (i10 >= 0) {
            return wrap(new byte[i10]);
        }
        throw new IllegalArgumentException("size must not be negative");
    }

    private static int getJavaVersion() {
        String property = System.getProperty("java.specification.version", "");
        int iIndexOf = property.indexOf(46);
        if (iIndexOf == -1) {
            try {
                return Integer.parseInt(property);
            } catch (NumberFormatException e10) {
                e10.printStackTrace(System.err);
                return 6;
            }
        }
        try {
            int i10 = Integer.parseInt(property.substring(0, iIndexOf));
            return i10 > 1 ? i10 : Integer.parseInt(property.substring(iIndexOf + 1));
        } catch (NumberFormatException e11) {
            e11.printStackTrace(System.err);
            return 6;
        }
    }

    private static MessageBuffer newInstance(Constructor<?> constructor, Object... objArr) {
        try {
            return (MessageBuffer) constructor.newInstance(objArr);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        } catch (InvocationTargetException e12) {
            if (e12.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e12.getCause());
            }
            if (e12.getCause() instanceof Error) {
                throw ((Error) e12.getCause());
            }
            throw new IllegalStateException(e12.getCause());
        }
    }

    private static MessageBuffer newMessageBuffer(byte[] bArr, int i10, int i11) {
        Preconditions.checkNotNull(bArr);
        Constructor<?> constructor = mbArrConstructor;
        return constructor != null ? newInstance(constructor, bArr, Integer.valueOf(i10), Integer.valueOf(i11)) : new MessageBuffer(bArr, i10, i11);
    }

    public static void releaseBuffer(MessageBuffer messageBuffer) {
        if (isUniversalBuffer || messageBuffer.hasArray()) {
            return;
        }
        if (DirectBufferAccess.isDirectByteBufferInstance(messageBuffer.reference)) {
            DirectBufferAccess.clean(messageBuffer.reference);
        } else {
            unsafe.freeMemory(messageBuffer.address);
        }
    }

    public static MessageBuffer wrap(byte[] bArr) {
        return newMessageBuffer(bArr, 0, bArr.length);
    }

    public byte[] array() {
        return (byte[]) this.base;
    }

    public int arrayOffset() {
        return ((int) this.address) - ARRAY_BYTE_BASE_OFFSET;
    }

    public void copyTo(int i10, MessageBuffer messageBuffer, int i11, int i12) {
        unsafe.copyMemory(this.base, this.address + ((long) i10), messageBuffer.base, ((long) i11) + messageBuffer.address, i12);
    }

    public boolean getBoolean(int i10) {
        return unsafe.getBoolean(this.base, this.address + ((long) i10));
    }

    public byte getByte(int i10) {
        return unsafe.getByte(this.base, this.address + ((long) i10));
    }

    public void getBytes(int i10, byte[] bArr, int i11, int i12) {
        unsafe.copyMemory(this.base, this.address + ((long) i10), bArr, ARRAY_BYTE_BASE_OFFSET + i11, i12);
    }

    public double getDouble(int i10) {
        return Double.longBitsToDouble(getLong(i10));
    }

    public float getFloat(int i10) {
        return Float.intBitsToFloat(getInt(i10));
    }

    public int getInt(int i10) {
        return Integer.reverseBytes(unsafe.getInt(this.base, this.address + ((long) i10)));
    }

    public long getLong(int i10) {
        return Long.reverseBytes(unsafe.getLong(this.base, this.address + ((long) i10)));
    }

    public short getShort(int i10) {
        return Short.reverseBytes(unsafe.getShort(this.base, this.address + ((long) i10)));
    }

    public boolean hasArray() {
        return this.base != null;
    }

    public void putBoolean(int i10, boolean z10) {
        unsafe.putBoolean(this.base, this.address + ((long) i10), z10);
    }

    public void putByte(int i10, byte b10) {
        unsafe.putByte(this.base, this.address + ((long) i10), b10);
    }

    public void putByteBuffer(int i10, ByteBuffer byteBuffer, int i11) {
        if (byteBuffer.isDirect()) {
            unsafe.copyMemory((Object) null, DirectBufferAccess.getAddress(byteBuffer) + ((long) byteBuffer.position()), this.base, this.address + ((long) i10), i11);
            byteBuffer.position(byteBuffer.position() + i11);
            return;
        }
        if (byteBuffer.hasArray()) {
            unsafe.copyMemory(byteBuffer.array(), ARRAY_BYTE_BASE_OFFSET + byteBuffer.position(), this.base, this.address + ((long) i10), i11);
            byteBuffer.position(byteBuffer.position() + i11);
        } else {
            if (hasArray()) {
                byteBuffer.get((byte[]) this.base, i10, i11);
                return;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                unsafe.putByte(this.base, this.address + ((long) i10), byteBuffer.get());
            }
        }
    }

    public void putBytes(int i10, byte[] bArr, int i11, int i12) {
        unsafe.copyMemory(bArr, ARRAY_BYTE_BASE_OFFSET + i11, this.base, this.address + ((long) i10), i12);
    }

    public void putDouble(int i10, double d10) {
        putLong(i10, Double.doubleToRawLongBits(d10));
    }

    public void putFloat(int i10, float f10) {
        putInt(i10, Float.floatToRawIntBits(f10));
    }

    public void putInt(int i10, int i11) {
        unsafe.putInt(this.base, this.address + ((long) i10), Integer.reverseBytes(i11));
    }

    public void putLong(int i10, long j10) {
        unsafe.putLong(this.base, ((long) i10) + this.address, Long.reverseBytes(j10));
    }

    public void putMessageBuffer(int i10, MessageBuffer messageBuffer, int i11, int i12) {
        unsafe.copyMemory(messageBuffer.base, messageBuffer.address + ((long) i11), this.base, ((long) i10) + this.address, i12);
    }

    public void putShort(int i10, short s10) {
        unsafe.putShort(this.base, this.address + ((long) i10), Short.reverseBytes(s10));
    }

    public int size() {
        return this.size;
    }

    public MessageBuffer slice(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        Preconditions.checkArgument(i10 + i11 <= size());
        return new MessageBuffer(this.base, this.address + ((long) i10), i11);
    }

    public ByteBuffer sliceAsByteBuffer(int i10, int i11) {
        return hasArray() ? ByteBuffer.wrap((byte[]) this.base, (int) ((this.address - ((long) ARRAY_BYTE_BASE_OFFSET)) + ((long) i10)), i11) : DirectBufferAccess.newByteBuffer(this.address, i10, i11, this.reference);
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        unsafe.copyMemory(this.base, this.address, bArr, ARRAY_BYTE_BASE_OFFSET, size());
        return bArr;
    }

    public String toHexString(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = i10; i12 < i11; i12++) {
            if (i12 != i10) {
                sb2.append(" ");
            }
            sb2.append(String.format("%02x", Byte.valueOf(getByte(i12))));
        }
        return sb2.toString();
    }

    public static MessageBuffer wrap(byte[] bArr, int i10, int i11) {
        return newMessageBuffer(bArr, i10, i11);
    }

    public void getBytes(int i10, int i11, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < i11) {
            throw new BufferOverflowException();
        }
        byteBuffer.put(sliceAsByteBuffer(i10, i11));
    }

    public static MessageBuffer wrap(ByteBuffer byteBuffer) {
        return newMessageBuffer(byteBuffer);
    }

    public ByteBuffer sliceAsByteBuffer() {
        return sliceAsByteBuffer(0, size());
    }

    private static MessageBuffer newMessageBuffer(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        Constructor<?> constructor = mbBBConstructor;
        return constructor != null ? newInstance(constructor, byteBuffer) : new MessageBuffer(byteBuffer);
    }

    MessageBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (isUniversalBuffer) {
                this.base = null;
                this.address = 0L;
                this.size = byteBuffer.remaining();
                this.reference = null;
                return;
            }
            this.base = null;
            this.address = DirectBufferAccess.getAddress(byteBuffer) + ((long) byteBuffer.position());
            this.size = byteBuffer.remaining();
            this.reference = byteBuffer;
            return;
        }
        if (byteBuffer.hasArray()) {
            this.base = byteBuffer.array();
            this.address = ARRAY_BYTE_BASE_OFFSET + byteBuffer.arrayOffset() + byteBuffer.position();
            this.size = byteBuffer.remaining();
            this.reference = null;
            return;
        }
        throw new IllegalArgumentException("Only the array-backed ByteBuffer or DirectBuffer is supported");
    }

    protected MessageBuffer(Object obj, long j10, int i10) {
        this.base = obj;
        this.address = j10;
        this.size = i10;
        this.reference = null;
    }
}
