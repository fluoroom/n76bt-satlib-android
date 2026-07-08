package ke;

import he.g1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends m implements he.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.m f19732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g1 f19733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected n(he.m mVar, ie.h hVar, mf.f fVar, g1 g1Var) {
        super(hVar, fVar);
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
        this.f19732c = mVar;
        this.f19733d = g1Var;
    }

    private static /* synthetic */ void K(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ke.m, he.m
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public he.p a() {
        he.p pVar = (he.p) super.a();
        if (pVar == null) {
            K(4);
        }
        return pVar;
    }

    public he.m b() {
        he.m mVar = this.f19732c;
        if (mVar == null) {
            K(5);
        }
        return mVar;
    }

    public g1 getSource() {
        g1 g1Var = this.f19733d;
        if (g1Var == null) {
            K(6);
        }
        return g1Var;
    }
}
