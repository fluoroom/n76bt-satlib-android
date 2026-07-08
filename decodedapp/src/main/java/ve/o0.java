package ve;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 {
    public static final List a(mf.f fVar) {
        rd.m.e(fVar, "name");
        String strD = fVar.d();
        rd.m.d(strD, "asString(...)");
        return i0.c(strD) ? ed.q.o(b(fVar)) : i0.d(strD) ? f(fVar) : j.f30593a.b(fVar);
    }

    public static final mf.f b(mf.f fVar) {
        rd.m.e(fVar, "methodName");
        mf.f fVarE = e(fVar, "get", false, null, 12, null);
        return fVarE == null ? e(fVar, "is", false, null, 8, null) : fVarE;
    }

    public static final mf.f c(mf.f fVar, boolean z10) {
        rd.m.e(fVar, "methodName");
        return e(fVar, "set", false, z10 ? "is" : null, 4, null);
    }

    private static final mf.f d(mf.f fVar, String str, boolean z10, String str2) {
        if (fVar.i()) {
            return null;
        }
        String strF = fVar.f();
        rd.m.d(strF, "getIdentifier(...)");
        if (!rg.q.J(strF, str, false, 2, null) || strF.length() == str.length()) {
            return null;
        }
        char cCharAt = strF.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return mf.f.h(str2 + rg.q.v0(strF, str));
        }
        if (!z10) {
            return fVar;
        }
        String strC = mg.a.c(rg.q.v0(strF, str), true);
        if (mf.f.j(strC)) {
            return mf.f.h(strC);
        }
        return null;
    }

    static /* synthetic */ mf.f e(mf.f fVar, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z10, str2);
    }

    public static final List f(mf.f fVar) {
        rd.m.e(fVar, "methodName");
        return ed.q.p(c(fVar, false), c(fVar, true));
    }
}
