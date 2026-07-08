package eg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s1 {
    public static final w a(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        ig.i iVarQ0 = r0Var.Q0();
        w wVar = iVarQ0 instanceof w ? (w) iVarQ0 : null;
        if (wVar == null || !wVar.B0()) {
            return null;
        }
        return wVar;
    }

    public static final boolean b(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        ig.i iVarQ0 = r0Var.Q0();
        w wVar = iVarQ0 instanceof w ? (w) iVarQ0 : null;
        if (wVar != null) {
            return wVar.B0();
        }
        return false;
    }
}
