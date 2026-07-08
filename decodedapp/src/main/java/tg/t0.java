package tg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 extends u0 implements k0 {

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27871f = AtomicReferenceFieldUpdater.newUpdater(t0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: g */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27872g = AtomicReferenceFieldUpdater.newUpdater(t0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: h */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27873h = AtomicIntegerFieldUpdater.newUpdater(t0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    public static final class a extends xg.g0 {
    }

    private final void G0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27871f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f27871f, this, null, w0.f27877b)) {
                    return;
                }
            } else if (obj instanceof xg.n) {
                ((xg.n) obj).d();
                return;
            } else {
                if (obj == w0.f27877b) {
                    return;
                }
                xg.n nVar = new xg.n(8, true);
                rd.m.c(obj, "null cannot be cast to non-null type java.lang.Runnable");
                nVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f27871f, this, obj, nVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable H0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27871f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof xg.n) {
                rd.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                xg.n nVar = (xg.n) obj;
                Object objM = nVar.m();
                if (objM != xg.n.f32135h) {
                    return (Runnable) objM;
                }
                androidx.concurrent.futures.b.a(f27871f, this, obj, nVar.l());
            } else {
                if (obj == w0.f27877b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f27871f, this, obj, null)) {
                    rd.m.c(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void J0() {
    }

    private final boolean K0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27871f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (O0()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f27871f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof xg.n) {
                rd.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                xg.n nVar = (xg.n) obj;
                int iA = nVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.b.a(f27871f, this, obj, nVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == w0.f27877b) {
                    return false;
                }
                xg.n nVar2 = new xg.n(8, true);
                rd.m.c(obj, "null cannot be cast to non-null type java.lang.Runnable");
                nVar2.a((Runnable) obj);
                nVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f27871f, this, obj, nVar2)) {
                    return true;
                }
            }
        }
    }

    private final boolean O0() {
        return f27873h.get(this) == 1;
    }

    private final void R0() {
        c.a();
        System.nanoTime();
    }

    private final void T0(boolean z10) {
        f27873h.set(this, z10 ? 1 : 0);
    }

    @Override // tg.a0
    public final void G(hd.i iVar, Runnable runnable) {
        I0(runnable);
    }

    public void I0(Runnable runnable) {
        J0();
        if (K0(runnable)) {
            F0();
        } else {
            i0.f27821r.I0(runnable);
        }
    }

    protected boolean P0() {
        if (!C0()) {
            return false;
        }
        Object obj = f27871f.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof xg.n ? ((xg.n) obj).j() : obj == w0.f27877b;
    }

    public long Q0() {
        if (D0()) {
            return 0L;
        }
        J0();
        Runnable runnableH0 = H0();
        if (runnableH0 == null) {
            return y0();
        }
        runnableH0.run();
        return 0L;
    }

    protected final void S0() {
        f27871f.set(this, null);
        f27872g.set(this, null);
    }

    @Override // tg.s0
    public void shutdown() {
        y1.f27879a.b();
        T0(true);
        G0();
        while (Q0() <= 0) {
        }
        R0();
    }

    @Override // tg.s0
    protected long y0() {
        if (super.y0() == 0) {
            return 0L;
        }
        Object obj = f27871f.get(this);
        if (obj != null) {
            if (!(obj instanceof xg.n)) {
                return obj == w0.f27877b ? Long.MAX_VALUE : 0L;
            }
            if (!((xg.n) obj).j()) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }
}
