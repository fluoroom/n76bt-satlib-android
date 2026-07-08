package le;

import he.v1;
import he.w1;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends w1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f20548c = new b();

    private b() {
        super("protected_and_package", true);
    }

    @Override // he.w1
    public Integer a(w1 w1Var) {
        m.e(w1Var, "visibility");
        if (m.a(this, w1Var)) {
            return 0;
        }
        if (w1Var == v1.b.f15327c) {
            return null;
        }
        return v1.f15323a.b(w1Var) ? 1 : -1;
    }

    @Override // he.w1
    public String b() {
        return "protected/*protected and package*/";
    }

    @Override // he.w1
    public w1 d() {
        return v1.g.f15332c;
    }
}
