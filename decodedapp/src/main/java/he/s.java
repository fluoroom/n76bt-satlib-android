package he;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {
    public static final h a(m mVar) {
        rd.m.e(mVar, "<this>");
        m mVarB = mVar.b();
        if (mVarB != null && !(mVar instanceof n0)) {
            if (!b(mVarB)) {
                return a(mVarB);
            }
            if (mVarB instanceof h) {
                return (h) mVarB;
            }
        }
        return null;
    }

    public static final boolean b(m mVar) {
        rd.m.e(mVar, "<this>");
        return mVar.b() instanceof n0;
    }

    public static final boolean c(z zVar) {
        eg.c1 c1VarS;
        eg.r0 r0VarD;
        eg.r0 r0VarG;
        rd.m.e(zVar, "<this>");
        m mVarB = zVar.b();
        e eVar = mVarB instanceof e ? (e) mVarB : null;
        if (eVar != null) {
            e eVar2 = qf.k.g(eVar) ? eVar : null;
            if (eVar2 != null && (c1VarS = eVar2.s()) != null && (r0VarD = jg.d.D(c1VarS)) != null && (r0VarG = zVar.g()) != null && rd.m.a(zVar.getName(), lg.t.f20623e) && ((jg.d.s(r0VarG) || jg.d.t(r0VarG)) && zVar.i().size() == 1)) {
                eg.r0 type = ((s1) zVar.i().get(0)).getType();
                rd.m.d(type, "getType(...)");
                if (rd.m.a(jg.d.D(type), r0VarD) && zVar.q0().isEmpty() && zVar.l0() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final e d(h0 h0Var, mf.c cVar, pe.b bVar) {
        xf.k kVarY0;
        rd.m.e(h0Var, "<this>");
        rd.m.e(cVar, "fqName");
        rd.m.e(bVar, "lookupLocation");
        if (cVar.c()) {
            return null;
        }
        h hVarG = h0Var.y(cVar.d()).p().g(cVar.f(), bVar);
        e eVar = hVarG instanceof e ? (e) hVarG : null;
        if (eVar != null) {
            return eVar;
        }
        e eVarD = d(h0Var, cVar.d(), bVar);
        h hVarG2 = (eVarD == null || (kVarY0 = eVarD.y0()) == null) ? null : kVarY0.g(cVar.f(), bVar);
        if (hVarG2 instanceof e) {
            return (e) hVarG2;
        }
        return null;
    }
}
