package af;

import ed.r0;
import eg.h2;
import he.l1;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final a a(h2 h2Var, boolean z10, boolean z11, l1 l1Var) {
        m.e(h2Var, "<this>");
        return new a(h2Var, null, z11, z10, l1Var != null ? r0.c(l1Var) : null, null, 34, null);
    }

    public static /* synthetic */ a b(h2 h2Var, boolean z10, boolean z11, l1 l1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            l1Var = null;
        }
        return a(h2Var, z10, z11, l1Var);
    }
}
