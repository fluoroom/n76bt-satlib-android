package gg;

import ed.q;
import eg.r0;
import eg.u1;
import he.h0;
import he.y0;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a */
    public static final l f14501a = new l();

    /* JADX INFO: renamed from: b */
    private static final h0 f14502b = e.f14426a;

    /* JADX INFO: renamed from: c */
    private static final a f14503c;

    /* JADX INFO: renamed from: d */
    private static final r0 f14504d;

    /* JADX INFO: renamed from: e */
    private static final r0 f14505e;

    /* JADX INFO: renamed from: f */
    private static final y0 f14506f;

    /* JADX INFO: renamed from: g */
    private static final Set f14507g;

    static {
        String str = String.format(b.f14414b.d(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        rd.m.d(str, "format(...)");
        mf.f fVarK = mf.f.k(str);
        rd.m.d(fVarK, "special(...)");
        f14503c = new a(fVarK);
        f14504d = d(k.E, new String[0]);
        f14505e = d(k.A0, new String[0]);
        f fVar = new f();
        f14506f = fVar;
        f14507g = ed.r0.c(fVar);
    }

    private l() {
    }

    public static final g a(h hVar, boolean z10, String... strArr) {
        rd.m.e(hVar, "kind");
        rd.m.e(strArr, "formatParams");
        return z10 ? new m(hVar, (String[]) Arrays.copyOf(strArr, strArr.length)) : new g(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final g b(h hVar, String... strArr) {
        rd.m.e(hVar, "kind");
        rd.m.e(strArr, "formatParams");
        return a(hVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final i d(k kVar, String... strArr) {
        rd.m.e(kVar, "kind");
        rd.m.e(strArr, "formatParams");
        return f14501a.g(kVar, q.k(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean m(he.m mVar) {
        if (mVar == null) {
            return false;
        }
        l lVar = f14501a;
        return lVar.n(mVar) || lVar.n(mVar.b()) || mVar == f14502b;
    }

    private final boolean n(he.m mVar) {
        return mVar instanceof a;
    }

    public static final boolean o(r0 r0Var) {
        if (r0Var == null) {
            return false;
        }
        u1 u1VarN0 = r0Var.N0();
        return (u1VarN0 instanceof j) && ((j) u1VarN0).a() == k.H;
    }

    public final i c(k kVar, u1 u1Var, String... strArr) {
        rd.m.e(kVar, "kind");
        rd.m.e(u1Var, "typeConstructor");
        rd.m.e(strArr, "formatParams");
        return f(kVar, q.k(), u1Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final j e(k kVar, String... strArr) {
        rd.m.e(kVar, "kind");
        rd.m.e(strArr, "formatParams");
        return new j(kVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final i f(k kVar, List list, u1 u1Var, String... strArr) {
        rd.m.e(kVar, "kind");
        rd.m.e(list, "arguments");
        rd.m.e(u1Var, "typeConstructor");
        rd.m.e(strArr, "formatParams");
        return new i(u1Var, b(h.f14441h, u1Var.toString()), kVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final i g(k kVar, List list, String... strArr) {
        rd.m.e(kVar, "kind");
        rd.m.e(list, "arguments");
        rd.m.e(strArr, "formatParams");
        return f(kVar, list, e(kVar, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final a h() {
        return f14503c;
    }

    public final h0 i() {
        return f14502b;
    }

    public final Set j() {
        return f14507g;
    }

    public final r0 k() {
        return f14505e;
    }

    public final r0 l() {
        return f14504d;
    }

    public final String p(r0 r0Var) {
        rd.m.e(r0Var, "type");
        jg.d.z(r0Var);
        u1 u1VarN0 = r0Var.N0();
        rd.m.c(u1VarN0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((j) u1VarN0).b(0);
    }
}
