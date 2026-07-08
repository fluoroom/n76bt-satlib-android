package tg;

import hd.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tg.f1;

/* JADX INFO: loaded from: classes3.dex */
public class l1 implements f1, p, t1 {

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27833a = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27834b = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    private static final class a extends k1 {

        /* JADX INFO: renamed from: e */
        private final l1 f27835e;

        /* JADX INFO: renamed from: f */
        private final b f27836f;

        /* JADX INFO: renamed from: g */
        private final o f27837g;

        /* JADX INFO: renamed from: h */
        private final Object f27838h;

        public a(l1 l1Var, b bVar, o oVar, Object obj) {
            this.f27835e = l1Var;
            this.f27836f = bVar;
            this.f27837g = oVar;
            this.f27838h = obj;
        }

        @Override // tg.k1
        public boolean v() {
            return false;
        }

        @Override // tg.k1
        public void w(Throwable th2) {
            this.f27835e.z(this.f27836f, this.f27837g, this.f27838h);
        }
    }

    private static final class b implements b1 {

        /* JADX INFO: renamed from: b */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f27839b = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f27840c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f27841d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a */
        private final p1 f27842a;

        public b(p1 p1Var, boolean z10, Throwable th2) {
            this.f27842a = p1Var;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        private final ArrayList b() {
            return new ArrayList(4);
        }

        private final Object e() {
            return f27841d.get(this);
        }

        private final void o(Object obj) {
            f27841d.set(this, obj);
        }

        public final void a(Throwable th2) {
            Throwable thF = f();
            if (thF == null) {
                p(th2);
                return;
            }
            if (th2 == thF) {
                return;
            }
            Object objE = e();
            if (objE == null) {
                o(th2);
                return;
            }
            if (objE instanceof Throwable) {
                if (th2 == objE) {
                    return;
                }
                ArrayList arrayListB = b();
                arrayListB.add(objE);
                arrayListB.add(th2);
                o(arrayListB);
                return;
            }
            if (objE instanceof ArrayList) {
                ((ArrayList) objE).add(th2);
                return;
            }
            throw new IllegalStateException(("State is " + objE).toString());
        }

        @Override // tg.b1
        public boolean c() {
            return f() == null;
        }

        @Override // tg.b1
        public p1 d() {
            return this.f27842a;
        }

        public final Throwable f() {
            return (Throwable) f27840c.get(this);
        }

        public final boolean j() {
            return f() != null;
        }

        public final boolean k() {
            return f27839b.get(this) == 1;
        }

        public final boolean l() {
            return e() == m1.f27849e;
        }

        public final List m(Throwable th2) {
            ArrayList arrayListB;
            Object objE = e();
            if (objE == null) {
                arrayListB = b();
            } else if (objE instanceof Throwable) {
                ArrayList arrayListB2 = b();
                arrayListB2.add(objE);
                arrayListB = arrayListB2;
            } else {
                if (!(objE instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objE).toString());
                }
                arrayListB = (ArrayList) objE;
            }
            Throwable thF = f();
            if (thF != null) {
                arrayListB.add(0, thF);
            }
            if (th2 != null && !rd.m.a(th2, thF)) {
                arrayListB.add(th2);
            }
            o(m1.f27849e);
            return arrayListB;
        }

        public final void n(boolean z10) {
            f27839b.set(this, z10 ? 1 : 0);
        }

        public final void p(Throwable th2) {
            f27840c.set(this, th2);
        }

        public String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + d() + ']';
        }
    }

    public l1(boolean z10) {
        this._state$volatile = z10 ? m1.f27851g : m1.f27850f;
    }

    private final Throwable A(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new g1(t(), null, this) : th2;
        }
        rd.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((t1) obj).W();
    }

    private final Object B(b bVar, Object obj) throws Throwable {
        boolean zJ;
        Throwable thD;
        s sVar = obj instanceof s ? (s) obj : null;
        Throwable th2 = sVar != null ? sVar.f27867a : null;
        synchronized (bVar) {
            zJ = bVar.j();
            List listM = bVar.m(th2);
            thD = D(bVar, listM);
            if (thD != null) {
                h(thD, listM);
            }
        }
        if (thD != null && thD != th2) {
            obj = new s(thD, false, 2, null);
        }
        if (thD != null && (p(thD) || N(thD))) {
            rd.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((s) obj).c();
        }
        if (!zJ) {
            d0(thD);
        }
        e0(obj);
        androidx.concurrent.futures.b.a(f27833a, this, bVar, m1.g(obj));
        y(bVar, obj);
        return obj;
    }

    private final Throwable C(Object obj) {
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar != null) {
            return sVar.f27867a;
        }
        return null;
    }

    private final Throwable D(b bVar, List list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (bVar.j()) {
                return new g1(t(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        return th2 != null ? th2 : (Throwable) list.get(0);
    }

    private final p1 I(b1 b1Var) {
        p1 p1VarD = b1Var.d();
        if (p1VarD != null) {
            return p1VarD;
        }
        if (b1Var instanceof r0) {
            return new p1();
        }
        if (b1Var instanceof k1) {
            i0((k1) b1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + b1Var).toString());
    }

    private final Object U(Object obj) throws Throwable {
        Throwable thA = null;
        while (true) {
            Object objK = K();
            if (objK instanceof b) {
                synchronized (objK) {
                    if (((b) objK).l()) {
                        return m1.f27848d;
                    }
                    boolean zJ = ((b) objK).j();
                    if (obj != null || !zJ) {
                        if (thA == null) {
                            thA = A(obj);
                        }
                        ((b) objK).a(thA);
                    }
                    Throwable thF = zJ ? null : ((b) objK).f();
                    if (thF != null) {
                        b0(((b) objK).d(), thF);
                    }
                    return m1.f27845a;
                }
            }
            if (!(objK instanceof b1)) {
                return m1.f27848d;
            }
            if (thA == null) {
                thA = A(obj);
            }
            b1 b1Var = (b1) objK;
            if (!b1Var.c()) {
                Object objS0 = s0(objK, new s(thA, false, 2, null));
                if (objS0 == m1.f27845a) {
                    throw new IllegalStateException(("Cannot happen in " + objK).toString());
                }
                if (objS0 != m1.f27847c) {
                    return objS0;
                }
            } else if (r0(b1Var, thA)) {
                return m1.f27845a;
            }
        }
    }

    private final o a0(xg.l lVar) {
        while (lVar.q()) {
            lVar = lVar.m();
        }
        while (true) {
            lVar = lVar.l();
            if (!lVar.q()) {
                if (lVar instanceof o) {
                    return (o) lVar;
                }
                if (lVar instanceof p1) {
                    return null;
                }
            }
        }
    }

    private final void b0(p1 p1Var, Throwable th2) throws Throwable {
        d0(th2);
        p1Var.g(4);
        Object objK = p1Var.k();
        rd.m.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        t tVar = null;
        for (xg.l lVarL = (xg.l) objK; !rd.m.a(lVarL, p1Var); lVarL = lVarL.l()) {
            if ((lVarL instanceof k1) && ((k1) lVarL).v()) {
                try {
                    ((k1) lVarL).w(th2);
                } catch (Throwable th3) {
                    if (tVar != null) {
                        dd.b.a(tVar, th3);
                    } else {
                        tVar = new t("Exception in completion handler " + lVarL + " for " + this, th3);
                        dd.d0 d0Var = dd.d0.f10897a;
                    }
                }
            }
        }
        if (tVar != null) {
            O(tVar);
        }
        p(th2);
    }

    private final void c0(p1 p1Var, Throwable th2) throws Throwable {
        p1Var.g(1);
        Object objK = p1Var.k();
        rd.m.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        t tVar = null;
        for (xg.l lVarL = (xg.l) objK; !rd.m.a(lVarL, p1Var); lVarL = lVarL.l()) {
            if (lVarL instanceof k1) {
                try {
                    ((k1) lVarL).w(th2);
                } catch (Throwable th3) {
                    if (tVar != null) {
                        dd.b.a(tVar, th3);
                    } else {
                        tVar = new t("Exception in completion handler " + lVarL + " for " + this, th3);
                        dd.d0 d0Var = dd.d0.f10897a;
                    }
                }
            }
        }
        if (tVar != null) {
            O(tVar);
        }
    }

    private final void g0(r0 r0Var) {
        p1 p1Var = new p1();
        Object a1Var = p1Var;
        if (!r0Var.c()) {
            a1Var = new a1(p1Var);
        }
        androidx.concurrent.futures.b.a(f27833a, this, r0Var, a1Var);
    }

    private final void h(Throwable th2, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th3 = (Throwable) it.next();
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                dd.b.a(th2, th3);
            }
        }
    }

    private final void i0(k1 k1Var) {
        k1Var.f(new p1());
        androidx.concurrent.futures.b.a(f27833a, this, k1Var, k1Var.l());
    }

    private final int l0(Object obj) {
        if (obj instanceof r0) {
            if (((r0) obj).c()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f27833a, this, obj, m1.f27851g)) {
                return -1;
            }
            f0();
            return 1;
        }
        if (!(obj instanceof a1)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f27833a, this, obj, ((a1) obj).d())) {
            return -1;
        }
        f0();
        return 1;
    }

    private final String m0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof b1 ? ((b1) obj).c() ? "Active" : "New" : obj instanceof s ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.j() ? "Cancelling" : bVar.k() ? "Completing" : "Active";
    }

    private final Object o(Object obj) {
        Object objS0;
        do {
            Object objK = K();
            if (!(objK instanceof b1) || ((objK instanceof b) && ((b) objK).k())) {
                return m1.f27845a;
            }
            objS0 = s0(objK, new s(A(obj), false, 2, null));
        } while (objS0 == m1.f27847c);
        return objS0;
    }

    public static /* synthetic */ CancellationException o0(l1 l1Var, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return l1Var.n0(th2, str);
    }

    private final boolean p(Throwable th2) {
        if (S()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        n nVarJ = J();
        return (nVarJ == null || nVarJ == r1.f27865a) ? z10 : nVarJ.a(th2) || z10;
    }

    private final boolean q0(b1 b1Var, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.b.a(f27833a, this, b1Var, m1.g(obj))) {
            return false;
        }
        d0(null);
        e0(obj);
        y(b1Var, obj);
        return true;
    }

    private final boolean r0(b1 b1Var, Throwable th2) throws Throwable {
        p1 p1VarI = I(b1Var);
        if (p1VarI == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f27833a, this, b1Var, new b(p1VarI, false, th2))) {
            return false;
        }
        b0(p1VarI, th2);
        return true;
    }

    private final Object s0(Object obj, Object obj2) {
        return !(obj instanceof b1) ? m1.f27845a : ((!(obj instanceof r0) && !(obj instanceof k1)) || (obj instanceof o) || (obj2 instanceof s)) ? t0((b1) obj, obj2) : q0((b1) obj, obj2) ? obj2 : m1.f27847c;
    }

    private final Object t0(b1 b1Var, Object obj) throws Throwable {
        p1 p1VarI = I(b1Var);
        if (p1VarI == null) {
            return m1.f27847c;
        }
        b bVar = b1Var instanceof b ? (b) b1Var : null;
        if (bVar == null) {
            bVar = new b(p1VarI, false, null);
        }
        rd.b0 b0Var = new rd.b0();
        synchronized (bVar) {
            if (bVar.k()) {
                return m1.f27845a;
            }
            bVar.n(true);
            if (bVar != b1Var && !androidx.concurrent.futures.b.a(f27833a, this, b1Var, bVar)) {
                return m1.f27847c;
            }
            boolean zJ = bVar.j();
            s sVar = obj instanceof s ? (s) obj : null;
            if (sVar != null) {
                bVar.a(sVar.f27867a);
            }
            Throwable thF = zJ ? null : bVar.f();
            b0Var.f25935a = thF;
            dd.d0 d0Var = dd.d0.f10897a;
            if (thF != null) {
                b0(p1VarI, thF);
            }
            o oVarA0 = a0(p1VarI);
            if (oVarA0 != null && u0(bVar, oVarA0, obj)) {
                return m1.f27846b;
            }
            p1VarI.g(2);
            o oVarA02 = a0(p1VarI);
            return (oVarA02 == null || !u0(bVar, oVarA02, obj)) ? B(bVar, obj) : m1.f27846b;
        }
    }

    private final boolean u0(b bVar, o oVar, Object obj) {
        while (i1.g(oVar.f27854e, false, new a(this, bVar, oVar, obj)) == r1.f27865a) {
            oVar = a0(oVar);
            if (oVar == null) {
                return false;
            }
        }
        return true;
    }

    private final void y(b1 b1Var, Object obj) throws Throwable {
        n nVarJ = J();
        if (nVarJ != null) {
            nVarJ.dispose();
            k0(r1.f27865a);
        }
        s sVar = obj instanceof s ? (s) obj : null;
        Throwable th2 = sVar != null ? sVar.f27867a : null;
        if (!(b1Var instanceof k1)) {
            p1 p1VarD = b1Var.d();
            if (p1VarD != null) {
                c0(p1VarD, th2);
                return;
            }
            return;
        }
        try {
            ((k1) b1Var).w(th2);
        } catch (Throwable th3) {
            O(new t("Exception in completion handler " + b1Var + " for " + this, th3));
        }
    }

    public final void z(b bVar, o oVar, Object obj) {
        o oVarA0 = a0(oVar);
        if (oVarA0 == null || !u0(bVar, oVarA0, obj)) {
            bVar.d().g(2);
            o oVarA02 = a0(oVar);
            if (oVarA02 == null || !u0(bVar, oVarA02, obj)) {
                i(B(bVar, obj));
            }
        }
    }

    public boolean E() {
        return true;
    }

    public boolean F() {
        return false;
    }

    public final n J() {
        return (n) f27834b.get(this);
    }

    public final Object K() {
        return f27833a.get(this);
    }

    protected boolean N(Throwable th2) {
        return false;
    }

    protected final void P(f1 f1Var) {
        if (f1Var == null) {
            k0(r1.f27865a);
            return;
        }
        f1Var.start();
        n nVarX = f1Var.X(this);
        k0(nVarX);
        if (R()) {
            nVarX.dispose();
            k0(r1.f27865a);
        }
    }

    public final q0 Q(boolean z10, k1 k1Var) {
        boolean z11;
        boolean zB;
        k1Var.x(this);
        while (true) {
            Object objK = K();
            z11 = true;
            if (!(objK instanceof r0)) {
                if (!(objK instanceof b1)) {
                    z11 = false;
                    break;
                }
                b1 b1Var = (b1) objK;
                p1 p1VarD = b1Var.d();
                if (p1VarD == null) {
                    rd.m.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    i0((k1) objK);
                } else {
                    if (k1Var.v()) {
                        b bVar = b1Var instanceof b ? (b) b1Var : null;
                        Throwable thF = bVar != null ? bVar.f() : null;
                        if (thF != null) {
                            if (z10) {
                                k1Var.w(thF);
                            }
                            return r1.f27865a;
                        }
                        zB = p1VarD.b(k1Var, 5);
                    } else {
                        zB = p1VarD.b(k1Var, 1);
                    }
                    if (zB) {
                        break;
                    }
                }
            } else {
                r0 r0Var = (r0) objK;
                if (!r0Var.c()) {
                    g0(r0Var);
                } else if (androidx.concurrent.futures.b.a(f27833a, this, objK, k1Var)) {
                    break;
                }
            }
        }
        if (z11) {
            return k1Var;
        }
        if (z10) {
            Object objK2 = K();
            s sVar = objK2 instanceof s ? (s) objK2 : null;
            k1Var.w(sVar != null ? sVar.f27867a : null);
        }
        return r1.f27865a;
    }

    public final boolean R() {
        return !(K() instanceof b1);
    }

    protected boolean S() {
        return false;
    }

    public final boolean V(Object obj) {
        Object objS0;
        do {
            objS0 = s0(K(), obj);
            if (objS0 == m1.f27845a) {
                return false;
            }
            if (objS0 == m1.f27846b) {
                return true;
            }
        } while (objS0 == m1.f27847c);
        i(objS0);
        return true;
    }

    @Override // tg.t1
    public CancellationException W() {
        Throwable thF;
        Object objK = K();
        if (objK instanceof b) {
            thF = ((b) objK).f();
        } else if (objK instanceof s) {
            thF = ((s) objK).f27867a;
        } else {
            if (objK instanceof b1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objK).toString());
            }
            thF = null;
        }
        CancellationException cancellationException = thF instanceof CancellationException ? (CancellationException) thF : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new g1("Parent job is " + m0(objK), thF, this);
    }

    @Override // tg.f1
    public final n X(p pVar) {
        o oVar = new o(pVar);
        oVar.x(this);
        while (true) {
            Object objK = K();
            if (objK instanceof r0) {
                r0 r0Var = (r0) objK;
                if (!r0Var.c()) {
                    g0(r0Var);
                } else if (androidx.concurrent.futures.b.a(f27833a, this, objK, oVar)) {
                    return oVar;
                }
            } else {
                if (!(objK instanceof b1)) {
                    Object objK2 = K();
                    s sVar = objK2 instanceof s ? (s) objK2 : null;
                    oVar.w(sVar != null ? sVar.f27867a : null);
                    return r1.f27865a;
                }
                p1 p1VarD = ((b1) objK).d();
                if (p1VarD != null) {
                    if (!p1VarD.b(oVar, 7)) {
                        boolean zB = p1VarD.b(oVar, 3);
                        Object objK3 = K();
                        if (objK3 instanceof b) {
                            thF = ((b) objK3).f();
                        } else {
                            s sVar2 = objK3 instanceof s ? (s) objK3 : null;
                            if (sVar2 != null) {
                                thF = sVar2.f27867a;
                            }
                        }
                        oVar.w(thF);
                        if (!zB) {
                            return r1.f27865a;
                        }
                    }
                    return oVar;
                }
                rd.m.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                i0((k1) objK);
            }
        }
    }

    public final Object Y(Object obj) {
        Object objS0;
        do {
            objS0 = s0(K(), obj);
            if (objS0 == m1.f27845a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, C(obj));
            }
        } while (objS0 == m1.f27847c);
        return objS0;
    }

    public String Z() {
        return h0.a(this);
    }

    @Override // hd.i.b, hd.i
    public i.b a(i.c cVar) {
        return f1.a.b(this, cVar);
    }

    @Override // tg.f1
    public boolean c() {
        Object objK = K();
        return (objK instanceof b1) && ((b1) objK).c();
    }

    @Override // hd.i.b
    public final i.c getKey() {
        return f1.f27816q;
    }

    @Override // tg.f1
    public void h0(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new g1(t(), null, this);
        }
        m(cancellationException);
    }

    public final boolean j(Object obj) throws Throwable {
        Object objU = m1.f27845a;
        if (F() && (objU = o(obj)) == m1.f27846b) {
            return true;
        }
        if (objU == m1.f27845a) {
            objU = U(obj);
        }
        if (objU == m1.f27845a || objU == m1.f27846b) {
            return true;
        }
        if (objU == m1.f27848d) {
            return false;
        }
        i(objU);
        return true;
    }

    public final void j0(k1 k1Var) {
        Object objK;
        do {
            objK = K();
            if (!(objK instanceof k1)) {
                if (!(objK instanceof b1) || ((b1) objK).d() == null) {
                    return;
                }
                k1Var.r();
                return;
            }
            if (objK != k1Var) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f27833a, this, objK, m1.f27851g));
    }

    @Override // hd.i
    public hd.i k(i.c cVar) {
        return f1.a.c(this, cVar);
    }

    public final void k0(n nVar) {
        f27834b.set(this, nVar);
    }

    @Override // hd.i
    public hd.i l(hd.i iVar) {
        return f1.a.d(this, iVar);
    }

    public void m(Throwable th2) throws Throwable {
        j(th2);
    }

    protected final CancellationException n0(Throwable th2, String str) {
        CancellationException g1Var = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (g1Var == null) {
            if (str == null) {
                str = t();
            }
            g1Var = new g1(str, th2, this);
        }
        return g1Var;
    }

    public final String p0() {
        return Z() + '{' + m0(K()) + '}';
    }

    @Override // tg.p
    public final void q(t1 t1Var) throws Throwable {
        j(t1Var);
    }

    @Override // hd.i
    public Object r(Object obj, qd.p pVar) {
        return f1.a.a(this, obj, pVar);
    }

    @Override // tg.f1
    public final CancellationException s() {
        Object objK = K();
        if (!(objK instanceof b)) {
            if (objK instanceof b1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objK instanceof s) {
                return o0(this, ((s) objK).f27867a, null, 1, null);
            }
            return new g1(h0.a(this) + " has completed normally", null, this);
        }
        Throwable thF = ((b) objK).f();
        if (thF != null) {
            CancellationException cancellationExceptionN0 = n0(thF, h0.a(this) + " is cancelling");
            if (cancellationExceptionN0 != null) {
                return cancellationExceptionN0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // tg.f1
    public final boolean start() {
        int iL0;
        do {
            iL0 = l0(K());
            if (iL0 == 0) {
                return false;
            }
        } while (iL0 != 1);
        return true;
    }

    public String t() {
        return "Job was cancelled";
    }

    public String toString() {
        return p0() + '@' + h0.b(this);
    }

    public boolean u(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return j(th2) && E();
    }

    @Override // tg.f1
    public final q0 x(boolean z10, boolean z11, qd.l lVar) {
        return Q(z11, z10 ? new d1(lVar) : new e1(lVar));
    }

    protected void f0() {
    }

    public void O(Throwable th2) throws Throwable {
        throw th2;
    }

    protected void d0(Throwable th2) {
    }

    protected void e0(Object obj) {
    }

    protected void i(Object obj) {
    }
}
