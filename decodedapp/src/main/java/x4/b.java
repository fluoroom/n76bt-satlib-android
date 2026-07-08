package x4;

import android.os.SystemClock;
import com.dw.audio.codec.OpusEncoder;
import com.dw.audio.codec.Resample;
import x4.a;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31617a = 48000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resample f31618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short[] f31620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final short[] f31621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f31622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final OpusEncoder f31623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b6.d f31624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a.C0425a f31625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f31626j;

    public b(int i10) {
        int i11 = i10 <= 8000 ? 1920 : 960;
        int i12 = (i11 * 32000) / 48000;
        this.f31619c = i12;
        this.f31623g = new OpusEncoder(48000, i11, i10);
        this.f31618b = new Resample(32000, 48000);
        this.f31624h = new b6.d(i12 * 2);
        this.f31620d = new short[i11];
        this.f31621e = new short[i12];
        byte[] bArr = new byte[i11];
        this.f31622f = bArr;
        this.f31625i = new a.C0425a(bArr);
    }

    @Override // x4.a
    public a.C0425a a(short[] sArr, int i10, int i11) {
        if (this.f31626j == 0) {
            this.f31626j = (SystemClock.elapsedRealtime() * 48000) / 1000;
        }
        this.f31624h.o(sArr, i10, i11);
        if (this.f31624h.c() < this.f31619c) {
            return null;
        }
        b6.d dVar = this.f31624h;
        short[] sArr2 = this.f31621e;
        dVar.l(sArr2, 0, sArr2.length);
        Resample resample = this.f31618b;
        short[] sArr3 = this.f31621e;
        int length = sArr3.length;
        short[] sArr4 = this.f31620d;
        int iB = resample.b(sArr3, 0, length, sArr4, 0, sArr4.length);
        short[] sArr5 = this.f31620d;
        if (iB != sArr5.length) {
            s3.b.d("OPUSEncoder", "重新采样错误");
            return null;
        }
        int iB2 = this.f31623g.b(sArr5, this.f31622f);
        if (iB2 <= 0) {
            return null;
        }
        a.C0425a c0425a = this.f31625i;
        c0425a.f31615b = iB2;
        long j10 = this.f31626j;
        c0425a.f31616c = j10;
        this.f31626j = j10 + ((long) this.f31620d.length);
        return c0425a;
    }

    @Override // x4.a
    public int b() {
        return this.f31619c;
    }

    @Override // x4.a
    public int c() {
        return this.f31624h.c();
    }

    @Override // x4.a
    public a.C0425a d() {
        return null;
    }

    @Override // x4.a
    public void e() {
        this.f31623g.c();
        this.f31618b.c();
    }
}
