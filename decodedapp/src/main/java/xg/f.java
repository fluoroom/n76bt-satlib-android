package xg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tg.l0;
import tg.n0;
import tg.s0;
import tg.y1;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends n0 implements jd.e, hd.e {

    /* JADX INFO: renamed from: h */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f32107h = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d */
    public final tg.a0 f32108d;

    /* JADX INFO: renamed from: e */
    public final hd.e f32109e;

    /* JADX INFO: renamed from: f */
    public Object f32110f;

    /* JADX INFO: renamed from: g */
    public final Object f32111g;

    public f(tg.a0 a0Var, hd.e eVar) {
        super(-1);
        this.f32108d = a0Var;
        this.f32109e = eVar;
        this.f32110f = g.f32112a;
        this.f32111g = e0.g(getContext());
    }

    private final tg.j k() {
        Object obj = f32107h.get(this);
        if (obj instanceof tg.j) {
            return (tg.j) obj;
        }
        return null;
    }

    @Override // jd.e
    public jd.e b() {
        hd.e eVar = this.f32109e;
        if (eVar instanceof jd.e) {
            return (jd.e) eVar;
        }
        return null;
    }

    @Override // hd.e
    public void d(Object obj) throws l0 {
        Object objB = tg.u.b(obj);
        if (g.d(this.f32108d, getContext())) {
            this.f32110f = objB;
            this.f27852c = 0;
            g.c(this.f32108d, getContext(), this);
            return;
        }
        s0 s0VarA = y1.f27879a.a();
        if (s0VarA.B0()) {
            this.f32110f = objB;
            this.f27852c = 0;
            s0VarA.x0(this);
            return;
        }
        s0VarA.z0(true);
        try {
            hd.i context = getContext();
            Object objI = e0.i(context, this.f32111g);
            try {
                this.f32109e.d(obj);
                dd.d0 d0Var = dd.d0.f10897a;
                while (s0VarA.D0()) {
                }
            } finally {
                e0.f(context, objI);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // hd.e
    public hd.i getContext() {
        return this.f32109e.getContext();
    }

    @Override // tg.n0
    public Object i() {
        Object obj = this.f32110f;
        this.f32110f = g.f32112a;
        return obj;
    }

    public final void j() {
        while (f32107h.get(this) == g.f32113b) {
        }
    }

    public final boolean m() {
        return f32107h.get(this) != null;
    }

    public final boolean n(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32107h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            x xVar = g.f32113b;
            if (rd.m.a(obj, xVar)) {
                if (androidx.concurrent.futures.b.a(f32107h, this, xVar, th2)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f32107h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void o() {
        j();
        tg.j jVarK = k();
        if (jVarK != null) {
            jVarK.p();
        }
    }

    public final Throwable p(tg.i iVar) {
        x xVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32107h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            xVar = g.f32113b;
            if (obj != xVar) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f32107h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f32107h, this, xVar, iVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f32108d + ", " + tg.h0.c(this.f32109e) + ']';
    }

    @Override // tg.n0
    public hd.e c() {
        return this;
    }
}
