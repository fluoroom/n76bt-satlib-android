package ze;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cf.g f33119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qd.l f33120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qd.l f33121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f33122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f33123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f33124f;

    public b(cf.g gVar, qd.l lVar) {
        rd.m.e(gVar, "jClass");
        rd.m.e(lVar, "memberFilter");
        this.f33119a = gVar;
        this.f33120b = lVar;
        a aVar = new a(this);
        this.f33121c = aVar;
        qg.h hVarX = qg.k.x(ed.q.S(gVar.getMethods()), aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : hVarX) {
            mf.f name = ((cf.r) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f33122d = linkedHashMap;
        qg.h hVarX2 = qg.k.x(ed.q.S(this.f33119a.getFields()), this.f33120b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : hVarX2) {
            linkedHashMap2.put(((cf.n) obj2).getName(), obj2);
        }
        this.f33123e = linkedHashMap2;
        Collection collectionL = this.f33119a.l();
        qd.l lVar2 = this.f33120b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionL) {
            if (((Boolean) lVar2.l(obj3)).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(xd.d.b(ed.k0.e(ed.q.v(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((cf.w) obj4).getName(), obj4);
        }
        this.f33124f = linkedHashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(b bVar, cf.r rVar) {
        rd.m.e(rVar, "m");
        return ((Boolean) bVar.f33120b.l(rVar)).booleanValue() && !cf.p.c(rVar);
    }

    @Override // ze.c
    public Set a() {
        qg.h hVarX = qg.k.x(ed.q.S(this.f33119a.getMethods()), this.f33121c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = hVarX.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((cf.r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // ze.c
    public cf.n b(mf.f fVar) {
        rd.m.e(fVar, "name");
        return (cf.n) this.f33123e.get(fVar);
    }

    @Override // ze.c
    public cf.w c(mf.f fVar) {
        rd.m.e(fVar, "name");
        return (cf.w) this.f33124f.get(fVar);
    }

    @Override // ze.c
    public Set d() {
        return this.f33124f.keySet();
    }

    @Override // ze.c
    public Set e() {
        qg.h hVarX = qg.k.x(ed.q.S(this.f33119a.getFields()), this.f33120b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = hVarX.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((cf.n) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // ze.c
    public Collection f(mf.f fVar) {
        rd.m.e(fVar, "name");
        List list = (List) this.f33122d.get(fVar);
        return list != null ? list : ed.q.k();
    }
}
