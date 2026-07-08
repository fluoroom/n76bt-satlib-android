package qf;

import eg.c1;
import eg.c2;
import eg.m2;
import eg.q1;
import eg.r0;
import eg.u0;
import he.b;
import he.b1;
import he.e0;
import he.f1;
import he.g1;
import he.h0;
import he.y0;
import he.z;
import ie.h;
import java.util.Collections;
import java.util.List;
import ke.k0;
import ke.l0;
import ke.m0;
import ke.n0;
import ke.o0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    private static class a extends ke.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(he.e eVar, g1 g1Var, boolean z10) {
            super(eVar, null, ie.h.f16054l.b(), true, b.a.DECLARATION, g1Var);
            if (eVar == null) {
                K(0);
            }
            if (g1Var == null) {
                K(1);
            }
            q1(Collections.EMPTY_LIST, i.k(eVar, z10));
        }

        private static /* synthetic */ void K(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static b1 b(he.a aVar, r0 r0Var, mf.f fVar, ie.h hVar, int i10) {
        if (aVar == null) {
            a(32);
        }
        if (hVar == null) {
            a(33);
        }
        if (r0Var == null) {
            return null;
        }
        return new n0(aVar, new yf.c(aVar, r0Var, fVar, null), hVar, mf.g.a(i10));
    }

    public static b1 c(he.e eVar, r0 r0Var, mf.f fVar, ie.h hVar, int i10) {
        if (eVar == null) {
            a(34);
        }
        if (hVar == null) {
            a(35);
        }
        if (r0Var == null) {
            return null;
        }
        return new n0(eVar, new yf.b(eVar, r0Var, fVar, null), hVar, mf.g.a(i10));
    }

    public static l0 d(y0 y0Var, ie.h hVar) {
        if (y0Var == null) {
            a(13);
        }
        if (hVar == null) {
            a(14);
        }
        return j(y0Var, hVar, true, false, false);
    }

    public static m0 e(y0 y0Var, ie.h hVar, ie.h hVar2) {
        if (y0Var == null) {
            a(0);
        }
        if (hVar == null) {
            a(1);
        }
        if (hVar2 == null) {
            a(2);
        }
        return n(y0Var, hVar, hVar2, true, false, false, y0Var.getSource());
    }

    public static y0 f(he.e eVar) {
        if (eVar == null) {
            a(26);
        }
        h0 h0VarG = i.g(eVar);
        he.e eVarA = v.a(h0VarG).a(h0VarG);
        if (eVarA == null) {
            return null;
        }
        h.a aVar = ie.h.f16054l;
        ie.h hVarB = aVar.b();
        e0 e0Var = e0.f15259b;
        he.u uVar = he.t.f15309e;
        mf.f fVar = ee.o.f11839e;
        b.a aVar2 = b.a.SYNTHESIZED;
        k0 k0VarO0 = k0.O0(eVar, hVarB, e0Var, uVar, false, fVar, aVar2, eVar.getSource(), false, false, false, false, false, false);
        l0 l0Var = new l0(k0VarO0, aVar.b(), e0Var, uVar, false, false, false, aVar2, null, eVar.getSource());
        k0VarO0.U0(l0Var, null);
        c1 c1VarI = u0.i(q1.f12167b.k(), eVarA.k(), Collections.singletonList(new c2(eVar.s())), false);
        List list = Collections.EMPTY_LIST;
        k0VarO0.b1(c1VarI, list, null, null, list);
        l0Var.P0(k0VarO0.g());
        return k0VarO0;
    }

    public static f1 g(he.e eVar) {
        if (eVar == null) {
            a(24);
        }
        h.a aVar = ie.h.f16054l;
        o0 o0VarL1 = o0.l1(eVar, aVar.b(), ee.o.f11840f, b.a.SYNTHESIZED, eVar.getSource());
        ke.u0 u0Var = new ke.u0(o0VarL1, null, 0, aVar.b(), mf.f.h("value"), uf.e.m(eVar).X(), false, false, false, null, eVar.getSource());
        List list = Collections.EMPTY_LIST;
        o0 o0VarN1 = o0VarL1.R0(null, null, list, list, Collections.singletonList(u0Var), eVar.s(), e0.f15259b, he.t.f15309e);
        if (o0VarN1 == null) {
            a(25);
        }
        return o0VarN1;
    }

    public static f1 h(he.e eVar) {
        if (eVar == null) {
            a(22);
        }
        o0 o0VarL1 = o0.l1(eVar, ie.h.f16054l.b(), ee.o.f11838d, b.a.SYNTHESIZED, eVar.getSource());
        List list = Collections.EMPTY_LIST;
        o0 o0VarN1 = o0VarL1.R0(null, null, list, list, list, uf.e.m(eVar).m(m2.f12140e, eVar.s()), e0.f15259b, he.t.f15309e);
        if (o0VarN1 == null) {
            a(23);
        }
        return o0VarN1;
    }

    public static b1 i(he.a aVar, r0 r0Var, ie.h hVar) {
        if (aVar == null) {
            a(30);
        }
        if (hVar == null) {
            a(31);
        }
        if (r0Var == null) {
            return null;
        }
        return new n0(aVar, new yf.d(aVar, r0Var, null), hVar);
    }

    public static l0 j(y0 y0Var, ie.h hVar, boolean z10, boolean z11, boolean z12) {
        if (y0Var == null) {
            a(15);
        }
        if (hVar == null) {
            a(16);
        }
        return k(y0Var, hVar, z10, z11, z12, y0Var.getSource());
    }

    public static l0 k(y0 y0Var, ie.h hVar, boolean z10, boolean z11, boolean z12, g1 g1Var) {
        if (y0Var == null) {
            a(17);
        }
        if (hVar == null) {
            a(18);
        }
        if (g1Var == null) {
            a(19);
        }
        return new l0(y0Var, hVar, y0Var.l(), y0Var.getVisibility(), z10, z11, z12, b.a.DECLARATION, null, g1Var);
    }

    public static ke.i l(he.e eVar, g1 g1Var) {
        if (eVar == null) {
            a(20);
        }
        if (g1Var == null) {
            a(21);
        }
        return new a(eVar, g1Var, false);
    }

    public static m0 m(y0 y0Var, ie.h hVar, ie.h hVar2, boolean z10, boolean z11, boolean z12, he.u uVar, g1 g1Var) {
        if (y0Var == null) {
            a(7);
        }
        if (hVar == null) {
            a(8);
        }
        if (hVar2 == null) {
            a(9);
        }
        if (uVar == null) {
            a(10);
        }
        if (g1Var == null) {
            a(11);
        }
        m0 m0Var = new m0(y0Var, hVar, y0Var.l(), uVar, z10, z11, z12, b.a.DECLARATION, null, g1Var);
        m0Var.Q0(m0.O0(m0Var, y0Var.getType(), hVar2));
        return m0Var;
    }

    public static m0 n(y0 y0Var, ie.h hVar, ie.h hVar2, boolean z10, boolean z11, boolean z12, g1 g1Var) {
        if (y0Var == null) {
            a(3);
        }
        if (hVar == null) {
            a(4);
        }
        if (hVar2 == null) {
            a(5);
        }
        if (g1Var == null) {
            a(6);
        }
        return m(y0Var, hVar, hVar2, z10, z11, z12, y0Var.getVisibility(), g1Var);
    }

    private static boolean o(z zVar) {
        if (zVar == null) {
            a(29);
        }
        return zVar.j() == b.a.SYNTHESIZED && i.A(zVar.b());
    }

    public static boolean p(z zVar) {
        if (zVar == null) {
            a(28);
        }
        return zVar.getName().equals(ee.o.f11840f) && o(zVar);
    }

    public static boolean q(z zVar) {
        if (zVar == null) {
            a(27);
        }
        return zVar.getName().equals(ee.o.f11838d) && o(zVar);
    }
}
