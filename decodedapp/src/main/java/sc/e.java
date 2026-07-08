package sc;

import hc.i;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends AtomicInteger implements pc.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i f27296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f27297b;

    public e(i iVar, Object obj) {
        this.f27296a = iVar;
        this.f27297b = obj;
    }

    @Override // pc.g
    public void clear() {
        lazySet(3);
    }

    @Override // kc.b
    public boolean d() {
        return get() == 3;
    }

    @Override // kc.b
    public void dispose() {
        set(3);
    }

    @Override // pc.c
    public int e(int i10) {
        if ((i10 & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    @Override // pc.g
    public boolean isEmpty() {
        return get() != 1;
    }

    @Override // pc.g
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // pc.g
    public Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f27297b;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.f27296a.onNext(this.f27297b);
            if (get() == 2) {
                lazySet(3);
                this.f27296a.onComplete();
            }
        }
    }
}
