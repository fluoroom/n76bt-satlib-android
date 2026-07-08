package com.dw.audio.codec;

/* JADX INFO: loaded from: classes.dex */
public class Resample {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f5440a;

    static {
        System.loadLibrary("opus-tools-lib");
    }

    public Resample(int i10, int i11) {
        long jNative_setup = native_setup(i10, i11);
        this.f5440a = jNative_setup;
        if (jNative_setup == 0) {
            throw new RuntimeException("initialization failed");
        }
    }

    private void a() {
        if (this.f5440a == 0) {
            throw new IllegalStateException("对象已经释放");
        }
    }

    private native int native_process(long j10, short[] sArr, int i10, int i11, short[] sArr2, int i12, int i13);

    private native void native_release(long j10);

    private native long native_setup(int i10, int i11);

    public int b(short[] sArr, int i10, int i11, short[] sArr2, int i12, int i13) {
        a();
        return native_process(this.f5440a, sArr, i10, i11, sArr2, i12, i13);
    }

    public void c() {
        long j10 = this.f5440a;
        this.f5440a = 0L;
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
