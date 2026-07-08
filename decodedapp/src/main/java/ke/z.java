package ke;

import eg.d2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z implements he.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19832a = new a(null);

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final xf.k a(he.e eVar, d2 d2Var, fg.g gVar) {
            xf.k kVarK;
            rd.m.e(eVar, "<this>");
            rd.m.e(d2Var, "typeSubstitution");
            rd.m.e(gVar, "kotlinTypeRefiner");
            z zVar = eVar instanceof z ? (z) eVar : null;
            if (zVar != null && (kVarK = zVar.K(d2Var, gVar)) != null) {
                return kVarK;
            }
            xf.k kVarO = eVar.O(d2Var);
            rd.m.d(kVarO, "getMemberScope(...)");
            return kVarO;
        }

        public final xf.k b(he.e eVar, fg.g gVar) {
            xf.k kVarF0;
            rd.m.e(eVar, "<this>");
            rd.m.e(gVar, "kotlinTypeRefiner");
            z zVar = eVar instanceof z ? (z) eVar : null;
            if (zVar != null && (kVarF0 = zVar.f0(gVar)) != null) {
                return kVarF0;
            }
            xf.k kVarE0 = eVar.E0();
            rd.m.d(kVarE0, "getUnsubstitutedMemberScope(...)");
            return kVarE0;
        }

        private a() {
        }
    }

    protected abstract xf.k K(d2 d2Var, fg.g gVar);

    protected abstract xf.k f0(fg.g gVar);
}
