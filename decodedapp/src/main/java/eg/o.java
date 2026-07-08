package eg;

import eg.p;

/* JADX INFO: loaded from: classes3.dex */
class o implements qd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p.a f12152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f12153b;

    public o(p.a aVar, p pVar) {
        this.f12152a = aVar;
        this.f12153b = pVar;
    }

    @Override // qd.a
    public Object a() {
        return p.a.d(this.f12152a, this.f12153b);
    }
}
