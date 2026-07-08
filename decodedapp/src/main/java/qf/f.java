package qf;

/* JADX INFO: loaded from: classes3.dex */
class f implements qd.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final he.a f25126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final he.a f25127b;

    public f(he.a aVar, he.a aVar2) {
        this.f25126a = aVar;
        this.f25127b = aVar2;
    }

    @Override // qd.p
    public Object s(Object obj, Object obj2) {
        return Boolean.valueOf(g.i(this.f25126a, this.f25127b, (he.m) obj, (he.m) obj2));
    }
}
