package vc;

import hc.f;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends AtomicReference implements f, ck.c, kc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final mc.c f30531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final mc.c f30532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final mc.a f30533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final mc.c f30534d;

    public c(mc.c cVar, mc.c cVar2, mc.a aVar, mc.c cVar3) {
        this.f30531a = cVar;
        this.f30532b = cVar2;
        this.f30533c = aVar;
        this.f30534d = cVar3;
    }

    @Override // hc.f, ck.b
    public void a(ck.c cVar) {
        if (wc.d.g(this, cVar)) {
            try {
                this.f30534d.accept(this);
            } catch (Throwable th2) {
                lc.b.b(th2);
                cVar.cancel();
                onError(th2);
            }
        }
    }

    @Override // ck.c
    public void cancel() {
        wc.d.a(this);
    }

    @Override // kc.b
    public boolean d() {
        return get() == wc.d.CANCELLED;
    }

    @Override // kc.b
    public void dispose() {
        cancel();
    }

    @Override // ck.b
    public void onComplete() {
        Object obj = get();
        wc.d dVar = wc.d.CANCELLED;
        if (obj != dVar) {
            lazySet(dVar);
            try {
                this.f30533c.run();
            } catch (Throwable th2) {
                lc.b.b(th2);
                yc.a.n(th2);
            }
        }
    }

    @Override // ck.b
    public void onError(Throwable th2) {
        Object obj = get();
        wc.d dVar = wc.d.CANCELLED;
        if (obj == dVar) {
            yc.a.n(th2);
            return;
        }
        lazySet(dVar);
        try {
            this.f30532b.accept(th2);
        } catch (Throwable th3) {
            lc.b.b(th3);
            yc.a.n(new lc.a(th2, th3));
        }
    }

    @Override // ck.b
    public void onNext(Object obj) {
        if (d()) {
            return;
        }
        try {
            this.f30531a.accept(obj);
        } catch (Throwable th2) {
            lc.b.b(th2);
            ((ck.c) get()).cancel();
            onError(th2);
        }
    }

    @Override // ck.c
    public void request(long j10) {
        ((ck.c) get()).request(j10);
    }
}
