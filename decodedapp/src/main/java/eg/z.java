package eg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z extends d2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d2 f12227c;

    public z(d2 d2Var) {
        rd.m.e(d2Var, "substitution");
        this.f12227c = d2Var;
    }

    @Override // eg.d2
    public boolean a() {
        return this.f12227c.a();
    }

    @Override // eg.d2
    public ie.h d(ie.h hVar) {
        rd.m.e(hVar, "annotations");
        return this.f12227c.d(hVar);
    }

    @Override // eg.d2
    public a2 e(r0 r0Var) {
        rd.m.e(r0Var, "key");
        return this.f12227c.e(r0Var);
    }

    @Override // eg.d2
    public boolean f() {
        return this.f12227c.f();
    }

    @Override // eg.d2
    public r0 g(r0 r0Var, m2 m2Var) {
        rd.m.e(r0Var, "topLevelType");
        rd.m.e(m2Var, "position");
        return this.f12227c.g(r0Var, m2Var);
    }
}
