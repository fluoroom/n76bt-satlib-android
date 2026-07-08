package tg;

import hd.f;
import hd.i;
import tg.a0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 extends hd.a implements hd.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27796b = new a(null);

    public static final class a extends hd.b {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a0 d(i.b bVar) {
            if (bVar instanceof a0) {
                return (a0) bVar;
            }
            return null;
        }

        private a() {
            super(hd.f.f15241k, new qd.l() { // from class: tg.z
                @Override // qd.l
                public final Object l(Object obj) {
                    return a0.a.d((i.b) obj);
                }
            });
        }
    }

    public a0() {
        super(hd.f.f15241k);
    }

    public static /* synthetic */ a0 u0(a0 a0Var, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return a0Var.t0(i10, str);
    }

    public abstract void G(hd.i iVar, Runnable runnable);

    @Override // hd.f
    public final hd.e H(hd.e eVar) {
        return new xg.f(this, eVar);
    }

    @Override // hd.a, hd.i.b, hd.i
    public i.b a(i.c cVar) {
        return f.a.a(this, cVar);
    }

    @Override // hd.a, hd.i
    public hd.i k(i.c cVar) {
        return f.a.b(this, cVar);
    }

    public boolean p0(hd.i iVar) {
        return true;
    }

    public a0 t0(int i10, String str) {
        xg.i.a(i10);
        return new xg.h(this, i10, str);
    }

    public String toString() {
        return h0.a(this) + '@' + h0.b(this);
    }

    @Override // hd.f
    public final void w(hd.e eVar) {
        rd.m.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((xg.f) eVar).o();
    }
}
