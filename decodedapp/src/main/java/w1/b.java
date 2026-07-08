package w1;

import e6.j;
import java.util.Map;
import p6.h;
import p6.n;
import u6.c0;

/* JADX INFO: loaded from: classes.dex */
class b extends c0 {

    class a extends n6.b {
        a() {
        }
    }

    b() {
        super(x1.c.class);
    }

    @Override // p6.l
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public x1.c e(j jVar, h hVar) {
        Map map = (Map) jVar.G().a(jVar, new a());
        if (map != null) {
            return new w1.a(f1(map, "alg"), f1(map, "typ"), f1(map, "cty"), f1(map, "kid"), map, jVar.G());
        }
        throw new v1.a("Parsing the Header's JSON resulted on a Null map");
    }

    String f1(Map map, String str) {
        n nVar = (n) map.get(str);
        if (nVar == null || nVar.N()) {
            return null;
        }
        return nVar.j(null);
    }
}
