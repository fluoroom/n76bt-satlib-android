package gj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f14527b;

    public a(String str, g gVar) {
        this.f14526a = str;
        this.f14527b = gVar;
    }

    protected boolean d(e eVar) {
        return e().d(f(), eVar);
    }

    protected g e() {
        return this.f14527b;
    }

    protected String f() {
        return this.f14526a;
    }
}
