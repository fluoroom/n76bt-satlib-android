package eg;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 {
    public static final ig.i a(g2 g2Var, ig.i iVar) {
        rd.m.e(g2Var, "<this>");
        rd.m.e(iVar, "inlineClassType");
        return b(g2Var, iVar, new HashSet());
    }

    private static final ig.i b(g2 g2Var, ig.i iVar, HashSet hashSet) {
        ig.i iVarB;
        ig.p pVarA = g2Var.A(iVar);
        if (!hashSet.add(pVarA)) {
            return null;
        }
        ig.q qVarW0 = g2Var.w0(pVarA);
        if (qVarW0 != null) {
            ig.i iVarE0 = g2Var.e0(qVarW0);
            ig.i iVarB2 = b(g2Var, iVarE0, hashSet);
            if (iVarB2 != null) {
                return ((iVarB2 instanceof ig.k) && g2Var.Z((ig.k) iVarB2) && g2Var.U(iVar) && (g2Var.z(g2Var.A(iVarE0)) || ((iVarE0 instanceof ig.k) && g2Var.Z((ig.k) iVarE0)))) ? g2Var.I(iVarE0) : (g2Var.U(iVarB2) || !g2Var.T(iVar)) ? iVarB2 : g2Var.I(iVarB2);
            }
            return null;
        }
        if (g2Var.z(pVarA)) {
            ig.i iVarP0 = g2Var.p0(iVar);
            if (iVarP0 == null || (iVarB = b(g2Var, iVarP0, hashSet)) == null) {
                return null;
            }
            if (!g2Var.U(iVar)) {
                return iVarB;
            }
            if (!g2Var.U(iVarB) && (!(iVarB instanceof ig.k) || !g2Var.Z((ig.k) iVarB))) {
                return g2Var.I(iVarB);
            }
        }
        return iVar;
    }
}
