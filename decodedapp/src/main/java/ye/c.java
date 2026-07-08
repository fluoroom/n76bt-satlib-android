package ye;

import cf.z;
import ve.f0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    private static final k c(k kVar, he.m mVar, z zVar, int i10, dd.j jVar) {
        return new k(kVar.a(), zVar != null ? new m(kVar, mVar, zVar, i10) : kVar.f(), jVar);
    }

    public static final k d(k kVar, p pVar) {
        rd.m.e(kVar, "<this>");
        rd.m.e(pVar, "typeParameterResolver");
        return new k(kVar.a(), pVar, kVar.c());
    }

    public static final k e(k kVar, he.g gVar, z zVar, int i10) {
        rd.m.e(kVar, "<this>");
        rd.m.e(gVar, "containingDeclaration");
        return c(kVar, gVar, zVar, i10, dd.k.a(dd.n.f10911c, new a(kVar, gVar)));
    }

    public static /* synthetic */ k f(k kVar, he.g gVar, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            zVar = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return e(kVar, gVar, zVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 g(k kVar, he.g gVar) {
        return j(kVar, gVar.getAnnotations());
    }

    public static final k h(k kVar, he.m mVar, z zVar, int i10) {
        rd.m.e(kVar, "<this>");
        rd.m.e(mVar, "containingDeclaration");
        rd.m.e(zVar, "typeParameterOwner");
        return c(kVar, mVar, zVar, i10, kVar.c());
    }

    public static /* synthetic */ k i(k kVar, he.m mVar, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return h(kVar, mVar, zVar, i10);
    }

    public static final f0 j(k kVar, ie.h hVar) {
        rd.m.e(kVar, "<this>");
        rd.m.e(hVar, "additionalAnnotations");
        return kVar.a().a().d(kVar.b(), hVar);
    }

    public static final k k(k kVar, ie.h hVar) {
        rd.m.e(kVar, "<this>");
        rd.m.e(hVar, "additionalAnnotations");
        return hVar.isEmpty() ? kVar : new k(kVar.a(), kVar.f(), dd.k.a(dd.n.f10911c, new b(kVar, hVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 l(k kVar, ie.h hVar) {
        return j(kVar, hVar);
    }

    public static final k m(k kVar, d dVar) {
        rd.m.e(kVar, "<this>");
        rd.m.e(dVar, "components");
        return new k(dVar, kVar.f(), kVar.c());
    }
}
