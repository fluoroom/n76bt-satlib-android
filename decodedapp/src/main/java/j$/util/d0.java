package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f17791c = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17793b;

    public d0() {
        this.f17792a = false;
        this.f17793b = 0L;
    }

    public d0(long j10) {
        this.f17792a = true;
        this.f17793b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        boolean z10 = d0Var.f17792a;
        boolean z11 = this.f17792a;
        return (z11 && z10) ? this.f17793b == d0Var.f17793b : z11 == z10;
    }

    public final int hashCode() {
        if (!this.f17792a) {
            return 0;
        }
        long j10 = this.f17793b;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        if (this.f17792a) {
            return "OptionalLong[" + this.f17793b + "]";
        }
        return "OptionalLong.empty";
    }
}
