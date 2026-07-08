package xf;

import ed.r0;
import he.d0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import xf.k;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements k {

    /* JADX INFO: renamed from: d */
    public static final a f32032d = new a(null);

    /* JADX INFO: renamed from: b */
    private final String f32033b;

    /* JADX INFO: renamed from: c */
    private final k[] f32034c;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final k a(String str, Iterable iterable) {
            rd.m.e(str, "debugName");
            rd.m.e(iterable, "scopes");
            og.j jVar = new og.j();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                if (kVar != k.b.f32079b) {
                    if (kVar instanceof b) {
                        ed.q.B(jVar, ((b) kVar).f32034c);
                    } else {
                        jVar.add(kVar);
                    }
                }
            }
            return b(str, jVar);
        }

        public final k b(String str, List list) {
            rd.m.e(str, "debugName");
            rd.m.e(list, "scopes");
            int size = list.size();
            return size != 0 ? size != 1 ? new b(str, (k[]) list.toArray(new k[0]), null) : (k) list.get(0) : k.b.f32079b;
        }

        private a() {
        }
    }

    public /* synthetic */ b(String str, k[] kVarArr, rd.h hVar) {
        this(str, kVarArr);
    }

    @Override // xf.k
    public Collection a(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        k[] kVarArr = this.f32034c;
        int length = kVarArr.length;
        if (length == 0) {
            return ed.q.k();
        }
        if (length == 1) {
            return kVarArr[0].a(fVar, bVar);
        }
        Collection collectionA = null;
        for (k kVar : kVarArr) {
            collectionA = ng.a.a(collectionA, kVar.a(fVar, bVar));
        }
        return collectionA == null ? r0.d() : collectionA;
    }

    @Override // xf.k
    public Set b() {
        k[] kVarArr = this.f32034c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar : kVarArr) {
            ed.q.A(linkedHashSet, kVar.b());
        }
        return linkedHashSet;
    }

    @Override // xf.k
    public Collection c(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        k[] kVarArr = this.f32034c;
        int length = kVarArr.length;
        if (length == 0) {
            return ed.q.k();
        }
        if (length == 1) {
            return kVarArr[0].c(fVar, bVar);
        }
        Collection collectionA = null;
        for (k kVar : kVarArr) {
            collectionA = ng.a.a(collectionA, kVar.c(fVar, bVar));
        }
        return collectionA == null ? r0.d() : collectionA;
    }

    @Override // xf.k
    public Set d() {
        k[] kVarArr = this.f32034c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar : kVarArr) {
            ed.q.A(linkedHashSet, kVar.d());
        }
        return linkedHashSet;
    }

    @Override // xf.n
    public Collection e(d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        k[] kVarArr = this.f32034c;
        int length = kVarArr.length;
        if (length == 0) {
            return ed.q.k();
        }
        if (length == 1) {
            return kVarArr[0].e(dVar, lVar);
        }
        Collection collectionA = null;
        for (k kVar : kVarArr) {
            collectionA = ng.a.a(collectionA, kVar.e(dVar, lVar));
        }
        return collectionA == null ? r0.d() : collectionA;
    }

    @Override // xf.k
    public Set f() {
        return m.a(ed.j.w(this.f32034c));
    }

    @Override // xf.n
    public he.h g(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        he.h hVar = null;
        for (k kVar : this.f32034c) {
            he.h hVarG = kVar.g(fVar, bVar);
            if (hVarG != null) {
                if (!(hVarG instanceof he.i) || !((d0) hVarG).M()) {
                    return hVarG;
                }
                if (hVar == null) {
                    hVar = hVarG;
                }
            }
        }
        return hVar;
    }

    public String toString() {
        return this.f32033b;
    }

    private b(String str, k[] kVarArr) {
        this.f32033b = str;
        this.f32034c = kVarArr;
    }
}
