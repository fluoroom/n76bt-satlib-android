package ne;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends h implements cf.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Enum f22723c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(mf.f fVar, Enum r32) {
        super(fVar, null);
        rd.m.e(r32, "value");
        this.f22723c = r32;
    }

    @Override // cf.m
    public mf.b a() {
        Class<?> enclosingClass = this.f22723c.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        rd.m.b(enclosingClass);
        return f.e(enclosingClass);
    }

    @Override // cf.m
    public mf.f c() {
        return mf.f.h(this.f22723c.name());
    }
}
