package sf;

import eg.c1;
import he.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends r {
    public w(short s10) {
        super(Short.valueOf(s10));
    }

    @Override // sf.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c1 a(h0 h0Var) {
        rd.m.e(h0Var, "module");
        c1 c1VarU = h0Var.o().U();
        rd.m.d(c1VarU, "getShortType(...)");
        return c1VarU;
    }

    @Override // sf.g
    public String toString() {
        return ((Number) b()).intValue() + ".toShort()";
    }
}
