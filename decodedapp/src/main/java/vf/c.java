package vf;

import cf.g;
import ed.q;
import he.h;
import rd.m;
import xf.k;
import ye.j;
import ze.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f30723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final we.j f30724b;

    public c(j jVar, we.j jVar2) {
        m.e(jVar, "packageFragmentProvider");
        m.e(jVar2, "javaResolverCache");
        this.f30723a = jVar;
        this.f30724b = jVar2;
    }

    public final j a() {
        return this.f30723a;
    }

    public final he.e b(g gVar) {
        d0 d0Var;
        m.e(gVar, "javaClass");
        mf.c cVarD = gVar.d();
        if (cVarD != null && gVar.I() == cf.d0.f4770a) {
            return this.f30724b.e(cVarD);
        }
        g gVarK = gVar.k();
        if (gVarK == null) {
            if (cVarD == null || (d0Var = (d0) q.b0(this.f30723a.a(cVarD.d()))) == null) {
                return null;
            }
            return d0Var.N0(gVar);
        }
        he.e eVarB = b(gVarK);
        k kVarY0 = eVarB != null ? eVarB.y0() : null;
        h hVarG = kVarY0 != null ? kVarY0.g(gVar.getName(), pe.d.B) : null;
        if (hVarG instanceof he.e) {
            return (he.e) hVarG;
        }
        return null;
    }
}
