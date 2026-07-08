package hd;

import hd.i;
import qd.p;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i.c f15236a;

    public a(i.c cVar) {
        m.e(cVar, "key");
        this.f15236a = cVar;
    }

    @Override // hd.i.b, hd.i
    public /* bridge */ i.b a(i.c cVar) {
        return i.b.a.b(this, cVar);
    }

    @Override // hd.i.b
    public i.c getKey() {
        return this.f15236a;
    }

    @Override // hd.i
    public /* bridge */ i k(i.c cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // hd.i
    public /* bridge */ i l(i iVar) {
        return i.b.a.d(this, iVar);
    }

    @Override // hd.i
    public /* bridge */ Object r(Object obj, p pVar) {
        return i.b.a.a(this, obj, pVar);
    }
}
