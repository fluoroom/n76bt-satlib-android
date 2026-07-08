package eg;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final he.l1 f12120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dd.j f12121b;

    public j1(he.l1 l1Var) {
        rd.m.e(l1Var, "typeParameter");
        this.f12120a = l1Var;
        this.f12121b = dd.k.a(dd.n.f10910b, new i1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 c(j1 j1Var) {
        return k1.b(j1Var.f12120a);
    }

    private final r0 e() {
        return (r0) this.f12121b.getValue();
    }

    @Override // eg.a2
    public m2 a() {
        return m2.f12142g;
    }

    @Override // eg.a2
    public boolean b() {
        return true;
    }

    @Override // eg.a2
    public r0 getType() {
        return e();
    }

    @Override // eg.a2
    public a2 p(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        return this;
    }
}
