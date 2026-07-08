package ke;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements he.t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19726b;

    public l(List list, String str) {
        rd.m.e(list, "providers");
        rd.m.e(str, "debugName");
        this.f19725a = list;
        this.f19726b = str;
        list.size();
        ed.q.M0(list).size();
    }

    @Override // he.o0
    public List a(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f19725a.iterator();
        while (it.hasNext()) {
            he.s0.a((he.o0) it.next(), cVar, arrayList);
        }
        return ed.q.H0(arrayList);
    }

    @Override // he.t0
    public void b(mf.c cVar, Collection collection) {
        rd.m.e(cVar, "fqName");
        rd.m.e(collection, "packageFragments");
        Iterator it = this.f19725a.iterator();
        while (it.hasNext()) {
            he.s0.a((he.o0) it.next(), cVar, collection);
        }
    }

    @Override // he.t0
    public boolean c(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        List list = this.f19725a;
        if (d.h0.a(list) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!he.s0.b((he.o0) it.next(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // he.o0
    public Collection q(mf.c cVar, qd.l lVar) {
        rd.m.e(cVar, "fqName");
        rd.m.e(lVar, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it = this.f19725a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((he.o0) it.next()).q(cVar, lVar));
        }
        return hashSet;
    }

    public String toString() {
        return this.f19726b;
    }
}
