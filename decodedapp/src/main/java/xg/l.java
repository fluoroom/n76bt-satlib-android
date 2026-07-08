package xg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f32128a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f32129b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f32130c = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (androidx.concurrent.futures.b.a(xg.l.f32128a, r3, r2, ((xg.t) r4).f32146a) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final xg.l h() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o()
            java.lang.Object r0 = r0.get(r7)
            xg.l r0 = (xg.l) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = n()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L26
            if (r0 != r2) goto L1a
            goto L25
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o()
            boolean r0 = androidx.concurrent.futures.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L25
            goto L0
        L25:
            return r2
        L26:
            boolean r5 = r7.q()
            if (r5 == 0) goto L2d
            return r1
        L2d:
            boolean r5 = r4 instanceof xg.t
            if (r5 == 0) goto L4f
            if (r3 == 0) goto L44
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = n()
            xg.t r4 = (xg.t) r4
            xg.l r4 = r4.f32146a
            boolean r2 = androidx.concurrent.futures.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L42
            goto L0
        L42:
            r2 = r3
            goto Lc
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = o()
            java.lang.Object r2 = r4.get(r2)
            xg.l r2 = (xg.l) r2
            goto Ld
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            rd.m.c(r4, r3)
            r3 = r4
            xg.l r3 = (xg.l) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.l.h():xg.l");
    }

    private final l i(l lVar) {
        while (lVar.q()) {
            lVar = (l) f32129b.get(lVar);
        }
        return lVar;
    }

    private final void j(l lVar) {
        l lVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32129b;
        do {
            lVar2 = (l) atomicReferenceFieldUpdater.get(lVar);
            if (k() != lVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f32129b, lVar, lVar2, this));
        if (q()) {
            lVar.h();
        }
    }

    private final t t() {
        t tVar = (t) f32130c.get(this);
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this);
        f32130c.set(this, tVar2);
        return tVar2;
    }

    public final boolean b(l lVar, int i10) {
        l lVarM;
        do {
            lVarM = m();
            if (lVarM instanceof j) {
                return (((j) lVarM).f32127d & i10) == 0 && lVarM.b(lVar, i10);
            }
        } while (!lVarM.e(lVar, this));
        return true;
    }

    public final boolean e(l lVar, l lVar2) {
        f32129b.set(lVar, this);
        f32128a.set(lVar, lVar2);
        if (!androidx.concurrent.futures.b.a(f32128a, this, lVar2, lVar)) {
            return false;
        }
        lVar.j(lVar2);
        return true;
    }

    public final boolean f(l lVar) {
        f32129b.set(lVar, this);
        f32128a.set(lVar, this);
        while (k() == this) {
            if (androidx.concurrent.futures.b.a(f32128a, this, this, lVar)) {
                lVar.j(this);
                return true;
            }
        }
        return false;
    }

    public final void g(int i10) {
        b(new j(i10), i10);
    }

    public final Object k() {
        return f32128a.get(this);
    }

    public final l l() {
        l lVar;
        Object objK = k();
        t tVar = objK instanceof t ? (t) objK : null;
        if (tVar != null && (lVar = tVar.f32146a) != null) {
            return lVar;
        }
        rd.m.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (l) objK;
    }

    public final l m() {
        l lVarH = h();
        return lVarH == null ? i((l) f32129b.get(this)) : lVarH;
    }

    public boolean q() {
        return k() instanceof t;
    }

    public boolean r() {
        return s() == null;
    }

    public final l s() {
        Object objK;
        l lVar;
        do {
            objK = k();
            if (objK instanceof t) {
                return ((t) objK).f32146a;
            }
            if (objK == this) {
                return (l) objK;
            }
            rd.m.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            lVar = (l) objK;
        } while (!androidx.concurrent.futures.b.a(f32128a, this, objK, lVar.t()));
        lVar.h();
        return null;
    }

    public String toString() {
        return new rd.u(this) { // from class: xg.l.a
            @Override // yd.k
            public Object get() {
                return tg.h0.a(this.f25940b);
            }
        } + '@' + tg.h0.b(this);
    }
}
