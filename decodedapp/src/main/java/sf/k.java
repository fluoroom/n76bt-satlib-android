package sf;

import eg.c1;
import eg.r0;
import he.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mf.b f27336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mf.f f27337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(mf.b bVar, mf.f fVar) {
        super(dd.w.a(bVar, fVar));
        rd.m.e(bVar, "enumClassId");
        rd.m.e(fVar, "enumEntryName");
        this.f27336b = bVar;
        this.f27337c = fVar;
    }

    @Override // sf.g
    public r0 a(h0 h0Var) {
        c1 c1VarS;
        rd.m.e(h0Var, "module");
        he.e eVarB = he.y.b(h0Var, this.f27336b);
        if (eVarB != null) {
            if (!qf.i.A(eVarB)) {
                eVarB = null;
            }
            if (eVarB != null && (c1VarS = eVarB.s()) != null) {
                return c1VarS;
            }
        }
        return gg.l.d(gg.k.G0, this.f27336b.toString(), this.f27337c.toString());
    }

    public final mf.f c() {
        return this.f27337c;
    }

    @Override // sf.g
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27336b.h());
        sb2.append('.');
        sb2.append(this.f27337c);
        return sb2.toString();
    }
}
