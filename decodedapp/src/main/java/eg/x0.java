package eg;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dg.n f12219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qd.a f12220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dg.i f12221d;

    public x0(dg.n nVar, qd.a aVar) {
        rd.m.e(nVar, "storageManager");
        rd.m.e(aVar, "computation");
        this.f12219b = nVar;
        this.f12220c = aVar;
        this.f12221d = nVar.d(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 V0(fg.g gVar, x0 x0Var) {
        return gVar.a((ig.i) x0Var.f12220c.a());
    }

    @Override // eg.n2
    protected r0 R0() {
        return (r0) this.f12221d.a();
    }

    @Override // eg.n2
    public boolean S0() {
        return this.f12221d.j();
    }

    @Override // eg.r0
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public x0 X0(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        return new x0(this.f12219b, new w0(gVar, this));
    }
}
