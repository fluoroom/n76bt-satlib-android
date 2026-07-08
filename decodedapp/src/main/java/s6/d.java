package s6;

import com.fasterxml.jackson.databind.JavaType;
import d6.e0;
import d6.k;
import d6.k0;
import d6.n0;
import d6.p;
import e6.j;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p6.d;
import p6.y;
import t6.b0;
import t6.d0;
import t6.e0;
import t6.g;
import t6.z;
import u6.c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends c0 implements i, s, Serializable {
    protected static final y H = new y("#temporary-name");
    protected final boolean A;
    protected final boolean B;
    protected final Map C;
    protected transient HashMap D;
    protected d0 E;
    protected t6.g F;
    protected final t6.s G;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final JavaType f26911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final k.c f26912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final w f26913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected p6.l f26914h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected p6.l f26915r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected t6.v f26916s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f26917t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f26918u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final t6.c f26919v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected final e0[] f26920w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected t f26921x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected final Set f26922y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected final Set f26923z;

    protected d(e eVar, p6.c cVar, t6.c cVar2, Map map, Set set, boolean z10, Set set2, boolean z11) {
        super(cVar.z());
        this.f26911e = cVar.z();
        w wVarV = eVar.v();
        this.f26913g = wVarV;
        this.f26914h = null;
        this.f26915r = null;
        this.f26916s = null;
        this.f26919v = cVar2;
        this.C = map;
        this.f26922y = set;
        this.A = z10;
        this.f26923z = set2;
        this.f26921x = eVar.q();
        List listS = eVar.s();
        e0[] e0VarArr = (listS == null || listS.isEmpty()) ? null : (e0[]) listS.toArray(new e0[listS.size()]);
        this.f26920w = e0VarArr;
        t6.s sVarT = eVar.t();
        this.G = sVarT;
        this.f26917t = this.E != null || wVarV.k() || wVarV.g() || !wVarV.j();
        this.f26912f = cVar.g(null).i();
        this.B = z11;
        this.f26918u = !this.f26917t && e0VarArr == null && !z11 && sVarT == null;
    }

    private Throwable J1(Throwable th2, p6.h hVar) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        i7.h.i0(th2);
        boolean z10 = hVar == null || hVar.D0(p6.i.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z10 || !(th2 instanceof e6.d)) {
                throw ((IOException) th2);
            }
        } else if (!z10) {
            i7.h.k0(th2);
        }
        return th2;
    }

    private p6.l h1(p6.h hVar, JavaType javaType, x6.p pVar) {
        d.a aVar = new d.a(H, javaType, null, pVar, p6.x.f24068r);
        a7.e eVarN0 = (a7.e) javaType.v();
        if (eVarN0 == null) {
            eVarN0 = hVar.k().n0(javaType);
        }
        p6.l lVar = (p6.l) javaType.w();
        p6.l lVarS0 = lVar == null ? S0(hVar, javaType, aVar) : hVar.p0(lVar, aVar, javaType);
        return eVarN0 != null ? new b0(eVarN0.g(aVar), lVarS0) : lVarS0;
    }

    protected Object A1(e6.j jVar, p6.h hVar) {
        return w1(jVar, hVar);
    }

    protected p6.l B1(p6.h hVar, u uVar) {
        Object objL;
        p6.b bVarZ = hVar.Z();
        if (bVarZ == null || (objL = bVarZ.l(uVar.h())) == null) {
            return null;
        }
        i7.j jVarJ = hVar.j(uVar.h(), objL);
        JavaType javaTypeA = jVarJ.a(hVar.l());
        return new u6.b0(jVarJ, javaTypeA, hVar.T(javaTypeA));
    }

    public u C1(String str) {
        t6.v vVar;
        t6.c cVar = this.f26919v;
        u uVarO = cVar == null ? null : cVar.o(str);
        return (uVarO != null || (vVar = this.f26916s) == null) ? uVarO : vVar.d(str);
    }

    public u D1(y yVar) {
        return C1(yVar.c());
    }

    protected void E1(e6.j jVar, p6.h hVar, Object obj, String str) throws v6.a {
        if (hVar.D0(p6.i.FAIL_ON_IGNORED_PROPERTIES)) {
            throw v6.a.z(jVar, obj, str, l());
        }
        jVar.f1();
    }

    protected Object F1(e6.j jVar, p6.h hVar, e6.r rVar, Object obj, i7.b0 b0Var) throws v6.b, v6.a {
        p6.l lVarJ1 = j1(hVar, obj, b0Var);
        if (lVarJ1 == null) {
            if (b0Var != null) {
                obj = G1(hVar, obj, b0Var);
            }
            return jVar != null ? f(jVar, hVar, obj) : obj;
        }
        if (b0Var != null) {
            b0Var.A0();
            e6.j jVarX1 = b0Var.x1(rVar);
            jVarX1.X0();
            obj = lVarJ1.f(jVarX1, hVar, obj);
        }
        return jVar != null ? lVarJ1.f(jVar, hVar, obj) : obj;
    }

    protected Object G1(p6.h hVar, Object obj, i7.b0 b0Var) throws v6.a {
        b0Var.A0();
        e6.j jVarU1 = b0Var.u1();
        while (jVarU1.X0() != e6.m.END_OBJECT) {
            String strL = jVarU1.l();
            jVarU1.X0();
            b1(jVarU1, hVar, obj, strL);
        }
        return obj;
    }

    protected void H1(e6.j jVar, p6.h hVar, Object obj, String str) throws p6.m {
        if (i7.o.c(str, this.f26922y, this.f26923z)) {
            E1(jVar, hVar, obj, str);
            return;
        }
        t tVar = this.f26921x;
        if (tVar == null) {
            b1(jVar, hVar, obj, str);
            return;
        }
        try {
            tVar.g(jVar, hVar, obj, str);
        } catch (Exception e10) {
            O1(e10, obj, str, hVar);
        }
    }

    protected void I1(p6.h hVar, Object obj) {
        for (e0 e0Var : this.f26920w) {
            e0Var.g(hVar, obj);
        }
    }

    public abstract d K1(t6.c cVar);

    public abstract d L1(Set set, Set set2);

    public abstract d M1(boolean z10);

    public abstract d N1(t6.s sVar);

    public void O1(Throwable th2, Object obj, String str, p6.h hVar) throws p6.m {
        throw p6.m.s(J1(th2, hVar), obj, str);
    }

    protected Object P1(Throwable th2, p6.h hVar) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        i7.h.i0(th2);
        if (th2 instanceof IOException) {
            throw ((IOException) th2);
        }
        if (hVar == null) {
            throw new IllegalArgumentException(th2.getMessage(), th2);
        }
        if (!hVar.D0(p6.i.WRAP_EXCEPTIONS)) {
            i7.h.k0(th2);
        }
        return hVar.l0(this.f26911e.r(), null, th2);
    }

    @Override // u6.c0
    public w W0() {
        return this.f26913g;
    }

    @Override // u6.c0
    public JavaType X0() {
        return this.f26911e;
    }

    @Override // u6.c0
    protected void b1(e6.j jVar, p6.h hVar, Object obj, String str) throws v6.a {
        if (this.A) {
            jVar.f1();
            return;
        }
        if (i7.o.c(str, this.f26922y, this.f26923z)) {
            E1(jVar, hVar, obj, str);
        }
        super.b1(jVar, hVar, obj, str);
    }

    @Override // s6.s
    public void c(p6.h hVar) throws v6.b {
        u[] uVarArrO;
        p6.l lVarX;
        p6.l lVarT;
        boolean z10 = false;
        g.a aVarE = null;
        if (this.f26913g.g()) {
            uVarArrO = this.f26913g.O(hVar.k());
            if (this.f26922y != null || this.f26923z != null) {
                int length = uVarArrO.length;
                for (int i10 = 0; i10 < length; i10++) {
                    if (i7.o.c(uVarArrO[i10].getName(), this.f26922y, this.f26923z)) {
                        uVarArrO[i10].K();
                    }
                }
            }
        } else {
            uVarArrO = null;
        }
        for (u uVar : this.f26919v) {
            if (!uVar.A()) {
                p6.l lVarB1 = B1(hVar, uVar);
                if (lVarB1 == null) {
                    lVarB1 = hVar.T(uVar.getType());
                }
                m1(this.f26919v, uVarArrO, uVar, uVar.Y(lVarB1));
            }
        }
        d0 d0Var = null;
        for (u uVar2 : this.f26919v) {
            u uVarO1 = o1(hVar, uVar2.Y(hVar.o0(uVar2.x(), uVar2, uVar2.getType())));
            if (!(uVarO1 instanceof t6.m)) {
                uVarO1 = q1(hVar, uVarO1);
            }
            i7.s sVarI1 = i1(hVar, uVarO1);
            if (sVarI1 == null || (lVarT = (lVarX = uVarO1.x()).t(sVarI1)) == lVarX || lVarT == null) {
                u uVarN1 = n1(hVar, p1(hVar, uVarO1, uVarO1.d()));
                if (uVarN1 != uVar2) {
                    m1(this.f26919v, uVarArrO, uVar2, uVarN1);
                }
                if (uVarN1.C()) {
                    a7.e eVarZ = uVarN1.z();
                    if (eVarZ.k() == e0.a.EXTERNAL_PROPERTY) {
                        if (aVarE == null) {
                            aVarE = t6.g.e(this.f26911e);
                        }
                        aVarE.b(uVarN1, eVarZ);
                        this.f26919v.A(uVarN1);
                    }
                }
            } else {
                u uVarY = uVarO1.Y(lVarT);
                if (d0Var == null) {
                    d0Var = new d0();
                }
                d0Var.a(uVarY);
                this.f26919v.A(uVarY);
            }
        }
        t tVar = this.f26921x;
        if (tVar != null && !tVar.n()) {
            t tVar2 = this.f26921x;
            this.f26921x = tVar2.p(S0(hVar, tVar2.l(), this.f26921x.j()));
        }
        if (this.f26913g.k()) {
            JavaType javaTypeN = this.f26913g.N(hVar.k());
            if (javaTypeN == null) {
                JavaType javaType = this.f26911e;
                hVar.q(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", i7.h.G(javaType), i7.h.h(this.f26913g)));
            }
            this.f26914h = h1(hVar, javaTypeN, this.f26913g.L());
        }
        if (this.f26913g.i()) {
            JavaType javaTypeH = this.f26913g.H(hVar.k());
            if (javaTypeH == null) {
                JavaType javaType2 = this.f26911e;
                hVar.q(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", i7.h.G(javaType2), i7.h.h(this.f26913g)));
            }
            this.f26915r = h1(hVar, javaTypeH, this.f26913g.G());
        }
        if (uVarArrO != null) {
            this.f26916s = t6.v.b(hVar, this.f26913g, uVarArrO, this.f26919v);
        }
        if (aVarE != null) {
            this.F = aVarE.c(this.f26919v);
            this.f26917t = true;
        }
        this.E = d0Var;
        if (d0Var != null) {
            this.f26917t = true;
        }
        if (this.f26918u && !this.f26917t) {
            z10 = true;
        }
        this.f26918u = z10;
    }

    @Override // s6.i
    public p6.l d(p6.h hVar, p6.d dVar) {
        t6.c cVar;
        t6.c cVarK;
        x6.e0 e0VarK;
        JavaType type;
        k0 k0VarO;
        u uVar;
        t6.s sVarA = this.G;
        p6.b bVarZ = hVar.Z();
        x6.k kVarH = c0.n0(dVar, bVarZ) ? dVar.h() : null;
        if (kVarH != null && (e0VarK = bVarZ.K(kVarH)) != null) {
            x6.e0 e0VarL = bVarZ.L(kVarH, e0VarK);
            Class clsC = e0VarL.c();
            hVar.p(kVarH, e0VarL);
            if (clsC == n0.class) {
                y yVarD = e0VarL.d();
                u uVarD1 = D1(yVarD);
                if (uVarD1 == null) {
                    return (p6.l) hVar.q(this.f26911e, String.format("Invalid Object Id definition for %s: cannot find property with name %s", i7.h.Y(p()), i7.h.W(yVarD)));
                }
                type = uVarD1.getType();
                k0VarO = new t6.w(e0VarL.f());
                uVar = uVarD1;
            } else {
                type = hVar.l().X(hVar.G(clsC), k0.class)[0];
                k0VarO = hVar.o(kVarH, e0VarL);
                uVar = null;
            }
            JavaType javaType = type;
            sVarA = t6.s.a(javaType, e0VarL.d(), k0VarO, hVar.X(javaType), uVar, null);
        }
        d dVarN1 = (sVarA == null || sVarA == this.G) ? this : N1(sVarA);
        if (kVarH != null) {
            dVarN1 = k1(hVar, bVarZ, dVarN1, kVarH);
        }
        k.d dVarU0 = U0(hVar, dVar, p());
        if (dVarU0 != null) {
            cVarI = dVarU0.o() ? dVarU0.i() : null;
            Boolean boolE = dVarU0.e(k.a.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
            if (boolE != null && (cVarK = (cVar = this.f26919v).K(boolE.booleanValue())) != cVar) {
                dVarN1 = dVarN1.K1(cVarK);
            }
        }
        if (cVarI == null) {
            cVarI = this.f26912f;
        }
        return cVarI == k.c.ARRAY ? dVarN1.r1() : dVarN1;
    }

    protected Object e1(e6.j jVar, p6.h hVar, Object obj, p6.l lVar) {
        i7.b0 b0VarZ = hVar.z(jVar);
        if (obj instanceof String) {
            b0VarZ.d1((String) obj);
        } else if (obj instanceof Long) {
            b0VarZ.I0(((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            b0VarZ.H0(((Integer) obj).intValue());
        } else {
            b0VarZ.writeObject(obj);
        }
        e6.j jVarX1 = b0VarZ.x1(jVar.g1());
        jVarX1.X0();
        return lVar.e(jVarX1, hVar);
    }

    protected final p6.l f1() {
        p6.l lVar = this.f26914h;
        return lVar == null ? this.f26915r : lVar;
    }

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        Object objY0;
        if (this.G != null) {
            if (jVar.c() && (objY0 = jVar.y0()) != null) {
                return l1(jVar, hVar, eVar.e(jVar, hVar), objY0);
            }
            e6.m mVarN = jVar.n();
            if (mVarN != null) {
                if (mVarN.g()) {
                    return x1(jVar, hVar);
                }
                if (mVarN == e6.m.START_OBJECT) {
                    mVarN = jVar.X0();
                }
                if (mVarN == e6.m.FIELD_NAME && this.G.e() && this.G.d(jVar.l(), jVar)) {
                    return x1(jVar, hVar);
                }
            }
        }
        return eVar.e(jVar, hVar);
    }

    protected abstract Object g1(e6.j jVar, p6.h hVar);

    @Override // p6.l
    public u i(String str) {
        Map map = this.C;
        if (map == null) {
            return null;
        }
        return (u) map.get(str);
    }

    protected i7.s i1(p6.h hVar, u uVar) throws v6.b {
        i7.s sVarQ0;
        x6.k kVarH = uVar.h();
        if (kVarH == null || (sVarQ0 = hVar.Z().q0(kVarH)) == null) {
            return null;
        }
        if (uVar instanceof j) {
            hVar.q(X0(), String.format("Cannot define Creator property \"%s\" as `@JsonUnwrapped`: combination not yet supported", uVar.getName()));
        }
        return sVarQ0;
    }

    @Override // p6.l
    public i7.a j() {
        return i7.a.DYNAMIC;
    }

    protected p6.l j1(p6.h hVar, Object obj, i7.b0 b0Var) {
        p6.l lVar;
        synchronized (this) {
            HashMap map = this.D;
            lVar = map == null ? null : (p6.l) map.get(new h7.a(obj.getClass()));
        }
        if (lVar != null) {
            return lVar;
        }
        p6.l lVarX = hVar.X(hVar.G(obj.getClass()));
        if (lVarX == null) {
            return lVarX;
        }
        synchronized (this) {
            try {
                if (this.D == null) {
                    this.D = new HashMap();
                }
                this.D.put(new h7.a(obj.getClass()), lVarX);
            } finally {
            }
        }
        return lVarX;
    }

    @Override // p6.l
    public Object k(p6.h hVar) {
        try {
            return this.f26913g.C(hVar);
        } catch (IOException e10) {
            return i7.h.h0(hVar, e10);
        }
    }

    protected d k1(p6.h hVar, p6.b bVar, d dVar, x6.k kVar) {
        p6.g gVarK = hVar.k();
        p.a aVarX = bVar.X(gVarK, kVar);
        if (aVarX.j() && !this.A) {
            dVar = dVar.M1(true);
        }
        Set setG = aVarX.g();
        Set set = dVar.f26922y;
        if (setG.isEmpty()) {
            setG = set;
        } else if (set != null && !set.isEmpty()) {
            HashSet hashSet = new HashSet(set);
            hashSet.addAll(setG);
            setG = hashSet;
        }
        Set set2 = dVar.f26923z;
        Set setB = i7.o.b(set2, bVar.a0(gVarK, kVar).e());
        return (setG == set && setB == set2) ? dVar : dVar.L1(setG, setB);
    }

    @Override // p6.l
    public Collection l() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f26919v.iterator();
        while (it.hasNext()) {
            arrayList.add(((u) it.next()).getName());
        }
        return arrayList;
    }

    protected Object l1(e6.j jVar, p6.h hVar, Object obj, Object obj2) {
        p6.l lVarB = this.G.b();
        if (lVarB.p() != obj2.getClass()) {
            obj2 = e1(jVar, hVar, obj2, lVarB);
        }
        t6.s sVar = this.G;
        k0 k0Var = sVar.f27538c;
        sVar.getClass();
        hVar.W(obj2, k0Var, null).b(obj);
        u uVar = this.G.f27540e;
        return uVar != null ? uVar.N(obj, obj2) : obj;
    }

    protected void m1(t6.c cVar, u[] uVarArr, u uVar, u uVar2) {
        cVar.D(uVar, uVar2);
        if (uVarArr != null) {
            int length = uVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (uVarArr[i10] == uVar) {
                    uVarArr[i10] = uVar2;
                    return;
                }
            }
        }
    }

    protected u n1(p6.h hVar, u uVar) {
        Class clsR;
        Class clsE;
        p6.l lVarX = uVar.x();
        if ((lVarX instanceof d) && !((d) lVarX).W0().j() && (clsE = i7.h.E((clsR = uVar.getType().r()))) != null && clsE == this.f26911e.r()) {
            for (Constructor<?> constructor : clsR.getConstructors()) {
                if (constructor.getParameterCount() == 1 && clsE.equals(constructor.getParameterTypes()[0])) {
                    if (hVar.A()) {
                        i7.h.g(constructor, hVar.E0(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return new t6.j(uVar, constructor);
                }
            }
        }
        return uVar;
    }

    @Override // p6.l
    public t6.s o() {
        return this.G;
    }

    protected u o1(p6.h hVar, u uVar) throws v6.b {
        String strT = uVar.t();
        if (strT == null) {
            return uVar;
        }
        u uVarI = uVar.x().i(strT);
        if (uVarI == null) {
            return (u) hVar.q(this.f26911e, String.format("Cannot handle managed/back reference %s: no back reference property found from type %s", i7.h.V(strT), i7.h.G(uVar.getType())));
        }
        JavaType javaType = this.f26911e;
        JavaType type = uVarI.getType();
        boolean zL = uVar.getType().L();
        if (!type.r().isAssignableFrom(javaType.r())) {
            hVar.q(this.f26911e, String.format("Cannot handle managed/back reference %s: back reference type (%s) not compatible with managed type (%s)", i7.h.V(strT), i7.h.G(type), javaType.r().getName()));
        }
        return new t6.m(uVar, strT, uVarI, zL);
    }

    @Override // u6.c0, p6.l
    public Class p() {
        return this.f26911e.r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r0.f24078b != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected s6.u p1(p6.h r4, s6.u r5, p6.x r6) throws v6.b {
        /*
            r3 = this;
            p6.x$a r0 = r6.d()
            if (r0 == 0) goto L3a
            p6.l r1 = r5.x()
            p6.g r2 = r4.k()
            java.lang.Boolean r2 = r1.s(r2)
            if (r2 != 0) goto L19
            boolean r1 = r0.f24078b
            if (r1 == 0) goto L27
            goto L26
        L19:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L27
            boolean r6 = r0.f24078b
            if (r6 != 0) goto L26
            r4.k0(r1)
        L26:
            return r5
        L27:
            x6.k r0 = r0.f24077a
            p6.r r1 = p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r1 = r4.E0(r1)
            r0.i(r1)
            boolean r1 = r5 instanceof t6.a0
            if (r1 != 0) goto L3a
            t6.n r5 = t6.n.b0(r5, r0)
        L3a:
            s6.r r4 = r3.V0(r4, r5, r6)
            if (r4 == 0) goto L45
            s6.u r4 = r5.W(r4)
            return r4
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.d.p1(p6.h, s6.u, p6.x):s6.u");
    }

    @Override // p6.l
    public boolean q() {
        return true;
    }

    protected u q1(p6.h hVar, u uVar) {
        x6.e0 e0VarW = uVar.w();
        p6.l lVarX = uVar.x();
        return (e0VarW == null && (lVarX == null ? null : lVarX.o()) == null) ? uVar : new t6.t(uVar, e0VarW);
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.POJO;
    }

    protected abstract d r1();

    @Override // p6.l
    public Boolean s(p6.g gVar) {
        return Boolean.TRUE;
    }

    public Object s1(e6.j jVar, p6.h hVar) {
        p6.l lVarF1 = f1();
        if (lVarF1 == null || this.f26913g.c()) {
            return this.f26913g.q(hVar, jVar.n() == e6.m.VALUE_TRUE);
        }
        Object objD = this.f26913g.D(hVar, lVarF1.e(jVar, hVar));
        if (this.f26920w != null) {
            I1(hVar, objD);
        }
        return objD;
    }

    @Override // p6.l
    public abstract p6.l t(i7.s sVar);

    public Object t1(e6.j jVar, p6.h hVar) {
        j.b bVarV0 = jVar.v0();
        if (bVarV0 == j.b.DOUBLE || bVarV0 == j.b.FLOAT) {
            p6.l lVarF1 = f1();
            if (lVarF1 == null || this.f26913g.d()) {
                return this.f26913g.r(hVar, jVar.X());
            }
            Object objD = this.f26913g.D(hVar, lVarF1.e(jVar, hVar));
            if (this.f26920w != null) {
                I1(hVar, objD);
            }
            return objD;
        }
        if (bVarV0 != j.b.BIG_DECIMAL) {
            return hVar.m0(p(), W0(), jVar, "no suitable creator method found to deserialize from Number value (%s)", jVar.w0());
        }
        p6.l lVarF12 = f1();
        if (lVarF12 == null || this.f26913g.a()) {
            return this.f26913g.o(hVar, jVar.W());
        }
        Object objD2 = this.f26913g.D(hVar, lVarF12.e(jVar, hVar));
        if (this.f26920w != null) {
            I1(hVar, objD2);
        }
        return objD2;
    }

    public Object u1(e6.j jVar, p6.h hVar) {
        if (this.G != null) {
            return x1(jVar, hVar);
        }
        p6.l lVarF1 = f1();
        if (lVarF1 == null || this.f26913g.h()) {
            Object objH0 = jVar.h0();
            return (objH0 == null || this.f26911e.a0(objH0.getClass())) ? objH0 : hVar.x0(this.f26911e, objH0, jVar);
        }
        Object objD = this.f26913g.D(hVar, lVarF1.e(jVar, hVar));
        if (this.f26920w != null) {
            I1(hVar, objD);
        }
        return objD;
    }

    public Object v1(e6.j jVar, p6.h hVar) {
        if (this.G != null) {
            return x1(jVar, hVar);
        }
        p6.l lVarF1 = f1();
        j.b bVarV0 = jVar.v0();
        if (bVarV0 == j.b.INT) {
            if (lVarF1 == null || this.f26913g.e()) {
                return this.f26913g.s(hVar, jVar.t0());
            }
            Object objD = this.f26913g.D(hVar, lVarF1.e(jVar, hVar));
            if (this.f26920w != null) {
                I1(hVar, objD);
            }
            return objD;
        }
        if (bVarV0 == j.b.LONG) {
            if (lVarF1 == null || this.f26913g.e()) {
                return this.f26913g.t(hVar, jVar.u0());
            }
            Object objD2 = this.f26913g.D(hVar, lVarF1.e(jVar, hVar));
            if (this.f26920w != null) {
                I1(hVar, objD2);
            }
            return objD2;
        }
        if (bVarV0 != j.b.BIG_INTEGER) {
            return hVar.m0(p(), W0(), jVar, "no suitable creator method found to deserialize from Number value (%s)", jVar.w0());
        }
        if (lVarF1 == null || this.f26913g.b()) {
            return this.f26913g.p(hVar, jVar.r());
        }
        Object objD3 = this.f26913g.D(hVar, lVarF1.e(jVar, hVar));
        if (this.f26920w != null) {
            I1(hVar, objD3);
        }
        return objD3;
    }

    public abstract Object w1(e6.j jVar, p6.h hVar);

    protected Object x1(e6.j jVar, p6.h hVar) throws v {
        Object objF = this.G.f(jVar, hVar);
        t6.s sVar = this.G;
        k0 k0Var = sVar.f27538c;
        sVar.getClass();
        z zVarW = hVar.W(objF, k0Var, null);
        Object objC = zVarW.c();
        if (objC != null) {
            return objC;
        }
        throw new v(jVar, "Could not resolve Object Id [" + objF + "] (for " + this.f26911e + ").", jVar.H(), zVarW);
    }

    protected Object y1(e6.j jVar, p6.h hVar) {
        p6.l lVarF1 = f1();
        if (lVarF1 != null) {
            Object objD = this.f26913g.D(hVar, lVarF1.e(jVar, hVar));
            if (this.f26920w != null) {
                I1(hVar, objD);
            }
            return objD;
        }
        if (this.f26916s != null) {
            return g1(jVar, hVar);
        }
        Class clsR = this.f26911e.r();
        return i7.h.R(clsR) ? hVar.m0(clsR, null, jVar, "non-static inner classes like this can only by instantiated using default, no-argument constructor", new Object[0]) : i7.u.c(clsR) ? hVar.m0(clsR, null, jVar, "cannot deserialize from Object value (no delegate- or property-based Creator): this appears to be a native image, in which case you may need to configure reflection for the class that is to be deserialized", new Object[0]) : hVar.m0(clsR, W0(), jVar, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
    }

    public Object z1(e6.j jVar, p6.h hVar) {
        if (this.G != null) {
            return x1(jVar, hVar);
        }
        p6.l lVarF1 = f1();
        if (lVarF1 == null || this.f26913g.h()) {
            return Y(jVar, hVar);
        }
        Object objD = this.f26913g.D(hVar, lVarF1.e(jVar, hVar));
        if (this.f26920w != null) {
            I1(hVar, objD);
        }
        return objD;
    }

    protected d(d dVar) {
        this(dVar, dVar.A);
    }

    protected d(d dVar, boolean z10) {
        super(dVar.f26911e);
        this.f26911e = dVar.f26911e;
        this.f26913g = dVar.f26913g;
        this.f26914h = dVar.f26914h;
        this.f26915r = dVar.f26915r;
        this.f26916s = dVar.f26916s;
        this.f26919v = dVar.f26919v;
        this.C = dVar.C;
        this.f26922y = dVar.f26922y;
        this.A = z10;
        this.f26923z = dVar.f26923z;
        this.f26921x = dVar.f26921x;
        this.f26920w = dVar.f26920w;
        this.G = dVar.G;
        this.f26917t = dVar.f26917t;
        this.E = dVar.E;
        this.B = dVar.B;
        this.f26912f = dVar.f26912f;
        this.f26918u = dVar.f26918u;
        this.F = dVar.F;
    }

    protected d(d dVar, i7.s sVar) {
        super(dVar.f26911e);
        this.f26911e = dVar.f26911e;
        this.f26913g = dVar.f26913g;
        this.f26914h = dVar.f26914h;
        this.f26915r = dVar.f26915r;
        this.f26916s = dVar.f26916s;
        this.C = dVar.C;
        this.f26922y = dVar.f26922y;
        this.A = sVar != null || dVar.A;
        this.f26923z = dVar.f26923z;
        this.f26921x = dVar.f26921x;
        this.f26920w = dVar.f26920w;
        this.G = dVar.G;
        this.f26917t = dVar.f26917t;
        d0 d0VarC = dVar.E;
        if (sVar != null) {
            d0VarC = d0VarC != null ? d0VarC.c(sVar) : d0VarC;
            this.f26919v = dVar.f26919v.C(sVar);
        } else {
            this.f26919v = dVar.f26919v;
        }
        this.E = d0VarC;
        this.B = dVar.B;
        this.f26912f = dVar.f26912f;
        this.f26918u = false;
        this.F = dVar.F;
    }

    public d(d dVar, t6.s sVar) {
        super(dVar.f26911e);
        this.f26911e = dVar.f26911e;
        this.f26913g = dVar.f26913g;
        this.f26914h = dVar.f26914h;
        this.f26915r = dVar.f26915r;
        this.f26916s = dVar.f26916s;
        this.C = dVar.C;
        this.f26922y = dVar.f26922y;
        this.A = dVar.A;
        this.f26923z = dVar.f26923z;
        this.f26921x = dVar.f26921x;
        this.f26920w = dVar.f26920w;
        this.f26917t = dVar.f26917t;
        this.E = dVar.E;
        this.B = dVar.B;
        this.f26912f = dVar.f26912f;
        this.G = sVar;
        if (sVar == null) {
            this.f26919v = dVar.f26919v;
            this.f26918u = dVar.f26918u;
        } else {
            this.f26919v = dVar.f26919v.L(new t6.u(sVar, p6.x.f24067h));
            this.f26918u = false;
        }
        this.F = dVar.F;
    }

    public d(d dVar, Set set, Set set2) {
        super(dVar.f26911e);
        this.f26911e = dVar.f26911e;
        this.f26913g = dVar.f26913g;
        this.f26914h = dVar.f26914h;
        this.f26915r = dVar.f26915r;
        this.f26916s = dVar.f26916s;
        this.C = dVar.C;
        this.f26922y = set;
        this.A = dVar.A;
        this.f26923z = set2;
        this.f26921x = dVar.f26921x;
        this.f26920w = dVar.f26920w;
        this.f26917t = dVar.f26917t;
        this.E = dVar.E;
        this.B = dVar.B;
        this.f26912f = dVar.f26912f;
        this.f26918u = dVar.f26918u;
        this.G = dVar.G;
        this.f26919v = dVar.f26919v.N(set, set2);
        this.F = dVar.F;
    }

    protected d(d dVar, t6.c cVar) {
        super(dVar.f26911e);
        this.f26911e = dVar.f26911e;
        this.f26913g = dVar.f26913g;
        this.f26914h = dVar.f26914h;
        this.f26915r = dVar.f26915r;
        this.f26916s = dVar.f26916s;
        this.f26919v = cVar;
        this.C = dVar.C;
        this.f26922y = dVar.f26922y;
        this.A = dVar.A;
        this.f26923z = dVar.f26923z;
        this.f26921x = dVar.f26921x;
        this.f26920w = dVar.f26920w;
        this.G = dVar.G;
        this.f26917t = dVar.f26917t;
        this.E = dVar.E;
        this.B = dVar.B;
        this.f26912f = dVar.f26912f;
        this.f26918u = dVar.f26918u;
        this.F = dVar.F;
    }
}
