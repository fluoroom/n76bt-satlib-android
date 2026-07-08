package mf;

import rd.m;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0289a f21981f = new C0289a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f21982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c f21983h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f21984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f21985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f21986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f21987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f21988e;

    /* JADX INFO: renamed from: mf.a$a, reason: collision with other inner class name */
    public static final class C0289a {
        public /* synthetic */ C0289a(rd.h hVar) {
            this();
        }

        private C0289a() {
        }
    }

    static {
        f fVar = h.f22023n;
        f21982g = fVar;
        f21983h = c.f21993c.a(fVar);
    }

    private a(c cVar, c cVar2, f fVar, b bVar, c cVar3) {
        this.f21984a = cVar;
        this.f21985b = cVar2;
        this.f21986c = fVar;
        this.f21987d = bVar;
        this.f21988e = cVar3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f21984a, aVar.f21984a) && m.a(this.f21985b, aVar.f21985b) && m.a(this.f21986c, aVar.f21986c);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f21984a.hashCode()) * 31;
        c cVar = this.f21985b;
        return ((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f21986c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(q.E(this.f21984a.a(), '.', '/', false, 4, null));
        sb2.append("/");
        c cVar = this.f21985b;
        if (cVar != null) {
            sb2.append(cVar);
            sb2.append(".");
        }
        sb2.append(this.f21986c);
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(c cVar, f fVar) {
        this(cVar, null, fVar, null, null);
        m.e(cVar, "packageName");
        m.e(fVar, "callableName");
    }
}
