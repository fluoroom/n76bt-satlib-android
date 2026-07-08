package pf;

import ee.o;
import eg.a2;
import eg.c1;
import eg.g1;
import eg.i0;
import eg.i2;
import eg.l2;
import eg.m2;
import eg.n2;
import eg.q0;
import eg.r0;
import eg.u1;
import eg.v0;
import he.a1;
import he.b;
import he.b1;
import he.h0;
import he.k1;
import he.l1;
import he.m0;
import he.n0;
import he.p1;
import he.s1;
import he.t1;
import he.u0;
import he.w0;
import he.x0;
import he.y0;
import he.z0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pf.n;
import sf.s;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends n implements w {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z f24193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final dd.j f24194n;

    private final class a implements he.o {

        /* JADX INFO: renamed from: pf.u$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0333a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f24196a;

            static {
                int[] iArr = new int[e0.values().length];
                try {
                    iArr[e0.f24156a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e0.f24157b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e0.f24158c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f24196a = iArr;
            }
        }

        public a() {
        }

        private final void t(x0 x0Var, StringBuilder sb2, String str) throws IOException {
            int i10 = C0333a.f24196a[u.this.P0().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    p(x0Var, sb2);
                    return;
                } else {
                    if (i10 != 3) {
                        throw new dd.o();
                    }
                    return;
                }
            }
            u.this.w1(x0Var, sb2);
            sb2.append(str + " for ");
            u uVar = u.this;
            y0 y0VarC0 = x0Var.C0();
            rd.m.d(y0VarC0, "getCorrespondingProperty(...)");
            uVar.h2(y0VarC0, sb2);
        }

        public void A(s1 s1Var, StringBuilder sb2) {
            rd.m.e(s1Var, "descriptor");
            rd.m.e(sb2, "builder");
            u.this.B2(s1Var, true, sb2, true);
        }

        @Override // he.o
        public /* bridge */ /* synthetic */ Object a(he.z zVar, Object obj) throws IOException {
            p(zVar, (StringBuilder) obj);
            return dd.d0.f10897a;
        }

        @Override // he.o
        public /* bridge */ /* synthetic */ Object b(l1 l1Var, Object obj) {
            z(l1Var, (StringBuilder) obj);
            return dd.d0.f10897a;
        }

        @Override // he.o
        public /* bridge */ /* synthetic */ Object c(z0 z0Var, Object obj) throws IOException {
            v(z0Var, (StringBuilder) obj);
            return dd.d0.f10897a;
        }

        @Override // he.o
        public /* bridge */ /* synthetic */ Object d(b1 b1Var, Object obj) {
            x(b1Var, (StringBuilder) obj);
            return dd.d0.f10897a;
        }

        @Override // he.o
        public /* bridge */ /* synthetic */ Object e(he.l lVar, Object obj) throws IOException {
            o(lVar, (StringBuilder) obj);
            return dd.d0.f10897a;
        }

        @Override // he.o
        public /* bridge */ /* synthetic */ Object f(k1 k1Var, Object obj) {
            y(k1Var, (StringBuilder) obj);
            return dd.d0.f10897a;
        }

        @Override // he.o
        public /* bridge */ /* synthetic */ Object g(a1 a1Var, Object obj) throws IOException {
            w(a1Var, (StringBuilder) obj);
            return dd.d0.f10897a;
        }

        @Override // he.o
        public /* bridge */ /* synthetic */ Object h(he.e eVar, Object obj) throws IOException {
            n(eVar, (StringBuilder) obj);
            return dd.d0.f10897a;
        }

        @Override // he.o
        public /* bridge */ /* synthetic */ Object i(n0 n0Var, Object obj) {
            r(n0Var, (StringBuilder) obj);
            return dd.d0.f10897a;
        }

        @Override // he.o
        public /* bridge */ /* synthetic */ Object j(s1 s1Var, Object obj) {
            A(s1Var, (StringBuilder) obj);
            return dd.d0.f10897a;
        }

        @Override // he.o
        public /* bridge */ /* synthetic */ Object k(u0 u0Var, Object obj) {
            s(u0Var, (StringBuilder) obj);
            return dd.d0.f10897a;
        }

        @Override // he.o
        public /* bridge */ /* synthetic */ Object l(y0 y0Var, Object obj) throws IOException {
            u(y0Var, (StringBuilder) obj);
            return dd.d0.f10897a;
        }

        @Override // he.o
        public /* bridge */ /* synthetic */ Object m(h0 h0Var, Object obj) {
            q(h0Var, (StringBuilder) obj);
            return dd.d0.f10897a;
        }

        public void n(he.e eVar, StringBuilder sb2) throws IOException {
            rd.m.e(eVar, "descriptor");
            rd.m.e(sb2, "builder");
            u.this.C1(eVar, sb2);
        }

        public void o(he.l lVar, StringBuilder sb2) throws IOException {
            rd.m.e(lVar, "constructorDescriptor");
            rd.m.e(sb2, "builder");
            u.this.H1(lVar, sb2);
        }

        public void p(he.z zVar, StringBuilder sb2) throws IOException {
            rd.m.e(zVar, "descriptor");
            rd.m.e(sb2, "builder");
            u.this.P1(zVar, sb2);
        }

        public void q(h0 h0Var, StringBuilder sb2) {
            rd.m.e(h0Var, "descriptor");
            rd.m.e(sb2, "builder");
            u.this.Z1(h0Var, sb2, true);
        }

        public void r(n0 n0Var, StringBuilder sb2) {
            rd.m.e(n0Var, "descriptor");
            rd.m.e(sb2, "builder");
            u.this.d2(n0Var, sb2);
        }

        public void s(u0 u0Var, StringBuilder sb2) {
            rd.m.e(u0Var, "descriptor");
            rd.m.e(sb2, "builder");
            u.this.f2(u0Var, sb2);
        }

        public void u(y0 y0Var, StringBuilder sb2) throws IOException {
            rd.m.e(y0Var, "descriptor");
            rd.m.e(sb2, "builder");
            u.this.h2(y0Var, sb2);
        }

        public void v(z0 z0Var, StringBuilder sb2) throws IOException {
            rd.m.e(z0Var, "descriptor");
            rd.m.e(sb2, "builder");
            t(z0Var, sb2, "getter");
        }

        public void w(a1 a1Var, StringBuilder sb2) throws IOException {
            rd.m.e(a1Var, "descriptor");
            rd.m.e(sb2, "builder");
            t(a1Var, sb2, "setter");
        }

        public void x(b1 b1Var, StringBuilder sb2) {
            rd.m.e(b1Var, "descriptor");
            rd.m.e(sb2, "builder");
            sb2.append(b1Var.getName());
        }

        public void y(k1 k1Var, StringBuilder sb2) {
            rd.m.e(k1Var, "descriptor");
            rd.m.e(sb2, "builder");
            u.this.q2(k1Var, sb2);
        }

        public void z(l1 l1Var, StringBuilder sb2) {
            rd.m.e(l1Var, "descriptor");
            rd.m.e(sb2, "builder");
            u.this.w2(l1Var, sb2, true);
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f24198b;

        static {
            int[] iArr = new int[f0.values().length];
            try {
                iArr[f0.f24162a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f0.f24163b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24197a = iArr;
            int[] iArr2 = new int[d0.values().length];
            try {
                iArr2[d0.f24150a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[d0.f24151b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[d0.f24152c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f24198b = iArr2;
        }
    }

    public u(z zVar) {
        rd.m.e(zVar, "options");
        this.f24193m = zVar;
        zVar.p0();
        this.f24194n = dd.k.b(new o(this));
    }

    static /* synthetic */ void A1(u uVar, StringBuilder sb2, ie.a aVar, ie.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        uVar.z1(sb2, aVar, eVar);
    }

    static /* synthetic */ void A2(u uVar, t1 t1Var, StringBuilder sb2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        uVar.z2(t1Var, sb2, z10);
    }

    private final void B1(he.i iVar, StringBuilder sb2) {
        List listV = iVar.v();
        rd.m.d(listV, "getDeclaredTypeParameters(...)");
        List parameters = iVar.k().getParameters();
        rd.m.d(parameters, "getParameters(...)");
        if (j1() && iVar.N() && parameters.size() > listV.size()) {
            sb2.append(" /*captured type parameters: ");
            x2(sb2, parameters.subList(listV.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B2(he.s1 r9, boolean r10, java.lang.StringBuilder r11, boolean r12) {
        /*
            r8 = this;
            if (r12 == 0) goto L10
            java.lang.String r2 = "value-parameter"
            java.lang.String r2 = r8.S1(r2)
            r11.append(r2)
            java.lang.String r2 = " "
            r11.append(r2)
        L10:
            boolean r2 = r8.j1()
            if (r2 == 0) goto L27
            java.lang.String r2 = "/*"
            r11.append(r2)
            int r2 = r9.getIndex()
            r11.append(r2)
        */
        //  java.lang.String r2 = "*/ "
        /*
            r11.append(r2)
        L27:
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r8
            r2 = r9
            r1 = r11
            A1(r0, r1, r2, r3, r4, r5)
            boolean r2 = r9.b0()
            java.lang.String r3 = "crossinline"
            r8.Y1(r11, r2, r3)
            boolean r2 = r9.Z()
            java.lang.String r3 = "noinline"
            r8.Y1(r11, r2, r3)
            boolean r2 = r8.Y0()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L60
            he.a r2 = r9.b()
            boolean r3 = r2 instanceof he.d
            if (r3 == 0) goto L55
            he.d r2 = (he.d) r2
            goto L56
        L55:
            r2 = 0
        L56:
            if (r2 == 0) goto L60
            boolean r2 = r2.D()
            if (r2 != r7) goto L60
            r5 = 1
            goto L61
        L60:
            r5 = 0
        L61:
            if (r5 == 0) goto L6c
            boolean r2 = r8.t0()
            java.lang.String r3 = "actual"
            r8.Y1(r11, r2, r3)
        L6c:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.D2(r1, r2, r3, r4, r5)
            qd.l r0 = r8.z0()
            if (r0 == 0) goto L8c
            boolean r0 = r8.l()
            if (r0 == 0) goto L85
            boolean r0 = r9.u0()
            goto L89
        L85:
            boolean r0 = uf.e.f(r9)
        L89:
            if (r0 == 0) goto L8c
            r6 = 1
        L8c:
            if (r6 == 0) goto Laf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " = "
            r0.append(r2)
            qd.l r2 = r8.z0()
            rd.m.b(r2)
            java.lang.Object r2 = r2.l(r9)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.u.B2(he.s1, boolean, java.lang.StringBuilder, boolean):void");
    }

    private final u C0() {
        return (u) this.f24194n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(he.e eVar, StringBuilder sb2) throws IOException {
        he.d dVarT;
        boolean z10 = eVar.j() == he.f.f15274e;
        if (!d1()) {
            List listH0 = eVar.H0();
            rd.m.d(listH0, "getContextReceivers(...)");
            J1(listH0, sb2);
            A1(this, sb2, eVar, null, 2, null);
            if (!z10) {
                he.u visibility = eVar.getVisibility();
                rd.m.d(visibility, "getVisibility(...)");
                E2(visibility, sb2);
            }
            if ((eVar.j() != he.f.f15272c || eVar.l() != he.e0.f15262e) && (!eVar.j().d() || eVar.l() != he.e0.f15259b)) {
                he.e0 e0VarL = eVar.l();
                rd.m.d(e0VarL, "getModality(...)");
                W1(e0VarL, sb2, r1(eVar));
            }
            U1(eVar, sb2);
            Y1(sb2, I0().contains(v.f24206r) && eVar.N(), "inner");
            Y1(sb2, I0().contains(v.f24208t) && eVar.isData(), "data");
            Y1(sb2, I0().contains(v.f24209u) && eVar.isInline(), "inline");
            Y1(sb2, I0().contains(v.A) && eVar.m(), "value");
            Y1(sb2, I0().contains(v.f24214z) && eVar.G(), "fun");
            D1(eVar, sb2);
        }
        if (qf.i.x(eVar)) {
            F1(eVar, sb2);
        } else {
            if (!d1()) {
                m2(sb2);
            }
            Z1(eVar, sb2, true);
        }
        if (z10) {
            return;
        }
        List listV = eVar.v();
        rd.m.d(listV, "getDeclaredTypeParameters(...)");
        y2(listV, sb2, false);
        B1(eVar, sb2);
        if (!eVar.j().d() && x0() && (dVarT = eVar.T()) != null) {
            sb2.append(" ");
            A1(this, sb2, dVarT, null, 2, null);
            he.u visibility2 = dVarT.getVisibility();
            rd.m.d(visibility2, "getVisibility(...)");
            E2(visibility2, sb2);
            sb2.append(S1("constructor"));
            List listI = dVarT.i();
            rd.m.d(listI, "getValueParameters(...)");
            C2(listI, dVarT.J(), sb2);
        }
        n2(eVar, sb2);
        F2(listV, sb2);
    }

    private final void C2(Collection collection, boolean z10, StringBuilder sb2) {
        boolean zH2 = H2(z10);
        int size = collection.size();
        i1().b(size, sb2);
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            s1 s1Var = (s1) it.next();
            i1().d(s1Var, i10, size, sb2);
            B2(s1Var, zH2, sb2, false);
            i1().a(s1Var, i10, size, sb2);
            i10++;
        }
        i1().c(size, sb2);
    }

    private final void D1(he.e eVar, StringBuilder sb2) {
        sb2.append(S1(n.f24173a.a(eVar)));
    }

    private final void D2(t1 t1Var, boolean z10, StringBuilder sb2, boolean z11, boolean z12) {
        r0 type = t1Var.getType();
        rd.m.d(type, "getType(...)");
        s1 s1Var = t1Var instanceof s1 ? (s1) t1Var : null;
        r0 r0VarK0 = s1Var != null ? s1Var.k0() : null;
        r0 r0Var = r0VarK0 == null ? type : r0VarK0;
        Y1(sb2, r0VarK0 != null, "vararg");
        if (z12 || (z11 && !d1())) {
            z2(t1Var, sb2, z12);
        }
        if (z10) {
            Z1(t1Var, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(S(r0Var));
        R1(t1Var, sb2);
        if (!j1() || r0VarK0 == null) {
            return;
        }
        sb2.append(" /*");
        sb2.append(S(type));
        sb2.append("*/");
    }

    private final boolean E2(he.u uVar, StringBuilder sb2) {
        if (!I0().contains(v.f24202e)) {
            return false;
        }
        if (J0()) {
            uVar = uVar.f();
        }
        if (!X0() && rd.m.a(uVar, he.t.f15316l)) {
            return false;
        }
        sb2.append(S1(uVar.c()));
        sb2.append(" ");
        return true;
    }

    private final void F1(he.m mVar, StringBuilder sb2) {
        if (S0()) {
            if (d1()) {
                sb2.append("companion object");
            }
            m2(sb2);
            he.m mVarB = mVar.b();
            if (mVarB != null) {
                sb2.append("of ");
                mf.f name = mVarB.getName();
                rd.m.d(name, "getName(...)");
                sb2.append(R(name, false));
            }
        }
        if (j1() || !rd.m.a(mVar.getName(), mf.h.f22013d)) {
            if (!d1()) {
                m2(sb2);
            }
            mf.f name2 = mVar.getName();
            rd.m.d(name2, "getName(...)");
            sb2.append(R(name2, true));
        }
    }

    private final void F2(List list, StringBuilder sb2) throws IOException {
        if (o1()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l1 l1Var = (l1) it.next();
            List upperBounds = l1Var.getUpperBounds();
            rd.m.d(upperBounds, "getUpperBounds(...)");
            for (r0 r0Var : ed.q.V(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                mf.f name = l1Var.getName();
                rd.m.d(name, "getName(...)");
                sb3.append(R(name, false));
                sb3.append(" : ");
                rd.m.b(r0Var);
                sb3.append(S(r0Var));
                arrayList.add(sb3.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(" ");
        sb2.append(S1("where"));
        sb2.append(" ");
        ed.b0.f0(arrayList, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
    }

    private final String G1(sf.g gVar) {
        qd.l lVarP = this.f24193m.P();
        if (lVarP != null) {
            return (String) lVarP.l(gVar);
        }
        if (gVar instanceof sf.b) {
            Iterable iterable = (Iterable) ((sf.b) gVar).b();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strG1 = G1((sf.g) it.next());
                if (strG1 != null) {
                    arrayList.add(strG1);
                }
            }
            return ed.q.i0(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (gVar instanceof sf.a) {
            return rg.q.v0(n.O(this, (ie.c) ((sf.a) gVar).b(), null, 2, null), "@");
        }
        if (!(gVar instanceof sf.s)) {
            return gVar.toString();
        }
        s.b bVar = (s.b) ((sf.s) gVar).b();
        if (bVar instanceof s.b.a) {
            return ((s.b.a) bVar).a() + "::class";
        }
        if (!(bVar instanceof s.b.C0378b)) {
            throw new dd.o();
        }
        s.b.C0378b c0378b = (s.b.C0378b) bVar;
        String strA = c0378b.b().a().a();
        for (int i10 = 0; i10 < c0378b.a(); i10++) {
            strA = "kotlin.Array<" + strA + '>';
        }
        return strA + "::class";
    }

    private final boolean G2(r0 r0Var) {
        if (!ee.h.p(r0Var)) {
            return false;
        }
        List listL0 = r0Var.L0();
        if (d.h0.a(listL0) && listL0.isEmpty()) {
            return true;
        }
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            if (((a2) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H1(he.l r18, java.lang.StringBuilder r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.u.H1(he.l, java.lang.StringBuilder):void");
    }

    private final boolean H2(boolean z10) {
        int i10 = b.f24198b[M0().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return !z10;
        }
        if (i10 == 3) {
            return false;
        }
        throw new dd.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence I1(s1 s1Var) {
        return "";
    }

    private final void J1(List list, StringBuilder sb2) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            b1 b1Var = (b1) it.next();
            z1(sb2, b1Var, ie.e.f16041h);
            r0 type = b1Var.getType();
            rd.m.d(type, "getType(...)");
            sb2.append(N1(type));
            if (i10 == ed.q.m(list)) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i10 = i11;
        }
    }

    private final void K1(StringBuilder sb2, r0 r0Var) {
        A1(this, sb2, r0Var, null, 2, null);
        eg.y yVar = r0Var instanceof eg.y ? (eg.y) r0Var : null;
        if (yVar != null) {
            yVar.Z0();
        }
        if (!v0.a(r0Var)) {
            v2(this, sb2, r0Var, null, 2, null);
            dd.d0 d0Var = dd.d0.f10897a;
        } else if (jg.d.z(r0Var) && O0()) {
            sb2.append(L1(gg.l.f14501a.p(r0Var)));
        } else {
            if (!(r0Var instanceof gg.i) || H0()) {
                sb2.append(r0Var.N0().toString());
            } else {
                sb2.append(((gg.i) r0Var).W0());
            }
            sb2.append(r2(r0Var.L0()));
        }
        if (r0Var.O0()) {
            sb2.append("?");
        }
        if (g1.c(r0Var)) {
            sb2.append(" & Any");
        }
    }

    private final String L1(String str) {
        int i10 = b.f24197a[e1().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new dd.o();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    private final void M1(StringBuilder sb2, eg.a aVar) {
        f0 f0VarE1 = e1();
        f0 f0Var = f0.f24163b;
        if (f0VarE1 == f0Var) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("= ");
        b2(sb2, aVar.X());
        sb2.append(" */");
        if (e1() == f0Var) {
            sb2.append("</i></font>");
        }
    }

    private final String N1(r0 r0Var) {
        String strS = S(r0Var);
        if ((!G2(r0Var) || i2.l(r0Var)) && !(r0Var instanceof eg.y)) {
            return strS;
        }
        return '(' + strS + ')';
    }

    private final String O1(List list) {
        return q0(g0.c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1(he.z zVar, StringBuilder sb2) throws IOException {
        he.z zVar2;
        StringBuilder sb3;
        if (d1()) {
            zVar2 = zVar;
            sb3 = sb2;
        } else {
            if (c1()) {
                zVar2 = zVar;
                sb3 = sb2;
            } else {
                List listQ0 = zVar.q0();
                rd.m.d(listQ0, "getContextReceiverParameters(...)");
                J1(listQ0, sb2);
                zVar2 = zVar;
                sb3 = sb2;
                A1(this, sb3, zVar2, null, 2, null);
                he.u visibility = zVar2.getVisibility();
                rd.m.d(visibility, "getVisibility(...)");
                E2(visibility, sb3);
                X1(zVar2, sb3);
                if (D0()) {
                    U1(zVar2, sb3);
                }
                c2(zVar2, sb3);
                if (D0()) {
                    x1(zVar2, sb3);
                } else {
                    p2(zVar2, sb3);
                }
                T1(zVar2, sb3);
                if (j1()) {
                    if (zVar2.w0()) {
                        sb3.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (zVar2.D0()) {
                        sb3.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb3.append(S1("fun"));
            sb3.append(" ");
            List typeParameters = zVar2.getTypeParameters();
            rd.m.d(typeParameters, "getTypeParameters(...)");
            y2(typeParameters, sb3, true);
            j2(zVar2, sb3);
        }
        Z1(zVar2, sb3, true);
        List listI = zVar2.i();
        rd.m.d(listI, "getValueParameters(...)");
        C2(listI, zVar2.J(), sb3);
        k2(zVar2, sb3);
        r0 r0VarG = zVar2.g();
        if (!m1() && (h1() || r0VarG == null || !ee.i.D0(r0VarG))) {
            sb3.append(": ");
            sb3.append(r0VarG == null ? "[NULL]" : S(r0VarG));
        }
        List typeParameters2 = zVar2.getTypeParameters();
        rd.m.d(typeParameters2, "getTypeParameters(...)");
        F2(typeParameters2, sb3);
    }

    private final void Q1(StringBuilder sb2, r0 r0Var) {
        mf.f fVarD;
        int length = sb2.length();
        A1(C0(), sb2, r0Var, null, 2, null);
        boolean z10 = sb2.length() != length;
        r0 r0VarK = ee.h.k(r0Var);
        List listE = ee.h.e(r0Var);
        boolean zR = ee.h.r(r0Var);
        boolean zO0 = r0Var.O0();
        boolean z11 = zO0 || (z10 && r0VarK != null);
        if (z11) {
            if (zR) {
                sb2.insert(length, '(');
            } else {
                if (z10) {
                    rg.a.c(rg.q.Z0(sb2));
                    if (sb2.charAt(rg.q.W(sb2) - 1) != ')') {
                        sb2.insert(rg.q.W(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        Y1(sb2, zR, "suspend");
        if (!listE.isEmpty()) {
            sb2.append("context(");
            Iterator it = listE.subList(0, ed.q.m(listE)).iterator();
            while (it.hasNext()) {
                a2(sb2, (r0) it.next());
                sb2.append(", ");
            }
            a2(sb2, (r0) ed.q.k0(listE));
            sb2.append(") ");
        }
        if (r0VarK != null) {
            boolean z12 = (G2(r0VarK) && !r0VarK.O0()) || q1(r0VarK) || (r0VarK instanceof eg.y);
            if (z12) {
                sb2.append("(");
            }
            a2(sb2, r0VarK);
            if (z12) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (!ee.h.n(r0Var) || r0Var.L0().size() > 1) {
            int i10 = 0;
            for (a2 a2Var : ee.h.m(r0Var)) {
                int i11 = i10 + 1;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (N0()) {
                    r0 type = a2Var.getType();
                    rd.m.d(type, "getType(...)");
                    fVarD = ee.h.d(type);
                } else {
                    fVarD = null;
                }
                if (fVarD != null) {
                    sb2.append(R(fVarD, false));
                    sb2.append(": ");
                }
                sb2.append(T(a2Var));
                i10 = i11;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        sb2.append(p0());
        sb2.append(" ");
        a2(sb2, ee.h.l(r0Var));
        if (z11) {
            sb2.append(")");
        }
        if (zO0) {
            sb2.append("?");
        }
    }

    private final void R1(t1 t1Var, StringBuilder sb2) {
        sf.g gVarY;
        String strG1;
        if (!G0() || (gVarY = t1Var.Y()) == null || (strG1 = G1(gVarY)) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(q0(strG1));
    }

    private final String S1(String str) {
        int i10 = b.f24197a[e1().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new dd.o();
            }
            if (!w0()) {
                return "<b>" + str + "</b>";
            }
        }
        return str;
    }

    private final void T1(he.b bVar, StringBuilder sb2) {
        if (I0().contains(v.f24207s) && j1() && bVar.j() != b.a.DECLARATION) {
            sb2.append("/*");
            sb2.append(mg.a.f(bVar.j().name()));
            sb2.append("*/ ");
        }
    }

    private final void U1(he.d0 d0Var, StringBuilder sb2) {
        Y1(sb2, d0Var.A(), "external");
        boolean z10 = false;
        Y1(sb2, I0().contains(v.f24210v) && d0Var.M(), "expect");
        if (I0().contains(v.f24211w) && d0Var.F0()) {
            z10 = true;
        }
        Y1(sb2, z10, "actual");
    }

    private final void W1(he.e0 e0Var, StringBuilder sb2, he.e0 e0Var2) {
        if (W0() || e0Var != e0Var2) {
            Y1(sb2, I0().contains(v.f24203f), mg.a.f(e0Var.name()));
        }
    }

    private final void X1(he.b bVar, StringBuilder sb2) {
        if (qf.i.J(bVar) && bVar.l() == he.e0.f15259b) {
            return;
        }
        if (L0() == c0.f24144a && bVar.l() == he.e0.f15261d && u1(bVar)) {
            return;
        }
        he.e0 e0VarL = bVar.l();
        rd.m.d(e0VarL, "getModality(...)");
        W1(e0VarL, sb2, r1(bVar));
    }

    private final void Y1(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(S1(str));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(he.m mVar, StringBuilder sb2, boolean z10) {
        mf.f name = mVar.getName();
        rd.m.d(name, "getName(...)");
        sb2.append(R(name, z10));
    }

    private final void a2(StringBuilder sb2, r0 r0Var) {
        l2 l2VarQ0 = r0Var.Q0();
        eg.a aVar = l2VarQ0 instanceof eg.a ? (eg.a) l2VarQ0 : null;
        if (aVar == null) {
            b2(sb2, r0Var);
            return;
        }
        if (Z0()) {
            b2(sb2, aVar.X());
            if (R0()) {
                v1(sb2, aVar);
                return;
            }
            return;
        }
        b2(sb2, aVar.Z0());
        if (a1()) {
            M1(sb2, aVar);
        }
    }

    private final void b2(StringBuilder sb2, r0 r0Var) {
        if ((r0Var instanceof n2) && l() && !((n2) r0Var).S0()) {
            sb2.append("<Not computed yet>");
            return;
        }
        l2 l2VarQ0 = r0Var.Q0();
        if (l2VarQ0 instanceof i0) {
            sb2.append(((i0) l2VarQ0).X0(this, this));
        } else {
            if (!(l2VarQ0 instanceof c1)) {
                throw new dd.o();
            }
            l2(sb2, (c1) l2VarQ0);
        }
    }

    private final void c2(he.b bVar, StringBuilder sb2) {
        if (I0().contains(v.f24204g) && u1(bVar) && L0() != c0.f24145b) {
            Y1(sb2, true, "override");
            if (j1()) {
                sb2.append("/*");
                sb2.append(bVar.e().size());
                sb2.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d2(n0 n0Var, StringBuilder sb2) {
        e2(n0Var.d(), "package-fragment", sb2);
        if (l()) {
            sb2.append(" in ");
            Z1(n0Var.b(), sb2, false);
        }
    }

    private final void e2(mf.c cVar, String str, StringBuilder sb2) {
        sb2.append(S1(str));
        String strQ = Q(cVar.i());
        if (strQ.length() > 0) {
            sb2.append(" ");
            sb2.append(strQ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f2(u0 u0Var, StringBuilder sb2) {
        e2(u0Var.d(), "package", sb2);
        if (l()) {
            sb2.append(" in context of ");
            Z1(u0Var.v0(), sb2, false);
        }
    }

    private final void g2(StringBuilder sb2, w0 w0Var) {
        w0 w0VarC = w0Var.c();
        if (w0VarC != null) {
            g2(sb2, w0VarC);
            sb2.append('.');
            mf.f name = w0Var.b().getName();
            rd.m.d(name, "getName(...)");
            sb2.append(R(name, false));
        } else {
            u1 u1VarK = w0Var.b().k();
            rd.m.d(u1VarK, "getTypeConstructor(...)");
            sb2.append(s2(u1VarK));
        }
        sb2.append(r2(w0Var.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(y0 y0Var, StringBuilder sb2) throws IOException {
        y0 y0Var2;
        StringBuilder sb3;
        if (d1()) {
            y0Var2 = y0Var;
            sb3 = sb2;
        } else {
            if (!c1()) {
                List listQ0 = y0Var.q0();
                rd.m.d(listQ0, "getContextReceiverParameters(...)");
                J1(listQ0, sb2);
                i2(y0Var, sb2);
                he.u visibility = y0Var.getVisibility();
                rd.m.d(visibility, "getVisibility(...)");
                E2(visibility, sb2);
                boolean z10 = false;
                Y1(sb2, I0().contains(v.f24212x) && y0Var.C(), "const");
                U1(y0Var, sb2);
                X1(y0Var, sb2);
                c2(y0Var, sb2);
                if (I0().contains(v.f24213y) && y0Var.r0()) {
                    z10 = true;
                }
                Y1(sb2, z10, "lateinit");
                T1(y0Var, sb2);
            }
            y0Var2 = y0Var;
            sb3 = sb2;
            A2(this, y0Var2, sb3, false, 4, null);
            List typeParameters = y0Var2.getTypeParameters();
            rd.m.d(typeParameters, "getTypeParameters(...)");
            y2(typeParameters, sb3, true);
            j2(y0Var2, sb3);
        }
        Z1(y0Var2, sb3, true);
        sb3.append(": ");
        r0 type = y0Var2.getType();
        rd.m.d(type, "getType(...)");
        sb3.append(S(type));
        k2(y0Var2, sb3);
        R1(y0Var2, sb3);
        List typeParameters2 = y0Var2.getTypeParameters();
        rd.m.d(typeParameters2, "getTypeParameters(...)");
        F2(typeParameters2, sb3);
    }

    private final void i2(y0 y0Var, StringBuilder sb2) {
        if (I0().contains(v.f24205h)) {
            A1(this, sb2, y0Var, null, 2, null);
            he.w wVarP0 = y0Var.p0();
            if (wVarP0 != null) {
                z1(sb2, wVarP0, ie.e.f16036c);
            }
            he.w wVarM0 = y0Var.m0();
            if (wVarM0 != null) {
                z1(sb2, wVarM0, ie.e.f16044t);
            }
            if (P0() == e0.f24158c) {
                z0 z0VarF = y0Var.f();
                if (z0VarF != null) {
                    z1(sb2, z0VarF, ie.e.f16039f);
                }
                a1 a1VarH = y0Var.h();
                if (a1VarH != null) {
                    z1(sb2, a1VarH, ie.e.f16040g);
                    List listI = a1VarH.i();
                    rd.m.d(listI, "getValueParameters(...)");
                    s1 s1Var = (s1) ed.q.w0(listI);
                    rd.m.b(s1Var);
                    z1(sb2, s1Var, ie.e.f16043s);
                }
            }
        }
    }

    private final void j2(he.a aVar, StringBuilder sb2) {
        b1 b1VarL0 = aVar.l0();
        if (b1VarL0 != null) {
            z1(sb2, b1VarL0, ie.e.f16041h);
            r0 type = b1VarL0.getType();
            rd.m.d(type, "getType(...)");
            sb2.append(N1(type));
            sb2.append(".");
        }
    }

    private final void k2(he.a aVar, StringBuilder sb2) {
        b1 b1VarL0;
        if (Q0() && (b1VarL0 = aVar.l0()) != null) {
            sb2.append(" on ");
            r0 type = b1VarL0.getType();
            rd.m.d(type, "getType(...)");
            sb2.append(S(type));
        }
    }

    private final void l2(StringBuilder sb2, c1 c1Var) {
        if (rd.m.a(c1Var, i2.f12112b) || i2.k(c1Var)) {
            sb2.append("???");
            return;
        }
        if (gg.l.o(c1Var)) {
            if (!g1()) {
                sb2.append("???");
                return;
            }
            u1 u1VarN0 = c1Var.N0();
            rd.m.c(u1VarN0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(L1(((gg.j) u1VarN0).b(0)));
            return;
        }
        if (v0.a(c1Var)) {
            K1(sb2, c1Var);
        } else if (G2(c1Var)) {
            Q1(sb2, c1Var);
        } else {
            K1(sb2, c1Var);
        }
    }

    private final void m0(StringBuilder sb2, he.m mVar) {
        he.m mVarB;
        String name;
        if ((mVar instanceof n0) || (mVar instanceof u0) || (mVarB = mVar.b()) == null || (mVarB instanceof h0)) {
            return;
        }
        sb2.append(" ");
        sb2.append(V1("defined in"));
        sb2.append(" ");
        mf.d dVarM = qf.i.m(mVarB);
        rd.m.d(dVarM, "getFqName(...)");
        sb2.append(dVarM.e() ? "root package" : Q(dVarM));
        if (l1() && (mVarB instanceof n0) && (mVar instanceof he.p) && (name = ((he.p) mVar).getSource().a().getName()) != null) {
            sb2.append(" ");
            sb2.append(V1("in file"));
            sb2.append(" ");
            sb2.append(name);
        }
    }

    private final void m2(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    private final void n0(StringBuilder sb2, List list) throws IOException {
        ed.b0.f0(list, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new q(this));
    }

    private final void n2(he.e eVar, StringBuilder sb2) throws IOException {
        if (n1() || ee.i.o0(eVar.s())) {
            return;
        }
        Collection collectionE = eVar.k().e();
        rd.m.d(collectionE, "getSupertypes(...)");
        if (collectionE.isEmpty()) {
            return;
        }
        if (collectionE.size() == 1 && ee.i.c0((r0) collectionE.iterator().next())) {
            return;
        }
        m2(sb2);
        sb2.append(": ");
        ed.b0.f0(collectionE, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new s(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence o0(u uVar, a2 a2Var) {
        rd.m.e(a2Var, "it");
        if (a2Var.b()) {
            return "*";
        }
        r0 type = a2Var.getType();
        rd.m.d(type, "getType(...)");
        String strS = uVar.S(type);
        if (a2Var.a() == m2.f12140e) {
            return strS;
        }
        return a2Var.a() + ' ' + strS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence o2(u uVar, r0 r0Var) {
        rd.m.b(r0Var);
        return uVar.S(r0Var);
    }

    private final String p0() {
        int i10 = b.f24197a[e1().ordinal()];
        if (i10 == 1) {
            return q0("->");
        }
        if (i10 == 2) {
            return "&rarr;";
        }
        throw new dd.o();
    }

    private final String p1() {
        return q0(">");
    }

    private final void p2(he.z zVar, StringBuilder sb2) {
        Y1(sb2, zVar.t(), "suspend");
    }

    private final String q0(String str) {
        return e1().d(str);
    }

    private final boolean q1(r0 r0Var) {
        return ee.h.r(r0Var) || !r0Var.getAnnotations().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q2(k1 k1Var, StringBuilder sb2) {
        A1(this, sb2, k1Var, null, 2, null);
        he.u visibility = k1Var.getVisibility();
        rd.m.d(visibility, "getVisibility(...)");
        E2(visibility, sb2);
        U1(k1Var, sb2);
        sb2.append(S1("typealias"));
        sb2.append(" ");
        Z1(k1Var, sb2, true);
        List listV = k1Var.v();
        rd.m.d(listV, "getDeclaredTypeParameters(...)");
        y2(listV, sb2, false);
        B1(k1Var, sb2);
        sb2.append(" = ");
        sb2.append(S(k1Var.h0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u r0(u uVar) {
        n nVarU = uVar.U(t.f24192a);
        rd.m.c(nVarU, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (u) nVarU;
    }

    private final he.e0 r1(he.d0 d0Var) {
        if (d0Var instanceof he.e) {
            return ((he.e) d0Var).j() == he.f.f15272c ? he.e0.f15262e : he.e0.f15259b;
        }
        he.m mVarB = d0Var.b();
        he.e eVar = mVarB instanceof he.e ? (he.e) mVarB : null;
        if (eVar == null) {
            return he.e0.f15259b;
        }
        if (!(d0Var instanceof he.b)) {
            return he.e0.f15259b;
        }
        he.b bVar = (he.b) d0Var;
        Collection collectionE = bVar.e();
        rd.m.d(collectionE, "getOverriddenDescriptors(...)");
        if (!collectionE.isEmpty() && eVar.l() != he.e0.f15259b) {
            return he.e0.f15261d;
        }
        if (eVar.j() != he.f.f15272c || rd.m.a(bVar.getVisibility(), he.t.f15305a)) {
            return he.e0.f15259b;
        }
        he.e0 e0VarL = bVar.l();
        he.e0 e0Var = he.e0.f15262e;
        return e0VarL == e0Var ? e0Var : he.e0.f15261d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 s0(w wVar) {
        rd.m.e(wVar, "$this$withOptions");
        wVar.a(ed.r0.j(wVar.k(), ed.q.n(o.a.C, o.a.D)));
        return dd.d0.f10897a;
    }

    private final boolean s1(ie.c cVar) {
        return rd.m.a(cVar.d(), o.a.E);
    }

    private final String t1() {
        return q0("<");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object t2(r0 r0Var) {
        rd.m.e(r0Var, "it");
        return r0Var;
    }

    private final boolean u1(he.b bVar) {
        return !bVar.e().isEmpty();
    }

    private final void u2(StringBuilder sb2, r0 r0Var, u1 u1Var) {
        w0 w0VarD = p1.d(r0Var);
        if (w0VarD != null) {
            g2(sb2, w0VarD);
        } else {
            sb2.append(s2(u1Var));
            sb2.append(r2(r0Var.L0()));
        }
    }

    private final void v1(StringBuilder sb2, eg.a aVar) {
        f0 f0VarE1 = e1();
        f0 f0Var = f0.f24163b;
        if (f0VarE1 == f0Var) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("from: ");
        b2(sb2, aVar.Z0());
        sb2.append(" */");
        if (e1() == f0Var) {
            sb2.append("</i></font>");
        }
    }

    static /* synthetic */ void v2(u uVar, StringBuilder sb2, r0 r0Var, u1 u1Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            u1Var = r0Var.N0();
        }
        uVar.u2(sb2, r0Var, u1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1(x0 x0Var, StringBuilder sb2) {
        U1(x0Var, sb2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w2(l1 l1Var, StringBuilder sb2, boolean z10) {
        if (z10) {
            sb2.append(t1());
        }
        if (j1()) {
            sb2.append("/*");
            sb2.append(l1Var.getIndex());
            sb2.append("*/ ");
        }
        Y1(sb2, l1Var.I(), "reified");
        String strE = l1Var.n().e();
        boolean z11 = true;
        Y1(sb2, strE.length() > 0, strE);
        A1(this, sb2, l1Var, null, 2, null);
        Z1(l1Var, sb2, z10);
        int size = l1Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            r0 r0Var = (r0) l1Var.getUpperBounds().iterator().next();
            if (!ee.i.k0(r0Var)) {
                sb2.append(" : ");
                rd.m.b(r0Var);
                sb2.append(S(r0Var));
            }
        } else if (z10) {
            for (r0 r0Var2 : l1Var.getUpperBounds()) {
                if (!ee.i.k0(r0Var2)) {
                    if (z11) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    rd.m.b(r0Var2);
                    sb2.append(S(r0Var2));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb2.append(p1());
        }
    }

    private final void x1(he.z zVar, StringBuilder sb2) {
        boolean z10;
        boolean z11 = false;
        if (zVar.S()) {
            Collection collectionE = zVar.e();
            rd.m.d(collectionE, "getOverriddenDescriptors(...)");
            if (!collectionE.isEmpty()) {
                Iterator it = collectionE.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((he.z) it.next()).S()) {
                        if (u0()) {
                            break;
                        }
                    }
                }
                z10 = false;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (zVar.I0()) {
            Collection collectionE2 = zVar.e();
            rd.m.d(collectionE2, "getOverriddenDescriptors(...)");
            if (collectionE2.isEmpty()) {
                z11 = true;
            } else {
                Iterator it2 = collectionE2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((he.z) it2.next()).I0()) {
                        if (u0()) {
                            break;
                        }
                    }
                }
            }
        }
        Y1(sb2, zVar.R(), "tailrec");
        p2(zVar, sb2);
        Y1(sb2, zVar.isInline(), "inline");
        Y1(sb2, z11, "infix");
        Y1(sb2, z10, "operator");
    }

    private final void x2(StringBuilder sb2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w2((l1) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final List y1(ie.c cVar) {
        he.d dVarT;
        List listI;
        Map mapA = cVar.a();
        List listK = null;
        he.e eVarL = V0() ? uf.e.l(cVar) : null;
        if (eVarL != null && (dVarT = eVarL.T()) != null && (listI = dVarT.i()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                if (((s1) obj).u0()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(ed.q.v(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((s1) it.next()).getName());
            }
            listK = arrayList2;
        }
        if (listK == null) {
            listK = ed.q.k();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listK) {
            if (!mapA.containsKey((mf.f) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(ed.q.v(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((mf.f) it2.next()).d() + " = ...");
        }
        Set<Map.Entry> setEntrySet = mapA.entrySet();
        ArrayList arrayList5 = new ArrayList(ed.q.v(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            mf.f fVar = (mf.f) entry.getKey();
            sf.g gVar = (sf.g) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fVar.d());
            sb2.append(" = ");
            sb2.append(!listK.contains(fVar) ? G1(gVar) : "...");
            arrayList5.add(sb2.toString());
        }
        return ed.q.A0(ed.q.s0(arrayList4, arrayList5));
    }

    private final void y2(List list, StringBuilder sb2, boolean z10) {
        if (o1() || list.isEmpty()) {
            return;
        }
        sb2.append(t1());
        x2(sb2, list);
        sb2.append(p1());
        if (z10) {
            sb2.append(" ");
        }
    }

    private final void z1(StringBuilder sb2, ie.a aVar, ie.e eVar) {
        if (I0().contains(v.f24205h)) {
            Set setK = aVar instanceof r0 ? k() : B0();
            qd.l lVarV0 = v0();
            for (ie.c cVar : aVar.getAnnotations()) {
                if (!ed.q.T(setK, cVar.d()) && !s1(cVar) && (lVarV0 == null || ((Boolean) lVarV0.l(cVar)).booleanValue())) {
                    sb2.append(N(cVar, eVar));
                    if (A0()) {
                        sb2.append('\n');
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    private final void z2(t1 t1Var, StringBuilder sb2, boolean z10) {
        if (z10 || !(t1Var instanceof s1)) {
            sb2.append(S1(t1Var.j0() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    public boolean A0() {
        return this.f24193m.B();
    }

    public Set B0() {
        return this.f24193m.C();
    }

    public boolean D0() {
        return this.f24193m.D();
    }

    public boolean E0() {
        return this.f24193m.E();
    }

    public String E1(he.h hVar) {
        rd.m.e(hVar, "klass");
        return gg.l.m(hVar) ? hVar.k().toString() : y0().a(hVar, this);
    }

    public boolean F0() {
        return this.f24193m.F();
    }

    public boolean G0() {
        return this.f24193m.G();
    }

    public boolean H0() {
        return this.f24193m.H();
    }

    public Set I0() {
        return this.f24193m.I();
    }

    public boolean J0() {
        return this.f24193m.J();
    }

    public final z K0() {
        return this.f24193m;
    }

    public c0 L0() {
        return this.f24193m.K();
    }

    @Override // pf.n
    public String M(he.m mVar) {
        rd.m.e(mVar, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        mVar.t0(new a(), sb2);
        if (k1()) {
            m0(sb2, mVar);
        }
        return sb2.toString();
    }

    public d0 M0() {
        return this.f24193m.L();
    }

    @Override // pf.n
    public String N(ie.c cVar, ie.e eVar) throws IOException {
        rd.m.e(cVar, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (eVar != null) {
            sb2.append(eVar.d() + ':');
        }
        r0 type = cVar.getType();
        sb2.append(S(type));
        if (E0()) {
            List listY1 = y1(cVar);
            if (F0() || !listY1.isEmpty()) {
                ed.b0.f0(listY1, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
            }
        }
        if (j1() && (v0.a(type) || (type.N0().q() instanceof m0.b))) {
            sb2.append(" /* annotation class not found */");
        }
        return sb2.toString();
    }

    public boolean N0() {
        return this.f24193m.M();
    }

    public boolean O0() {
        return this.f24193m.N();
    }

    @Override // pf.n
    public String P(String str, String str2, ee.i iVar) {
        rd.m.e(str, "lowerRendered");
        rd.m.e(str2, "upperRendered");
        rd.m.e(iVar, "builtIns");
        if (g0.f(str, str2)) {
            if (!rg.q.J(str2, "(", false, 2, null)) {
                return str + '!';
            }
            return '(' + str + ")!";
        }
        pf.b bVarY0 = y0();
        he.e eVarX = iVar.x();
        rd.m.d(eVarX, "getCollection(...)");
        String strT0 = rg.q.T0(bVarY0.a(eVarX, this), "Collection", null, 2, null);
        String strD = g0.d(str, strT0 + "Mutable", str2, strT0, strT0 + "(Mutable)");
        if (strD != null) {
            return strD;
        }
        String strD2 = g0.d(str, strT0 + "MutableMap.MutableEntry", str2, strT0 + "Map.Entry", strT0 + "(Mutable)Map.(Mutable)Entry");
        if (strD2 != null) {
            return strD2;
        }
        pf.b bVarY02 = y0();
        he.e eVarJ = iVar.j();
        rd.m.d(eVarJ, "getArray(...)");
        String strT02 = rg.q.T0(bVarY02.a(eVarJ, this), "Array", null, 2, null);
        String strD3 = g0.d(str, strT02 + q0("Array<"), str2, strT02 + q0("Array<out "), strT02 + q0("Array<(out) "));
        if (strD3 != null) {
            return strD3;
        }
        return '(' + str + ".." + str2 + ')';
    }

    public e0 P0() {
        return this.f24193m.O();
    }

    @Override // pf.n
    public String Q(mf.d dVar) {
        rd.m.e(dVar, "fqName");
        return O1(dVar.h());
    }

    public boolean Q0() {
        return this.f24193m.Q();
    }

    @Override // pf.n
    public String R(mf.f fVar, boolean z10) {
        rd.m.e(fVar, "name");
        String strQ0 = q0(g0.b(fVar));
        if (!w0() || e1() != f0.f24163b || !z10) {
            return strQ0;
        }
        return "<b>" + strQ0 + "</b>";
    }

    public boolean R0() {
        return this.f24193m.R();
    }

    @Override // pf.n
    public String S(r0 r0Var) {
        rd.m.e(r0Var, "type");
        StringBuilder sb2 = new StringBuilder();
        a2(sb2, (r0) f1().l(r0Var));
        return sb2.toString();
    }

    public boolean S0() {
        return this.f24193m.S();
    }

    @Override // pf.n
    public String T(a2 a2Var) throws IOException {
        rd.m.e(a2Var, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        n0(sb2, ed.q.e(a2Var));
        return sb2.toString();
    }

    public boolean T0() {
        return this.f24193m.T();
    }

    public boolean U0() {
        return this.f24193m.U();
    }

    public boolean V0() {
        return this.f24193m.V();
    }

    public String V1(String str) {
        rd.m.e(str, "message");
        int i10 = b.f24197a[e1().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new dd.o();
        }
        return "<i>" + str + "</i>";
    }

    public boolean W0() {
        return this.f24193m.W();
    }

    public boolean X0() {
        return this.f24193m.X();
    }

    public boolean Y0() {
        return this.f24193m.Y();
    }

    public boolean Z0() {
        return this.f24193m.Z();
    }

    @Override // pf.w
    public void a(Set set) {
        rd.m.e(set, "<set-?>");
        this.f24193m.a(set);
    }

    public boolean a1() {
        return this.f24193m.a0();
    }

    @Override // pf.w
    public void b(boolean z10) {
        this.f24193m.b(z10);
    }

    public boolean b1() {
        return this.f24193m.b0();
    }

    @Override // pf.w
    public void c(Set set) {
        rd.m.e(set, "<set-?>");
        this.f24193m.c(set);
    }

    public boolean c1() {
        return this.f24193m.c0();
    }

    @Override // pf.w
    public void d(boolean z10) {
        this.f24193m.d(z10);
    }

    public boolean d1() {
        return this.f24193m.d0();
    }

    @Override // pf.w
    public boolean e() {
        return this.f24193m.e();
    }

    public f0 e1() {
        return this.f24193m.e0();
    }

    @Override // pf.w
    public void f(boolean z10) {
        this.f24193m.f(z10);
    }

    public qd.l f1() {
        return this.f24193m.f0();
    }

    @Override // pf.w
    public void g(boolean z10) {
        this.f24193m.g(z10);
    }

    public boolean g1() {
        return this.f24193m.g0();
    }

    @Override // pf.w
    public void h(boolean z10) {
        this.f24193m.h(z10);
    }

    public boolean h1() {
        return this.f24193m.h0();
    }

    @Override // pf.w
    public void i(boolean z10) {
        this.f24193m.i(z10);
    }

    public n.b i1() {
        return this.f24193m.i0();
    }

    @Override // pf.w
    public void j(d0 d0Var) {
        rd.m.e(d0Var, "<set-?>");
        this.f24193m.j(d0Var);
    }

    public boolean j1() {
        return this.f24193m.j0();
    }

    @Override // pf.w
    public Set k() {
        return this.f24193m.k();
    }

    public boolean k1() {
        return this.f24193m.k0();
    }

    @Override // pf.w
    public boolean l() {
        return this.f24193m.l();
    }

    public boolean l1() {
        return this.f24193m.l0();
    }

    @Override // pf.w
    public pf.a m() {
        return this.f24193m.m();
    }

    public boolean m1() {
        return this.f24193m.m0();
    }

    @Override // pf.w
    public void n(f0 f0Var) {
        rd.m.e(f0Var, "<set-?>");
        this.f24193m.n(f0Var);
    }

    public boolean n1() {
        return this.f24193m.n0();
    }

    @Override // pf.w
    public void o(boolean z10) {
        this.f24193m.o(z10);
    }

    public boolean o1() {
        return this.f24193m.o0();
    }

    @Override // pf.w
    public void p(pf.b bVar) {
        rd.m.e(bVar, "<set-?>");
        this.f24193m.p(bVar);
    }

    public String r2(List list) throws IOException {
        rd.m.e(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t1());
        n0(sb2, list);
        sb2.append(p1());
        return sb2.toString();
    }

    public String s2(u1 u1Var) {
        rd.m.e(u1Var, "typeConstructor");
        he.h hVarQ = u1Var.q();
        if ((hVarQ instanceof l1) || (hVarQ instanceof he.e) || (hVarQ instanceof k1)) {
            return E1(hVarQ);
        }
        if (hVarQ == null) {
            return u1Var instanceof q0 ? ((q0) u1Var).i(p.f24188a) : u1Var.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + hVarQ.getClass()).toString());
    }

    public boolean t0() {
        return this.f24193m.u();
    }

    public boolean u0() {
        return this.f24193m.v();
    }

    public qd.l v0() {
        return this.f24193m.w();
    }

    public boolean w0() {
        return this.f24193m.x();
    }

    public boolean x0() {
        return this.f24193m.y();
    }

    public pf.b y0() {
        return this.f24193m.z();
    }

    public qd.l z0() {
        return this.f24193m.A();
    }
}
