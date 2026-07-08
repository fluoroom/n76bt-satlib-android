package io.grpc.internal;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
class r2 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f17102c = Logger.getLogger(r2.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f17103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayDeque f17104b;

    r2() {
    }

    private void a() {
        while (true) {
            Runnable runnable = (Runnable) this.f17104b.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th2) {
                f17102c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th2);
            }
        }
    }

    private void b(Runnable runnable) {
        if (this.f17104b == null) {
            this.f17104b = new ArrayDeque(4);
        }
        this.f17104b.add(runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        r9.l.o(runnable, "'task' must not be null.");
        if (this.f17103a) {
            b(runnable);
            return;
        }
        this.f17103a = true;
        try {
            runnable.run();
        } catch (Throwable th2) {
            try {
                f17102c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th2);
                if (this.f17104b != null) {
                }
            } finally {
                if (this.f17104b != null) {
                    a();
                }
                this.f17103a = false;
            }
        }
    }
}
