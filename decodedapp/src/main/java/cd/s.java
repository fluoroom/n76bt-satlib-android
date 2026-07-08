package cd;

/* JADX INFO: loaded from: classes3.dex */
public class s extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f4667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private o f4668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected long f4669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int[] f4670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int[] f4671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int[] f4672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected int f4673q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f4674r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected byte[] f4675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected byte[] f4676t;

    protected s(byte[] bArr, int i10, o oVar) {
        this.f4667k = false;
        this.f4669m = -1L;
        this.f4668l = oVar;
        this.f4660h = bArr;
        if (!super.a(i10) || this.f4657e != 206 || this.f4658f < 2) {
            this.f4653a = -206;
            return;
        }
        long jB = y.b(bArr, i10 + 8);
        this.f4669m = jB;
        if (jB != oVar.f4633g) {
            this.f4667k = true;
            return;
        }
        this.f4659g = y.b(bArr, i10 + 4);
        int i11 = this.f4656d;
        if (i11 == 1) {
            d();
            return;
        }
        if (i11 == 2) {
            f(bArr, i10 + 12);
            return;
        }
        if (i11 == 3) {
            e(bArr, i10 + 12);
            return;
        }
        if (i11 == 15) {
            c(bArr, i10 + 12);
            return;
        }
        System.out.println("!!!! RtcpPktPSFB(byte[], int start) unexpected FMT " + this.f4656d);
    }

    private void c(byte[] bArr, int i10) {
        int i11 = (this.f4658f - 2) * 4;
        byte[] bArr2 = new byte[i11];
        this.f4676t = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f4668l.getClass();
    }

    private void d() {
        this.f4668l.getClass();
    }

    private void e(byte[] bArr, int i10) {
        byte b10 = bArr[i10];
        this.f4673q = b10;
        if (b10 > 32) {
            System.out.println("!!!! RtcpPktPSFB.decRefPictureSelcIndic paddingBits: " + this.f4673q);
        }
        byte b11 = this.f4660h[i10];
        this.f4674r = b11;
        if (b11 < 0) {
            System.out.println("!!!! RtcpPktPSFB.decRefPictureSelcIndic 8th bit not zero: " + this.f4674r);
        }
        byte[] bArr2 = new byte[((this.f4658f - 2) * 4) - 2];
        this.f4675s = bArr2;
        System.arraycopy(bArr, i10 + 2, bArr2, 0, bArr2.length);
        this.f4668l.getClass();
    }

    private void f(byte[] bArr, int i10) {
        int i11 = this.f4658f - 2;
        this.f4670n = new int[i11];
        this.f4671o = new int[i11];
        this.f4672p = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f4670n[i12] = y.a(bArr, i10) >> 3;
            this.f4671o[i12] = (y.a(bArr, i10) & 524224) >> 6;
            this.f4672p[i12] = y.a(bArr, i10 + 2) & 63;
            i10 += 4;
        }
        this.f4668l.getClass();
    }

    private void g() {
        byte[] bArr = this.f4676t;
        System.arraycopy(bArr, 0, this.f4660h, 8, bArr.length);
    }

    private void h() {
        this.f4660h[8] = y.d(this.f4673q)[1];
        byte[] bArrD = y.d(this.f4674r);
        byte[] bArr = this.f4660h;
        bArr[9] = bArrD[1];
        byte[] bArr2 = this.f4675s;
        System.arraycopy(bArr2, 0, bArr, 10, bArr2.length);
    }

    private void i() {
        int i10 = 0;
        while (true) {
            if (i10 >= this.f4670n.length) {
                return;
            }
            int i11 = i10 * 8;
            byte[] bArrE = y.e(r1[i10] << 3);
            byte[] bArrE2 = y.e(this.f4671o[i10] << 2);
            byte[] bArrD = y.d(this.f4672p[i10]);
            byte[] bArr = this.f4660h;
            bArr[i11 + 8] = bArrE[2];
            bArr[i11 + 9] = (byte) (bArrE[3] | bArrE2[2]);
            bArr[i11 + 10] = bArrE2[3];
            bArr[i11 + 11] = (byte) (bArrE2[3] | bArrD[1]);
            i10++;
        }
    }

    protected void j() {
        int i10 = this.f4656d;
        if (i10 == 1) {
            this.f4660h = new byte[24];
        } else if (i10 == 2) {
            this.f4660h = new byte[(this.f4670n.length * 4) + 24];
            i();
        } else if (i10 == 3) {
            this.f4660h = new byte[(this.f4675s.length / 4) + 26];
            h();
        } else if (i10 == 15) {
            this.f4660h = new byte[(this.f4676t.length / 4) + 24];
            g();
        }
        System.arraycopy(y.e(this.f4659g), 0, this.f4660h, 4, 4);
        System.arraycopy(y.e(this.f4669m), 0, this.f4660h, 8, 4);
        b();
    }
}
