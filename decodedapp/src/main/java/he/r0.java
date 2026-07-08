package he;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f15304a;

    public r0(Collection collection) {
        rd.m.e(collection, "packageFragments");
        this.f15304a = collection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf.c f(n0 n0Var) {
        rd.m.e(n0Var, "it");
        return n0Var.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(mf.c cVar, mf.c cVar2) {
        rd.m.e(cVar2, "it");
        return !cVar2.c() && rd.m.a(cVar2.d(), cVar);
    }

    @Override // he.o0
    public List a(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        Collection collection = this.f15304a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (rd.m.a(((n0) obj).d(), cVar)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // he.t0
    public void b(mf.c cVar, Collection collection) {
        rd.m.e(cVar, "fqName");
        rd.m.e(collection, "packageFragments");
        for (Object obj : this.f15304a) {
            if (rd.m.a(((n0) obj).d(), cVar)) {
                collection.add(obj);
            }
        }
    }

    @Override // he.t0
    public boolean c(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        Collection collection = this.f15304a;
        if (d.h0.a(collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (rd.m.a(((n0) it.next()).d(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // he.o0
    public Collection q(mf.c cVar, qd.l lVar) {
        rd.m.e(cVar, "fqName");
        rd.m.e(lVar, "nameFilter");
        return qg.k.O(qg.k.x(qg.k.H(ed.q.S(this.f15304a), p0.f15301a), new q0(cVar)));
    }
}
