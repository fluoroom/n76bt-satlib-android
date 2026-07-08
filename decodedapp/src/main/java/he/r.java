package he;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1 f15303a;

    public r(w1 w1Var) {
        rd.m.e(w1Var, "delegate");
        this.f15303a = w1Var;
    }

    @Override // he.u
    public w1 b() {
        return this.f15303a;
    }

    @Override // he.u
    public String c() {
        return b().b();
    }

    @Override // he.u
    public u f() {
        u uVarJ = t.j(b().d());
        rd.m.d(uVarJ, "toDescriptorVisibility(...)");
        return uVarJ;
    }
}
