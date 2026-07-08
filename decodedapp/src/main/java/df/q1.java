package df;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11038a;

    public q1(Map map) {
        rd.m.e(map, "map");
        this.f11038a = map;
    }

    public final q1 a() {
        Map map = this.f11038a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ed.k0.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), h.c((h) entry.getValue(), null, null, false, true, 7, null));
        }
        return new q1(linkedHashMap);
    }

    public final Map b() {
        return this.f11038a;
    }
}
