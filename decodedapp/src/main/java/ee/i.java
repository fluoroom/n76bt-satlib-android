package ee;

import ee.o;
import eg.a2;
import eg.c1;
import eg.c2;
import eg.i2;
import eg.m2;
import eg.r0;
import eg.r1;
import eg.u0;
import eg.u1;
import he.a1;
import he.h0;
import he.n0;
import he.y;
import he.y0;
import he.z0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import je.a;
import je.c;
import ke.f0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: g */
    public static final mf.f f11788g = mf.f.k("<built-ins module>");

    /* JADX INFO: renamed from: a */
    private f0 f11789a;

    /* JADX INFO: renamed from: b */
    private dg.i f11790b;

    /* JADX INFO: renamed from: c */
    private final dg.i f11791c;

    /* JADX INFO: renamed from: d */
    private final dg.i f11792d;

    /* JADX INFO: renamed from: e */
    private final dg.g f11793e;

    /* JADX INFO: renamed from: f */
    private final dg.n f11794f;

    class a implements qd.a {
        a() {
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b */
        public Collection a() {
            return Arrays.asList(i.this.s().y(o.B), i.this.s().y(o.D), i.this.s().y(o.E), i.this.s().y(o.C));
        }
    }

    class b implements qd.a {
        b() {
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b */
        public e a() {
            EnumMap enumMap = new EnumMap(l.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (l lVar : l.values()) {
                c1 c1VarR = i.this.r(lVar.j().d());
                c1 c1VarR2 = i.this.r(lVar.h().d());
                enumMap.put(lVar, c1VarR2);
                map.put(c1VarR, c1VarR2);
                map2.put(c1VarR2, c1VarR);
            }
            return new e(enumMap, map, map2, null);
        }
    }

    class c implements qd.l {
        c() {
        }

        @Override // qd.l
        /* JADX INFO: renamed from: b */
        public he.e l(mf.f fVar) {
            he.h hVarG = i.this.t().g(fVar, pe.d.f24116d);
            if (hVarG == null) {
                throw new AssertionError("Built-in class " + o.B.b(fVar) + " is not found");
            }
            if (hVarG instanceof he.e) {
                return (he.e) hVarG;
            }
            throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + hVarG);
        }
    }

    class d implements qd.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ f0 f11798a;

        d(f0 f0Var) {
            this.f11798a = f0Var;
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b */
        public Void a() {
            if (i.this.f11789a == null) {
                i.this.f11789a = this.f11798a;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + i.this.f11789a + " (attempting to reset to " + this.f11798a + ")");
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a */
        public final Map f11800a;

        /* JADX INFO: renamed from: b */
        public final Map f11801b;

        /* JADX INFO: renamed from: c */
        public final Map f11802c;

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i10 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private e(Map map, Map map2, Map map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f11800a = map;
            this.f11801b = map2;
            this.f11802c = map3;
        }
    }

    protected i(dg.n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f11794f = nVar;
        this.f11792d = nVar.d(new a());
        this.f11791c = nVar.d(new b());
        this.f11793e = nVar.f(new c());
    }

    public static boolean A0(r0 r0Var) {
        if (r0Var == null) {
            a(131);
        }
        return j0(r0Var, o.a.K0.i());
    }

    private static r0 B(r0 r0Var, h0 h0Var) {
        mf.b bVarN;
        mf.b bVarA;
        he.e eVarB;
        if (r0Var == null) {
            a(71);
        }
        if (h0Var == null) {
            a(72);
        }
        he.h hVarQ = r0Var.N0().q();
        if (hVarQ == null) {
            return null;
        }
        s sVar = s.f11931a;
        if (!sVar.b(hVarQ.getName()) || (bVarN = uf.e.n(hVarQ)) == null || (bVarA = sVar.a(bVarN)) == null || (eVarB = y.b(h0Var, bVarA)) == null) {
            return null;
        }
        return eVarB.s();
    }

    public static boolean B0(r0 r0Var) {
        if (r0Var == null) {
            a(129);
        }
        return j0(r0Var, o.a.I0.i());
    }

    public static boolean C0(he.m mVar) {
        if (mVar == null) {
            a(10);
        }
        while (mVar != null) {
            if (mVar instanceof n0) {
                return ((n0) mVar).d().h(o.A);
            }
            mVar = mVar.b();
        }
        return false;
    }

    public static boolean D0(r0 r0Var) {
        if (r0Var == null) {
            a(142);
        }
        return n0(r0Var, o.a.f11871f);
    }

    public static boolean E0(r0 r0Var) {
        if (r0Var == null) {
            a(132);
        }
        return y0(r0Var) || B0(r0Var) || z0(r0Var) || A0(r0Var);
    }

    public static l O(r0 r0Var) {
        if (r0Var == null) {
            a(92);
        }
        he.h hVarQ = r0Var.N0().q();
        if (hVarQ == null) {
            return null;
        }
        return Q(hVarQ);
    }

    public static l Q(he.m mVar) {
        if (mVar == null) {
            a(77);
        }
        if (o.a.T0.contains(mVar.getName())) {
            return (l) o.a.V0.get(qf.i.m(mVar));
        }
        return null;
    }

    private he.e R(l lVar) {
        if (lVar == null) {
            a(16);
        }
        return q(lVar.j().d());
    }

    public static l T(he.m mVar) {
        if (mVar == null) {
            a(76);
        }
        if (o.a.S0.contains(mVar.getName())) {
            return (l) o.a.U0.get(qf.i.m(mVar));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r23) {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.i.a(int):void");
    }

    public static boolean b0(he.e eVar) {
        if (eVar == null) {
            a(108);
        }
        return e(eVar, o.a.f11863b);
    }

    public static boolean c0(r0 r0Var) {
        if (r0Var == null) {
            a(139);
        }
        return i0(r0Var, o.a.f11863b);
    }

    public static boolean d0(r0 r0Var) {
        if (r0Var == null) {
            a(88);
        }
        return i0(r0Var, o.a.f11877i);
    }

    private static boolean e(he.h hVar, mf.d dVar) {
        if (hVar == null) {
            a(103);
        }
        if (dVar == null) {
            a(104);
        }
        return hVar.getName().equals(dVar.j()) && dVar.equals(qf.i.m(hVar));
    }

    public static boolean e0(r0 r0Var) {
        if (r0Var == null) {
            a(90);
        }
        return d0(r0Var) || r0(r0Var);
    }

    public static boolean f0(he.e eVar) {
        if (eVar == null) {
            a(89);
        }
        return e(eVar, o.a.f11877i) || Q(eVar) != null;
    }

    public static boolean g0(r0 r0Var) {
        if (r0Var == null) {
            a(110);
        }
        return j0(r0Var, o.a.f11879j);
    }

    public static boolean h0(he.m mVar) {
        if (mVar == null) {
            a(9);
        }
        return qf.i.r(mVar, ee.c.class, false) != null;
    }

    private static boolean i0(r0 r0Var, mf.d dVar) {
        if (r0Var == null) {
            a(97);
        }
        if (dVar == null) {
            a(98);
        }
        return x0(r0Var.N0(), dVar);
    }

    private static boolean j0(r0 r0Var, mf.d dVar) {
        if (r0Var == null) {
            a(134);
        }
        if (dVar == null) {
            a(135);
        }
        return i0(r0Var, dVar) && !r0Var.O0();
    }

    public static boolean k0(r0 r0Var) {
        if (r0Var == null) {
            a(141);
        }
        return q0(r0Var);
    }

    public static boolean l0(he.m mVar) {
        if (mVar == null) {
            a(160);
        }
        if (mVar.a().getAnnotations().H(o.a.f11909y)) {
            return true;
        }
        if (mVar instanceof y0) {
            y0 y0Var = (y0) mVar;
            boolean zJ0 = y0Var.j0();
            z0 z0VarF = y0Var.f();
            a1 a1VarH = y0Var.h();
            if (z0VarF != null && l0(z0VarF) && (!zJ0 || (a1VarH != null && l0(a1VarH)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean m0(he.e eVar) {
        if (eVar == null) {
            a(158);
        }
        return e(eVar, o.a.f11884l0);
    }

    private static boolean n0(r0 r0Var, mf.d dVar) {
        if (r0Var == null) {
            a(105);
        }
        if (dVar == null) {
            a(106);
        }
        return !r0Var.O0() && i0(r0Var, dVar);
    }

    public static boolean o0(r0 r0Var) {
        if (r0Var == null) {
            a(136);
        }
        return p0(r0Var) && !i2.l(r0Var);
    }

    public static boolean p0(r0 r0Var) {
        if (r0Var == null) {
            a(138);
        }
        return i0(r0Var, o.a.f11865c);
    }

    private he.e q(String str) {
        if (str == null) {
            a(14);
        }
        he.e eVar = (he.e) this.f11793e.l(mf.f.h(str));
        if (eVar == null) {
            a(15);
        }
        return eVar;
    }

    public static boolean q0(r0 r0Var) {
        if (r0Var == null) {
            a(140);
        }
        return c0(r0Var) && r0Var.O0();
    }

    public c1 r(String str) {
        if (str == null) {
            a(47);
        }
        c1 c1VarS = q(str).s();
        if (c1VarS == null) {
            a(48);
        }
        return c1VarS;
    }

    public static boolean r0(r0 r0Var) {
        if (r0Var == null) {
            a(91);
        }
        he.h hVarQ = r0Var.N0().q();
        return (hVarQ == null || Q(hVarQ) == null) ? false : true;
    }

    public static boolean s0(he.e eVar) {
        if (eVar == null) {
            a(96);
        }
        return T(eVar) != null;
    }

    public static boolean t0(r0 r0Var) {
        if (r0Var == null) {
            a(94);
        }
        return !r0Var.O0() && u0(r0Var);
    }

    public static boolean u0(r0 r0Var) {
        if (r0Var == null) {
            a(95);
        }
        he.h hVarQ = r0Var.N0().q();
        return (hVarQ instanceof he.e) && s0((he.e) hVarQ);
    }

    public static boolean v0(he.e eVar) {
        if (eVar == null) {
            a(107);
        }
        return e(eVar, o.a.f11863b) || e(eVar, o.a.f11865c);
    }

    public static boolean w0(r0 r0Var) {
        return r0Var != null && n0(r0Var, o.a.f11875h);
    }

    public static boolean x0(u1 u1Var, mf.d dVar) {
        if (u1Var == null) {
            a(101);
        }
        if (dVar == null) {
            a(102);
        }
        he.h hVarQ = u1Var.q();
        return (hVarQ instanceof he.e) && e(hVarQ, dVar);
    }

    public static boolean y0(r0 r0Var) {
        if (r0Var == null) {
            a(128);
        }
        return j0(r0Var, o.a.H0.i());
    }

    public static boolean z0(r0 r0Var) {
        if (r0Var == null) {
            a(130);
        }
        return j0(r0Var, o.a.J0.i());
    }

    public c1 A() {
        c1 c1VarS = S(l.f11814w);
        if (c1VarS == null) {
            a(62);
        }
        return c1VarS;
    }

    public c1 C() {
        c1 c1VarS = S(l.f11812u);
        if (c1VarS == null) {
            a(61);
        }
        return c1VarS;
    }

    public he.e D(int i10) {
        return q(o.b(i10));
    }

    public c1 E() {
        c1 c1VarS = S(l.f11811t);
        if (c1VarS == null) {
            a(59);
        }
        return c1VarS;
    }

    public he.e F() {
        he.e eVarP = p(o.a.f11884l0.m());
        if (eVarP == null) {
            a(21);
        }
        return eVarP;
    }

    public void F0(f0 f0Var) {
        if (f0Var == null) {
            a(1);
        }
        this.f11794f.i(new d(f0Var));
    }

    public c1 G() {
        c1 c1VarS = S(l.f11813v);
        if (c1VarS == null) {
            a(60);
        }
        return c1VarS;
    }

    public he.e H() {
        return q("Nothing");
    }

    public c1 I() {
        c1 c1VarS = H().s();
        if (c1VarS == null) {
            a(49);
        }
        return c1VarS;
    }

    public c1 J() {
        c1 c1VarR0 = i().R0(true);
        if (c1VarR0 == null) {
            a(52);
        }
        return c1VarR0;
    }

    public c1 K() {
        c1 c1VarR0 = I().R0(true);
        if (c1VarR0 == null) {
            a(50);
        }
        return c1VarR0;
    }

    public he.e L() {
        return q("Number");
    }

    public c1 M() {
        c1 c1VarS = L().s();
        if (c1VarS == null) {
            a(56);
        }
        return c1VarS;
    }

    protected je.c N() {
        c.b bVar = c.b.f18652a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    public c1 P(l lVar) {
        if (lVar == null) {
            a(73);
        }
        c1 c1Var = (c1) ((e) this.f11791c.a()).f11800a.get(lVar);
        if (c1Var == null) {
            a(74);
        }
        return c1Var;
    }

    public c1 S(l lVar) {
        if (lVar == null) {
            a(54);
        }
        c1 c1VarS = R(lVar).s();
        if (c1VarS == null) {
            a(55);
        }
        return c1VarS;
    }

    public c1 U() {
        c1 c1VarS = S(l.f11810s);
        if (c1VarS == null) {
            a(58);
        }
        return c1VarS;
    }

    protected dg.n V() {
        dg.n nVar = this.f11794f;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    public he.e W() {
        return q("String");
    }

    public c1 X() {
        c1 c1VarS = W().s();
        if (c1VarS == null) {
            a(66);
        }
        return c1VarS;
    }

    public he.e Y(int i10) {
        he.e eVarP = p(o.f11853s.b(mf.f.h(o.d(i10))));
        if (eVarP == null) {
            a(18);
        }
        return eVarP;
    }

    public he.e Z() {
        return q("Unit");
    }

    public c1 a0() {
        c1 c1VarS = Z().s();
        if (c1VarS == null) {
            a(65);
        }
        return c1VarS;
    }

    protected void f(boolean z10) {
        f0 f0Var = new f0(f11788g, this.f11794f, this, null);
        this.f11789a = f0Var;
        f0Var.O0(ee.b.f11780a.c().a(this.f11794f, this.f11789a, w(), N(), g(), z10));
        f0 f0Var2 = this.f11789a;
        f0Var2.W0(f0Var2);
    }

    protected je.a g() {
        a.C0241a c0241a = a.C0241a.f18650a;
        if (c0241a == null) {
            a(3);
        }
        return c0241a;
    }

    public he.e h() {
        return q("Any");
    }

    public c1 i() {
        c1 c1VarS = h().s();
        if (c1VarS == null) {
            a(51);
        }
        return c1VarS;
    }

    public he.e j() {
        return q("Array");
    }

    public r0 k(r0 r0Var) {
        if (r0Var == null) {
            a(68);
        }
        r0 r0VarL = l(r0Var);
        if (r0VarL != null) {
            return r0VarL;
        }
        throw new IllegalStateException("not array: " + r0Var);
    }

    public r0 l(r0 r0Var) {
        r0 r0VarB;
        if (r0Var == null) {
            a(70);
        }
        if (d0(r0Var)) {
            if (r0Var.L0().size() != 1) {
                return null;
            }
            return ((a2) r0Var.L0().get(0)).getType();
        }
        r0 r0VarN = i2.n(r0Var);
        r0 r0Var2 = (r0) ((e) this.f11791c.a()).f11802c.get(r0VarN);
        if (r0Var2 != null) {
            return r0Var2;
        }
        h0 h0VarH = qf.i.h(r0VarN);
        if (h0VarH == null || (r0VarB = B(r0VarN, h0VarH)) == null) {
            return null;
        }
        return r0VarB;
    }

    public c1 m(m2 m2Var, r0 r0Var) {
        if (m2Var == null) {
            a(82);
        }
        if (r0Var == null) {
            a(83);
        }
        c1 c1VarN = n(m2Var, r0Var, ie.h.f16054l.b());
        if (c1VarN == null) {
            a(84);
        }
        return c1VarN;
    }

    public c1 n(m2 m2Var, r0 r0Var, ie.h hVar) {
        if (m2Var == null) {
            a(78);
        }
        if (r0Var == null) {
            a(79);
        }
        if (hVar == null) {
            a(80);
        }
        c1 c1VarH = u0.h(r1.b(hVar), j(), Collections.singletonList(new c2(m2Var, r0Var)));
        if (c1VarH == null) {
            a(81);
        }
        return c1VarH;
    }

    public c1 o() {
        c1 c1VarS = S(l.f11807g);
        if (c1VarS == null) {
            a(64);
        }
        return c1VarS;
    }

    public he.e p(mf.c cVar) {
        if (cVar == null) {
            a(12);
        }
        he.e eVarD = he.s.d(s(), cVar, pe.d.f24116d);
        if (eVarD == null) {
            a(13);
        }
        return eVarD;
    }

    public f0 s() {
        if (this.f11789a == null) {
            this.f11789a = (f0) this.f11790b.a();
        }
        f0 f0Var = this.f11789a;
        if (f0Var == null) {
            a(7);
        }
        return f0Var;
    }

    public xf.k t() {
        xf.k kVarP = s().y(o.B).p();
        if (kVarP == null) {
            a(11);
        }
        return kVarP;
    }

    public c1 u() {
        c1 c1VarS = S(l.f11809r);
        if (c1VarS == null) {
            a(57);
        }
        return c1VarS;
    }

    public c1 v() {
        c1 c1VarS = S(l.f11808h);
        if (c1VarS == null) {
            a(63);
        }
        return c1VarS;
    }

    protected Iterable w() {
        List listSingletonList = Collections.singletonList(new fe.a(this.f11794f, s()));
        if (listSingletonList == null) {
            a(5);
        }
        return listSingletonList;
    }

    public he.e x() {
        he.e eVarP = p(o.a.X);
        if (eVarP == null) {
            a(35);
        }
        return eVarP;
    }

    public he.e y() {
        return q("Comparable");
    }

    public c1 z() {
        c1 c1VarJ = J();
        if (c1VarJ == null) {
            a(53);
        }
        return c1VarJ;
    }
}
