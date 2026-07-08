package wc;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends AtomicInteger implements pc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f31387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ck.b f31388b;

    public c(ck.b bVar, Object obj) {
        this.f31388b = bVar;
        this.f31387a = obj;
    }

    @Override // ck.c
    public void cancel() {
        lazySet(2);
    }

    @Override // pc.g
    public void clear() {
        lazySet(1);
    }

    @Override // pc.c
    public int e(int i10) {
        return i10 & 1;
    }

    @Override // pc.g
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // pc.g
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // pc.g
    public Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f31387a;
    }

    @Override // ck.c
    public void request(long j10) {
        if (d.h(j10) && compareAndSet(0, 1)) {
            ck.b bVar = this.f31388b;
            bVar.onNext(this.f31387a);
            if (get() != 2) {
                bVar.onComplete();
            }
        }
    }
}
