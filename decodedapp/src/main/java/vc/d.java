package vc;

import hc.f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class d extends AtomicInteger implements f, ck.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ck.b f30535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final xc.a f30536b = new xc.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicLong f30537c = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference f30538d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicBoolean f30539e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f30540f;

    public d(ck.b bVar) {
        this.f30535a = bVar;
    }

    @Override // hc.f, ck.b
    public void a(ck.c cVar) {
        if (this.f30539e.compareAndSet(false, true)) {
            this.f30535a.a(this);
            wc.d.e(this.f30538d, this.f30537c, cVar);
        } else {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // ck.c
    public void cancel() {
        if (this.f30540f) {
            return;
        }
        wc.d.a(this.f30538d);
    }

    @Override // ck.b
    public void onComplete() {
        this.f30540f = true;
        xc.f.a(this.f30535a, this, this.f30536b);
    }

    @Override // ck.b
    public void onError(Throwable th2) {
        this.f30540f = true;
        xc.f.b(this.f30535a, th2, this, this.f30536b);
    }

    @Override // ck.b
    public void onNext(Object obj) {
        xc.f.c(this.f30535a, obj, this, this.f30536b);
    }

    @Override // ck.c
    public void request(long j10) {
        if (j10 > 0) {
            wc.d.d(this.f30538d, this.f30537c, j10);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j10));
    }
}
