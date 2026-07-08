package ag;

import gf.b;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f483b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(he.h0 h0Var, he.m0 m0Var, zf.a aVar) {
        super(aVar);
        rd.m.e(h0Var, "module");
        rd.m.e(m0Var, "notFoundClasses");
        rd.m.e(aVar, "protocol");
        this.f483b = new g(h0Var, m0Var);
    }

    @Override // ag.h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ie.c d(gf.b bVar, jf.d dVar) {
        rd.m.e(bVar, "proto");
        rd.m.e(dVar, "nameResolver");
        return this.f483b.a(bVar, dVar);
    }

    @Override // ag.e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public sf.g a(n0 n0Var, gf.o oVar, eg.r0 r0Var) {
        rd.m.e(n0Var, "container");
        rd.m.e(oVar, "proto");
        rd.m.e(r0Var, "expectedType");
        return null;
    }

    @Override // ag.e
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public sf.g k(n0 n0Var, gf.o oVar, eg.r0 r0Var) {
        rd.m.e(n0Var, "container");
        rd.m.e(oVar, "proto");
        rd.m.e(r0Var, "expectedType");
        b.C0197b.c cVar = (b.C0197b.c) jf.f.a(oVar, m().b());
        if (cVar == null) {
            return null;
        }
        return this.f483b.f(r0Var, cVar, n0Var.b());
    }
}
