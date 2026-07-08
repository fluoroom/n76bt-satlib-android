package gg;

import ed.q;
import ed.r0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class g implements xf.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f14433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14434c;

    public g(h hVar, String... strArr) {
        rd.m.e(hVar, "kind");
        rd.m.e(strArr, "formatParams");
        this.f14433b = hVar;
        String strD = hVar.d();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(strD, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        rd.m.d(str, "format(...)");
        this.f14434c = str;
    }

    @Override // xf.k
    public Set b() {
        return r0.d();
    }

    @Override // xf.k
    public Set d() {
        return r0.d();
    }

    @Override // xf.n
    public Collection e(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        return q.k();
    }

    @Override // xf.k
    public Set f() {
        return r0.d();
    }

    @Override // xf.n
    public he.h g(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        String str = String.format(b.f14414b.d(), Arrays.copyOf(new Object[]{fVar}, 1));
        rd.m.d(str, "format(...)");
        mf.f fVarK = mf.f.k(str);
        rd.m.d(fVarK, "special(...)");
        return new a(fVarK);
    }

    @Override // xf.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set a(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return r0.c(new c(l.f14501a.h()));
    }

    @Override // xf.k
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set c(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return l.f14501a.j();
    }

    protected final String j() {
        return this.f14434c;
    }

    public String toString() {
        return "ErrorScope{" + this.f14434c + '}';
    }
}
