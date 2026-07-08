package ef;

import cg.t0;
import he.h1;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements cg.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f12054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ag.y f12055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t0 f12056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cg.r f12057e;

    public z(x xVar, ag.y yVar, t0 t0Var, cg.r rVar) {
        rd.m.e(xVar, "binaryClass");
        rd.m.e(t0Var, "preReleaseInfo");
        rd.m.e(rVar, "abiStability");
        this.f12054b = xVar;
        this.f12055c = yVar;
        this.f12056d = t0Var;
        this.f12057e = rVar;
    }

    @Override // he.g1
    public h1 a() {
        h1 h1Var = h1.f15282a;
        rd.m.d(h1Var, "NO_SOURCE_FILE");
        return h1Var;
    }

    @Override // cg.s
    public String c() {
        return "Class '" + this.f12054b.h().a().a() + '\'';
    }

    public final x d() {
        return this.f12054b;
    }

    public String toString() {
        return z.class.getSimpleName() + ": " + this.f12054b;
    }
}
