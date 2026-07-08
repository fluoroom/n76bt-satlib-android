package ze;

import java.util.Collection;
import java.util.List;
import ze.t0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a1 extends t0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(ye.k kVar) {
        super(kVar, null, 2, 0 == true ? 1 : 0);
        rd.m.e(kVar, "c");
    }

    @Override // ze.t0
    protected void C(mf.f fVar, Collection collection) {
        rd.m.e(fVar, "name");
        rd.m.e(collection, "result");
    }

    @Override // ze.t0
    protected he.b1 O() {
        return null;
    }

    @Override // ze.t0
    protected t0.a Y(cf.r rVar, List list, eg.r0 r0Var, List list2) {
        rd.m.e(rVar, "method");
        rd.m.e(list, "methodTypeParameters");
        rd.m.e(r0Var, "returnType");
        rd.m.e(list2, "valueParameters");
        return new t0.a(r0Var, null, list2, list, false, ed.q.k());
    }
}
