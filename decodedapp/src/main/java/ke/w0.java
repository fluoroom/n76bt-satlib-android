package ke;

import he.b1;
import he.g1;
import he.t1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w0 extends n implements t1 {

    /* JADX INFO: renamed from: e */
    protected eg.r0 f19814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(he.m mVar, ie.h hVar, mf.f fVar, eg.r0 r0Var, g1 g1Var) {
        super(mVar, hVar, fVar, g1Var);
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
        this.f19814e = r0Var;
    }

    private static /* synthetic */ void K(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public void G0(eg.r0 r0Var) {
        this.f19814e = r0Var;
    }

    @Override // he.a
    public boolean J() {
        return false;
    }

    public eg.r0 g() {
        eg.r0 type = getType();
        if (type == null) {
            K(10);
        }
        return type;
    }

    public b1 g0() {
        return null;
    }

    @Override // he.r1
    public eg.r0 getType() {
        eg.r0 r0Var = this.f19814e;
        if (r0Var == null) {
            K(4);
        }
        return r0Var;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            K(8);
        }
        return list;
    }

    @Override // he.a
    public List i() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            K(6);
        }
        return list;
    }

    public b1 l0() {
        return null;
    }
}
