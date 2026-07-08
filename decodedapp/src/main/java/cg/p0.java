package cg;

import eg.c1;
import eg.e2;
import eg.f2;
import eg.m2;
import eg.v0;
import he.g1;
import he.k1;
import he.p1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends ke.g implements t {
    private List A;
    private c1 B;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final gf.s f4831t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final jf.d f4832u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final jf.h f4833v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final jf.j f4834w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final s f4835x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private c1 f4836y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private c1 f4837z;

    /* JADX WARN: Illegal instructions before constructor call */
    public p0(dg.n nVar, he.m mVar, ie.h hVar, mf.f fVar, he.u uVar, gf.s sVar, jf.d dVar, jf.h hVar2, jf.j jVar, s sVar2) {
        rd.m.e(nVar, "storageManager");
        rd.m.e(mVar, "containingDeclaration");
        rd.m.e(hVar, "annotations");
        rd.m.e(fVar, "name");
        rd.m.e(uVar, "visibility");
        rd.m.e(sVar, "proto");
        rd.m.e(dVar, "nameResolver");
        rd.m.e(hVar2, "typeTable");
        rd.m.e(jVar, "versionRequirementTable");
        g1 g1Var = g1.f15281a;
        rd.m.d(g1Var, "NO_SOURCE");
        super(nVar, mVar, hVar, fVar, g1Var, uVar);
        this.f4831t = sVar;
        this.f4832u = dVar;
        this.f4833v = hVar2;
        this.f4834w = jVar;
        this.f4835x = sVar2;
    }

    @Override // ke.g
    protected List R0() {
        List list = this.A;
        if (list != null) {
            return list;
        }
        rd.m.o("typeConstructorParameters");
        return null;
    }

    @Override // cg.t
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public gf.s H() {
        return this.f4831t;
    }

    @Override // cg.t
    public jf.h V() {
        return this.f4833v;
    }

    public jf.j V0() {
        return this.f4834w;
    }

    public final void W0(List list, c1 c1Var, c1 c1Var2) {
        rd.m.e(list, "declaredTypeParameters");
        rd.m.e(c1Var, "underlyingType");
        rd.m.e(c1Var2, "expandedType");
        S0(list);
        this.f4836y = c1Var;
        this.f4837z = c1Var2;
        this.A = p1.g(this);
        this.B = M0();
    }

    @Override // he.k1
    public c1 X() {
        c1 c1Var = this.f4837z;
        if (c1Var != null) {
            return c1Var;
        }
        rd.m.o("expandedType");
        return null;
    }

    @Override // he.i1
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public k1 c(f2 f2Var) {
        rd.m.e(f2Var, "substitutor");
        if (f2Var.k()) {
            return this;
        }
        dg.n nVarI0 = i0();
        he.m mVarB = b();
        rd.m.d(mVarB, "getContainingDeclaration(...)");
        ie.h annotations = getAnnotations();
        rd.m.d(annotations, "<get-annotations>(...)");
        mf.f name = getName();
        rd.m.d(name, "getName(...)");
        p0 p0Var = new p0(nVarI0, mVarB, annotations, name, getVisibility(), H(), a0(), V(), V0(), c0());
        List listV = v();
        c1 c1VarH0 = h0();
        m2 m2Var = m2.f12140e;
        eg.r0 r0VarN = f2Var.n(c1VarH0, m2Var);
        rd.m.d(r0VarN, "safeSubstitute(...)");
        c1 c1VarA = e2.a(r0VarN);
        eg.r0 r0VarN2 = f2Var.n(X(), m2Var);
        rd.m.d(r0VarN2, "safeSubstitute(...)");
        p0Var.W0(listV, c1VarA, e2.a(r0VarN2));
        return p0Var;
    }

    @Override // cg.t
    public jf.d a0() {
        return this.f4832u;
    }

    @Override // cg.t
    public s c0() {
        return this.f4835x;
    }

    @Override // he.k1
    public c1 h0() {
        c1 c1Var = this.f4836y;
        if (c1Var != null) {
            return c1Var;
        }
        rd.m.o("underlyingType");
        return null;
    }

    @Override // he.k1
    public he.e r() {
        if (v0.a(X())) {
            return null;
        }
        he.h hVarQ = X().N0().q();
        if (hVarQ instanceof he.e) {
            return (he.e) hVarQ;
        }
        return null;
    }

    @Override // he.h
    public c1 s() {
        c1 c1Var = this.B;
        if (c1Var != null) {
            return c1Var;
        }
        rd.m.o("defaultTypeImpl");
        return null;
    }
}
