package sf;

import eg.r0;
import he.h0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b extends g {

    /* JADX INFO: renamed from: b */
    private final qd.l f27330b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, qd.l lVar) {
        super(list);
        rd.m.e(list, "value");
        rd.m.e(lVar, "computeType");
        this.f27330b = lVar;
    }

    @Override // sf.g
    public r0 a(h0 h0Var) {
        rd.m.e(h0Var, "module");
        r0 r0Var = (r0) this.f27330b.l(h0Var);
        if (!ee.i.d0(r0Var) && !ee.i.r0(r0Var)) {
            ee.i.E0(r0Var);
        }
        return r0Var;
    }
}
