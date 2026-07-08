package ve;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30566d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c0 f30567e = new c0(p0.f30661e, null, null, 6, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f30568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dd.h f30569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p0 f30570c;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final c0 a() {
            return c0.f30567e;
        }

        private a() {
        }
    }

    public c0(p0 p0Var, dd.h hVar, p0 p0Var2) {
        rd.m.e(p0Var, "reportLevelBefore");
        rd.m.e(p0Var2, "reportLevelAfter");
        this.f30568a = p0Var;
        this.f30569b = hVar;
        this.f30570c = p0Var2;
    }

    public final p0 b() {
        return this.f30570c;
    }

    public final p0 c() {
        return this.f30568a;
    }

    public final dd.h d() {
        return this.f30569b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f30568a == c0Var.f30568a && rd.m.a(this.f30569b, c0Var.f30569b) && this.f30570c == c0Var.f30570c;
    }

    public int hashCode() {
        int iHashCode = this.f30568a.hashCode() * 31;
        dd.h hVar = this.f30569b;
        return ((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.f30570c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f30568a + ", sinceVersion=" + this.f30569b + ", reportLevelAfter=" + this.f30570c + ')';
    }

    public /* synthetic */ c0(p0 p0Var, dd.h hVar, p0 p0Var2, int i10, rd.h hVar2) {
        this(p0Var, (i10 & 2) != 0 ? new dd.h(1, 0) : hVar, (i10 & 4) != 0 ? p0Var : p0Var2);
    }
}
