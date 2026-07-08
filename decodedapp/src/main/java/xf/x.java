package xf;

import eg.r0;
import he.f1;
import he.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends xf.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f32097d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f32099c;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final k a(String str, Collection collection) {
            rd.m.e(str, "message");
            rd.m.e(collection, "types");
            ArrayList arrayList = new ArrayList(ed.q.v(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((r0) it.next()).p());
            }
            og.j jVarB = ng.a.b(arrayList);
            k kVarB = b.f32032d.b(str, jVarB);
            return jVarB.size() <= 1 ? kVarB : new x(str, kVarB, null);
        }

        private a() {
        }
    }

    public /* synthetic */ x(String str, k kVar, rd.h hVar) {
        this(str, kVar);
    }

    public static final k m(String str, Collection collection) {
        return f32097d.a(str, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.a n(he.a aVar) {
        rd.m.e(aVar, "$this$selectMostSpecificInEachOverridableGroup");
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.a o(f1 f1Var) {
        rd.m.e(f1Var, "$this$selectMostSpecificInEachOverridableGroup");
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.a p(y0 y0Var) {
        rd.m.e(y0Var, "$this$selectMostSpecificInEachOverridableGroup");
        return y0Var;
    }

    @Override // xf.a, xf.k
    public Collection a(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return qf.r.b(super.a(fVar, bVar), u.f32094a);
    }

    @Override // xf.a, xf.k
    public Collection c(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return qf.r.b(super.c(fVar, bVar), v.f32095a);
    }

    @Override // xf.a, xf.n
    public Collection e(d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        Collection collectionE = super.e(dVar, lVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionE) {
            if (((he.m) obj) instanceof he.a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        dd.q qVar = new dd.q(arrayList, arrayList2);
        List list = (List) qVar.a();
        List list2 = (List) qVar.b();
        rd.m.c(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return ed.q.s0(qf.r.b(list, w.f32096a), list2);
    }

    @Override // xf.a
    protected k i() {
        return this.f32099c;
    }

    private x(String str, k kVar) {
        this.f32098b = str;
        this.f32099c = kVar;
    }
}
