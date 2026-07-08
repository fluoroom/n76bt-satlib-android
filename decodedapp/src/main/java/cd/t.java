package cd;

/* JADX INFO: loaded from: classes3.dex */
public class t extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected e[] f4677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected long[] f4678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int[] f4679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int[] f4680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected long[] f4681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected long[] f4682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected long[] f4683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected long[] f4684r;

    protected t(e[] eVarArr, long j10) {
        this.f4678l = null;
        this.f4679m = null;
        this.f4680n = null;
        this.f4681o = null;
        this.f4682p = null;
        this.f4683q = null;
        this.f4684r = null;
        this.f4657e = 201;
        this.f4659g = j10;
        this.f4677k = eVarArr;
    }

    protected void c() {
        if (this.f4677k != null) {
            byte[] bArrD = d();
            byte[] bArr = new byte[bArrD.length + 8];
            this.f4660h = bArr;
            System.arraycopy(bArrD, 0, bArr, 8, bArrD.length);
            this.f4656d = this.f4677k.length;
        } else {
            this.f4660h = new byte[8];
            this.f4656d = 0;
        }
        super.b();
        System.arraycopy(y.e(this.f4659g), 0, this.f4660h, 4, 4);
    }

    protected byte[] d() {
        byte[] bArr = new byte[this.f4677k.length * 24];
        int i10 = 0;
        while (true) {
            e[] eVarArr = this.f4677k;
            if (i10 >= eVarArr.length) {
                return bArr;
            }
            int i11 = i10 * 24;
            System.arraycopy(y.e(eVarArr[i10].f4567f), 0, bArr, i11, 4);
            byte[] bArrE = y.e(this.f4677k[i10].d());
            bArrE[0] = (byte) this.f4677k[i10].c();
            System.arraycopy(bArrE, 0, bArr, i11 + 4, 4);
            System.arraycopy(y.e(this.f4677k[i10].b()), 0, bArr, i11 + 8, 4);
            double d10 = this.f4677k[i10].f4583v;
            System.arraycopy(d10 >= 0.0d ? y.e((long) d10) : y.e(0L), 0, bArr, i11 + 12, 4);
            System.arraycopy(y.e(this.f4677k[i10].f4585x), 0, bArr, i11 + 16, 4);
            e eVar = this.f4677k[i10];
            System.arraycopy(eVar.f4586y > 0 ? y.e(eVar.a()) : y.e(0L), 0, bArr, i11 + 20, 4);
            i10++;
        }
    }

    protected t(byte[] bArr, int i10, int i11) {
        int i12;
        this.f4677k = null;
        this.f4678l = null;
        this.f4679m = null;
        this.f4680n = null;
        this.f4681o = null;
        this.f4682p = null;
        this.f4683q = null;
        this.f4684r = null;
        this.f4660h = bArr;
        if (i11 < 0 && (!super.a(i10) || this.f4657e != 201 || this.f4658f < 1)) {
            this.f4653a = -201;
        }
        if (i11 > 0) {
            i12 = i10 + 28;
        } else {
            int i13 = this.f4656d;
            this.f4659g = y.b(bArr, i10 + 4);
            i12 = i10 + 8;
            i11 = i13;
        }
        if (i11 > 0) {
            this.f4678l = new long[i11];
            this.f4679m = new int[i11];
            this.f4680n = new int[i11];
            this.f4681o = new long[i11];
            this.f4682p = new long[i11];
            this.f4683q = new long[i11];
            this.f4684r = new long[i11];
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = (i14 * 24) + i12;
                this.f4678l[i14] = y.b(bArr, i15);
                int i16 = i15 + 4;
                this.f4679m[i14] = bArr[i16];
                bArr[i16] = 0;
                this.f4680n[i14] = (int) y.b(bArr, i16);
                this.f4681o[i14] = y.b(bArr, i15 + 8);
                this.f4682p[i14] = y.b(bArr, i15 + 12);
                this.f4683q[i14] = y.b(bArr, i15 + 16);
                this.f4684r[i14] = y.b(bArr, i15 + 20);
            }
        }
    }
}
