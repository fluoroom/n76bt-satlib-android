package ke;

import he.g1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 extends w0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected dg.j f19822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected qd.a f19823h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(he.m mVar, ie.h hVar, mf.f fVar, eg.r0 r0Var, boolean z10, g1 g1Var) {
        super(mVar, hVar, fVar, r0Var, g1Var);
        if (mVar == null) {
            K(0);
        }
        if (hVar == null) {
            K(1);
        }
        if (fVar == null) {
            K(2);
        }
        if (g1Var == null) {
            K(3);
        }
        this.f19821f = z10;
    }

    private static /* synthetic */ void K(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void K0(dg.j jVar, qd.a aVar) {
        if (aVar == null) {
            K(5);
        }
        this.f19823h = aVar;
        if (jVar == null) {
            jVar = (dg.j) aVar.a();
        }
        this.f19822g = jVar;
    }

    public void L0(qd.a aVar) {
        if (aVar == null) {
            K(4);
        }
        K0(null, aVar);
    }

    @Override // he.t1
    public sf.g Y() {
        dg.j jVar = this.f19822g;
        if (jVar != null) {
            return (sf.g) jVar.a();
        }
        return null;
    }

    @Override // he.t1
    public boolean j0() {
        return this.f19821f;
    }
}
