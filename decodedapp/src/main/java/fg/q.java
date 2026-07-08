package fg;

import eg.l2;
import eg.r0;
import eg.t1;
import fg.f;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements p {

    /* JADX INFO: renamed from: c */
    private final g f13080c;

    /* JADX INFO: renamed from: d */
    private final f f13081d;

    /* JADX INFO: renamed from: e */
    private final qf.o f13082e;

    public q(g gVar, f fVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        rd.m.e(fVar, "kotlinTypePreparator");
        this.f13080c = gVar;
        this.f13081d = fVar;
        qf.o oVarM = qf.o.m(d());
        rd.m.d(oVarM, "createWithTypeRefiner(...)");
        this.f13082e = oVarM;
    }

    @Override // fg.e
    public boolean a(r0 r0Var, r0 r0Var2) {
        rd.m.e(r0Var, "subtype");
        rd.m.e(r0Var2, "supertype");
        return g(a.b(true, false, null, f(), d(), 6, null), r0Var.Q0(), r0Var2.Q0());
    }

    @Override // fg.p
    public qf.o b() {
        return this.f13082e;
    }

    @Override // fg.e
    public boolean c(r0 r0Var, r0 r0Var2) {
        rd.m.e(r0Var, "a");
        rd.m.e(r0Var2, "b");
        return e(a.b(false, false, null, f(), d(), 6, null), r0Var.Q0(), r0Var2.Q0());
    }

    @Override // fg.p
    public g d() {
        return this.f13080c;
    }

    public final boolean e(t1 t1Var, l2 l2Var, l2 l2Var2) {
        rd.m.e(t1Var, "<this>");
        rd.m.e(l2Var, "a");
        rd.m.e(l2Var2, "b");
        return eg.g.f12094a.m(t1Var, l2Var, l2Var2);
    }

    public f f() {
        return this.f13081d;
    }

    public final boolean g(t1 t1Var, l2 l2Var, l2 l2Var2) {
        rd.m.e(t1Var, "<this>");
        rd.m.e(l2Var, "subType");
        rd.m.e(l2Var2, "superType");
        return eg.g.v(eg.g.f12094a, t1Var, l2Var, l2Var2, false, 8, null);
    }

    public /* synthetic */ q(g gVar, f fVar, int i10, rd.h hVar) {
        this(gVar, (i10 & 2) != 0 ? f.a.f13058a : fVar);
    }
}
