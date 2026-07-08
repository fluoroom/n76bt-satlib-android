package ve;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f30582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f30583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f30584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dd.j f30585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f30586e;

    public h0(p0 p0Var, p0 p0Var2, Map map) {
        rd.m.e(p0Var, "globalLevel");
        rd.m.e(map, "userDefinedLevelForSpecificAnnotation");
        this.f30582a = p0Var;
        this.f30583b = p0Var2;
        this.f30584c = map;
        this.f30585d = dd.k.b(new g0(this));
        p0 p0Var3 = p0.f30659c;
        this.f30586e = p0Var == p0Var3 && p0Var2 == p0Var3 && map.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] b(h0 h0Var) {
        List listC = ed.q.c();
        listC.add(h0Var.f30582a.d());
        p0 p0Var = h0Var.f30583b;
        if (p0Var != null) {
            listC.add("under-migration:" + p0Var.d());
        }
        for (Map.Entry entry : h0Var.f30584c.entrySet()) {
            listC.add('@' + entry.getKey() + ':' + ((p0) entry.getValue()).d());
        }
        return (String[]) ed.q.a(listC).toArray(new String[0]);
    }

    public final p0 c() {
        return this.f30582a;
    }

    public final p0 d() {
        return this.f30583b;
    }

    public final Map e() {
        return this.f30584c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f30582a == h0Var.f30582a && this.f30583b == h0Var.f30583b && rd.m.a(this.f30584c, h0Var.f30584c);
    }

    public final boolean f() {
        return this.f30586e;
    }

    public int hashCode() {
        int iHashCode = this.f30582a.hashCode() * 31;
        p0 p0Var = this.f30583b;
        return ((iHashCode + (p0Var == null ? 0 : p0Var.hashCode())) * 31) + this.f30584c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f30582a + ", migrationLevel=" + this.f30583b + ", userDefinedLevelForSpecificAnnotation=" + this.f30584c + ')';
    }

    public /* synthetic */ h0(p0 p0Var, p0 p0Var2, Map map, int i10, rd.h hVar) {
        this(p0Var, (i10 & 2) != 0 ? null : p0Var2, (i10 & 4) != 0 ? ed.k0.i() : map);
    }
}
