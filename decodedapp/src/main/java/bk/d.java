package bk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    private static h a(c cVar, i iVar) {
        h hVarF = cVar.f();
        if (g(hVarF, iVar)) {
            return hVarF;
        }
        throw cVar.e();
    }

    private static List b(List list, vi.c cVar) {
        if (cVar == null || cVar.equals(vi.c.f30863d)) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            arrayList.add(new e(cVar.e0() ? aj.d.J(eVar.c(), cVar.c0()) : vi.c.f30867h.equals(cVar) ? aj.d.U(eVar.c()) : aj.d.I(eVar.c(), cVar.doubleValue()), eVar.a(), cVar.f0(eVar.b())));
        }
        return arrayList;
    }

    private static List c(List list, int i10) {
        boolean z10 = true;
        if (i10 == 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (z10) {
                arrayList.add(new e(((double) i10) * eVar.c(), eVar.a(), eVar.b()));
                z10 = false;
            } else {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    private static List d(c cVar) {
        h hVarF = cVar.f();
        if (g(hVarF, i.IDENTIFIER)) {
            return Collections.singletonList(new e(1.0d, hVarF.c(), vi.c.f30863d));
        }
        cVar.h();
        a(cVar, i.OPEN);
        List listF = f(cVar);
        a(cVar, i.CLOSE);
        return listF;
    }

    public static List e(String str) {
        if (j.f4161h.g().equals(str)) {
            return null;
        }
        c cVar = new c(str);
        List listF = f(cVar);
        if (cVar.f() == null) {
            return listF;
        }
        throw cVar.e();
    }

    private static List f(c cVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(j(cVar));
        while (true) {
            h hVarF = cVar.f();
            if (hVarF != null) {
                if (!g(hVarF, i.MULTIPLICATION)) {
                    if (!g(hVarF, i.DIVISION)) {
                        cVar.h();
                        break;
                    }
                    arrayList.addAll(l(j(cVar)));
                } else {
                    arrayList.addAll(j(cVar));
                }
            } else {
                break;
            }
        }
        return arrayList;
    }

    private static boolean g(h hVar, i iVar) {
        return hVar != null && hVar.d() == iVar;
    }

    private static int h(c cVar) {
        if (g(cVar.f(), i.DIVISION)) {
            return a(cVar, i.INTEGER).b();
        }
        cVar.h();
        return 1;
    }

    private static vi.c i(c cVar) {
        h hVarF = cVar.f();
        if (g(hVarF, i.FRACTION)) {
            return hVarF.a();
        }
        i iVar = i.INTEGER;
        if (g(hVarF, iVar)) {
            return new vi.c(hVarF.b());
        }
        cVar.h();
        a(cVar, i.OPEN);
        int iB = a(cVar, iVar).b();
        int iH = h(cVar);
        a(cVar, i.CLOSE);
        return new vi.c(iB, iH);
    }

    private static List j(c cVar) {
        h hVarF = cVar.f();
        if (hVarF == null) {
            throw cVar.e();
        }
        if (!g(hVarF, i.INTEGER)) {
            cVar.h();
            return m(cVar);
        }
        int iB = hVarF.b();
        h hVarF2 = cVar.f();
        cVar.h();
        return (hVarF2 == null || g(hVarF2, i.MULTIPLICATION) || g(hVarF2, i.DIVISION)) ? Collections.singletonList(new e(iB, "1", vi.c.f30863d)) : c(m(cVar), iB);
    }

    private static vi.c k(c cVar) {
        if (g(cVar.f(), i.POWER)) {
            return i(cVar);
        }
        cVar.h();
        return null;
    }

    private static List l(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            arrayList.add(new e(1.0d / eVar.c(), eVar.a(), eVar.b().g0()));
        }
        return arrayList;
    }

    private static List m(c cVar) {
        if (cVar.f().d() == i.SQUARE_ROOT) {
            return b(d(cVar), vi.c.f30867h);
        }
        cVar.h();
        return b(d(cVar), k(cVar));
    }
}
