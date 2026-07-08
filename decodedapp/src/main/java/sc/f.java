package sc;

import hc.h;
import hc.i;
import hc.j;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends sc.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j f27298b;

    static final class a extends AtomicReference implements i, kc.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i f27299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference f27300b = new AtomicReference();

        a(i iVar) {
            this.f27299a = iVar;
        }

        @Override // hc.i
        public void a(kc.b bVar) {
            nc.b.h(this.f27300b, bVar);
        }

        void b(kc.b bVar) {
            nc.b.h(this, bVar);
        }

        @Override // kc.b
        public boolean d() {
            return nc.b.e((kc.b) get());
        }

        @Override // kc.b
        public void dispose() {
            nc.b.a(this.f27300b);
            nc.b.a(this);
        }

        @Override // hc.i
        public void onComplete() {
            this.f27299a.onComplete();
        }

        @Override // hc.i
        public void onError(Throwable th2) {
            this.f27299a.onError(th2);
        }

        @Override // hc.i
        public void onNext(Object obj) {
            this.f27299a.onNext(obj);
        }
    }

    final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f27301a;

        b(a aVar) {
            this.f27301a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f27278a.a(this.f27301a);
        }
    }

    public f(h hVar, j jVar) {
        super(hVar);
        this.f27298b = jVar;
    }

    @Override // hc.g
    public void k(i iVar) {
        a aVar = new a(iVar);
        iVar.a(aVar);
        aVar.b(this.f27298b.b(new b(aVar)));
    }
}
