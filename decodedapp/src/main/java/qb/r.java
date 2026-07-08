package qb;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f24737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u1 f24738b;

    private r(q qVar, u1 u1Var) {
        this.f24737a = (q) r9.l.o(qVar, "state is null");
        this.f24738b = (u1) r9.l.o(u1Var, "status is null");
    }

    public static r a(q qVar) {
        r9.l.e(qVar != q.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new r(qVar, u1.f24769e);
    }

    public static r b(u1 u1Var) {
        r9.l.e(!u1Var.q(), "The error status must not be OK");
        return new r(q.TRANSIENT_FAILURE, u1Var);
    }

    public q c() {
        return this.f24737a;
    }

    public u1 d() {
        return this.f24738b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f24737a.equals(rVar.f24737a) && this.f24738b.equals(rVar.f24738b);
    }

    public int hashCode() {
        return this.f24737a.hashCode() ^ this.f24738b.hashCode();
    }

    public String toString() {
        if (this.f24738b.q()) {
            return this.f24737a.toString();
        }
        return this.f24737a + "(" + this.f24738b + ")";
    }
}
