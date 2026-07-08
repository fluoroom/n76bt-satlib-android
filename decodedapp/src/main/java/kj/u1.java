package kj;

/* JADX INFO: loaded from: classes3.dex */
class u1 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zj.s f20230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f20231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient yj.z f20232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient yj.h0 f20233d;

    u1(zj.s sVar, z zVar, yj.c0 c0Var) {
        this.f20230a = sVar;
        this.f20231b = zVar;
        this.f20232c = sVar.j(c0Var);
        this.f20233d = sVar.q(c0Var);
    }

    private double d(yj.b bVar) {
        double[] dArrA = this.f20233d.a(bVar);
        double d10 = dArrA[0];
        z zVar = this.f20231b;
        if (zVar != null) {
            d10 += zVar.j(bVar)[0];
        }
        return (d10 * aj.d.n(this.f20232c.a(bVar))) + dArrA[2];
    }

    @Override // kj.b2
    public /* synthetic */ b1 a(yj.b bVar) {
        return a2.a(this, bVar);
    }

    @Override // kj.b2
    public y1 b(yj.b bVar) {
        return new y1(bVar, new xi.b(xi.f.f32237r, d(bVar), xi.c.FRAME_TRANSFORM));
    }

    @Override // kj.b2
    public /* synthetic */ t1 c(yj.b bVar) {
        return a2.b(this, bVar);
    }
}
