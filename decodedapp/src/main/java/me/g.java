package me;

import ee.o;
import ef.v;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f21971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bg.d f21972b;

    public g(ClassLoader classLoader) {
        rd.m.e(classLoader, "classLoader");
        this.f21971a = classLoader;
        this.f21972b = new bg.d();
    }

    private final v.a d(String str) {
        f fVarA;
        Class clsA = e.a(this.f21971a, str);
        if (clsA == null || (fVarA = f.f21968c.a(clsA)) == null) {
            return null;
        }
        return new v.a.C0164a(fVarA, null, 2, null);
    }

    @Override // ef.v
    public v.a a(cf.g gVar, jf.c cVar) {
        String strA;
        rd.m.e(gVar, "javaClass");
        rd.m.e(cVar, "metadataVersion");
        mf.c cVarD = gVar.d();
        if (cVarD == null || (strA = cVarD.a()) == null) {
            return null;
        }
        return d(strA);
    }

    @Override // ef.v
    public v.a b(mf.b bVar, jf.c cVar) {
        rd.m.e(bVar, "classId");
        rd.m.e(cVar, "metadataVersion");
        return d(h.b(bVar));
    }

    @Override // ag.a0
    public InputStream c(mf.c cVar) {
        rd.m.e(cVar, "packageFqName");
        if (cVar.h(o.A)) {
            return this.f21972b.a(bg.a.f4041r.r(cVar));
        }
        return null;
    }
}
