package se;

import java.util.Collection;
import java.util.Iterator;
import qe.s;
import qe.t;
import qe.v;
import qe.x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final b a(qe.g gVar, f fVar) {
        rd.m.e(gVar, "<this>");
        rd.m.e(fVar, "type");
        return (b) g(gVar.h(), fVar);
    }

    public static final c b(qe.j jVar, f fVar) {
        rd.m.e(jVar, "<this>");
        rd.m.e(fVar, "type");
        return (c) g(jVar.b(), fVar);
    }

    public static final g c(s sVar, f fVar) {
        rd.m.e(sVar, "<this>");
        rd.m.e(fVar, "type");
        return (g) g(sVar.d(), fVar);
    }

    public static final h d(t tVar, f fVar) {
        rd.m.e(tVar, "<this>");
        rd.m.e(fVar, "type");
        return (h) g(tVar.f(), fVar);
    }

    public static final j e(v vVar, f fVar) {
        rd.m.e(vVar, "<this>");
        rd.m.e(fVar, "type");
        return (j) g(vVar.c(), fVar);
    }

    public static final k f(x xVar, f fVar) {
        rd.m.e(xVar, "<this>");
        rd.m.e(fVar, "type");
        return (k) g(xVar.a(), fVar);
    }

    private static final e g(Collection collection, f fVar) {
        Iterator it = collection.iterator();
        e eVar = null;
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            if (rd.m.a(eVar2.getType(), fVar)) {
                if (eVar != null) {
                    throw new IllegalStateException("Multiple extensions handle the same extension type: " + fVar);
                }
                eVar = eVar2;
            }
        }
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("No extensions handle the extension type: " + fVar);
    }
}
