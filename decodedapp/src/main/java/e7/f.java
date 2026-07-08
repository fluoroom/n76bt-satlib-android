package e7;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import d6.e0;
import d6.k0;
import d6.n0;
import d6.p;
import d6.s;
import g7.l0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p6.b;
import p6.b0;
import p6.d;
import p6.d0;
import p6.v;
import p6.w;
import p6.x;
import p6.y;
import r6.t;
import x6.e0;
import x6.u;

/* JADX INFO: loaded from: classes.dex */
public class f extends b implements Serializable {

    /* JADX INFO: renamed from: d */
    public static final f f11646d = new f(null);

    protected f(t tVar) {
        super(tVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected c Q(d0 d0Var, u uVar, l lVar, boolean z10, x6.k kVar) {
        y yVarA = uVar.a();
        JavaType javaTypeF = kVar.f();
        p6.d aVar = new d.a(yVarA, javaTypeF, uVar.D(), kVar, uVar.d());
        p6.p pVarL = L(d0Var, kVar);
        if (pVarL instanceof o) {
            ((o) pVarL).b(d0Var);
        }
        return lVar.c(d0Var, uVar, javaTypeF, d0Var.t0(pVarL, aVar), g0(javaTypeF, d0Var.k(), kVar), (javaTypeF.L() || javaTypeF.b()) ? f0(javaTypeF, d0Var.k(), kVar) : null, kVar, z10);
    }

    protected p6.p R(d0 d0Var, JavaType javaType, p6.c cVar, boolean z10) {
        p6.p pVarG;
        b0 b0VarK = d0Var.k();
        if (javaType.L()) {
            if (!z10) {
                z10 = O(b0VarK, cVar, null);
            }
            pVarG = l(d0Var, javaType, cVar, z10);
            if (pVarG != null) {
                return pVarG;
            }
        } else {
            if (javaType.b()) {
                pVarG = C(d0Var, (ReferenceType) javaType, cVar, z10);
            } else {
                Iterator it = v().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
                pVarG = null;
            }
            if (pVarG == null) {
                pVarG = G(d0Var, javaType, cVar);
            }
        }
        if (pVarG == null && (pVarG = H(javaType, b0VarK, cVar, z10)) == null && (pVarG = K(d0Var, javaType, cVar, z10)) == null && (pVarG = d0(d0Var, javaType, cVar, z10)) == null) {
            pVarG = d0Var.s0(cVar.q());
        }
        if (pVarG == null || !this.f11619a.b()) {
            return pVarG;
        }
        Iterator it2 = this.f11619a.d().iterator();
        if (!it2.hasNext()) {
            return pVarG;
        }
        android.support.v4.media.session.b.a(it2.next());
        throw null;
    }

    protected p6.p S(d0 d0Var, JavaType javaType, p6.c cVar) {
        String strA = i7.e.a(javaType);
        if (strA == null || d0Var.k().a(javaType.r()) != null) {
            return null;
        }
        return new f7.r(javaType, strA);
    }

    protected boolean T(d0 d0Var, JavaType javaType) {
        Class clsR = javaType.r();
        return p6.u.class.isAssignableFrom(clsR) || v.class.isAssignableFrom(clsR) || w.class.isAssignableFrom(clsR) || p6.e.class.isAssignableFrom(clsR) || e6.u.class.isAssignableFrom(clsR) || e6.j.class.isAssignableFrom(clsR) || e6.g.class.isAssignableFrom(clsR);
    }

    protected p6.p W(d0 d0Var, JavaType javaType, p6.c cVar, boolean z10) {
        if (cVar.q() == Object.class) {
            return d0Var.s0(Object.class);
        }
        p6.p pVarS = S(d0Var, javaType, cVar);
        if (pVarS != null) {
            return pVarS;
        }
        if (T(d0Var, javaType)) {
            return new l0(javaType);
        }
        b0 b0VarK = d0Var.k();
        e eVarX = X(cVar);
        eVarX.j(b0VarK);
        List listE0 = e0(d0Var, cVar, eVarX);
        List arrayList = listE0 == null ? new ArrayList() : k0(d0Var, cVar, eVarX, listE0);
        d0Var.i0().d(b0VarK, cVar.s(), arrayList);
        if (this.f11619a.b()) {
            Iterator it = this.f11619a.d().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        List listB0 = b0(b0VarK, cVar, c0(b0VarK, cVar, arrayList));
        if (this.f11619a.b()) {
            Iterator it2 = this.f11619a.d().iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        eVarX.m(Z(d0Var, cVar, listB0));
        eVarX.n(listB0);
        eVarX.k(z(b0VarK, cVar));
        x6.k kVarA = cVar.a();
        if (kVarA != null) {
            JavaType javaTypeF = kVarA.f();
            JavaType javaTypeK = javaTypeF.k();
            a7.h hVarC = c(b0VarK, javaTypeK);
            p6.p pVarL = L(d0Var, kVarA);
            if (pVarL == null) {
                pVarL = g7.t.O(null, javaTypeF, b0VarK.L(p6.r.USE_STATIC_TYPING), hVarC, null, null, null);
            }
            eVarX.i(new a(new d.a(y.a(kVarA.d()), javaTypeK, null, kVarA, x.f24068r), kVarA, pVarL));
        }
        i0(b0VarK, eVarX);
        if (this.f11619a.b()) {
            Iterator it3 = this.f11619a.d().iterator();
            if (it3.hasNext()) {
                android.support.v4.media.session.b.a(it3.next());
                throw null;
            }
        }
        try {
            p6.p pVarA = eVarX.a();
            if (pVarA != null) {
                return pVarA;
            }
            if (javaType.X() && !i7.u.c(javaType.r())) {
                return eVarX.b();
            }
            p6.p pVarD = D(b0VarK, javaType, cVar, z10);
            return (pVarD == null && cVar.A()) ? eVarX.b() : pVarD;
        } catch (RuntimeException e10) {
            return (p6.p) d0Var.D0(cVar, "Failed to construct BeanSerializer for %s: (%s) %s", cVar.z(), e10.getClass().getName(), e10.getMessage());
        }
    }

    protected e X(p6.c cVar) {
        return new e(cVar);
    }

    protected c Y(c cVar, Class[] clsArr) {
        return f7.d.a(cVar, clsArr);
    }

    protected f7.i Z(d0 d0Var, p6.c cVar, List list) {
        e0 e0VarY = cVar.y();
        if (e0VarY == null) {
            return null;
        }
        Class clsC = e0VarY.c();
        if (clsC != n0.class) {
            return f7.i.a(d0Var.l().X(d0Var.i(clsC), k0.class)[0], e0VarY.d(), d0Var.o(cVar.s(), e0VarY), e0VarY.b());
        }
        String strC = e0VarY.d().c();
        int size = list.size();
        for (int i10 = 0; i10 != size; i10++) {
            c cVar2 = (c) list.get(i10);
            if (strC.equals(cVar2.getName())) {
                if (i10 > 0) {
                    list.remove(i10);
                    list.add(0, cVar2);
                }
                return f7.i.a(cVar2.getType(), null, new f7.j(e0VarY, cVar2), e0VarY.b());
            }
        }
        throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", i7.h.G(cVar.z()), i7.h.V(strC)));
    }

    protected l a0(b0 b0Var, p6.c cVar) {
        return new l(b0Var, cVar);
    }

    @Override // e7.q
    public p6.p b(d0 d0Var, JavaType javaType) {
        JavaType javaTypeI0;
        b0 b0VarK = d0Var.k();
        p6.c cVarP0 = b0VarK.p0(javaType);
        p6.p pVarL = L(d0Var, cVarP0.s());
        if (pVarL != null) {
            return pVarL;
        }
        p6.b bVarG = b0VarK.g();
        boolean z10 = false;
        if (bVarG == null) {
            javaTypeI0 = javaType;
        } else {
            try {
                javaTypeI0 = bVarG.I0(b0VarK, cVarP0.s(), javaType);
            } catch (p6.m e10) {
                return (p6.p) d0Var.D0(cVarP0, e10.getMessage(), new Object[0]);
            }
        }
        if (javaTypeI0 != javaType) {
            if (!javaTypeI0.C(javaType.r())) {
                cVarP0 = b0VarK.p0(javaTypeI0);
            }
            z10 = true;
        }
        i7.j jVarP = cVarP0.p();
        if (jVarP == null) {
            return R(d0Var, javaTypeI0, cVarP0, z10);
        }
        JavaType javaTypeB = jVarP.b(d0Var.l());
        if (!javaTypeB.C(javaTypeI0.r())) {
            cVarP0 = b0VarK.p0(javaTypeB);
            pVarL = L(d0Var, cVarP0.s());
        }
        if (pVarL == null && !javaTypeB.S()) {
            pVarL = R(d0Var, javaTypeB, cVarP0, true);
        }
        return new g7.d0(jVarP, javaTypeB, pVarL);
    }

    protected List b0(b0 b0Var, p6.c cVar, List list) {
        p.a aVarC0 = b0Var.c0(cVar.q(), cVar.s());
        Set setH = aVarC0 != null ? aVarC0.h() : null;
        s.a aVarE0 = b0Var.e0(cVar.q(), cVar.s());
        Set setE = aVarE0 != null ? aVarE0.e() : null;
        if (setE != null || (setH != null && !setH.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (i7.o.c(((c) it.next()).getName(), setH, setE)) {
                    it.remove();
                }
            }
        }
        return list;
    }

    protected List c0(b0 b0Var, p6.c cVar, List list) {
        if (cVar.z().Z(CharSequence.class) && list.size() == 1) {
            x6.k kVarH = ((c) list.get(0)).h();
            if ((kVarH instanceof x6.l) && "isEmpty".equals(kVarH.d()) && kVarH.k() == CharSequence.class) {
                list.remove(0);
            }
        }
        return list;
    }

    public p6.p d0(d0 d0Var, JavaType javaType, p6.c cVar, boolean z10) {
        if (h0(javaType.r()) || i7.h.M(javaType.r())) {
            return W(d0Var, javaType, cVar, z10);
        }
        return null;
    }

    protected List e0(d0 d0Var, p6.c cVar, e eVar) {
        d0 d0Var2;
        List<u> listN = cVar.n();
        b0 b0VarK = d0Var.k();
        j0(b0VarK, cVar, listN);
        if (b0VarK.L(p6.r.REQUIRE_SETTERS_FOR_GETTERS)) {
            l0(b0VarK, cVar, listN);
        }
        if (listN.isEmpty()) {
            return null;
        }
        boolean zO = O(b0VarK, cVar, null);
        l lVarA0 = a0(b0VarK, cVar);
        ArrayList arrayList = new ArrayList(listN.size());
        for (u uVar : listN) {
            x6.k kVarQ = uVar.q();
            if (!uVar.K()) {
                b.a aVarM = uVar.m();
                if (aVarM == null || !aVarM.c()) {
                    if (kVarQ instanceof x6.l) {
                        d0Var2 = d0Var;
                        arrayList.add(Q(d0Var2, uVar, lVarA0, zO, (x6.l) kVarQ));
                    } else {
                        d0Var2 = d0Var;
                        arrayList.add(Q(d0Var2, uVar, lVarA0, zO, (x6.i) kVarQ));
                    }
                    d0Var = d0Var2;
                }
            } else if (kVarQ != null) {
                eVar.o(kVarQ);
            }
        }
        return arrayList;
    }

    public a7.h f0(JavaType javaType, b0 b0Var, x6.k kVar) {
        JavaType javaTypeK = javaType.k();
        a7.g gVarS = b0Var.g().S(b0Var, kVar, javaType);
        return gVarS == null ? c(b0Var, javaTypeK) : gVarS.e(b0Var, javaTypeK, b0Var.h0().b(b0Var, kVar, javaTypeK));
    }

    public a7.h g0(JavaType javaType, b0 b0Var, x6.k kVar) {
        a7.g gVarC0 = b0Var.g().c0(b0Var, kVar, javaType);
        return gVarC0 == null ? c(b0Var, javaType) : gVarC0.e(b0Var, javaType, b0Var.h0().b(b0Var, kVar, javaType));
    }

    protected boolean h0(Class cls) {
        return i7.h.f(cls) == null && !i7.h.T(cls);
    }

    protected void i0(b0 b0Var, e eVar) {
        List listG = eVar.g();
        boolean zL = b0Var.L(p6.r.DEFAULT_VIEW_INCLUSION);
        int size = listG.size();
        c[] cVarArr = new c[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = (c) listG.get(i11);
            Class[] clsArrS = cVar.s();
            if (clsArrS != null && clsArrS.length != 0) {
                i10++;
                cVarArr[i11] = Y(cVar, clsArrS);
            } else if (zL) {
                cVarArr[i11] = cVar;
            }
        }
        if (zL && i10 == 0) {
            return;
        }
        eVar.l(cVarArr);
    }

    protected void j0(b0 b0Var, p6.c cVar, List list) {
        p6.b bVarG = b0Var.g();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            if (uVar.q() == null) {
                it.remove();
            } else {
                Class clsB = uVar.B();
                Boolean boolF = (Boolean) map.get(clsB);
                if (boolF == null) {
                    boolF = b0Var.j(clsB).f();
                    if (boolF == null && (boolF = bVarG.E0(b0Var.H(clsB).s())) == null) {
                        boolF = Boolean.FALSE;
                    }
                    map.put(clsB, boolF);
                }
                if (boolF.booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    protected List k0(d0 d0Var, p6.c cVar, e eVar, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar2 = (c) list.get(i10);
            a7.h hVarR = cVar2.r();
            if (hVarR != null && hVarR.c() == e0.a.EXTERNAL_PROPERTY) {
                y yVarA = y.a(hVarR.b());
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    c cVar3 = (c) it.next();
                    if (cVar3 != cVar2 && cVar3.K(yVarA)) {
                        cVar2.n(null);
                        break;
                    }
                }
            }
        }
        return list;
    }

    protected void l0(b0 b0Var, p6.c cVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            if (!uVar.g() && !uVar.I()) {
                it.remove();
            }
        }
    }

    @Override // e7.b
    protected Iterable v() {
        return this.f11619a.e();
    }
}
