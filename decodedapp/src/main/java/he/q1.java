package he;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q1 {
    public /* synthetic */ q1(rd.h hVar) {
        this();
    }

    public abstract boolean a(mf.f fVar);

    public final q1 b(qd.l lVar) {
        rd.m.e(lVar, "transform");
        if (this instanceof a0) {
            a0 a0Var = (a0) this;
            return new a0(a0Var.c(), (ig.j) lVar.l(a0Var.d()));
        }
        if (!(this instanceof i0)) {
            throw new dd.o();
        }
        List<dd.q> listC = ((i0) this).c();
        ArrayList arrayList = new ArrayList(ed.q.v(listC, 10));
        for (dd.q qVar : listC) {
            arrayList.add(dd.w.a((mf.f) qVar.a(), lVar.l((ig.j) qVar.b())));
        }
        return new i0(arrayList);
    }

    private q1() {
    }
}
