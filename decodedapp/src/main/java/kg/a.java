package kg;

import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f19924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f19925b;

    public a(Object obj, Object obj2) {
        this.f19924a = obj;
        this.f19925b = obj2;
    }

    public final Object a() {
        return this.f19924a;
    }

    public final Object b() {
        return this.f19925b;
    }

    public final Object c() {
        return this.f19924a;
    }

    public final Object d() {
        return this.f19925b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f19924a, aVar.f19924a) && m.a(this.f19925b, aVar.f19925b);
    }

    public int hashCode() {
        Object obj = this.f19924a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f19925b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f19924a + ", upper=" + this.f19925b + ')';
    }
}
