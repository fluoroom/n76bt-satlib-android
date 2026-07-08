package ne;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends h implements cf.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f22719c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(mf.f fVar, Class cls) {
        super(fVar, null);
        rd.m.e(cls, "klass");
        this.f22719c = cls;
    }

    @Override // cf.h
    public cf.x b() {
        return e0.f22688a.a(this.f22719c);
    }
}
