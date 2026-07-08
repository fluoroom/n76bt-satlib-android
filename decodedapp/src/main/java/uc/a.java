package uc;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
abstract class a extends AtomicReference implements kc.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final FutureTask f29034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final FutureTask f29035d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Runnable f29036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Thread f29037b;

    static {
        Runnable runnable = oc.a.f23403b;
        f29034c = new FutureTask(runnable, null);
        f29035d = new FutureTask(runnable, null);
    }

    a(Runnable runnable) {
        this.f29036a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f29034c) {
                return;
            }
            if (future2 == f29035d) {
                future.cancel(this.f29037b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // kc.b
    public final boolean d() {
        Future future = (Future) get();
        return future == f29034c || future == f29035d;
    }

    @Override // kc.b
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f29034c || future == (futureTask = f29035d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f29037b != Thread.currentThread());
    }
}
