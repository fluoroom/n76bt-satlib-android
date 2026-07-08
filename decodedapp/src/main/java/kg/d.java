package kg;

import eg.r0;
import fg.e;
import he.l1;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1 f19928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0 f19929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r0 f19930c;

    public d(l1 l1Var, r0 r0Var, r0 r0Var2) {
        m.e(l1Var, "typeParameter");
        m.e(r0Var, "inProjection");
        m.e(r0Var2, "outProjection");
        this.f19928a = l1Var;
        this.f19929b = r0Var;
        this.f19930c = r0Var2;
    }

    public final r0 a() {
        return this.f19929b;
    }

    public final r0 b() {
        return this.f19930c;
    }

    public final l1 c() {
        return this.f19928a;
    }

    public final boolean d() {
        return e.f13057a.a(this.f19929b, this.f19930c);
    }
}
