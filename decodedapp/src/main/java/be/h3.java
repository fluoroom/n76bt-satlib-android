package be;

import be.m;
import be.o;
import ee.o;
import java.lang.reflect.Method;
import kf.a;
import lf.d;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public final class h3 {

    /* JADX INFO: renamed from: a */
    public static final h3 f3881a = new h3();

    /* JADX INFO: renamed from: b */
    private static final mf.b f3882b = mf.b.f21989d.c(new mf.c("java.lang.Void"));

    private h3() {
    }

    private final ee.l a(Class cls) {
        if (cls.isPrimitive()) {
            return vf.e.e(cls.getSimpleName()).h();
        }
        return null;
    }

    private final boolean b(he.z zVar) {
        if (qf.h.p(zVar) || qf.h.q(zVar)) {
            return true;
        }
        return rd.m.a(zVar.getName(), ge.a.f13792e.a()) && zVar.i().isEmpty();
    }

    private final m.e d(he.z zVar) {
        return new m.e(new d.b(e(zVar), ef.c0.c(zVar, false, false, 1, null)));
    }

    private final String e(he.b bVar) {
        String strE = ve.t0.e(bVar);
        if (strE != null) {
            return strE;
        }
        if (bVar instanceof he.z0) {
            String strD = uf.e.w(bVar).getName().d();
            rd.m.d(strD, "asString(...)");
            return ve.i0.b(strD);
        }
        if (bVar instanceof he.a1) {
            String strD2 = uf.e.w(bVar).getName().d();
            rd.m.d(strD2, "asString(...)");
            return ve.i0.e(strD2);
        }
        String strD3 = bVar.getName().d();
        rd.m.d(strD3, "asString(...)");
        return strD3;
    }

    public final mf.b c(Class cls) {
        mf.b bVarM;
        rd.m.e(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            rd.m.d(componentType, "getComponentType(...)");
            ee.l lVarA = a(componentType);
            return lVarA != null ? new mf.b(ee.o.B, lVarA.h()) : mf.b.f21989d.c(o.a.f11877i.m());
        }
        if (rd.m.a(cls, Void.TYPE)) {
            return f3882b;
        }
        ee.l lVarA2 = a(cls);
        if (lVarA2 != null) {
            return new mf.b(ee.o.B, lVarA2.j());
        }
        mf.b bVarE = ne.f.e(cls);
        return (bVarE.i() || (bVarM = ge.c.f13796a.m(bVarE.a())) == null) ? bVarE : bVarM;
    }

    public final o f(he.y0 y0Var) {
        rd.m.e(y0Var, "possiblyOverriddenProperty");
        he.y0 y0VarA = ((he.y0) qf.i.L(y0Var)).a();
        rd.m.d(y0VarA, "getOriginal(...)");
        if (y0VarA instanceof cg.n0) {
            cg.n0 n0Var = (cg.n0) y0VarA;
            gf.o oVarH = n0Var.H();
            i.f fVar = kf.a.f19836d;
            rd.m.d(fVar, "propertySignature");
            a.d dVar = (a.d) jf.f.a(oVarH, fVar);
            if (dVar != null) {
                return new o.c(y0VarA, oVarH, dVar, n0Var.a0(), n0Var.V());
            }
        } else if (y0VarA instanceof xe.f) {
            xe.f fVar2 = (xe.f) y0VarA;
            he.g1 source = fVar2.getSource();
            bf.a aVar = source instanceof bf.a ? (bf.a) source : null;
            cf.l lVarB = aVar != null ? aVar.b() : null;
            if (lVarB instanceof ne.w) {
                return new o.a(((ne.w) lVarB).Q());
            }
            if (lVarB instanceof ne.z) {
                Method methodQ = ((ne.z) lVarB).Q();
                he.a1 a1VarH = fVar2.h();
                he.g1 source2 = a1VarH != null ? a1VarH.getSource() : null;
                bf.a aVar2 = source2 instanceof bf.a ? (bf.a) source2 : null;
                cf.l lVarB2 = aVar2 != null ? aVar2.b() : null;
                ne.z zVar = lVarB2 instanceof ne.z ? (ne.z) lVarB2 : null;
                return new o.b(methodQ, zVar != null ? zVar.Q() : null);
            }
            throw new z2("Incorrect resolution sequence for Java field " + y0VarA + " (source = " + lVarB + ')');
        }
        he.z0 z0VarF = y0VarA.f();
        rd.m.b(z0VarF);
        m.e eVarD = d(z0VarF);
        he.a1 a1VarH2 = y0VarA.h();
        return new o.d(eVarD, a1VarH2 != null ? d(a1VarH2) : null);
    }

    public final m g(he.z zVar) {
        Method methodQ;
        d.b bVarB;
        d.b bVarE;
        rd.m.e(zVar, "possiblySubstitutedFunction");
        he.z zVarA = ((he.z) qf.i.L(zVar)).a();
        rd.m.d(zVarA, "getOriginal(...)");
        if (!(zVarA instanceof cg.b)) {
            if (zVarA instanceof xe.e) {
                he.g1 source = ((xe.e) zVarA).getSource();
                bf.a aVar = source instanceof bf.a ? (bf.a) source : null;
                cf.l lVarB = aVar != null ? aVar.b() : null;
                ne.z zVar2 = lVarB instanceof ne.z ? (ne.z) lVarB : null;
                if (zVar2 != null && (methodQ = zVar2.Q()) != null) {
                    return new m.c(methodQ);
                }
                throw new z2("Incorrect resolution sequence for Java method " + zVarA);
            }
            if (!(zVarA instanceof xe.b)) {
                if (b(zVarA)) {
                    return d(zVarA);
                }
                throw new z2("Unknown origin of " + zVarA + " (" + zVarA.getClass() + ')');
            }
            he.g1 source2 = ((xe.b) zVarA).getSource();
            bf.a aVar2 = source2 instanceof bf.a ? (bf.a) source2 : null;
            cf.l lVarB2 = aVar2 != null ? aVar2.b() : null;
            if (lVarB2 instanceof ne.t) {
                return new m.b(((ne.t) lVarB2).Q());
            }
            if (lVarB2 instanceof ne.q) {
                ne.q qVar = (ne.q) lVarB2;
                if (qVar.q()) {
                    return new m.a(qVar.w());
                }
            }
            throw new z2("Incorrect resolution sequence for Java constructor " + zVarA + " (" + lVarB2 + ')');
        }
        cg.t tVar = (cg.t) zVarA;
        of.p pVarH = tVar.H();
        if ((pVarH instanceof gf.j) && (bVarE = lf.h.f20571a.e((gf.j) pVarH, tVar.a0(), tVar.V())) != null) {
            return new m.e(bVarE);
        }
        if (!(pVarH instanceof gf.e) || (bVarB = lf.h.f20571a.b((gf.e) pVarH, tVar.a0(), tVar.V())) == null) {
            return d(zVarA);
        }
        he.m mVarB = zVar.b();
        rd.m.d(mVarB, "getContainingDeclaration(...)");
        if (qf.k.b(mVarB)) {
            return new m.e(bVarB);
        }
        he.m mVarB2 = zVar.b();
        rd.m.d(mVarB2, "getContainingDeclaration(...)");
        if (!qf.k.d(mVarB2)) {
            return new m.d(bVarB);
        }
        he.l lVar = (he.l) zVar;
        if (lVar.D()) {
            if (!rd.m.a(bVarB.e(), "constructor-impl") || !rg.q.w(bVarB.d(), ")V", false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
        } else {
            if (!rd.m.a(bVarB.e(), "constructor-impl")) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
            he.e eVarE = lVar.E();
            rd.m.d(eVarE, "getConstructedClass(...)");
            String strU = ce.o.u(eVarE);
            if (rg.q.w(bVarB.d(), ")V", false, 2, null)) {
                bVarB = d.b.c(bVarB, null, rg.q.w0(bVarB.d(), "V") + strU, 1, null);
            } else if (!rg.q.w(bVarB.d(), strU, false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
        }
        return new m.e(bVarB);
    }
}
