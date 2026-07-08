package eg;

/* JADX INFO: loaded from: classes3.dex */
public interface p1 {

    public static final class a {
        public static /* synthetic */ q1 a(p1 p1Var, ie.h hVar, u1 u1Var, he.m mVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i10 & 2) != 0) {
                u1Var = null;
            }
            if ((i10 & 4) != 0) {
                mVar = null;
            }
            return p1Var.a(hVar, u1Var, mVar);
        }
    }

    q1 a(ie.h hVar, u1 u1Var, he.m mVar);
}
