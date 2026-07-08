package g1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Handler f13369e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile e f13371b = e.PENDING;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f13372c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicBoolean f13373d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FutureTask f13370a = new b(new a());

    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            d.this.f13373d.set(true);
            Object objB = null;
            try {
                Process.setThreadPriority(10);
                objB = d.this.b();
                Binder.flushPendingCommands();
                return objB;
            } finally {
            }
        }
    }

    class b extends FutureTask {
        b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                d.this.j(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                d.this.j(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f13376a;

        c(Object obj) {
            this.f13376a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.d(this.f13376a);
        }
    }

    /* JADX INFO: renamed from: g1.d$d, reason: collision with other inner class name */
    static /* synthetic */ class C0192d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13378a;

        static {
            int[] iArr = new int[e.values().length];
            f13378a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13378a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    d() {
    }

    private static Handler e() {
        Handler handler;
        synchronized (d.class) {
            try {
                if (f13369e == null) {
                    f13369e = new Handler(Looper.getMainLooper());
                }
                handler = f13369e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final boolean a(boolean z10) {
        this.f13372c.set(true);
        return this.f13370a.cancel(z10);
    }

    protected abstract Object b();

    public final void c(Executor executor) {
        if (this.f13371b == e.PENDING) {
            this.f13371b = e.RUNNING;
            executor.execute(this.f13370a);
            return;
        }
        int i10 = C0192d.f13378a[this.f13371b.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.f13371b = e.FINISHED;
    }

    public final boolean f() {
        return this.f13372c.get();
    }

    protected abstract void g(Object obj);

    protected abstract void h(Object obj);

    void i(Object obj) {
        e().post(new c(obj));
    }

    void j(Object obj) {
        if (this.f13373d.get()) {
            return;
        }
        i(obj);
    }
}
