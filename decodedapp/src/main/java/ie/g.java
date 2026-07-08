package ie;

import dd.w;
import ed.k0;
import ee.o;
import eg.c1;
import eg.m2;
import eg.r0;
import he.h0;
import sf.x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a */
    private static final mf.f f16049a;

    /* JADX INFO: renamed from: b */
    private static final mf.f f16050b;

    /* JADX INFO: renamed from: c */
    private static final mf.f f16051c;

    /* JADX INFO: renamed from: d */
    private static final mf.f f16052d;

    /* JADX INFO: renamed from: e */
    private static final mf.f f16053e;

    static {
        mf.f fVarH = mf.f.h("message");
        rd.m.d(fVarH, "identifier(...)");
        f16049a = fVarH;
        mf.f fVarH2 = mf.f.h("replaceWith");
        rd.m.d(fVarH2, "identifier(...)");
        f16050b = fVarH2;
        mf.f fVarH3 = mf.f.h("level");
        rd.m.d(fVarH3, "identifier(...)");
        f16051c = fVarH3;
        mf.f fVarH4 = mf.f.h("expression");
        rd.m.d(fVarH4, "identifier(...)");
        f16052d = fVarH4;
        mf.f fVarH5 = mf.f.h("imports");
        rd.m.d(fVarH5, "identifier(...)");
        f16053e = fVarH5;
    }

    public static final c b(ee.i iVar, String str, String str2, String str3, boolean z10) {
        rd.m.e(iVar, "<this>");
        rd.m.e(str, "message");
        rd.m.e(str2, "replaceWith");
        rd.m.e(str3, "level");
        l lVar = new l(iVar, o.a.B, k0.l(w.a(f16052d, new x(str2)), w.a(f16053e, new sf.b(ed.q.k(), new f(iVar)))), false, 8, null);
        mf.c cVar = o.a.f11909y;
        dd.q qVarA = w.a(f16049a, new x(str));
        dd.q qVarA2 = w.a(f16050b, new sf.a(lVar));
        mf.f fVar = f16051c;
        mf.b bVarC = mf.b.f21989d.c(o.a.A);
        mf.f fVarH = mf.f.h(str3);
        rd.m.d(fVarH, "identifier(...)");
        return new l(iVar, cVar, k0.l(qVarA, qVarA2, w.a(fVar, new sf.k(bVarC, fVarH))), z10);
    }

    public static /* synthetic */ c c(ee.i iVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return b(iVar, str, str2, str3, z10);
    }

    public static final r0 d(ee.i iVar, h0 h0Var) {
        rd.m.e(h0Var, "module");
        c1 c1VarM = h0Var.o().m(m2.f12140e, iVar.X());
        rd.m.d(c1VarM, "getArrayType(...)");
        return c1VarM;
    }
}
