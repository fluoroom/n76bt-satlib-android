package qe;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e0 f24937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f24938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f24939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f24940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0 f24941e;

    public final e0 a() {
        e0 e0Var = this.f24937a;
        if (e0Var != null) {
            return e0Var;
        }
        rd.m.o("kind");
        return null;
    }

    public final d0 b() {
        d0 d0Var = this.f24938b;
        if (d0Var != null) {
            return d0Var;
        }
        rd.m.o("level");
        return null;
    }

    public final b0 c() {
        b0 b0Var = this.f24941e;
        if (b0Var != null) {
            return b0Var;
        }
        rd.m.o("version");
        return null;
    }

    public final void d(Integer num) {
        this.f24939c = num;
    }

    public final void e(e0 e0Var) {
        rd.m.e(e0Var, "<set-?>");
        this.f24937a = e0Var;
    }

    public final void f(d0 d0Var) {
        rd.m.e(d0Var, "<set-?>");
        this.f24938b = d0Var;
    }

    public final void g(String str) {
        this.f24940d = str;
    }

    public final void h(b0 b0Var) {
        rd.m.e(b0Var, "<set-?>");
        this.f24941e = b0Var;
    }

    public String toString() {
        return "KmVersionRequirement(kind=" + a() + ", level=" + b() + ", version=" + c() + ", errorCode=" + this.f24939c + ", message=" + this.f24940d + ')';
    }
}
