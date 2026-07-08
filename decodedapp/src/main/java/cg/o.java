package cg;

import cg.m;

/* JADX INFO: loaded from: classes3.dex */
class o implements qd.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m.c f4828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f4829b;

    public o(m.c cVar, m mVar) {
        this.f4828a = cVar;
        this.f4829b = mVar;
    }

    @Override // qd.l
    public Object l(Object obj) {
        return m.c.f(this.f4828a, this.f4829b, (mf.f) obj);
    }
}
