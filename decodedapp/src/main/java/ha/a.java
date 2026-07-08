package ha;

import ha.b;
import o8.c;
import q8.g;
import q8.h;

/* JADX INFO: loaded from: classes3.dex */
public class a extends b implements c.e {

    /* JADX INFO: renamed from: ha.a$a, reason: collision with other inner class name */
    public class C0212a extends b.C0213b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c.e f15188c;

        public C0212a() {
            super();
        }

        public g f(h hVar) {
            g gVarA = a.this.f15190a.a(hVar);
            super.a(gVarA);
            return gVarA;
        }

        public boolean g(g gVar) {
            return super.d(gVar);
        }
    }

    public a(o8.c cVar) {
        super(cVar);
    }

    @Override // o8.c.e
    public void f(g gVar) {
        C0212a c0212a = (C0212a) this.f15192c.get(gVar);
        if (c0212a == null || c0212a.f15188c == null) {
            return;
        }
        c0212a.f15188c.f(gVar);
    }

    @Override // ha.b
    void n() {
        o8.c cVar = this.f15190a;
        if (cVar != null) {
            cVar.v(this);
        }
    }

    public C0212a o() {
        return new C0212a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ha.b
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(g gVar) {
        gVar.a();
    }
}
