package fg;

import eg.a2;
import eg.c1;
import eg.l2;
import eg.q1;
import he.l1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends c1 implements ig.d {

    /* JADX INFO: renamed from: b */
    private final ig.b f13061b;

    /* JADX INFO: renamed from: c */
    private final n f13062c;

    /* JADX INFO: renamed from: d */
    private final l2 f13063d;

    /* JADX INFO: renamed from: e */
    private final q1 f13064e;

    /* JADX INFO: renamed from: f */
    private final boolean f13065f;

    /* JADX INFO: renamed from: g */
    private final boolean f13066g;

    public /* synthetic */ i(ig.b bVar, n nVar, l2 l2Var, q1 q1Var, boolean z10, boolean z11, int i10, rd.h hVar) {
        this(bVar, nVar, l2Var, (i10 & 8) != 0 ? q1.f12167b.k() : q1Var, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
    }

    @Override // eg.r0
    public List L0() {
        return ed.q.k();
    }

    @Override // eg.r0
    public q1 M0() {
        return this.f13064e;
    }

    @Override // eg.r0
    public boolean O0() {
        return this.f13065f;
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: V0 */
    public c1 T0(q1 q1Var) {
        rd.m.e(q1Var, "newAttributes");
        return new i(this.f13061b, N0(), this.f13063d, q1Var, O0(), this.f13066g);
    }

    public final ig.b W0() {
        return this.f13061b;
    }

    @Override // eg.r0
    /* JADX INFO: renamed from: X0 */
    public n N0() {
        return this.f13062c;
    }

    public final l2 Y0() {
        return this.f13063d;
    }

    public final boolean Z0() {
        return this.f13066g;
    }

    @Override // eg.c1
    /* JADX INFO: renamed from: a1 */
    public i R0(boolean z10) {
        return new i(this.f13061b, N0(), this.f13063d, M0(), z10, false, 32, null);
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: b1 */
    public i X0(g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        ig.b bVar = this.f13061b;
        n nVarP = N0().p(gVar);
        l2 l2Var = this.f13063d;
        return new i(bVar, nVarP, l2Var != null ? gVar.a(l2Var).Q0() : null, M0(), O0(), false, 32, null);
    }

    @Override // eg.r0
    public xf.k p() {
        return gg.l.a(gg.h.f14435b, true, new String[0]);
    }

    public i(ig.b bVar, n nVar, l2 l2Var, q1 q1Var, boolean z10, boolean z11) {
        rd.m.e(bVar, "captureStatus");
        rd.m.e(nVar, "constructor");
        rd.m.e(q1Var, "attributes");
        this.f13061b = bVar;
        this.f13062c = nVar;
        this.f13063d = l2Var;
        this.f13064e = q1Var;
        this.f13065f = z10;
        this.f13066g = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(ig.b bVar, l2 l2Var, a2 a2Var, l1 l1Var) {
        this(bVar, new n(a2Var, null, null, l1Var, 6, null), l2Var, null, false, false, 56, null);
        rd.m.e(bVar, "captureStatus");
        rd.m.e(a2Var, "projection");
        rd.m.e(l1Var, "typeParameter");
    }
}
