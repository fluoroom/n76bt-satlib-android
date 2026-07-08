package dd;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f10914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10915b;

    public q(Object obj, Object obj2) {
        this.f10914a = obj;
        this.f10915b = obj2;
    }

    public final Object a() {
        return this.f10914a;
    }

    public final Object b() {
        return this.f10915b;
    }

    public final Object c() {
        return this.f10914a;
    }

    public final Object d() {
        return this.f10915b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return rd.m.a(this.f10914a, qVar.f10914a) && rd.m.a(this.f10915b, qVar.f10915b);
    }

    public int hashCode() {
        Object obj = this.f10914a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f10915b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f10914a + ", " + this.f10915b + ')';
    }
}
