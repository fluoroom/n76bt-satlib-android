package ee;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final boolean a(d dVar, he.e eVar) {
        rd.m.e(dVar, "<this>");
        rd.m.e(eVar, "classDescriptor");
        if (!qf.i.x(eVar)) {
            return false;
        }
        Set setB = dVar.b();
        mf.b bVarN = uf.e.n(eVar);
        return ed.q.T(setB, bVarN != null ? bVarN.e() : null);
    }
}
