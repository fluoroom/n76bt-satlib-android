package he;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mf.f f15244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ig.j f15245b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(mf.f fVar, ig.j jVar) {
        super(null);
        rd.m.e(fVar, "underlyingPropertyName");
        rd.m.e(jVar, "underlyingType");
        this.f15244a = fVar;
        this.f15245b = jVar;
    }

    @Override // he.q1
    public boolean a(mf.f fVar) {
        rd.m.e(fVar, "name");
        return rd.m.a(this.f15244a, fVar);
    }

    public final mf.f c() {
        return this.f15244a;
    }

    public final ig.j d() {
        return this.f15245b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f15244a + ", underlyingType=" + this.f15245b + ')';
    }
}
