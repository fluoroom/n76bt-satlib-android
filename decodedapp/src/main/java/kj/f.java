package kj;

/* JADX INFO: loaded from: classes3.dex */
class f implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient yj.h0 f20072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f20073b;

    f(z zVar) {
        this.f20072a = zVar.h().v(zVar.p());
        this.f20073b = zVar;
    }

    @Override // kj.b2
    public /* synthetic */ b1 a(yj.b bVar) {
        return a2.a(this, bVar);
    }

    @Override // kj.b2
    public y1 b(yj.b bVar) {
        double[] dArrA = this.f20072a.a(bVar);
        double[] dArrM = this.f20073b.m(bVar);
        double d10 = dArrA[0] + dArrM[0];
        double d11 = dArrA[1] + dArrM[1];
        double d12 = dArrA[2] - ((d10 * d11) / 2.0d);
        double d13 = (d10 * d10) + (d11 * d11);
        double dU = aj.d.U(1.0d - d13) + 1.0d;
        double dU2 = aj.d.U(d13);
        aj.m mVarR = aj.d.R((d12 + aj.d.j(d11, d10)) * 0.5d);
        double d14 = d10 + dU2;
        double dA = mVarR.a() * d14;
        double dB = d14 * mVarR.b();
        double dA2 = mVarR.a() * d11;
        double dB2 = d11 * mVarR.b();
        return new y1(bVar, new xi.b((dA + dB2) * dU, (-dU2) * (dA2 + dB), dU2 * (dA - dB2), dU * (dA2 - dB), true), xi.f.f32232d);
    }

    @Override // kj.b2
    public /* synthetic */ t1 c(yj.b bVar) {
        return a2.b(this, bVar);
    }

    public z d() {
        return this.f20073b;
    }
}
