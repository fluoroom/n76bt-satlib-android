package kj;

/* JADX INFO: loaded from: classes3.dex */
class v1 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f20235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient yj.b0 f20236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient yj.z f20237c;

    protected v1(z zVar, yj.b0 b0Var) {
        this.f20236b = b0Var;
        this.f20235a = zVar;
        this.f20237c = zVar.h().f(b0Var, zVar.p().l());
    }

    private xi.b e(yj.b bVar) {
        return new xi.b(xi.f.f32237r, this.f20237c.a(bVar), xi.c.FRAME_TRANSFORM);
    }

    private xi.f f(yj.b bVar) {
        z zVar = this.f20235a;
        return new xi.f((1.0d - ((zVar == null ? 0.0d : zVar.k(bVar)) / 86400.0d)) * 7.292115146706979E-5d, xi.f.f32237r);
    }

    @Override // kj.b2
    public b1 a(yj.b bVar) {
        return a1.f(bVar, e(bVar), f(bVar));
    }

    @Override // kj.b2
    public y1 b(yj.b bVar) {
        return new y1(bVar, e(bVar), f(bVar));
    }

    @Override // kj.b2
    public t1 c(yj.b bVar) {
        return s1.f(bVar, e(bVar));
    }

    public z d() {
        return this.f20235a;
    }
}
