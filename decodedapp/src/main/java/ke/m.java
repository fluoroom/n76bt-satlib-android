package ke;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends ie.b implements he.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mf.f f19729b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ie.h hVar, mf.f fVar) {
        super(hVar);
        if (hVar == null) {
            K(0);
        }
        if (fVar == null) {
            K(1);
        }
        this.f19729b = fVar;
    }

    private static /* synthetic */ void K(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String f0(he.m mVar) {
        if (mVar == null) {
            K(4);
        }
        try {
            String str = pf.n.f24183k.M(mVar) + "[" + mVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(mVar)) + "]";
            if (str == null) {
                K(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = mVar.getClass().getSimpleName() + " " + mVar.getName();
            if (str2 == null) {
                K(6);
            }
            return str2;
        }
    }

    @Override // he.j0
    public mf.f getName() {
        mf.f fVar = this.f19729b;
        if (fVar == null) {
            K(2);
        }
        return fVar;
    }

    public String toString() {
        return f0(this);
    }

    public he.m a() {
        return this;
    }
}
