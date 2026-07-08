package xe;

import dd.q;
import eg.r0;
import he.g1;
import he.s1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ke.u0;
import rd.m;
import xf.k;
import ze.z0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static final List a(Collection collection, Collection collection2, he.a aVar) {
        m.e(collection, "newValueParameterTypes");
        m.e(collection2, "oldValueParameters");
        m.e(aVar, "newOwner");
        collection.size();
        collection2.size();
        List<q> listQ0 = ed.q.Q0(collection, collection2);
        ArrayList arrayList = new ArrayList(ed.q.v(listQ0, 10));
        for (q qVar : listQ0) {
            r0 r0Var = (r0) qVar.a();
            s1 s1Var = (s1) qVar.b();
            int index = s1Var.getIndex();
            ie.h annotations = s1Var.getAnnotations();
            mf.f name = s1Var.getName();
            m.d(name, "getName(...)");
            boolean zU0 = s1Var.u0();
            boolean zB0 = s1Var.b0();
            boolean Z = s1Var.Z();
            r0 r0VarK = s1Var.k0() != null ? uf.e.s(aVar).o().k(r0Var) : null;
            g1 source = s1Var.getSource();
            m.d(source, "getSource(...)");
            arrayList.add(new u0(aVar, null, index, annotations, name, r0Var, zU0, zB0, Z, r0VarK, source));
        }
        return arrayList;
    }

    public static final z0 b(he.e eVar) {
        m.e(eVar, "<this>");
        he.e eVarX = uf.e.x(eVar);
        if (eVarX == null) {
            return null;
        }
        k kVarU = eVarX.U();
        z0 z0Var = kVarU instanceof z0 ? (z0) kVarU : null;
        return z0Var == null ? b(eVarX) : z0Var;
    }
}
