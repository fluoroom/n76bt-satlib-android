package e3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f11416a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Executor f11417b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Executor f11418c = new c();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.v(runnable);
        }
    }

    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.u(runnable);
        }
    }

    class c implements Executor {
        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f11418c;
    }

    public static Executor b() {
        return f11416a;
    }
}
