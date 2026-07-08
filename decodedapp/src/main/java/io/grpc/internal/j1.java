package io.grpc.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f16651b = Logger.getLogger(j1.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f16652a;

    public j1(Runnable runnable) {
        this.f16652a = (Runnable) r9.l.o(runnable, "task");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f16652a.run();
        } catch (Throwable th2) {
            f16651b.log(Level.SEVERE, "Exception while executing runnable " + this.f16652a, th2);
            r9.r.f(th2);
            throw new AssertionError(th2);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f16652a + ")";
    }
}
