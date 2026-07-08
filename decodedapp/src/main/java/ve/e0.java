package ve;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30573d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f30574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qd.l f30575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30576c;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p0 c(dd.h hVar, mf.c cVar) {
            rd.m.e(cVar, "it");
            return b0.c(cVar, hVar);
        }

        public final e0 b(dd.h hVar) {
            rd.m.e(hVar, "kotlinVersion");
            return new e0(b0.a(hVar), new d0(hVar));
        }

        private a() {
        }
    }

    public e0(h0 h0Var, qd.l lVar) {
        rd.m.e(h0Var, "jsr305");
        rd.m.e(lVar, "getReportLevelForAnnotation");
        this.f30574a = h0Var;
        this.f30575b = lVar;
        this.f30576c = h0Var.f() || lVar.l(b0.d()) == p0.f30659c;
    }

    public final boolean a() {
        return this.f30576c;
    }

    public final qd.l b() {
        return this.f30575b;
    }

    public final h0 c() {
        return this.f30574a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f30574a + ", getReportLevelForAnnotation=" + this.f30575b + ')';
    }
}
