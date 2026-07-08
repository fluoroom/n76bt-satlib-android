package eg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final r0 a(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        if (r0Var instanceof j2) {
            return ((j2) r0Var).K();
        }
        return null;
    }

    public static final l2 b(l2 l2Var, r0 r0Var) {
        rd.m.e(l2Var, "<this>");
        rd.m.e(r0Var, "origin");
        return d(l2Var, a(r0Var));
    }

    public static final l2 c(l2 l2Var, r0 r0Var, qd.l lVar) {
        rd.m.e(l2Var, "<this>");
        rd.m.e(r0Var, "origin");
        rd.m.e(lVar, "transform");
        r0 r0VarA = a(r0Var);
        return d(l2Var, r0VarA != null ? (r0) lVar.l(r0VarA) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final l2 d(l2 l2Var, r0 r0Var) {
        rd.m.e(l2Var, "<this>");
        if (l2Var instanceof j2) {
            return d(((j2) l2Var).G0(), r0Var);
        }
        if (r0Var == null || rd.m.a(r0Var, l2Var)) {
            return l2Var;
        }
        if (l2Var instanceof c1) {
            return new f1((c1) l2Var, r0Var);
        }
        if (l2Var instanceof i0) {
            return new k0((i0) l2Var, r0Var);
        }
        throw new dd.o();
    }
}
