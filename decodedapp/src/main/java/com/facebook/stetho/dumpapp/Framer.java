package com.facebook.stetho.dumpapp;

import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Utf8Charset;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class Framer {
    public static final byte ENTER_FRAME_PREFIX = 33;
    public static final byte EXIT_FRAME_PREFIX = 120;
    public static final byte STDERR_FRAME_PREFIX = 50;
    public static final byte STDIN_FRAME_PREFIX = 45;
    public static final byte STDIN_REQUEST_FRAME_PREFIX = 95;
    public static final byte STDOUT_FRAME_PREFIX = 49;
    private static final String TAG = "FramingSocket";
    private final DataInputStream mInput;
    private final DataOutputStream mMultiplexedOutputStream;
    private final InputStream mStdin = new FramingInputStream();
    private final PrintStream mStdout = new PrintStream(new BufferedOutputStream(new FramingOutputStream(STDOUT_FRAME_PREFIX)));
    private final PrintStream mStderr = new PrintStream(new FramingOutputStream(STDERR_FRAME_PREFIX));

    private static class ClosedHelper {
        private volatile boolean mClosed;

        private ClosedHelper() {
        }

        public void close() {
            this.mClosed = true;
        }

        public void throwIfClosed() throws IOException {
            if (this.mClosed) {
                throw new IOException("Stream is closed");
            }
        }
    }

    public Framer(InputStream inputStream, OutputStream outputStream) throws IOException {
        this.mInput = new DataInputStream(inputStream);
        this.mMultiplexedOutputStream = new DataOutputStream(outputStream);
    }

    private static <T extends Throwable> T handleSuppression(T t10, T t11) {
        if (t10 == null) {
            return t11;
        }
        LogUtil.i(TAG, t11, "Suppressed while handling " + t10);
        return t10;
    }

    public PrintStream getStderr() {
        return this.mStderr;
    }

    public InputStream getStdin() {
        return this.mStdin;
    }

    public PrintStream getStdout() {
        return this.mStdout;
    }

    public byte readFrameType() throws IOException {
        return this.mInput.readByte();
    }

    public int readInt() throws IOException {
        return this.mInput.readInt();
    }

    public String readString() throws IOException {
        byte[] bArr = new byte[this.mInput.readUnsignedShort()];
        this.mInput.readFully(bArr);
        return new String(bArr, Charset.forName(Utf8Charset.NAME));
    }

    public void writeBlob(byte[] bArr, int i10, int i11) throws IOException {
        this.mMultiplexedOutputStream.write(bArr, i10, i11);
    }

    public void writeExitCode(int i10) throws IOException {
        this.mStdout.flush();
        this.mStderr.flush();
        writeIntFrame(EXIT_FRAME_PREFIX, i10);
    }

    public void writeIntFrame(byte b10, int i10) throws IOException {
        this.mMultiplexedOutputStream.write(b10);
        this.mMultiplexedOutputStream.writeInt(i10);
    }

    private class FramingInputStream extends InputStream {
        private final ClosedHelper mClosedHelper;

        private FramingInputStream() {
            this.mClosedHelper = new ClosedHelper();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mClosedHelper.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            byte[] bArr = new byte[1];
            if (read(bArr) == 0) {
                return -1;
            }
            return bArr[0];
        }

        @Override // java.io.InputStream
        public long skip(long j10) throws IOException {
            long j11;
            byte[] bArr = new byte[(int) Math.min(j10, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX)];
            synchronized (Framer.this) {
                j11 = 0;
                while (j11 < j10) {
                    try {
                        int i10 = read(bArr);
                        if (i10 >= 0) {
                            j11 += (long) i10;
                        }
                    } finally {
                    }
                }
            }
            return j11;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            return read(bArr, 0, bArr.length);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12;
            this.mClosedHelper.throwIfClosed();
            synchronized (Framer.this) {
                try {
                    Framer.this.writeIntFrame(Framer.STDIN_REQUEST_FRAME_PREFIX, i11);
                    byte frameType = Framer.this.readFrameType();
                    if (frameType == 45) {
                        i12 = Framer.this.readInt();
                        if (i12 > 0) {
                            if (i12 <= i11) {
                                Framer.this.mInput.readFully(bArr, i10, i12);
                            } else {
                                throw new DumpappFramingException("Expected at most " + i11 + " bytes, got: " + i12);
                            }
                        }
                    } else {
                        throw new UnexpectedFrameException(Framer.STDIN_FRAME_PREFIX, frameType);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i12;
        }
    }

    private class FramingOutputStream extends OutputStream {
        private final ClosedHelper mClosedHelper = new ClosedHelper();
        private final byte mPrefix;

        public FramingOutputStream(byte b10) {
            this.mPrefix = b10;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mClosedHelper.close();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.mClosedHelper.throwIfClosed();
            if (i11 > 0) {
                try {
                    synchronized (Framer.this) {
                        Framer.this.writeIntFrame(this.mPrefix, i11);
                        Framer.this.writeBlob(bArr, i10, i11);
                        Framer.this.mMultiplexedOutputStream.flush();
                    }
                } catch (IOException e10) {
                    throw new DumpappOutputBrokenException(e10);
                }
            }
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            write(new byte[]{(byte) i10}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            write(bArr, 0, bArr.length);
        }
    }
}
