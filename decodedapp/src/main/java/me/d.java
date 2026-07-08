package me;

import java.util.Set;
import ne.b0;
import rg.q;
import ve.u;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f21964a;

    public d(ClassLoader classLoader) {
        rd.m.e(classLoader, "classLoader");
        this.f21964a = classLoader;
    }

    @Override // ve.u
    public cf.g a(u.a aVar) {
        rd.m.e(aVar, "request");
        mf.b bVarA = aVar.a();
        mf.c cVarF = bVarA.f();
        String strE = q.E(bVarA.g().a(), '.', '$', false, 4, null);
        if (!cVarF.c()) {
            strE = cVarF.a() + '.' + strE;
        }
        Class clsA = e.a(this.f21964a, strE);
        if (clsA != null) {
            return new ne.q(clsA);
        }
        return null;
    }

    @Override // ve.u
    public cf.u b(mf.c cVar, boolean z10) {
        rd.m.e(cVar, "fqName");
        return new b0(cVar);
    }

    @Override // ve.u
    public Set c(mf.c cVar) {
        rd.m.e(cVar, "packageFqName");
        return null;
    }
}
