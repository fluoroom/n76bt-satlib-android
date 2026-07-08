package b7;

import d6.e0;

/* JADX INFO: loaded from: classes.dex */
public class d extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f3697c = new d();

    protected d() {
        super(null, null);
    }

    public static d n() {
        return f3697c;
    }

    @Override // a7.h
    public e0.a c() {
        return e0.a.EXISTING_PROPERTY;
    }

    @Override // b7.u, a7.h
    public n6.c g(e6.g gVar, n6.c cVar) {
        if (!cVar.f22551f.i()) {
            return null;
        }
        if (!gVar.q()) {
            return gVar.h1(cVar);
        }
        cVar.f22552g = false;
        e6.m mVar = cVar.f22551f;
        if (mVar == e6.m.START_OBJECT) {
            gVar.a1(cVar.f22546a);
            return cVar;
        }
        if (mVar == e6.m.START_ARRAY) {
            gVar.X0(cVar.f22546a);
        }
        return cVar;
    }

    @Override // b7.u, a7.h
    public n6.c h(e6.g gVar, n6.c cVar) {
        if (cVar == null) {
            return null;
        }
        return gVar.i1(cVar);
    }

    @Override // a7.h
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public d a(p6.d dVar) {
        return this;
    }
}
