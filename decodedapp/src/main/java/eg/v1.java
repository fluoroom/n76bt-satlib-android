package eg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v1 extends d2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12211c = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: eg.v1$a$a, reason: collision with other inner class name */
        public static final class C0167a extends v1 {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f12212d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f12213e;

            C0167a(Map map, boolean z10) {
                this.f12212d = map;
                this.f12213e = z10;
            }

            @Override // eg.d2
            public boolean a() {
                return this.f12213e;
            }

            @Override // eg.d2
            public boolean f() {
                return this.f12212d.isEmpty();
            }

            @Override // eg.v1
            public a2 k(u1 u1Var) {
                rd.m.e(u1Var, "key");
                return (a2) this.f12212d.get(u1Var);
            }
        }

        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public static /* synthetic */ v1 e(a aVar, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.d(map, z10);
        }

        public final d2 a(r0 r0Var) {
            rd.m.e(r0Var, "kotlinType");
            return b(r0Var.N0(), r0Var.L0());
        }

        public final d2 b(u1 u1Var, List list) {
            rd.m.e(u1Var, "typeConstructor");
            rd.m.e(list, "arguments");
            List parameters = u1Var.getParameters();
            rd.m.d(parameters, "getParameters(...)");
            he.l1 l1Var = (he.l1) ed.q.m0(parameters);
            if (l1Var == null || !l1Var.n0()) {
                return new m0(parameters, list);
            }
            List parameters2 = u1Var.getParameters();
            rd.m.d(parameters2, "getParameters(...)");
            ArrayList arrayList = new ArrayList(ed.q.v(parameters2, 10));
            Iterator it = parameters2.iterator();
            while (it.hasNext()) {
                arrayList.add(((he.l1) it.next()).k());
            }
            return e(this, ed.k0.r(ed.q.Q0(arrayList, list)), false, 2, null);
        }

        public final v1 c(Map map) {
            rd.m.e(map, "map");
            return e(this, map, false, 2, null);
        }

        public final v1 d(Map map, boolean z10) {
            rd.m.e(map, "map");
            return new C0167a(map, z10);
        }

        private a() {
        }
    }

    public static final d2 i(u1 u1Var, List list) {
        return f12211c.b(u1Var, list);
    }

    public static final v1 j(Map map) {
        return f12211c.c(map);
    }

    @Override // eg.d2
    public a2 e(r0 r0Var) {
        rd.m.e(r0Var, "key");
        return k(r0Var.N0());
    }

    public abstract a2 k(u1 u1Var);
}
