package om.sstvencoder.Modes;

/* JADX INFO: loaded from: classes3.dex */
class c implements yh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f23795a;

    c(Class cls) {
        this.f23795a = cls;
    }

    @Override // yh.b
    public yh.c a() {
        return (yh.c) this.f23795a.getAnnotation(yh.c.class);
    }

    @Override // yh.b
    public String b() {
        return ((a) this.f23795a.getAnnotation(a.class)).name();
    }

    @Override // yh.b
    public String c() {
        return this.f23795a.getName();
    }
}
