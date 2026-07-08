package qe;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25108c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f25109d = new y(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a0 f25110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f25111b;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public y(a0 a0Var, v vVar) {
        this.f25110a = a0Var;
        this.f25111b = vVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f25110a == yVar.f25110a && rd.m.a(this.f25111b, yVar.f25111b);
    }

    public int hashCode() {
        a0 a0Var = this.f25110a;
        int iHashCode = (a0Var == null ? 0 : a0Var.hashCode()) * 31;
        v vVar = this.f25111b;
        return iHashCode + (vVar != null ? vVar.hashCode() : 0);
    }

    public String toString() {
        return "KmTypeProjection(variance=" + this.f25110a + ", type=" + this.f25111b + ')';
    }
}
