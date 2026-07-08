package ag;

import he.g1;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements j {

    /* JADX INFO: renamed from: a */
    private final jf.d f521a;

    /* JADX INFO: renamed from: b */
    private final jf.a f522b;

    /* JADX INFO: renamed from: c */
    private final qd.l f523c;

    /* JADX INFO: renamed from: d */
    private final Map f524d;

    public m0(gf.n nVar, jf.d dVar, jf.a aVar, qd.l lVar) {
        rd.m.e(nVar, "proto");
        rd.m.e(dVar, "nameResolver");
        rd.m.e(aVar, "metadataVersion");
        rd.m.e(lVar, "classSource");
        this.f521a = dVar;
        this.f522b = aVar;
        this.f523c = lVar;
        List listL = nVar.L();
        rd.m.d(listL, "getClass_List(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(xd.d.b(ed.k0.e(ed.q.v(listL, 10)), 16));
        for (Object obj : listL) {
            linkedHashMap.put(l0.a(this.f521a, ((gf.c) obj).U0()), obj);
        }
        this.f524d = linkedHashMap;
    }

    @Override // ag.j
    public i a(mf.b bVar) {
        rd.m.e(bVar, "classId");
        gf.c cVar = (gf.c) this.f524d.get(bVar);
        if (cVar == null) {
            return null;
        }
        return new i(this.f521a, cVar, this.f522b, (g1) this.f523c.l(bVar));
    }

    public final Collection b() {
        return this.f524d.keySet();
    }
}
