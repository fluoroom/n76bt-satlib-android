package eg;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f12064a = new d();

    private d() {
    }

    private final boolean a(ig.r rVar, ig.j jVar, ig.j jVar2) {
        if (rVar.M(jVar) != rVar.M(jVar2) || rVar.T(jVar) != rVar.T(jVar2) || rVar.I0(jVar) != rVar.I0(jVar2) || !rVar.q(rVar.f(jVar), rVar.f(jVar2))) {
            return false;
        }
        if (rVar.K(jVar, jVar2)) {
            return true;
        }
        int iM = rVar.M(jVar);
        for (int i10 = 0; i10 < iM; i10++) {
            ig.m mVarM = rVar.m(jVar, i10);
            ig.m mVarM2 = rVar.m(jVar2, i10);
            if (rVar.h(mVarM) != rVar.h(mVarM2)) {
                return false;
            }
            if (!rVar.h(mVarM)) {
                if (rVar.m0(mVarM) != rVar.m0(mVarM2)) {
                    return false;
                }
                ig.i iVarF0 = rVar.f0(mVarM);
                rd.m.b(iVarF0);
                ig.i iVarF02 = rVar.f0(mVarM2);
                rd.m.b(iVarF02);
                if (!c(rVar, iVarF0, iVarF02)) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean c(ig.r rVar, ig.i iVar, ig.i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        ig.j jVarE = rVar.e(iVar);
        ig.j jVarE2 = rVar.e(iVar2);
        if (jVarE != null && jVarE2 != null) {
            return a(rVar, jVarE, jVarE2);
        }
        ig.g gVarJ0 = rVar.j0(iVar);
        ig.g gVarJ02 = rVar.j0(iVar2);
        return gVarJ0 != null && gVarJ02 != null && a(rVar, rVar.c(gVarJ0), rVar.c(gVarJ02)) && a(rVar, rVar.g(gVarJ0), rVar.g(gVarJ02));
    }

    public final boolean b(ig.r rVar, ig.i iVar, ig.i iVar2) {
        rd.m.e(rVar, "context");
        rd.m.e(iVar, "a");
        rd.m.e(iVar2, "b");
        return c(rVar, iVar, iVar2);
    }
}
