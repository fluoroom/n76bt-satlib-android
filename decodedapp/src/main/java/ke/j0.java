package ke;

import eg.f2;
import he.a;
import he.b;
import he.b1;
import he.g1;
import he.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 extends n implements he.x0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final he.e0 f19691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y0 f19692h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f19693r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final b.a f19694s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private he.u f19695t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private he.z f19696u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(he.e0 e0Var, he.u uVar, y0 y0Var, ie.h hVar, mf.f fVar, boolean z10, boolean z11, boolean z12, b.a aVar, g1 g1Var) {
        super(y0Var.b(), hVar, fVar, g1Var);
        if (e0Var == null) {
            K(0);
        }
        if (uVar == null) {
            K(1);
        }
        if (y0Var == null) {
            K(2);
        }
        if (hVar == null) {
            K(3);
        }
        if (fVar == null) {
            K(4);
        }
        if (g1Var == null) {
            K(5);
        }
        this.f19696u = null;
        this.f19691g = e0Var;
        this.f19695t = uVar;
        this.f19692h = y0Var;
        this.f19689e = z10;
        this.f19690f = z11;
        this.f19693r = z12;
        this.f19694s = aVar;
    }

    private static /* synthetic */ void K(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i11 = 2;
                break;
            case 7:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // he.d0
    public boolean A() {
        return this.f19690f;
    }

    @Override // he.x0
    public y0 C0() {
        y0 y0Var = this.f19692h;
        if (y0Var == null) {
            K(13);
        }
        return y0Var;
    }

    @Override // he.z
    public boolean D0() {
        return false;
    }

    @Override // he.d0
    public boolean F0() {
        return false;
    }

    @Override // he.b
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public he.x0 Q(he.m mVar, he.e0 e0Var, he.u uVar, b.a aVar, boolean z10) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // he.z
    public boolean I0() {
        return false;
    }

    @Override // he.a
    public boolean J() {
        return false;
    }

    protected Collection K0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (y0 y0Var : C0().e()) {
            he.a aVarF = z10 ? y0Var.f() : y0Var.h();
            if (aVarF != null) {
                arrayList.add(aVarF);
            }
        }
        return arrayList;
    }

    public void L0(boolean z10) {
        this.f19689e = z10;
    }

    @Override // he.d0
    public boolean M() {
        return false;
    }

    public void M0(he.z zVar) {
        this.f19696u = zVar;
    }

    public void N0(he.u uVar) {
        this.f19695t = uVar;
    }

    @Override // he.z
    public boolean R() {
        return false;
    }

    @Override // he.z
    public boolean S() {
        return false;
    }

    @Override // he.i1
    public he.z c(f2 f2Var) {
        if (f2Var == null) {
            K(7);
        }
        return this;
    }

    @Override // he.a
    public Object d0(a.InterfaceC0214a interfaceC0214a) {
        return null;
    }

    @Override // he.z
    public he.z e0() {
        return this.f19696u;
    }

    @Override // he.a
    public b1 g0() {
        return C0().g0();
    }

    @Override // he.a
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            K(9);
        }
        return list;
    }

    @Override // he.q
    public he.u getVisibility() {
        he.u uVar = this.f19695t;
        if (uVar == null) {
            K(11);
        }
        return uVar;
    }

    @Override // he.x0
    public boolean isDefault() {
        return this.f19689e;
    }

    @Override // he.z
    public boolean isInline() {
        return this.f19693r;
    }

    @Override // he.b
    public b.a j() {
        b.a aVar = this.f19694s;
        if (aVar == null) {
            K(6);
        }
        return aVar;
    }

    @Override // he.d0
    public he.e0 l() {
        he.e0 e0Var = this.f19691g;
        if (e0Var == null) {
            K(10);
        }
        return e0Var;
    }

    @Override // he.a
    public b1 l0() {
        return C0().l0();
    }

    @Override // he.a
    public List q0() {
        List listQ0 = C0().q0();
        if (listQ0 == null) {
            K(14);
        }
        return listQ0;
    }

    @Override // he.z
    public boolean t() {
        return false;
    }

    @Override // he.z
    public boolean w0() {
        return false;
    }

    @Override // he.b
    public void x0(Collection collection) {
        if (collection == null) {
            K(16);
        }
    }
}
