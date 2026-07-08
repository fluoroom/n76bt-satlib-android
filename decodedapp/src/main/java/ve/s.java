package ve;

import he.y0;
import qf.j;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements qf.j {
    @Override // qf.j
    public j.a a() {
        return j.a.BOTH;
    }

    @Override // qf.j
    public j.b b(he.a aVar, he.a aVar2, he.e eVar) {
        rd.m.e(aVar, "superDescriptor");
        rd.m.e(aVar2, "subDescriptor");
        if (!(aVar2 instanceof y0) || !(aVar instanceof y0)) {
            return j.b.UNKNOWN;
        }
        y0 y0Var = (y0) aVar2;
        y0 y0Var2 = (y0) aVar;
        return !rd.m.a(y0Var.getName(), y0Var2.getName()) ? j.b.UNKNOWN : (ze.d.a(y0Var) && ze.d.a(y0Var2)) ? j.b.OVERRIDABLE : (ze.d.a(y0Var) || ze.d.a(y0Var2)) ? j.b.INCOMPATIBLE : j.b.UNKNOWN;
    }
}
