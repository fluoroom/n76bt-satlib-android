package j0;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
abstract class k {

    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18374b;

        /* JADX INFO: renamed from: j0.k$a$a, reason: collision with other inner class name */
        private static class C0234a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f18375a;

            C0234a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f18375a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f18375a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f18373a = str;
            this.f18374b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0234a(runnable, this.f18373a, this.f18374b);
        }
    }

    private static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f18376a;

        b(Handler handler) {
            this.f18376a = (Handler) l0.g.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f18376a.post((Runnable) l0.g.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f18376a + " is shutting down");
        }
    }

    private static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Callable f18377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l0.a f18378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f18379c;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l0.a f18380a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f18381b;

            a(l0.a aVar, Object obj) {
                this.f18380a = aVar;
                this.f18381b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18380a.accept(this.f18381b);
            }
        }

        c(Handler handler, Callable callable, l0.a aVar) {
            this.f18377a = callable;
            this.f18378b = aVar;
            this.f18379c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f18377a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f18379c.post(new a(this.f18378b, objCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static void c(Executor executor, Callable callable, l0.a aVar) {
        executor.execute(new c(j0.b.a(), callable, aVar));
    }

    static Object d(ExecutorService executorService, Callable callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
