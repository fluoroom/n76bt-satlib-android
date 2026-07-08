package ed;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m0 extends l0 {
    public static Map b(Map map) {
        rd.m.e(map, "builder");
        return ((fd.d) map).l();
    }

    public static Map c() {
        return new fd.d();
    }

    public static Map d(int i10) {
        return new fd.d(i10);
    }

    public static int e(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public static Map f(dd.q qVar) {
        rd.m.e(qVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(qVar.c(), qVar.d());
        rd.m.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map g(Map map) {
        rd.m.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        rd.m.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static SortedMap h(Map map, Comparator comparator) {
        rd.m.e(map, "<this>");
        rd.m.e(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
