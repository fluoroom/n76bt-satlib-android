package com.facebook.stetho.server;

import com.facebook.stetho.common.LogUtil;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class CompositeInputStream extends InputStream {
    private int mCurrentIndex;
    private final InputStream[] mStreams;

    public CompositeInputStream(InputStream[] inputStreamArr) {
        if (inputStreamArr == null || inputStreamArr.length < 2) {
            throw new IllegalArgumentException("Streams must be non-null and have more than 1 entry");
        }
        this.mStreams = inputStreamArr;
        this.mCurrentIndex = 0;
    }

    private void closeAll(int i10) throws IOException {
        IOException iOException = null;
        int i11 = 0;
        while (true) {
            InputStream[] inputStreamArr = this.mStreams;
            if (i11 >= inputStreamArr.length) {
                return;
            }
            try {
                inputStreamArr[i11].close();
            } catch (IOException e10) {
                e = e10;
                if (i11 != i10 && iOException != null) {
                    e = iOException;
                }
                if (iOException != null && iOException != e) {
                    LogUtil.w(iOException, "Suppressing exception");
                }
                iOException = e;
            }
            i11++;
        }
    }

    private boolean tryMoveToNextStream() {
        int i10 = this.mCurrentIndex;
        if (i10 + 1 >= this.mStreams.length) {
            return false;
        }
        this.mCurrentIndex = i10 + 1;
        return true;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.mStreams[this.mCurrentIndex].available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        closeAll(this.mCurrentIndex);
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        int i10 = read(new byte[(int) j10]);
        if (i10 >= 0) {
            return i10;
        }
        return -1L;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        do {
            i12 = this.mStreams[this.mCurrentIndex].read(bArr, i10, i11);
            if (i12 != -1) {
                break;
            }
        } while (tryMoveToNextStream());
        return i12;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i10;
        do {
            i10 = this.mStreams[this.mCurrentIndex].read();
            if (i10 != -1) {
                break;
            }
        } while (tryMoveToNextStream());
        return i10;
    }
}
