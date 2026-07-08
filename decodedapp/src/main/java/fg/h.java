package fg;

import eg.r0;
import he.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a */
    private static final g0 f13060a = new g0("KotlinTypeRefiner");

    public static final g0 a() {
        return f13060a;
    }

    public static final List b(g gVar, Iterable iterable) {
        rd.m.e(gVar, "<this>");
        rd.m.e(iterable, "types");
        ArrayList arrayList = new ArrayList(ed.q.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.a((r0) it.next()));
        }
        return arrayList;
    }
}
