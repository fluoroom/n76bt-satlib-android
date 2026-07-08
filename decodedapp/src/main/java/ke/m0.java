package ke;

import eg.c1;
import he.a1;
import he.b;
import he.g1;
import he.s1;
import he.y0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class m0 extends j0 implements a1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private s1 f19730v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final a1 f19731w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(y0 y0Var, ie.h hVar, he.e0 e0Var, he.u uVar, boolean z10, boolean z11, boolean z12, b.a aVar, a1 a1Var, g1 g1Var) {
        super(e0Var, uVar, y0Var, hVar, mf.f.k("<set-" + y0Var.getName() + ">"), z10, z11, z12, aVar, g1Var);
        if (y0Var == null) {
            K(0);
        }
        if (hVar == null) {
            K(1);
        }
        if (e0Var == null) {
            K(2);
        }
        if (uVar == null) {
            K(3);
        }
        if (aVar == null) {
            K(4);
        }
        if (g1Var == null) {
            K(5);
        }
        this.f19731w = a1Var != null ? a1Var : this;
    }

    private static /* synthetic */ void K(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static u0 O0(a1 a1Var, eg.r0 r0Var, ie.h hVar) {
        if (a1Var == null) {
            K(7);
        }
        if (r0Var == null) {
            K(8);
        }
        if (hVar == null) {
            K(9);
        }
        return new u0(a1Var, null, 0, hVar, mf.h.f22025p, r0Var, false, false, false, null, g1.f15281a);
    }

    @Override // ke.n, ke.m, he.m
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public a1 a() {
        a1 a1Var = this.f19731w;
        if (a1Var == null) {
            K(13);
        }
        return a1Var;
    }

    public void Q0(s1 s1Var) {
        if (s1Var == null) {
            K(6);
        }
        this.f19730v = s1Var;
    }

    @Override // he.z, he.b, he.a
    public Collection e() {
        Collection collectionK0 = super.K0(false);
        if (collectionK0 == null) {
            K(10);
        }
        return collectionK0;
    }

    @Override // he.a
    public eg.r0 g() {
        c1 c1VarA0 = uf.e.m(this).a0();
        if (c1VarA0 == null) {
            K(12);
        }
        return c1VarA0;
    }

    @Override // he.a
    public List i() {
        s1 s1Var = this.f19730v;
        if (s1Var == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(s1Var);
        if (listSingletonList == null) {
            K(11);
        }
        return listSingletonList;
    }

    @Override // he.m
    public Object t0(he.o oVar, Object obj) {
        return oVar.g(this, obj);
    }
}
