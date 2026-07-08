package ke;

import eg.u1;
import he.g1;
import he.q1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import xf.k;

/* JADX INFO: loaded from: classes3.dex */
public class k extends j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final he.e0 f19697r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final he.f f19698s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final u1 f19699t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private xf.k f19700u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Set f19701v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private he.d f19702w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(he.m mVar, mf.f fVar, he.e0 e0Var, he.f fVar2, Collection collection, g1 g1Var, boolean z10, dg.n nVar) {
        super(nVar, mVar, fVar, g1Var, z10);
        if (mVar == null) {
            B0(0);
        }
        if (fVar == null) {
            B0(1);
        }
        if (e0Var == null) {
            B0(2);
        }
        if (fVar2 == null) {
            B0(3);
        }
        if (collection == null) {
            B0(4);
        }
        if (g1Var == null) {
            B0(5);
        }
        if (nVar == null) {
            B0(6);
        }
        this.f19697r = e0Var;
        this.f19698s = fVar2;
        this.f19699t = new eg.u(this, Collections.EMPTY_LIST, collection, nVar);
    }

    private static /* synthetic */ void B0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // he.e
    public boolean B() {
        return false;
    }

    @Override // he.d0
    public boolean F0() {
        return false;
    }

    @Override // he.e
    public boolean G() {
        return false;
    }

    public final void K0(xf.k kVar, Set set, he.d dVar) {
        if (kVar == null) {
            B0(7);
        }
        if (set == null) {
            B0(8);
        }
        this.f19700u = kVar;
        this.f19701v = set;
        this.f19702w = dVar;
    }

    @Override // he.d0
    public boolean M() {
        return false;
    }

    @Override // he.i
    public boolean N() {
        return false;
    }

    @Override // he.e
    public he.d T() {
        return this.f19702w;
    }

    @Override // he.e
    public xf.k U() {
        k.b bVar = k.b.f32079b;
        if (bVar == null) {
            B0(14);
        }
        return bVar;
    }

    @Override // he.e
    public he.e W() {
        return null;
    }

    @Override // ke.z
    public xf.k f0(fg.g gVar) {
        if (gVar == null) {
            B0(12);
        }
        xf.k kVar = this.f19700u;
        if (kVar == null) {
            B0(13);
        }
        return kVar;
    }

    @Override // ie.a
    public ie.h getAnnotations() {
        ie.h hVarB = ie.h.f16054l.b();
        if (hVarB == null) {
            B0(9);
        }
        return hVarB;
    }

    @Override // he.e
    public Collection getConstructors() {
        Set set = this.f19701v;
        if (set == null) {
            B0(11);
        }
        return set;
    }

    @Override // he.e, he.d0, he.q
    public he.u getVisibility() {
        he.u uVar = he.t.f15309e;
        if (uVar == null) {
            B0(17);
        }
        return uVar;
    }

    @Override // he.e
    public boolean isData() {
        return false;
    }

    @Override // he.e
    public boolean isInline() {
        return false;
    }

    @Override // he.e
    public he.f j() {
        he.f fVar = this.f19698s;
        if (fVar == null) {
            B0(15);
        }
        return fVar;
    }

    @Override // he.h
    public u1 k() {
        u1 u1Var = this.f19699t;
        if (u1Var == null) {
            B0(10);
        }
        return u1Var;
    }

    @Override // he.e, he.d0
    public he.e0 l() {
        he.e0 e0Var = this.f19697r;
        if (e0Var == null) {
            B0(16);
        }
        return e0Var;
    }

    @Override // he.e
    public boolean m() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // he.e, he.i
    public List v() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            B0(18);
        }
        return list;
    }

    @Override // he.e
    public q1 z0() {
        return null;
    }
}
