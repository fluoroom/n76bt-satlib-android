package be;

import be.c0;

/* JADX INFO: loaded from: classes3.dex */
class n0 implements qd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eg.r0 f3941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0.b f3942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f3943c;

    public n0(eg.r0 r0Var, c0.b bVar, c0 c0Var) {
        this.f3941a = r0Var;
        this.f3942b = bVar;
        this.f3943c = c0Var;
    }

    @Override // qd.a
    public Object a() {
        return c0.b.b0(this.f3941a, this.f3942b, this.f3943c);
    }
}
