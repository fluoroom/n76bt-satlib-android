package xf;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dg.i f32074b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(qd.a aVar) {
        this(null, aVar, 1, 0 == true ? 1 : 0);
        rd.m.e(aVar, "getScope");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k k(qd.a aVar) {
        k kVar = (k) aVar.a();
        return kVar instanceof a ? ((a) kVar).h() : kVar;
    }

    @Override // xf.a
    protected k i() {
        return (k) this.f32074b.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(dg.n nVar, qd.a aVar, int i10, rd.h hVar) {
        if ((i10 & 1) != 0) {
            nVar = dg.f.f11065e;
            rd.m.d(nVar, "NO_LOCKS");
        }
        this(nVar, aVar);
    }

    public i(dg.n nVar, qd.a aVar) {
        rd.m.e(nVar, "storageManager");
        rd.m.e(aVar, "getScope");
        this.f32074b = nVar.d(new h(aVar));
    }
}
