package n2;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserView;
import c0.f;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f22399b = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile int f22400c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f22401a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f22402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f22404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ThreadFactory f22405d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e f22406e = e.f22420d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f22407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f22408g;

        b(boolean z10) {
            this.f22402a = z10;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f22407f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f22407f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f22403b, this.f22404c, this.f22408g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f22405d, this.f22407f, this.f22406e, this.f22402a));
            if (this.f22408g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f22407f = str;
            return this;
        }

        public b c(int i10) {
            this.f22403b = i10;
            this.f22404c = i10;
            return this;
        }
    }

    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: n2.a$c$a, reason: collision with other inner class name */
        class C0293a extends Thread {
            C0293a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0293a(runnable);
        }
    }

    private static final class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadFactory f22410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f22411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f22412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f22413d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AtomicInteger f22414e = new AtomicInteger();

        /* JADX INFO: renamed from: n2.a$d$a, reason: collision with other inner class name */
        class RunnableC0294a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f22415a;

            RunnableC0294a(Runnable runnable) {
                this.f22415a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f22413d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f22415a.run();
                } catch (Throwable th2) {
                    d.this.f22412c.a(th2);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f22410a = threadFactory;
            this.f22411b = str;
            this.f22412c = eVar;
            this.f22413d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f22410a.newThread(new RunnableC0294a(runnable));
            threadNewThread.setName("glide-" + this.f22411b + "-thread-" + this.f22414e.getAndIncrement());
            return threadNewThread;
        }
    }

    a(ExecutorService executorService) {
        this.f22401a = executorService;
    }

    static int a() {
        return c() >= 4 ? 2 : 1;
    }

    public static int c() {
        if (f22400c == 0) {
            f22400c = Math.min(4, n2.b.a());
        }
        return f22400c;
    }

    public static b k() {
        return new b(true).c(a()).b("animation");
    }

    public static a l() {
        return k().a();
    }

    public static b n() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a q() {
        return n().a();
    }

    public static b r() {
        return new b(false).c(c()).b("source");
    }

    public static a s() {
        return r().a();
    }

    public static a v() {
        return new a(new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, f22399b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f22420d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f22401a.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        f.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f22401a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f22401a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f22401a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f22401a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f22401a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f22401a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f22401a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f22401a.submit(runnable);
    }

    public String toString() {
        return this.f22401a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f22401a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f22401a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f22401a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f22401a.submit(callable);
    }

    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f22417a = new C0295a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f22418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f22419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f22420d;

        class b implements e {
            b() {
            }

            @Override // n2.a.e
            public void a(Throwable th2) {
                if (th2 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
            }
        }

        class c implements e {
            c() {
            }

            @Override // n2.a.e
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f22418b = bVar;
            f22419c = new c();
            f22420d = bVar;
        }

        void a(Throwable th2);

        /* JADX INFO: renamed from: n2.a$e$a, reason: collision with other inner class name */
        class C0295a implements e {
            C0295a() {
            }

            @Override // n2.a.e
            public void a(Throwable th2) {
            }
        }
    }
}
