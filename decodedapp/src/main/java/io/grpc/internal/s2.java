package io.grpc.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class s2 implements Executor, Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f17129d = Logger.getLogger(s2.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f17130e = c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Executor f17131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f17132b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f17133c = 0;

    private static abstract class b {
        private b() {
        }

        public abstract boolean a(s2 s2Var, int i10, int i11);

        public abstract void b(s2 s2Var, int i10);
    }

    private static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicIntegerFieldUpdater f17134a;

        @Override // io.grpc.internal.s2.b
        public boolean a(s2 s2Var, int i10, int i11) {
            return this.f17134a.compareAndSet(s2Var, i10, i11);
        }

        @Override // io.grpc.internal.s2.b
        public void b(s2 s2Var, int i10) {
            this.f17134a.set(s2Var, i10);
        }

        private c(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f17134a = atomicIntegerFieldUpdater;
        }
    }

    private static final class d extends b {
        private d() {
            super();
        }

        @Override // io.grpc.internal.s2.b
        public boolean a(s2 s2Var, int i10, int i11) {
            synchronized (s2Var) {
                try {
                    if (s2Var.f17133c != i10) {
                        return false;
                    }
                    s2Var.f17133c = i11;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.internal.s2.b
        public void b(s2 s2Var, int i10) {
            synchronized (s2Var) {
                s2Var.f17133c = i10;
            }
        }
    }

    public s2(Executor executor) {
        r9.l.o(executor, "'executor' must not be null.");
        this.f17131a = executor;
    }

    private static b c() {
        try {
            return new c(AtomicIntegerFieldUpdater.newUpdater(s2.class, "c"));
        } catch (Throwable th2) {
            f17129d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th2);
            return new d();
        }
    }

    private void d(Runnable runnable) {
        if (f17130e.a(this, 0, -1)) {
            try {
                this.f17131a.execute(this);
            } catch (Throwable th2) {
                if (runnable != null) {
                    this.f17132b.remove(runnable);
                }
                f17130e.b(this, 0);
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f17132b.add((Runnable) r9.l.o(runnable, "'r' must not be null."));
        d(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable;
        try {
            Executor executor = this.f17131a;
            while (executor == this.f17131a && (runnable = (Runnable) this.f17132b.poll()) != null) {
                try {
                    runnable.run();
                } catch (RuntimeException e10) {
                    f17129d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e10);
                }
            }
            f17130e.b(this, 0);
            if (this.f17132b.isEmpty()) {
                return;
            }
            d(null);
        } catch (Throwable th2) {
            f17130e.b(this, 0);
            throw th2;
        }
    }
}
