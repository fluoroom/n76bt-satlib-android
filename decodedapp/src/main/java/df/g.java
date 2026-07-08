package df;

import eg.a2;
import eg.i2;
import eg.l2;
import eg.m2;
import eg.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ye.e f10971a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final eg.r0 f10972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10973b;

        public a(eg.r0 r0Var, int i10) {
            this.f10972a = r0Var;
            this.f10973b = i10;
        }

        public final int a() {
            return this.f10973b;
        }

        public final eg.r0 b() {
            return this.f10972a;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final eg.c1 f10974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f10976c;

        public b(eg.c1 c1Var, int i10, boolean z10) {
            this.f10974a = c1Var;
            this.f10975b = i10;
            this.f10976c = z10;
        }

        public final boolean a() {
            return this.f10976c;
        }

        public final int b() {
            return this.f10975b;
        }

        public final eg.c1 c() {
            return this.f10974a;
        }
    }

    public g(ye.e eVar) {
        rd.m.e(eVar, "javaResolverSettings");
        this.f10971a = eVar;
    }

    private final b b(eg.c1 c1Var, qd.l lVar, int i10, o1 o1Var, boolean z10, boolean z11) {
        u1 u1VarN0;
        Boolean bool;
        a aVar;
        a2 a2VarS;
        qd.l lVar2 = lVar;
        boolean zA = p1.a(o1Var);
        boolean z12 = (z11 && z10) ? false : true;
        eg.r0 r0Var = null;
        if (!zA && c1Var.L0().isEmpty()) {
            return new b(null, 1, false);
        }
        he.h hVarQ = c1Var.N0().q();
        if (hVarQ == null) {
            return new b(null, 1, false);
        }
        h hVar = (h) lVar2.l(Integer.valueOf(i10));
        he.h hVarF = r1.f(hVarQ, hVar, o1Var);
        Boolean boolH = r1.h(hVar, o1Var);
        if (hVarF == null || (u1VarN0 = hVarF.k()) == null) {
            u1VarN0 = c1Var.N0();
        }
        u1 u1Var = u1VarN0;
        int iA = i10 + 1;
        List listL0 = c1Var.L0();
        List parameters = u1Var.getParameters();
        rd.m.d(parameters, "getParameters(...)");
        Iterator it = listL0.iterator();
        Iterator it2 = parameters.iterator();
        ArrayList arrayList = new ArrayList(Math.min(ed.q.v(listL0, 10), ed.q.v(parameters, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            he.l1 l1Var = (he.l1) it2.next();
            a2 a2Var = (a2) next;
            if (z12) {
                bool = boolH;
                if (!a2Var.b()) {
                    aVar = d(a2Var.getType().Q0(), lVar2, iA, z11);
                } else if (((h) lVar2.l(Integer.valueOf(iA))).f() == k.f10997a) {
                    l2 l2VarQ0 = a2Var.getType().Q0();
                    aVar = new a(eg.u0.e(eg.l0.c(l2VarQ0).R0(false), eg.l0.d(l2VarQ0).R0(true)), 1);
                } else {
                    aVar = new a(null, 1);
                }
            } else {
                bool = boolH;
                aVar = new a(r0Var, 0);
            }
            iA += aVar.a();
            if (aVar.b() != null) {
                eg.r0 r0VarB = aVar.b();
                m2 m2VarA = a2Var.a();
                rd.m.d(m2VarA, "getProjectionKind(...)");
                a2VarS = jg.d.k(r0VarB, m2VarA, l1Var);
            } else if (hVarF == null || a2Var.b()) {
                a2VarS = hVarF != null ? i2.s(l1Var) : null;
            } else {
                eg.r0 type = a2Var.getType();
                rd.m.d(type, "getType(...)");
                m2 m2VarA2 = a2Var.a();
                rd.m.d(m2VarA2, "getProjectionKind(...)");
                a2VarS = jg.d.k(type, m2VarA2, l1Var);
            }
            arrayList.add(a2VarS);
            lVar2 = lVar;
            boolH = bool;
            r0Var = null;
        }
        Boolean bool2 = boolH;
        int i11 = iA - i10;
        if (hVarF == null && bool2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((a2) it3.next()) == null) {
                    }
                }
            }
            return new b(null, i11, false);
        }
        ie.h annotations = c1Var.getAnnotations();
        f fVar = r1.f11042b;
        if (hVarF == null) {
            fVar = null;
        }
        eg.q1 q1VarB = eg.r1.b(r1.e(ed.q.p(annotations, fVar, bool2 != null ? r1.g() : null)));
        List listL02 = c1Var.L0();
        Iterator it4 = arrayList.iterator();
        Iterator it5 = listL02.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(ed.q.v(arrayList, 10), ed.q.v(listL02, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            a2 a2Var2 = (a2) it5.next();
            a2 a2Var3 = (a2) next2;
            if (a2Var3 != null) {
                a2Var2 = a2Var3;
            }
            arrayList2.add(a2Var2);
        }
        eg.c1 c1VarK = eg.u0.k(q1VarB, u1Var, arrayList2, bool2 != null ? bool2.booleanValue() : c1Var.O0(), null, 16, null);
        if (hVar.d()) {
            c1VarK = e(c1VarK);
        }
        return new b(c1VarK, i11, bool2 != null && hVar.g());
    }

    static /* synthetic */ b c(g gVar, eg.c1 c1Var, qd.l lVar, int i10, o1 o1Var, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        return gVar.b(c1Var, lVar, i10, o1Var, z10, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final df.g.a d(eg.l2 r21, qd.l r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.g.d(eg.l2, qd.l, int, boolean):df.g$a");
    }

    private final eg.c1 e(eg.c1 c1Var) {
        return this.f10971a.a() ? eg.g1.h(c1Var, true) : new j(c1Var);
    }

    public final eg.r0 a(eg.r0 r0Var, qd.l lVar, boolean z10) {
        rd.m.e(r0Var, "<this>");
        rd.m.e(lVar, "qualifiers");
        return d(r0Var.Q0(), lVar, 0, z10).b();
    }
}
