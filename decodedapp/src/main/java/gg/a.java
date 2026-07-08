package gg;

import ed.q;
import ed.r0;
import eg.d2;
import eg.f2;
import he.e0;
import he.g1;
import he.h0;
import he.t;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ke.k {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(mf.f fVar) {
        rd.m.e(fVar, "name");
        l lVar = l.f14501a;
        h0 h0VarI = lVar.i();
        e0 e0Var = e0.f15261d;
        he.f fVar2 = he.f.f15271b;
        List listK = q.k();
        g1 g1Var = g1.f15281a;
        super(h0VarI, fVar, e0Var, fVar2, listK, g1Var, false, dg.f.f11065e);
        ke.i iVarN1 = ke.i.n1(this, ie.h.f16054l.b(), true, g1Var);
        iVarN1.q1(q.k(), t.f15308d);
        rd.m.d(iVarN1, "apply(...)");
        xf.k kVarB = l.b(h.f14443s, iVarN1.getName().toString(), "");
        k kVar = k.B0;
        iVarN1.g1(new i(lVar.e(kVar, new String[0]), kVarB, kVar, null, false, new String[0], 24, null));
        K0(kVarB, r0.c(iVarN1), iVarN1);
    }

    @Override // ke.a, he.i1
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public he.e c(f2 f2Var) {
        rd.m.e(f2Var, "substitutor");
        return this;
    }

    @Override // ke.a, ke.z
    public xf.k K(d2 d2Var, fg.g gVar) {
        rd.m.e(d2Var, "typeSubstitution");
        rd.m.e(gVar, "kotlinTypeRefiner");
        return l.b(h.f14443s, getName().toString(), d2Var.toString());
    }

    @Override // ke.k
    public String toString() {
        String strD = getName().d();
        rd.m.d(strD, "asString(...)");
        return strD;
    }
}
