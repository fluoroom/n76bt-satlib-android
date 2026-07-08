package ed;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f11761b;

    public g0(int i10, Object obj) {
        this.f11760a = i10;
        this.f11761b = obj;
    }

    public final int a() {
        return this.f11760a;
    }

    public final Object b() {
        return this.f11761b;
    }

    public final int c() {
        return this.f11760a;
    }

    public final Object d() {
        return this.f11761b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f11760a == g0Var.f11760a && rd.m.a(this.f11761b, g0Var.f11761b);
    }

    public int hashCode() {
        int i10 = this.f11760a * 31;
        Object obj = this.f11761b;
        return i10 + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f11760a + ", value=" + this.f11761b + ')';
    }
}
