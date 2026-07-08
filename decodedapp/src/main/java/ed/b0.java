package ed;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 extends z {

    public static final class a implements qg.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f11746a;

        public a(Iterable iterable) {
            this.f11746a = iterable;
        }

        @Override // qg.h
        public Iterator iterator() {
            return this.f11746a.iterator();
        }
    }

    public static List A0(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listJ0 = J0(iterable);
            w.y(listJ0);
            return listJ0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return H0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        m.t((Comparable[]) array);
        return m.d(array);
    }

    public static List B0(Iterable iterable, Comparator comparator) {
        rd.m.e(iterable, "<this>");
        rd.m.e(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listJ0 = J0(iterable);
            w.z(listJ0, comparator);
            return listJ0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return H0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        m.u(array, comparator);
        return m.d(array);
    }

    public static List C0(Iterable iterable, int i10) {
        rd.m.e(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return s.k();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return H0(iterable);
            }
            if (i10 == 1) {
                return r.e(Y(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return s.r(arrayList);
    }

    public static List D0(List list, int i10) {
        rd.m.e(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return s.k();
        }
        int size = list.size();
        if (i10 >= size) {
            return H0(list);
        }
        if (i10 == 1) {
            return r.e(k0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static byte[] E0(Collection collection) {
        rd.m.e(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = ((Number) it.next()).byteValue();
            i10++;
        }
        return bArr;
    }

    public static final Collection F0(Iterable iterable, Collection collection) {
        rd.m.e(iterable, "<this>");
        rd.m.e(collection, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    public static int[] G0(Collection collection) {
        rd.m.e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List H0(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return s.r(J0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return s.k();
        }
        if (size != 1) {
            return K0(collection);
        }
        return r.e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] I0(Collection collection) {
        rd.m.e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public static final List J0(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        return iterable instanceof Collection ? K0((Collection) iterable) : (List) F0(iterable, new ArrayList());
    }

    public static List K0(Collection collection) {
        rd.m.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set L0(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) F0(iterable, new LinkedHashSet());
    }

    public static Set M0(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return t0.f((Set) F0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return t0.d();
        }
        if (size != 1) {
            return (Set) F0(iterable, new LinkedHashSet(m0.e(collection.size())));
        }
        return s0.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static Set N0(Iterable iterable, Iterable iterable2) {
        rd.m.e(iterable, "<this>");
        rd.m.e(iterable2, "other");
        Set setL0 = L0(iterable);
        x.A(setL0, iterable2);
        return setL0;
    }

    public static Iterable O0(final Iterable iterable) {
        rd.m.e(iterable, "<this>");
        return new h0(new qd.a() { // from class: ed.a0
            @Override // qd.a
            public final Object a() {
                return b0.P0(iterable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator P0(Iterable iterable) {
        return iterable.iterator();
    }

    public static List Q0(Iterable iterable, Iterable iterable2) {
        rd.m.e(iterable, "<this>");
        rd.m.e(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(t.v(iterable, 10), t.v(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(dd.w.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static boolean R(Iterable iterable, qd.l lVar) {
        rd.m.e(iterable, "<this>");
        rd.m.e(lVar, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!((Boolean) lVar.l(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static qg.h S(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        return new a(iterable);
    }

    public static boolean T(Iterable iterable, Object obj) {
        rd.m.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : d0(iterable, obj) >= 0;
    }

    public static List U(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        return H0(L0(iterable));
    }

    public static List V(Iterable iterable, int i10) {
        ArrayList arrayList;
        rd.m.e(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return H0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return s.k();
            }
            if (size == 1) {
                return r.e(j0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (Object obj : iterable) {
            if (i11 >= i10) {
                arrayList.add(obj);
            } else {
                i11++;
            }
        }
        return s.r(arrayList);
    }

    public static List W(List list, int i10) {
        rd.m.e(list, "<this>");
        if (i10 >= 0) {
            return C0(list, xd.d.b(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static List X(Iterable iterable, qd.l lVar) {
        rd.m.e(iterable, "<this>");
        rd.m.e(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) lVar.l(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object Y(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        if (iterable instanceof List) {
            return Z((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object Z(List list) {
        rd.m.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object a0(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object b0(List list) {
        rd.m.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object c0(List list, int i10) {
        rd.m.e(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static final int d0(Iterable iterable, Object obj) {
        rd.m.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                s.u();
            }
            if (rd.m.a(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static Set e0(Iterable iterable, Iterable iterable2) {
        rd.m.e(iterable, "<this>");
        rd.m.e(iterable2, "other");
        Set setL0 = L0(iterable);
        x.H(setL0, iterable2);
        return setL0;
    }

    public static final Appendable f0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qd.l lVar) throws IOException {
        rd.m.e(iterable, "<this>");
        rd.m.e(appendable, "buffer");
        rd.m.e(charSequence, "separator");
        rd.m.e(charSequence2, "prefix");
        rd.m.e(charSequence3, "postfix");
        rd.m.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            rg.q.a(appendable, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String h0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qd.l lVar) {
        rd.m.e(iterable, "<this>");
        rd.m.e(charSequence, "separator");
        rd.m.e(charSequence2, "prefix");
        rd.m.e(charSequence3, "postfix");
        rd.m.e(charSequence4, "truncated");
        return ((StringBuilder) f0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String i0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qd.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        qd.l lVar2 = lVar;
        return h0(iterable, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static Object j0(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        if (iterable instanceof List) {
            return k0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object k0(List list) {
        rd.m.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(s.m(list));
    }

    public static Object l0(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object m0(List list) {
        rd.m.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static List n0(Iterable iterable, qd.l lVar) {
        rd.m.e(iterable, "<this>");
        rd.m.e(lVar, "transform");
        ArrayList arrayList = new ArrayList(t.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(lVar.l(it.next()));
        }
        return arrayList;
    }

    public static Comparable o0(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List p0(Iterable iterable, Object obj) {
        rd.m.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList(t.v(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && rd.m.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List q0(Iterable iterable, Iterable iterable2) {
        rd.m.e(iterable, "<this>");
        rd.m.e(iterable2, "elements");
        if (iterable instanceof Collection) {
            return s0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        x.A(arrayList, iterable);
        x.A(arrayList, iterable2);
        return arrayList;
    }

    public static List r0(Iterable iterable, Object obj) {
        rd.m.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return t0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        x.A(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static List s0(Collection collection, Iterable iterable) {
        rd.m.e(collection, "<this>");
        rd.m.e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            x.A(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List t0(Collection collection, Object obj) {
        rd.m.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List u0(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return H0(iterable);
        }
        List listJ0 = J0(iterable);
        z.P(listJ0);
        return listJ0;
    }

    public static Object v0(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        if (iterable instanceof List) {
            return w0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object w0(List list) {
        rd.m.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object x0(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object y0(List list) {
        rd.m.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List z0(List list, xd.c cVar) {
        rd.m.e(list, "<this>");
        rd.m.e(cVar, "indices");
        return cVar.isEmpty() ? s.k() : H0(list.subList(cVar.h().intValue(), cVar.g().intValue() + 1));
    }
}
