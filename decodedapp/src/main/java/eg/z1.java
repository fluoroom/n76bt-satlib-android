package eg;

import eg.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class z1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f12228f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f12229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1 f12230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dg.f f12231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dd.j f12232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dg.g f12233e;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01cf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final eg.r0 a(eg.r0 r17, eg.f2 r18, java.util.Set r19, boolean r20) {
            /*
                Method dump skipped, instruction units count: 500
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: eg.z1.a.a(eg.r0, eg.f2, java.util.Set, boolean):eg.r0");
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final he.l1 f12234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g0 f12235b;

        public b(he.l1 l1Var, g0 g0Var) {
            rd.m.e(l1Var, "typeParameter");
            rd.m.e(g0Var, "typeAttr");
            this.f12234a = l1Var;
            this.f12235b = g0Var;
        }

        public final g0 a() {
            return this.f12235b;
        }

        public final he.l1 b() {
            return this.f12234a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return rd.m.a(bVar.f12234a, this.f12234a) && rd.m.a(bVar.f12235b, this.f12235b);
        }

        public int hashCode() {
            int iHashCode = this.f12234a.hashCode();
            return iHashCode + (iHashCode * 31) + this.f12235b.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f12234a + ", typeAttr=" + this.f12235b + ')';
        }
    }

    public z1(f0 f0Var, w1 w1Var) {
        rd.m.e(f0Var, "projectionComputer");
        rd.m.e(w1Var, "options");
        this.f12229a = f0Var;
        this.f12230b = w1Var;
        dg.f fVar = new dg.f("Type parameter upper bound erasure results");
        this.f12231c = fVar;
        this.f12232d = dd.k.b(new x1(this));
        dg.g gVarF = fVar.f(new y1(this));
        rd.m.d(gVarF, "createMemoizedFunction(...)");
        this.f12233e = gVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i c(z1 z1Var) {
        return gg.l.d(gg.k.E0, z1Var.toString());
    }

    private final r0 d(g0 g0Var) {
        r0 r0VarD;
        c1 c1VarA = g0Var.a();
        return (c1VarA == null || (r0VarD = jg.d.D(c1VarA)) == null) ? h() : r0VarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 f(z1 z1Var, b bVar) {
        return z1Var.g(bVar.b(), bVar.a());
    }

    private final r0 g(he.l1 l1Var, g0 g0Var) {
        a2 a2VarA;
        Set setC = g0Var.c();
        if (setC != null && setC.contains(l1Var.a())) {
            return d(g0Var);
        }
        c1 c1VarS = l1Var.s();
        rd.m.d(c1VarS, "getDefaultType(...)");
        Set<he.l1> setL = jg.d.l(c1VarS, setC);
        LinkedHashMap linkedHashMap = new LinkedHashMap(xd.d.b(ed.k0.e(ed.q.v(setL, 10)), 16));
        for (he.l1 l1Var2 : setL) {
            if (setC == null || !setC.contains(l1Var2)) {
                a2VarA = this.f12229a.a(l1Var2, g0Var, this, e(l1Var2, g0Var.d(l1Var)));
            } else {
                a2VarA = i2.t(l1Var2, g0Var);
                rd.m.d(a2VarA, "makeStarProjection(...)");
            }
            dd.q qVarA = dd.w.a(l1Var2.k(), a2VarA);
            linkedHashMap.put(qVarA.c(), qVarA.d());
        }
        f2 f2VarG = f2.g(v1.a.e(v1.f12211c, linkedHashMap, false, 2, null));
        rd.m.d(f2VarG, "create(...)");
        List upperBounds = l1Var.getUpperBounds();
        rd.m.d(upperBounds, "getUpperBounds(...)");
        Set setI = i(f2VarG, upperBounds, g0Var);
        if (setI.isEmpty()) {
            return d(g0Var);
        }
        if (!this.f12230b.a()) {
            if (setI.size() == 1) {
                return (r0) ed.q.v0(setI);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
        List listH0 = ed.q.H0(setI);
        ArrayList arrayList = new ArrayList(ed.q.v(listH0, 10));
        Iterator it = listH0.iterator();
        while (it.hasNext()) {
            arrayList.add(((r0) it.next()).Q0());
        }
        return fg.d.a(arrayList);
    }

    private final gg.i h() {
        return (gg.i) this.f12232d.getValue();
    }

    private final Set i(f2 f2Var, List list, g0 g0Var) {
        Set setB = ed.r0.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            he.h hVarQ = r0Var.N0().q();
            if (hVarQ instanceof he.e) {
                setB.add(f12228f.a(r0Var, f2Var, g0Var.c(), this.f12230b.b()));
            } else if (hVarQ instanceof he.l1) {
                Set setC = g0Var.c();
                if (setC == null || !setC.contains(hVarQ)) {
                    List upperBounds = ((he.l1) hVarQ).getUpperBounds();
                    rd.m.d(upperBounds, "getUpperBounds(...)");
                    setB.addAll(i(f2Var, upperBounds, g0Var));
                } else {
                    setB.add(d(g0Var));
                }
            }
            if (!this.f12230b.a()) {
                break;
            }
        }
        return ed.r0.a(setB);
    }

    public final r0 e(he.l1 l1Var, g0 g0Var) {
        rd.m.e(l1Var, "typeParameter");
        rd.m.e(g0Var, "typeAttr");
        Object objL = this.f12233e.l(new b(l1Var, g0Var));
        rd.m.d(objL, "invoke(...)");
        return (r0) objL;
    }

    public /* synthetic */ z1(f0 f0Var, w1 w1Var, int i10, rd.h hVar) {
        this(f0Var, (i10 & 2) != 0 ? new w1(false, false) : w1Var);
    }
}
