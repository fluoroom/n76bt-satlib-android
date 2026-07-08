package com.dw.sbc;

import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes.dex */
public class SbcEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f6897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f6898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6900d;

    static {
        System.loadLibrary("sbc");
    }

    public SbcEncoder(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        if (i10 != 16000 && i10 != 32000 && i10 != 44100 && i10 != 48000) {
            throw new InvalidParameterException("sample rate not support");
        }
        if (i12 != 4 && i12 != 8 && i12 != 12 && i12 != 16) {
            throw new InvalidParameterException("blocks not support");
        }
        if (i13 != 4 && i13 != 8) {
            throw new InvalidParameterException("sub bands not support");
        }
        this.f6898b = native_setup(i10, i11, i12, i13, z10, z11);
        this.f6897a = new byte[c()];
    }

    private void a() {
        if (this.f6898b == 0) {
            throw new IllegalStateException("对象已经释放");
        }
    }

    private final native long native_encode(long j10, byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13);

    private final native int native_get_codesize(long j10);

    private final native void native_release(long j10);

    private final native long native_setup(int i10, int i11, int i12, int i13, boolean z10, boolean z11);

    public int b(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        a();
        long jNative_encode = native_encode(this.f6898b, bArr, i10, i11, bArr2, i12, bArr2.length);
        this.f6899c = (int) (jNative_encode >>> 32);
        return (int) jNative_encode;
    }

    public int c() {
        if (this.f6900d == 0) {
            a();
            this.f6900d = native_get_codesize(this.f6898b);
        }
        return this.f6900d;
    }

    public int d() {
        return this.f6899c;
    }

    public void e() {
        long j10 = this.f6898b;
        this.f6898b = 0L;
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

    public SbcEncoder(int i10, int i11, boolean z10) {
        this(i10, i11, 16, 8, false, z10);
    }
}
