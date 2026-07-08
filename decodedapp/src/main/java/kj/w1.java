package kj;

/* JADX INFO: loaded from: classes3.dex */
class w1 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zj.s f20255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f20256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient yj.z f20257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient yj.h0 f20258d;

    w1(zj.s sVar, z zVar, yj.c0 c0Var) {
        this.f20255a = sVar;
        this.f20256b = zVar;
        this.f20257c = sVar.j(c0Var);
        this.f20258d = sVar.q(c0Var);
    }

    @Override // kj.b2
    public /* synthetic */ b1 a(yj.b bVar) {
        return a2.a(this, bVar);
    }

    @Override // kj.b2
    public y1 b(yj.b bVar) {
        double[] dArrA = this.f20258d.a(bVar);
        double dA = this.f20257c.a(bVar);
        double d10 = dArrA[0];
        double d11 = dArrA[1];
        z zVar = this.f20256b;
        if (zVar != null) {
            double[] dArrJ = zVar.j(bVar);
            d10 += dArrJ[0];
            d11 += dArrJ[1];
        }
        return new y1(bVar, new xi.b(xi.d.f32218w, xi.c.FRAME_TRANSFORM, dA, -d10, -(d11 + dA)));
    }

    @Override // kj.b2
    public /* synthetic */ t1 c(yj.b bVar) {
        return a2.b(this, bVar);
    }

    public z d() {
        return this.f20256b;
    }
}
