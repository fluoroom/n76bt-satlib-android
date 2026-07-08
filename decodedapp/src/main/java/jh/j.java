package jh;

import jh.u;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements u.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u.a f18774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f18775b;

    public j(Throwable th2) {
        rd.m.e(th2, "e");
        this.f18774a = new u.a(this, null, th2, 2, null);
    }

    @Override // jh.u.b
    public boolean a() {
        return this.f18775b;
    }

    @Override // jh.u.b
    public /* bridge */ /* synthetic */ u.b b() {
        return (u.b) i();
    }

    @Override // jh.u.b
    public /* bridge */ /* synthetic */ n c() {
        return (n) h();
    }

    @Override // jh.u.b
    public u.a d() {
        return this.f18774a;
    }

    @Override // jh.u.b, kh.d.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    public final u.a f() {
        return this.f18774a;
    }

    @Override // jh.u.b
    public u.a g() {
        return this.f18774a;
    }

    public Void h() {
        throw new IllegalStateException("unexpected call");
    }

    public Void i() {
        throw new IllegalStateException("unexpected retry");
    }
}
