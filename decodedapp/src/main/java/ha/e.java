package ha;

import ha.b;
import java.util.Collection;
import o8.c;
import q8.n;
import q8.o;

/* JADX INFO: loaded from: classes3.dex */
public class e extends b implements c.k {

    public class a extends b.C0213b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c.k f15204c;

        public a() {
            super();
        }

        public n f(o oVar) {
            n nVarD = e.this.f15190a.d(oVar);
            super.a(nVarD);
            return nVarD;
        }

        public Collection g() {
            return c();
        }

        public boolean h(n nVar) {
            return super.d(nVar);
        }

        public void i(c.k kVar) {
            this.f15204c = kVar;
        }
    }

    public e(o8.c cVar) {
        super(cVar);
    }

    @Override // o8.c.k
    public void k(n nVar) {
        a aVar = (a) this.f15192c.get(nVar);
        if (aVar == null || aVar.f15204c == null) {
            return;
        }
        aVar.f15204c.k(nVar);
    }

    @Override // ha.b
    void n() {
        o8.c cVar = this.f15190a;
        if (cVar != null) {
            cVar.B(this);
        }
    }

    public a o() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ha.b
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(n nVar) {
        nVar.a();
    }
}
