package rg;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xd.c f26065b;

    public j(String str, xd.c cVar) {
        rd.m.e(str, "value");
        rd.m.e(cVar, "range");
        this.f26064a = str;
        this.f26065b = cVar;
    }

    public final String a() {
        return this.f26064a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return rd.m.a(this.f26064a, jVar.f26064a) && rd.m.a(this.f26065b, jVar.f26065b);
    }

    public int hashCode() {
        return (this.f26064a.hashCode() * 31) + this.f26065b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f26064a + ", range=" + this.f26065b + ')';
    }
}
