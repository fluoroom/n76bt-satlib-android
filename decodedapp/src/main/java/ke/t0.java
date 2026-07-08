package ke;

import eg.m2;
import he.g1;
import he.j1;
import he.l1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class t0 extends h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final qd.l f19799t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final List f19800u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f19801v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private t0(he.m mVar, ie.h hVar, boolean z10, m2 m2Var, mf.f fVar, int i10, g1 g1Var, qd.l lVar, j1 j1Var, dg.n nVar) {
        super(nVar, mVar, hVar, fVar, m2Var, z10, i10, g1Var, j1Var);
        if (mVar == null) {
            K(19);
        }
        if (hVar == null) {
            K(20);
        }
        if (m2Var == null) {
            K(21);
        }
        if (fVar == null) {
            K(22);
        }
        if (g1Var == null) {
            K(23);
        }
        if (j1Var == null) {
            K(24);
        }
        if (nVar == null) {
            K(25);
        }
        this.f19800u = new ArrayList(1);
        this.f19801v = false;
        this.f19799t = lVar;
    }

    private static /* synthetic */ void K(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    private void N0() {
        if (this.f19801v) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + U0());
    }

    private void O0() {
        if (this.f19801v) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + U0());
        }
    }

    public static t0 P0(he.m mVar, ie.h hVar, boolean z10, m2 m2Var, mf.f fVar, int i10, g1 g1Var, dg.n nVar) {
        if (mVar == null) {
            K(6);
        }
        if (hVar == null) {
            K(7);
        }
        if (m2Var == null) {
            K(8);
        }
        if (fVar == null) {
            K(9);
        }
        if (g1Var == null) {
            K(10);
        }
        if (nVar == null) {
            K(11);
        }
        return Q0(mVar, hVar, z10, m2Var, fVar, i10, g1Var, null, j1.a.f15286a, nVar);
    }

    public static t0 Q0(he.m mVar, ie.h hVar, boolean z10, m2 m2Var, mf.f fVar, int i10, g1 g1Var, qd.l lVar, j1 j1Var, dg.n nVar) {
        if (mVar == null) {
            K(12);
        }
        if (hVar == null) {
            K(13);
        }
        if (m2Var == null) {
            K(14);
        }
        if (fVar == null) {
            K(15);
        }
        if (g1Var == null) {
            K(16);
        }
        if (j1Var == null) {
            K(17);
        }
        if (nVar == null) {
            K(18);
        }
        return new t0(mVar, hVar, z10, m2Var, fVar, i10, g1Var, lVar, j1Var, nVar);
    }

    public static l1 R0(he.m mVar, ie.h hVar, boolean z10, m2 m2Var, mf.f fVar, int i10, dg.n nVar) {
        if (mVar == null) {
            K(0);
        }
        if (hVar == null) {
            K(1);
        }
        if (m2Var == null) {
            K(2);
        }
        if (fVar == null) {
            K(3);
        }
        if (nVar == null) {
            K(4);
        }
        t0 t0VarP0 = P0(mVar, hVar, z10, m2Var, fVar, i10, g1.f15281a, nVar);
        t0VarP0.M0(uf.e.m(mVar).z());
        t0VarP0.V0();
        return t0VarP0;
    }

    private void S0(eg.r0 r0Var) {
        if (eg.v0.a(r0Var)) {
            return;
        }
        this.f19800u.add(r0Var);
    }

    private String U0() {
        return getName() + " declared in " + qf.i.m(b());
    }

    @Override // ke.h
    protected void K0(eg.r0 r0Var) {
        if (r0Var == null) {
            K(27);
        }
        qd.l lVar = this.f19799t;
        if (lVar == null) {
            return;
        }
        lVar.l(r0Var);
    }

    @Override // ke.h
    protected List L0() {
        N0();
        List list = this.f19800u;
        if (list == null) {
            K(28);
        }
        return list;
    }

    public void M0(eg.r0 r0Var) {
        if (r0Var == null) {
            K(26);
        }
        O0();
        S0(r0Var);
    }

    public boolean T0() {
        return this.f19801v;
    }

    public void V0() {
        O0();
        this.f19801v = true;
    }
}
