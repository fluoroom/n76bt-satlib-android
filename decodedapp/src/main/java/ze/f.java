package ze;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements xf.k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f33143f = {rd.c0.f(new rd.w(f.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ye.k f33144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f33145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g0 f33146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dg.i f33147e;

    public f(ye.k kVar, cf.u uVar, d0 d0Var) {
        rd.m.e(kVar, "c");
        rd.m.e(uVar, "jPackage");
        rd.m.e(d0Var, "packageFragment");
        this.f33144b = kVar;
        this.f33145c = d0Var;
        this.f33146d = new g0(kVar, uVar, d0Var);
        this.f33147e = kVar.e().d(new e(this));
    }

    private final xf.k[] j() {
        return (xf.k[]) dg.m.a(this.f33147e, this, f33143f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xf.k[] k(f fVar) {
        Collection collectionValues = fVar.f33145c.O0().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            xf.k kVarC = fVar.f33144b.a().b().c(fVar.f33145c, (ef.x) it.next());
            if (kVarC != null) {
                arrayList.add(kVarC);
            }
        }
        return (xf.k[]) ng.a.b(arrayList).toArray(new xf.k[0]);
    }

    @Override // xf.k
    public Collection a(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        l(fVar, bVar);
        g0 g0Var = this.f33146d;
        xf.k[] kVarArrJ = j();
        Collection collectionA = g0Var.a(fVar, bVar);
        for (xf.k kVar : kVarArrJ) {
            collectionA = ng.a.a(collectionA, kVar.a(fVar, bVar));
        }
        return collectionA == null ? ed.r0.d() : collectionA;
    }

    @Override // xf.k
    public Set b() {
        xf.k[] kVarArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (xf.k kVar : kVarArrJ) {
            ed.q.A(linkedHashSet, kVar.b());
        }
        linkedHashSet.addAll(this.f33146d.b());
        return linkedHashSet;
    }

    @Override // xf.k
    public Collection c(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        l(fVar, bVar);
        g0 g0Var = this.f33146d;
        xf.k[] kVarArrJ = j();
        Collection collectionC = g0Var.c(fVar, bVar);
        for (xf.k kVar : kVarArrJ) {
            collectionC = ng.a.a(collectionC, kVar.c(fVar, bVar));
        }
        return collectionC == null ? ed.r0.d() : collectionC;
    }

    @Override // xf.k
    public Set d() {
        xf.k[] kVarArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (xf.k kVar : kVarArrJ) {
            ed.q.A(linkedHashSet, kVar.d());
        }
        linkedHashSet.addAll(this.f33146d.d());
        return linkedHashSet;
    }

    @Override // xf.n
    public Collection e(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        g0 g0Var = this.f33146d;
        xf.k[] kVarArrJ = j();
        Collection collectionE = g0Var.e(dVar, lVar);
        for (xf.k kVar : kVarArrJ) {
            collectionE = ng.a.a(collectionE, kVar.e(dVar, lVar));
        }
        return collectionE == null ? ed.r0.d() : collectionE;
    }

    @Override // xf.k
    public Set f() {
        Set setA = xf.m.a(ed.j.w(j()));
        if (setA == null) {
            return null;
        }
        setA.addAll(this.f33146d.f());
        return setA;
    }

    @Override // xf.n
    public he.h g(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        l(fVar, bVar);
        he.e eVarG = this.f33146d.g(fVar, bVar);
        if (eVarG != null) {
            return eVarG;
        }
        he.h hVar = null;
        for (xf.k kVar : j()) {
            he.h hVarG = kVar.g(fVar, bVar);
            if (hVarG != null) {
                if (!(hVarG instanceof he.i) || !((he.d0) hVarG).M()) {
                    return hVarG;
                }
                if (hVar == null) {
                    hVar = hVarG;
                }
            }
        }
        return hVar;
    }

    public final g0 i() {
        return this.f33146d;
    }

    public void l(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        oe.a.b(this.f33144b.a().l(), bVar, this.f33145c, fVar);
    }

    public String toString() {
        return "scope for " + this.f33145c;
    }
}
