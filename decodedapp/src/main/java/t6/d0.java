package t6;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final List f27487a;

    public d0() {
        this.f27487a = new ArrayList();
    }

    public void a(s6.u uVar) {
        this.f27487a.add(uVar);
    }

    public Object b(e6.j jVar, p6.h hVar, Object obj, i7.b0 b0Var) {
        int size = this.f27487a.size();
        for (int i10 = 0; i10 < size; i10++) {
            s6.u uVar = (s6.u) this.f27487a.get(i10);
            e6.j jVarX1 = b0Var.x1(jVar.g1());
            jVarX1.X0();
            uVar.n(jVarX1, hVar, obj);
        }
        return obj;
    }

    public d0 c(i7.s sVar) {
        p6.l lVarT;
        ArrayList arrayList = new ArrayList(this.f27487a.size());
        for (s6.u uVar : this.f27487a) {
            s6.u uVarX = uVar.X(sVar.c(uVar.getName()));
            p6.l lVarX = uVarX.x();
            if (lVarX != null && (lVarT = lVarX.t(sVar)) != lVarX) {
                uVarX = uVarX.Y(lVarT);
            }
            arrayList.add(uVarX);
        }
        return new d0(arrayList);
    }

    protected d0(List list) {
        this.f27487a = list;
    }
}
