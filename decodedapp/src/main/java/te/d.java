package te;

import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27788b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        super(null);
        m.e(str, "name");
        m.e(str2, "descriptor");
        this.f27787a = str;
        this.f27788b = str2;
    }

    public String a() {
        return this.f27788b;
    }

    public String b() {
        return this.f27787a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m.a(this.f27787a, dVar.f27787a) && m.a(this.f27788b, dVar.f27788b);
    }

    public int hashCode() {
        return (this.f27787a.hashCode() * 31) + this.f27788b.hashCode();
    }

    public String toString() {
        return b() + a();
    }
}
