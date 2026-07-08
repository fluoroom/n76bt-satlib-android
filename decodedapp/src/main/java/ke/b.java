package ke;

import eg.m2;
import he.g1;
import he.j1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dg.n nVar, he.m mVar, ie.h hVar, mf.f fVar, m2 m2Var, boolean z10, int i10, g1 g1Var, j1 j1Var) {
        super(nVar, mVar, hVar, fVar, m2Var, z10, i10, g1Var, j1Var);
        if (nVar == null) {
            K(0);
        }
        if (mVar == null) {
            K(1);
        }
        if (hVar == null) {
            K(2);
        }
        if (fVar == null) {
            K(3);
        }
        if (m2Var == null) {
            K(4);
        }
        if (g1Var == null) {
            K(5);
        }
        if (j1Var == null) {
            K(6);
        }
    }

    private static /* synthetic */ void K(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // ke.m
    public String toString() {
        String str = "";
        String str2 = I() ? "reified " : "";
        if (n() != m2.f12140e) {
            str = n() + " ";
        }
        return String.format("%s%s%s", str2, str, getName());
    }
}
