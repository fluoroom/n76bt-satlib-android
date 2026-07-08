package dd;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f10926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10928c;

    public v(Object obj, Object obj2, Object obj3) {
        this.f10926a = obj;
        this.f10927b = obj2;
        this.f10928c = obj3;
    }

    public final Object a() {
        return this.f10926a;
    }

    public final Object b() {
        return this.f10927b;
    }

    public final Object c() {
        return this.f10928c;
    }

    public final Object d() {
        return this.f10926a;
    }

    public final Object e() {
        return this.f10927b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return rd.m.a(this.f10926a, vVar.f10926a) && rd.m.a(this.f10927b, vVar.f10927b) && rd.m.a(this.f10928c, vVar.f10928c);
    }

    public final Object f() {
        return this.f10928c;
    }

    public int hashCode() {
        Object obj = this.f10926a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f10927b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f10928c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f10926a + ", " + this.f10927b + ", " + this.f10928c + ')';
    }
}
