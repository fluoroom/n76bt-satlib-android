package oe;

import he.e;
import he.n0;
import mf.f;
import pe.b;
import pe.c;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final void a(c cVar, b bVar, e eVar, f fVar) {
        m.e(cVar, "<this>");
        m.e(bVar, "from");
        m.e(eVar, "scopeOwner");
        m.e(fVar, "name");
        if (cVar == c.a.f24112a) {
            return;
        }
        bVar.getLocation();
    }

    public static final void b(c cVar, b bVar, n0 n0Var, f fVar) {
        m.e(cVar, "<this>");
        m.e(bVar, "from");
        m.e(n0Var, "scopeOwner");
        m.e(fVar, "name");
        String strA = n0Var.d().a();
        String strD = fVar.d();
        m.d(strD, "asString(...)");
        c(cVar, bVar, strA, strD);
    }

    public static final void c(c cVar, b bVar, String str, String str2) {
        m.e(cVar, "<this>");
        m.e(bVar, "from");
        m.e(str, "packageFqName");
        m.e(str2, "name");
        if (cVar == c.a.f24112a) {
            return;
        }
        bVar.getLocation();
    }
}
