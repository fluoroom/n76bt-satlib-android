package l;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c f20306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f20307d = new Executor() { // from class: l.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.f().c(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f20308e = new Executor() { // from class: l.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.f().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f20309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f20310b;

    private c() {
        d dVar = new d();
        this.f20310b = dVar;
        this.f20309a = dVar;
    }

    public static c f() {
        if (f20306c != null) {
            return f20306c;
        }
        synchronized (c.class) {
            try {
                if (f20306c == null) {
                    f20306c = new c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f20306c;
    }

    @Override // l.e
    public void a(Runnable runnable) {
        this.f20309a.a(runnable);
    }

    @Override // l.e
    public boolean b() {
        return this.f20309a.b();
    }

    @Override // l.e
    public void c(Runnable runnable) {
        this.f20309a.c(runnable);
    }
}
