package kc;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
abstract class d extends AtomicReference implements b {
    d(Object obj) {
        super(oc.b.c(obj, "value is null"));
    }

    protected abstract void a(Object obj);

    @Override // kc.b
    public final boolean d() {
        return get() == null;
    }

    @Override // kc.b
    public final void dispose() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }
}
