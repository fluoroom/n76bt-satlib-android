package xe;

import dd.q;
import eg.r0;
import he.a;
import he.b;
import he.g1;
import he.m;
import he.z;
import java.util.List;
import ke.i;

/* JADX INFO: loaded from: classes3.dex */
public class b extends i implements a {
    private Boolean O;
    private Boolean P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(he.e eVar, b bVar, ie.h hVar, boolean z10, b.a aVar, g1 g1Var) {
        super(eVar, bVar, hVar, z10, aVar, g1Var);
        if (eVar == null) {
            K(0);
        }
        if (hVar == null) {
            K(1);
        }
        if (aVar == null) {
            K(2);
        }
        if (g1Var == null) {
            K(3);
        }
        this.O = null;
        this.P = null;
    }

    private static /* synthetic */ void K(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static b t1(he.e eVar, ie.h hVar, boolean z10, g1 g1Var) {
        if (eVar == null) {
            K(4);
        }
        if (hVar == null) {
            K(5);
        }
        if (g1Var == null) {
            K(6);
        }
        return new b(eVar, null, hVar, z10, b.a.DECLARATION, g1Var);
    }

    @Override // ke.s, he.a
    public boolean J() {
        return this.P.booleanValue();
    }

    @Override // ke.s
    public boolean Q0() {
        return this.O.booleanValue();
    }

    @Override // ke.s
    public void Y0(boolean z10) {
        this.O = Boolean.valueOf(z10);
    }

    @Override // ke.s
    public void Z0(boolean z10) {
        this.P = Boolean.valueOf(z10);
    }

    protected b s1(he.e eVar, b bVar, b.a aVar, g1 g1Var, ie.h hVar) {
        if (eVar == null) {
            K(12);
        }
        if (aVar == null) {
            K(13);
        }
        if (g1Var == null) {
            K(14);
        }
        if (hVar == null) {
            K(15);
        }
        return new b(eVar, bVar, hVar, this.N, aVar, g1Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ke.i
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public b o1(m mVar, z zVar, b.a aVar, mf.f fVar, ie.h hVar, g1 g1Var) {
        if (mVar == null) {
            K(7);
        }
        if (aVar == null) {
            K(8);
        }
        if (hVar == null) {
            K(9);
        }
        if (g1Var == null) {
            K(10);
        }
        if (aVar == b.a.DECLARATION || aVar == b.a.SYNTHESIZED) {
            b bVarS1 = s1((he.e) mVar, (b) zVar, aVar, g1Var, hVar);
            bVarS1.Y0(Q0());
            bVarS1.Z0(J());
            return bVarS1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + aVar);
    }

    @Override // xe.a
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public b F(r0 r0Var, List list, r0 r0Var2, q qVar) {
        if (list == null) {
            K(16);
        }
        if (r0Var2 == null) {
            K(17);
        }
        b bVarO1 = o1(b(), null, j(), null, getAnnotations(), getSource());
        bVarO1.R0(r0Var == null ? null : qf.h.i(bVarO1, r0Var, ie.h.f16054l.b()), g0(), ed.q.k(), getTypeParameters(), h.a(list, i(), bVarO1), r0Var2, l(), getVisibility());
        if (qVar != null) {
            bVarO1.U0((a.InterfaceC0214a) qVar.c(), qVar.d());
        }
        return bVarO1;
    }
}
