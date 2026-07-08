package eg;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f12102a;

    public h1(ee.i iVar) {
        rd.m.e(iVar, "kotlinBuiltIns");
        c1 c1VarJ = iVar.J();
        rd.m.d(c1VarJ, "getNullableAnyType(...)");
        this.f12102a = c1VarJ;
    }

    @Override // eg.a2
    public m2 a() {
        return m2.f12142g;
    }

    @Override // eg.a2
    public boolean b() {
        return true;
    }

    @Override // eg.a2
    public r0 getType() {
        return this.f12102a;
    }

    @Override // eg.a2
    public a2 p(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        return this;
    }
}
