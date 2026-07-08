package uc;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends AtomicReferenceArray implements Runnable, Callable, kc.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Object f29078b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f29079c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Object f29080d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Object f29081e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f29082a;

    public i(Runnable runnable, nc.a aVar) {
        super(3);
        this.f29082a = runnable;
        lazySet(0, aVar);
    }

    public void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f29081e) {
                return;
            }
            if (obj == f29079c) {
                future.cancel(false);
                return;
            } else if (obj == f29080d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // kc.b
    public boolean d() {
        Object obj = get(0);
        return obj == f29078b || obj == f29081e;
    }

    @Override // kc.b
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f29081e || obj5 == (obj3 = f29079c) || obj5 == (obj4 = f29080d)) {
                break;
            }
            boolean z10 = get(2) != Thread.currentThread();
            if (z10) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z10);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f29081e || obj == (obj2 = f29078b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((nc.a) obj).a(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean zCompareAndSet;
        Object obj4;
        lazySet(2, Thread.currentThread());
        try {
            this.f29082a.run();
        } finally {
            try {
            } catch (Throwable th2) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        Object obj5 = get(0);
        if (obj5 != f29078b && compareAndSet(0, obj5, f29081e) && obj5 != null) {
            ((nc.a) obj5).a(this);
        }
        do {
            obj4 = get(1);
            if (obj4 == f29079c || obj4 == f29080d) {
                return;
            }
        } while (!compareAndSet(1, obj4, f29081e));
    }
}
