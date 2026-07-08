package he;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public interface j1 {

    public static final class a implements j1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15286a = new a();

        private a() {
        }

        @Override // he.j1
        public Collection a(eg.u1 u1Var, Collection collection, qd.l lVar, qd.l lVar2) {
            rd.m.e(u1Var, "currentTypeConstructor");
            rd.m.e(collection, "superTypes");
            rd.m.e(lVar, "neighbors");
            rd.m.e(lVar2, "reportLoop");
            return collection;
        }
    }

    Collection a(eg.u1 u1Var, Collection collection, qd.l lVar, qd.l lVar2);
}
