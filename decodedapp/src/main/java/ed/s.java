package ed;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s extends r {
    public static final Collection g(Object[] objArr, boolean z10) {
        rd.m.e(objArr, "<this>");
        return new h(objArr, z10);
    }

    public static /* synthetic */ Collection h(Object[] objArr, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return g(objArr, z10);
    }

    public static final int i(List list, Comparable comparable, int i10, int i11) {
        rd.m.e(list, "<this>");
        s(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iD = gd.a.d((Comparable) list.get(i13), comparable);
            if (iD < 0) {
                i10 = i13 + 1;
            } else {
                if (iD <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int j(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return i(list, comparable, i10, i11);
    }

    public static List k() {
        return d0.f11757a;
    }

    public static xd.c l(Collection collection) {
        rd.m.e(collection, "<this>");
        return new xd.c(0, collection.size() - 1);
    }

    public static int m(List list) {
        rd.m.e(list, "<this>");
        return list.size() - 1;
    }

    public static List n(Object... objArr) {
        rd.m.e(objArr, "elements");
        return objArr.length > 0 ? m.d(objArr) : k();
    }

    public static List o(Object obj) {
        return obj != null ? r.e(obj) : k();
    }

    public static List p(Object... objArr) {
        rd.m.e(objArr, "elements");
        return o.B(objArr);
    }

    public static List q(Object... objArr) {
        rd.m.e(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(g(objArr, true));
    }

    public static final List r(List list) {
        rd.m.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : r.e(list.get(0)) : k();
    }

    private static final void s(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    public static void t() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void u() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
