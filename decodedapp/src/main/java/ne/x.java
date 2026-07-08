package ne;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends h implements cf.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f22725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(mf.f fVar, Object obj) {
        super(fVar, null);
        rd.m.e(obj, "value");
        this.f22725c = obj;
    }

    @Override // cf.o
    public Object getValue() {
        return this.f22725c;
    }
}
