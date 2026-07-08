package ve;

import ee.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a */
    public static final j f30593a = new j();

    /* JADX INFO: renamed from: b */
    private static final Map f30594b;

    /* JADX INFO: renamed from: c */
    private static final Map f30595c;

    /* JADX INFO: renamed from: d */
    private static final Set f30596d;

    /* JADX INFO: renamed from: e */
    private static final Set f30597e;

    /* JADX INFO: renamed from: f */
    private static final Set f30598f;

    static {
        mf.d dVar = o.a.f11897s;
        dd.q qVarA = dd.w.a(k.d(dVar, "name"), ee.o.f11847m);
        dd.q qVarA2 = dd.w.a(k.d(dVar, "ordinal"), mf.f.h("ordinal"));
        dd.q qVarA3 = dd.w.a(k.c(o.a.X, "size"), mf.f.h("size"));
        mf.c cVar = o.a.f11864b0;
        Map mapL = ed.k0.l(qVarA, qVarA2, qVarA3, dd.w.a(k.c(cVar, "size"), mf.f.h("size")), dd.w.a(k.d(o.a.f11873g, Name.LENGTH), mf.f.h(Name.LENGTH)), dd.w.a(k.c(cVar, "keys"), mf.f.h("keySet")), dd.w.a(k.c(cVar, "values"), mf.f.h("values")), dd.w.a(k.c(cVar, "entries"), mf.f.h("entrySet")), dd.w.a(k.c(o.a.P0, "size"), mf.f.h(Name.LENGTH)), dd.w.a(k.c(o.a.Q0, "size"), mf.f.h(Name.LENGTH)), dd.w.a(k.c(o.a.R0, "size"), mf.f.h(Name.LENGTH)));
        f30594b = mapL;
        Set<Map.Entry> setEntrySet = mapL.entrySet();
        ArrayList<dd.q> arrayList = new ArrayList(ed.q.v(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new dd.q(((mf.c) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (dd.q qVar : arrayList) {
            mf.f fVar = (mf.f) qVar.d();
            Object arrayList2 = linkedHashMap.get(fVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(fVar, arrayList2);
            }
            ((List) arrayList2).add((mf.f) qVar.c());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ed.k0.e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), ed.q.U((Iterable) entry2.getValue()));
        }
        f30595c = linkedHashMap2;
        Map map = f30594b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            mf.b bVarN = ge.c.f13796a.n(((mf.c) entry3.getKey()).d().i());
            rd.m.b(bVarN);
            linkedHashSet.add(bVarN.a().b((mf.f) entry3.getValue()));
        }
        f30596d = linkedHashSet;
        Set setKeySet = f30594b.keySet();
        f30597e = setKeySet;
        ArrayList arrayList3 = new ArrayList(ed.q.v(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList3.add(((mf.c) it.next()).f());
        }
        f30598f = ed.q.M0(arrayList3);
    }

    private j() {
    }

    public final Map a() {
        return f30594b;
    }

    public final List b(mf.f fVar) {
        rd.m.e(fVar, "name1");
        List list = (List) f30595c.get(fVar);
        return list == null ? ed.q.k() : list;
    }

    public final Set c() {
        return f30597e;
    }

    public final Set d() {
        return f30598f;
    }
}
