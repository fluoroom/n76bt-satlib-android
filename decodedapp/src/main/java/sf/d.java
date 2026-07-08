package sf;

import eg.c1;
import he.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends r {
    public d(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // sf.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c1 a(h0 h0Var) {
        rd.m.e(h0Var, "module");
        c1 c1VarU = h0Var.o().u();
        rd.m.d(c1VarU, "getByteType(...)");
        return c1VarU;
    }

    @Override // sf.g
    public String toString() {
        return ((Number) b()).intValue() + ".toByte()";
    }
}
