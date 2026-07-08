package ag;

import he.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jf.d f499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gf.c f500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jf.a f501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g1 f502d;

    public i(jf.d dVar, gf.c cVar, jf.a aVar, g1 g1Var) {
        rd.m.e(dVar, "nameResolver");
        rd.m.e(cVar, "classProto");
        rd.m.e(aVar, "metadataVersion");
        rd.m.e(g1Var, "sourceElement");
        this.f499a = dVar;
        this.f500b = cVar;
        this.f501c = aVar;
        this.f502d = g1Var;
    }

    public final jf.d a() {
        return this.f499a;
    }

    public final gf.c b() {
        return this.f500b;
    }

    public final jf.a c() {
        return this.f501c;
    }

    public final g1 d() {
        return this.f502d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return rd.m.a(this.f499a, iVar.f499a) && rd.m.a(this.f500b, iVar.f500b) && rd.m.a(this.f501c, iVar.f501c) && rd.m.a(this.f502d, iVar.f502d);
    }

    public int hashCode() {
        return (((((this.f499a.hashCode() * 31) + this.f500b.hashCode()) * 31) + this.f501c.hashCode()) * 31) + this.f502d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f499a + ", classProto=" + this.f500b + ", metadataVersion=" + this.f501c + ", sourceElement=" + this.f502d + ')';
    }
}
