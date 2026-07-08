package cg;

import cg.m;

/* JADX INFO: loaded from: classes3.dex */
class q implements qd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f4838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gf.h f4839b;

    public q(m mVar, gf.h hVar) {
        this.f4838a = mVar;
        this.f4839b = hVar;
    }

    @Override // qd.a
    public Object a() {
        return m.c.g(this.f4838a, this.f4839b);
    }
}
