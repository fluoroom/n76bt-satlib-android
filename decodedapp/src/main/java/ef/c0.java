package ef;

import ee.o;
import ef.s;
import eg.r0;
import he.b1;
import he.f1;
import he.s1;
import java.util.Iterator;
import java.util.List;
import ve.t0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {
    private static final void a(StringBuilder sb2, r0 r0Var) {
        sb2.append(g(r0Var));
    }

    public static final String b(he.z zVar, boolean z10, boolean z11) {
        String strD;
        rd.m.e(zVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (zVar instanceof he.l) {
                strD = "<init>";
            } else {
                strD = zVar.getName().d();
                rd.m.d(strD, "asString(...)");
            }
            sb2.append(strD);
        }
        sb2.append("(");
        b1 b1VarL0 = zVar.l0();
        if (b1VarL0 != null) {
            r0 type = b1VarL0.getType();
            rd.m.d(type, "getType(...)");
            a(sb2, type);
        }
        Iterator it = zVar.i().iterator();
        while (it.hasNext()) {
            r0 type2 = ((s1) it.next()).getType();
            rd.m.d(type2, "getType(...)");
            a(sb2, type2);
        }
        sb2.append(")");
        if (z10) {
            if (j.c(zVar)) {
                sb2.append("V");
            } else {
                r0 r0VarG = zVar.g();
                rd.m.b(r0VarG);
                a(sb2, r0VarG);
            }
        }
        return sb2.toString();
    }

    public static /* synthetic */ String c(he.z zVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return b(zVar, z10, z11);
    }

    public static final String d(he.a aVar) {
        rd.m.e(aVar, "<this>");
        f0 f0Var = f0.f11965a;
        if (qf.i.E(aVar)) {
            return null;
        }
        he.m mVarB = aVar.b();
        he.e eVar = mVarB instanceof he.e ? (he.e) mVarB : null;
        if (eVar == null || eVar.getName().i()) {
            return null;
        }
        he.a aVarA = aVar.a();
        f1 f1Var = aVarA instanceof f1 ? (f1) aVarA : null;
        if (f1Var == null) {
            return null;
        }
        return b0.a(f0Var, eVar, c(f1Var, false, false, 3, null));
    }

    public static final boolean e(he.a aVar) {
        he.z zVarL;
        rd.m.e(aVar, "f");
        if (!(aVar instanceof he.z)) {
            return false;
        }
        he.z zVar = (he.z) aVar;
        if (rd.m.a(zVar.getName().d(), "remove") && zVar.i().size() == 1 && !t0.n((he.b) aVar)) {
            List listI = zVar.a().i();
            rd.m.d(listI, "getValueParameters(...)");
            r0 type = ((s1) ed.q.w0(listI)).getType();
            rd.m.d(type, "getType(...)");
            s sVarG = g(type);
            s.d dVar = sVarG instanceof s.d ? (s.d) sVarG : null;
            if ((dVar != null ? dVar.i() : null) != vf.e.INT || (zVarL = ve.i.l(zVar)) == null) {
                return false;
            }
            List listI2 = zVarL.a().i();
            rd.m.d(listI2, "getValueParameters(...)");
            r0 type2 = ((s1) ed.q.w0(listI2)).getType();
            rd.m.d(type2, "getType(...)");
            s sVarG2 = g(type2);
            he.m mVarB = zVarL.b();
            rd.m.d(mVarB, "getContainingDeclaration(...)");
            if (rd.m.a(uf.e.p(mVarB), o.a.f11872f0.i()) && (sVarG2 instanceof s.c) && rd.m.a(((s.c) sVarG2).i(), "java/lang/Object")) {
                return true;
            }
        }
        return false;
    }

    public static final String f(he.e eVar) {
        rd.m.e(eVar, "<this>");
        mf.b bVarN = ge.c.f13796a.n(uf.e.o(eVar).i());
        if (bVarN == null) {
            return j.b(eVar, null, 2, null);
        }
        String strH = vf.d.h(bVarN);
        rd.m.d(strH, "internalNameByClassId(...)");
        return strH;
    }

    public static final s g(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        return (s) j.e(r0Var, u.f12049a, i0.f11998o, h0.f11993a, null, null, 32, null);
    }
}
