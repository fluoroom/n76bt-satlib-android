package yi;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[][] f32624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f32625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f32626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f32627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j f32628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f32629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f32630g;

    private class b implements f {
        private b() {
        }

        private boolean b(double[] dArr, double d10, boolean z10) {
            for (double d11 : dArr) {
                if (aj.d.b(d11) <= d10) {
                    if (z10) {
                        throw new ui.e(ui.d.SINGULAR_MATRIX, new Object[0]);
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // yi.f
        public m a(m mVar) {
            int length = i.this.f32624a.length;
            int length2 = i.this.f32624a[0].length;
            if (mVar.a() != length2) {
                throw new ui.e(ui.d.DIMENSIONS_MISMATCH, Integer.valueOf(mVar.a()), Integer.valueOf(length2));
            }
            b(i.this.f32625b, i.this.f32630g, true);
            double[] dArr = new double[length];
            double[] dArrD = mVar.d();
            for (int i10 = 0; i10 < aj.d.E(length2, length); i10++) {
                double[] dArr2 = i.this.f32624a[i10];
                double d10 = 0.0d;
                for (int i11 = i10; i11 < length2; i11++) {
                    d10 += dArrD[i11] * dArr2[i11];
                }
                double d11 = d10 / (i.this.f32625b[i10] * dArr2[i10]);
                for (int i12 = i10; i12 < length2; i12++) {
                    dArrD[i12] = dArrD[i12] + (dArr2[i12] * d11);
                }
            }
            for (int length3 = i.this.f32625b.length - 1; length3 >= 0; length3--) {
                double d12 = dArrD[length3] / i.this.f32625b[length3];
                dArrD[length3] = d12;
                double[] dArr3 = i.this.f32624a[length3];
                dArr[length3] = d12;
                for (int i13 = 0; i13 < length3; i13++) {
                    dArrD[i13] = dArrD[i13] - (dArr3[i13] * d12);
                }
            }
            return new d(dArr, false);
        }
    }

    public i(j jVar) {
        this(jVar, 0.0d);
    }

    protected void d(double[][] dArr) {
        for (int i10 = 0; i10 < aj.d.E(dArr.length, dArr[0].length); i10++) {
            f(i10, dArr);
        }
    }

    public f e() {
        return new b();
    }

    protected void f(int i10, double[][] dArr) {
        double[] dArr2 = dArr[i10];
        double d10 = 0.0d;
        for (int i11 = i10; i11 < dArr2.length; i11++) {
            double d11 = dArr2[i11];
            d10 += d11 * d11;
        }
        double dU = dArr2[i10] > 0.0d ? -aj.d.U(d10) : aj.d.U(d10);
        this.f32625b[i10] = dU;
        if (dU != 0.0d) {
            dArr2[i10] = dArr2[i10] - dU;
            for (int i12 = i10 + 1; i12 < dArr.length; i12++) {
                double[] dArr3 = dArr[i12];
                double d12 = 0.0d;
                for (int i13 = i10; i13 < dArr3.length; i13++) {
                    d12 -= dArr3[i13] * dArr2[i13];
                }
                double d13 = d12 / (dArr2[i10] * dU);
                for (int i14 = i10; i14 < dArr3.length; i14++) {
                    dArr3[i14] = dArr3[i14] - (dArr2[i14] * d13);
                }
            }
        }
    }

    public i(j jVar, double d10) {
        this.f32630g = d10;
        int iB = jVar.b();
        int iA = jVar.a();
        this.f32624a = jVar.e().getData();
        this.f32625b = new double[aj.d.E(iB, iA)];
        this.f32626c = null;
        this.f32627d = null;
        this.f32628e = null;
        this.f32629f = null;
        d(this.f32624a);
    }
}
