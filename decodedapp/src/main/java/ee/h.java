package ee;

import dd.w;
import ed.k0;
import ee.o;
import eg.a2;
import eg.c1;
import eg.r0;
import eg.r1;
import eg.u0;
import fe.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sf.x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static final int a(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        ie.c cVarA = r0Var.getAnnotations().a(o.a.D);
        if (cVarA == null) {
            return 0;
        }
        sf.g gVar = (sf.g) k0.j(cVarA.a(), o.f11851q);
        rd.m.c(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((sf.n) gVar).b()).intValue();
    }

    public static final c1 b(i iVar, ie.h hVar, r0 r0Var, List list, List list2, List list3, r0 r0Var2, boolean z10) {
        rd.m.e(iVar, "builtIns");
        rd.m.e(hVar, "annotations");
        rd.m.e(list, "contextReceiverTypes");
        rd.m.e(list2, "parameterTypes");
        rd.m.e(r0Var2, "returnType");
        List listG = g(r0Var, list, list2, list3, r0Var2, iVar);
        he.e eVarF = f(iVar, list2.size() + list.size() + (r0Var == null ? 0 : 1), z10);
        if (r0Var != null) {
            hVar = u(hVar, iVar);
        }
        if (!list.isEmpty()) {
            hVar = t(hVar, iVar, list.size());
        }
        return u0.h(r1.b(hVar), eVarF, listG);
    }

    public static final mf.f d(r0 r0Var) {
        String str;
        rd.m.e(r0Var, "<this>");
        ie.c cVarA = r0Var.getAnnotations().a(o.a.E);
        if (cVarA == null) {
            return null;
        }
        Object objX0 = ed.q.x0(cVarA.a().values());
        x xVar = objX0 instanceof x ? (x) objX0 : null;
        if (xVar != null && (str = (String) xVar.b()) != null) {
            if (!mf.f.j(str)) {
                str = null;
            }
            if (str != null) {
                return mf.f.h(str);
            }
        }
        return null;
    }

    public static final List e(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        p(r0Var);
        int iA = a(r0Var);
        if (iA == 0) {
            return ed.q.k();
        }
        List listSubList = r0Var.L0().subList(0, iA);
        ArrayList arrayList = new ArrayList(ed.q.v(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((a2) it.next()).getType());
        }
        return arrayList;
    }

    public static final he.e f(i iVar, int i10, boolean z10) {
        rd.m.e(iVar, "builtIns");
        he.e eVarY = z10 ? iVar.Y(i10) : iVar.D(i10);
        rd.m.b(eVarY);
        return eVarY;
    }

    public static final List g(r0 r0Var, List list, List list2, List list3, r0 r0Var2, i iVar) {
        mf.f fVar;
        i iVar2;
        rd.m.e(list, "contextReceiverTypes");
        rd.m.e(list2, "parameterTypes");
        rd.m.e(r0Var2, "returnType");
        rd.m.e(iVar, "builtIns");
        int i10 = 0;
        ArrayList arrayList = new ArrayList(list2.size() + list.size() + (r0Var != null ? 1 : 0) + 1);
        ArrayList arrayList2 = new ArrayList(ed.q.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(jg.d.d((r0) it.next()));
        }
        arrayList.addAll(arrayList2);
        og.a.a(arrayList, r0Var != null ? jg.d.d(r0Var) : null);
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ed.q.u();
            }
            r0 r0VarC = (r0) obj;
            if (list3 == null || (fVar = (mf.f) list3.get(i10)) == null || fVar.i()) {
                fVar = null;
            }
            if (fVar != null) {
                mf.c cVar = o.a.E;
                mf.f fVar2 = o.f11847m;
                String strD = fVar.d();
                rd.m.d(strD, "asString(...)");
                Map mapF = k0.f(w.a(fVar2, new x(strD)));
                iVar2 = iVar;
                r0VarC = jg.d.C(r0VarC, ie.h.f16054l.a(ed.q.r0(r0VarC.getAnnotations(), new ie.l(iVar2, cVar, mapF, false, 8, null))));
            } else {
                iVar2 = iVar;
            }
            arrayList.add(jg.d.d(r0VarC));
            i10 = i11;
            iVar = iVar2;
        }
        arrayList.add(jg.d.d(r0Var2));
        return arrayList;
    }

    public static final fe.f h(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        he.h hVarQ = r0Var.N0().q();
        if (hVarQ != null) {
            return i(hVarQ);
        }
        return null;
    }

    public static final fe.f i(he.m mVar) {
        rd.m.e(mVar, "<this>");
        if ((mVar instanceof he.e) && i.C0(mVar)) {
            return j(uf.e.p(mVar));
        }
        return null;
    }

    private static final fe.f j(mf.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        fe.g gVarA = fe.g.f13009c.a();
        mf.c cVarD = dVar.m().d();
        String strD = dVar.j().d();
        rd.m.d(strD, "asString(...)");
        return gVarA.b(cVarD, strD);
    }

    public static final r0 k(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        p(r0Var);
        if (!s(r0Var)) {
            return null;
        }
        return ((a2) r0Var.L0().get(a(r0Var))).getType();
    }

    public static final r0 l(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        p(r0Var);
        r0 type = ((a2) ed.q.k0(r0Var.L0())).getType();
        rd.m.d(type, "getType(...)");
        return type;
    }

    public static final List m(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        p(r0Var);
        return r0Var.L0().subList(a(r0Var) + (n(r0Var) ? 1 : 0), r0.size() - 1);
    }

    public static final boolean n(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        return p(r0Var) && s(r0Var);
    }

    public static final boolean o(he.m mVar) {
        rd.m.e(mVar, "<this>");
        fe.f fVarI = i(mVar);
        return rd.m.a(fVarI, f.a.f13005f) || rd.m.a(fVarI, f.d.f13008f);
    }

    public static final boolean p(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        he.h hVarQ = r0Var.N0().q();
        return hVarQ != null && o(hVarQ);
    }

    public static final boolean q(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        return rd.m.a(h(r0Var), f.a.f13005f);
    }

    public static final boolean r(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        return rd.m.a(h(r0Var), f.d.f13008f);
    }

    private static final boolean s(r0 r0Var) {
        return r0Var.getAnnotations().a(o.a.C) != null;
    }

    public static final ie.h t(ie.h hVar, i iVar, int i10) {
        rd.m.e(hVar, "<this>");
        rd.m.e(iVar, "builtIns");
        mf.c cVar = o.a.D;
        return hVar.H(cVar) ? hVar : ie.h.f16054l.a(ed.q.r0(hVar, new ie.l(iVar, cVar, k0.f(w.a(o.f11851q, new sf.n(i10))), false, 8, null)));
    }

    public static final ie.h u(ie.h hVar, i iVar) {
        rd.m.e(hVar, "<this>");
        rd.m.e(iVar, "builtIns");
        mf.c cVar = o.a.C;
        return hVar.H(cVar) ? hVar : ie.h.f16054l.a(ed.q.r0(hVar, new ie.l(iVar, cVar, k0.i(), false, 8, null)));
    }
}
