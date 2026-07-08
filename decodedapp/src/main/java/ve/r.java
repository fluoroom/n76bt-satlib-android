package ve;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mf.b;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f30667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f30668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f30669c;

    static {
        r rVar = new r();
        f30667a = rVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f30668b = linkedHashMap;
        mf.i iVar = mf.i.f22029a;
        rVar.c(iVar.m(), rVar.a("java.util.ArrayList", "java.util.LinkedList"));
        rVar.c(iVar.o(), rVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        rVar.c(iVar.n(), rVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b.a aVar = mf.b.f21989d;
        rVar.c(aVar.c(new mf.c("java.util.function.Function")), rVar.a("java.util.function.UnaryOperator"));
        rVar.c(aVar.c(new mf.c("java.util.function.BiFunction")), rVar.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(dd.w.a(((mf.b) entry.getKey()).a(), ((mf.b) entry.getValue()).a()));
        }
        f30669c = ed.k0.r(arrayList);
    }

    private r() {
    }

    private final List a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(mf.b.f21989d.c(new mf.c(str)));
        }
        return arrayList;
    }

    private final void c(mf.b bVar, List list) {
        Map map = f30668b;
        for (Object obj : list) {
            map.put(obj, bVar);
        }
    }

    public final mf.c b(mf.c cVar) {
        rd.m.e(cVar, "classFqName");
        return (mf.c) f30669c.get(cVar);
    }
}
