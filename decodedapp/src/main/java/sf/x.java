package sf;

import eg.c1;
import he.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str) {
        super(str);
        rd.m.e(str, "value");
    }

    @Override // sf.g
    /* JADX INFO: renamed from: c */
    public c1 a(h0 h0Var) {
        rd.m.e(h0Var, "module");
        c1 c1VarX = h0Var.o().X();
        rd.m.d(c1VarX, "getStringType(...)");
        return c1VarX;
    }

    @Override // sf.g
    public String toString() {
        return '\"' + ((String) b()) + '\"';
    }
}
