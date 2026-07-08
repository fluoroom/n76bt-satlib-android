package ze;

/* JADX INFO: loaded from: classes3.dex */
class a implements qd.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f33117a;

    public a(b bVar) {
        this.f33117a = bVar;
    }

    @Override // qd.l
    public Object l(Object obj) {
        return Boolean.valueOf(b.h(this.f33117a, (cf.r) obj));
    }
}
