package xg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final void a(int i10) {
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
    }

    public static final tg.a0 b(tg.a0 a0Var, String str) {
        return str != null ? new s(a0Var, str) : a0Var;
    }
}
