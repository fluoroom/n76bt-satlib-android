package xf;

import he.f1;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l implements k {
    @Override // xf.k
    public Collection a(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return ed.q.k();
    }

    @Override // xf.k
    public Set b() {
        Collection collectionE = e(d.f32057v, og.i.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof f1) {
                mf.f name = ((f1) obj).getName();
                rd.m.d(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // xf.k
    public Collection c(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return ed.q.k();
    }

    @Override // xf.k
    public Set d() {
        Collection collectionE = e(d.f32058w, og.i.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof f1) {
                mf.f name = ((f1) obj).getName();
                rd.m.d(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // xf.n
    public Collection e(d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        return ed.q.k();
    }

    @Override // xf.k
    public Set f() {
        return null;
    }

    @Override // xf.n
    public he.h g(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return null;
    }
}
