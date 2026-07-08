package cg;

import he.b;
import he.g1;
import he.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends ke.k0 implements b {
    private final gf.o L;
    private final jf.d M;
    private final jf.h N;
    private final jf.j O;
    private final s P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(he.m mVar, y0 y0Var, ie.h hVar, he.e0 e0Var, he.u uVar, boolean z10, mf.f fVar, b.a aVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, gf.o oVar, jf.d dVar, jf.h hVar2, jf.j jVar, s sVar) {
        super(mVar, y0Var, hVar, e0Var, uVar, z10, fVar, aVar, g1.f15281a, z11, z12, z15, false, z13, z14);
        rd.m.e(mVar, "containingDeclaration");
        rd.m.e(hVar, "annotations");
        rd.m.e(e0Var, "modality");
        rd.m.e(uVar, "visibility");
        rd.m.e(fVar, "name");
        rd.m.e(aVar, "kind");
        rd.m.e(oVar, "proto");
        rd.m.e(dVar, "nameResolver");
        rd.m.e(hVar2, "typeTable");
        rd.m.e(jVar, "versionRequirementTable");
        this.L = oVar;
        this.M = dVar;
        this.N = hVar2;
        this.O = jVar;
        this.P = sVar;
    }

    @Override // ke.k0, he.d0
    public boolean A() {
        Boolean boolD = jf.b.E.d(H().N0());
        rd.m.d(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // ke.k0
    protected ke.k0 P0(he.m mVar, he.e0 e0Var, he.u uVar, y0 y0Var, b.a aVar, mf.f fVar, g1 g1Var) {
        rd.m.e(mVar, "newOwner");
        rd.m.e(e0Var, "newModality");
        rd.m.e(uVar, "newVisibility");
        rd.m.e(aVar, "kind");
        rd.m.e(fVar, "newName");
        rd.m.e(g1Var, "source");
        return new n0(mVar, y0Var, getAnnotations(), e0Var, uVar, j0(), fVar, aVar, r0(), C(), A(), P(), M(), H(), a0(), V(), g1(), c0());
    }

    @Override // cg.t
    public jf.h V() {
        return this.N;
    }

    @Override // cg.t
    public jf.d a0() {
        return this.M;
    }

    @Override // cg.t
    public s c0() {
        return this.P;
    }

    @Override // cg.t
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public gf.o H() {
        return this.L;
    }

    public jf.j g1() {
        return this.O;
    }
}
