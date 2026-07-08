package xf;

import eg.d2;
import eg.f2;
import he.i1;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import xf.n;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f32089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dd.j f32090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f2 f32091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f32092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dd.j f32093f;

    public t(k kVar, f2 f2Var) {
        rd.m.e(kVar, "workerScope");
        rd.m.e(f2Var, "givenSubstitutor");
        this.f32089b = kVar;
        this.f32090c = dd.k.b(new r(f2Var));
        d2 d2VarJ = f2Var.j();
        rd.m.d(d2VarJ, "getSubstitution(...)");
        this.f32091d = rf.e.h(d2VarJ, false, 1, null).c();
        this.f32093f = dd.k.b(new s(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection h(t tVar) {
        return tVar.m(n.a.a(tVar.f32089b, null, null, 3, null));
    }

    private final Collection k() {
        return (Collection) this.f32093f.getValue();
    }

    private final he.m l(he.m mVar) {
        if (this.f32091d.k()) {
            return mVar;
        }
        if (this.f32092e == null) {
            this.f32092e = new HashMap();
        }
        Map map = this.f32092e;
        rd.m.b(map);
        Object objC = map.get(mVar);
        if (objC == null) {
            if (!(mVar instanceof i1)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + mVar).toString());
            }
            objC = ((i1) mVar).c(this.f32091d);
            if (objC == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + mVar + " substitution fails");
            }
            map.put(mVar, objC);
        }
        he.m mVar2 = (he.m) objC;
        rd.m.c(mVar2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return mVar2;
    }

    private final Collection m(Collection collection) {
        if (this.f32091d.k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetG = og.a.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetG.add(l((he.m) it.next()));
        }
        return linkedHashSetG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f2 n(f2 f2Var) {
        return f2Var.j().c();
    }

    @Override // xf.k
    public Collection a(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return m(this.f32089b.a(fVar, bVar));
    }

    @Override // xf.k
    public Set b() {
        return this.f32089b.b();
    }

    @Override // xf.k
    public Collection c(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return m(this.f32089b.c(fVar, bVar));
    }

    @Override // xf.k
    public Set d() {
        return this.f32089b.d();
    }

    @Override // xf.n
    public Collection e(d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        return k();
    }

    @Override // xf.k
    public Set f() {
        return this.f32089b.f();
    }

    @Override // xf.n
    public he.h g(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        he.h hVarG = this.f32089b.g(fVar, bVar);
        if (hVarG != null) {
            return (he.h) l(hVarG);
        }
        return null;
    }
}
