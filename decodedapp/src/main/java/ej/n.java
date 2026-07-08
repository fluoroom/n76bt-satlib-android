package ej;

import kj.r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends e implements a {

    /* JADX INFO: renamed from: e */
    private final double f12709e;

    /* JADX INFO: renamed from: f */
    private final double f12710f;

    /* JADX INFO: renamed from: g */
    private final double f12711g;

    /* JADX INFO: renamed from: h */
    private final double f12712h;

    /* JADX INFO: renamed from: i */
    private final double f12713i;

    /* JADX INFO: renamed from: j */
    private final double f12714j;

    /* JADX INFO: renamed from: k */
    private final double f12715k;

    /* JADX INFO: renamed from: l */
    private double f12716l;

    /* JADX WARN: Illegal instructions before constructor call */
    public n(double d10, double d11, r0 r0Var) {
        double d12 = 1.0d - d11;
        super(r0Var, d10, d10, d10 * d12);
        this.f12711g = d11;
        double d13 = d10 * d10;
        this.f12709e = d13;
        double d14 = d11 * (2.0d - d11);
        this.f12713i = d14;
        this.f12712h = aj.d.U(d14);
        this.f12714j = d12;
        double d15 = d12 * d12;
        this.f12715k = d15;
        this.f12710f = d13 * d15;
        e(1.0E-12d);
    }

    @Override // ej.a
    public r0 a() {
        return d();
    }

    @Override // ej.a
    public xi.f b(f fVar) {
        aj.m mVarR = aj.d.R(fVar.d());
        aj.m mVarR2 = aj.d.R(fVar.c());
        double dA = fVar.a();
        double dC = c() / aj.d.U(1.0d - ((this.f12713i * mVarR2.b()) * mVarR2.b()));
        double dA2 = (dC + dA) * mVarR2.a();
        return new xi.f(mVarR.a() * dA2, mVarR.b() * dA2, ((this.f12715k * dC) + dA) * mVarR2.b());
    }

    public void e(double d10) {
        this.f12716l = d10;
    }
}
