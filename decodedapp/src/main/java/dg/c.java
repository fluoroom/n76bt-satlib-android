package dg;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f11060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qd.l f11061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Lock lock, Runnable runnable, qd.l lVar) {
        super(lock);
        rd.m.e(lock, "lock");
        rd.m.e(runnable, "checkCancelled");
        rd.m.e(lVar, "interruptedExceptionHandler");
        this.f11060c = runnable;
        this.f11061d = lVar;
    }

    @Override // dg.d, dg.k
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f11060c.run();
            } catch (InterruptedException e10) {
                this.f11061d.l(e10);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Runnable runnable, qd.l lVar) {
        this(new ReentrantLock(), runnable, lVar);
        rd.m.e(runnable, "checkCancelled");
        rd.m.e(lVar, "interruptedExceptionHandler");
    }
}
