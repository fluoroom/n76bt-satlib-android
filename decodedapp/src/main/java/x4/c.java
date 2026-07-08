package x4;

import android.os.SystemClock;
import com.dw.audio.codec.Resample;
import x4.a;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resample f31628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short[] f31630d = new short[28];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final short[] f31631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f31632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b6.d f31633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a.C0425a f31634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f31635i;

    public c(int i10) {
        this.f31627a = i10;
        int i11 = 896000 / i10;
        this.f31629c = i11;
        this.f31628b = new Resample(32000, i10);
        this.f31633g = new b6.d(i11 * 2);
        this.f31631e = new short[i11];
        byte[] bArr = new byte[56];
        this.f31632f = bArr;
        this.f31634h = new a.C0425a(bArr);
    }

    @Override // x4.a
    public a.C0425a a(short[] sArr, int i10, int i11) {
        if (this.f31635i == 0) {
            this.f31635i = (SystemClock.elapsedRealtime() * ((long) this.f31627a)) / 1000;
        }
        this.f31633g.o(sArr, i10, i11);
        if (this.f31633g.c() < this.f31629c) {
            return null;
        }
        b6.d dVar = this.f31633g;
        short[] sArr2 = this.f31631e;
        dVar.l(sArr2, 0, sArr2.length);
        Resample resample = this.f31628b;
        short[] sArr3 = this.f31631e;
        int length = sArr3.length;
        short[] sArr4 = this.f31630d;
        int iB = resample.b(sArr3, 0, length, sArr4, 0, sArr4.length);
        short[] sArr5 = this.f31630d;
        if (iB != sArr5.length) {
            s3.b.d("ResampleEncoder", "重新采样错误");
            return null;
        }
        this.f31634h.f31615b = w3.b.h(sArr5, 0, sArr5.length, this.f31632f, 0, w3.d.PCM_16BIT_BE);
        a.C0425a c0425a = this.f31634h;
        long j10 = this.f31635i;
        c0425a.f31616c = j10;
        this.f31635i = j10 + ((long) this.f31630d.length);
        return c0425a;
    }

    @Override // x4.a
    public int b() {
        return this.f31629c;
    }

    @Override // x4.a
    public int c() {
        return this.f31633g.c();
    }

    @Override // x4.a
    public a.C0425a d() {
        return null;
    }

    @Override // x4.a
    public void e() {
        this.f31628b.c();
    }
}
