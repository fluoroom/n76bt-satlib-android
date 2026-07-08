package sf;

import ee.o;
import eg.c1;
import eg.r0;
import he.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends e0 {
    public c0(long j10) {
        super(Long.valueOf(j10));
    }

    @Override // sf.g
    public r0 a(h0 h0Var) {
        c1 c1VarS;
        rd.m.e(h0Var, "module");
        he.e eVarB = he.y.b(h0Var, o.a.G0);
        return (eVarB == null || (c1VarS = eVarB.s()) == null) ? gg.l.d(gg.k.F0, "ULong") : c1VarS;
    }

    @Override // sf.g
    public String toString() {
        return ((Number) b()).longValue() + ".toULong()";
    }
}
