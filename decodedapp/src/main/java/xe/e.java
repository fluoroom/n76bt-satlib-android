package xe;

import dd.q;
import eg.r0;
import he.a;
import he.b;
import he.b1;
import he.e0;
import he.f1;
import he.g1;
import he.m;
import he.u;
import he.z;
import java.util.List;
import java.util.Map;
import ke.o0;
import lg.s;

/* JADX INFO: loaded from: classes3.dex */
public class e extends o0 implements xe.a {
    public static final a.InterfaceC0214a P = new a();
    public static final a.InterfaceC0214a Q = new b();
    private c N;
    private final boolean O;

    static class a implements a.InterfaceC0214a {
        a() {
        }
    }

    static class b implements a.InterfaceC0214a {
        b() {
        }
    }

    private enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f32030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f32031b;

        c(boolean z10, boolean z11) {
            this.f32030a = z10;
            this.f32031b = z11;
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        public static c d(boolean z10, boolean z11) {
            c cVar = z10 ? z11 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z11 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                a(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(m mVar, f1 f1Var, ie.h hVar, mf.f fVar, b.a aVar, g1 g1Var, boolean z10) {
        super(mVar, f1Var, hVar, fVar, aVar, g1Var);
        if (mVar == null) {
            K(0);
        }
        if (hVar == null) {
            K(1);
        }
        if (fVar == null) {
            K(2);
        }
        if (aVar == null) {
            K(3);
        }
        if (g1Var == null) {
            K(4);
        }
        this.N = null;
        this.O = z10;
    }

    private static /* synthetic */ void K(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static e p1(m mVar, ie.h hVar, mf.f fVar, g1 g1Var, boolean z10) {
        if (mVar == null) {
            K(5);
        }
        if (hVar == null) {
            K(6);
        }
        if (fVar == null) {
            K(7);
        }
        if (g1Var == null) {
            K(8);
        }
        return new e(mVar, null, hVar, fVar, b.a.DECLARATION, g1Var, z10);
    }

    @Override // ke.s, he.a
    public boolean J() {
        return this.N.f32031b;
    }

    @Override // ke.s
    public boolean Q0() {
        return this.N.f32030a;
    }

    @Override // ke.o0
    public o0 o1(b1 b1Var, b1 b1Var2, List list, List list2, List list3, r0 r0Var, e0 e0Var, u uVar, Map map) {
        if (list == null) {
            K(9);
        }
        if (list2 == null) {
            K(10);
        }
        if (list3 == null) {
            K(11);
        }
        if (uVar == null) {
            K(12);
        }
        o0 o0VarO1 = super.o1(b1Var, b1Var2, list, list2, list3, r0Var, e0Var, uVar, map);
        f1(s.f20613a.a(o0VarO1).a());
        if (o0VarO1 == null) {
            K(13);
        }
        return o0VarO1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ke.o0, ke.s
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public e o1(m mVar, z zVar, b.a aVar, mf.f fVar, ie.h hVar, g1 g1Var) {
        if (mVar == null) {
            K(14);
        }
        if (aVar == null) {
            K(15);
        }
        if (hVar == null) {
            K(16);
        }
        if (g1Var == null) {
            K(17);
        }
        f1 f1Var = (f1) zVar;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(mVar, f1Var, hVar, fVar, aVar, g1Var, this.O);
        eVar.s1(Q0(), J());
        return eVar;
    }

    @Override // xe.a
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public e F(r0 r0Var, List list, r0 r0Var2, q qVar) {
        if (list == null) {
            K(19);
        }
        if (r0Var2 == null) {
            K(20);
        }
        e eVar = (e) u().c(h.a(list, i(), this)).i(r0Var2).p(r0Var == null ? null : qf.h.i(this, r0Var, ie.h.f16054l.b())).a().g().build();
        if (qVar != null) {
            eVar.U0((a.InterfaceC0214a) qVar.c(), qVar.d());
        }
        if (eVar == null) {
            K(21);
        }
        return eVar;
    }

    public void s1(boolean z10, boolean z11) {
        this.N = c.d(z10, z11);
    }
}
