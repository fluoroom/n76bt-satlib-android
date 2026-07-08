package eg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i2 {

    /* JADX INFO: renamed from: a */
    public static final c1 f12111a = gg.l.d(gg.k.N, new String[0]);

    /* JADX INFO: renamed from: b */
    public static final c1 f12112b = gg.l.d(gg.k.G, new String[0]);

    /* JADX INFO: renamed from: c */
    public static final c1 f12113c = new a("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d */
    public static final c1 f12114d = new a("UNIT_EXPECTED_TYPE");

    public static class a extends a0 {

        /* JADX INFO: renamed from: b */
        private final String f12115b;

        public a(String str) {
            this.f12115b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void Z0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = 3
                goto L14
            L13:
                r5 = 2
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: eg.i2.a.Z0(int):void");
        }

        @Override // eg.l2
        /* JADX INFO: renamed from: U0 */
        public c1 R0(boolean z10) {
            throw new IllegalStateException(this.f12115b);
        }

        @Override // eg.l2
        /* JADX INFO: renamed from: V0 */
        public c1 T0(q1 q1Var) {
            if (q1Var == null) {
                Z0(0);
            }
            throw new IllegalStateException(this.f12115b);
        }

        @Override // eg.a0
        protected c1 W0() {
            throw new IllegalStateException(this.f12115b);
        }

        @Override // eg.a0
        public a0 Y0(c1 c1Var) {
            if (c1Var == null) {
                Z0(2);
            }
            throw new IllegalStateException(this.f12115b);
        }

        @Override // eg.a0
        /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a X0(fg.g gVar) {
            if (gVar == null) {
                Z0(3);
            }
            return this;
        }

        @Override // eg.c1
        public String toString() {
            String str = this.f12115b;
            if (str == null) {
                Z0(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.i2.a(int):void");
    }

    public static boolean b(r0 r0Var) {
        if (r0Var == null) {
            a(28);
        }
        if (r0Var.O0()) {
            return true;
        }
        return l0.b(r0Var) && b(l0.a(r0Var).W0());
    }

    public static boolean c(r0 r0Var, qd.l lVar) {
        if (lVar == null) {
            a(43);
        }
        return d(r0Var, lVar, null);
    }

    private static boolean d(r0 r0Var, qd.l lVar, og.k kVar) {
        if (lVar == null) {
            a(44);
        }
        if (r0Var == null) {
            return false;
        }
        l2 l2VarQ0 = r0Var.Q0();
        if (w(r0Var)) {
            return ((Boolean) lVar.l(l2VarQ0)).booleanValue();
        }
        if (kVar != null && kVar.contains(r0Var)) {
            return false;
        }
        if (((Boolean) lVar.l(l2VarQ0)).booleanValue()) {
            return true;
        }
        if (kVar == null) {
            kVar = og.k.c();
        }
        kVar.add(r0Var);
        i0 i0Var = l2VarQ0 instanceof i0 ? (i0) l2VarQ0 : null;
        if (i0Var != null && (d(i0Var.V0(), lVar, kVar) || d(i0Var.W0(), lVar, kVar))) {
            return true;
        }
        if ((l2VarQ0 instanceof y) && d(((y) l2VarQ0).Z0(), lVar, kVar)) {
            return true;
        }
        u1 u1VarN0 = r0Var.N0();
        if (u1VarN0 instanceof q0) {
            Iterator it = ((q0) u1VarN0).e().iterator();
            while (it.hasNext()) {
                if (d((r0) it.next(), lVar, kVar)) {
                    return true;
                }
            }
            return false;
        }
        for (a2 a2Var : r0Var.L0()) {
            if (!a2Var.b()) {
                if (d(a2Var.getType(), lVar, kVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static r0 e(r0 r0Var, r0 r0Var2, f2 f2Var) {
        if (r0Var == null) {
            a(20);
        }
        if (r0Var2 == null) {
            a(21);
        }
        if (f2Var == null) {
            a(22);
        }
        r0 r0VarP = f2Var.p(r0Var2, m2.f12140e);
        if (r0VarP != null) {
            return q(r0VarP, r0Var.O0());
        }
        return null;
    }

    public static he.e f(r0 r0Var) {
        if (r0Var == null) {
            a(30);
        }
        he.h hVarQ = r0Var.N0().q();
        if (hVarQ instanceof he.e) {
            return (he.e) hVarQ;
        }
        return null;
    }

    public static List g(List list) {
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new c2(((he.l1) it.next()).s()));
        }
        List listH0 = ed.q.H0(arrayList);
        if (listH0 == null) {
            a(17);
        }
        return listH0;
    }

    public static List h(r0 r0Var) {
        if (r0Var == null) {
            a(18);
        }
        f2 f2VarF = f2.f(r0Var);
        Collection collectionE = r0Var.N0().e();
        ArrayList arrayList = new ArrayList(collectionE.size());
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            r0 r0VarE = e(r0Var, (r0) it.next(), f2VarF);
            if (r0VarE != null) {
                arrayList.add(r0VarE);
            }
        }
        return arrayList;
    }

    public static he.l1 i(r0 r0Var) {
        if (r0Var == null) {
            a(63);
        }
        if (r0Var.N0().q() instanceof he.l1) {
            return (he.l1) r0Var.N0().q();
        }
        return null;
    }

    public static boolean j(r0 r0Var) {
        if (r0Var == null) {
            a(29);
        }
        if (r0Var.N0().q() instanceof he.e) {
            return false;
        }
        Iterator it = h(r0Var).iterator();
        while (it.hasNext()) {
            if (l((r0) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(r0 r0Var) {
        return r0Var != null && r0Var.N0() == f12111a.N0();
    }

    public static boolean l(r0 r0Var) {
        if (r0Var == null) {
            a(27);
        }
        if (r0Var.O0()) {
            return true;
        }
        if (l0.b(r0Var) && l(l0.a(r0Var).W0())) {
            return true;
        }
        if (g1.c(r0Var)) {
            return false;
        }
        if (m(r0Var)) {
            return j(r0Var);
        }
        u1 u1VarN0 = r0Var.N0();
        if (u1VarN0 instanceof q0) {
            Iterator it = u1VarN0.e().iterator();
            while (it.hasNext()) {
                if (l((r0) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(r0 r0Var) {
        if (r0Var == null) {
            a(60);
        }
        if (i(r0Var) != null) {
            return true;
        }
        r0Var.N0();
        return false;
    }

    public static r0 n(r0 r0Var) {
        if (r0Var == null) {
            a(2);
        }
        return p(r0Var, false);
    }

    public static r0 o(r0 r0Var) {
        if (r0Var == null) {
            a(1);
        }
        return p(r0Var, true);
    }

    public static r0 p(r0 r0Var, boolean z10) {
        if (r0Var == null) {
            a(3);
        }
        l2 l2VarR0 = r0Var.Q0().R0(z10);
        if (l2VarR0 == null) {
            a(4);
        }
        return l2VarR0;
    }

    public static r0 q(r0 r0Var, boolean z10) {
        if (r0Var == null) {
            a(8);
        }
        if (z10) {
            return o(r0Var);
        }
        if (r0Var == null) {
            a(9);
        }
        return r0Var;
    }

    public static c1 r(c1 c1Var, boolean z10) {
        if (c1Var == null) {
            a(5);
        }
        if (!z10) {
            if (c1Var == null) {
                a(7);
            }
            return c1Var;
        }
        c1 c1VarR0 = c1Var.R0(true);
        if (c1VarR0 == null) {
            a(6);
        }
        return c1VarR0;
    }

    public static a2 s(he.l1 l1Var) {
        if (l1Var == null) {
            a(45);
        }
        return new j1(l1Var);
    }

    public static a2 t(he.l1 l1Var, g0 g0Var) {
        if (l1Var == null) {
            a(46);
        }
        return g0Var.b() == h2.f12103a ? new c2(k1.b(l1Var)) : new j1(l1Var);
    }

    public static c1 u(u1 u1Var, xf.k kVar, qd.l lVar) {
        if (u1Var == null) {
            a(12);
        }
        if (kVar == null) {
            a(13);
        }
        if (lVar == null) {
            a(14);
        }
        c1 c1VarN = u0.n(q1.f12167b.k(), u1Var, g(u1Var.getParameters()), false, kVar, lVar);
        if (c1VarN == null) {
            a(15);
        }
        return c1VarN;
    }

    public static c1 v(he.h hVar, xf.k kVar, qd.l lVar) {
        if (!gg.l.m(hVar)) {
            return u(hVar.k(), kVar, lVar);
        }
        gg.i iVarD = gg.l.d(gg.k.M, hVar.toString());
        if (iVarD == null) {
            a(11);
        }
        return iVarD;
    }

    public static boolean w(r0 r0Var) {
        if (r0Var == null) {
            a(0);
        }
        return r0Var == f12113c || r0Var == f12114d;
    }
}
