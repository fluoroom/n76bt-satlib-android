package be;

import be.w1;

/* JADX INFO: loaded from: classes3.dex */
class t1 implements qd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.a f3980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1 f3981b;

    public t1(w1.a aVar, w1 w1Var) {
        this.f3980a = aVar;
        this.f3981b = w1Var;
    }

    @Override // qd.a
    public Object a() {
        return w1.a.p(this.f3980a, this.f3981b);
    }
}
