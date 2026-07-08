package zj;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b1 {
    public static a1 a(c1 c1Var, String str) {
        for (a1 a1Var : c1Var.a()) {
            if (str.equals(a1Var.a())) {
                return a1Var;
            }
        }
        throw new hj.h(str, c1Var.a());
    }
}
