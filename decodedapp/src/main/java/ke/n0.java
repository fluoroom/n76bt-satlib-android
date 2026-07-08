package ke;

/* JADX INFO: loaded from: classes3.dex */
public class n0 extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.m f19734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private yf.g f19735d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(he.m mVar, yf.g gVar, ie.h hVar) {
        this(mVar, gVar, hVar, mf.h.f22018i);
        if (mVar == null) {
            K(0);
        }
        if (gVar == null) {
            K(1);
        }
        if (hVar == null) {
            K(2);
        }
    }

    private static /* synthetic */ void K(int i10) {
        String str = (i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getValue";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i10) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // he.m
    public he.m b() {
        he.m mVar = this.f19734c;
        if (mVar == null) {
            K(8);
        }
        return mVar;
    }

    @Override // he.b1
    public yf.g getValue() {
        yf.g gVar = this.f19735d;
        if (gVar == null) {
            K(7);
        }
        return gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(he.m mVar, yf.g gVar, ie.h hVar, mf.f fVar) {
        super(hVar, fVar);
        if (mVar == null) {
            K(3);
        }
        if (gVar == null) {
            K(4);
        }
        if (hVar == null) {
            K(5);
        }
        if (fVar == null) {
            K(6);
        }
        this.f19734c = mVar;
        this.f19735d = gVar;
    }
}
