package ag;

/* JADX INFO: loaded from: classes3.dex */
class f0 implements qd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0 f484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gf.o f486c;

    public f0(k0 k0Var, boolean z10, gf.o oVar) {
        this.f484a = k0Var;
        this.f485b = z10;
        this.f486c = oVar;
    }

    @Override // qd.a
    public Object a() {
        return k0.n(this.f484a, this.f485b, this.f486c);
    }
}
