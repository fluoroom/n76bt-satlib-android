package he;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface h0 extends m {

    public static final class a {
        public static Object a(h0 h0Var, o oVar, Object obj) {
            rd.m.e(oVar, "visitor");
            return oVar.m(h0Var, obj);
        }

        public static m b(h0 h0Var) {
            return null;
        }
    }

    Object A0(g0 g0Var);

    ee.i o();

    Collection q(mf.c cVar, qd.l lVar);

    List s0();

    u0 y(mf.c cVar);

    boolean z(h0 h0Var);
}
