package sf;

import eg.c1;
import he.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends g {
    public j(double d10) {
        super(Double.valueOf(d10));
    }

    @Override // sf.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c1 a(h0 h0Var) {
        rd.m.e(h0Var, "module");
        c1 c1VarA = h0Var.o().A();
        rd.m.d(c1VarA, "getDoubleType(...)");
        return c1VarA;
    }

    @Override // sf.g
    public String toString() {
        return ((Number) b()).doubleValue() + ".toDouble()";
    }
}
