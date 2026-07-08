package ed;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 extends t0 {
    public static Set h(Set set, Iterable iterable) {
        rd.m.e(set, "<this>");
        rd.m.e(iterable, "elements");
        Collection<?> collectionC = x.C(iterable);
        if (collectionC.isEmpty()) {
            return b0.M0(set);
        }
        if (!(collectionC instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionC);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionC).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Set i(Set set, Object obj) {
        rd.m.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.e(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && rd.m.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set j(Set set, Iterable iterable) {
        int size;
        rd.m.e(set, "<this>");
        rd.m.e(iterable, "elements");
        Integer numW = t.w(iterable);
        if (numW != null) {
            size = set.size() + numW.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.e(size));
        linkedHashSet.addAll(set);
        x.A(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static Set k(Set set, Object obj) {
        rd.m.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
