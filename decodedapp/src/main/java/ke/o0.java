package ke;

import he.b;
import he.b1;
import he.f1;
import he.g1;
import he.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class o0 extends s implements f1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected o0(he.m mVar, f1 f1Var, ie.h hVar, mf.f fVar, b.a aVar, g1 g1Var) {
        super(mVar, f1Var, hVar, fVar, aVar, g1Var);
        if (mVar == null) {
            K(0);
        }
        if (hVar == null) {
            K(1);
        }
        if (fVar == null) {
            K(2);
        }
        if (aVar == null) {
            K(3);
        }
        if (g1Var == null) {
            K(4);
        }
    }

    private static /* synthetic */ void K(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static o0 l1(he.m mVar, ie.h hVar, mf.f fVar, b.a aVar, g1 g1Var) {
        if (mVar == null) {
            K(5);
        }
        if (hVar == null) {
            K(6);
        }
        if (fVar == null) {
            K(7);
        }
        if (aVar == null) {
            K(8);
        }
        if (g1Var == null) {
            K(9);
        }
        return new o0(mVar, null, hVar, fVar, aVar, g1Var);
    }

    @Override // ke.s
    /* JADX INFO: renamed from: L0 */
    protected s o1(he.m mVar, he.z zVar, b.a aVar, mf.f fVar, ie.h hVar, g1 g1Var) {
        if (mVar == null) {
            K(25);
        }
        if (aVar == null) {
            K(26);
        }
        if (hVar == null) {
            K(27);
        }
        if (g1Var == null) {
            K(28);
        }
        f1 f1Var = (f1) zVar;
        if (fVar == null) {
            fVar = getName();
        }
        return new o0(mVar, f1Var, hVar, fVar, aVar, g1Var);
    }

    @Override // he.b
    /* JADX INFO: renamed from: k1 */
    public f1 Q(he.m mVar, he.e0 e0Var, he.u uVar, b.a aVar, boolean z10) {
        f1 f1Var = (f1) super.K0(mVar, e0Var, uVar, aVar, z10);
        if (f1Var == null) {
            K(29);
        }
        return f1Var;
    }

    @Override // ke.s, ke.n, ke.m, he.m
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public f1 a() {
        f1 f1Var = (f1) super.a();
        if (f1Var == null) {
            K(24);
        }
        return f1Var;
    }

    @Override // ke.s
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public o0 R0(b1 b1Var, b1 b1Var2, List list, List list2, List list3, eg.r0 r0Var, he.e0 e0Var, he.u uVar) {
        if (list == null) {
            K(14);
        }
        if (list2 == null) {
            K(15);
        }
        if (list3 == null) {
            K(16);
        }
        if (uVar == null) {
            K(17);
        }
        o0 o0VarO1 = o1(b1Var, b1Var2, list, list2, list3, r0Var, e0Var, uVar, null);
        if (o0VarO1 == null) {
            K(18);
        }
        return o0VarO1;
    }

    public o0 o1(b1 b1Var, b1 b1Var2, List list, List list2, List list3, eg.r0 r0Var, he.e0 e0Var, he.u uVar, Map map) {
        if (list == null) {
            K(19);
        }
        if (list2 == null) {
            K(20);
        }
        if (list3 == null) {
            K(21);
        }
        if (uVar == null) {
            K(22);
        }
        super.R0(b1Var, b1Var2, list, list2, list3, r0Var, e0Var, uVar);
        if (map != null && !map.isEmpty()) {
            this.M = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // ke.s, he.z, he.f1
    public z.a u() {
        z.a aVarU = super.u();
        if (aVarU == null) {
            K(30);
        }
        return aVarU;
    }
}
