package be;

/* JADX INFO: loaded from: classes3.dex */
class u2 implements qd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v2 f3987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dd.j f3989c;

    public u2(v2 v2Var, int i10, dd.j jVar) {
        this.f3987a = v2Var;
        this.f3988b = i10;
        this.f3989c = jVar;
    }

    @Override // qd.a
    public Object a() {
        return v2.k(this.f3987a, this.f3988b, this.f3989c);
    }
}
