package ke;

import he.b;
import he.g1;
import he.y0;
import he.z0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class l0 extends j0 implements z0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private eg.r0 f19727v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final z0 f19728w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(y0 y0Var, ie.h hVar, he.e0 e0Var, he.u uVar, boolean z10, boolean z11, boolean z12, b.a aVar, z0 z0Var, g1 g1Var) {
        super(e0Var, uVar, y0Var, hVar, mf.f.k("<get-" + y0Var.getName() + ">"), z10, z11, z12, aVar, g1Var);
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
        this.f19728w = z0Var != null ? z0Var : this;
    }

    private static /* synthetic */ void K(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ke.n, ke.m, he.m
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public z0 a() {
        z0 z0Var = this.f19728w;
        if (z0Var == null) {
            K(8);
        }
        return z0Var;
    }

    public void P0(eg.r0 r0Var) {
        if (r0Var == null) {
            r0Var = C0().getType();
        }
        this.f19727v = r0Var;
    }

    @Override // he.z, he.b, he.a
    public Collection e() {
        Collection collectionK0 = super.K0(true);
        if (collectionK0 == null) {
            K(6);
        }
        return collectionK0;
    }

    @Override // he.a
    public eg.r0 g() {
        return this.f19727v;
    }

    @Override // he.a
    public List i() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            K(7);
        }
        return list;
    }

    @Override // he.m
    public Object t0(he.o oVar, Object obj) {
        return oVar.c(this, obj);
    }
}
