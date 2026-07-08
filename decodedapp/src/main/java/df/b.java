package df;

/* JADX INFO: loaded from: classes3.dex */
class b implements qd.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q1 f10943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h[] f10944b;

    public b(q1 q1Var, h[] hVarArr) {
        this.f10943a = q1Var;
        this.f10944b = hVarArr;
    }

    @Override // qd.l
    public Object l(Object obj) {
        return d.e(this.f10943a, this.f10944b, ((Number) obj).intValue());
    }
}
