package he;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f15339b;

    protected w1(String str, boolean z10) {
        rd.m.e(str, "name");
        this.f15338a = str;
        this.f15339b = z10;
    }

    public Integer a(w1 w1Var) {
        rd.m.e(w1Var, "visibility");
        return v1.f15323a.a(this, w1Var);
    }

    public String b() {
        return this.f15338a;
    }

    public final boolean c() {
        return this.f15339b;
    }

    public final String toString() {
        return b();
    }

    public w1 d() {
        return this;
    }
}
