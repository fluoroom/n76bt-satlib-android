package ke;

import eg.u1;
import he.g1;
import he.q1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xf.k;

/* JADX INFO: loaded from: classes3.dex */
public class g0 extends j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final he.f f19658r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f19659s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private he.e0 f19660t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private he.u f19661u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private u1 f19662v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f19663w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Collection f19664x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final dg.n f19665y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(he.m mVar, he.f fVar, boolean z10, boolean z11, mf.f fVar2, g1 g1Var, dg.n nVar) {
        super(nVar, mVar, fVar2, g1Var, z11);
        if (mVar == null) {
            B0(0);
        }
        if (fVar == null) {
            B0(1);
        }
        if (fVar2 == null) {
            B0(2);
        }
        if (g1Var == null) {
            B0(3);
        }
        if (nVar == null) {
            B0(4);
        }
        this.f19664x = new ArrayList();
        this.f19665y = nVar;
        this.f19658r = fVar;
        this.f19659s = z10;
    }

    private static /* synthetic */ void B0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
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

    public void K0() {
        this.f19662v = new eg.u(this, this.f19663w, this.f19664x, this.f19665y);
        Iterator it = getConstructors().iterator();
        while (it.hasNext()) {
            ((i) ((he.z) it.next())).g1(s());
        }
    }

    @Override // he.e
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public Set getConstructors() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            B0(13);
        }
        return set;
    }

    @Override // he.d0
    public boolean M() {
        return false;
    }

    public void M0(he.e0 e0Var) {
        if (e0Var == null) {
            B0(6);
        }
        this.f19660t = e0Var;
    }

    @Override // he.i
    public boolean N() {
        return this.f19659s;
    }

    public void N0(List list) {
        if (list == null) {
            B0(14);
        }
        if (this.f19663w == null) {
            this.f19663w = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    public void O0(he.u uVar) {
        if (uVar == null) {
            B0(9);
        }
        this.f19661u = uVar;
    }

    @Override // he.e
    public he.d T() {
        return null;
    }

    @Override // he.e
    public xf.k U() {
        k.b bVar = k.b.f32079b;
        if (bVar == null) {
            B0(18);
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
            B0(16);
        }
        k.b bVar = k.b.f32079b;
        if (bVar == null) {
            B0(17);
        }
        return bVar;
    }

    @Override // ie.a
    public ie.h getAnnotations() {
        ie.h hVarB = ie.h.f16054l.b();
        if (hVarB == null) {
            B0(5);
        }
        return hVarB;
    }

    @Override // he.e, he.d0, he.q
    public he.u getVisibility() {
        he.u uVar = this.f19661u;
        if (uVar == null) {
            B0(10);
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
        he.f fVar = this.f19658r;
        if (fVar == null) {
            B0(8);
        }
        return fVar;
    }

    @Override // he.h
    public u1 k() {
        u1 u1Var = this.f19662v;
        if (u1Var == null) {
            B0(11);
        }
        return u1Var;
    }

    @Override // he.e, he.d0
    public he.e0 l() {
        he.e0 e0Var = this.f19660t;
        if (e0Var == null) {
            B0(7);
        }
        return e0Var;
    }

    @Override // he.e
    public boolean m() {
        return false;
    }

    public String toString() {
        return m.f0(this);
    }

    @Override // he.e, he.i
    public List v() {
        List list = this.f19663w;
        if (list == null) {
            B0(15);
        }
        return list;
    }

    @Override // he.e
    public q1 z0() {
        return null;
    }
}
