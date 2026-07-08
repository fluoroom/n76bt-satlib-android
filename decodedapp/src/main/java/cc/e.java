package cc;

import androidx.appcompat.widget.ActivityChooserView;
import io.objectbox.BoxStore;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class e extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f4536b = "ObjectBox-";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BoxStore f4537a;

    static class a implements ThreadFactory {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final AtomicInteger f4538d = new AtomicInteger();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadGroup f4539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f4540b = e.f4536b + f4538d.incrementAndGet() + "-Thread-";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f4541c = new AtomicInteger();

        a() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f4539a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f4539a, runnable, this.f4540b + this.f4541c.incrementAndGet());
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            return thread;
        }
    }

    public e(BoxStore boxStore) {
        super(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new a());
        this.f4537a = boxStore;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th2) {
        super.afterExecute(runnable, th2);
        this.f4537a.v();
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        c0.f.a(this);
    }
}
