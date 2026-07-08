package he;

import he.v1;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import lg.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a */
    public static final u f15305a;

    /* JADX INFO: renamed from: b */
    public static final u f15306b;

    /* JADX INFO: renamed from: c */
    public static final u f15307c;

    /* JADX INFO: renamed from: d */
    public static final u f15308d;

    /* JADX INFO: renamed from: e */
    public static final u f15309e;

    /* JADX INFO: renamed from: f */
    public static final u f15310f;

    /* JADX INFO: renamed from: g */
    public static final u f15311g;

    /* JADX INFO: renamed from: h */
    public static final u f15312h;

    /* JADX INFO: renamed from: i */
    public static final u f15313i;

    /* JADX INFO: renamed from: j */
    public static final Set f15314j;

    /* JADX INFO: renamed from: k */
    private static final Map f15315k;

    /* JADX INFO: renamed from: l */
    public static final u f15316l;

    /* JADX INFO: renamed from: m */
    private static final yf.g f15317m;

    /* JADX INFO: renamed from: n */
    public static final yf.g f15318n;

    /* JADX INFO: renamed from: o */
    public static final yf.g f15319o;

    /* JADX INFO: renamed from: p */
    private static final lg.l f15320p;

    /* JADX INFO: renamed from: q */
    private static final Map f15321q;

    static class a implements yf.g {
        a() {
        }

        @Override // yf.g
        public eg.r0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    static class b implements yf.g {
        b() {
        }

        @Override // yf.g
        public eg.r0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    static class c implements yf.g {
        c() {
        }

        @Override // yf.g
        public eg.r0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    static class d extends r {
        d(w1 w1Var) {
            super(w1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(m mVar) {
            if (mVar == null) {
                g(0);
            }
            return qf.i.j(mVar) != h1.f15282a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // he.u
        public boolean e(yf.g gVar, q qVar, m mVar, boolean z10) {
            if (qVar == 0) {
                g(1);
            }
            if (mVar == null) {
                g(2);
            }
            if (qf.i.J(qVar) && h(mVar)) {
                return t.f(qVar, mVar);
            }
            if (qVar instanceof he.l) {
                he.i iVarB = ((he.l) qVar).b();
                if (z10 && qf.i.G(iVarB) && qf.i.J(iVarB) && (mVar instanceof he.l) && qf.i.J(mVar.b()) && t.f(qVar, mVar)) {
                    return true;
                }
            }
            while (qVar != 0) {
                qVar = qVar.b();
                if (((qVar instanceof he.e) && !qf.i.x(qVar)) || (qVar instanceof n0)) {
                    break;
                }
            }
            if (qVar == 0) {
                return false;
            }
            while (mVar != null) {
                if (qVar == mVar) {
                    return true;
                }
                if (mVar instanceof n0) {
                    return (qVar instanceof n0) && ((n0) qVar).d().equals(((n0) mVar).d()) && qf.i.b(mVar, qVar);
                }
                mVar = mVar.b();
            }
            return false;
        }
    }

    static class e extends r {
        e(w1 w1Var) {
            super(w1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // he.u
        public boolean e(yf.g gVar, q qVar, m mVar, boolean z10) {
            m mVarQ;
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            if (t.f15305a.e(gVar, qVar, mVar, z10)) {
                if (gVar == t.f15318n) {
                    return true;
                }
                if (gVar != t.f15317m && (mVarQ = qf.i.q(qVar, he.e.class)) != null && (gVar instanceof yf.h)) {
                    return ((yf.h) gVar).r().a().equals(mVarQ.a());
                }
            }
            return false;
        }
    }

    static class f extends r {
        f(w1 w1Var) {
            super(w1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(yf.g gVar, q qVar, he.e eVar) {
            if (qVar == null) {
                g(2);
            }
            if (eVar == null) {
                g(3);
            }
            if (gVar == t.f15319o) {
                return false;
            }
            if (!(qVar instanceof he.b) || (qVar instanceof he.l) || gVar == t.f15318n) {
                return true;
            }
            if (gVar == t.f15317m || gVar == null) {
                return false;
            }
            eg.r0 type = gVar.getType();
            return qf.i.I(type, eVar) || eg.e0.a(type);
        }

        @Override // he.u
        public boolean e(yf.g gVar, q qVar, m mVar, boolean z10) {
            he.e eVar;
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            he.e eVar2 = (he.e) qf.i.q(qVar, he.e.class);
            he.e eVar3 = (he.e) qf.i.r(mVar, he.e.class, false);
            if (eVar3 == null) {
                return false;
            }
            if (eVar2 != null && qf.i.x(eVar2) && (eVar = (he.e) qf.i.q(eVar2, he.e.class)) != null && qf.i.H(eVar3, eVar)) {
                return true;
            }
            q qVarM = qf.i.M(qVar);
            he.e eVar4 = (he.e) qf.i.q(qVarM, he.e.class);
            if (eVar4 == null) {
                return false;
            }
            if (qf.i.H(eVar3, eVar4) && h(gVar, qVarM, eVar3)) {
                return true;
            }
            return e(gVar, qVar, eVar3.b(), z10);
        }
    }

    static class g extends r {
        g(w1 w1Var) {
            super(w1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // he.u
        public boolean e(yf.g gVar, q qVar, m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            if (qf.i.g(mVar).z(qf.i.g(qVar))) {
                return t.f15320p.a(qVar, mVar);
            }
            return false;
        }
    }

    static class h extends r {
        h(w1 w1Var) {
            super(w1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // he.u
        public boolean e(yf.g gVar, q qVar, m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return true;
        }
    }

    static class i extends r {
        i(w1 w1Var) {
            super(w1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // he.u
        public boolean e(yf.g gVar, q qVar, m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    static class j extends r {
        j(w1 w1Var) {
            super(w1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // he.u
        public boolean e(yf.g gVar, q qVar, m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    static class k extends r {
        k(w1 w1Var) {
            super(w1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // he.u
        public boolean e(yf.g gVar, q qVar, m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return false;
        }
    }

    static class l extends r {
        l(w1 w1Var) {
            super(w1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // he.u
        public boolean e(yf.g gVar, q qVar, m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        d dVar = new d(v1.e.f15330c);
        f15305a = dVar;
        e eVar = new e(v1.f.f15331c);
        f15306b = eVar;
        f fVar = new f(v1.g.f15332c);
        f15307c = fVar;
        g gVar = new g(v1.b.f15327c);
        f15308d = gVar;
        h hVar = new h(v1.h.f15333c);
        f15309e = hVar;
        i iVar = new i(v1.d.f15329c);
        f15310f = iVar;
        j jVar = new j(v1.a.f15326c);
        f15311g = jVar;
        k kVar = new k(v1.c.f15328c);
        f15312h = kVar;
        l lVar = new l(v1.i.f15334c);
        f15313i = lVar;
        f15314j = DesugarCollections.unmodifiableSet(ed.r0.g(dVar, eVar, gVar, iVar));
        HashMap mapE = og.a.e(4);
        mapE.put(eVar, 0);
        mapE.put(dVar, 0);
        mapE.put(gVar, 1);
        mapE.put(fVar, 1);
        mapE.put(hVar, 2);
        f15315k = DesugarCollections.unmodifiableMap(mapE);
        f15316l = hVar;
        f15317m = new a();
        f15318n = new b();
        f15319o = new c();
        Iterator it = ServiceLoader.load(lg.l.class, lg.l.class.getClassLoader()).iterator();
        f15320p = it.hasNext() ? (lg.l) it.next() : l.a.f20603a;
        f15321q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = 3
            goto L10
        Lf:
            r4 = 2
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: he.t.a(int):void");
    }

    public static Integer d(u uVar, u uVar2) {
        if (uVar == null) {
            a(12);
        }
        if (uVar2 == null) {
            a(13);
        }
        Integer numA = uVar.a(uVar2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = uVar2.a(uVar);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static q e(yf.g gVar, q qVar, m mVar, boolean z10) {
        q qVarE;
        if (qVar == null) {
            a(8);
        }
        if (mVar == null) {
            a(9);
        }
        for (q qVar2 = (q) qVar.a(); qVar2 != null && qVar2.getVisibility() != f15310f; qVar2 = (q) qf.i.q(qVar2, q.class)) {
            if (!qVar2.getVisibility().e(gVar, qVar2, mVar, z10)) {
                return qVar2;
            }
        }
        if (!(qVar instanceof ke.q0) || (qVarE = e(gVar, ((ke.q0) qVar).o0(), mVar, z10)) == null) {
            return null;
        }
        return qVarE;
    }

    public static boolean f(m mVar, m mVar2) {
        if (mVar == null) {
            a(6);
        }
        if (mVar2 == null) {
            a(7);
        }
        h1 h1VarJ = qf.i.j(mVar2);
        if (h1VarJ != h1.f15282a) {
            return h1VarJ.equals(qf.i.j(mVar));
        }
        return false;
    }

    public static boolean g(u uVar) {
        if (uVar == null) {
            a(14);
        }
        return uVar == f15305a || uVar == f15306b;
    }

    public static boolean h(q qVar, m mVar, boolean z10) {
        if (qVar == null) {
            a(2);
        }
        if (mVar == null) {
            a(3);
        }
        return e(f15318n, qVar, mVar, z10) == null;
    }

    private static void i(u uVar) {
        f15321q.put(uVar.b(), uVar);
    }

    public static u j(w1 w1Var) {
        if (w1Var == null) {
            a(15);
        }
        u uVar = (u) f15321q.get(w1Var);
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + w1Var);
    }
}
