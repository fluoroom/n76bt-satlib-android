package tg;

/* JADX INFO: loaded from: classes3.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f27879a = new y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f27880b = xg.f0.a(new xg.x("ThreadLocalEventLoop"));

    private y1() {
    }

    public final s0 a() {
        ThreadLocal threadLocal = f27880b;
        s0 s0Var = (s0) threadLocal.get();
        if (s0Var != null) {
            return s0Var;
        }
        s0 s0VarA = v0.a();
        threadLocal.set(s0VarA);
        return s0VarA;
    }

    public final void b() {
        f27880b.set(null);
    }

    public final void c(s0 s0Var) {
        f27880b.set(s0Var);
    }
}
