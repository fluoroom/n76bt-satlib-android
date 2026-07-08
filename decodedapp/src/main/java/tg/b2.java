package tg;

import hd.i;

/* JADX INFO: loaded from: classes3.dex */
final class b2 implements i.b, i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2 f27801a = new b2();

    private b2() {
    }

    @Override // hd.i.b, hd.i
    public i.b a(i.c cVar) {
        return i.b.a.b(this, cVar);
    }

    @Override // hd.i
    public hd.i k(i.c cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // hd.i
    public hd.i l(hd.i iVar) {
        return i.b.a.d(this, iVar);
    }

    @Override // hd.i
    public Object r(Object obj, qd.p pVar) {
        return i.b.a.a(this, obj, pVar);
    }

    @Override // hd.i.b
    public i.c getKey() {
        return this;
    }
}
