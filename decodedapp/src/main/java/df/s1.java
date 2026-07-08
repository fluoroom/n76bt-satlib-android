package df;

import eg.g2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s1 {
    public static final h a(h hVar, Collection collection, boolean z10, boolean z11, boolean z12) {
        k kVarE;
        rd.m.e(hVar, "<this>");
        rd.m.e(collection, "superQualifiers");
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k kVarB = b((h) it.next());
            if (kVarB != null) {
                arrayList.add(kVarB);
            }
        }
        k kVarE2 = e(ed.q.M0(arrayList), b(hVar), z10);
        if (kVarE2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                k kVarF = ((h) it2.next()).f();
                if (kVarF != null) {
                    arrayList2.add(kVarF);
                }
            }
            kVarE = e(ed.q.M0(arrayList2), hVar.f(), z10);
        } else {
            kVarE = kVarE2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = collection.iterator();
        while (it3.hasNext()) {
            i iVarE = ((h) it3.next()).e();
            if (iVarE != null) {
                arrayList3.add(iVarE);
            }
        }
        i iVar = (i) f(ed.q.M0(arrayList3), i.f10989b, i.f10988a, hVar.e(), z10);
        if (kVarE == null || z12 || (z11 && kVarE == k.f10998b)) {
            kVarE = null;
        }
        boolean z13 = false;
        boolean z14 = kVarE != null && kVarE2 == null;
        if (kVarE == k.f10999c) {
            if (d(hVar, z14)) {
                z13 = true;
                break;
            }
            if (!collection.isEmpty()) {
                Iterator it4 = collection.iterator();
                while (it4.hasNext()) {
                    if (d((h) it4.next(), z14)) {
                        z13 = true;
                        break;
                    }
                }
            }
        }
        return new h(kVarE, iVar, z13, z14);
    }

    private static final k b(h hVar) {
        if (hVar.g()) {
            return null;
        }
        return hVar.f();
    }

    public static final boolean c(g2 g2Var, ig.i iVar) {
        rd.m.e(g2Var, "<this>");
        rd.m.e(iVar, "type");
        mf.c cVar = ve.j0.f30620v;
        rd.m.d(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        return g2Var.j(iVar, cVar);
    }

    private static final boolean d(h hVar, boolean z10) {
        return hVar.g() == z10 && hVar.d();
    }

    private static final k e(Set set, k kVar, boolean z10) {
        k kVar2 = k.f10997a;
        return kVar == kVar2 ? kVar2 : (k) f(set, k.f10999c, k.f10998b, kVar, z10);
    }

    private static final Object f(Set set, Object obj, Object obj2, Object obj3, boolean z10) {
        Set setM0;
        if (!z10) {
            if (obj3 != null && (setM0 = ed.q.M0(ed.r0.k(set, obj3))) != null) {
                set = setM0;
            }
            return ed.q.x0(set);
        }
        Object obj4 = set.contains(obj) ? obj : set.contains(obj2) ? obj2 : null;
        if (rd.m.a(obj4, obj) && rd.m.a(obj3, obj2)) {
            return null;
        }
        return obj3 == null ? obj4 : obj3;
    }
}
