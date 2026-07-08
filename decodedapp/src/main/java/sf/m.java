package sf;

import eg.c1;
import he.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends g {
    public m(float f10) {
        super(Float.valueOf(f10));
    }

    @Override // sf.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c1 a(h0 h0Var) {
        rd.m.e(h0Var, "module");
        c1 c1VarC = h0Var.o().C();
        rd.m.d(c1VarC, "getFloatType(...)");
        return c1VarC;
    }

    @Override // sf.g
    public String toString() {
        return ((Number) b()).floatValue() + ".toFloat()";
    }
}
