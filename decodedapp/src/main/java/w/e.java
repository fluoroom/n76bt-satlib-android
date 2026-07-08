package w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import v.e;
import w.b;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v.f f30898a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v.f f30901d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30899b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30900c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f30902e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f30903f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b.InterfaceC0410b f30904g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b.a f30905h = new b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList f30906i = new ArrayList();

    public e(v.f fVar) {
        this.f30898a = fVar;
        this.f30901d = fVar;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList arrayList, m mVar) {
        int i12;
        f fVar3;
        ArrayList arrayList2;
        p pVar = fVar.f30910d;
        if (pVar.f30961c == null) {
            v.f fVar4 = this.f30898a;
            if (pVar == fVar4.f29344e || pVar == fVar4.f29346f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            m mVar2 = mVar;
            pVar.f30961c = mVar2;
            mVar2.a(pVar);
            for (d dVar : pVar.f30966h.f30917k) {
                if (dVar instanceof f) {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    a((f) dVar, i12, 0, fVar3, arrayList2, mVar2);
                } else {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                }
                i10 = i12;
                fVar2 = fVar3;
                arrayList = arrayList2;
            }
            int i13 = i10;
            f fVar5 = fVar2;
            ArrayList arrayList3 = arrayList;
            for (d dVar2 : pVar.f30967i.f30917k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i13, 1, fVar5, arrayList3, mVar2);
                }
            }
            if (i13 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f30942k.f30917k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i13, 2, fVar5, arrayList3, mVar2);
                    }
                }
            }
            for (f fVar6 : pVar.f30966h.f30918l) {
                if (fVar6 == fVar5) {
                    mVar2.f30936b = true;
                }
                a(fVar6, i13, 0, fVar5, arrayList3, mVar2);
            }
            for (f fVar7 : pVar.f30967i.f30918l) {
                if (fVar7 == fVar5) {
                    mVar2.f30936b = true;
                }
                a(fVar7, i13, 1, fVar5, arrayList3, mVar2);
            }
            if (i13 == 1 && (pVar instanceof n)) {
                Iterator it = ((n) pVar).f30942k.f30918l.iterator();
                while (it.hasNext()) {
                    a((f) it.next(), i13, 2, fVar5, arrayList3, mVar2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(v.f r19) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e.b(v.f):boolean");
    }

    private int e(v.f fVar, int i10) {
        int size = this.f30906i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, ((m) this.f30906i.get(i11)).b(fVar, i10));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i10, ArrayList arrayList) {
        for (d dVar : pVar.f30966h.f30917k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f30967i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f30966h, i10, 0, pVar.f30967i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f30967i.f30917k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f30966h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f30967i, i10, 1, pVar.f30966h, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (d dVar3 : ((n) pVar).f30942k.f30917k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    private void l(v.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f30905h;
        aVar.f30886a = bVar;
        aVar.f30887b = bVar2;
        aVar.f30888c = i10;
        aVar.f30889d = i11;
        this.f30904g.b(eVar, aVar);
        eVar.l1(this.f30905h.f30890e);
        eVar.M0(this.f30905h.f30891f);
        eVar.L0(this.f30905h.f30893h);
        eVar.B0(this.f30905h.f30892g);
    }

    public void c() {
        d(this.f30902e);
        this.f30906i.clear();
        m.f30934h = 0;
        i(this.f30898a.f29344e, 0, this.f30906i);
        i(this.f30898a.f29346f, 1, this.f30906i);
        this.f30899b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f30901d.f29344e.f();
        this.f30901d.f29346f.f();
        arrayList.add(this.f30901d.f29344e);
        arrayList.add(this.f30901d.f29346f);
        HashSet hashSet = null;
        for (v.e eVar : this.f30901d.L0) {
            if (eVar instanceof v.h) {
                arrayList.add(new j(eVar));
            } else {
                if (eVar.i0()) {
                    if (eVar.f29340c == null) {
                        eVar.f29340c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f29340c);
                } else {
                    arrayList.add(eVar.f29344e);
                }
                if (eVar.k0()) {
                    if (eVar.f29342d == null) {
                        eVar.f29342d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f29342d);
                } else {
                    arrayList.add(eVar.f29346f);
                }
                if (eVar instanceof v.j) {
                    arrayList.add(new k(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p pVar = (p) it2.next();
            if (pVar.f30960b != this.f30901d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f30899b || this.f30900c) {
            for (v.e eVar : this.f30898a.L0) {
                eVar.n();
                eVar.f29336a = false;
                eVar.f29344e.r();
                eVar.f29346f.q();
            }
            this.f30898a.n();
            v.f fVar = this.f30898a;
            fVar.f29336a = false;
            fVar.f29344e.r();
            this.f30898a.f29346f.q();
            this.f30900c = false;
        }
        if (b(this.f30901d)) {
            return false;
        }
        this.f30898a.n1(0);
        this.f30898a.o1(0);
        e.b bVarU = this.f30898a.u(0);
        e.b bVarU2 = this.f30898a.u(1);
        if (this.f30899b) {
            c();
        }
        int iX = this.f30898a.X();
        int iY = this.f30898a.Y();
        this.f30898a.f29344e.f30966h.d(iX);
        this.f30898a.f29346f.f30966h.d(iY);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (bVarU == bVar || bVarU2 == bVar) {
            if (z10) {
                Iterator it = this.f30902e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((p) it.next()).m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && bVarU == e.b.WRAP_CONTENT) {
                this.f30898a.Q0(e.b.FIXED);
                v.f fVar2 = this.f30898a;
                fVar2.l1(e(fVar2, 0));
                v.f fVar3 = this.f30898a;
                fVar3.f29344e.f30963e.d(fVar3.W());
            }
            if (z10 && bVarU2 == e.b.WRAP_CONTENT) {
                this.f30898a.h1(e.b.FIXED);
                v.f fVar4 = this.f30898a;
                fVar4.M0(e(fVar4, 1));
                v.f fVar5 = this.f30898a;
                fVar5.f29346f.f30963e.d(fVar5.x());
            }
        }
        v.f fVar6 = this.f30898a;
        e.b bVar2 = fVar6.Z[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int iW = fVar6.W() + iX;
            this.f30898a.f29344e.f30967i.d(iW);
            this.f30898a.f29344e.f30963e.d(iW - iX);
            m();
            v.f fVar7 = this.f30898a;
            e.b bVar4 = fVar7.Z[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int iX2 = fVar7.x() + iY;
                this.f30898a.f29346f.f30967i.d(iX2);
                this.f30898a.f29346f.f30963e.d(iX2 - iY);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        for (p pVar : this.f30902e) {
            if (pVar.f30960b != this.f30898a || pVar.f30965g) {
                pVar.e();
            }
        }
        Iterator it2 = this.f30902e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z12 = true;
                break;
            }
            p pVar2 = (p) it2.next();
            if (z11 || pVar2.f30960b != this.f30898a) {
                if (!pVar2.f30966h.f30916j || ((!pVar2.f30967i.f30916j && !(pVar2 instanceof j)) || (!pVar2.f30963e.f30916j && !(pVar2 instanceof c) && !(pVar2 instanceof j)))) {
                    break;
                }
            }
        }
        this.f30898a.Q0(bVarU);
        this.f30898a.h1(bVarU2);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f30899b) {
            for (v.e eVar : this.f30898a.L0) {
                eVar.n();
                eVar.f29336a = false;
                l lVar = eVar.f29344e;
                lVar.f30963e.f30916j = false;
                lVar.f30965g = false;
                lVar.r();
                n nVar = eVar.f29346f;
                nVar.f30963e.f30916j = false;
                nVar.f30965g = false;
                nVar.q();
            }
            this.f30898a.n();
            v.f fVar = this.f30898a;
            fVar.f29336a = false;
            l lVar2 = fVar.f29344e;
            lVar2.f30963e.f30916j = false;
            lVar2.f30965g = false;
            lVar2.r();
            n nVar2 = this.f30898a.f29346f;
            nVar2.f30963e.f30916j = false;
            nVar2.f30965g = false;
            nVar2.q();
            c();
        }
        if (b(this.f30901d)) {
            return false;
        }
        this.f30898a.n1(0);
        this.f30898a.o1(0);
        this.f30898a.f29344e.f30966h.d(0);
        this.f30898a.f29346f.f30966h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        boolean z12 = false;
        e.b bVarU = this.f30898a.u(0);
        e.b bVarU2 = this.f30898a.u(1);
        int iX = this.f30898a.X();
        int iY = this.f30898a.Y();
        if (z10 && (bVarU == (bVar = e.b.WRAP_CONTENT) || bVarU2 == bVar)) {
            Iterator it = this.f30902e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f30964f == i10 && !pVar.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && bVarU == e.b.WRAP_CONTENT) {
                    this.f30898a.Q0(e.b.FIXED);
                    v.f fVar = this.f30898a;
                    fVar.l1(e(fVar, 0));
                    v.f fVar2 = this.f30898a;
                    fVar2.f29344e.f30963e.d(fVar2.W());
                }
            } else if (z10 && bVarU2 == e.b.WRAP_CONTENT) {
                this.f30898a.h1(e.b.FIXED);
                v.f fVar3 = this.f30898a;
                fVar3.M0(e(fVar3, 1));
                v.f fVar4 = this.f30898a;
                fVar4.f29346f.f30963e.d(fVar4.x());
            }
        }
        if (i10 == 0) {
            v.f fVar5 = this.f30898a;
            e.b bVar2 = fVar5.Z[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int iW = fVar5.W() + iX;
                this.f30898a.f29344e.f30967i.d(iW);
                this.f30898a.f29344e.f30963e.d(iW - iX);
                z11 = true;
            }
            z11 = false;
        } else {
            v.f fVar6 = this.f30898a;
            e.b bVar3 = fVar6.Z[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int iX2 = fVar6.x() + iY;
                this.f30898a.f29346f.f30967i.d(iX2);
                this.f30898a.f29346f.f30963e.d(iX2 - iY);
                z11 = true;
            }
            z11 = false;
        }
        m();
        for (p pVar2 : this.f30902e) {
            if (pVar2.f30964f == i10 && (pVar2.f30960b != this.f30898a || pVar2.f30965g)) {
                pVar2.e();
            }
        }
        Iterator it2 = this.f30902e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z12 = true;
                break;
            }
            p pVar3 = (p) it2.next();
            if (pVar3.f30964f == i10 && (z11 || pVar3.f30960b != this.f30898a)) {
                if (!pVar3.f30966h.f30916j || !pVar3.f30967i.f30916j || (!(pVar3 instanceof c) && !pVar3.f30963e.f30916j)) {
                    break;
                }
            }
        }
        this.f30898a.Q0(bVarU);
        this.f30898a.h1(bVarU2);
        return z12;
    }

    public void j() {
        this.f30899b = true;
    }

    public void k() {
        this.f30900c = true;
    }

    public void m() {
        g gVar;
        for (v.e eVar : this.f30898a.L0) {
            if (!eVar.f29336a) {
                e.b[] bVarArr = eVar.Z;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = eVar.f29380w;
                int i11 = eVar.f29382x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = eVar.f29344e.f30963e;
                boolean z12 = gVar2.f30916j;
                g gVar3 = eVar.f29346f.f30963e;
                boolean z13 = gVar3.f30916j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    l(eVar, bVar4, gVar2.f30913g, bVar4, gVar3.f30913g);
                    eVar.f29336a = true;
                } else if (z12 && z10) {
                    l(eVar, e.b.FIXED, gVar2.f30913g, bVar3, gVar3.f30913g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        eVar.f29346f.f30963e.f30928m = eVar.x();
                    } else {
                        eVar.f29346f.f30963e.d(eVar.x());
                        eVar.f29336a = true;
                    }
                } else if (z13 && z11) {
                    l(eVar, bVar3, gVar2.f30913g, e.b.FIXED, gVar3.f30913g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        eVar.f29344e.f30963e.f30928m = eVar.W();
                    } else {
                        eVar.f29344e.f30963e.d(eVar.W());
                        eVar.f29336a = true;
                    }
                }
                if (eVar.f29336a && (gVar = eVar.f29346f.f30943l) != null) {
                    gVar.d(eVar.p());
                }
            }
        }
    }

    public void n(b.InterfaceC0410b interfaceC0410b) {
        this.f30904g = interfaceC0410b;
    }
}
