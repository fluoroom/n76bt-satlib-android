package le;

import he.v1;
import he.w1;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends w1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20547c = new a();

    private a() {
        super("package", false);
    }

    @Override // he.w1
    public Integer a(w1 w1Var) {
        m.e(w1Var, "visibility");
        if (this == w1Var) {
            return 0;
        }
        return v1.f15323a.b(w1Var) ? 1 : -1;
    }

    @Override // he.w1
    public String b() {
        return "public/*package*/";
    }

    @Override // he.w1
    public w1 d() {
        return v1.g.f15332c;
    }
}
