package eg;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends d2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f12065e = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d2 f12066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d2 f12067d;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final d2 a(d2 d2Var, d2 d2Var2) {
            rd.m.e(d2Var, "first");
            rd.m.e(d2Var2, "second");
            return d2Var.f() ? d2Var2 : d2Var2.f() ? d2Var : new d0(d2Var, d2Var2, null);
        }

        private a() {
        }
    }

    public /* synthetic */ d0(d2 d2Var, d2 d2Var2, rd.h hVar) {
        this(d2Var, d2Var2);
    }

    public static final d2 i(d2 d2Var, d2 d2Var2) {
        return f12065e.a(d2Var, d2Var2);
    }

    @Override // eg.d2
    public boolean a() {
        return this.f12066c.a() || this.f12067d.a();
    }

    @Override // eg.d2
    public boolean b() {
        return this.f12066c.b() || this.f12067d.b();
    }

    @Override // eg.d2
    public ie.h d(ie.h hVar) {
        rd.m.e(hVar, "annotations");
        return this.f12067d.d(this.f12066c.d(hVar));
    }

    @Override // eg.d2
    public a2 e(r0 r0Var) {
        rd.m.e(r0Var, "key");
        a2 a2VarE = this.f12066c.e(r0Var);
        return a2VarE == null ? this.f12067d.e(r0Var) : a2VarE;
    }

    @Override // eg.d2
    public boolean f() {
        return false;
    }

    @Override // eg.d2
    public r0 g(r0 r0Var, m2 m2Var) {
        rd.m.e(r0Var, "topLevelType");
        rd.m.e(m2Var, "position");
        return this.f12067d.g(this.f12066c.g(r0Var, m2Var), m2Var);
    }

    private d0(d2 d2Var, d2 d2Var2) {
        this.f12066c = d2Var;
        this.f12067d = d2Var2;
    }
}
