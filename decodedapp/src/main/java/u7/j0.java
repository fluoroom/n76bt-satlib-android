package u7;

/* JADX INFO: loaded from: classes.dex */
final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f28450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.c f28451b;

    /* synthetic */ j0(b bVar, s7.c cVar, i0 i0Var) {
        this.f28450a = bVar;
        this.f28451b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof j0)) {
            j0 j0Var = (j0) obj;
            if (v7.o.a(this.f28450a, j0Var.f28450a) && v7.o.a(this.f28451b, j0Var.f28451b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return v7.o.b(this.f28450a, this.f28451b);
    }

    public final String toString() {
        return v7.o.c(this).a("key", this.f28450a).a("feature", this.f28451b).toString();
    }
}
