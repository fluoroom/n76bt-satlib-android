package s6;

import com.fasterxml.jackson.databind.JavaType;
import d6.k0;
import d6.n0;
import i7.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p6.b;
import p6.d;
import p6.y;
import q6.f;
import t6.a0;
import t6.c0;
import u6.l0;
import x6.e0;

/* JADX INFO: loaded from: classes.dex */
public class f extends b implements Serializable {

    /* JADX INFO: renamed from: s */
    private static final Class[] f26938s = {Throwable.class};

    /* JADX INFO: renamed from: t */
    public static final f f26939t = new f(new r6.m());

    public f(r6.m mVar) {
        super(mVar);
    }

    private boolean u0(Class cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    public p6.l A0(p6.h hVar, JavaType javaType, p6.c cVar) throws p6.m {
        try {
            w wVarQ0 = q0(hVar, cVar);
            e eVarE0 = E0(hVar, cVar);
            eVarE0.B(wVarQ0);
            x0(hVar, cVar, eVarE0);
            z0(hVar, cVar, eVarE0);
            w0(hVar, cVar, eVarE0);
            y0(hVar, cVar, eVarE0);
            hVar.k();
            if (this.f26892b.e()) {
                Iterator it = this.f26892b.b().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
            p6.l lVarL = (!javaType.D() || wVarQ0.l()) ? eVarE0.l() : eVarE0.m();
            if (this.f26892b.e()) {
                Iterator it2 = this.f26892b.b().iterator();
                if (it2.hasNext()) {
                    android.support.v4.media.session.b.a(it2.next());
                    throw null;
                }
            }
            return lVarL;
        } catch (IllegalArgumentException e10) {
            throw v6.b.z(hVar.i0(), i7.h.o(e10), cVar, null).q(e10);
        } catch (NoClassDefFoundError e11) {
            return new t6.f(e11);
        }
    }

    protected p6.l B0(p6.h hVar, JavaType javaType, p6.c cVar) throws v6.b {
        try {
            w wVarQ0 = q0(hVar, cVar);
            p6.g gVarK = hVar.k();
            e eVarE0 = E0(hVar, cVar);
            eVarE0.B(wVarQ0);
            x0(hVar, cVar, eVarE0);
            z0(hVar, cVar, eVarE0);
            w0(hVar, cVar, eVarE0);
            y0(hVar, cVar, eVarE0);
            f.a aVarM = cVar.m();
            String str = aVarM == null ? "build" : aVarM.f24362a;
            x6.l lVarK = cVar.k(str, null);
            if (lVarK != null && gVarK.b()) {
                i7.h.g(lVarK.n(), gVarK.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            eVarE0.A(lVarK, aVarM);
            if (this.f26892b.e()) {
                Iterator it = this.f26892b.b().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
            p6.l lVarN = eVarE0.n(javaType, str);
            if (this.f26892b.e()) {
                Iterator it2 = this.f26892b.b().iterator();
                if (it2.hasNext()) {
                    android.support.v4.media.session.b.a(it2.next());
                    throw null;
                }
            }
            return lVarN;
        } catch (IllegalArgumentException e10) {
            throw v6.b.z(hVar.i0(), i7.h.o(e10), cVar, null);
        } catch (NoClassDefFoundError e11) {
            return new t6.f(e11);
        }
    }

    public p6.l C0(p6.h hVar, JavaType javaType, p6.c cVar) throws v6.b {
        p6.g gVarK = hVar.k();
        e eVarE0 = E0(hVar, cVar);
        eVarE0.B(q0(hVar, cVar));
        x0(hVar, cVar, eVarE0);
        Iterator itU = eVarE0.u();
        while (true) {
            if (!itU.hasNext()) {
                break;
            }
            if ("setCause".equals(((u) itU.next()).h().d())) {
                itU.remove();
                break;
            }
        }
        x6.l lVarK = cVar.k("initCause", f26938s);
        if (lVarK != null) {
            gVarK.A();
            u uVarF0 = F0(hVar, cVar, z.L(hVar.k(), lVarK, new y("cause")), lVarK.z(0));
            if (uVarF0 != null) {
                eVarE0.j(uVarF0, true);
            }
        }
        if (this.f26892b.e()) {
            Iterator it = this.f26892b.b().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        p6.l lVarL = eVarE0.l();
        if (lVarL instanceof c) {
            lVarL = l0.g2(hVar, (c) lVarL);
        }
        if (this.f26892b.e()) {
            Iterator it2 = this.f26892b.b().iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        return lVarL;
    }

    protected t D0(p6.h hVar, p6.c cVar, x6.k kVar) throws v6.b {
        JavaType javaTypeQ;
        JavaType javaTypeK;
        x6.k kVar2;
        d.a aVar;
        boolean z10 = kVar instanceof x6.i;
        if (kVar instanceof x6.l) {
            x6.l lVar = (x6.l) kVar;
            javaTypeQ = lVar.z(0);
            javaTypeK = r0(hVar, kVar, lVar.z(1));
            kVar2 = kVar;
            aVar = new d.a(y.a(kVar.d()), javaTypeK, null, kVar, p6.x.f24068r);
        } else {
            if (!z10) {
                return (t) hVar.q(cVar.z(), String.format("Unrecognized mutator type for any-setter: %s", i7.h.Y(kVar.getClass())));
            }
            JavaType javaTypeF = ((x6.i) kVar).f();
            if (!javaTypeF.T()) {
                if (!javaTypeF.C(p6.n.class) && !javaTypeF.C(d7.r.class)) {
                    return (t) hVar.q(cVar.z(), String.format("Unsupported type for any-setter: %s -- only support `Map`s, `JsonNode` and `ObjectNode` ", i7.h.G(javaTypeF)));
                }
                JavaType javaTypeR0 = r0(hVar, kVar, javaTypeF);
                JavaType javaTypeG = hVar.G(p6.n.class);
                return t.c(hVar, new d.a(y.a(kVar.d()), javaTypeR0, null, kVar, p6.x.f24068r), kVar, javaTypeG, hVar.X(javaTypeG));
            }
            JavaType javaTypeR02 = r0(hVar, kVar, javaTypeF);
            javaTypeQ = javaTypeR02.q();
            javaTypeK = javaTypeR02.k();
            d.a aVar2 = new d.a(y.a(kVar.d()), javaTypeR02, null, kVar, p6.x.f24068r);
            kVar2 = kVar;
            aVar = aVar2;
        }
        JavaType javaType = javaTypeK;
        p6.q qVarM0 = m0(hVar, kVar2);
        if (qVarM0 == null) {
            qVarM0 = (p6.q) javaTypeQ.w();
        }
        if (qVarM0 == null) {
            qVarM0 = hVar.S(javaTypeQ, aVar);
        }
        p6.q qVar = qVarM0;
        p6.l lVarJ0 = j0(hVar, kVar2);
        if (lVarJ0 == null) {
            lVarJ0 = (p6.l) javaType.w();
        }
        if (lVarJ0 != null) {
            lVarJ0 = hVar.o0(lVarJ0, aVar, javaType);
        }
        p6.l lVar2 = lVarJ0;
        a7.e eVar = (a7.e) javaType.v();
        return z10 ? t.d(hVar, aVar, kVar2, javaType, qVar, lVar2, eVar) : t.e(hVar, aVar, kVar2, javaType, qVar, lVar2, eVar);
    }

    protected e E0(p6.h hVar, p6.c cVar) {
        return new e(cVar, hVar);
    }

    protected u F0(p6.h hVar, p6.c cVar, x6.u uVar, JavaType javaType) throws v6.b {
        x6.u uVar2;
        u iVar;
        x6.k kVarX = uVar.x();
        if (kVarX == null) {
            hVar.N0(cVar, uVar, "No non-constructor mutator available", new Object[0]);
        }
        JavaType javaTypeR0 = r0(hVar, kVarX, javaType);
        a7.e eVar = (a7.e) javaTypeR0.v();
        if (kVarX instanceof x6.l) {
            uVar2 = uVar;
            iVar = new t6.o(uVar2, javaTypeR0, eVar, cVar.r(), (x6.l) kVarX);
        } else {
            uVar2 = uVar;
            iVar = new t6.i(uVar2, javaTypeR0, eVar, cVar.r(), (x6.i) kVarX);
        }
        p6.l lVarL0 = l0(hVar, kVarX);
        if (lVarL0 == null) {
            lVarL0 = (p6.l) javaTypeR0.w();
        }
        if (lVarL0 != null) {
            iVar = iVar.Y(hVar.o0(lVarL0, iVar, javaTypeR0));
        }
        b.a aVarM = uVar2.m();
        if (aVarM != null && aVarM.d()) {
            iVar.O(aVarM.b());
        }
        e0 e0VarK = uVar2.k();
        if (e0VarK != null) {
            iVar.Q(e0VarK);
        }
        return iVar;
    }

    protected u G0(p6.h hVar, p6.c cVar, x6.u uVar) {
        x6.l lVarV = uVar.v();
        JavaType javaTypeR0 = r0(hVar, lVarV, lVarV.f());
        a0 a0Var = new a0(uVar, javaTypeR0, (a7.e) javaTypeR0.v(), cVar.r(), lVarV);
        p6.l lVarL0 = l0(hVar, lVarV);
        if (lVarL0 == null) {
            lVarL0 = (p6.l) javaTypeR0.w();
        }
        return lVarL0 != null ? a0Var.Y(hVar.o0(lVarL0, a0Var, javaTypeR0)) : a0Var;
    }

    protected List H0(p6.h hVar, p6.c cVar, e eVar, List list, Set set, Set set2) {
        Class clsB;
        ArrayList arrayList = new ArrayList(Math.max(4, list.size()));
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x6.u uVar = (x6.u) it.next();
            String name = uVar.getName();
            if (!i7.o.c(name, set, set2)) {
                if (uVar.E() || (clsB = uVar.B()) == null || !J0(hVar.k(), uVar, clsB, map)) {
                    arrayList.add(uVar);
                } else {
                    eVar.g(name);
                }
            }
        }
        return arrayList;
    }

    protected p6.l I0(p6.h hVar, JavaType javaType, p6.c cVar) {
        p6.l lVarK0 = k0(hVar, javaType, cVar);
        if (lVarK0 == null || !this.f26892b.e()) {
            return lVarK0;
        }
        Iterator it = this.f26892b.b().iterator();
        if (!it.hasNext()) {
            return lVarK0;
        }
        android.support.v4.media.session.b.a(it.next());
        hVar.k();
        throw null;
    }

    protected boolean J0(p6.g gVar, x6.u uVar, Class cls, Map map) {
        Boolean boolF;
        Boolean bool = (Boolean) map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (cls == String.class || cls.isPrimitive()) {
            boolF = Boolean.FALSE;
        } else {
            boolF = gVar.j(cls).f();
            if (boolF == null) {
                boolF = gVar.g().E0(gVar.H(cls).s());
                if (boolF == null) {
                    boolF = Boolean.FALSE;
                }
            }
        }
        map.put(cls, boolF);
        return boolF.booleanValue();
    }

    protected boolean K0(Class cls) {
        String strF = i7.h.f(cls);
        if (strF != null) {
            throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + strF + ") as a Bean");
        }
        if (i7.h.T(cls)) {
            throw new IllegalArgumentException("Cannot deserialize Proxy class " + cls.getName() + " as a Bean");
        }
        String strQ = i7.h.Q(cls, true);
        if (strQ == null) {
            return true;
        }
        throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + strQ + ") as a Bean");
    }

    protected JavaType L0(p6.h hVar, JavaType javaType, p6.c cVar) {
        Iterator it = this.f26892b.a().iterator();
        if (!it.hasNext()) {
            return null;
        }
        android.support.v4.media.session.b.a(it.next());
        hVar.k();
        throw null;
    }

    @Override // s6.n
    public p6.l b(p6.h hVar, JavaType javaType, p6.c cVar) {
        JavaType javaTypeL0;
        p6.g gVarK = hVar.k();
        p6.l lVarH = H(javaType, gVarK, cVar);
        if (lVarH != null) {
            if (this.f26892b.e()) {
                Iterator it = this.f26892b.b().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    hVar.k();
                    throw null;
                }
            }
            return lVarH;
        }
        if (javaType.Y()) {
            return C0(hVar, javaType, cVar);
        }
        if (javaType.D() && !javaType.W() && !javaType.O() && (javaTypeL0 = L0(hVar, javaType, cVar)) != null) {
            return A0(hVar, javaTypeL0, gVarK.u0(javaTypeL0));
        }
        p6.l lVarI0 = I0(hVar, javaType, cVar);
        if (lVarI0 != null) {
            return lVarI0;
        }
        if (!K0(javaType.r())) {
            return null;
        }
        v0(hVar, javaType, cVar);
        p6.l lVarT0 = t0(hVar, javaType, cVar);
        return lVarT0 != null ? lVarT0 : A0(hVar, javaType, cVar);
    }

    @Override // s6.n
    public p6.l c(p6.h hVar, JavaType javaType, p6.c cVar, Class cls) {
        return B0(hVar, javaType, hVar.k().v0(hVar.E0(p6.r.INFER_BUILDER_TYPE_BINDINGS) ? hVar.l().N(cls, javaType.j()) : hVar.G(cls), cVar));
    }

    @Override // s6.b
    public n s0(r6.m mVar) {
        if (this.f26892b == mVar) {
            return this;
        }
        i7.h.o0(f.class, this, "withConfig");
        return new f(mVar);
    }

    protected p6.l t0(p6.h hVar, JavaType javaType, p6.c cVar) {
        String strA = i7.e.a(javaType);
        if (strA == null || hVar.k().a(javaType.r()) != null) {
            return null;
        }
        return new c0(javaType, strA);
    }

    protected void v0(p6.h hVar, JavaType javaType, p6.c cVar) {
        b7.q.a().b(hVar, javaType, cVar);
    }

    protected void w0(p6.h hVar, p6.c cVar, e eVar) {
        List<x6.u> listC = cVar.c();
        if (listC != null) {
            for (x6.u uVar : listC) {
                eVar.e(uVar.l(), F0(hVar, cVar, uVar, uVar.A()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void x0(p6.h r18, p6.c r19, s6.e r20) throws v6.b {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.f.x0(p6.h, p6.c, s6.e):void");
    }

    protected void y0(p6.h hVar, p6.c cVar, e eVar) {
        Map mapH = cVar.h();
        if (mapH != null) {
            for (Map.Entry entry : mapH.entrySet()) {
                x6.k kVar = (x6.k) entry.getValue();
                eVar.i(y.a(kVar.d()), kVar.f(), cVar.r(), kVar, entry.getKey());
            }
        }
    }

    protected void z0(p6.h hVar, p6.c cVar, e eVar) {
        u uVarP;
        k0 k0VarO;
        JavaType type;
        e0 e0VarY = cVar.y();
        if (e0VarY == null) {
            return;
        }
        Class clsC = e0VarY.c();
        hVar.p(cVar.s(), e0VarY);
        if (clsC == n0.class) {
            y yVarD = e0VarY.d();
            uVarP = eVar.p(yVarD);
            if (uVarP == null) {
                throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", i7.h.G(cVar.z()), i7.h.W(yVarD)));
            }
            type = uVarP.getType();
            k0VarO = new t6.w(e0VarY.f());
        } else {
            JavaType javaType = hVar.l().X(hVar.G(clsC), k0.class)[0];
            uVarP = null;
            k0VarO = hVar.o(cVar.s(), e0VarY);
            type = javaType;
        }
        eVar.z(t6.s.a(type, e0VarY.d(), k0VarO, hVar.X(type), uVarP, null));
    }
}
