package hd;

import hd.i;
import qd.l;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f15237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i.c f15238b;

    public b(i.c cVar, l lVar) {
        m.e(cVar, "baseKey");
        m.e(lVar, "safeCast");
        this.f15237a = lVar;
        this.f15238b = cVar instanceof b ? ((b) cVar).f15238b : cVar;
    }

    public final boolean a(i.c cVar) {
        m.e(cVar, "key");
        return cVar == this || this.f15238b == cVar;
    }

    public final i.b b(i.b bVar) {
        m.e(bVar, "element");
        return (i.b) this.f15237a.l(bVar);
    }
}
