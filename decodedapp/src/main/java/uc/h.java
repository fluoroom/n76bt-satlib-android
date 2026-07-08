package uc;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends a implements Callable {
    public h(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f29037b = Thread.currentThread();
        try {
            this.f29036a.run();
            return null;
        } finally {
            lazySet(a.f29034c);
            this.f29037b = null;
        }
    }
}
