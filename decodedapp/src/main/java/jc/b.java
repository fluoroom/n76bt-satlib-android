package jc;

import android.os.Handler;
import android.os.Message;
import hc.j;
import java.util.concurrent.TimeUnit;
import kc.c;

/* JADX INFO: loaded from: classes3.dex */
final class b extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f18630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f18631c;

    private static final class a extends j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f18632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f18633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f18634c;

        a(Handler handler, boolean z10) {
            this.f18632a = handler;
            this.f18633b = z10;
        }

        @Override // hc.j.b
        public kc.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f18634c) {
                return c.a();
            }
            RunnableC0240b runnableC0240b = new RunnableC0240b(this.f18632a, yc.a.p(runnable));
            Message messageObtain = Message.obtain(this.f18632a, runnableC0240b);
            messageObtain.obj = this;
            if (this.f18633b) {
                messageObtain.setAsynchronous(true);
            }
            this.f18632a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f18634c) {
                return runnableC0240b;
            }
            this.f18632a.removeCallbacks(runnableC0240b);
            return c.a();
        }

        @Override // kc.b
        public boolean d() {
            return this.f18634c;
        }

        @Override // kc.b
        public void dispose() {
            this.f18634c = true;
            this.f18632a.removeCallbacksAndMessages(this);
        }
    }

    /* JADX INFO: renamed from: jc.b$b, reason: collision with other inner class name */
    private static final class RunnableC0240b implements Runnable, kc.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f18635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f18636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f18637c;

        RunnableC0240b(Handler handler, Runnable runnable) {
            this.f18635a = handler;
            this.f18636b = runnable;
        }

        @Override // kc.b
        public boolean d() {
            return this.f18637c;
        }

        @Override // kc.b
        public void dispose() {
            this.f18635a.removeCallbacks(this);
            this.f18637c = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f18636b.run();
            } catch (Throwable th2) {
                yc.a.n(th2);
            }
        }
    }

    b(Handler handler, boolean z10) {
        this.f18630b = handler;
        this.f18631c = z10;
    }

    @Override // hc.j
    public j.b a() {
        return new a(this.f18630b, this.f18631c);
    }

    @Override // hc.j
    public kc.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        RunnableC0240b runnableC0240b = new RunnableC0240b(this.f18630b, yc.a.p(runnable));
        Message messageObtain = Message.obtain(this.f18630b, runnableC0240b);
        if (this.f18631c) {
            messageObtain.setAsynchronous(true);
        }
        this.f18630b.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
        return runnableC0240b;
    }
}
