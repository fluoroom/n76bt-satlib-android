package ie;

import eg.r0;
import he.g1;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface c {

    public static final class a {
        public static mf.c a(c cVar) {
            he.e eVarL = uf.e.l(cVar);
            if (eVarL != null) {
                if (gg.l.m(eVarL)) {
                    eVarL = null;
                }
                if (eVarL != null) {
                    return uf.e.k(eVarL);
                }
            }
            return null;
        }
    }

    Map a();

    mf.c d();

    g1 getSource();

    r0 getType();
}
