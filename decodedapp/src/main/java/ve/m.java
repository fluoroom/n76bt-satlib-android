package ve;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f30651a = new m();

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(he.b bVar) {
        rd.m.e(bVar, "it");
        return f30651a.d(bVar);
    }

    private final boolean e(he.b bVar) {
        if (ed.q.T(j.f30593a.c(), uf.e.k(bVar)) && bVar.i().isEmpty()) {
            return true;
        }
        if (!ee.i.h0(bVar)) {
            return false;
        }
        Collection<he.b> collectionE = bVar.e();
        rd.m.d(collectionE, "getOverriddenDescriptors(...)");
        if (collectionE.isEmpty()) {
            return false;
        }
        for (he.b bVar2 : collectionE) {
            m mVar = f30651a;
            rd.m.b(bVar2);
            if (mVar.d(bVar2)) {
                return true;
            }
        }
        return false;
    }

    public final String b(he.b bVar) {
        mf.f fVar;
        rd.m.e(bVar, "<this>");
        ee.i.h0(bVar);
        he.b bVarI = uf.e.i(uf.e.w(bVar), false, l.f30647a, 1, null);
        if (bVarI == null || (fVar = (mf.f) j.f30593a.a().get(uf.e.o(bVarI))) == null) {
            return null;
        }
        return fVar.d();
    }

    public final boolean d(he.b bVar) {
        rd.m.e(bVar, "callableMemberDescriptor");
        if (j.f30593a.d().contains(bVar.getName())) {
            return e(bVar);
        }
        return false;
    }
}
