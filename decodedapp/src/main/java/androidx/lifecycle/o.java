package androidx.lifecycle;

import androidx.lifecycle.m;
import tg.j1;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n implements q {

    /* JADX INFO: renamed from: a */
    private final m f2663a;

    /* JADX INFO: renamed from: b */
    private final hd.i f2664b;

    static final class a extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e */
        int f2665e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ Object f2666f;

        a(hd.e eVar) {
            super(2, eVar);
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            a aVar = o.this.new a(eVar);
            aVar.f2666f = obj;
            return aVar;
        }

        @Override // jd.a
        public final Object o(Object obj) {
            id.b.e();
            if (this.f2665e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd.s.b(obj);
            tg.d0 d0Var = (tg.d0) this.f2666f;
            if (o.this.a().b().compareTo(m.b.f2652b) >= 0) {
                o.this.a().a(o.this);
            } else {
                j1.d(d0Var.G(), null, 1, null);
            }
            return dd.d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((a) g(d0Var, eVar)).o(dd.d0.f10897a);
        }
    }

    public o(m mVar, hd.i iVar) {
        rd.m.e(mVar, "lifecycle");
        rd.m.e(iVar, "coroutineContext");
        this.f2663a = mVar;
        this.f2664b = iVar;
        if (a().b() == m.b.f2651a) {
            j1.d(G(), null, 1, null);
        }
    }

    @Override // tg.d0
    public hd.i G() {
        return this.f2664b;
    }

    public m a() {
        return this.f2663a;
    }

    public final void b() {
        tg.g.b(this, tg.p0.c().v0(), null, new a(null), 2, null);
    }

    @Override // androidx.lifecycle.q
    public void k(t tVar, m.a aVar) {
        rd.m.e(tVar, "source");
        rd.m.e(aVar, "event");
        if (a().b().compareTo(m.b.f2651a) <= 0) {
            a().d(this);
            j1.d(G(), null, 1, null);
        }
    }
}
