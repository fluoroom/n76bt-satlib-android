package w1;

import e6.j;
import e6.k;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p6.h;
import p6.n;
import u6.c0;

/* JADX INFO: loaded from: classes.dex */
class e extends c0 {

    class a extends n6.b {
        a() {
        }
    }

    e() {
        super(x1.d.class);
    }

    @Override // p6.l
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public x1.d e(j jVar, h hVar) {
        Map map = (Map) jVar.G().a(jVar, new a());
        if (map != null) {
            return new f(g1(map, "iss"), g1(map, "sub"), h1(jVar.G(), map, "aud"), f1(map, "exp"), f1(map, "nbf"), f1(map, "iat"), g1(map, "jti"), map, jVar.G());
        }
        throw new v1.a("Parsing the Payload's JSON resulted on a Null map");
    }

    Instant f1(Map map, String str) {
        n nVar = (n) map.get(str);
        if (nVar == null || nVar.N()) {
            return null;
        }
        if (nVar.p()) {
            return Instant.ofEpochSecond(nVar.g());
        }
        throw new v1.a(String.format("The claim '%s' contained a non-numeric date value.", str));
    }

    String g1(Map map, String str) {
        n nVar = (n) map.get(str);
        if (nVar == null || nVar.N()) {
            return null;
        }
        return nVar.j(null);
    }

    List h1(e6.n nVar, Map map, String str) {
        n nVar2 = (n) map.get(str);
        if (nVar2 == null || nVar2.N()) {
            return null;
        }
        if (!nVar2.D() && !nVar2.R()) {
            return null;
        }
        if (nVar2.R()) {
            return Collections.singletonList(nVar2.i());
        }
        ArrayList arrayList = new ArrayList(nVar2.size());
        for (int i10 = 0; i10 < nVar2.size(); i10++) {
            try {
                arrayList.add((String) nVar.b(nVar2.A(i10), String.class));
            } catch (k e10) {
                throw new v1.a("Couldn't map the Claim's array contents to String", e10);
            }
        }
        return arrayList;
    }
}
