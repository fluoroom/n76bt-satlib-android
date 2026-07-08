package com.dw.sbc;

/* JADX INFO: loaded from: classes.dex */
public class SbcDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f6895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6896b;

    static {
        System.loadLibrary("sbc");
    }

    public SbcDecoder(boolean z10) {
        long jNative_setup = native_setup(0L, z10);
        this.f6895a = jNative_setup;
        if (jNative_setup == 0) {
            throw new OutOfMemoryError();
        }
    }

    private void a() {
        if (this.f6895a == 0) {
            throw new IllegalStateException("对象已经释放");
        }
    }

    public static byte[] c(byte[] bArr, boolean z10) {
        if (bArr == null) {
            return null;
        }
        return native_static_decode(bArr, z10);
    }

    private final native long native_decode(long j10, byte[] bArr, int i10, int i11, byte[] bArr2);

    private final native void native_release(long j10);

    private final native long native_setup(long j10, boolean z10);

    private static final native byte[] native_static_decode(byte[] bArr, boolean z10);

    public int b(byte[] bArr, int i10, int i11, byte[] bArr2) {
        a();
        long jNative_decode = native_decode(this.f6895a, bArr, i10, i11, bArr2);
        this.f6896b = (int) (jNative_decode >>> 32);
        return (int) jNative_decode;
    }

    public int d() {
        return this.f6896b;
    }

    public void e() {
        long j10 = this.f6895a;
        this.f6895a = 0L;
        if (j10 == 0) {
            return;
        }
        native_release(j10);
    }

    protected void finalize() {
        try {
            super.finalize();
        } finally {
            e();
        }
    }
}
