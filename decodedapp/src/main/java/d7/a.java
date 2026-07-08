package d7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class a extends f implements Serializable {

    /* JADX INFO: renamed from: b */
    private final List f10804b;

    public a(l lVar) {
        super(lVar);
        this.f10804b = new ArrayList();
    }

    @Override // p6.n
    public p6.n A(int i10) {
        if (i10 < 0 || i10 >= this.f10804b.size()) {
            return null;
        }
        return (p6.n) this.f10804b.get(i10);
    }

    @Override // p6.n
    public m C() {
        return m.ARRAY;
    }

    @Override // p6.n
    public boolean D() {
        return true;
    }

    protected a b0(p6.n nVar) {
        this.f10804b.add(nVar);
        return this;
    }

    @Override // e6.w
    public e6.m c() {
        return e6.m.START_ARRAY;
    }

    public a c0(p6.n nVar) {
        if (nVar == null) {
            nVar = a0();
        }
        b0(nVar);
        return this;
    }

    @Override // d7.b, p6.o
    public void d(e6.g gVar, d0 d0Var) {
        List list = this.f10804b;
        int size = list.size();
        gVar.Y0(this, size);
        for (int i10 = 0; i10 < size; i10++) {
            ((p6.n) list.get(i10)).d(gVar, d0Var);
        }
        gVar.z0();
    }

    @Override // p6.o
    public void e(e6.g gVar, d0 d0Var, a7.h hVar) {
        n6.c cVarG = hVar.g(gVar, hVar.d(this, e6.m.START_ARRAY));
        Iterator it = this.f10804b.iterator();
        while (it.hasNext()) {
            ((b) ((p6.n) it.next())).d(gVar, d0Var);
        }
        hVar.h(gVar, cVarG);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            return this.f10804b.equals(((a) obj).f10804b);
        }
        return false;
    }

    @Override // p6.o.a
    public boolean f(d0 d0Var) {
        return this.f10804b.isEmpty();
    }

    public int hashCode() {
        return this.f10804b.hashCode();
    }

    @Override // p6.n
    public int size() {
        return this.f10804b.size();
    }

    @Override // p6.n
    public Iterator t() {
        return this.f10804b.iterator();
    }
}
