package la;

import o4.c;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f20529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f20530b;

    public b(double d10, double d11) {
        this.f20529a = d10;
        this.f20530b = d11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.c(obj, "null cannot be cast to non-null type com.google.maps.android.geometry.Point");
        b bVar = (b) obj;
        return this.f20529a == bVar.f20529a && this.f20530b == bVar.f20530b;
    }

    public int hashCode() {
        return (c.a(this.f20529a) * 31) + c.a(this.f20530b);
    }

    public String toString() {
        return "Point(x=" + this.f20529a + ", y=" + this.f20530b + ")";
    }
}
