package fg;

import eg.r0;
import eg.u1;
import he.h0;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends eg.r {

    public static final class a extends g {

        /* JADX INFO: renamed from: a */
        public static final a f13059a = new a();

        private a() {
        }

        @Override // fg.g
        public he.e b(mf.b bVar) {
            rd.m.e(bVar, "classId");
            return null;
        }

        @Override // fg.g
        public xf.k c(he.e eVar, qd.a aVar) {
            rd.m.e(eVar, "classDescriptor");
            rd.m.e(aVar, "compute");
            return (xf.k) aVar.a();
        }

        @Override // fg.g
        public boolean d(h0 h0Var) {
            rd.m.e(h0Var, "moduleDescriptor");
            return false;
        }

        @Override // fg.g
        public boolean e(u1 u1Var) {
            rd.m.e(u1Var, "typeConstructor");
            return false;
        }

        @Override // fg.g
        public Collection g(he.e eVar) {
            rd.m.e(eVar, "classDescriptor");
            Collection collectionE = eVar.k().e();
            rd.m.d(collectionE, "getSupertypes(...)");
            return collectionE;
        }

        @Override // eg.r
        /* JADX INFO: renamed from: h */
        public r0 a(ig.i iVar) {
            rd.m.e(iVar, "type");
            return (r0) iVar;
        }

        @Override // fg.g
        /* JADX INFO: renamed from: i */
        public he.e f(he.m mVar) {
            rd.m.e(mVar, "descriptor");
            return null;
        }
    }

    public abstract he.e b(mf.b bVar);

    public abstract xf.k c(he.e eVar, qd.a aVar);

    public abstract boolean d(h0 h0Var);

    public abstract boolean e(u1 u1Var);

    public abstract he.h f(he.m mVar);

    public abstract Collection g(he.e eVar);

    /* JADX INFO: renamed from: h */
    public abstract r0 a(ig.i iVar);
}
