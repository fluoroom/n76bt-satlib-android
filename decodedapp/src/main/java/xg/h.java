package xg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import tg.j0;
import tg.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends tg.a0 implements k0 {

    /* JADX INFO: renamed from: r */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f32114r = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ k0 f32115c;

    /* JADX INFO: renamed from: d */
    private final tg.a0 f32116d;

    /* JADX INFO: renamed from: e */
    private final int f32117e;

    /* JADX INFO: renamed from: f */
    private final String f32118f;

    /* JADX INFO: renamed from: g */
    private final m f32119g;

    /* JADX INFO: renamed from: h */
    private final Object f32120h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    private final class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private Runnable f32121a;

        public a(Runnable runnable) {
            this.f32121a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f32121a.run();
                } catch (Throwable th2) {
                    tg.c0.a(hd.j.f15243a, th2);
                }
                Runnable runnableA0 = h.this.A0();
                if (runnableA0 == null) {
                    return;
                }
                try {
                    this.f32121a = runnableA0;
                    i10++;
                    if (i10 >= 16 && g.d(h.this.f32116d, h.this)) {
                        g.c(h.this.f32116d, h.this, this);
                        return;
                    }
                } catch (Throwable th3) {
                    Object obj = h.this.f32120h;
                    h hVar = h.this;
                    synchronized (obj) {
                        h.z0().decrementAndGet(hVar);
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(tg.a0 a0Var, int i10, String str) {
        k0 k0Var = a0Var instanceof k0 ? (k0) a0Var : null;
        this.f32115c = k0Var == null ? j0.a() : k0Var;
        this.f32116d = a0Var;
        this.f32117e = i10;
        this.f32118f = str;
        this.f32119g = new m(false);
        this.f32120h = new Object();
    }

    public final Runnable A0() {
        while (true) {
            Runnable runnable = (Runnable) this.f32119g.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f32120h) {
                f32114r.decrementAndGet(this);
                if (this.f32119g.c() == 0) {
                    return null;
                }
                f32114r.incrementAndGet(this);
            }
        }
    }

    private final boolean B0() {
        synchronized (this.f32120h) {
            if (f32114r.get(this) >= this.f32117e) {
                return false;
            }
            f32114r.incrementAndGet(this);
            return true;
        }
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater z0() {
        return f32114r;
    }

    @Override // tg.a0
    public void G(hd.i iVar, Runnable runnable) {
        Runnable runnableA0;
        this.f32119g.a(runnable);
        if (f32114r.get(this) >= this.f32117e || !B0() || (runnableA0 = A0()) == null) {
            return;
        }
        try {
            g.c(this.f32116d, this, new a(runnableA0));
        } catch (Throwable th2) {
            f32114r.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // tg.a0
    public tg.a0 t0(int i10, String str) {
        i.a(i10);
        return i10 >= this.f32117e ? i.b(this, str) : super.t0(i10, str);
    }

    @Override // tg.a0
    public String toString() {
        String str = this.f32118f;
        if (str != null) {
            return str;
        }
        return this.f32116d + ".limitedParallelism(" + this.f32117e + ')';
    }
}
