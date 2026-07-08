package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1.g f2678a = new f1.g();

    public final void a(String str, AutoCloseable autoCloseable) {
        rd.m.e(str, "key");
        rd.m.e(autoCloseable, "closeable");
        f1.g gVar = this.f2678a;
        if (gVar != null) {
            gVar.d(str, autoCloseable);
        }
    }

    public final void b() {
        f1.g gVar = this.f2678a;
        if (gVar != null) {
            gVar.e();
        }
        d();
    }

    public final AutoCloseable c(String str) {
        rd.m.e(str, "key");
        f1.g gVar = this.f2678a;
        if (gVar != null) {
            return gVar.g(str);
        }
        return null;
    }

    protected void d() {
    }
}
