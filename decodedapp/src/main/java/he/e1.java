package he;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f15267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qd.l f15268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fg.g f15269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dg.i f15270d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f15266f = {rd.c0.f(new rd.w(e1.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15265e = new a(null);

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final e1 a(e eVar, dg.n nVar, fg.g gVar, qd.l lVar) {
            rd.m.e(eVar, "classDescriptor");
            rd.m.e(nVar, "storageManager");
            rd.m.e(gVar, "kotlinTypeRefinerForOwnerModule");
            rd.m.e(lVar, "scopeFactory");
            return new e1(eVar, nVar, lVar, gVar, null);
        }

        private a() {
        }
    }

    public /* synthetic */ e1(e eVar, dg.n nVar, qd.l lVar, fg.g gVar, rd.h hVar) {
        this(eVar, nVar, lVar, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xf.k d(e1 e1Var, fg.g gVar) {
        return (xf.k) e1Var.f15268b.l(gVar);
    }

    private final xf.k e() {
        return (xf.k) dg.m.a(this.f15270d, this, f15266f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xf.k f(e1 e1Var) {
        return (xf.k) e1Var.f15268b.l(e1Var.f15269c);
    }

    public final xf.k c(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        if (!gVar.d(uf.e.s(this.f15267a))) {
            return e();
        }
        eg.u1 u1VarK = this.f15267a.k();
        rd.m.d(u1VarK, "getTypeConstructor(...)");
        return !gVar.e(u1VarK) ? e() : gVar.c(this.f15267a, new d1(this, gVar));
    }

    private e1(e eVar, dg.n nVar, qd.l lVar, fg.g gVar) {
        this.f15267a = eVar;
        this.f15268b = lVar;
        this.f15269c = gVar;
        this.f15270d = nVar.d(new c1(this));
    }
}
