package ef;

import cg.t0;
import he.h1;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements cg.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vf.d f12030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vf.d f12031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ag.y f12032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t0 f12033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final cg.r f12034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x f12035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f12036h;

    public r(vf.d dVar, vf.d dVar2, gf.m mVar, jf.d dVar3, ag.y yVar, t0 t0Var, cg.r rVar, x xVar) {
        String string;
        rd.m.e(dVar, "className");
        rd.m.e(mVar, "packageProto");
        rd.m.e(dVar3, "nameResolver");
        rd.m.e(t0Var, "preReleaseInfo");
        rd.m.e(rVar, "abiStability");
        this.f12030b = dVar;
        this.f12031c = dVar2;
        this.f12032d = yVar;
        this.f12033e = t0Var;
        this.f12034f = rVar;
        this.f12035g = xVar;
        i.f fVar = kf.a.f19845m;
        rd.m.d(fVar, "packageModuleName");
        Integer num = (Integer) jf.f.a(mVar, fVar);
        this.f12036h = (num == null || (string = dVar3.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // he.g1
    public h1 a() {
        h1 h1Var = h1.f15282a;
        rd.m.d(h1Var, "NO_SOURCE_FILE");
        return h1Var;
    }

    @Override // cg.s
    public String c() {
        return "Class '" + d().a().a() + '\'';
    }

    public final mf.b d() {
        mf.c cVarG = e().g();
        rd.m.d(cVarG, "getPackageFqName(...)");
        return new mf.b(cVarG, h());
    }

    public vf.d e() {
        return this.f12030b;
    }

    public vf.d f() {
        return this.f12031c;
    }

    public final x g() {
        return this.f12035g;
    }

    public final mf.f h() {
        String strF = e().f();
        rd.m.d(strF, "getInternalName(...)");
        mf.f fVarH = mf.f.h(rg.q.O0(strF, '/', null, 2, null));
        rd.m.d(fVarH, "identifier(...)");
        return fVarH;
    }

    public String toString() {
        return r.class.getSimpleName() + ": " + e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(x xVar, gf.m mVar, jf.d dVar, ag.y yVar, boolean z10, cg.r rVar) {
        vf.d dVarD;
        rd.m.e(xVar, "kotlinClass");
        rd.m.e(mVar, "packageProto");
        rd.m.e(dVar, "nameResolver");
        rd.m.e(rVar, "abiStability");
        vf.d dVarB = vf.d.b(xVar.h());
        rd.m.d(dVarB, "byClassId(...)");
        String strE = xVar.a().e();
        if (strE != null) {
            dVarD = strE.length() > 0 ? vf.d.d(strE) : null;
        } else {
            dVarD = null;
        }
        this(dVarB, dVarD, mVar, dVar, yVar, new t0(z10, null, 2, null), rVar, xVar);
    }
}
