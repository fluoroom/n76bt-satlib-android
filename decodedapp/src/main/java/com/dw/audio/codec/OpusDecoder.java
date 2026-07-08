package com.dw.audio.codec;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class OpusDecoder implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5435b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f5436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5437d;

    static {
        System.loadLibrary("opus-lib");
    }

    public OpusDecoder(int i10, int i11) {
        long jNative_setup = native_setup(i10, i11);
        this.f5436c = jNative_setup;
        if (jNative_setup == 0) {
            throw new RuntimeException("initialization failed");
        }
        this.f5434a = i11;
        this.f5437d = i10;
    }

    private void a() {
        if (this.f5436c == 0) {
            throw new IllegalStateException("对象已经释放");
        }
    }

    private final native long native_decode(long j10, byte[] bArr, int i10, short[] sArr, int i11, int i12);

    private final native void native_release(long j10);

    private final native long native_setup(int i10, int i11);

    public int c(byte[] bArr, int i10, short[] sArr) {
        return e(bArr, i10, sArr, 0, sArr.length);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f5436c;
        this.f5436c = 0L;
        if (j10 == 0) {
            return;
        }
        native_release(j10);
    }

    public int e(byte[] bArr, int i10, short[] sArr, int i11, int i12) {
        a();
        return (int) native_decode(this.f5436c, bArr, i10, sArr, i11, i12);
    }

    protected void finalize() {
        try {
            super.finalize();
        } finally {
            close();
        }
    }
}
