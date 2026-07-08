package cf;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {
    private static final boolean a(r rVar) {
        mf.c cVarD;
        b0 b0Var = (b0) ed.q.y0(rVar.i());
        x type = b0Var != null ? b0Var.getType() : null;
        j jVar = type instanceof j ? (j) type : null;
        if (jVar == null) {
            return false;
        }
        i iVarF = jVar.f();
        return (iVarF instanceof g) && (cVarD = ((g) iVarF).d()) != null && rd.m.a(cVarD.a(), "java.lang.Object");
    }

    private static final boolean b(r rVar) {
        String strD = rVar.getName().d();
        int iHashCode = strD.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode == -1295482945) {
                if (strD.equals("equals")) {
                    return a(rVar);
                }
                return false;
            }
            if (iHashCode != 147696667 || !strD.equals("hashCode")) {
                return false;
            }
        } else if (!strD.equals("toString")) {
            return false;
        }
        return rVar.i().isEmpty();
    }

    public static final boolean c(q qVar) {
        rd.m.e(qVar, "<this>");
        return qVar.N().G() && (qVar instanceof r) && b((r) qVar);
    }
}
