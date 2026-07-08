package df;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ig.i f10951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ve.f0 f10952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ig.q f10953c;

        public a(ig.i iVar, ve.f0 f0Var, ig.q qVar) {
            this.f10951a = iVar;
            this.f10952b = f0Var;
            this.f10953c = qVar;
        }

        public final ve.f0 a() {
            return this.f10952b;
        }

        public final ig.i b() {
            return this.f10951a;
        }

        public final ig.q c() {
            return this.f10953c;
        }
    }

    private final l G(l lVar, l lVar2) {
        return lVar == null ? lVar2 : (lVar2 != null && ((lVar.d() && !lVar2.d()) || ((lVar.d() || !lVar2.d()) && (lVar.c().compareTo(lVar2.c()) < 0 || lVar.c().compareTo(lVar2.c()) <= 0)))) ? lVar2 : lVar;
    }

    private final List H(ig.i iVar) {
        return j(new a(iVar, f(iVar, r()), null), new c(this, A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable I(d dVar, ig.r rVar, a aVar) {
        ig.i iVarB;
        ig.p pVarA;
        List listY;
        ig.i iVarB2;
        rd.m.e(aVar, "it");
        if ((dVar.z() && (iVarB2 = aVar.b()) != null && rVar.K0(iVarB2)) || (iVarB = aVar.b()) == null || (pVarA = rVar.A(iVarB)) == null || (listY = rVar.y(pVarA)) == null) {
            return null;
        }
        List listT0 = rVar.t0(aVar.b());
        Iterator it = listY.iterator();
        Iterator it2 = listT0.iterator();
        ArrayList arrayList = new ArrayList(Math.min(ed.q.v(listY, 10), ed.q.v(listT0, 10)));
        while (it.hasNext() && it2.hasNext()) {
            ig.q qVar = (ig.q) it.next();
            ig.i iVarF0 = rVar.f0((ig.m) it2.next());
            arrayList.add(iVarF0 == null ? new a(null, aVar.a(), qVar) : new a(iVarF0, dVar.f(iVarF0, aVar.a()), qVar));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h e(q1 q1Var, h[] hVarArr, int i10) {
        Map mapB;
        h hVar;
        return (q1Var == null || (mapB = q1Var.b()) == null || (hVar = (h) mapB.get(Integer.valueOf(i10))) == null) ? (i10 < 0 || i10 >= hVarArr.length) ? h.f10980e.a() : hVarArr[i10] : hVar;
    }

    private final ve.f0 f(ig.i iVar, ve.f0 f0Var) {
        return m().d(f0Var, n(iVar));
    }

    private final h g(ig.i iVar) {
        k kVarY;
        k kVarY2 = y(iVar);
        i iVar2 = null;
        if (kVarY2 == null) {
            ig.i iVarV = v(iVar);
            kVarY = iVarV != null ? y(iVarV) : null;
        } else {
            kVarY = kVarY2;
        }
        ig.r rVarA = A();
        ge.c cVar = ge.c.f13796a;
        if (cVar.l(x(rVarA.C(iVar)))) {
            iVar2 = i.f10988a;
        } else if (cVar.k(x(rVarA.N(iVar)))) {
            iVar2 = i.f10989b;
        }
        return new h(kVarY, iVar2, A().c0(iVar) || F(iVar), kVarY != kVarY2);
    }

    private final h h(a aVar) {
        Iterable iterableK;
        l lVarO;
        ig.i iVarB;
        ig.p pVarA;
        if (aVar.b() == null) {
            ig.r rVarA = A();
            ig.q qVarC = aVar.c();
            if ((qVarC != null ? rVarA.k(qVarC) : null) == ig.v.f16119b) {
                return h.f10980e.a();
            }
        }
        boolean z10 = false;
        boolean z11 = aVar.c() == null;
        ig.i iVarB2 = aVar.b();
        if (iVarB2 == null || (iterableK = n(iVarB2)) == null) {
            iterableK = ed.q.k();
        }
        ig.r rVarA2 = A();
        ig.i iVarB3 = aVar.b();
        ig.q qVarW0 = (iVarB3 == null || (pVarA = rVarA2.A(iVarB3)) == null) ? null : rVarA2.w0(pVarA);
        boolean z12 = q() == ve.c.f30561f;
        if (z11) {
            if (z12 || !u() || (iVarB = aVar.b()) == null || !B(iVarB)) {
                iterableK = ed.q.q0(p(), iterableK);
            } else {
                Iterable iterableP = p();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterableP) {
                    if (!m().p(obj)) {
                        arrayList.add(obj);
                    }
                }
                iterableK = ed.q.s0(arrayList, iterableK);
            }
        }
        i iVarG = m().g(iterableK);
        l lVarH = m().h(iterableK, new df.a(this, aVar));
        if (lVarH != null) {
            k kVarC = lVarH.c();
            if (lVarH.c() == k.f10999c && qVarW0 != null) {
                z10 = true;
            }
            return new h(kVarC, iVarG, z10, lVarH.d());
        }
        ve.c cVarQ = (z11 || z12) ? q() : ve.c.f30560e;
        ve.f0 f0VarA = aVar.a();
        ve.w wVarA = f0VarA != null ? f0VarA.a(cVarQ) : null;
        l lVarO2 = qVarW0 != null ? o(qVarW0) : null;
        l lVarT = t(lVarO2, wVarA);
        boolean z13 = (lVarO2 != null ? lVarO2.c() : null) == k.f10999c || !(qVarW0 == null || wVarA == null || !wVarA.c());
        ig.q qVarC2 = aVar.c();
        if (qVarC2 == null || (lVarO = o(qVarC2)) == null) {
            lVarO = null;
        } else if (lVarO.c() == k.f10998b) {
            lVarO = l.b(lVarO, k.f10997a, false, 2, null);
        }
        l lVarG = G(lVarO, lVarT);
        k kVarC2 = lVarG != null ? lVarG.c() : null;
        if (lVarG != null && lVarG.d()) {
            z10 = true;
        }
        return new h(kVarC2, iVarG, z13, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(d dVar, a aVar, Object obj) {
        rd.m.e(obj, "$this$extractNullability");
        return dVar.l(obj, aVar.b());
    }

    private final List j(Object obj, qd.l lVar) {
        ArrayList arrayList = new ArrayList(1);
        k(obj, arrayList, lVar);
        return arrayList;
    }

    private final void k(Object obj, List list, qd.l lVar) {
        list.add(obj);
        Iterable iterable = (Iterable) lVar.l(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                k(it.next(), list, lVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final df.l o(ig.q r5) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.d.o(ig.q):df.l");
    }

    private final k y(ig.i iVar) {
        ig.r rVarA = A();
        if (rVarA.T(rVarA.C(iVar))) {
            return k.f10998b;
        }
        if (rVarA.T(rVarA.N(iVar))) {
            return null;
        }
        return k.f10999c;
    }

    public abstract ig.r A();

    public abstract boolean B(ig.i iVar);

    public abstract boolean C();

    public abstract boolean D(ig.i iVar, ig.i iVar2);

    public abstract boolean E(ig.q qVar);

    public abstract boolean F(ig.i iVar);

    public final qd.l d(ig.i iVar, Iterable iterable, q1 q1Var, boolean z10) {
        int size;
        ig.i iVarB;
        rd.m.e(iVar, "<this>");
        rd.m.e(iterable, "overrides");
        List listH = H(iVar);
        ArrayList arrayList = new ArrayList(ed.q.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(H((ig.i) it.next()));
        }
        if (w()) {
            size = 1;
            break;
        }
        if (C() && (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty())) {
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                if (!D(iVar, (ig.i) it2.next())) {
                    size = 1;
                    break;
                }
            }
        }
        size = listH.size();
        h[] hVarArr = new h[size];
        int i10 = 0;
        while (i10 < size) {
            h hVarH = h((a) listH.get(i10));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a aVar = (a) ed.q.c0((List) it3.next(), i10);
                h hVarG = (aVar == null || (iVarB = aVar.b()) == null) ? null : g(iVarB);
                if (hVarG != null) {
                    arrayList2.add(hVarG);
                }
            }
            hVarArr[i10] = s1.a(hVarH, arrayList2, i10 == 0 && C(), i10 == 0 && s(), z10);
            i10++;
        }
        return new b(q1Var, hVarArr);
    }

    public abstract boolean l(Object obj, ig.i iVar);

    public abstract ve.b m();

    public abstract Iterable n(ig.i iVar);

    public abstract Iterable p();

    public abstract ve.c q();

    public abstract ve.f0 r();

    public abstract boolean s();

    protected abstract l t(l lVar, ve.w wVar);

    public abstract boolean u();

    public abstract ig.i v(ig.i iVar);

    public boolean w() {
        return false;
    }

    public abstract mf.d x(ig.i iVar);

    public abstract boolean z();
}
