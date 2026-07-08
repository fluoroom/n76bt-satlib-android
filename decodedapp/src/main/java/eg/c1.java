package eg;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c1 extends l2 implements ig.k, ig.l {
    public c1() {
        super(null);
    }

    public abstract c1 U0(boolean z10);

    public abstract c1 V0(q1 q1Var);

    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            rg.q.m(sb2, "[", pf.n.O(pf.n.f24183k, (ie.c) it.next(), null, 2, null), "] ");
        }
        sb2.append(N0());
        if (!L0().isEmpty()) {
            ed.b0.f0(L0(), sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "<", (124 & 8) == 0 ? ">" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        if (O0()) {
            sb2.append("?");
        }
        return sb2.toString();
    }
}
