package j$.time.format;

import j$.util.stream.x6;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f17565a;

    public void b(x6 x6Var) {
        ((EnumMap) this.f17565a).put(x6Var, 1);
    }

    public s(int i10, Map map) {
        switch (i10) {
            case 1:
                this.f17565a = map;
                break;
            default:
                this.f17565a = map;
                HashMap map2 = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    HashMap map3 = new HashMap();
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        String str = (String) entry2.getValue();
                        String str2 = (String) entry2.getValue();
                        Long l10 = (Long) entry2.getKey();
                        r rVar = c.f17527b;
                        map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l10));
                    }
                    ArrayList arrayList2 = new ArrayList(map3.values());
                    Collections.sort(arrayList2, c.f17527b);
                    map2.put((w) entry.getKey(), arrayList2);
                    arrayList.addAll(arrayList2);
                    map2.put(null, arrayList);
                }
                Collections.sort(arrayList, c.f17527b);
                break;
        }
    }

    public String a(long j10, w wVar) {
        Map map = (Map) this.f17565a.get(wVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j10));
        }
        return null;
    }
}
