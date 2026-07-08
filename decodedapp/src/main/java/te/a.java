package te;

import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27786b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2) {
        super(null);
        m.e(str, "name");
        m.e(str2, "descriptor");
        this.f27785a = str;
        this.f27786b = str2;
    }

    public String a() {
        return this.f27786b;
    }

    public String b() {
        return this.f27785a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f27785a, aVar.f27785a) && m.a(this.f27786b, aVar.f27786b);
    }

    public int hashCode() {
        return (this.f27785a.hashCode() * 31) + this.f27786b.hashCode();
    }

    public String toString() {
        return b() + ':' + a();
    }
}
