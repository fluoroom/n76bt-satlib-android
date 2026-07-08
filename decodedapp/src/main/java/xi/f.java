package xi;

import aj.i;
import aj.j;
import aj.m;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class f implements Serializable, wi.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f32232d = new f(0.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f32233e = new f(1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f32234f = new f(-1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f32235g = new f(0.0d, 1.0d, 0.0d);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f32236h = new f(0.0d, -1.0d, 0.0d);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f32237r = new f(0.0d, 0.0d, 1.0d);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f32238s = new f(0.0d, 0.0d, -1.0d);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f32239t = new f(Double.NaN, Double.NaN, Double.NaN);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f f32240u = new f(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f f32241v = new f(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f32242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f32243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f32244c;

    public f(double d10, double d11, double d12) {
        this.f32242a = d10;
        this.f32243b = d11;
        this.f32244c = d12;
    }

    public static double b(f fVar, f fVar2) {
        double dI = fVar.I() * fVar2.I();
        if (dI == 0.0d) {
            throw new ui.g(ui.d.ZERO_NORM, new Object[0]);
        }
        double dE = fVar.e(fVar2);
        double d10 = 0.9999d * dI;
        if (dE >= (-d10) && dE <= d10) {
            return aj.d.e(dE / dI);
        }
        f fVarD = d(fVar, fVar2);
        return dE >= 0.0d ? aj.d.f(fVarD.I() / dI) : 3.141592653589793d - aj.d.f(fVarD.I() / dI);
    }

    public static f d(f fVar, f fVar2) {
        return fVar.c(fVar2);
    }

    public static double f(f fVar, f fVar2) {
        return fVar.e(fVar2);
    }

    @Override // wi.c
    public double I() {
        double d10 = this.f32242a;
        double d11 = this.f32243b;
        double d12 = (d10 * d10) + (d11 * d11);
        double d13 = this.f32244c;
        return aj.d.U(d12 + (d13 * d13));
    }

    public f a(f fVar) {
        return new f(this.f32242a + fVar.f32242a, this.f32243b + fVar.f32243b, this.f32244c + fVar.f32244c);
    }

    public f c(f fVar) {
        return new f(i.d(this.f32243b, fVar.f32244c, -this.f32244c, fVar.f32243b), i.d(this.f32244c, fVar.f32242a, -this.f32242a, fVar.f32244c), i.d(this.f32242a, fVar.f32243b, -this.f32243b, fVar.f32242a));
    }

    public double e(f fVar) {
        return i.e(this.f32242a, fVar.f32242a, this.f32243b, fVar.f32243b, this.f32244c, fVar.f32244c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if ((this.f32242a == fVar.f32242a && this.f32243b == fVar.f32243b && this.f32244c == fVar.f32244c) || (n() && fVar.n())) {
                return true;
            }
        }
        return false;
    }

    public double g() {
        return aj.d.j(this.f32243b, this.f32242a);
    }

    public double h() {
        return aj.d.f(this.f32244c / I());
    }

    public int hashCode() {
        if (n()) {
            return 642;
        }
        return ((j.d(this.f32242a) * 164) + (j.d(this.f32243b) * 3) + j.d(this.f32244c)) * 643;
    }

    public double i() {
        double d10 = this.f32242a;
        double d11 = this.f32243b;
        double d12 = (d10 * d10) + (d11 * d11);
        double d13 = this.f32244c;
        return d12 + (d13 * d13);
    }

    public double j() {
        return this.f32242a;
    }

    public double k() {
        return this.f32243b;
    }

    public double l() {
        return this.f32244c;
    }

    public boolean n() {
        return Double.isNaN(this.f32242a) || Double.isNaN(this.f32243b) || Double.isNaN(this.f32244c);
    }

    public f o() {
        return new f(-this.f32242a, -this.f32243b, -this.f32244c);
    }

    public /* synthetic */ wi.c p() {
        return wi.b.a(this);
    }

    @Override // wi.c
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public f U(double d10) {
        return new f(this.f32242a * d10, this.f32243b * d10, this.f32244c * d10);
    }

    public f r(f fVar) {
        return new f(this.f32242a - fVar.f32242a, this.f32243b - fVar.f32243b, this.f32244c - fVar.f32244c);
    }

    public double[] s() {
        return new double[]{this.f32242a, this.f32243b, this.f32244c};
    }

    public String toString() {
        return g.d().a(this);
    }

    public f(double[] dArr) {
        if (dArr.length == 3) {
            this.f32242a = dArr[0];
            this.f32243b = dArr[1];
            this.f32244c = dArr[2];
            return;
        }
        throw new ui.e(ui.d.DIMENSIONS_MISMATCH, Integer.valueOf(dArr.length), 3);
    }

    public f(double d10, double d11) {
        m mVarR = aj.d.R(d10);
        m mVarR2 = aj.d.R(d11);
        this.f32242a = mVarR.a() * mVarR2.a();
        this.f32243b = mVarR.b() * mVarR2.a();
        this.f32244c = mVarR2.b();
    }

    public f(double d10, f fVar) {
        this.f32242a = fVar.f32242a * d10;
        this.f32243b = fVar.f32243b * d10;
        this.f32244c = d10 * fVar.f32244c;
    }

    public f(double d10, f fVar, double d11, f fVar2) {
        this.f32242a = i.d(d10, fVar.f32242a, d11, fVar2.f32242a);
        this.f32243b = i.d(d10, fVar.f32243b, d11, fVar2.f32243b);
        this.f32244c = i.d(d10, fVar.f32244c, d11, fVar2.f32244c);
    }

    public f(double d10, f fVar, double d11, f fVar2, double d12, f fVar3) {
        this.f32242a = i.e(d10, fVar.f32242a, d11, fVar2.f32242a, d12, fVar3.f32242a);
        this.f32243b = i.e(d10, fVar.f32243b, d11, fVar2.f32243b, d12, fVar3.f32243b);
        this.f32244c = i.e(d10, fVar.f32244c, d11, fVar2.f32244c, d12, fVar3.f32244c);
    }

    public f(double d10, f fVar, double d11, f fVar2, double d12, f fVar3, double d13, f fVar4) {
        this.f32242a = i.f(d10, fVar.f32242a, d11, fVar2.f32242a, d12, fVar3.f32242a, d13, fVar4.f32242a);
        this.f32243b = i.f(d10, fVar.f32243b, d11, fVar2.f32243b, d12, fVar3.f32243b, d13, fVar4.f32243b);
        this.f32244c = i.f(d10, fVar.f32244c, d11, fVar2.f32244c, d12, fVar3.f32244c, d13, fVar4.f32244c);
    }
}
