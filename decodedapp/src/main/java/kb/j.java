package kb;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Object f19610a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Executor f19611b = c();

    private static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Queue f19612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Runnable f19613b;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f19614a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f19615b;

            a(b bVar, Runnable runnable) {
                this.f19614a = runnable;
                this.f19615b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f19614a.run();
                } finally {
                    this.f19615b.a();
                }
            }
        }

        private b() {
            this.f19612a = new LinkedList();
        }

        protected synchronized void a() {
            Runnable runnable = (Runnable) this.f19612a.poll();
            this.f19613b = runnable;
            if (runnable != null) {
                j.f19611b.execute(runnable);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            this.f19612a.offer(new a(this, runnable));
            if (this.f19613b == null) {
                a();
            }
        }
    }

    public static void a(Runnable runnable) {
        try {
            f19611b.execute(runnable);
        } catch (RejectedExecutionException unused) {
        }
    }

    public static Executor b() {
        return new b();
    }

    private static Executor c() {
        return new ThreadPoolExecutor(0, 3, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }
}
