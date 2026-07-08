package ie;

import d.h0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f16066a;

    public o(List list) {
        rd.m.e(list, "delegates");
        this.f16066a = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c d(mf.c cVar, h hVar) {
        rd.m.e(hVar, "it");
        return hVar.a(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qg.h e(h hVar) {
        rd.m.e(hVar, "it");
        return ed.q.S(hVar);
    }

    @Override // ie.h
    public boolean H(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        Iterator it = ed.q.S(this.f16066a).iterator();
        while (it.hasNext()) {
            if (((h) it.next()).H(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // ie.h
    public c a(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        return (c) qg.k.B(qg.k.I(ed.q.S(this.f16066a), new m(cVar)));
    }

    @Override // ie.h
    public boolean isEmpty() {
        List list = this.f16066a;
        if (h0.a(list) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((h) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return qg.k.C(ed.q.S(this.f16066a), n.f16065a).iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(h... hVarArr) {
        this(ed.j.k0(hVarArr));
        rd.m.e(hVarArr, "delegates");
    }
}
