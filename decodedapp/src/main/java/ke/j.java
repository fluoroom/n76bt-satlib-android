package ke;

import he.g1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final he.m f19686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g1 f19687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f19688h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected j(dg.n nVar, he.m mVar, mf.f fVar, g1 g1Var, boolean z10) {
        super(nVar, fVar);
        if (nVar == null) {
            B0(0);
        }
        if (mVar == null) {
            B0(1);
        }
        if (fVar == null) {
            B0(2);
        }
        if (g1Var == null) {
            B0(3);
        }
        this.f19686f = mVar;
        this.f19687g = g1Var;
        this.f19688h = z10;
    }

    private static /* synthetic */ void B0(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public boolean A() {
        return this.f19688h;
    }

    @Override // he.e, he.n, he.m
    public he.m b() {
        he.m mVar = this.f19686f;
        if (mVar == null) {
            B0(4);
        }
        return mVar;
    }

    @Override // he.p
    public g1 getSource() {
        g1 g1Var = this.f19687g;
        if (g1Var == null) {
            B0(5);
        }
        return g1Var;
    }
}
