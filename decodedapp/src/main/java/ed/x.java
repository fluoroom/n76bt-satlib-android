package ed;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends w {
    public static boolean A(Collection collection, Iterable iterable) {
        rd.m.e(collection, "<this>");
        rd.m.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean B(Collection collection, Object[] objArr) {
        rd.m.e(collection, "<this>");
        rd.m.e(objArr, "elements");
        return collection.addAll(m.d(objArr));
    }

    public static final Collection C(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : b0.H0(iterable);
    }

    private static final boolean D(Iterable iterable, qd.l lVar, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.l(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static Object E(List list) {
        rd.m.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(s.m(list));
    }

    public static Object F(List list) {
        rd.m.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(s.m(list));
    }

    public static boolean G(Iterable iterable, qd.l lVar) {
        rd.m.e(iterable, "<this>");
        rd.m.e(lVar, "predicate");
        return D(iterable, lVar, false);
    }

    public static final boolean H(Collection collection, Iterable iterable) {
        rd.m.e(collection, "<this>");
        rd.m.e(iterable, "elements");
        return collection.retainAll(C(iterable));
    }
}
