package qf;

import dd.d0;
import eg.l0;
import eg.r0;
import eg.t1;
import eg.u1;
import eg.v0;
import fg.e;
import fg.f;
import fg.g;
import he.b;
import he.b1;
import he.e0;
import he.l1;
import he.s1;
import he.x0;
import he.y0;
import he.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import ke.j0;
import ke.k0;
import qf.j;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: e */
    private static final List f25142e = ed.q.H0(ServiceLoader.load(j.class, j.class.getClassLoader()));

    /* JADX INFO: renamed from: f */
    public static final o f25143f;

    /* JADX INFO: renamed from: g */
    private static final e.a f25144g;

    /* JADX INFO: renamed from: a */
    private final fg.g f25145a;

    /* JADX INFO: renamed from: b */
    private final fg.f f25146b;

    /* JADX INFO: renamed from: c */
    private final e.a f25147c;

    /* JADX INFO: renamed from: d */
    private final qd.p f25148d;

    static class a implements e.a {
        a() {
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // fg.e.a
        public boolean a(u1 u1Var, u1 u1Var2) {
            if (u1Var == null) {
                b(0);
            }
            if (u1Var2 == null) {
                b(1);
            }
            return u1Var.equals(u1Var2);
        }
    }

    static class b implements qd.p {
        b() {
        }

        @Override // qd.p
        /* JADX INFO: renamed from: b */
        public dd.q s(he.a aVar, he.a aVar2) {
            return new dd.q(aVar, aVar2);
        }
    }

    static class c implements qd.l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ he.m f25149a;

        c(he.m mVar) {
            this.f25149a = mVar;
        }

        @Override // qd.l
        /* JADX INFO: renamed from: b */
        public Boolean l(he.b bVar) {
            return Boolean.valueOf(bVar.b() == this.f25149a);
        }
    }

    static class e implements qd.l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ he.e f25150a;

        e(he.e eVar) {
            this.f25150a = eVar;
        }

        @Override // qd.l
        /* JADX INFO: renamed from: b */
        public Boolean l(he.b bVar) {
            boolean z10 = false;
            if (!he.t.g(bVar.getVisibility()) && he.t.h(bVar, this.f25150a, false)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static class g implements qd.l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ n f25151a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ he.b f25152b;

        g(n nVar, he.b bVar) {
            this.f25151a = nVar;
            this.f25152b = bVar;
        }

        @Override // qd.l
        /* JADX INFO: renamed from: b */
        public d0 l(he.b bVar) {
            this.f25151a.b(this.f25152b, bVar);
            return d0.f10897a;
        }
    }

    static /* synthetic */ class h {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f25153a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f25154b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f25155c;

        static {
            int[] iArr = new int[e0.values().length];
            f25155c = iArr;
            try {
                iArr[e0.f15259b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25155c[e0.f15260c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25155c[e0.f15261d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25155c[e0.f15262e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f25154b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25154b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25154b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[j.b.values().length];
            f25153a = iArr3;
            try {
                iArr3[j.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25153a[j.b.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f25153a[j.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class i {

        /* JADX INFO: renamed from: c */
        private static final i f25156c = new i(a.OVERRIDABLE, "SUCCESS");

        /* JADX INFO: renamed from: a */
        private final a f25157a;

        /* JADX INFO: renamed from: b */
        private final String f25158b;

        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f25157a = aVar;
            this.f25158b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:67:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = 2
                goto L1c
            L1b:
                r5 = 3
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: qf.o.i.a(int):void");
        }

        public static i b(String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        public static i d(String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        public static i e() {
            i iVar = f25156c;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        public a c() {
            a aVar = this.f25157a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }

        public String toString() {
            return this.f25157a + ": " + this.f25158b;
        }
    }

    static {
        a aVar = new a();
        f25144g = aVar;
        f25143f = new o(aVar, g.a.f13059a, f.a.f13058a, null);
    }

    private o(e.a aVar, fg.g gVar, fg.f fVar, qd.p pVar) {
        if (aVar == null) {
            a(5);
        }
        if (gVar == null) {
            a(6);
        }
        if (fVar == null) {
            a(7);
        }
        this.f25147c = aVar;
        this.f25145a = gVar;
        this.f25146b = fVar;
        this.f25148d = pVar;
    }

    private static boolean A(x0 x0Var, x0 x0Var2) {
        if (x0Var == null || x0Var2 == null) {
            return true;
        }
        return H(x0Var, x0Var2);
    }

    public static boolean B(he.a aVar, he.a aVar2) {
        if (aVar == null) {
            a(65);
        }
        if (aVar2 == null) {
            a(66);
        }
        r0 r0VarG = aVar.g();
        r0 r0VarG2 = aVar2.g();
        if (!H(aVar, aVar2)) {
            return false;
        }
        t1 t1VarL = f25143f.l(aVar.getTypeParameters(), aVar2.getTypeParameters());
        if (aVar instanceof z) {
            return G(aVar, r0VarG, aVar2, r0VarG2, t1VarL);
        }
        if (!(aVar instanceof y0)) {
            throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
        }
        y0 y0Var = (y0) aVar;
        y0 y0Var2 = (y0) aVar2;
        if (A(y0Var.h(), y0Var2.h())) {
            return (y0Var.j0() && y0Var2.j0()) ? eg.g.f12094a.m(t1VarL, r0VarG.Q0(), r0VarG2.Q0()) : (y0Var.j0() || !y0Var2.j0()) && G(aVar, r0VarG, aVar2, r0VarG2, t1VarL);
        }
        return false;
    }

    private static boolean C(he.a aVar, Collection collection) {
        if (aVar == null) {
            a(69);
        }
        if (collection == null) {
            a(70);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!B(aVar, (he.a) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(he.a aVar, r0 r0Var, he.a aVar2, r0 r0Var2, t1 t1Var) {
        if (aVar == null) {
            a(71);
        }
        if (r0Var == null) {
            a(72);
        }
        if (aVar2 == null) {
            a(73);
        }
        if (r0Var2 == null) {
            a(74);
        }
        if (t1Var == null) {
            a(75);
        }
        return eg.g.f12094a.t(t1Var, r0Var.Q0(), r0Var2.Q0());
    }

    private static boolean H(he.q qVar, he.q qVar2) {
        if (qVar == null) {
            a(67);
        }
        if (qVar2 == null) {
            a(68);
        }
        Integer numD = he.t.d(qVar.getVisibility(), qVar2.getVisibility());
        return numD == null || numD.intValue() >= 0;
    }

    public static boolean I(he.d0 d0Var, he.d0 d0Var2, boolean z10) {
        if (d0Var == null) {
            a(55);
        }
        if (d0Var2 == null) {
            a(56);
        }
        return !he.t.g(d0Var2.getVisibility()) && he.t.h(d0Var2, d0Var, z10);
    }

    public static boolean J(he.a aVar, he.a aVar2, boolean z10, boolean z11) {
        if (aVar == null) {
            a(13);
        }
        if (aVar2 == null) {
            a(14);
        }
        if (!aVar.equals(aVar2) && qf.g.f25128a.k(aVar.a(), aVar2.a(), z10, z11)) {
            return true;
        }
        he.a aVarA = aVar2.a();
        Iterator it = qf.i.d(aVar).iterator();
        while (it.hasNext()) {
            if (qf.g.f25128a.k(aVarA, (he.a) it.next(), z10, z11)) {
                return true;
            }
        }
        return false;
    }

    public static void K(he.b bVar, qd.l lVar) {
        he.u uVar;
        if (bVar == null) {
            a(105);
        }
        for (he.b bVar2 : bVar.e()) {
            if (bVar2.getVisibility() == he.t.f15311g) {
                K(bVar2, lVar);
            }
        }
        if (bVar.getVisibility() != he.t.f15311g) {
            return;
        }
        he.u uVarH = h(bVar);
        if (uVarH == null) {
            if (lVar != null) {
                lVar.l(bVar);
            }
            uVar = he.t.f15309e;
        } else {
            uVar = uVarH;
        }
        if (bVar instanceof k0) {
            ((k0) bVar).c1(uVar);
            Iterator it = ((y0) bVar).w().iterator();
            while (it.hasNext()) {
                K((x0) it.next(), uVarH == null ? null : lVar);
            }
            return;
        }
        if (bVar instanceof ke.s) {
            ((ke.s) bVar).j1(uVar);
            return;
        }
        j0 j0Var = (j0) bVar;
        j0Var.N0(uVar);
        if (uVar != j0Var.C0().getVisibility()) {
            j0Var.L0(false);
        }
    }

    public static Object L(Collection collection, qd.l lVar) {
        Object next;
        if (collection == null) {
            a(76);
        }
        if (lVar == null) {
            a(77);
        }
        if (collection.size() == 1) {
            Object objY = ed.q.Y(collection);
            if (objY == null) {
                a(78);
            }
            return objY;
        }
        ArrayList arrayList = new ArrayList(2);
        List listN0 = ed.q.n0(collection, lVar);
        Object objY2 = ed.q.Y(collection);
        he.a aVar = (he.a) lVar.l(objY2);
        for (Object obj : collection) {
            he.a aVar2 = (he.a) lVar.l(obj);
            if (C(aVar2, listN0)) {
                arrayList.add(obj);
            }
            if (B(aVar2, aVar) && !B(aVar, aVar2)) {
                objY2 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objY2 == null) {
                a(79);
            }
            return objY2;
        }
        if (arrayList.size() == 1) {
            Object objY3 = ed.q.Y(arrayList);
            if (objY3 == null) {
                a(80);
            }
            return objY3;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!l0.b(((he.a) lVar.l(next)).g())) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objY4 = ed.q.Y(arrayList);
        if (objY4 == null) {
            a(82);
        }
        return objY4;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instruction units count: 1298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.o.a(int):void");
    }

    private static boolean b(Collection collection) {
        if (collection == null) {
            a(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        return ed.q.R(collection, new c(((he.b) collection.iterator().next()).b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0054, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(he.l1 r4, he.l1 r5, eg.t1 r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 47
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 48
            a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 49
            a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            eg.r0 r5 = (eg.r0) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            eg.r0 r3 = (eg.r0) r3
            boolean r3 = d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.o.c(he.l1, he.l1, eg.t1):boolean");
    }

    private static boolean d(r0 r0Var, r0 r0Var2, t1 t1Var) {
        if (r0Var == null) {
            a(44);
        }
        if (r0Var2 == null) {
            a(45);
        }
        if (t1Var == null) {
            a(46);
        }
        if (v0.a(r0Var) && v0.a(r0Var2)) {
            return true;
        }
        return eg.g.f12094a.m(t1Var, r0Var.Q0(), r0Var2.Q0());
    }

    private static i e(he.a aVar, he.a aVar2) {
        if ((aVar.l0() == null) != (aVar2.l0() == null)) {
            return i.d("Receiver presence mismatch");
        }
        if (aVar.i().size() != aVar2.i().size()) {
            return i.d("Value parameter number mismatch");
        }
        return null;
    }

    private static void f(he.b bVar, Set set) {
        if (bVar == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (bVar.j().a()) {
            set.add(bVar);
            return;
        }
        if (bVar.e().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
        }
        Iterator it = bVar.e().iterator();
        while (it.hasNext()) {
            f((he.b) it.next(), set);
        }
    }

    private static List g(he.a aVar) {
        b1 b1VarL0 = aVar.l0();
        ArrayList arrayList = new ArrayList();
        if (b1VarL0 != null) {
            arrayList.add(b1VarL0.getType());
        }
        Iterator it = aVar.i().iterator();
        while (it.hasNext()) {
            arrayList.add(((s1) it.next()).getType());
        }
        return arrayList;
    }

    private static he.u h(he.b bVar) {
        if (bVar == null) {
            a(106);
        }
        Collection<he.b> collectionE = bVar.e();
        he.u uVarU = u(collectionE);
        if (uVarU == null) {
            return null;
        }
        if (bVar.j() != b.a.FAKE_OVERRIDE) {
            return uVarU.f();
        }
        for (he.b bVar2 : collectionE) {
            if (bVar2.l() != e0.f15262e && !bVar2.getVisibility().equals(uVarU)) {
                return null;
            }
        }
        return uVarU;
    }

    public static o i(fg.g gVar, e.a aVar) {
        if (gVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new o(aVar, gVar, f.a.f13058a, null);
    }

    private static void j(Collection collection, he.e eVar, n nVar) {
        if (collection == null) {
            a(83);
        }
        if (eVar == null) {
            a(84);
        }
        if (nVar == null) {
            a(85);
        }
        Collection collectionT = t(eVar, collection);
        boolean zIsEmpty = collectionT.isEmpty();
        if (!zIsEmpty) {
            collection = collectionT;
        }
        he.b bVarQ = ((he.b) L(collection, new d())).Q(eVar, n(collection, eVar), zIsEmpty ? he.t.f15312h : he.t.f15311g, b.a.FAKE_OVERRIDE, false);
        nVar.d(bVarQ, collection);
        nVar.a(bVarQ);
    }

    private static void k(he.e eVar, Collection collection, n nVar) {
        if (eVar == null) {
            a(62);
        }
        if (collection == null) {
            a(63);
        }
        if (nVar == null) {
            a(64);
        }
        if (b(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton((he.b) it.next()), eVar, nVar);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(p(w.a(linkedList), linkedList, nVar), eVar, nVar);
            }
        }
    }

    private t1 l(List list, List list2) {
        if (list == null) {
            a(40);
        }
        if (list2 == null) {
            a(41);
        }
        if (list.isEmpty()) {
            t1 t1VarA0 = new p(null, this.f25147c, this.f25145a, this.f25146b, this.f25148d).A0(true, true, false);
            if (t1VarA0 == null) {
                a(42);
            }
            return t1VarA0;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(((l1) list.get(i10)).k(), ((l1) list2.get(i10)).k());
        }
        t1 t1VarA02 = new p(map, this.f25147c, this.f25145a, this.f25146b, this.f25148d).A0(true, true, false);
        if (t1VarA02 == null) {
            a(43);
        }
        return t1VarA02;
    }

    public static o m(fg.g gVar) {
        if (gVar == null) {
            a(0);
        }
        return new o(f25144g, gVar, f.a.f13058a, null);
    }

    private static e0 n(Collection collection, he.e eVar) {
        if (collection == null) {
            a(86);
        }
        if (eVar == null) {
            a(87);
        }
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            he.b bVar = (he.b) it.next();
            int i10 = h.f25155c[bVar.l().ordinal()];
            if (i10 == 1) {
                e0 e0Var = e0.f15259b;
                if (e0Var == null) {
                    a(88);
                }
                return e0Var;
            }
            if (i10 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + bVar);
            }
            if (i10 == 3) {
                z11 = true;
            } else if (i10 == 4) {
                z12 = true;
            }
        }
        if (eVar.M() && eVar.l() != e0.f15262e && eVar.l() != e0.f15260c) {
            z10 = true;
        }
        if (z11 && !z12) {
            e0 e0Var2 = e0.f15261d;
            if (e0Var2 == null) {
                a(89);
            }
            return e0Var2;
        }
        if (!z11 && z12) {
            e0 e0VarL = z10 ? eVar.l() : e0.f15262e;
            if (e0VarL == null) {
                a(90);
            }
            return e0VarL;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            hashSet.addAll(z((he.b) it2.next()));
        }
        return y(r(hashSet), z10, eVar.l());
    }

    private Collection o(he.b bVar, Collection collection, he.e eVar, n nVar) {
        if (bVar == null) {
            a(57);
        }
        if (collection == null) {
            a(58);
        }
        if (eVar == null) {
            a(59);
        }
        if (nVar == null) {
            a(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        og.k kVarC = og.k.c();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            he.b bVar2 = (he.b) it.next();
            i.a aVarC = D(bVar2, bVar, eVar).c();
            boolean zI = I(bVar, bVar2, false);
            int i10 = h.f25154b[aVarC.ordinal()];
            if (i10 == 1) {
                if (zI) {
                    kVarC.add(bVar2);
                }
                arrayList.add(bVar2);
            } else if (i10 == 2) {
                if (zI) {
                    nVar.c(bVar2, bVar);
                }
                arrayList.add(bVar2);
            }
        }
        nVar.d(bVar, kVarC);
        return arrayList;
    }

    private static Collection p(he.b bVar, Queue queue, n nVar) {
        if (bVar == null) {
            a(102);
        }
        if (queue == null) {
            a(103);
        }
        if (nVar == null) {
            a(104);
        }
        return q(bVar, queue, new f(), new g(nVar, bVar));
    }

    public static Collection q(Object obj, Collection collection, qd.l lVar, qd.l lVar2) {
        if (obj == null) {
            a(97);
        }
        if (collection == null) {
            a(98);
        }
        if (lVar == null) {
            a(99);
        }
        if (lVar2 == null) {
            a(100);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        he.a aVar = (he.a) lVar.l(obj);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            he.a aVar2 = (he.a) lVar.l(next);
            if (obj == next) {
                it.remove();
            } else {
                i.a aVarX = x(aVar, aVar2);
                if (aVarX == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (aVarX == i.a.CONFLICT) {
                    lVar2.l(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static Set r(Set set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && uf.e.y(uf.e.s((he.m) set.iterator().next())), null, new b());
    }

    public static Set s(Set set, boolean z10, qd.a aVar, qd.p pVar) {
        if (set == null) {
            a(9);
        }
        if (pVar == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (aVar != null) {
                aVar.a();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                dd.q qVar = (dd.q) pVar.s(obj, it.next());
                he.a aVar2 = (he.a) qVar.a();
                he.a aVar3 = (he.a) qVar.b();
                if (!J(aVar2, aVar3, z10, true)) {
                    if (J(aVar3, aVar2, z10, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection t(he.e eVar, Collection collection) {
        if (eVar == null) {
            a(94);
        }
        if (collection == null) {
            a(95);
        }
        List listX = ed.q.X(collection, new e(eVar));
        if (listX == null) {
            a(96);
        }
        return listX;
    }

    public static he.u u(Collection collection) {
        he.u uVar;
        if (collection == null) {
            a(107);
        }
        if (collection.isEmpty()) {
            return he.t.f15316l;
        }
        Iterator it = collection.iterator();
        loop0: while (true) {
            uVar = null;
            while (it.hasNext()) {
                he.u visibility = ((he.b) it.next()).getVisibility();
                if (uVar != null) {
                    Integer numD = he.t.d(visibility, uVar);
                    if (numD == null) {
                        break;
                    }
                    if (numD.intValue() > 0) {
                    }
                }
                uVar = visibility;
            }
        }
        if (uVar == null) {
            return null;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numD2 = he.t.d(uVar, ((he.b) it2.next()).getVisibility());
            if (numD2 == null || numD2.intValue() < 0) {
                return null;
            }
        }
        return uVar;
    }

    public static i w(he.a aVar, he.a aVar2) {
        boolean z10;
        if (aVar == null) {
            a(38);
        }
        if (aVar2 == null) {
            a(39);
        }
        boolean z11 = aVar instanceof z;
        if ((z11 && !(aVar2 instanceof z)) || (((z10 = aVar instanceof y0)) && !(aVar2 instanceof y0))) {
            return i.d("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
        }
        if (!aVar.getName().equals(aVar2.getName())) {
            return i.d("Name mismatch");
        }
        i iVarE = e(aVar, aVar2);
        if (iVarE != null) {
            return iVarE;
        }
        return null;
    }

    public static i.a x(he.a aVar, he.a aVar2) {
        o oVar = f25143f;
        i.a aVarC = oVar.D(aVar2, aVar, null).c();
        i.a aVarC2 = oVar.D(aVar, aVar2, null).c();
        i.a aVar3 = i.a.OVERRIDABLE;
        if (aVarC == aVar3 && aVarC2 == aVar3) {
            return aVar3;
        }
        i.a aVar4 = i.a.CONFLICT;
        return (aVarC == aVar4 || aVarC2 == aVar4) ? aVar4 : i.a.INCOMPATIBLE;
    }

    private static e0 y(Collection collection, boolean z10, e0 e0Var) {
        if (collection == null) {
            a(91);
        }
        if (e0Var == null) {
            a(92);
        }
        e0 e0Var2 = e0.f15262e;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            he.b bVar = (he.b) it.next();
            e0 e0VarL = (z10 && bVar.l() == e0.f15262e) ? e0Var : bVar.l();
            if (e0VarL.compareTo(e0Var2) < 0) {
                e0Var2 = e0VarL;
            }
        }
        if (e0Var2 == null) {
            a(93);
        }
        return e0Var2;
    }

    public static Set z(he.b bVar) {
        if (bVar == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(bVar, linkedHashSet);
        return linkedHashSet;
    }

    public i D(he.a aVar, he.a aVar2, he.e eVar) {
        if (aVar == null) {
            a(19);
        }
        if (aVar2 == null) {
            a(20);
        }
        i iVarE = E(aVar, aVar2, eVar, false);
        if (iVarE == null) {
            a(21);
        }
        return iVarE;
    }

    public i E(he.a aVar, he.a aVar2, he.e eVar, boolean z10) {
        if (aVar == null) {
            a(22);
        }
        if (aVar2 == null) {
            a(23);
        }
        i iVarF = F(aVar, aVar2, z10);
        boolean z11 = iVarF.c() == i.a.OVERRIDABLE;
        for (j jVar : f25142e) {
            if (jVar.a() != j.a.CONFLICTS_ONLY && (!z11 || jVar.a() != j.a.SUCCESS_ONLY)) {
                int i10 = h.f25153a[jVar.b(aVar, aVar2, eVar).ordinal()];
                if (i10 == 1) {
                    z11 = true;
                } else if (i10 == 2) {
                    i iVarD = i.d("External condition");
                    if (iVarD == null) {
                        a(24);
                    }
                    return iVarD;
                }
            }
        }
        if (!z11) {
            return iVarF;
        }
        for (j jVar2 : f25142e) {
            if (jVar2.a() == j.a.CONFLICTS_ONLY) {
                int i11 = h.f25153a[jVar2.b(aVar, aVar2, eVar).ordinal()];
                if (i11 == 1) {
                    throw new IllegalStateException("Contract violation in " + jVar2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i11 == 2) {
                    i iVarD2 = i.d("External condition");
                    if (iVarD2 == null) {
                        a(26);
                    }
                    return iVarD2;
                }
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(27);
        }
        return iVarE;
    }

    public i F(he.a aVar, he.a aVar2, boolean z10) {
        if (aVar == null) {
            a(28);
        }
        if (aVar2 == null) {
            a(29);
        }
        i iVarW = w(aVar, aVar2);
        if (iVarW != null) {
            return iVarW;
        }
        List listG = g(aVar);
        List listG2 = g(aVar2);
        List typeParameters = aVar.getTypeParameters();
        List typeParameters2 = aVar2.getTypeParameters();
        int i10 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i10 < listG.size()) {
                if (!fg.e.f13057a.c((r0) listG.get(i10), (r0) listG2.get(i10))) {
                    i iVarD = i.d("Type parameter number mismatch");
                    if (iVarD == null) {
                        a(31);
                    }
                    return iVarD;
                }
                i10++;
            }
            i iVarB = i.b("Type parameter number mismatch");
            if (iVarB == null) {
                a(32);
            }
            return iVarB;
        }
        t1 t1VarL = l(typeParameters, typeParameters2);
        for (int i11 = 0; i11 < typeParameters.size(); i11++) {
            if (!c((l1) typeParameters.get(i11), (l1) typeParameters2.get(i11), t1VarL)) {
                i iVarD2 = i.d("Type parameter bounds mismatch");
                if (iVarD2 == null) {
                    a(33);
                }
                return iVarD2;
            }
        }
        while (i10 < listG.size()) {
            if (!d((r0) listG.get(i10), (r0) listG2.get(i10), t1VarL)) {
                i iVarD3 = i.d("Value parameter type mismatch");
                if (iVarD3 == null) {
                    a(34);
                }
                return iVarD3;
            }
            i10++;
        }
        if ((aVar instanceof z) && (aVar2 instanceof z) && ((z) aVar).t() != ((z) aVar2).t()) {
            i iVarB2 = i.b("Incompatible suspendability");
            if (iVarB2 == null) {
                a(35);
            }
            return iVarB2;
        }
        if (z10) {
            r0 r0VarG = aVar.g();
            r0 r0VarG2 = aVar2.g();
            if (r0VarG != null && r0VarG2 != null && ((!v0.a(r0VarG2) || !v0.a(r0VarG)) && !eg.g.f12094a.t(t1VarL, r0VarG2.Q0(), r0VarG.Q0()))) {
                i iVarB3 = i.b("Return type mismatch");
                if (iVarB3 == null) {
                    a(36);
                }
                return iVarB3;
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(37);
        }
        return iVarE;
    }

    public void v(mf.f fVar, Collection collection, Collection collection2, he.e eVar, n nVar) {
        if (fVar == null) {
            a(50);
        }
        if (collection == null) {
            a(51);
        }
        if (collection2 == null) {
            a(52);
        }
        if (eVar == null) {
            a(53);
        }
        if (nVar == null) {
            a(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o((he.b) it.next(), collection, eVar, nVar));
        }
        k(eVar, linkedHashSet, nVar);
    }

    static class d implements qd.l {
        d() {
        }

        @Override // qd.l
        /* JADX INFO: renamed from: b */
        public he.b l(he.b bVar) {
            return bVar;
        }
    }

    static class f implements qd.l {
        f() {
        }

        @Override // qd.l
        /* JADX INFO: renamed from: b */
        public he.a l(he.b bVar) {
            return bVar;
        }
    }
}
