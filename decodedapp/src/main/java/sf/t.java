package sf;

import eg.c1;
import he.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends r {
    public t(long j10) {
        super(Long.valueOf(j10));
    }

    @Override // sf.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c1 a(h0 h0Var) {
        rd.m.e(h0Var, "module");
        c1 c1VarG = h0Var.o().G();
        rd.m.d(c1VarG, "getLongType(...)");
        return c1VarG;
    }

    @Override // sf.g
    public String toString() {
        return ((Number) b()).longValue() + ".toLong()";
    }
}
