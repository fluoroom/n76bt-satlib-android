package ed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 extends o0 {
    public static List w(Map map) {
        rd.m.e(map, "<this>");
        if (map.size() == 0) {
            return s.k();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return s.k();
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return r.e(new dd.q(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new dd.q(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new dd.q(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
