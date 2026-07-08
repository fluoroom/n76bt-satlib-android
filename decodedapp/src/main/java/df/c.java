package df;

import df.d;

/* JADX INFO: loaded from: classes3.dex */
class c implements qd.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f10947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ig.r f10948b;

    public c(d dVar, ig.r rVar) {
        this.f10947a = dVar;
        this.f10948b = rVar;
    }

    @Override // qd.l
    public Object l(Object obj) {
        return d.I(this.f10947a, this.f10948b, (d.a) obj);
    }
}
