package df;

import df.d;

/* JADX INFO: loaded from: classes3.dex */
class a implements qd.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f10939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d.a f10940b;

    public a(d dVar, d.a aVar) {
        this.f10939a = dVar;
        this.f10940b = aVar;
    }

    @Override // qd.l
    public Object l(Object obj) {
        return Boolean.valueOf(d.i(this.f10939a, this.f10940b, obj));
    }
}
