package ed;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n0 extends m0 {
    public static Map i() {
        e0 e0Var = e0.f11758a;
        rd.m.c(e0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return e0Var;
    }

    public static Object j(Map map, Object obj) {
        rd.m.e(map, "<this>");
        return l0.a(map, obj);
    }

    public static HashMap k(dd.q... qVarArr) {
        rd.m.e(qVarArr, "pairs");
        HashMap map = new HashMap(m0.e(qVarArr.length));
        q(map, qVarArr);
        return map;
    }

    public static Map l(dd.q... qVarArr) {
        rd.m.e(qVarArr, "pairs");
        return qVarArr.length > 0 ? u(qVarArr, new LinkedHashMap(m0.e(qVarArr.length))) : i();
    }

    public static Map m(dd.q... qVarArr) {
        rd.m.e(qVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(m0.e(qVarArr.length));
        q(linkedHashMap, qVarArr);
        return linkedHashMap;
    }

    public static final Map n(Map map) {
        rd.m.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : m0.g(map) : i();
    }

    public static Map o(Map map, Map map2) {
        rd.m.e(map, "<this>");
        rd.m.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void p(Map map, Iterable iterable) {
        rd.m.e(map, "<this>");
        rd.m.e(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            dd.q qVar = (dd.q) it.next();
            map.put(qVar.a(), qVar.b());
        }
    }

    public static final void q(Map map, dd.q[] qVarArr) {
        rd.m.e(map, "<this>");
        rd.m.e(qVarArr, "pairs");
        for (dd.q qVar : qVarArr) {
            map.put(qVar.a(), qVar.b());
        }
    }

    public static Map r(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return n(s(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return i();
        }
        if (size != 1) {
            return s(iterable, new LinkedHashMap(m0.e(collection.size())));
        }
        return m0.f((dd.q) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final Map s(Iterable iterable, Map map) {
        rd.m.e(iterable, "<this>");
        rd.m.e(map, "destination");
        p(map, iterable);
        return map;
    }

    public static Map t(Map map) {
        rd.m.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? v(map) : m0.g(map) : i();
    }

    public static final Map u(dd.q[] qVarArr, Map map) {
        rd.m.e(qVarArr, "<this>");
        rd.m.e(map, "destination");
        q(map, qVarArr);
        return map;
    }

    public static Map v(Map map) {
        rd.m.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
