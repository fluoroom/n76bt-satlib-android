package wc;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lc.e;

/* JADX INFO: loaded from: classes3.dex */
public enum d implements ck.c {
    CANCELLED;

    public static boolean a(AtomicReference atomicReference) {
        ck.c cVar;
        ck.c cVar2 = (ck.c) atomicReference.get();
        d dVar = CANCELLED;
        if (cVar2 == dVar || (cVar = (ck.c) atomicReference.getAndSet(dVar)) == dVar) {
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar.cancel();
        return true;
    }

    public static void d(AtomicReference atomicReference, AtomicLong atomicLong, long j10) {
        ck.c cVar = (ck.c) atomicReference.get();
        if (cVar != null) {
            cVar.request(j10);
            return;
        }
        if (h(j10)) {
            xc.b.a(atomicLong, j10);
            ck.c cVar2 = (ck.c) atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }

    public static boolean e(AtomicReference atomicReference, AtomicLong atomicLong, ck.c cVar) {
        if (!g(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        cVar.request(andSet);
        return true;
    }

    public static void f() {
        yc.a.n(new e("Subscription already set!"));
    }

    public static boolean g(AtomicReference atomicReference, ck.c cVar) {
        oc.b.c(cVar, "s is null");
        if (androidx.lifecycle.b.a(atomicReference, null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        f();
        return false;
    }

    public static boolean h(long j10) {
        if (j10 > 0) {
            return true;
        }
        yc.a.n(new IllegalArgumentException("n > 0 required but it was " + j10));
        return false;
    }

    public static boolean i(ck.c cVar, ck.c cVar2) {
        if (cVar2 == null) {
            yc.a.n(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        f();
        return false;
    }

    @Override // ck.c
    public void cancel() {
    }

    @Override // ck.c
    public void request(long j10) {
    }
}
