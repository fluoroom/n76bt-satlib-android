package rj;

import aj.m;
import kj.r0;
import yj.j;

/* JADX INFO: loaded from: classes3.dex */
abstract class c extends f {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    protected double f26159e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    protected double f26160f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    protected double f26161g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    protected double f26162h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    protected double f26163i0;

    protected c(e eVar, dj.c cVar, double d10, r0 r0Var) {
        super(eVar, cVar, d10, r0Var);
    }

    @Override // rj.f
    protected void R() {
        V();
    }

    @Override // rj.f
    protected void S(double d10) {
        this.f26159e0 = this.f26197w.G() + (this.K * d10);
        double d11 = d10 * d10;
        this.f26199y = this.f26197w.H() + (this.L * d10) + (this.f26193a0 * d11);
        this.f26160f0 = this.F;
        this.f26161g0 = this.f26197w.B() + (this.J * d10);
        U(d10);
        double d12 = 1.0d - (this.X * d10);
        this.f26200z = aj.d.I(0.07436691613317341d / this.f26160f0, 0.6666666666666666d) * d12 * d12;
        double d13 = this.f26162h0;
        e eVar = this.f26197w;
        this.f26162h0 = d13 - ((eVar.m(eVar.getDate().a(d10)) * this.Z) * d10);
        this.f26161g0 += this.F * this.f26194b0 * d11;
        T(d10);
        this.D = this.f26161g0 + this.f26159e0 + this.f26199y;
        m mVarR = aj.d.R(this.f26163i0);
        this.G = mVarR.a();
        this.I = mVarR.b();
        this.A = this.f26162h0;
        this.B = this.f26163i0;
        this.C = this.f26159e0;
    }

    protected abstract void T(double d10);

    protected abstract void U(double d10);

    protected abstract void V();

    protected double W(yj.b bVar) {
        double dF = bVar.Y(this.f26198x).f(j.f32681c) / 86400.0d;
        double d10 = (0.5d + dF) % 1.0d;
        double d11 = ((dF - d10) - 2451545.0d) / 36525.0d;
        double d12 = (((d11 * (((0.093104d - (6.2E-6d * d11)) * d11) + 8640184.812866d)) + 24110.54841d) + (d10 * 86636.555366976d)) % 86400.0d;
        if (d12 < 0.0d) {
            d12 += 86400.0d;
        }
        return (d12 * 6.283185307179586d) / 86400.0d;
    }
}
