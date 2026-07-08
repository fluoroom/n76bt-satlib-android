package sf;

import ee.o;
import eg.c1;
import eg.r0;
import he.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends e0 {
    public d0(short s10) {
        super(Short.valueOf(s10));
    }

    @Override // sf.g
    public r0 a(h0 h0Var) {
        c1 c1VarS;
        rd.m.e(h0Var, "module");
        he.e eVarB = he.y.b(h0Var, o.a.E0);
        return (eVarB == null || (c1VarS = eVarB.s()) == null) ? gg.l.d(gg.k.F0, "UShort") : c1VarS;
    }

    @Override // sf.g
    public String toString() {
        return ((Number) b()).intValue() + ".toUShort()";
    }
}
