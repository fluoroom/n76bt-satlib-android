package io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f16353a = Collections.newSetFromMap(new IdentityHashMap());

    public final boolean a(Object... objArr) {
        for (Object obj : objArr) {
            if (this.f16353a.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    protected abstract void b();

    protected abstract void c();

    public final boolean d() {
        return !this.f16353a.isEmpty();
    }

    public final void e(Object obj, boolean z10) {
        int size = this.f16353a.size();
        if (z10) {
            this.f16353a.add(obj);
            if (size == 0) {
                b();
                return;
            }
            return;
        }
        if (this.f16353a.remove(obj) && size == 1) {
            c();
        }
    }
}
