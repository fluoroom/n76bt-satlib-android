package qf;

import eg.c1;
import eg.f2;
import eg.m2;
import eg.r0;
import he.a0;
import he.i0;
import he.q1;
import he.t1;
import he.y0;
import he.z0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final mf.c f25138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final mf.b f25139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final mf.c f25140c;

    static {
        mf.c cVar = new mf.c("kotlin.jvm.JvmInline");
        f25138a = cVar;
        f25139b = mf.b.f21989d.c(cVar);
        f25140c = new mf.c("kotlin.jvm.JvmName");
    }

    public static final boolean a(he.a aVar) {
        rd.m.e(aVar, "<this>");
        if (!(aVar instanceof z0)) {
            return false;
        }
        y0 y0VarC0 = ((z0) aVar).C0();
        rd.m.d(y0VarC0, "getCorrespondingProperty(...)");
        return f(y0VarC0);
    }

    public static final boolean b(he.m mVar) {
        rd.m.e(mVar, "<this>");
        return (mVar instanceof he.e) && (((he.e) mVar).z0() instanceof a0);
    }

    public static final boolean c(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        he.h hVarQ = r0Var.N0().q();
        if (hVarQ != null) {
            return b(hVarQ);
        }
        return false;
    }

    public static final boolean d(he.m mVar) {
        rd.m.e(mVar, "<this>");
        return (mVar instanceof he.e) && (((he.e) mVar).z0() instanceof i0);
    }

    public static final boolean e(t1 t1Var) {
        a0 a0VarQ;
        rd.m.e(t1Var, "<this>");
        if (t1Var.l0() != null) {
            return false;
        }
        he.m mVarB = t1Var.b();
        mf.f fVarC = null;
        he.e eVar = mVarB instanceof he.e ? (he.e) mVarB : null;
        if (eVar != null && (a0VarQ = uf.e.q(eVar)) != null) {
            fVarC = a0VarQ.c();
        }
        return rd.m.a(fVarC, t1Var.getName());
    }

    public static final boolean f(t1 t1Var) {
        q1 q1VarZ0;
        rd.m.e(t1Var, "<this>");
        if (t1Var.l0() != null) {
            return false;
        }
        he.m mVarB = t1Var.b();
        he.e eVar = mVarB instanceof he.e ? (he.e) mVarB : null;
        if (eVar == null || (q1VarZ0 = eVar.z0()) == null) {
            return false;
        }
        mf.f name = t1Var.getName();
        rd.m.d(name, "getName(...)");
        return q1VarZ0.a(name);
    }

    public static final boolean g(he.m mVar) {
        rd.m.e(mVar, "<this>");
        return b(mVar) || d(mVar);
    }

    public static final boolean h(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        he.h hVarQ = r0Var.N0().q();
        if (hVarQ != null) {
            return g(hVarQ);
        }
        return false;
    }

    public static final boolean i(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        he.h hVarQ = r0Var.N0().q();
        return (hVarQ == null || !d(hVarQ) || fg.s.f13084a.U(r0Var)) ? false : true;
    }

    public static final r0 j(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        r0 r0VarK = k(r0Var);
        if (r0VarK != null) {
            return f2.f(r0Var).p(r0VarK, m2.f12140e);
        }
        return null;
    }

    public static final r0 k(r0 r0Var) {
        a0 a0VarQ;
        rd.m.e(r0Var, "<this>");
        he.h hVarQ = r0Var.N0().q();
        he.e eVar = hVarQ instanceof he.e ? (he.e) hVarQ : null;
        if (eVar == null || (a0VarQ = uf.e.q(eVar)) == null) {
            return null;
        }
        return (c1) a0VarQ.d();
    }
}
