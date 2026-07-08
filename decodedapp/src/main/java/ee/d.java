package ee;

import ee.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import mf.b;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f11783a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f11784b;

    static {
        Set set = l.f11806f;
        ArrayList arrayList = new ArrayList(ed.q.v(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(o.c((l) it.next()));
        }
        List listT0 = ed.q.t0(ed.q.t0(ed.q.t0(arrayList, o.a.f11875h.m()), o.a.f11879j.m()), o.a.f11897s.m());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = mf.b.f21989d;
        Iterator it2 = listT0.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(aVar.c((mf.c) it2.next()));
        }
        f11784b = linkedHashSet;
    }

    private d() {
    }

    public final Set a() {
        return f11784b;
    }

    public final Set b() {
        return f11784b;
    }
}
