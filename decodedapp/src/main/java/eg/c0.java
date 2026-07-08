package eg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {
    private static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static f2 b(List list, d2 d2Var, he.m mVar, List list2) {
        if (list == null) {
            a(0);
        }
        if (d2Var == null) {
            a(1);
        }
        if (mVar == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        f2 f2VarC = c(list, d2Var, mVar, list2, null);
        if (f2VarC != null) {
            return f2VarC;
        }
        throw new AssertionError("Substitution failed");
    }

    public static f2 c(List list, d2 d2Var, he.m mVar, List list2, boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (d2Var == null) {
            a(6);
        }
        if (mVar == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            he.l1 l1Var = (he.l1) it.next();
            ke.t0 t0VarP0 = ke.t0.P0(mVar, l1Var.getAnnotations(), l1Var.I(), l1Var.n(), l1Var.getName(), i10, he.g1.f15281a, l1Var.i0());
            map.put(l1Var.k(), new c2(t0VarP0.s()));
            map2.put(l1Var, t0VarP0);
            list2.add(t0VarP0);
            i10++;
        }
        v1 v1VarJ = v1.j(map);
        f2 f2VarH = f2.h(d2Var, v1VarJ);
        f2 f2VarH2 = f2.h(d2Var.h(), v1VarJ);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            he.l1 l1Var2 = (he.l1) it2.next();
            ke.t0 t0Var = (ke.t0) map2.get(l1Var2);
            for (r0 r0Var : l1Var2.getUpperBounds()) {
                he.h hVarQ = r0Var.N0().q();
                r0 r0VarP = (((hVarQ instanceof he.l1) && jg.d.p((he.l1) hVarQ)) ? f2VarH : f2VarH2).p(r0Var, m2.f12142g);
                if (r0VarP == null) {
                    return null;
                }
                if (r0VarP != r0Var && zArr != null) {
                    zArr[0] = true;
                }
                t0Var.M0(r0VarP);
            }
            t0Var.V0();
        }
        return f2VarH;
    }
}
