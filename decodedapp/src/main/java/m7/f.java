package m7;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Boolean f21798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f21799b;

    public f() {
        this.f21798a = Boolean.FALSE;
    }

    public final f a(String str) {
        this.f21799b = str;
        return this;
    }

    public f(g gVar) {
        this.f21798a = Boolean.FALSE;
        this.f21798a = Boolean.valueOf(gVar.b());
        this.f21799b = gVar.c();
    }
}
