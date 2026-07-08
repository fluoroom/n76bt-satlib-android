package ag;

import ee.o;
import he.g1;
import java.util.Iterator;
import java.util.Set;
import jf.j;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: c */
    public static final b f512c = new b(null);

    /* JADX INFO: renamed from: d */
    private static final Set f513d = ed.r0.c(mf.b.f21989d.c(o.a.f11867d.m()));

    /* JADX INFO: renamed from: a */
    private final n f514a;

    /* JADX INFO: renamed from: b */
    private final qd.l f515b;

    static final class a {

        /* JADX INFO: renamed from: a */
        private final mf.b f516a;

        /* JADX INFO: renamed from: b */
        private final i f517b;

        public a(mf.b bVar, i iVar) {
            rd.m.e(bVar, "classId");
            this.f516a = bVar;
            this.f517b = iVar;
        }

        public final i a() {
            return this.f517b;
        }

        public final mf.b b() {
            return this.f516a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && rd.m.a(this.f516a, ((a) obj).f516a);
        }

        public int hashCode() {
            return this.f516a.hashCode();
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final Set a() {
            return l.f513d;
        }

        private b() {
        }
    }

    public l(n nVar) {
        rd.m.e(nVar, "components");
        this.f514a = nVar;
        this.f515b = nVar.u().h(new k(this));
    }

    public static final he.e c(l lVar, a aVar) {
        rd.m.e(aVar, "key");
        return lVar.d(aVar);
    }

    private final he.e d(a aVar) {
        Object next;
        p pVarA;
        mf.b bVarB = aVar.b();
        Iterator it = this.f514a.l().iterator();
        while (it.hasNext()) {
            he.e eVarA = ((je.b) it.next()).a(bVarB);
            if (eVarA != null) {
                return eVarA;
            }
        }
        if (f513d.contains(bVarB)) {
            return null;
        }
        i iVarA = aVar.a();
        if (iVarA == null && (iVarA = this.f514a.e().a(bVarB)) == null) {
            return null;
        }
        jf.d dVarA = iVarA.a();
        gf.c cVarB = iVarA.b();
        jf.a aVarC = iVarA.c();
        g1 g1VarD = iVarA.d();
        mf.b bVarE = bVarB.e();
        if (bVarE != null) {
            he.e eVarF = f(this, bVarE, null, 2, null);
            cg.m mVar = eVarF instanceof cg.m ? (cg.m) eVarF : null;
            if (mVar == null || !mVar.k1(bVarB.h())) {
                return null;
            }
            pVarA = mVar.d1();
        } else {
            Iterator it2 = he.s0.c(this.f514a.s(), bVarB.f()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                he.n0 n0Var = (he.n0) next;
                if (!(n0Var instanceof r) || ((r) n0Var).K0(bVarB.h())) {
                    break;
                }
            }
            he.n0 n0Var2 = (he.n0) next;
            if (n0Var2 == null) {
                return null;
            }
            n nVar = this.f514a;
            gf.u uVarX1 = cVarB.x1();
            rd.m.d(uVarX1, "getTypeTable(...)");
            jf.h hVar = new jf.h(uVarX1);
            j.a aVar2 = jf.j.f18710b;
            gf.x xVarZ1 = cVarB.z1();
            rd.m.d(xVarZ1, "getVersionRequirementTable(...)");
            pVarA = nVar.a(n0Var2, dVarA, hVar, aVar2.a(xVarZ1), aVarC, null);
            aVarC = aVarC;
        }
        return new cg.m(pVarA, cVarB, dVarA, aVarC, g1VarD);
    }

    public static /* synthetic */ he.e f(l lVar, mf.b bVar, i iVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = null;
        }
        return lVar.e(bVar, iVar);
    }

    public final he.e e(mf.b bVar, i iVar) {
        rd.m.e(bVar, "classId");
        return (he.e) this.f515b.l(new a(bVar, iVar));
    }
}
