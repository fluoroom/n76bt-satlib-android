package com.dw.audio.codec;

/* JADX INFO: loaded from: classes.dex */
public class OpusEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f5439b;

    static {
        System.loadLibrary("opus-lib");
    }

    public OpusEncoder(int i10, int i11, int i12) {
        long jNative_setup = native_setup(i10, i11, i12);
        this.f5439b = jNative_setup;
        if (jNative_setup == 0) {
            throw new RuntimeException("initialization failed");
        }
        this.f5438a = i11;
    }

    private void a() {
        if (this.f5439b == 0) {
            throw new IllegalStateException("对象已经释放");
        }
    }

    private native long native_encode(long j10, short[] sArr, byte[] bArr, int i10);

    private native void native_release(long j10);

    private native long native_setup(int i10, int i11, int i12);

    public int b(short[] sArr, byte[] bArr) {
        a();
        if (sArr.length == this.f5438a) {
            return (int) native_encode(this.f5439b, sArr, bArr, bArr.length);
        }
        throw new IllegalArgumentException("音频样本数必须和FrameSize相同");
    }

    public void c() {
        long j10 = this.f5439b;
        this.f5439b = 0L;
        if (j10 == 0) {
            return;
        }
        native_release(j10);
    }

    protected void finalize() {
        try {
            super.finalize();
        } finally {
            c();
        }
    }
}
