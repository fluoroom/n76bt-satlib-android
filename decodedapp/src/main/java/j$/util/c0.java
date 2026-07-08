package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f17710c = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17712b;

    public c0() {
        this.f17711a = false;
        this.f17712b = 0;
    }

    public c0(int i10) {
        this.f17711a = true;
        this.f17712b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        boolean z10 = c0Var.f17711a;
        boolean z11 = this.f17711a;
        return (z11 && z10) ? this.f17712b == c0Var.f17712b : z11 == z10;
    }

    public final int hashCode() {
        if (this.f17711a) {
            return this.f17712b;
        }
        return 0;
    }

    public final String toString() {
        if (this.f17711a) {
            return "OptionalInt[" + this.f17712b + "]";
        }
        return "OptionalInt.empty";
    }
}
