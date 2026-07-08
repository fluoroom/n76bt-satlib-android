package ha;

import ha.b;
import o8.c;
import q8.l;
import q8.m;

/* JADX INFO: loaded from: classes3.dex */
public class d extends b implements c.j {

    public class a extends b.C0213b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c.j f15202c;

        public a() {
            super();
        }

        public l f(m mVar) {
            l lVarC = d.this.f15190a.c(mVar);
            super.a(lVarC);
            return lVarC;
        }

        public boolean g(l lVar) {
            return super.d(lVar);
        }
    }

    public d(o8.c cVar) {
        super(cVar);
    }

    @Override // o8.c.j
    public void b(l lVar) {
        a aVar = (a) this.f15192c.get(lVar);
        if (aVar == null || aVar.f15202c == null) {
            return;
        }
        aVar.f15202c.b(lVar);
    }

    @Override // ha.b
    void n() {
        o8.c cVar = this.f15190a;
        if (cVar != null) {
            cVar.A(this);
        }
    }

    public a o() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ha.b
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(l lVar) {
        lVar.a();
    }
}
