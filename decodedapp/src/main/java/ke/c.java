package ke;

import eg.f2;
import eg.m2;
import he.b1;
import he.g1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends m implements b1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ie.h hVar) {
        super(hVar, mf.h.f22018i);
        if (hVar == null) {
            K(0);
        }
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
            case 11:
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
            case 11:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // he.a
    public boolean J() {
        return false;
    }

    @Override // he.a
    public Collection e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            K(8);
        }
        return set;
    }

    @Override // he.a
    public eg.r0 g() {
        return getType();
    }

    @Override // he.a
    public b1 g0() {
        return null;
    }

    @Override // he.p
    public g1 getSource() {
        g1 g1Var = g1.f15281a;
        if (g1Var == null) {
            K(11);
        }
        return g1Var;
    }

    @Override // he.r1
    public eg.r0 getType() {
        eg.r0 type = getValue().getType();
        if (type == null) {
            K(6);
        }
        return type;
    }

    @Override // he.a
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            K(5);
        }
        return list;
    }

    @Override // he.q
    public he.u getVisibility() {
        he.u uVar = he.t.f15310f;
        if (uVar == null) {
            K(9);
        }
        return uVar;
    }

    @Override // he.a
    public List i() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            K(7);
        }
        return list;
    }

    @Override // he.a
    public b1 l0() {
        return null;
    }

    @Override // he.m
    public Object t0(he.o oVar, Object obj) {
        return oVar.d(this, obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ie.h hVar, mf.f fVar) {
        super(hVar, fVar);
        if (hVar == null) {
            K(1);
        }
        if (fVar == null) {
            K(2);
        }
    }

    @Override // he.i1
    public b1 c(f2 f2Var) {
        if (f2Var == null) {
            K(3);
        }
        if (!f2Var.k()) {
            eg.r0 r0VarP = b() instanceof he.e ? f2Var.p(getType(), m2.f12142g) : f2Var.p(getType(), m2.f12140e);
            if (r0VarP == null) {
                return null;
            }
            if (r0VarP != getType()) {
                return new n0(b(), new yf.i(r0VarP), getAnnotations());
            }
        }
        return this;
    }

    @Override // ke.m, he.m
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public he.v0 a() {
        return this;
    }
}
