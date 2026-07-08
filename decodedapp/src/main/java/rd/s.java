package rd;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f25957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25958b;

    public s(Class cls, String str) {
        m.e(cls, "jClass");
        m.e(str, "moduleName");
        this.f25957a = cls;
        this.f25958b = str;
    }

    @Override // rd.e
    public Class d() {
        return this.f25957a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && m.a(d(), ((s) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return d().toString() + " (Kotlin reflection is not available)";
    }
}
