package kj;

/* JADX INFO: loaded from: classes3.dex */
class v0 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f20234a;

    v0(z zVar) {
        this.f20234a = zVar;
    }

    @Override // kj.b2
    public /* synthetic */ b1 a(yj.b bVar) {
        return a2.a(this, bVar);
    }

    @Override // kj.b2
    public y1 b(yj.b bVar) {
        double dX = bVar.X(this.f20234a.p().c()) / 3.15576E9d;
        i1 i1VarN = this.f20234a.n(bVar);
        return new y1(bVar, new xi.b(xi.d.f32211g, xi.c.FRAME_TRANSFORM, i1VarN.b(), i1VarN.a(), 2.278624301214819E-10d * dX).l(), xi.f.f32232d);
    }

    @Override // kj.b2
    public /* synthetic */ t1 c(yj.b bVar) {
        return a2.b(this, bVar);
    }
}
