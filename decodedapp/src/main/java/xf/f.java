package xf;

import eg.r0;
import he.f1;
import he.y0;
import he.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rd.c0;
import xf.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f32067d = {c0.f(new rd.w(f.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final he.e f32068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dg.i f32069c;

    public static final class a extends qf.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f32070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f32071b;

        a(ArrayList arrayList, f fVar) {
            this.f32070a = arrayList;
            this.f32071b = fVar;
        }

        @Override // qf.n
        public void a(he.b bVar) {
            rd.m.e(bVar, "fakeOverride");
            qf.o.K(bVar, null);
            this.f32070a.add(bVar);
        }

        @Override // qf.m
        protected void e(he.b bVar, he.b bVar2) {
            rd.m.e(bVar, "fromSuper");
            rd.m.e(bVar2, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f32071b.m() + ": " + bVar + " vs " + bVar2).toString());
        }
    }

    public f(dg.n nVar, he.e eVar) {
        rd.m.e(nVar, "storageManager");
        rd.m.e(eVar, "containingClass");
        this.f32068b = eVar;
        this.f32069c = nVar.d(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(f fVar) {
        List listJ = fVar.j();
        return ed.q.s0(listJ, fVar.k(listJ));
    }

    private final List k(List list) {
        Collection collectionK;
        ArrayList arrayList = new ArrayList(3);
        Collection collectionE = this.f32068b.k().e();
        rd.m.d(collectionE, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            ed.q.A(arrayList2, n.a.a(((r0) it.next()).p(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof he.b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            mf.f name = ((he.b) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            rd.m.d(key, "component1(...)");
            mf.f fVar = (mf.f) key;
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((he.b) obj3) instanceof z);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                qf.o oVar = qf.o.f25143f;
                if (zBooleanValue) {
                    collectionK = new ArrayList();
                    for (Object obj4 : list) {
                        if (rd.m.a(((z) obj4).getName(), fVar)) {
                            collectionK.add(obj4);
                        }
                    }
                } else {
                    collectionK = ed.q.k();
                }
                oVar.v(fVar, list3, collectionK, this.f32068b, new a(arrayList, this));
            }
        }
        return og.a.c(arrayList);
    }

    private final List l() {
        return (List) dg.m.a(this.f32069c, this, f32067d[0]);
    }

    @Override // xf.l, xf.k
    public Collection a(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        List listL = l();
        if (listL.isEmpty()) {
            return ed.q.k();
        }
        og.j jVar = new og.j();
        for (Object obj : listL) {
            if ((obj instanceof f1) && rd.m.a(((f1) obj).getName(), fVar)) {
                jVar.add(obj);
            }
        }
        return jVar;
    }

    @Override // xf.l, xf.k
    public Collection c(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        List listL = l();
        if (listL.isEmpty()) {
            return ed.q.k();
        }
        og.j jVar = new og.j();
        for (Object obj : listL) {
            if ((obj instanceof y0) && rd.m.a(((y0) obj).getName(), fVar)) {
                jVar.add(obj);
            }
        }
        return jVar;
    }

    @Override // xf.l, xf.n
    public Collection e(d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        return !dVar.a(d.f32051p.m()) ? ed.q.k() : l();
    }

    protected abstract List j();

    protected final he.e m() {
        return this.f32068b;
    }
}
