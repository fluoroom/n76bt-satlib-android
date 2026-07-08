package qc;

import hc.i;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends AtomicReference implements i, kc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final mc.c f24868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final mc.c f24869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final mc.a f24870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final mc.c f24871d;

    public c(mc.c cVar, mc.c cVar2, mc.a aVar, mc.c cVar3) {
        this.f24868a = cVar;
        this.f24869b = cVar2;
        this.f24870c = aVar;
        this.f24871d = cVar3;
    }

    @Override // hc.i
    public void a(kc.b bVar) {
        if (nc.b.h(this, bVar)) {
            try {
                this.f24871d.accept(this);
            } catch (Throwable th2) {
                lc.b.b(th2);
                bVar.dispose();
                onError(th2);
            }
        }
    }

    @Override // kc.b
    public boolean d() {
        return get() == nc.b.DISPOSED;
    }

    @Override // kc.b
    public void dispose() {
        nc.b.a(this);
    }

    @Override // hc.i
    public void onComplete() {
        if (d()) {
            return;
        }
        lazySet(nc.b.DISPOSED);
        try {
            this.f24870c.run();
        } catch (Throwable th2) {
            lc.b.b(th2);
            yc.a.n(th2);
        }
    }

    @Override // hc.i
    public void onError(Throwable th2) {
        if (d()) {
            yc.a.n(th2);
            return;
        }
        lazySet(nc.b.DISPOSED);
        try {
            this.f24869b.accept(th2);
        } catch (Throwable th3) {
            lc.b.b(th3);
            yc.a.n(new lc.a(th2, th3));
        }
    }

    @Override // hc.i
    public void onNext(Object obj) {
        if (d()) {
            return;
        }
        try {
            this.f24868a.accept(obj);
        } catch (Throwable th2) {
            lc.b.b(th2);
            ((kc.b) get()).dispose();
            onError(th2);
        }
    }
}
