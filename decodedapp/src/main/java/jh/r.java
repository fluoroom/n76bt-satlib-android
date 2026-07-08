package jh;

import jh.u;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements u.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f18851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f18852b;

    public r(n nVar) {
        rd.m.e(nVar, "connection");
        this.f18851a = nVar;
        this.f18852b = true;
    }

    @Override // jh.u.b
    public boolean a() {
        return this.f18852b;
    }

    @Override // jh.u.b
    public /* bridge */ /* synthetic */ u.b b() {
        return (u.b) j();
    }

    @Override // jh.u.b
    public n c() {
        return this.f18851a;
    }

    @Override // jh.u.b
    public /* bridge */ /* synthetic */ u.a d() {
        return (u.a) f();
    }

    @Override // jh.u.b, kh.d.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    public Void f() {
        throw new IllegalStateException("already connected");
    }

    @Override // jh.u.b
    public /* bridge */ /* synthetic */ u.a g() {
        return (u.a) h();
    }

    public Void h() {
        throw new IllegalStateException("already connected");
    }

    public final n i() {
        return this.f18851a;
    }

    public Void j() {
        throw new IllegalStateException("unexpected retry");
    }
}
