package tg;

import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tg.h;

/* JADX INFO: loaded from: classes3.dex */
public class j extends n0 implements i, jd.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27823f = AtomicIntegerFieldUpdater.newUpdater(j.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27824g = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27825h = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final hd.e f27826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final hd.i f27827e;

    public j(hd.e eVar, int i10) {
        super(i10);
        this.f27826d = eVar;
        this.f27827e = eVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = d.f27804a;
    }

    private final q0 B() {
        f1 f1Var = (f1) getContext().a(f1.f27816q);
        if (f1Var == null) {
            return null;
        }
        q0 q0VarH = j1.h(f1Var, false, new m(this), 1, null);
        androidx.concurrent.futures.b.a(f27825h, this, null, q0VarH);
        return q0VarH;
    }

    private final void C(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27824g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d) {
                if (androidx.concurrent.futures.b.a(f27824g, this, obj2, obj)) {
                    return;
                }
            } else if (obj2 instanceof h) {
                G(obj, obj2);
            } else {
                if (obj2 instanceof s) {
                    s sVar = (s) obj2;
                    if (!sVar.c()) {
                        G(obj, obj2);
                    }
                    if (obj2 instanceof l) {
                        Throwable th2 = sVar.f27867a;
                        if (obj instanceof h) {
                            k((h) obj, th2);
                            return;
                        }
                        rd.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        android.support.v4.media.session.b.a(obj);
                        m(null, th2);
                        return;
                    }
                    return;
                }
                if (obj2 instanceof r) {
                    r rVar = (r) obj2;
                    if (rVar.f27860b != null) {
                        G(obj, obj2);
                    }
                    rd.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    h hVar = (h) obj;
                    if (rVar.c()) {
                        k(hVar, rVar.f27863e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f27824g, this, obj2, r.b(rVar, null, hVar, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    rd.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.b.a(f27824g, this, obj2, new r(obj2, (h) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean F() {
        if (!o0.c(this.f27852c)) {
            return false;
        }
        hd.e eVar = this.f27826d;
        rd.m.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((xg.f) eVar).m();
    }

    private final void G(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static /* synthetic */ void L(j jVar, Object obj, int i10, qd.q qVar, int i11, Object obj2) throws l0 {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            qVar = null;
        }
        jVar.K(obj, i10, qVar);
    }

    private final Object M(s1 s1Var, Object obj, int i10, qd.q qVar, Object obj2) {
        if (obj instanceof s) {
            return obj;
        }
        if ((o0.b(i10) || obj2 != null) && !(qVar == null && !(s1Var instanceof h) && obj2 == null)) {
            return new r(obj, s1Var instanceof h ? (h) s1Var : null, qVar, obj2, null, 16, null);
        }
        return obj;
    }

    private final boolean N() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27823f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f27823f.compareAndSet(this, i10, WXVideoFileObject.FILE_SIZE_LIMIT + (536870911 & i10)));
        return true;
    }

    private final boolean O() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27823f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f27823f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void j(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void m(xg.w wVar, Throwable th2) {
        if ((f27823f.get(this) & 536870911) == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            getContext();
            throw null;
        } catch (Throwable th3) {
            c0.a(getContext(), new t("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    private final boolean o(Throwable th2) {
        if (!F()) {
            return false;
        }
        hd.e eVar = this.f27826d;
        rd.m.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((xg.f) eVar).n(th2);
    }

    private final void q() {
        if (F()) {
            return;
        }
        p();
    }

    private final void r(int i10) throws l0 {
        if (N()) {
            return;
        }
        o0.a(this, i10);
    }

    private final q0 t() {
        return (q0) f27825h.get(this);
    }

    private final String w() {
        Object objV = v();
        return objV instanceof s1 ? "Active" : objV instanceof l ? "Cancelled" : "Completed";
    }

    public void A() {
        q0 q0VarB = B();
        if (q0VarB != null && E()) {
            q0VarB.dispose();
            f27825h.set(this, r1.f27865a);
        }
    }

    public final void D(h hVar) {
        C(hVar);
    }

    public boolean E() {
        return !(v() instanceof s1);
    }

    protected String H() {
        return "CancellableContinuation";
    }

    public final void I(Throwable th2) {
        if (o(th2)) {
            return;
        }
        n(th2);
        q();
    }

    public final void J() throws l0 {
        Throwable thP;
        hd.e eVar = this.f27826d;
        xg.f fVar = eVar instanceof xg.f ? (xg.f) eVar : null;
        if (fVar == null || (thP = fVar.p(this)) == null) {
            return;
        }
        p();
        n(thP);
    }

    public final void K(Object obj, int i10, qd.q qVar) throws l0 {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27824g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof s1)) {
                Object obj3 = obj;
                qd.q qVar2 = qVar;
                if (obj2 instanceof l) {
                    l lVar = (l) obj2;
                    if (lVar.e()) {
                        if (qVar2 != null) {
                            l(qVar2, lVar.f27867a, obj3);
                            return;
                        }
                        return;
                    }
                }
                j(obj3);
                throw new dd.f();
            }
            Object obj4 = obj;
            int i11 = i10;
            qd.q qVar3 = qVar;
            if (androidx.concurrent.futures.b.a(f27824g, this, obj2, M((s1) obj2, obj4, i11, qVar3, null))) {
                q();
                r(i11);
                return;
            } else {
                obj = obj4;
                i10 = i11;
                qVar = qVar3;
            }
        }
    }

    @Override // tg.n0
    public void a(Object obj, Throwable th2) {
        Throwable th3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27824g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof s1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof s) {
                return;
            }
            if (obj2 instanceof r) {
                r rVar = (r) obj2;
                if (rVar.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th4 = th2;
                th3 = th4;
                if (androidx.concurrent.futures.b.a(f27824g, this, obj2, r.b(rVar, null, null, null, null, th4, 15, null))) {
                    rVar.d(this, th3);
                    return;
                }
            } else {
                th3 = th2;
                if (androidx.concurrent.futures.b.a(f27824g, this, obj2, new r(obj2, null, null, null, th3, 14, null))) {
                    return;
                }
            }
            th2 = th3;
        }
    }

    @Override // jd.e
    public jd.e b() {
        hd.e eVar = this.f27826d;
        if (eVar instanceof jd.e) {
            return (jd.e) eVar;
        }
        return null;
    }

    @Override // tg.n0
    public final hd.e c() {
        return this.f27826d;
    }

    @Override // hd.e
    public void d(Object obj) throws l0 {
        L(this, u.c(obj, this), this.f27852c, null, 4, null);
    }

    @Override // tg.i
    public void e(qd.l lVar) {
        k.a(this, new h.a(lVar));
    }

    @Override // tg.n0
    public Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // tg.n0
    public Object g(Object obj) {
        return obj instanceof r ? ((r) obj).f27859a : obj;
    }

    @Override // hd.e
    public hd.i getContext() {
        return this.f27827e;
    }

    @Override // tg.n0
    public Object i() {
        return v();
    }

    public final void k(h hVar, Throwable th2) {
        try {
            hVar.a(th2);
        } catch (Throwable th3) {
            c0.a(getContext(), new t("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void l(qd.q qVar, Throwable th2, Object obj) {
        try {
            qVar.k(th2, obj, getContext());
        } catch (Throwable th3) {
            c0.a(getContext(), new t("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public boolean n(Throwable th2) throws l0 {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27824g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof s1)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f27824g, this, obj, new l(this, th2, obj instanceof h)));
        if (((s1) obj) instanceof h) {
            k((h) obj, th2);
        }
        q();
        r(this.f27852c);
        return true;
    }

    public final void p() {
        q0 q0VarT = t();
        if (q0VarT == null) {
            return;
        }
        q0VarT.dispose();
        f27825h.set(this, r1.f27865a);
    }

    public Throwable s(f1 f1Var) {
        return f1Var.s();
    }

    public String toString() {
        return H() + '(' + h0.c(this.f27826d) + "){" + w() + "}@" + h0.b(this);
    }

    public final Object u() throws Throwable {
        f1 f1Var;
        boolean zF = F();
        if (O()) {
            if (t() == null) {
                B();
            }
            if (zF) {
                J();
            }
            return id.b.e();
        }
        if (zF) {
            J();
        }
        Object objV = v();
        if (objV instanceof s) {
            throw ((s) objV).f27867a;
        }
        if (!o0.b(this.f27852c) || (f1Var = (f1) getContext().a(f1.f27816q)) == null || f1Var.c()) {
            return g(objV);
        }
        CancellationException cancellationExceptionS = f1Var.s();
        a(objV, cancellationExceptionS);
        throw cancellationExceptionS;
    }

    public final Object v() {
        return f27824g.get(this);
    }
}
