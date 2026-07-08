package se;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yd.c f27325a;

    public f(yd.c cVar) {
        rd.m.e(cVar, "klass");
        this.f27325a = cVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && rd.m.a(this.f27325a, ((f) obj).f27325a);
    }

    public int hashCode() {
        return this.f27325a.hashCode();
    }

    public String toString() {
        String name = pd.a.b(this.f27325a).getName();
        rd.m.d(name, "getName(...)");
        return name;
    }
}
