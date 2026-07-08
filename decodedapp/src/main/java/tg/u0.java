package tg;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 extends s0 {
    protected abstract Thread E0();

    protected final void F0() {
        Thread threadE0 = E0();
        if (Thread.currentThread() != threadE0) {
            c.a();
            LockSupport.unpark(threadE0);
        }
    }
}
