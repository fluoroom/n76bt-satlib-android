package ke;

/* JADX INFO: loaded from: classes3.dex */
public class t extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.e f19797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yf.e f19798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(he.e eVar) {
        super(ie.h.f16054l.b());
        if (eVar == null) {
            K(0);
        }
        this.f19797c = eVar;
        this.f19798d = new yf.e(eVar, null);
    }

    private static /* synthetic */ void K(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // he.m
    public he.m b() {
        he.e eVar = this.f19797c;
        if (eVar == null) {
            K(2);
        }
        return eVar;
    }

    @Override // he.b1
    public yf.g getValue() {
        yf.e eVar = this.f19798d;
        if (eVar == null) {
            K(1);
        }
        return eVar;
    }

    @Override // ke.m
    public String toString() {
        return "class " + this.f19797c.getName() + "::this";
    }
}
