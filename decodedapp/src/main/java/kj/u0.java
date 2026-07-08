package kj;

/* JADX INFO: loaded from: classes3.dex */
public class u0 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zj.s f20227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f20228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient yj.z f20229c;

    protected u0(zj.s sVar, z zVar, yj.c0 c0Var) {
        yj.b0 b0VarE = zVar == null ? c0Var.e() : c0Var.f(zVar.h(), zVar.v());
        this.f20227a = sVar;
        this.f20228b = zVar;
        this.f20229c = sVar.g(b0VarE, zVar, c0Var);
    }

    private xi.b d(yj.b bVar) {
        return new xi.b(xi.f.f32237r, this.f20229c.a(bVar), xi.c.FRAME_TRANSFORM);
    }

    private xi.f e(yj.b bVar) {
        z zVar = this.f20228b;
        return new xi.f((1.0d - ((zVar == null ? 0.0d : zVar.k(bVar)) / 86400.0d)) * 7.292115146706979E-5d, xi.f.f32237r);
    }

    @Override // kj.b2
    public b1 a(yj.b bVar) {
        return a1.f(bVar, d(bVar), e(bVar));
    }

    @Override // kj.b2
    public y1 b(yj.b bVar) {
        return new y1(bVar, d(bVar), e(bVar));
    }

    @Override // kj.b2
    public t1 c(yj.b bVar) {
        return s1.f(bVar, d(bVar));
    }
}
