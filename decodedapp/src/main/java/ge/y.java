package ge;

import ed.k0;
import eg.c1;
import eg.v1;
import he.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {
    public static final v1 a(he.e eVar, he.e eVar2) {
        rd.m.e(eVar, "from");
        rd.m.e(eVar2, "to");
        eVar.v().size();
        eVar2.v().size();
        v1.a aVar = v1.f12211c;
        List listV = eVar.v();
        rd.m.d(listV, "getDeclaredTypeParameters(...)");
        ArrayList arrayList = new ArrayList(ed.q.v(listV, 10));
        Iterator it = listV.iterator();
        while (it.hasNext()) {
            arrayList.add(((l1) it.next()).k());
        }
        List listV2 = eVar2.v();
        rd.m.d(listV2, "getDeclaredTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(ed.q.v(listV2, 10));
        Iterator it2 = listV2.iterator();
        while (it2.hasNext()) {
            c1 c1VarS = ((l1) it2.next()).s();
            rd.m.d(c1VarS, "getDefaultType(...)");
            arrayList2.add(jg.d.d(c1VarS));
        }
        return v1.a.e(aVar, k0.r(ed.q.Q0(arrayList, arrayList2)), false, 2, null);
    }
}
