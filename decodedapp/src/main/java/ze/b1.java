package ze;

import eg.c1;
import eg.h2;
import eg.m2;
import he.g1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends ke.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ye.k f33126t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final cf.y f33127u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(ye.k kVar, cf.y yVar, int i10, he.m mVar) {
        super(kVar.e(), mVar, new ye.g(kVar, yVar, false, 4, null), yVar.getName(), m2.f12140e, false, i10, g1.f15281a, kVar.a().v());
        rd.m.e(kVar, "c");
        rd.m.e(yVar, "javaTypeParameter");
        rd.m.e(mVar, "containingDeclaration");
        this.f33126t = kVar;
        this.f33127u = yVar;
    }

    private final List M0() {
        Collection upperBounds = this.f33127u.getUpperBounds();
        if (upperBounds.isEmpty()) {
            c1 c1VarI = this.f33126t.d().o().i();
            rd.m.d(c1VarI, "getAnyType(...)");
            c1 c1VarJ = this.f33126t.d().o().J();
            rd.m.d(c1VarJ, "getNullableAnyType(...)");
            return ed.q.e(eg.u0.e(c1VarI, c1VarJ));
        }
        ArrayList arrayList = new ArrayList(ed.q.v(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f33126t.g().p((cf.j) it.next(), af.b.b(h2.f12104b, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // ke.h
    protected List G0(List list) {
        rd.m.e(list, "bounds");
        return this.f33126t.a().r().r(this, list, this.f33126t);
    }

    @Override // ke.h
    protected void K0(eg.r0 r0Var) {
        rd.m.e(r0Var, "type");
    }

    @Override // ke.h
    protected List L0() {
        return M0();
    }
}
