package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.console.CLog;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.protocol.module.Console;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ResponseHandlingInputStream extends FilterInputStream {
    private static final int BUFFER_SIZE = 1024;
    public static final String TAG = "ResponseHandlingInputStream";
    private boolean mClosed;
    private final CountingOutputStream mDecompressedCounter;
    private boolean mEofSeen;
    private long mLastDecompressedCount;
    private final ChromePeerManager mNetworkPeerManager;
    private final OutputStream mOutputStream;
    private final String mRequestId;
    private final ResponseHandler mResponseHandler;
    private byte[] mSkipBuffer;

    public ResponseHandlingInputStream(InputStream inputStream, String str, OutputStream outputStream, CountingOutputStream countingOutputStream, ChromePeerManager chromePeerManager, ResponseHandler responseHandler) {
        super(inputStream);
        this.mLastDecompressedCount = 0L;
        this.mRequestId = str;
        this.mOutputStream = outputStream;
        this.mDecompressedCounter = countingOutputStream;
        this.mNetworkPeerManager = chromePeerManager;
        this.mResponseHandler = responseHandler;
        this.mClosed = false;
    }

    private synchronized int checkEOF(int i10) {
        if (i10 == -1) {
            closeOutputStreamQuietly();
            this.mResponseHandler.onEOF();
            this.mEofSeen = true;
        }
        return i10;
    }

    private synchronized void closeOutputStreamQuietly() {
        if (!this.mClosed) {
            try {
                try {
                    this.mOutputStream.close();
                    reportDecodedSizeIfApplicable();
                } catch (IOException e10) {
                    CLog.writeToConsole(this.mNetworkPeerManager, Console.MessageLevel.ERROR, Console.MessageSource.NETWORK, "Could not close the output stream" + e10);
                }
            } finally {
                this.mClosed = true;
            }
        }
    }

    private byte[] getSkipBufferLocked() {
        if (this.mSkipBuffer == null) {
            this.mSkipBuffer = new byte[1024];
        }
        return this.mSkipBuffer;
    }

    private IOException handleIOException(IOException iOException) {
        this.mResponseHandler.onError(iOException);
        return iOException;
    }

    private void handleIOExceptionWritingToStream(IOException iOException) {
        CLog.writeToConsole(this.mNetworkPeerManager, Console.MessageLevel.ERROR, Console.MessageSource.NETWORK, "Could not write response body to the stream " + iOException);
        closeOutputStreamQuietly();
    }

    private void reportDecodedSizeIfApplicable() {
        CountingOutputStream countingOutputStream = this.mDecompressedCounter;
        if (countingOutputStream != null) {
            long count = countingOutputStream.getCount();
            this.mResponseHandler.onReadDecoded((int) (count - this.mLastDecompressedCount));
            this.mLastDecompressedCount = count;
        }
    }

    private synchronized void writeToOutputStream(int i10) {
        if (this.mClosed) {
            return;
        }
        try {
            this.mOutputStream.write(i10);
            reportDecodedSizeIfApplicable();
        } catch (IOException e10) {
            handleIOExceptionWritingToStream(e10);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j10;
        try {
            if (!this.mEofSeen) {
                byte[] bArr = new byte[1024];
                j10 = 0;
                while (true) {
                    int i10 = read(bArr);
                    if (i10 == -1) {
                        break;
                    } else {
                        j10 += (long) i10;
                    }
                }
            } else {
                j10 = 0;
            }
            if (j10 > 0) {
                CLog.writeToConsole(this.mNetworkPeerManager, Console.MessageLevel.ERROR, Console.MessageSource.NETWORK, "There were " + String.valueOf(j10) + " bytes that were not consumed while processing request " + this.mRequestId);
            }
            super.close();
            closeOutputStreamQuietly();
        } catch (Throwable th2) {
            super.close();
            closeOutputStreamQuietly();
            throw th2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        try {
            int iCheckEOF = checkEOF(((FilterInputStream) this).in.read());
            if (iCheckEOF == -1) {
                return iCheckEOF;
            }
            this.mResponseHandler.onRead(1);
            writeToOutputStream(iCheckEOF);
            return iCheckEOF;
        } catch (IOException e10) {
            throw handleIOException(e10);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException("Mark not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        long j11;
        byte[] skipBufferLocked = getSkipBufferLocked();
        j11 = 0;
        while (j11 < j10) {
            int i10 = read(skipBufferLocked, 0, (int) Math.min(skipBufferLocked.length, j10 - j11));
            if (i10 == -1) {
                break;
            }
            j11 += (long) i10;
        }
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            int iCheckEOF = checkEOF(((FilterInputStream) this).in.read(bArr, i10, i11));
            if (iCheckEOF == -1) {
                return iCheckEOF;
            }
            this.mResponseHandler.onRead(iCheckEOF);
            writeToOutputStream(bArr, i10, iCheckEOF);
            return iCheckEOF;
        } catch (IOException e10) {
            throw handleIOException(e10);
        }
    }

    private synchronized void writeToOutputStream(byte[] bArr, int i10, int i11) {
        if (this.mClosed) {
            return;
        }
        try {
            this.mOutputStream.write(bArr, i10, i11);
            reportDecodedSizeIfApplicable();
        } catch (IOException e10) {
            handleIOExceptionWritingToStream(e10);
        }
    }
}
