package tg;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends t0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i0 f27821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f27822s;

    static {
        Long l10;
        i0 i0Var = new i0();
        f27821r = i0Var;
        s0.A0(i0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f27822s = timeUnit.toNanos(l10.longValue());
    }

    private i0() {
    }

    private final synchronized void U0() {
        if (X0()) {
            debugStatus = 3;
            S0();
            rd.m.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread V0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f27821r.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean W0() {
        return debugStatus == 4;
    }

    private final boolean X0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean Y0() {
        if (X0()) {
            return false;
        }
        debugStatus = 1;
        rd.m.c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void Z0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // tg.u0
    protected Thread E0() {
        Thread thread = _thread;
        return thread == null ? V0() : thread;
    }

    @Override // tg.t0
    public void I0(Runnable runnable) {
        if (W0()) {
            Z0();
        }
        super.I0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zP0;
        y1.f27879a.c(this);
        c.a();
        try {
            if (!Y0()) {
                if (zP0) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jQ0 = Q0();
                if (jQ0 == Long.MAX_VALUE) {
                    c.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f27822s + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        U0();
                        c.a();
                        if (P0()) {
                            return;
                        }
                        E0();
                        return;
                    }
                    jQ0 = xd.d.d(jQ0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jQ0 > 0) {
                    if (X0()) {
                        _thread = null;
                        U0();
                        c.a();
                        if (P0()) {
                            return;
                        }
                        E0();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, jQ0);
                }
            }
        } finally {
            _thread = null;
            U0();
            c.a();
            if (!P0()) {
                E0();
            }
        }
    }

    @Override // tg.t0, tg.s0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // tg.a0
    public String toString() {
        return "DefaultExecutor";
    }
}
