package eg;

/* JADX INFO: loaded from: classes3.dex */
class f implements qd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t1 f12081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ig.r f12082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ig.j f12083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ig.j f12084d;

    public f(t1 t1Var, ig.r rVar, ig.j jVar, ig.j jVar2) {
        this.f12081a = t1Var;
        this.f12082b = rVar;
        this.f12083c = jVar;
        this.f12084d = jVar2;
    }

    @Override // qd.a
    public Object a() {
        return Boolean.valueOf(g.y(this.f12081a, this.f12082b, this.f12083c, this.f12084d));
    }
}
