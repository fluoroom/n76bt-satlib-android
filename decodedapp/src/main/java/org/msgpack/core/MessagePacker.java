package org.msgpack.core;

import j$.time.Instant;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.MessagePack;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;
import org.msgpack.value.Value;

/* JADX INFO: loaded from: classes3.dex */
public class MessagePacker implements Closeable, Flushable {
    private static final boolean CORRUPTED_CHARSET_ENCODER;
    private static final long NANOS_PER_SECOND = 1000000000;
    private static final int UTF_8_MAX_CHAR_SIZE = 6;
    private MessageBuffer buffer;
    private final int bufferFlushThreshold;
    private CharsetEncoder encoder;
    protected MessageBufferOutput out;
    private final int smallStringOptimizationThreshold;
    private final boolean str8FormatSupport;
    private int position = 0;
    private long totalFlushBytes = 0;

    static {
        boolean z10 = false;
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            int i10 = cls.getField("SDK_INT").getInt(cls.getConstructor(null).newInstance(null));
            if (i10 >= 14 && i10 < 21) {
                z10 = true;
            }
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (InstantiationException e11) {
            e11.printStackTrace();
        } catch (NoSuchFieldException e12) {
            e12.printStackTrace();
        } catch (NoSuchMethodException e13) {
            e13.printStackTrace();
        } catch (InvocationTargetException e14) {
            e14.printStackTrace();
        }
        CORRUPTED_CHARSET_ENCODER = z10;
    }

    protected MessagePacker(MessageBufferOutput messageBufferOutput, MessagePack.PackerConfig packerConfig) {
        this.out = (MessageBufferOutput) Preconditions.checkNotNull(messageBufferOutput, "MessageBufferOutput is null");
        this.smallStringOptimizationThreshold = packerConfig.getSmallStringOptimizationThreshold();
        this.bufferFlushThreshold = packerConfig.getBufferFlushThreshold();
        this.str8FormatSupport = packerConfig.isStr8FormatSupport();
    }

    private int encodeStringToBufferAt(int i10, String str) {
        prepareEncoder();
        MessageBuffer messageBuffer = this.buffer;
        ByteBuffer byteBufferSliceAsByteBuffer = messageBuffer.sliceAsByteBuffer(i10, messageBuffer.size() - i10);
        int iPosition = byteBufferSliceAsByteBuffer.position();
        CoderResult coderResultEncode = this.encoder.encode(CharBuffer.wrap(str), byteBufferSliceAsByteBuffer, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e10) {
                throw new MessageStringCodingException(e10);
            }
        }
        if (coderResultEncode.isUnderflow() && !coderResultEncode.isOverflow() && this.encoder.flush(byteBufferSliceAsByteBuffer).isUnderflow()) {
            return byteBufferSliceAsByteBuffer.position() - iPosition;
        }
        return -1;
    }

    private void ensureCapacity(int i10) throws IOException {
        MessageBuffer messageBuffer = this.buffer;
        if (messageBuffer == null) {
            this.buffer = this.out.next(i10);
        } else if (this.position + i10 >= messageBuffer.size()) {
            flushBuffer();
            this.buffer = this.out.next(i10);
        }
    }

    private void flushBuffer() throws IOException {
        this.out.writeBuffer(this.position);
        this.buffer = null;
        this.totalFlushBytes += (long) this.position;
        this.position = 0;
    }

    private void packStringWithGetBytes(String str) throws IOException {
        byte[] bytes = str.getBytes(MessagePack.UTF8);
        packRawStringHeader(bytes.length);
        addPayload(bytes);
    }

    private void prepareEncoder() {
        if (this.encoder == null) {
            CharsetEncoder charsetEncoderNewEncoder = MessagePack.UTF8.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.encoder = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        }
        this.encoder.reset();
    }

    private void writeByte(byte b10) throws IOException {
        ensureCapacity(1);
        MessageBuffer messageBuffer = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        messageBuffer.putByte(i10, b10);
    }

    private void writeByteAndByte(byte b10, byte b11) throws IOException {
        ensureCapacity(2);
        MessageBuffer messageBuffer = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        messageBuffer.putByte(i10, b10);
        MessageBuffer messageBuffer2 = this.buffer;
        int i11 = this.position;
        this.position = i11 + 1;
        messageBuffer2.putByte(i11, b11);
    }

    private void writeByteAndDouble(byte b10, double d10) throws IOException {
        ensureCapacity(9);
        MessageBuffer messageBuffer = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        messageBuffer.putByte(i10, b10);
        this.buffer.putDouble(this.position, d10);
        this.position += 8;
    }

    private void writeByteAndFloat(byte b10, float f10) throws IOException {
        ensureCapacity(5);
        MessageBuffer messageBuffer = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        messageBuffer.putByte(i10, b10);
        this.buffer.putFloat(this.position, f10);
        this.position += 4;
    }

    private void writeByteAndInt(byte b10, int i10) throws IOException {
        ensureCapacity(5);
        MessageBuffer messageBuffer = this.buffer;
        int i11 = this.position;
        this.position = i11 + 1;
        messageBuffer.putByte(i11, b10);
        this.buffer.putInt(this.position, i10);
        this.position += 4;
    }

    private void writeByteAndLong(byte b10, long j10) throws IOException {
        ensureCapacity(9);
        MessageBuffer messageBuffer = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        messageBuffer.putByte(i10, b10);
        this.buffer.putLong(this.position, j10);
        this.position += 8;
    }

    private void writeByteAndShort(byte b10, short s10) throws IOException {
        ensureCapacity(3);
        MessageBuffer messageBuffer = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        messageBuffer.putByte(i10, b10);
        this.buffer.putShort(this.position, s10);
        this.position += 2;
    }

    private void writeInt(int i10) throws IOException {
        ensureCapacity(4);
        this.buffer.putInt(this.position, i10);
        this.position += 4;
    }

    private void writeLong(long j10) throws IOException {
        ensureCapacity(8);
        this.buffer.putLong(this.position, j10);
        this.position += 8;
    }

    private void writeShort(short s10) throws IOException {
        ensureCapacity(2);
        this.buffer.putShort(this.position, s10);
        this.position += 2;
    }

    private void writeTimestamp32(int i10) throws IOException {
        ensureCapacity(6);
        MessageBuffer messageBuffer = this.buffer;
        int i11 = this.position;
        this.position = i11 + 1;
        messageBuffer.putByte(i11, MessagePack.Code.FIXEXT4);
        MessageBuffer messageBuffer2 = this.buffer;
        int i12 = this.position;
        this.position = i12 + 1;
        messageBuffer2.putByte(i12, (byte) -1);
        this.buffer.putInt(this.position, i10);
        this.position += 4;
    }

    private void writeTimestamp64(long j10) throws IOException {
        ensureCapacity(10);
        MessageBuffer messageBuffer = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        messageBuffer.putByte(i10, MessagePack.Code.FIXEXT8);
        MessageBuffer messageBuffer2 = this.buffer;
        int i11 = this.position;
        this.position = i11 + 1;
        messageBuffer2.putByte(i11, (byte) -1);
        this.buffer.putLong(this.position, j10);
        this.position += 8;
    }

    private void writeTimestamp96(long j10, int i10) throws IOException {
        ensureCapacity(15);
        MessageBuffer messageBuffer = this.buffer;
        int i11 = this.position;
        this.position = i11 + 1;
        messageBuffer.putByte(i11, MessagePack.Code.EXT8);
        MessageBuffer messageBuffer2 = this.buffer;
        int i12 = this.position;
        this.position = i12 + 1;
        messageBuffer2.putByte(i12, (byte) 12);
        MessageBuffer messageBuffer3 = this.buffer;
        int i13 = this.position;
        this.position = i13 + 1;
        messageBuffer3.putByte(i13, (byte) -1);
        this.buffer.putInt(this.position, i10);
        int i14 = this.position + 4;
        this.position = i14;
        this.buffer.putLong(i14, j10);
        this.position += 8;
    }

    public MessagePacker addPayload(byte[] bArr) throws IOException {
        return addPayload(bArr, 0, bArr.length);
    }

    public void clear() {
        this.position = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
        } finally {
            this.out.close();
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.position > 0) {
            flushBuffer();
        }
        this.out.flush();
    }

    public long getTotalWrittenBytes() {
        return this.totalFlushBytes + ((long) this.position);
    }

    public MessagePacker packArrayHeader(int i10) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("array size must be >= 0");
        }
        if (i10 < 16) {
            writeByte((byte) (i10 | (-112)));
            return this;
        }
        if (i10 < 65536) {
            writeByteAndShort(MessagePack.Code.ARRAY16, (short) i10);
            return this;
        }
        writeByteAndInt(MessagePack.Code.ARRAY32, i10);
        return this;
    }

    public MessagePacker packBigInteger(BigInteger bigInteger) throws IOException {
        if (bigInteger.bitLength() <= 63) {
            packLong(bigInteger.longValue());
            return this;
        }
        if (bigInteger.bitLength() != 64 || bigInteger.signum() != 1) {
            throw new IllegalArgumentException("MessagePack cannot serialize BigInteger larger than 2^64-1");
        }
        writeByteAndLong(MessagePack.Code.UINT64, bigInteger.longValue());
        return this;
    }

    public MessagePacker packBinaryHeader(int i10) throws IOException {
        if (i10 < 256) {
            writeByteAndByte(MessagePack.Code.BIN8, (byte) i10);
            return this;
        }
        if (i10 < 65536) {
            writeByteAndShort(MessagePack.Code.BIN16, (short) i10);
            return this;
        }
        writeByteAndInt(MessagePack.Code.BIN32, i10);
        return this;
    }

    public MessagePacker packBoolean(boolean z10) throws IOException {
        writeByte(z10 ? MessagePack.Code.TRUE : MessagePack.Code.FALSE);
        return this;
    }

    public MessagePacker packByte(byte b10) throws IOException {
        if (b10 < -32) {
            writeByteAndByte(MessagePack.Code.INT8, b10);
            return this;
        }
        writeByte(b10);
        return this;
    }

    public MessagePacker packDouble(double d10) throws IOException {
        writeByteAndDouble(MessagePack.Code.FLOAT64, d10);
        return this;
    }

    public MessagePacker packExtensionTypeHeader(byte b10, int i10) throws IOException {
        if (i10 >= 256) {
            if (i10 < 65536) {
                writeByteAndShort(MessagePack.Code.EXT16, (short) i10);
                writeByte(b10);
                return this;
            }
            writeByteAndInt(MessagePack.Code.EXT32, i10);
            writeByte(b10);
            return this;
        }
        if (i10 <= 0 || ((i10 - 1) & i10) != 0) {
            writeByteAndByte(MessagePack.Code.EXT8, (byte) i10);
            writeByte(b10);
            return this;
        }
        if (i10 == 1) {
            writeByteAndByte(MessagePack.Code.FIXEXT1, b10);
            return this;
        }
        if (i10 == 2) {
            writeByteAndByte(MessagePack.Code.FIXEXT2, b10);
            return this;
        }
        if (i10 == 4) {
            writeByteAndByte(MessagePack.Code.FIXEXT4, b10);
            return this;
        }
        if (i10 == 8) {
            writeByteAndByte(MessagePack.Code.FIXEXT8, b10);
            return this;
        }
        if (i10 == 16) {
            writeByteAndByte(MessagePack.Code.FIXEXT16, b10);
            return this;
        }
        writeByteAndByte(MessagePack.Code.EXT8, (byte) i10);
        writeByte(b10);
        return this;
    }

    public MessagePacker packFloat(float f10) throws IOException {
        writeByteAndFloat(MessagePack.Code.FLOAT32, f10);
        return this;
    }

    public MessagePacker packInt(int i10) throws IOException {
        if (i10 < -32) {
            if (i10 < -32768) {
                writeByteAndInt(MessagePack.Code.INT32, i10);
                return this;
            }
            if (i10 < -128) {
                writeByteAndShort(MessagePack.Code.INT16, (short) i10);
                return this;
            }
            writeByteAndByte(MessagePack.Code.INT8, (byte) i10);
            return this;
        }
        if (i10 < 128) {
            writeByte((byte) i10);
            return this;
        }
        if (i10 < 256) {
            writeByteAndByte(MessagePack.Code.UINT8, (byte) i10);
            return this;
        }
        if (i10 < 65536) {
            writeByteAndShort(MessagePack.Code.UINT16, (short) i10);
            return this;
        }
        writeByteAndInt(MessagePack.Code.UINT32, i10);
        return this;
    }

    public MessagePacker packLong(long j10) throws IOException {
        if (j10 < -32) {
            if (j10 < -32768) {
                if (j10 < -2147483648L) {
                    writeByteAndLong(MessagePack.Code.INT64, j10);
                    return this;
                }
                writeByteAndInt(MessagePack.Code.INT32, (int) j10);
                return this;
            }
            if (j10 < -128) {
                writeByteAndShort(MessagePack.Code.INT16, (short) j10);
                return this;
            }
            writeByteAndByte(MessagePack.Code.INT8, (byte) j10);
            return this;
        }
        if (j10 < 128) {
            writeByte((byte) j10);
            return this;
        }
        if (j10 < 65536) {
            if (j10 < 256) {
                writeByteAndByte(MessagePack.Code.UINT8, (byte) j10);
                return this;
            }
            writeByteAndShort(MessagePack.Code.UINT16, (short) j10);
            return this;
        }
        if (j10 < 4294967296L) {
            writeByteAndInt(MessagePack.Code.UINT32, (int) j10);
            return this;
        }
        writeByteAndLong(MessagePack.Code.UINT64, j10);
        return this;
    }

    public MessagePacker packMapHeader(int i10) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("map size must be >= 0");
        }
        if (i10 < 16) {
            writeByte((byte) (i10 | (-128)));
            return this;
        }
        if (i10 < 65536) {
            writeByteAndShort(MessagePack.Code.MAP16, (short) i10);
            return this;
        }
        writeByteAndInt(MessagePack.Code.MAP32, i10);
        return this;
    }

    public MessagePacker packNil() throws IOException {
        writeByte(MessagePack.Code.NIL);
        return this;
    }

    public MessagePacker packRawStringHeader(int i10) throws IOException {
        if (i10 < 32) {
            writeByte((byte) (i10 | (-96)));
            return this;
        }
        if (this.str8FormatSupport && i10 < 256) {
            writeByteAndByte(MessagePack.Code.STR8, (byte) i10);
            return this;
        }
        if (i10 < 65536) {
            writeByteAndShort(MessagePack.Code.STR16, (short) i10);
            return this;
        }
        writeByteAndInt(MessagePack.Code.STR32, i10);
        return this;
    }

    public MessagePacker packShort(short s10) throws IOException {
        if (s10 < -32) {
            if (s10 < -128) {
                writeByteAndShort(MessagePack.Code.INT16, s10);
                return this;
            }
            writeByteAndByte(MessagePack.Code.INT8, (byte) s10);
            return this;
        }
        if (s10 < 128) {
            writeByte((byte) s10);
            return this;
        }
        if (s10 < 256) {
            writeByteAndByte(MessagePack.Code.UINT8, (byte) s10);
            return this;
        }
        writeByteAndShort(MessagePack.Code.UINT16, s10);
        return this;
    }

    public MessagePacker packString(String str) throws IOException {
        if (str.length() <= 0) {
            packRawStringHeader(0);
            return this;
        }
        if (CORRUPTED_CHARSET_ENCODER || str.length() < this.smallStringOptimizationThreshold) {
            packStringWithGetBytes(str);
            return this;
        }
        if (str.length() < 256) {
            ensureCapacity((str.length() * 6) + 3);
            int iEncodeStringToBufferAt = encodeStringToBufferAt(this.position + 2, str);
            if (iEncodeStringToBufferAt >= 0) {
                if (this.str8FormatSupport && iEncodeStringToBufferAt < 256) {
                    MessageBuffer messageBuffer = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    messageBuffer.putByte(i10, MessagePack.Code.STR8);
                    MessageBuffer messageBuffer2 = this.buffer;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    messageBuffer2.putByte(i11, (byte) iEncodeStringToBufferAt);
                    this.position += iEncodeStringToBufferAt;
                    return this;
                }
                if (iEncodeStringToBufferAt >= 65536) {
                    throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                }
                MessageBuffer messageBuffer3 = this.buffer;
                int i12 = this.position;
                messageBuffer3.putMessageBuffer(i12 + 3, messageBuffer3, i12 + 2, iEncodeStringToBufferAt);
                MessageBuffer messageBuffer4 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                messageBuffer4.putByte(i13, MessagePack.Code.STR16);
                this.buffer.putShort(this.position, (short) iEncodeStringToBufferAt);
                this.position = this.position + 2 + iEncodeStringToBufferAt;
                return this;
            }
        } else if (str.length() < 65536) {
            ensureCapacity((str.length() * 6) + 5);
            int iEncodeStringToBufferAt2 = encodeStringToBufferAt(this.position + 3, str);
            if (iEncodeStringToBufferAt2 >= 0) {
                if (iEncodeStringToBufferAt2 < 65536) {
                    MessageBuffer messageBuffer5 = this.buffer;
                    int i14 = this.position;
                    this.position = i14 + 1;
                    messageBuffer5.putByte(i14, MessagePack.Code.STR16);
                    this.buffer.putShort(this.position, (short) iEncodeStringToBufferAt2);
                    this.position = this.position + 2 + iEncodeStringToBufferAt2;
                    return this;
                }
                MessageBuffer messageBuffer6 = this.buffer;
                int i15 = this.position;
                messageBuffer6.putMessageBuffer(i15 + 5, messageBuffer6, i15 + 3, iEncodeStringToBufferAt2);
                MessageBuffer messageBuffer7 = this.buffer;
                int i16 = this.position;
                this.position = i16 + 1;
                messageBuffer7.putByte(i16, MessagePack.Code.STR32);
                this.buffer.putInt(this.position, iEncodeStringToBufferAt2);
                this.position = this.position + 4 + iEncodeStringToBufferAt2;
                return this;
            }
        }
        packStringWithGetBytes(str);
        return this;
    }

    public MessagePacker packTimestamp(Instant instant) throws IOException {
        return packTimestamp(instant.getEpochSecond(), instant.getNano());
    }

    public MessagePacker packValue(Value value) throws IOException {
        value.writeTo(this);
        return this;
    }

    public MessageBufferOutput reset(MessageBufferOutput messageBufferOutput) throws IOException {
        MessageBufferOutput messageBufferOutput2 = (MessageBufferOutput) Preconditions.checkNotNull(messageBufferOutput, "MessageBufferOutput is null");
        flush();
        MessageBufferOutput messageBufferOutput3 = this.out;
        this.out = messageBufferOutput2;
        this.totalFlushBytes = 0L;
        return messageBufferOutput3;
    }

    public MessagePacker writePayload(byte[] bArr) throws IOException {
        return writePayload(bArr, 0, bArr.length);
    }

    public MessagePacker addPayload(byte[] bArr, int i10, int i11) throws IOException {
        MessageBuffer messageBuffer = this.buffer;
        if (messageBuffer != null) {
            int size = messageBuffer.size();
            int i12 = this.position;
            if (size - i12 >= i11 && i11 <= this.bufferFlushThreshold) {
                this.buffer.putBytes(i12, bArr, i10, i11);
                this.position += i11;
                return this;
            }
        }
        flush();
        this.out.add(bArr, i10, i11);
        this.totalFlushBytes += (long) i11;
        return this;
    }

    public MessagePacker packTimestamp(long j10) throws IOException {
        return packTimestamp(Instant.ofEpochMilli(j10));
    }

    public MessagePacker writePayload(byte[] bArr, int i10, int i11) throws IOException {
        MessageBuffer messageBuffer = this.buffer;
        if (messageBuffer != null) {
            int size = messageBuffer.size();
            int i12 = this.position;
            if (size - i12 >= i11 && i11 <= this.bufferFlushThreshold) {
                this.buffer.putBytes(i12, bArr, i10, i11);
                this.position += i11;
                return this;
            }
        }
        flush();
        this.out.write(bArr, i10, i11);
        this.totalFlushBytes += (long) i11;
        return this;
    }

    public MessagePacker packTimestamp(long j10, int i10) throws IOException, ArithmeticException {
        long j11 = i10;
        long jA = b.a(j10, a.a(j11, NANOS_PER_SECOND));
        long jA2 = c.a(j11, NANOS_PER_SECOND);
        if ((jA >>> 34) != 0) {
            writeTimestamp96(jA, (int) jA2);
            return this;
        }
        long j12 = (jA2 << 34) | jA;
        if (((-4294967296L) & j12) == 0) {
            writeTimestamp32((int) jA);
            return this;
        }
        writeTimestamp64(j12);
        return this;
    }
}
