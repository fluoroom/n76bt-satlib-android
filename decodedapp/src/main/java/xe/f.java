package xe;

import dd.q;
import df.r1;
import ee.i;
import eg.r0;
import he.a;
import he.a1;
import he.b;
import he.e0;
import he.g1;
import he.j;
import he.m;
import he.s1;
import he.u;
import he.y0;
import java.util.List;
import ke.k0;
import ke.l0;
import ke.m0;

/* JADX INFO: loaded from: classes3.dex */
public class f extends k0 implements a {
    private final boolean L;
    private final q M;
    private r0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected f(m mVar, ie.h hVar, e0 e0Var, u uVar, boolean z10, mf.f fVar, g1 g1Var, y0 y0Var, b.a aVar, boolean z11, q qVar) {
        super(mVar, y0Var, hVar, e0Var, uVar, z10, fVar, aVar, g1Var, false, false, false, false, false, false);
        if (mVar == null) {
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
        if (fVar == null) {
            K(4);
        }
        if (g1Var == null) {
            K(5);
        }
        if (aVar == null) {
            K(6);
        }
        this.N = null;
        this.L = z11;
        this.M = qVar;
    }

    private static /* synthetic */ void K(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    public static f f1(m mVar, ie.h hVar, e0 e0Var, u uVar, boolean z10, mf.f fVar, g1 g1Var, boolean z11) {
        if (mVar == null) {
            K(7);
        }
        if (hVar == null) {
            K(8);
        }
        if (e0Var == null) {
            K(9);
        }
        if (uVar == null) {
            K(10);
        }
        if (fVar == null) {
            K(11);
        }
        if (g1Var == null) {
            K(12);
        }
        return new f(mVar, hVar, e0Var, uVar, z10, fVar, g1Var, null, b.a.DECLARATION, z11, null);
    }

    @Override // ke.k0, he.t1
    public boolean C() {
        r0 type = getType();
        if (this.L && j.a(type)) {
            return !r1.i(type) || i.w0(type);
        }
        return false;
    }

    @Override // xe.a
    public a F(r0 r0Var, List list, r0 r0Var2, q qVar) {
        l0 l0Var;
        m0 m0Var;
        if (list == null) {
            K(19);
        }
        if (r0Var2 == null) {
            K(20);
        }
        y0 y0VarA = a() == this ? null : a();
        f fVar = new f(b(), getAnnotations(), l(), getVisibility(), j0(), getName(), getSource(), y0VarA, j(), this.L, qVar);
        l0 l0VarF = f();
        if (l0VarF != null) {
            l0 l0Var2 = new l0(fVar, l0VarF.getAnnotations(), l0VarF.l(), l0VarF.getVisibility(), l0VarF.isDefault(), l0VarF.A(), l0VarF.isInline(), j(), y0VarA == null ? null : y0VarA.f(), l0VarF.getSource());
            l0Var2.M0(l0VarF.e0());
            l0Var2.P0(r0Var2);
            l0Var = l0Var2;
        } else {
            l0Var = null;
        }
        a1 a1VarH = h();
        if (a1VarH != null) {
            m0Var = new m0(fVar, a1VarH.getAnnotations(), a1VarH.l(), a1VarH.getVisibility(), a1VarH.isDefault(), a1VarH.A(), a1VarH.isInline(), j(), y0VarA == null ? null : y0VarA.h(), a1VarH.getSource());
            m0Var.M0(m0Var.e0());
            m0Var.Q0((s1) a1VarH.i().get(0));
        } else {
            m0Var = null;
        }
        fVar.V0(l0Var, m0Var, p0(), m0());
        fVar.a1(W0());
        qd.a aVar = this.f19823h;
        if (aVar != null) {
            fVar.K0(this.f19822g, aVar);
        }
        fVar.x0(e());
        fVar.b1(r0Var2, getTypeParameters(), g0(), r0Var != null ? qf.h.i(this, r0Var, ie.h.f16054l.b()) : null, ed.q.k());
        return fVar;
    }

    @Override // ke.w0, he.a
    public boolean J() {
        return false;
    }

    @Override // ke.k0
    protected k0 P0(m mVar, e0 e0Var, u uVar, y0 y0Var, b.a aVar, mf.f fVar, g1 g1Var) {
        if (mVar == null) {
            K(13);
        }
        if (e0Var == null) {
            K(14);
        }
        if (uVar == null) {
            K(15);
        }
        if (aVar == null) {
            K(16);
        }
        if (fVar == null) {
            K(17);
        }
        if (g1Var == null) {
            K(18);
        }
        return new f(mVar, getAnnotations(), e0Var, uVar, j0(), fVar, g1Var, y0Var, aVar, this.L, this.M);
    }

    @Override // ke.k0
    public void Z0(r0 r0Var) {
        if (r0Var == null) {
            K(22);
        }
        this.N = r0Var;
    }

    @Override // ke.k0, he.a
    public Object d0(a.InterfaceC0214a interfaceC0214a) {
        q qVar = this.M;
        if (qVar == null || !((a.InterfaceC0214a) qVar.c()).equals(interfaceC0214a)) {
            return null;
        }
        return this.M.d();
    }
}
