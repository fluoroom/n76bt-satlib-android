package ef;

import eg.a2;
import eg.i2;
import eg.m2;
import eg.q0;
import eg.r0;
import eg.u1;
import he.k1;
import he.l1;
import he.n0;
import he.z0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final String a(he.e eVar, g0 g0Var) {
        rd.m.e(eVar, "klass");
        rd.m.e(g0Var, "typeMappingConfiguration");
        String strE = g0Var.e(eVar);
        if (strE != null) {
            return strE;
        }
        he.m mVarB = eVar.b();
        rd.m.d(mVarB, "getContainingDeclaration(...)");
        String strF = mf.h.b(eVar.getName()).f();
        rd.m.d(strF, "getIdentifier(...)");
        if (mVarB instanceof n0) {
            mf.c cVarD = ((n0) mVarB).d();
            if (cVarD.c()) {
                return strF;
            }
            return rg.q.E(cVarD.a(), '.', '/', false, 4, null) + '/' + strF;
        }
        he.e eVar2 = mVarB instanceof he.e ? (he.e) mVarB : null;
        if (eVar2 == null) {
            throw new IllegalArgumentException("Unexpected container: " + mVarB + " for " + eVar);
        }
        String strF2 = g0Var.f(eVar2);
        if (strF2 == null) {
            strF2 = a(eVar2, g0Var);
        }
        return strF2 + '$' + strF;
    }

    public static /* synthetic */ String b(he.e eVar, g0 g0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g0Var = h0.f11993a;
        }
        return a(eVar, g0Var);
    }

    public static final boolean c(he.a aVar) {
        rd.m.e(aVar, "descriptor");
        if (aVar instanceof he.l) {
            return true;
        }
        r0 r0VarG = aVar.g();
        rd.m.b(r0VarG);
        if (!ee.i.D0(r0VarG)) {
            return false;
        }
        r0 r0VarG2 = aVar.g();
        rd.m.b(r0VarG2);
        return (i2.l(r0VarG2) || (aVar instanceof z0)) ? false : true;
    }

    public static final Object d(r0 r0Var, t tVar, i0 i0Var, g0 g0Var, q qVar, qd.q qVar2) {
        Object objA;
        r0 r0Var2;
        Object objD;
        rd.m.e(r0Var, "kotlinType");
        rd.m.e(tVar, "factory");
        rd.m.e(i0Var, "mode");
        rd.m.e(g0Var, "typeMappingConfiguration");
        rd.m.e(qVar2, "writeGenericType");
        r0 r0VarC = g0Var.c(r0Var);
        if (r0VarC != null) {
            return d(r0VarC, tVar, i0Var, g0Var, qVar, qVar2);
        }
        if (ee.h.r(r0Var)) {
            return d(ee.p.a(r0Var), tVar, i0Var, g0Var, qVar, qVar2);
        }
        fg.s sVar = fg.s.f13084a;
        Object objB = j0.b(sVar, r0Var, tVar, i0Var);
        if (objB != null) {
            Object objA2 = j0.a(tVar, objB, i0Var.d());
            qVar2.k(r0Var, objA2, i0Var);
            return objA2;
        }
        u1 u1VarN0 = r0Var.N0();
        if (u1VarN0 instanceof q0) {
            q0 q0Var = (q0) u1VarN0;
            r0 r0VarH = q0Var.h();
            if (r0VarH == null) {
                r0VarH = g0Var.d(q0Var.e());
            }
            return d(jg.d.D(r0VarH), tVar, i0Var, g0Var, qVar, qVar2);
        }
        he.h hVarQ = u1VarN0.q();
        if (hVarQ == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + r0Var);
        }
        if (gg.l.m(hVarQ)) {
            Object objD2 = tVar.d("error/NonExistentClass");
            g0Var.b(r0Var, (he.e) hVarQ);
            return objD2;
        }
        boolean z10 = hVarQ instanceof he.e;
        if (z10 && ee.i.d0(r0Var)) {
            if (r0Var.L0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            a2 a2Var = (a2) r0Var.L0().get(0);
            r0 type = a2Var.getType();
            rd.m.d(type, "getType(...)");
            if (a2Var.a() == m2.f12141f) {
                objD = tVar.d("java/lang/Object");
            } else {
                m2 m2VarA = a2Var.a();
                rd.m.d(m2VarA, "getProjectionKind(...)");
                objD = d(type, tVar, i0Var.f(m2VarA, true), g0Var, qVar, qVar2);
            }
            return tVar.c('[' + tVar.a(objD));
        }
        if (!z10) {
            if (hVarQ instanceof l1) {
                r0 r0VarO = jg.d.o((l1) hVarQ);
                if (r0Var.O0()) {
                    r0VarO = jg.d.B(r0VarO);
                }
                return d(r0VarO, tVar, i0Var, g0Var, null, og.i.l());
            }
            if ((hVarQ instanceof k1) && i0Var.b()) {
                return d(((k1) hVarQ).X(), tVar, i0Var, g0Var, qVar, qVar2);
            }
            throw new UnsupportedOperationException("Unknown type " + r0Var);
        }
        if (qf.k.b(hVarQ) && !i0Var.c() && (r0Var2 = (r0) eg.h0.a(sVar, r0Var)) != null) {
            return d(r0Var2, tVar, i0Var.g(), g0Var, qVar, qVar2);
        }
        if (i0Var.e() && ee.i.m0((he.e) hVarQ)) {
            objA = tVar.f();
        } else {
            he.e eVar = (he.e) hVarQ;
            he.e eVarA = eVar.a();
            rd.m.d(eVarA, "getOriginal(...)");
            objA = g0Var.a(eVarA);
            if (objA == null) {
                if (eVar.j() == he.f.f15274e) {
                    he.m mVarB = eVar.b();
                    rd.m.c(mVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    eVar = (he.e) mVarB;
                }
                he.e eVarA2 = eVar.a();
                rd.m.d(eVarA2, "getOriginal(...)");
                objA = tVar.d(a(eVarA2, g0Var));
            }
        }
        qVar2.k(r0Var, objA, i0Var);
        return objA;
    }

    public static /* synthetic */ Object e(r0 r0Var, t tVar, i0 i0Var, g0 g0Var, q qVar, qd.q qVar2, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            qVar2 = og.i.l();
        }
        return d(r0Var, tVar, i0Var, g0Var, qVar, qVar2);
    }
}
