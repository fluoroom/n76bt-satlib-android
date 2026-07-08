package com.dw.multimon;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
public class MDecoder extends com.dw.multimon.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f6893b;

    public interface a {
        void a(int i10, byte[] bArr);
    }

    public MDecoder(int i10, int i11) {
        if (i10 != 32000) {
            throw new IllegalArgumentException("只是支持32000采样频率");
        }
        this.f6894a = native_setup(i10, i11);
    }

    public static short[] d(byte[] bArr, int i10, boolean z10) {
        return native_gen(bArr, 0, bArr.length, i10, z10);
    }

    private native void native_demod(long j10, short[] sArr, int i10, int i11);

    private static native short[] native_gen(byte[] bArr, int i10, int i11, int i12, boolean z10);

    private native void native_release(long j10);

    private native void native_reset(long j10);

    private native long native_setup(int i10, int i11);

    @Override // com.dw.multimon.a
    public void b() {
        long j10 = this.f6894a;
        if (j10 == 0) {
            return;
        }
        native_release(j10);
        this.f6894a = 0L;
    }

    public void c(short[] sArr, int i10, int i11) {
        a();
        native_demod(this.f6894a, sArr, i10, i11);
    }

    public void e() {
        a();
        native_reset(this.f6894a);
    }

    public void f(a aVar) {
        this.f6893b = aVar;
    }

    @Keep
    public void onRxPacket(int i10, byte[] bArr) {
        a aVar = this.f6893b;
        if (aVar != null) {
            aVar.a(i10, bArr);
        }
    }
}
