package ef;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements ag.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f12027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f12028b;

    public o(v vVar, n nVar) {
        rd.m.e(vVar, "kotlinClassFinder");
        rd.m.e(nVar, "deserializedDescriptorResolver");
        this.f12027a = vVar;
        this.f12028b = nVar;
    }

    @Override // ag.j
    public ag.i a(mf.b bVar) {
        rd.m.e(bVar, "classId");
        x xVarB = w.b(this.f12027a, bVar, this.f12028b.f().g().g());
        if (xVarB == null) {
            return null;
        }
        rd.m.a(xVarB.h(), bVar);
        return this.f12028b.l(xVarB);
    }
}
