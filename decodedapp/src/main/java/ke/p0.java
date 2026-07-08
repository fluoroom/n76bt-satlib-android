package ke;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import xf.c;

/* JADX INFO: loaded from: classes3.dex */
public class p0 extends xf.l {

    /* JADX INFO: renamed from: b */
    private final he.h0 f19736b;

    /* JADX INFO: renamed from: c */
    private final mf.c f19737c;

    public p0(he.h0 h0Var, mf.c cVar) {
        rd.m.e(h0Var, "moduleDescriptor");
        rd.m.e(cVar, "fqName");
        this.f19736b = h0Var;
        this.f19737c = cVar;
    }

    @Override // xf.l, xf.n
    public Collection e(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        if (!dVar.a(xf.d.f32038c.f())) {
            return ed.q.k();
        }
        if (this.f19737c.c() && dVar.l().contains(c.b.f32037a)) {
            return ed.q.k();
        }
        Collection collectionQ = this.f19736b.q(this.f19737c, lVar);
        ArrayList arrayList = new ArrayList(collectionQ.size());
        Iterator it = collectionQ.iterator();
        while (it.hasNext()) {
            mf.f fVarF = ((mf.c) it.next()).f();
            if (((Boolean) lVar.l(fVarF)).booleanValue()) {
                og.a.a(arrayList, h(fVarF));
            }
        }
        return arrayList;
    }

    @Override // xf.l, xf.k
    public Set f() {
        return ed.r0.d();
    }

    protected final he.u0 h(mf.f fVar) {
        rd.m.e(fVar, "name");
        if (fVar.i()) {
            return null;
        }
        he.u0 u0VarY = this.f19736b.y(this.f19737c.b(fVar));
        if (u0VarY.isEmpty()) {
            return null;
        }
        return u0VarY;
    }

    public String toString() {
        return "subpackages of " + this.f19737c + " from " + this.f19736b;
    }
}
