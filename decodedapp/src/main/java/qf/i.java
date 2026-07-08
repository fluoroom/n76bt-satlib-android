package qf;

import eg.i2;
import eg.r0;
import eg.u1;
import eg.v0;
import he.a1;
import he.b;
import he.b1;
import he.e0;
import he.h0;
import he.h1;
import he.n0;
import he.t1;
import he.u0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a */
    public static final mf.c f25129a = new mf.c("kotlin.jvm.JvmName");

    public static boolean A(he.m mVar) {
        return D(mVar, he.f.f15273d);
    }

    public static boolean B(he.m mVar) {
        if (mVar == null) {
            a(36);
        }
        return D(mVar, he.f.f15274e);
    }

    public static boolean C(he.m mVar) {
        return D(mVar, he.f.f15272c);
    }

    private static boolean D(he.m mVar, he.f fVar) {
        if (fVar == null) {
            a(37);
        }
        return (mVar instanceof he.e) && ((he.e) mVar).j() == fVar;
    }

    public static boolean E(he.m mVar) {
        if (mVar == null) {
            a(1);
        }
        while (mVar != null) {
            if (u(mVar) || y(mVar)) {
                return true;
            }
            mVar = mVar.b();
        }
        return false;
    }

    private static boolean F(r0 r0Var, he.m mVar) {
        if (r0Var == null) {
            a(30);
        }
        if (mVar == null) {
            a(31);
        }
        he.h hVarQ = r0Var.N0().q();
        if (hVarQ == null) {
            return false;
        }
        he.m mVarA = hVarQ.a();
        return (mVarA instanceof he.h) && (mVar instanceof he.h) && ((he.h) mVar).k().equals(((he.h) mVarA).k());
    }

    public static boolean G(he.m mVar) {
        return (D(mVar, he.f.f15271b) || D(mVar, he.f.f15272c)) && ((he.e) mVar).l() == e0.f15260c;
    }

    public static boolean H(he.e eVar, he.e eVar2) {
        if (eVar == null) {
            a(28);
        }
        if (eVar2 == null) {
            a(29);
        }
        return I(eVar.s(), eVar2.a());
    }

    public static boolean I(r0 r0Var, he.m mVar) {
        if (r0Var == null) {
            a(32);
        }
        if (mVar == null) {
            a(33);
        }
        if (F(r0Var, mVar)) {
            return true;
        }
        Iterator it = r0Var.N0().e().iterator();
        while (it.hasNext()) {
            if (I((r0) it.next(), mVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(he.m mVar) {
        return mVar != null && (mVar.b() instanceof n0);
    }

    public static boolean K(t1 t1Var, r0 r0Var) {
        if (t1Var == null) {
            a(65);
        }
        if (r0Var == null) {
            a(66);
        }
        if (t1Var.j0() || v0.a(r0Var)) {
            return false;
        }
        if (i2.b(r0Var)) {
            return true;
        }
        ee.i iVarM = uf.e.m(t1Var);
        if (!ee.i.t0(r0Var)) {
            fg.e eVar = fg.e.f13057a;
            if (!eVar.c(iVarM.X(), r0Var) && !eVar.c(iVarM.L().s(), r0Var) && !eVar.c(iVarM.i(), r0Var) && !ee.s.d(r0Var)) {
                return false;
            }
        }
        return true;
    }

    public static he.b L(he.b bVar) {
        if (bVar == null) {
            a(58);
        }
        while (bVar.j() == b.a.FAKE_OVERRIDE) {
            Collection collectionE = bVar.e();
            if (collectionE.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + bVar);
            }
            bVar = (he.b) collectionE.iterator().next();
        }
        return bVar;
    }

    public static he.q M(he.q qVar) {
        if (qVar == null) {
            a(63);
        }
        if (qVar instanceof he.b) {
            return L((he.b) qVar);
        }
        if (qVar == null) {
            a(64);
        }
        return qVar;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(he.m mVar, he.m mVar2) {
        if (mVar == null) {
            a(16);
        }
        if (mVar2 == null) {
            a(17);
        }
        return g(mVar).equals(g(mVar2));
    }

    private static void c(he.a aVar, Set set) {
        if (aVar == null) {
            a(72);
        }
        if (set == null) {
            a(73);
        }
        if (set.contains(aVar)) {
            return;
        }
        Iterator it = aVar.a().e().iterator();
        while (it.hasNext()) {
            he.a aVarA = ((he.a) it.next()).a();
            c(aVarA, set);
            set.add(aVarA);
        }
    }

    public static Set d(he.a aVar) {
        if (aVar == null) {
            a(70);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(aVar.a(), linkedHashSet);
        return linkedHashSet;
    }

    public static he.e e(r0 r0Var) {
        if (r0Var == null) {
            a(45);
        }
        return f(r0Var.N0());
    }

    public static he.e f(u1 u1Var) {
        if (u1Var == null) {
            a(46);
        }
        he.e eVar = (he.e) u1Var.q();
        if (eVar == null) {
            a(47);
        }
        return eVar;
    }

    public static h0 g(he.m mVar) {
        if (mVar == null) {
            a(21);
        }
        h0 h0VarI = i(mVar);
        if (h0VarI == null) {
            a(22);
        }
        return h0VarI;
    }

    public static h0 h(r0 r0Var) {
        if (r0Var == null) {
            a(20);
        }
        he.h hVarQ = r0Var.N0().q();
        if (hVarQ == null) {
            return null;
        }
        return i(hVarQ);
    }

    public static h0 i(he.m mVar) {
        if (mVar == null) {
            a(23);
        }
        while (mVar != null) {
            if (mVar instanceof h0) {
                return (h0) mVar;
            }
            if (mVar instanceof u0) {
                return ((u0) mVar).v0();
            }
            mVar = mVar.b();
        }
        return null;
    }

    public static h1 j(he.m mVar) {
        if (mVar == null) {
            a(81);
        }
        if (mVar instanceof a1) {
            mVar = ((a1) mVar).C0();
        }
        if (mVar instanceof he.p) {
            h1 h1VarA = ((he.p) mVar).getSource().a();
            if (h1VarA == null) {
                a(82);
            }
            return h1VarA;
        }
        h1 h1Var = h1.f15282a;
        if (h1Var == null) {
            a(83);
        }
        return h1Var;
    }

    public static he.u k(he.e eVar, boolean z10) {
        if (eVar == null) {
            a(48);
        }
        he.f fVarJ = eVar.j();
        if (fVarJ == he.f.f15273d || fVarJ.d()) {
            he.u uVar = he.t.f15305a;
            if (uVar == null) {
                a(49);
            }
            return uVar;
        }
        if (G(eVar)) {
            if (z10) {
                he.u uVar2 = he.t.f15307c;
                if (uVar2 == null) {
                    a(50);
                }
                return uVar2;
            }
            he.u uVar3 = he.t.f15305a;
            if (uVar3 == null) {
                a(51);
            }
            return uVar3;
        }
        if (u(eVar)) {
            he.u uVar4 = he.t.f15316l;
            if (uVar4 == null) {
                a(52);
            }
            return uVar4;
        }
        he.u uVar5 = he.t.f15309e;
        if (uVar5 == null) {
            a(53);
        }
        return uVar5;
    }

    public static b1 l(he.m mVar) {
        if (mVar == null) {
            a(0);
        }
        if (mVar instanceof he.e) {
            return ((he.e) mVar).J0();
        }
        return null;
    }

    public static mf.d m(he.m mVar) {
        if (mVar == null) {
            a(2);
        }
        mf.c cVarO = o(mVar);
        return cVarO != null ? cVarO.i() : p(mVar);
    }

    public static mf.c n(he.m mVar) {
        if (mVar == null) {
            a(3);
        }
        mf.c cVarO = o(mVar);
        if (cVarO == null) {
            cVarO = p(mVar).m();
        }
        if (cVarO == null) {
            a(4);
        }
        return cVarO;
    }

    private static mf.c o(he.m mVar) {
        if (mVar == null) {
            a(5);
        }
        if ((mVar instanceof h0) || gg.l.m(mVar)) {
            return mf.c.f21994d;
        }
        if (mVar instanceof u0) {
            return ((u0) mVar).d();
        }
        if (mVar instanceof n0) {
            return ((n0) mVar).d();
        }
        return null;
    }

    private static mf.d p(he.m mVar) {
        if (mVar == null) {
            a(6);
        }
        mf.d dVarB = m(mVar.b()).b(mVar.getName());
        if (dVarB == null) {
            a(7);
        }
        return dVarB;
    }

    public static he.m q(he.m mVar, Class cls) {
        if (cls == null) {
            a(18);
        }
        return r(mVar, cls, true);
    }

    public static he.m r(he.m mVar, Class cls, boolean z10) {
        if (cls == null) {
            a(19);
        }
        if (mVar == null) {
            return null;
        }
        if (z10) {
            mVar = mVar.b();
        }
        while (mVar != null) {
            if (cls.isInstance(mVar)) {
                return mVar;
            }
            mVar = mVar.b();
        }
        return null;
    }

    public static he.e s(he.e eVar) {
        if (eVar == null) {
            a(44);
        }
        Iterator it = eVar.k().e().iterator();
        while (it.hasNext()) {
            he.e eVarE = e((r0) it.next());
            if (eVarE.j() != he.f.f15272c) {
                return eVarE;
            }
        }
        return null;
    }

    public static boolean t(he.m mVar) {
        return D(mVar, he.f.f15275f);
    }

    public static boolean u(he.m mVar) {
        if (mVar == null) {
            a(34);
        }
        return v(mVar) && mVar.getName().equals(mf.h.f22011b);
    }

    public static boolean v(he.m mVar) {
        return D(mVar, he.f.f15271b);
    }

    public static boolean w(he.m mVar) {
        return v(mVar) || A(mVar);
    }

    public static boolean x(he.m mVar) {
        return D(mVar, he.f.f15276g) && ((he.e) mVar).B();
    }

    public static boolean y(he.m mVar) {
        return (mVar instanceof he.q) && ((he.q) mVar).getVisibility() == he.t.f15310f;
    }

    public static boolean z(he.e eVar, he.e eVar2) {
        if (eVar == null) {
            a(26);
        }
        if (eVar2 == null) {
            a(27);
        }
        Iterator it = eVar.k().e().iterator();
        while (it.hasNext()) {
            if (F((r0) it.next(), eVar2.a())) {
                return true;
            }
        }
        return false;
    }
}
