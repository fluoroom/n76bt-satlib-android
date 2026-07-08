package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f2606a;

    public c(Object obj) {
        this.f2606a = new AtomicReference(obj);
    }

    public final boolean a(Object obj, Object obj2) {
        return b.a(this.f2606a, obj, obj2);
    }

    public final Object b() {
        return this.f2606a.get();
    }
}
