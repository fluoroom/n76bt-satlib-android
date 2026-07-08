package org.msgpack.core;

import androidx.appcompat.widget.ActivityChooserView;
import j$.time.Instant;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.MessagePack;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueFactory;
import org.msgpack.value.ValueType;
import org.msgpack.value.Variable;

/* JADX INFO: loaded from: classes3.dex */
public class MessageUnpacker implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final MessageBuffer EMPTY_BUFFER = MessageBuffer.wrap(new byte[0]);
    private static final String EMPTY_STRING = "";
    private final CodingErrorAction actionOnMalformedString;
    private final CodingErrorAction actionOnUnmappableString;
    private final boolean allowReadingBinaryAsString;
    private final boolean allowReadingStringAsBinary;
    private CharBuffer decodeBuffer;
    private StringBuilder decodeStringBuffer;
    private CharsetDecoder decoder;
    private MessageBufferInput in;
    private int nextReadPosition;
    private int position;
    private final int stringDecoderBufferSize;
    private final int stringSizeLimit;
    private long totalReadBytes;
    private MessageBuffer buffer = EMPTY_BUFFER;
    private final MessageBuffer numberBuffer = MessageBuffer.allocate(8);

    /* JADX INFO: renamed from: org.msgpack.core.MessageUnpacker$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$core$MessageFormat;
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$value$ValueType;

        static {
            int[] iArr = new int[ValueType.values().length];
            $SwitchMap$org$msgpack$value$ValueType = iArr;
            try {
                iArr[ValueType.NIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.MAP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.EXTENSION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[MessageFormat.values().length];
            $SwitchMap$org$msgpack$core$MessageFormat = iArr2;
            try {
                iArr2[MessageFormat.POSFIXINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.NEGFIXINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.NIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXMAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXSTR.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT8.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT8.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT16.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT16.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FLOAT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FLOAT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BIN8.ordinal()] = 18;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.STR8.ordinal()] = 19;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BIN16.ordinal()] = 20;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.STR16.ordinal()] = 21;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BIN32.ordinal()] = 22;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.STR32.ordinal()] = 23;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT1.ordinal()] = 24;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT2.ordinal()] = 25;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT4.ordinal()] = 26;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT8.ordinal()] = 27;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT16.ordinal()] = 28;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.EXT8.ordinal()] = 29;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.EXT16.ordinal()] = 30;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.EXT32.ordinal()] = 31;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.ARRAY16.ordinal()] = 32;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.ARRAY32.ordinal()] = 33;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.MAP16.ordinal()] = 34;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.MAP32.ordinal()] = 35;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.NEVER_USED.ordinal()] = 36;
            } catch (NoSuchFieldError unused45) {
            }
        }
    }

    protected MessageUnpacker(MessageBufferInput messageBufferInput, MessagePack.UnpackerConfig unpackerConfig) {
        this.in = (MessageBufferInput) Preconditions.checkNotNull(messageBufferInput, "MessageBufferInput is null");
        this.allowReadingStringAsBinary = unpackerConfig.getAllowReadingStringAsBinary();
        this.allowReadingBinaryAsString = unpackerConfig.getAllowReadingBinaryAsString();
        this.actionOnMalformedString = unpackerConfig.getActionOnMalformedString();
        this.actionOnUnmappableString = unpackerConfig.getActionOnUnmappableString();
        this.stringSizeLimit = unpackerConfig.getStringSizeLimit();
        this.stringDecoderBufferSize = unpackerConfig.getStringDecoderBufferSize();
    }

    private String decodeStringFastPath(int i10) {
        CodingErrorAction codingErrorAction = this.actionOnMalformedString;
        CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
        if (codingErrorAction == codingErrorAction2 && this.actionOnUnmappableString == codingErrorAction2 && this.buffer.hasArray()) {
            String str = new String(this.buffer.array(), this.buffer.arrayOffset() + this.position, i10, MessagePack.UTF8);
            this.position += i10;
            return str;
        }
        try {
            CharBuffer charBufferDecode = this.decoder.decode(this.buffer.sliceAsByteBuffer(this.position, i10));
            this.position += i10;
            return charBufferDecode.toString();
        } catch (CharacterCodingException e10) {
            throw new MessageStringCodingException(e10);
        }
    }

    private boolean ensureBuffer() throws IOException {
        while (this.buffer.size() <= this.position) {
            MessageBuffer next = this.in.next();
            if (next == null) {
                return false;
            }
            this.totalReadBytes += (long) this.buffer.size();
            this.buffer = next;
            this.position = 0;
        }
        return true;
    }

    private MessageBuffer getNextBuffer() throws IOException {
        MessageBuffer next = this.in.next();
        if (next == null) {
            throw new MessageInsufficientBufferException();
        }
        this.totalReadBytes += (long) this.buffer.size();
        return next;
    }

    private void handleCoderError(CoderResult coderResult) throws CharacterCodingException {
        if ((coderResult.isMalformed() && this.actionOnMalformedString == CodingErrorAction.REPORT) || (coderResult.isUnmappable() && this.actionOnUnmappableString == CodingErrorAction.REPORT)) {
            coderResult.throwException();
        }
    }

    private void nextBuffer() throws IOException {
        this.buffer = getNextBuffer();
        this.position = 0;
    }

    private static MessageIntegerOverflowException overflowI16(short s10) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(s10));
    }

    private static MessageIntegerOverflowException overflowI32(int i10) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(i10));
    }

    private static MessageIntegerOverflowException overflowI64(long j10) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j10));
    }

    private static MessageIntegerOverflowException overflowU16(short s10) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(s10 & 65535));
    }

    private static MessageIntegerOverflowException overflowU32(int i10) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(((long) (i10 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) + 2147483648L));
    }

    private static MessageSizeException overflowU32Size(int i10) {
        return new MessageSizeException(((long) (i10 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) + 2147483648L);
    }

    private static MessageIntegerOverflowException overflowU64(long j10) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j10 - Long.MIN_VALUE).setBit(63));
    }

    private static MessageIntegerOverflowException overflowU8(byte b10) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(b10 & MessagePack.Code.EXT_TIMESTAMP));
    }

    private MessageBuffer prepareNumberBuffer(int i10) throws IOException {
        int size = this.buffer.size();
        int i11 = this.position;
        int i12 = size - i11;
        if (i12 >= i10) {
            this.nextReadPosition = i11;
            this.position = i11 + i10;
            return this.buffer;
        }
        if (i12 > 0) {
            this.numberBuffer.putMessageBuffer(0, this.buffer, i11, i12);
            i10 -= i12;
        } else {
            i12 = 0;
        }
        while (true) {
            nextBuffer();
            int size2 = this.buffer.size();
            if (size2 >= i10) {
                this.numberBuffer.putMessageBuffer(i12, this.buffer, 0, i10);
                this.position = i10;
                this.nextReadPosition = 0;
                return this.numberBuffer;
            }
            this.numberBuffer.putMessageBuffer(i12, this.buffer, 0, size2);
            i10 -= size2;
            i12 += size2;
        }
    }

    private byte readByte() throws IOException {
        int size = this.buffer.size();
        int i10 = this.position;
        if (size > i10) {
            byte b10 = this.buffer.getByte(i10);
            this.position++;
            return b10;
        }
        nextBuffer();
        if (this.buffer.size() <= 0) {
            return readByte();
        }
        byte b11 = this.buffer.getByte(0);
        this.position = 1;
        return b11;
    }

    private double readDouble() throws IOException {
        return prepareNumberBuffer(8).getDouble(this.nextReadPosition);
    }

    private float readFloat() throws IOException {
        return prepareNumberBuffer(4).getFloat(this.nextReadPosition);
    }

    private int readInt() throws IOException {
        return prepareNumberBuffer(4).getInt(this.nextReadPosition);
    }

    private long readLong() throws IOException {
        return prepareNumberBuffer(8).getLong(this.nextReadPosition);
    }

    private int readNextLength16() throws IOException {
        return readShort() & 65535;
    }

    private int readNextLength32() throws IOException {
        int i10 = readInt();
        if (i10 >= 0) {
            return i10;
        }
        throw overflowU32Size(i10);
    }

    private int readNextLength8() throws IOException {
        return readByte() & MessagePack.Code.EXT_TIMESTAMP;
    }

    private short readShort() throws IOException {
        return prepareNumberBuffer(2).getShort(this.nextReadPosition);
    }

    private void resetDecoder() {
        CharsetDecoder charsetDecoder = this.decoder;
        if (charsetDecoder == null) {
            this.decodeBuffer = CharBuffer.allocate(this.stringDecoderBufferSize);
            this.decoder = MessagePack.UTF8.newDecoder().onMalformedInput(this.actionOnMalformedString).onUnmappableCharacter(this.actionOnUnmappableString);
        } else {
            charsetDecoder.reset();
        }
        StringBuilder sb2 = this.decodeStringBuffer;
        if (sb2 == null) {
            this.decodeStringBuffer = new StringBuilder();
        } else {
            sb2.setLength(0);
        }
    }

    private void skipPayload(int i10) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("payload size must be >= 0: " + i10);
        }
        while (true) {
            int size = this.buffer.size();
            int i11 = this.position;
            int i12 = size - i11;
            if (i12 >= i10) {
                this.position = i11 + i10;
                return;
            } else {
                this.position = i11 + i12;
                i10 -= i12;
                nextBuffer();
            }
        }
    }

    private int tryReadBinaryHeader(byte b10) throws IOException {
        switch (b10) {
            case -60:
                return readNextLength8();
            case -59:
                return readNextLength16();
            case -58:
                return readNextLength32();
            default:
                return -1;
        }
    }

    private int tryReadStringHeader(byte b10) throws IOException {
        switch (b10) {
            case -39:
                return readNextLength8();
            case -38:
                return readNextLength16();
            case -37:
                return readNextLength32();
            default:
                return -1;
        }
    }

    private static MessagePackException unexpected(String str, byte b10) {
        MessageFormat messageFormatValueOf = MessageFormat.valueOf(b10);
        if (messageFormatValueOf == MessageFormat.NEVER_USED) {
            return new MessageNeverUsedFormatException(String.format("Expected %s, but encountered 0xC1 \"NEVER_USED\" byte", str));
        }
        String strName = messageFormatValueOf.getValueType().name();
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", str, strName.substring(0, 1) + strName.substring(1).toLowerCase(), Byte.valueOf(b10)));
    }

    private static MessagePackException unexpectedExtension(String str, int i10, int i11) {
        return new MessageTypeException(String.format("Expected extension type %s (%d), but got extension type %d", str, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private static int utf8MultibyteCharacterSize(byte b10) {
        return Integer.numberOfLeadingZeros((~(b10 & MessagePack.Code.EXT_TIMESTAMP)) << 24);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.totalReadBytes += (long) this.position;
        this.buffer = EMPTY_BUFFER;
        this.position = 0;
        this.in.close();
    }

    public MessageFormat getNextFormat() throws IOException {
        if (ensureBuffer()) {
            return MessageFormat.valueOf(this.buffer.getByte(this.position));
        }
        throw new MessageInsufficientBufferException();
    }

    public long getTotalReadBytes() {
        return this.totalReadBytes + ((long) this.position);
    }

    public boolean hasNext() throws IOException {
        return ensureBuffer();
    }

    public void readPayload(ByteBuffer byteBuffer) throws IOException {
        while (true) {
            int iRemaining = byteBuffer.remaining();
            int size = this.buffer.size();
            int i10 = this.position;
            int i11 = size - i10;
            if (i11 >= iRemaining) {
                this.buffer.getBytes(i10, iRemaining, byteBuffer);
                this.position += iRemaining;
                return;
            } else {
                this.buffer.getBytes(i10, i11, byteBuffer);
                this.position += i11;
                nextBuffer();
            }
        }
    }

    public MessageBuffer readPayloadAsReference(int i10) throws IOException {
        int size = this.buffer.size();
        int i11 = this.position;
        if (size - i11 >= i10) {
            MessageBuffer messageBufferSlice = this.buffer.slice(i11, i10);
            this.position += i10;
            return messageBufferSlice;
        }
        MessageBuffer messageBufferAllocate = MessageBuffer.allocate(i10);
        readPayload(messageBufferAllocate, 0, i10);
        return messageBufferAllocate;
    }

    public MessageBufferInput reset(MessageBufferInput messageBufferInput) throws IOException {
        MessageBufferInput messageBufferInput2 = (MessageBufferInput) Preconditions.checkNotNull(messageBufferInput, "MessageBufferInput is null");
        MessageBufferInput messageBufferInput3 = this.in;
        this.in = messageBufferInput2;
        this.buffer = EMPTY_BUFFER;
        this.position = 0;
        this.totalReadBytes = 0L;
        return messageBufferInput3;
    }

    public void skipValue() throws IOException {
        skipValue(1);
    }

    public boolean tryUnpackNil() throws IOException {
        if (!ensureBuffer()) {
            throw new MessageInsufficientBufferException();
        }
        if (this.buffer.getByte(this.position) != -64) {
            return false;
        }
        readByte();
        return true;
    }

    public int unpackArrayHeader() throws IOException {
        byte b10 = readByte();
        if (MessagePack.Code.isFixedArray(b10)) {
            return b10 & 15;
        }
        if (b10 == -36) {
            return readNextLength16();
        }
        if (b10 == -35) {
            return readNextLength32();
        }
        throw unexpected("Array", b10);
    }

    public BigInteger unpackBigInteger() throws IOException {
        byte b10 = readByte();
        if (MessagePack.Code.isFixInt(b10)) {
            return BigInteger.valueOf(b10);
        }
        switch (b10) {
            case -52:
                return BigInteger.valueOf(readByte() & MessagePack.Code.EXT_TIMESTAMP);
            case -51:
                return BigInteger.valueOf(readShort() & 65535);
            case -50:
                int i10 = readInt();
                return i10 < 0 ? BigInteger.valueOf(((long) (i10 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) + 2147483648L) : BigInteger.valueOf(i10);
            case -49:
                long j10 = readLong();
                return j10 < 0 ? BigInteger.valueOf(j10 - Long.MIN_VALUE).setBit(63) : BigInteger.valueOf(j10);
            case -48:
                return BigInteger.valueOf(readByte());
            case -47:
                return BigInteger.valueOf(readShort());
            case -46:
                return BigInteger.valueOf(readInt());
            case -45:
                return BigInteger.valueOf(readLong());
            default:
                throw unexpected("Integer", b10);
        }
    }

    public int unpackBinaryHeader() throws IOException {
        int iTryReadStringHeader;
        byte b10 = readByte();
        if (MessagePack.Code.isFixedRaw(b10)) {
            return b10 & 31;
        }
        int iTryReadBinaryHeader = tryReadBinaryHeader(b10);
        if (iTryReadBinaryHeader >= 0) {
            return iTryReadBinaryHeader;
        }
        if (!this.allowReadingStringAsBinary || (iTryReadStringHeader = tryReadStringHeader(b10)) < 0) {
            throw unexpected("Binary", b10);
        }
        return iTryReadStringHeader;
    }

    public boolean unpackBoolean() throws IOException {
        byte b10 = readByte();
        if (b10 == -62) {
            return false;
        }
        if (b10 == -61) {
            return true;
        }
        throw unexpected("boolean", b10);
    }

    public byte unpackByte() throws IOException {
        long j10;
        byte b10 = readByte();
        if (MessagePack.Code.isFixInt(b10)) {
            return b10;
        }
        switch (b10) {
            case -52:
                byte b11 = readByte();
                if (b11 >= 0) {
                    return b11;
                }
                throw overflowU8(b11);
            case -51:
                short s10 = readShort();
                if (s10 < 0 || s10 > 127) {
                    throw overflowU16(s10);
                }
                return (byte) s10;
            case -50:
                int i10 = readInt();
                if (i10 < 0 || i10 > 127) {
                    throw overflowU32(i10);
                }
                return (byte) i10;
            case -49:
                j10 = readLong();
                if (j10 < 0 || j10 > 127) {
                    throw overflowU64(j10);
                }
                break;
            case -48:
                return readByte();
            case -47:
                short s11 = readShort();
                if (s11 < -128 || s11 > 127) {
                    throw overflowI16(s11);
                }
                return (byte) s11;
            case -46:
                int i11 = readInt();
                if (i11 < -128 || i11 > 127) {
                    throw overflowI32(i11);
                }
                return (byte) i11;
            case -45:
                j10 = readLong();
                if (j10 < -128 || j10 > 127) {
                    throw overflowI64(j10);
                }
                break;
            default:
                throw unexpected("Integer", b10);
        }
        return (byte) j10;
    }

    public double unpackDouble() throws IOException {
        byte b10 = readByte();
        if (b10 == -54) {
            return readFloat();
        }
        if (b10 == -53) {
            return readDouble();
        }
        throw unexpected("Float", b10);
    }

    public ExtensionTypeHeader unpackExtensionTypeHeader() throws IOException {
        byte b10 = readByte();
        switch (b10) {
            case -57:
                MessageBuffer messageBufferPrepareNumberBuffer = prepareNumberBuffer(2);
                return new ExtensionTypeHeader(messageBufferPrepareNumberBuffer.getByte(this.nextReadPosition + 1), messageBufferPrepareNumberBuffer.getByte(this.nextReadPosition) & MessagePack.Code.EXT_TIMESTAMP);
            case -56:
                MessageBuffer messageBufferPrepareNumberBuffer2 = prepareNumberBuffer(3);
                return new ExtensionTypeHeader(messageBufferPrepareNumberBuffer2.getByte(this.nextReadPosition + 2), messageBufferPrepareNumberBuffer2.getShort(this.nextReadPosition) & 65535);
            case -55:
                MessageBuffer messageBufferPrepareNumberBuffer3 = prepareNumberBuffer(5);
                int i10 = messageBufferPrepareNumberBuffer3.getInt(this.nextReadPosition);
                if (i10 >= 0) {
                    return new ExtensionTypeHeader(messageBufferPrepareNumberBuffer3.getByte(this.nextReadPosition + 4), i10);
                }
                throw overflowU32Size(i10);
            default:
                switch (b10) {
                    case -44:
                        return new ExtensionTypeHeader(readByte(), 1);
                    case -43:
                        return new ExtensionTypeHeader(readByte(), 2);
                    case -42:
                        return new ExtensionTypeHeader(readByte(), 4);
                    case -41:
                        return new ExtensionTypeHeader(readByte(), 8);
                    case -40:
                        return new ExtensionTypeHeader(readByte(), 16);
                    default:
                        throw unexpected("Ext", b10);
                }
        }
    }

    public float unpackFloat() throws IOException {
        byte b10 = readByte();
        if (b10 == -54) {
            return readFloat();
        }
        if (b10 == -53) {
            return (float) readDouble();
        }
        throw unexpected("Float", b10);
    }

    public int unpackInt() throws IOException {
        byte b10 = readByte();
        if (MessagePack.Code.isFixInt(b10)) {
            return b10;
        }
        switch (b10) {
            case -52:
                return readByte() & MessagePack.Code.EXT_TIMESTAMP;
            case -51:
                return readShort() & 65535;
            case -50:
                int i10 = readInt();
                if (i10 >= 0) {
                    return i10;
                }
                throw overflowU32(i10);
            case -49:
                long j10 = readLong();
                if (j10 < 0 || j10 > 2147483647L) {
                    throw overflowU64(j10);
                }
                return (int) j10;
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                long j11 = readLong();
                if (j11 < -2147483648L || j11 > 2147483647L) {
                    throw overflowI64(j11);
                }
                return (int) j11;
            default:
                throw unexpected("Integer", b10);
        }
    }

    public long unpackLong() throws IOException {
        byte b10 = readByte();
        if (MessagePack.Code.isFixInt(b10)) {
            return b10;
        }
        switch (b10) {
            case -52:
                return readByte() & MessagePack.Code.EXT_TIMESTAMP;
            case -51:
                return readShort() & 65535;
            case -50:
                int i10 = readInt();
                return i10 < 0 ? ((long) (i10 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) + 2147483648L : i10;
            case -49:
                long j10 = readLong();
                if (j10 >= 0) {
                    return j10;
                }
                throw overflowU64(j10);
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                return readLong();
            default:
                throw unexpected("Integer", b10);
        }
    }

    public int unpackMapHeader() throws IOException {
        byte b10 = readByte();
        if (MessagePack.Code.isFixedMap(b10)) {
            return b10 & 15;
        }
        if (b10 == -34) {
            return readNextLength16();
        }
        if (b10 == -33) {
            return readNextLength32();
        }
        throw unexpected("Map", b10);
    }

    public void unpackNil() throws IOException {
        byte b10 = readByte();
        if (b10 != -64) {
            throw unexpected("Nil", b10);
        }
    }

    public int unpackRawStringHeader() throws IOException {
        int iTryReadBinaryHeader;
        byte b10 = readByte();
        if (MessagePack.Code.isFixedRaw(b10)) {
            return b10 & 31;
        }
        int iTryReadStringHeader = tryReadStringHeader(b10);
        if (iTryReadStringHeader >= 0) {
            return iTryReadStringHeader;
        }
        if (!this.allowReadingBinaryAsString || (iTryReadBinaryHeader = tryReadBinaryHeader(b10)) < 0) {
            throw unexpected("String", b10);
        }
        return iTryReadBinaryHeader;
    }

    public short unpackShort() throws IOException {
        byte b10 = readByte();
        if (MessagePack.Code.isFixInt(b10)) {
            return b10;
        }
        switch (b10) {
            case -52:
                return (short) (readByte() & MessagePack.Code.EXT_TIMESTAMP);
            case -51:
                short s10 = readShort();
                if (s10 >= 0) {
                    return s10;
                }
                throw overflowU16(s10);
            case -50:
                int i10 = readInt();
                if (i10 < 0 || i10 > 32767) {
                    throw overflowU32(i10);
                }
                return (short) i10;
            case -49:
                long j10 = readLong();
                if (j10 < 0 || j10 > 32767) {
                    throw overflowU64(j10);
                }
                return (short) j10;
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                int i11 = readInt();
                if (i11 < -32768 || i11 > 32767) {
                    throw overflowI32(i11);
                }
                return (short) i11;
            case -45:
                long j11 = readLong();
                if (j11 < -32768 || j11 > 32767) {
                    throw overflowI64(j11);
                }
                return (short) j11;
            default:
                throw unexpected("Integer", b10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x011f, code lost:
    
        return r8.decodeStringBuffer.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String unpackString() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.MessageUnpacker.unpackString():java.lang.String");
    }

    public Instant unpackTimestamp() throws IOException {
        return unpackTimestamp(unpackExtensionTypeHeader());
    }

    public ImmutableValue unpackValue() throws IOException {
        MessageFormat nextFormat = getNextFormat();
        int i10 = 0;
        switch (AnonymousClass1.$SwitchMap$org$msgpack$value$ValueType[nextFormat.getValueType().ordinal()]) {
            case 1:
                readByte();
                return ValueFactory.newNil();
            case 2:
                return ValueFactory.newBoolean(unpackBoolean());
            case 3:
                return nextFormat == MessageFormat.UINT64 ? ValueFactory.newInteger(unpackBigInteger()) : ValueFactory.newInteger(unpackLong());
            case 4:
                return ValueFactory.newFloat(unpackDouble());
            case 5:
                int iUnpackRawStringHeader = unpackRawStringHeader();
                if (iUnpackRawStringHeader <= this.stringSizeLimit) {
                    return ValueFactory.newString(readPayload(iUnpackRawStringHeader), true);
                }
                throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", Integer.valueOf(this.stringSizeLimit), Integer.valueOf(iUnpackRawStringHeader)), iUnpackRawStringHeader);
            case 6:
                return ValueFactory.newBinary(readPayload(unpackBinaryHeader()), true);
            case 7:
                int iUnpackArrayHeader = unpackArrayHeader();
                Value[] valueArr = new Value[iUnpackArrayHeader];
                while (i10 < iUnpackArrayHeader) {
                    valueArr[i10] = unpackValue();
                    i10++;
                }
                return ValueFactory.newArray(valueArr, true);
            case 8:
                int iUnpackMapHeader = unpackMapHeader() * 2;
                Value[] valueArr2 = new Value[iUnpackMapHeader];
                while (i10 < iUnpackMapHeader) {
                    valueArr2[i10] = unpackValue();
                    valueArr2[i10 + 1] = unpackValue();
                    i10 += 2;
                }
                return ValueFactory.newMap(valueArr2, true);
            case 9:
                ExtensionTypeHeader extensionTypeHeaderUnpackExtensionTypeHeader = unpackExtensionTypeHeader();
                return extensionTypeHeaderUnpackExtensionTypeHeader.getType() != -1 ? ValueFactory.newExtension(extensionTypeHeaderUnpackExtensionTypeHeader.getType(), readPayload(extensionTypeHeaderUnpackExtensionTypeHeader.getLength())) : ValueFactory.newTimestamp(unpackTimestamp(extensionTypeHeaderUnpackExtensionTypeHeader));
            default:
                throw new MessageNeverUsedFormatException("Unknown value type");
        }
    }

    public void skipValue(int i10) throws IOException {
        int nextLength16;
        int nextLength162;
        while (i10 > 0) {
            byte b10 = readByte();
            switch (AnonymousClass1.$SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.valueOf(b10).ordinal()]) {
                case 5:
                    nextLength16 = b10 & 15;
                    nextLength162 = nextLength16 * 2;
                    i10 += nextLength162;
                    i10--;
                    break;
                case 6:
                    nextLength162 = b10 & 15;
                    i10 += nextLength162;
                    i10--;
                    break;
                case 7:
                    skipPayload(b10 & 31);
                    i10--;
                    break;
                case 8:
                case 9:
                    skipPayload(1);
                    i10--;
                    break;
                case 10:
                case 11:
                    skipPayload(2);
                    i10--;
                    break;
                case 12:
                case 13:
                case 14:
                    skipPayload(4);
                    i10--;
                    break;
                case 15:
                case 16:
                case 17:
                    skipPayload(8);
                    i10--;
                    break;
                case 18:
                case 19:
                    skipPayload(readNextLength8());
                    i10--;
                    break;
                case 20:
                case 21:
                    skipPayload(readNextLength16());
                    i10--;
                    break;
                case 22:
                case 23:
                    skipPayload(readNextLength32());
                    i10--;
                    break;
                case 24:
                    skipPayload(2);
                    i10--;
                    break;
                case 25:
                    skipPayload(3);
                    i10--;
                    break;
                case 26:
                    skipPayload(5);
                    i10--;
                    break;
                case 27:
                    skipPayload(9);
                    i10--;
                    break;
                case 28:
                    skipPayload(17);
                    i10--;
                    break;
                case 29:
                    skipPayload(readNextLength8() + 1);
                    i10--;
                    break;
                case 30:
                    skipPayload(readNextLength16() + 1);
                    i10--;
                    break;
                case 31:
                    int nextLength32 = readNextLength32();
                    skipPayload(1);
                    skipPayload(nextLength32);
                    i10--;
                    break;
                case 32:
                    nextLength162 = readNextLength16();
                    i10 += nextLength162;
                    i10--;
                    break;
                case 33:
                    nextLength162 = readNextLength32();
                    i10 += nextLength162;
                    i10--;
                    break;
                case 34:
                    nextLength16 = readNextLength16();
                    nextLength162 = nextLength16 * 2;
                    i10 += nextLength162;
                    i10--;
                    break;
                case 35:
                    nextLength16 = readNextLength32();
                    nextLength162 = nextLength16 * 2;
                    i10 += nextLength162;
                    i10--;
                    break;
                case 36:
                    throw new MessageNeverUsedFormatException("Encountered 0xC1 \"NEVER_USED\" byte");
                default:
                    i10--;
                    break;
            }
        }
    }

    public Instant unpackTimestamp(ExtensionTypeHeader extensionTypeHeader) throws IOException {
        if (extensionTypeHeader.getType() == -1) {
            int length = extensionTypeHeader.getLength();
            if (length == 4) {
                return Instant.ofEpochSecond(((long) readInt()) & 4294967295L);
            }
            if (length == 8) {
                return Instant.ofEpochSecond(readLong() & 17179869183L, (int) (r0 >>> 34));
            }
            if (length == 12) {
                return Instant.ofEpochSecond(readLong(), ((long) readInt()) & 4294967295L);
            }
            throw new MessageFormatException(String.format("Timestamp extension type (%d) expects 4, 8, or 12 bytes of payload but got %d bytes", (byte) -1, Integer.valueOf(extensionTypeHeader.getLength())));
        }
        throw unexpectedExtension("Timestamp", -1, extensionTypeHeader.getType());
    }

    public void readPayload(MessageBuffer messageBuffer, int i10, int i11) throws IOException {
        while (true) {
            int size = this.buffer.size();
            int i12 = this.position;
            int i13 = size - i12;
            if (i13 >= i11) {
                messageBuffer.putMessageBuffer(i10, this.buffer, i12, i11);
                this.position += i11;
                return;
            } else {
                messageBuffer.putMessageBuffer(i10, this.buffer, i12, i13);
                i10 += i13;
                i11 -= i13;
                this.position += i13;
                nextBuffer();
            }
        }
    }

    public void readPayload(byte[] bArr) throws IOException {
        readPayload(bArr, 0, bArr.length);
    }

    public byte[] readPayload(int i10) throws IOException {
        byte[] bArr = new byte[i10];
        readPayload(bArr);
        return bArr;
    }

    public void readPayload(byte[] bArr, int i10, int i11) throws IOException {
        while (true) {
            int size = this.buffer.size();
            int i12 = this.position;
            int i13 = size - i12;
            if (i13 >= i11) {
                this.buffer.getBytes(i12, bArr, i10, i11);
                this.position += i11;
                return;
            } else {
                this.buffer.getBytes(i12, bArr, i10, i13);
                i10 += i13;
                i11 -= i13;
                this.position += i13;
                nextBuffer();
            }
        }
    }

    public Variable unpackValue(Variable variable) throws IOException {
        MessageFormat nextFormat = getNextFormat();
        int i10 = 0;
        switch (AnonymousClass1.$SwitchMap$org$msgpack$value$ValueType[nextFormat.getValueType().ordinal()]) {
            case 1:
                readByte();
                variable.setNilValue();
                return variable;
            case 2:
                variable.setBooleanValue(unpackBoolean());
                return variable;
            case 3:
                if (AnonymousClass1.$SwitchMap$org$msgpack$core$MessageFormat[nextFormat.ordinal()] != 16) {
                    variable.setIntegerValue(unpackLong());
                    return variable;
                }
                variable.setIntegerValue(unpackBigInteger());
                return variable;
            case 4:
                variable.setFloatValue(unpackDouble());
                return variable;
            case 5:
                int iUnpackRawStringHeader = unpackRawStringHeader();
                if (iUnpackRawStringHeader <= this.stringSizeLimit) {
                    variable.setStringValue(readPayload(iUnpackRawStringHeader));
                    return variable;
                }
                throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", Integer.valueOf(this.stringSizeLimit), Integer.valueOf(iUnpackRawStringHeader)), iUnpackRawStringHeader);
            case 6:
                variable.setBinaryValue(readPayload(unpackBinaryHeader()));
                return variable;
            case 7:
                int iUnpackArrayHeader = unpackArrayHeader();
                Value[] valueArr = new Value[iUnpackArrayHeader];
                while (i10 < iUnpackArrayHeader) {
                    valueArr[i10] = unpackValue();
                    i10++;
                }
                variable.setArrayValue(valueArr);
                return variable;
            case 8:
                int iUnpackMapHeader = unpackMapHeader() * 2;
                Value[] valueArr2 = new Value[iUnpackMapHeader];
                while (i10 < iUnpackMapHeader) {
                    valueArr2[i10] = unpackValue();
                    valueArr2[i10 + 1] = unpackValue();
                    i10 += 2;
                }
                variable.setMapValue(valueArr2);
                return variable;
            case 9:
                ExtensionTypeHeader extensionTypeHeaderUnpackExtensionTypeHeader = unpackExtensionTypeHeader();
                if (extensionTypeHeaderUnpackExtensionTypeHeader.getType() != -1) {
                    variable.setExtensionValue(extensionTypeHeaderUnpackExtensionTypeHeader.getType(), readPayload(extensionTypeHeaderUnpackExtensionTypeHeader.getLength()));
                    return variable;
                }
                variable.setTimestampValue(unpackTimestamp(extensionTypeHeaderUnpackExtensionTypeHeader));
                return variable;
            default:
                throw new MessageFormatException("Unknown value type");
        }
    }
}
