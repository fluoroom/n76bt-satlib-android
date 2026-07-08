package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f17704c = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f17706b;

    public b0() {
        this.f17705a = false;
        this.f17706b = Double.NaN;
    }

    public b0(double d10) {
        this.f17705a = true;
        this.f17706b = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        boolean z10 = b0Var.f17705a;
        boolean z11 = this.f17705a;
        return (z11 && z10) ? Double.compare(this.f17706b, b0Var.f17706b) == 0 : z11 == z10;
    }

    public final int hashCode() {
        if (!this.f17705a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.f17706b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (this.f17705a) {
            return "OptionalDouble[" + this.f17706b + "]";
        }
        return "OptionalDouble.empty";
    }
}
