package ed;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    public static List a(List list) {
        rd.m.e(list, "builder");
        return ((fd.b) list).s();
    }

    public static final Object[] b(Object[] objArr, boolean z10) {
        rd.m.e(objArr, "<this>");
        if (z10 && rd.m.a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        rd.m.d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List c() {
        return new fd.b(0, 1, null);
    }

    public static List d(int i10) {
        return new fd.b(i10);
    }

    public static List e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        rd.m.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static Object[] f(int i10, Object[] objArr) {
        rd.m.e(objArr, "array");
        if (i10 < objArr.length) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
