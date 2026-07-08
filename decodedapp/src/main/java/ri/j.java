package ri;

import aj.m;

/* JADX INFO: loaded from: classes3.dex */
public class j extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f26107d = new j(3.141592653589793d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f26108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f26109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f26110c;

    public j(double d10, double d11, double d12) {
        this.f26108a = d10;
        this.f26109b = d11;
        this.f26110c = d12;
    }

    @Override // pi.b
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public j l() {
        double dX = aj.d.X(this.f26108a);
        double d10 = 1.0d - (dX * dX);
        return c0(dX, d10, (-2.0d) * d10 * dX);
    }

    @Override // ri.f
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public j A(double d10) {
        return new j(d10, this.f26109b, this.f26110c);
    }

    @Override // pi.b
    public aj.f S() {
        m mVarR = aj.d.R(this.f26108a);
        return new aj.f(c0(mVarR.b(), mVarR.a(), -mVarR.b()), c0(mVarR.a(), -mVarR.b(), -mVarR.a()));
    }

    @Override // pi.b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public j R() {
        return Double.doubleToLongBits(this.f26108a) < 0 ? negate() : this;
    }

    @Override // pi.e
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public j H(j jVar) {
        return new j(this.f26108a + jVar.f26108a, this.f26109b + jVar.f26109b, this.f26110c + jVar.f26110c);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public j a() {
        double d10 = this.f26108a;
        double d11 = 1.0d / ((d10 * d10) + 1.0d);
        double dU = aj.d.U(d11);
        return c0(aj.d.g(this.f26108a), dU, (-this.f26108a) * dU * d11);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public j i() {
        double d10 = this.f26108a;
        double d11 = 1.0d / ((d10 * d10) + 1.0d);
        return c0(aj.d.h(d10), d11, this.f26108a * (-2.0d) * d11 * d11);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public j f() {
        double dK = aj.d.k(this.f26108a);
        double d10 = dK * dK;
        return c0(dK, 1.0d / (3.0d * d10), (-1.0d) / ((d10 * 4.5d) * this.f26108a));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public int compareTo(j jVar) {
        int iCompare = Double.compare(this.f26108a, jVar.s());
        return (iCompare == 0 && (iCompare = Double.compare(this.f26109b, jVar.h0())) == 0) ? Double.compare(this.f26110c, jVar.k0()) : iCompare;
    }

    public j c0(double... dArr) {
        aj.j.a(dArr.length, i0() + 1);
        double d10 = dArr[0];
        double d11 = dArr[1];
        double d12 = this.f26109b;
        return new j(d10, d11 * d12, aj.i.d(d11, this.f26110c, dArr[2], d12 * d12));
    }

    @Override // pi.b
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public j x(double d10) {
        double d11 = 1.0d / d10;
        return new j(this.f26108a * d11, this.f26109b * d11, this.f26110c * d11);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public j T(j jVar) {
        double d10 = jVar.f26108a;
        double d11 = 1.0d / d10;
        double d12 = d11 * d11;
        double d13 = d11 * d12;
        double d14 = this.f26108a;
        double d15 = d14 * d11;
        double d16 = aj.i.d(this.f26109b, d10, -d14, jVar.f26109b) * d12;
        double d17 = this.f26110c;
        double d18 = jVar.f26108a;
        double d19 = this.f26109b * (-2.0d);
        double d20 = jVar.f26109b;
        double d21 = this.f26108a;
        return new j(d15, d16, aj.i.f(d17, d18 * d18, d19, d18 * d20, d21 * 2.0d, d20 * d20, -d21, d18 * jVar.f26110c) * d13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f26108a == jVar.f26108a && this.f26109b == jVar.f26109b && this.f26110c == jVar.f26110c) {
                return true;
            }
        }
        return false;
    }

    public double f0(int i10) {
        if (i10 == 0) {
            return this.f26108a;
        }
        if (i10 == 1) {
            return this.f26109b;
        }
        if (i10 == 2) {
            return this.f26110c;
        }
        throw new ui.e(ui.d.DERIVATION_ORDER_NOT_ALLOWED, Integer.valueOf(i10));
    }

    @Override // pi.e
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public k q() {
        return k.c();
    }

    @Override // ri.f
    public double getValue() {
        return this.f26108a;
    }

    public double h0() {
        return this.f26109b;
    }

    public int hashCode() {
        return ((317 - (o4.c.a(this.f26108a) * 41)) + (o4.c.a(this.f26109b) * 57)) - (o4.c.a(this.f26110c) * 103);
    }

    public int i0() {
        return 2;
    }

    @Override // pi.b
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public j D() {
        return f26107d;
    }

    public double k0() {
        return this.f26110c;
    }

    @Override // pi.b
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public j C(double d10, j jVar, double d11, j jVar2) {
        return new j(aj.i.d(d10, jVar.f26108a, d11, jVar2.f26108a), aj.i.d(d10, jVar.f26109b, d11, jVar2.f26109b), aj.i.d(d10, jVar.f26110c, d11, jVar2.f26110c));
    }

    @Override // pi.b
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public j v(double d10, j jVar, double d11, j jVar2, double d12, j jVar3) {
        return new j(aj.i.e(d10, jVar.f26108a, d11, jVar2.f26108a, d12, jVar3.f26108a), aj.i.e(d10, jVar.f26109b, d11, jVar2.f26109b, d12, jVar3.f26109b), aj.i.e(d10, jVar.f26110c, d11, jVar2.f26110c, d12, jVar3.f26110c));
    }

    @Override // pi.b
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public j r(j jVar, j jVar2, j jVar3, j jVar4) {
        return new j(aj.i.d(jVar.f26108a, jVar2.f26108a, jVar3.f26108a, jVar4.f26108a), aj.i.f(jVar.f26108a, jVar2.f26109b, jVar.f26109b, jVar2.f26108a, jVar3.f26108a, jVar4.f26109b, jVar3.f26109b, jVar4.f26108a), aj.i.g(new double[]{jVar.f26108a, jVar.f26109b * 2.0d, jVar.f26110c, jVar3.f26108a, jVar3.f26109b * 2.0d, jVar3.f26110c}, new double[]{jVar2.f26110c, jVar2.f26109b, jVar2.f26108a, jVar4.f26110c, jVar4.f26109b, jVar4.f26108a}));
    }

    @Override // pi.b
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public j K(double d10) {
        return new j(this.f26108a * d10, this.f26109b * d10, this.f26110c * d10);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public j L(int i10) {
        double d10 = i10;
        return new j(this.f26108a * d10, this.f26109b * d10, this.f26110c * d10);
    }

    @Override // pi.e
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public j N(j jVar) {
        double d10 = this.f26108a;
        double d11 = jVar.f26108a;
        return new j(d10 * d11, aj.i.d(this.f26109b, d11, d10, jVar.f26109b), aj.i.e(this.f26110c, jVar.f26108a, this.f26109b * 2.0d, jVar.f26109b, this.f26108a, jVar.f26110c));
    }

    @Override // pi.e
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public j negate() {
        return new j(-this.f26108a, -this.f26109b, -this.f26110c);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public j w(double d10) {
        return new j(d10, 0.0d, 0.0d);
    }

    @Override // pi.e
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public j k() {
        double d10 = this.f26108a;
        double d11 = 1.0d / d10;
        double d12 = d11 * d11;
        double d13 = d11 * d12;
        double d14 = this.f26109b;
        return new j(d11, d12 * (-d14), aj.i.d(2.0d * d14, d14, -d10, this.f26110c) * d13);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public j d(int i10) {
        if (i10 == 2) {
            return h();
        }
        if (i10 == 3) {
            return f();
        }
        double d10 = i10;
        double dI = aj.d.I(this.f26108a, 1.0d / d10);
        double dJ = d10 * aj.d.J(dI, i10 - 1);
        return c0(dI, 1.0d / dJ, ((double) (1 - i10)) / ((dJ * dJ) * dI));
    }

    @Override // pi.b
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public j g() {
        m mVarR = aj.d.R(this.f26108a);
        return c0(mVarR.b(), mVarR.a(), -mVarR.b());
    }

    @Override // pi.b
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public j e() {
        double dP = aj.d.p(this.f26108a);
        double dT = aj.d.T(this.f26108a);
        return c0(dT, dP, dT);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public j h() {
        double dU = aj.d.U(this.f26108a);
        double d10 = dU * 2.0d;
        double d11 = this.f26109b / d10;
        return new j(dU, d11, (this.f26110c - ((2.0d * d11) * d11)) / d10);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public j n() {
        double d10 = this.f26108a;
        double d11 = this.f26109b;
        return new j(d10 * d10, d10 * 2.0d * d11, 2.0d * ((d10 * this.f26110c) + (d11 * d11)));
    }

    @Override // pi.b
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public j O(j jVar) {
        return new j(this.f26108a - jVar.f26108a, this.f26109b - jVar.f26109b, this.f26110c - jVar.f26110c);
    }
}
