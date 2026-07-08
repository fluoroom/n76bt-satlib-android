package xf;

import he.k1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f32072b;

    public g(k kVar) {
        rd.m.e(kVar, "workerScope");
        this.f32072b = kVar;
    }

    @Override // xf.l, xf.k
    public Set b() {
        return this.f32072b.b();
    }

    @Override // xf.l, xf.k
    public Set d() {
        return this.f32072b.d();
    }

    @Override // xf.l, xf.k
    public Set f() {
        return this.f32072b.f();
    }

    @Override // xf.l, xf.n
    public he.h g(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        he.h hVarG = this.f32072b.g(fVar, bVar);
        if (hVarG != null) {
            he.e eVar = hVarG instanceof he.e ? (he.e) hVarG : null;
            if (eVar != null) {
                return eVar;
            }
            if (hVarG instanceof k1) {
                return (k1) hVarG;
            }
        }
        return null;
    }

    @Override // xf.l, xf.n
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List e(d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        d dVarN = dVar.n(d.f32038c.c());
        if (dVarN == null) {
            return ed.q.k();
        }
        Collection collectionE = this.f32072b.e(dVarN, lVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionE) {
            if (obj instanceof he.i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f32072b;
    }
}
