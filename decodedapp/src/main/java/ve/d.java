package ve;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e0 e0Var) {
        super(e0Var);
        rd.m.e(e0Var, "javaTypeEnhancementState");
    }

    private final List B(sf.g gVar) {
        if (!(gVar instanceof sf.b)) {
            return gVar instanceof sf.k ? ed.q.e(((sf.k) gVar).c().f()) : ed.q.k();
        }
        Iterable iterable = (Iterable) ((sf.b) gVar).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ed.q.A(arrayList, B((sf.g) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ve.b
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Iterable m(ie.c cVar) {
        ie.h annotations;
        rd.m.e(cVar, "<this>");
        he.e eVarL = uf.e.l(cVar);
        return (eVarL == null || (annotations = eVarL.getAnnotations()) == null) ? ed.q.k() : annotations;
    }

    @Override // ve.b
    public boolean o() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ve.b
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable c(ie.c cVar, boolean z10) {
        rd.m.e(cVar, "<this>");
        Map mapA = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapA.entrySet()) {
            ed.q.A(arrayList, (!z10 || rd.m.a((mf.f) entry.getKey(), j0.f30601c)) ? B((sf.g) entry.getValue()) : ed.q.k());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ve.b
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public mf.c k(ie.c cVar) {
        rd.m.e(cVar, "<this>");
        return cVar.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ve.b
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Object l(ie.c cVar) {
        rd.m.e(cVar, "<this>");
        he.e eVarL = uf.e.l(cVar);
        rd.m.b(eVarL);
        return eVarL;
    }
}
