package ef;

import eg.c1;
import eg.r0;
import eg.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements ag.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f12029a = new p();

    private p() {
    }

    @Override // ag.x
    public r0 a(gf.r rVar, String str, c1 c1Var, c1 c1Var2) {
        rd.m.e(rVar, "proto");
        rd.m.e(str, "flexibleId");
        rd.m.e(c1Var, "lowerBound");
        rd.m.e(c1Var2, "upperBound");
        return !rd.m.a(str, "kotlin.jvm.PlatformType") ? gg.l.d(gg.k.R, str, c1Var.toString(), c1Var2.toString()) : rVar.s(kf.a.f19839g) ? new af.k(c1Var, c1Var2) : u0.e(c1Var, c1Var2);
    }
}
