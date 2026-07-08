package xf;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements k {
    @Override // xf.k
    public Collection a(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return i().a(fVar, bVar);
    }

    @Override // xf.k
    public Set b() {
        return i().b();
    }

    @Override // xf.k
    public Collection c(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return i().c(fVar, bVar);
    }

    @Override // xf.k
    public Set d() {
        return i().d();
    }

    @Override // xf.n
    public Collection e(d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        return i().e(dVar, lVar);
    }

    @Override // xf.k
    public Set f() {
        return i().f();
    }

    @Override // xf.n
    public he.h g(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return i().g(fVar, bVar);
    }

    public final k h() {
        if (!(i() instanceof a)) {
            return i();
        }
        k kVarI = i();
        rd.m.c(kVarI, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((a) kVarI).h();
    }

    protected abstract k i();
}
