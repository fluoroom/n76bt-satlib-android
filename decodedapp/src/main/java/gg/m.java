package gg;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, String... strArr) {
        super(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        rd.m.e(hVar, "kind");
        rd.m.e(strArr, "formatParams");
    }

    @Override // gg.g, xf.k
    public Set b() {
        throw new IllegalStateException();
    }

    @Override // gg.g, xf.k
    public Set d() {
        throw new IllegalStateException();
    }

    @Override // gg.g, xf.n
    public Collection e(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        throw new IllegalStateException(j());
    }

    @Override // gg.g, xf.k
    public Set f() {
        throw new IllegalStateException();
    }

    @Override // gg.g, xf.n
    public he.h g(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    @Override // gg.g, xf.k
    /* JADX INFO: renamed from: h */
    public Set a(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    @Override // gg.g, xf.k
    /* JADX INFO: renamed from: i */
    public Set c(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    @Override // gg.g
    public String toString() {
        return "ThrowingScope{" + j() + '}';
    }
}
