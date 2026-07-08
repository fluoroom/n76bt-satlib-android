package jh;

import eh.j0;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f18853a = new LinkedHashSet();

    public final synchronized void a(j0 j0Var) {
        rd.m.e(j0Var, "route");
        this.f18853a.remove(j0Var);
    }

    public final synchronized void b(j0 j0Var) {
        rd.m.e(j0Var, "failedRoute");
        this.f18853a.add(j0Var);
    }

    public final synchronized boolean c(j0 j0Var) {
        rd.m.e(j0Var, "route");
        return this.f18853a.contains(j0Var);
    }
}
