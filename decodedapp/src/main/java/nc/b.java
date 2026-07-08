package nc;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public enum b implements kc.b {
    DISPOSED;

    public static boolean a(AtomicReference atomicReference) {
        kc.b bVar;
        kc.b bVar2 = (kc.b) atomicReference.get();
        b bVar3 = DISPOSED;
        if (bVar2 == bVar3 || (bVar = (kc.b) atomicReference.getAndSet(bVar3)) == bVar3) {
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar.dispose();
        return true;
    }

    public static boolean e(kc.b bVar) {
        return bVar == DISPOSED;
    }

    public static boolean f(AtomicReference atomicReference, kc.b bVar) {
        kc.b bVar2;
        do {
            bVar2 = (kc.b) atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!androidx.lifecycle.b.a(atomicReference, bVar2, bVar));
        return true;
    }

    public static void g() {
        yc.a.n(new lc.e("Disposable already set!"));
    }

    public static boolean h(AtomicReference atomicReference, kc.b bVar) {
        oc.b.c(bVar, "d is null");
        if (androidx.lifecycle.b.a(atomicReference, null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        g();
        return false;
    }

    public static boolean i(kc.b bVar, kc.b bVar2) {
        if (bVar2 == null) {
            yc.a.n(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        g();
        return false;
    }

    @Override // kc.b
    public boolean d() {
        return true;
    }

    @Override // kc.b
    public void dispose() {
    }
}
