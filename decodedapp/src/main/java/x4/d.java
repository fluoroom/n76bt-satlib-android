package x4;

import com.dw.sbc.SbcEncoder;
import x4.a;

/* JADX INFO: loaded from: classes.dex */
public class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f31636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SbcEncoder f31637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b6.d f31638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short[] f31639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f31640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b6.a f31641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f31642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a.C0425a f31643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f31644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f31645j = 0;

    public d(boolean z10) {
        this.f31636a = z10;
        SbcEncoder sbcEncoder = new SbcEncoder(32000, 18, true);
        this.f31637b = sbcEncoder;
        int iC = sbcEncoder.c();
        this.f31638c = new b6.d(iC * 3);
        short[] sArr = new short[iC / 2];
        this.f31639d = sArr;
        this.f31644i = sArr.length * 7;
        this.f31640e = new byte[iC];
        this.f31641f = new b6.a(2048);
        byte[] bArr = new byte[642];
        this.f31642g = bArr;
        bArr[1] = 0;
        bArr[0] = 0;
        if (z10) {
            bArr[1] = 8;
        }
        a.C0425a c0425a = new a.C0425a(bArr);
        this.f31643h = c0425a;
        c0425a.f31616c = -1L;
    }

    @Override // x4.a
    public a.C0425a a(short[] sArr, int i10, int i11) {
        this.f31638c.o(sArr, i10, i11);
        int iC = this.f31638c.c();
        short[] sArr2 = this.f31639d;
        if (iC < sArr2.length) {
            return null;
        }
        int iL = this.f31638c.l(sArr2, 0, sArr2.length);
        int i12 = 0;
        for (int i13 = 0; i13 < iL; i13++) {
            short s10 = this.f31639d[i13];
            byte[] bArr = this.f31640e;
            int i14 = i12 + 1;
            bArr[i12] = (byte) (s10 >>> 8);
            i12 += 2;
            bArr[i14] = (byte) s10;
        }
        this.f31637b.b(this.f31640e, 0, iL * 2, this.f31642g, 2);
        this.f31645j += iL;
        int iD = this.f31637b.d();
        if (iD > 0) {
            this.f31641f.m(this.f31642g, 2, iD);
        }
        int i15 = this.f31644i;
        if (i15 < 0) {
            if (this.f31641f.c() < 640) {
                return null;
            }
            this.f31641f.l(this.f31642g, 2, 640);
            a.C0425a c0425a = this.f31643h;
            c0425a.f31615b = this.f31642g.length;
            return c0425a;
        }
        if (this.f31645j < i15) {
            return null;
        }
        this.f31643h.f31615b = Math.min(this.f31641f.c(), this.f31642g.length - 2) + 2;
        this.f31641f.l(this.f31642g, 2, this.f31643h.f31615b - 2);
        if (this.f31641f.c() != 0) {
            throw new RuntimeException("缓存不过大");
        }
        this.f31645j = 0;
        return this.f31643h;
    }

    @Override // x4.a
    public int b() {
        return this.f31639d.length;
    }

    @Override // x4.a
    public int c() {
        return this.f31638c.c();
    }

    @Override // x4.a
    public a.C0425a d() {
        int iC = this.f31641f.c();
        if (iC == 0) {
            return null;
        }
        int iL = this.f31641f.l(this.f31642g, 2, Math.min(640, iC));
        a.C0425a c0425a = this.f31643h;
        c0425a.f31615b = iL + 2;
        this.f31645j = 0;
        return c0425a;
    }

    @Override // x4.a
    public void e() {
        this.f31637b.e();
    }

    @Override // x4.a
    public void f(boolean z10, boolean z11) {
        super.f(z10, z11);
        if (z10 && z11) {
            this.f31642g[1] = 11;
            return;
        }
        if (z10) {
            this.f31642g[1] = 10;
        } else if (this.f31636a) {
            this.f31642g[1] = 8;
        } else {
            this.f31642g[1] = 0;
        }
    }

    public void g(int i10) {
        this.f31644i = this.f31639d.length * i10;
    }
}
