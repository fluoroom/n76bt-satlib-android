package rf;

import dd.q;
import dg.f;
import dg.n;
import ed.j;
import eg.a2;
import eg.c2;
import eg.d2;
import eg.m0;
import eg.m2;
import eg.r0;
import eg.x0;
import eg.z;
import he.h;
import he.l1;
import java.util.ArrayList;
import java.util.List;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    public static final class a extends z {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f26003d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d2 d2Var, boolean z10) {
            super(d2Var);
            this.f26003d = z10;
        }

        @Override // eg.d2
        public boolean b() {
            return this.f26003d;
        }

        @Override // eg.z, eg.d2
        public a2 e(r0 r0Var) {
            m.e(r0Var, "key");
            a2 a2VarE = super.e(r0Var);
            if (a2VarE == null) {
                return null;
            }
            h hVarQ = r0Var.N0().q();
            return e.c(a2VarE, hVarQ instanceof l1 ? (l1) hVarQ : null);
        }
    }

    public static final a2 c(a2 a2Var, l1 l1Var) {
        if (l1Var == null || a2Var.a() == m2.f12140e) {
            return a2Var;
        }
        if (l1Var.n() != a2Var.a()) {
            return new c2(e(a2Var));
        }
        if (!a2Var.b()) {
            return new c2(a2Var.getType());
        }
        n nVar = f.f11065e;
        m.d(nVar, "NO_LOCKS");
        return new c2(new x0(nVar, new d(a2Var)));
    }

    public static final r0 d(a2 a2Var) {
        r0 type = a2Var.getType();
        m.d(type, "getType(...)");
        return type;
    }

    public static final r0 e(a2 a2Var) {
        m.e(a2Var, "typeProjection");
        return new rf.a(a2Var, null, false, null, 14, null);
    }

    public static final boolean f(r0 r0Var) {
        m.e(r0Var, "<this>");
        return r0Var.N0() instanceof b;
    }

    public static final d2 g(d2 d2Var, boolean z10) {
        m.e(d2Var, "<this>");
        if (!(d2Var instanceof m0)) {
            return new a(d2Var, z10);
        }
        m0 m0Var = (m0) d2Var;
        l1[] l1VarArrJ = m0Var.j();
        List<q> listA0 = j.A0(m0Var.i(), m0Var.j());
        ArrayList arrayList = new ArrayList(ed.q.v(listA0, 10));
        for (q qVar : listA0) {
            arrayList.add(c((a2) qVar.c(), (l1) qVar.d()));
        }
        return new m0(l1VarArrJ, (a2[]) arrayList.toArray(new a2[0]), z10);
    }

    public static /* synthetic */ d2 h(d2 d2Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return g(d2Var, z10);
    }
}
