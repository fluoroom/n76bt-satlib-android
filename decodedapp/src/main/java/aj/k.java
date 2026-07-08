package aj;

import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f680b;

    public k(Object obj, Object obj2) {
        this.f679a = obj;
        this.f680b = obj2;
    }

    public Object a() {
        return this.f679a;
    }

    public Object b() {
        return this.f680b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f679a, kVar.f679a) && Objects.equals(this.f680b, kVar.f680b);
    }

    public int hashCode() {
        Object obj = this.f679a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f680b;
        int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
        return ((iHashCode * 37) + iHashCode2) ^ (iHashCode2 >>> 16);
    }

    public String toString() {
        return "[" + a() + ", " + b() + "]";
    }
}
