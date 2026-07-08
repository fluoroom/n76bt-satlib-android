package eg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k1 {

    public static final class a extends v1 {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ List f12125d;

        a(List list) {
            this.f12125d = list;
        }

        @Override // eg.v1
        public a2 k(u1 u1Var) {
            rd.m.e(u1Var, "key");
            if (!this.f12125d.contains(u1Var)) {
                return null;
            }
            he.h hVarQ = u1Var.q();
            rd.m.c(hVarQ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return i2.s((he.l1) hVarQ);
        }
    }

    private static final r0 a(List list, List list2, ee.i iVar) {
        r0 r0VarP = f2.g(new a(list)).p((r0) ed.q.Z(list2), m2.f12142g);
        if (r0VarP != null) {
            return r0VarP;
        }
        c1 c1VarZ = iVar.z();
        rd.m.d(c1VarZ, "getDefaultBound(...)");
        return c1VarZ;
    }

    public static final r0 b(he.l1 l1Var) {
        rd.m.e(l1Var, "<this>");
        he.m mVarB = l1Var.b();
        rd.m.d(mVarB, "getContainingDeclaration(...)");
        if (mVarB instanceof he.i) {
            List parameters = ((he.i) mVarB).k().getParameters();
            rd.m.d(parameters, "getParameters(...)");
            ArrayList arrayList = new ArrayList(ed.q.v(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                u1 u1VarK = ((he.l1) it.next()).k();
                rd.m.d(u1VarK, "getTypeConstructor(...)");
                arrayList.add(u1VarK);
            }
            List upperBounds = l1Var.getUpperBounds();
            rd.m.d(upperBounds, "getUpperBounds(...)");
            return a(arrayList, upperBounds, uf.e.m(l1Var));
        }
        if (!(mVarB instanceof he.z)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((he.z) mVarB).getTypeParameters();
        rd.m.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(ed.q.v(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            u1 u1VarK2 = ((he.l1) it2.next()).k();
            rd.m.d(u1VarK2, "getTypeConstructor(...)");
            arrayList2.add(u1VarK2);
        }
        List upperBounds2 = l1Var.getUpperBounds();
        rd.m.d(upperBounds2, "getUpperBounds(...)");
        return a(arrayList2, upperBounds2, uf.e.m(l1Var));
    }
}
