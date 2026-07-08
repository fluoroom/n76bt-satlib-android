package ve;

import ve.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a */
    private static final mf.c f30549a;

    /* JADX INFO: renamed from: b */
    private static final mf.c f30550b;

    /* JADX INFO: renamed from: c */
    private static final mf.c f30551c;

    /* JADX INFO: renamed from: d */
    private static final mf.c f30552d;

    /* JADX INFO: renamed from: e */
    private static final String f30553e;

    /* JADX INFO: renamed from: f */
    private static final mf.c[] f30554f;

    /* JADX INFO: renamed from: g */
    private static final l0 f30555g;

    /* JADX INFO: renamed from: h */
    private static final c0 f30556h;

    static {
        mf.c cVar = new mf.c("org.jspecify.nullness");
        f30549a = cVar;
        mf.c cVar2 = new mf.c("org.jspecify.annotations");
        f30550b = cVar2;
        mf.c cVar3 = new mf.c("io.reactivex.rxjava3.annotations");
        f30551c = cVar3;
        mf.c cVar4 = new mf.c("org.checkerframework.checker.nullness.compatqual");
        f30552d = cVar4;
        String strA = cVar3.a();
        f30553e = strA;
        f30554f = new mf.c[]{new mf.c(strA + ".Nullable"), new mf.c(strA + ".NonNull")};
        mf.c cVar5 = new mf.c("org.jetbrains.annotations");
        c0.a aVar = c0.f30566d;
        dd.q qVarA = dd.w.a(cVar5, aVar.a());
        dd.q qVarA2 = dd.w.a(new mf.c("androidx.annotation"), aVar.a());
        dd.q qVarA3 = dd.w.a(new mf.c("android.support.annotation"), aVar.a());
        dd.q qVarA4 = dd.w.a(new mf.c("android.annotation"), aVar.a());
        dd.q qVarA5 = dd.w.a(new mf.c("com.android.annotations"), aVar.a());
        dd.q qVarA6 = dd.w.a(new mf.c("org.eclipse.jdt.annotation"), aVar.a());
        dd.q qVarA7 = dd.w.a(new mf.c("org.checkerframework.checker.nullness.qual"), aVar.a());
        dd.q qVarA8 = dd.w.a(cVar4, aVar.a());
        dd.q qVarA9 = dd.w.a(new mf.c("javax.annotation"), aVar.a());
        dd.q qVarA10 = dd.w.a(new mf.c("edu.umd.cs.findbugs.annotations"), aVar.a());
        dd.q qVarA11 = dd.w.a(new mf.c("io.reactivex.annotations"), aVar.a());
        mf.c cVar6 = new mf.c("androidx.annotation.RecentlyNullable");
        p0 p0Var = p0.f30660d;
        dd.q qVarA12 = dd.w.a(cVar6, new c0(p0Var, null, null, 4, null));
        dd.q qVarA13 = dd.w.a(new mf.c("androidx.annotation.RecentlyNonNull"), new c0(p0Var, null, null, 4, null));
        dd.q qVarA14 = dd.w.a(new mf.c("lombok"), aVar.a());
        dd.h hVar = new dd.h(2, 1);
        p0 p0Var2 = p0.f30661e;
        f30555g = new n0(ed.k0.l(qVarA, qVarA2, qVarA3, qVarA4, qVarA5, qVarA6, qVarA7, qVarA8, qVarA9, qVarA10, qVarA11, qVarA12, qVarA13, qVarA14, dd.w.a(cVar, new c0(p0Var, hVar, p0Var2)), dd.w.a(cVar2, new c0(p0Var, new dd.h(2, 1), p0Var2)), dd.w.a(cVar3, new c0(p0Var, new dd.h(1, 8), p0Var2)), dd.w.a(new mf.c("jakarta.annotation"), new c0(p0Var, new dd.h(2, 4), p0Var2))));
        f30556h = new c0(p0Var, null, null, 4, null);
    }

    public static final h0 a(dd.h hVar) {
        rd.m.e(hVar, "configuredKotlinVersion");
        c0 c0Var = f30556h;
        p0 p0VarC = (c0Var.d() == null || c0Var.d().compareTo(hVar) > 0) ? c0Var.c() : c0Var.b();
        return new h0(p0VarC, b(p0VarC), null, 4, null);
    }

    public static final p0 b(p0 p0Var) {
        rd.m.e(p0Var, "globalReportLevel");
        if (p0Var == p0.f30660d) {
            return null;
        }
        return p0Var;
    }

    public static final p0 c(mf.c cVar, dd.h hVar) {
        rd.m.e(cVar, "annotationFqName");
        rd.m.e(hVar, "configuredKotlinVersion");
        return f(cVar, l0.f30648a.a(), hVar);
    }

    public static final mf.c d() {
        return f30550b;
    }

    public static final mf.c[] e() {
        return f30554f;
    }

    public static final p0 f(mf.c cVar, l0 l0Var, dd.h hVar) {
        rd.m.e(cVar, "annotation");
        rd.m.e(l0Var, "configuredReportLevels");
        rd.m.e(hVar, "configuredKotlinVersion");
        p0 p0Var = (p0) l0Var.a(cVar);
        if (p0Var != null) {
            return p0Var;
        }
        c0 c0Var = (c0) f30555g.a(cVar);
        return c0Var == null ? p0.f30659c : (c0Var.d() == null || c0Var.d().compareTo(hVar) > 0) ? c0Var.c() : c0Var.b();
    }
}
