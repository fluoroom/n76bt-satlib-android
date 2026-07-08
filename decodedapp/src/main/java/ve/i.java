package ve;

import ve.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends u0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i f30587o = new i();

    private i() {
    }

    private final boolean k(he.b bVar) {
        return ed.q.T(u0.f30675a.e(), ef.c0.d(bVar));
    }

    public static final he.z l(he.z zVar) {
        rd.m.e(zVar, "functionDescriptor");
        i iVar = f30587o;
        mf.f name = zVar.getName();
        rd.m.d(name, "getName(...)");
        if (iVar.n(name)) {
            return (he.z) uf.e.i(zVar, false, g.f30579a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(he.b bVar) {
        rd.m.e(bVar, "it");
        return f30587o.k(bVar);
    }

    public static final u0.b o(he.b bVar) {
        he.b bVarI;
        String strD;
        rd.m.e(bVar, "<this>");
        u0.a aVar = u0.f30675a;
        if (!aVar.d().contains(bVar.getName()) || (bVarI = uf.e.i(bVar, false, h.f30581a, 1, null)) == null || (strD = ef.c0.d(bVarI)) == null) {
            return null;
        }
        return aVar.l(strD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(he.b bVar) {
        rd.m.e(bVar, "it");
        return (bVar instanceof he.z) && f30587o.k(bVar);
    }

    public final boolean n(mf.f fVar) {
        rd.m.e(fVar, "<this>");
        return u0.f30675a.d().contains(fVar);
    }
}
