package rf;

import ed.q;
import eg.a2;
import eg.c1;
import eg.q1;
import fg.g;
import gg.l;
import java.util.List;
import rd.h;
import rd.m;
import xf.k;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c1 implements ig.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a2 f25996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f25997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q1 f25999e;

    public /* synthetic */ a(a2 a2Var, b bVar, boolean z10, q1 q1Var, int i10, h hVar) {
        this(a2Var, (i10 & 2) != 0 ? new c(a2Var) : bVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? q1.f12167b.k() : q1Var);
    }

    @Override // eg.r0
    public List L0() {
        return q.k();
    }

    @Override // eg.r0
    public q1 M0() {
        return this.f25999e;
    }

    @Override // eg.r0
    public boolean O0() {
        return this.f25998d;
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: V0 */
    public c1 T0(q1 q1Var) {
        m.e(q1Var, "newAttributes");
        return new a(this.f25996b, N0(), O0(), q1Var);
    }

    @Override // eg.r0
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public b N0() {
        return this.f25997c;
    }

    @Override // eg.c1
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public a R0(boolean z10) {
        return z10 == O0() ? this : new a(this.f25996b, N0(), z10, M0());
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public a X0(g gVar) {
        m.e(gVar, "kotlinTypeRefiner");
        a2 a2VarP = this.f25996b.p(gVar);
        m.d(a2VarP, "refine(...)");
        return new a(a2VarP, N0(), O0(), M0());
    }

    @Override // eg.r0
    public k p() {
        return l.a(gg.h.f14435b, true, new String[0]);
    }

    @Override // eg.c1
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f25996b);
        sb2.append(')');
        sb2.append(O0() ? "?" : "");
        return sb2.toString();
    }

    public a(a2 a2Var, b bVar, boolean z10, q1 q1Var) {
        m.e(a2Var, "typeProjection");
        m.e(bVar, "constructor");
        m.e(q1Var, "attributes");
        this.f25996b = a2Var;
        this.f25997c = bVar;
        this.f25998d = z10;
        this.f25999e = q1Var;
    }
}
