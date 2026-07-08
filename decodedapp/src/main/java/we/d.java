package we;

import dd.w;
import ed.k0;
import ee.o;
import java.util.Map;
import mf.b;
import ve.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    public static final d f31403a = new d();

    /* JADX INFO: renamed from: b */
    private static final mf.f f31404b;

    /* JADX INFO: renamed from: c */
    private static final mf.f f31405c;

    /* JADX INFO: renamed from: d */
    private static final mf.f f31406d;

    /* JADX INFO: renamed from: e */
    private static final Map f31407e;

    static {
        mf.f fVarH = mf.f.h("message");
        rd.m.d(fVarH, "identifier(...)");
        f31404b = fVarH;
        mf.f fVarH2 = mf.f.h("allowedTargets");
        rd.m.d(fVarH2, "identifier(...)");
        f31405c = fVarH2;
        mf.f fVarH3 = mf.f.h("value");
        rd.m.d(fVarH3, "identifier(...)");
        f31406d = fVarH3;
        f31407e = k0.l(w.a(o.a.H, j0.f30602d), w.a(o.a.L, j0.f30604f), w.a(o.a.P, j0.f30607i));
    }

    private d() {
    }

    public static /* synthetic */ ie.c f(d dVar, cf.a aVar, ye.k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return dVar.e(aVar, kVar, z10);
    }

    public final ie.c a(mf.c cVar, cf.d dVar, ye.k kVar) {
        cf.a aVarA;
        rd.m.e(cVar, "kotlinName");
        rd.m.e(dVar, "annotationOwner");
        rd.m.e(kVar, "c");
        if (rd.m.a(cVar, o.a.f11909y)) {
            mf.c cVar2 = j0.f30606h;
            rd.m.d(cVar2, "DEPRECATED_ANNOTATION");
            cf.a aVarA2 = dVar.a(cVar2);
            if (aVarA2 != null || dVar.m()) {
                return new h(aVarA2, kVar);
            }
        }
        mf.c cVar3 = (mf.c) f31407e.get(cVar);
        if (cVar3 == null || (aVarA = dVar.a(cVar3)) == null) {
            return null;
        }
        return f(f31403a, aVarA, kVar, false, 4, null);
    }

    public final mf.f b() {
        return f31404b;
    }

    public final mf.f c() {
        return f31406d;
    }

    public final mf.f d() {
        return f31405c;
    }

    public final ie.c e(cf.a aVar, ye.k kVar, boolean z10) {
        rd.m.e(aVar, "annotation");
        rd.m.e(kVar, "c");
        mf.b bVarH = aVar.h();
        b.a aVar2 = mf.b.f21989d;
        mf.c cVar = j0.f30602d;
        rd.m.d(cVar, "TARGET_ANNOTATION");
        if (rd.m.a(bVarH, aVar2.c(cVar))) {
            return new n(aVar, kVar);
        }
        mf.c cVar2 = j0.f30604f;
        rd.m.d(cVar2, "RETENTION_ANNOTATION");
        if (rd.m.a(bVarH, aVar2.c(cVar2))) {
            return new l(aVar, kVar);
        }
        mf.c cVar3 = j0.f30607i;
        rd.m.d(cVar3, "DOCUMENTED_ANNOTATION");
        if (rd.m.a(bVarH, aVar2.c(cVar3))) {
            return new c(kVar, aVar, o.a.P);
        }
        mf.c cVar4 = j0.f30606h;
        rd.m.d(cVar4, "DEPRECATED_ANNOTATION");
        if (rd.m.a(bVarH, aVar2.c(cVar4))) {
            return null;
        }
        return new ze.j(kVar, aVar, z10);
    }
}
