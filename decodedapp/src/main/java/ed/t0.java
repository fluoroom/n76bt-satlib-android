package ed;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 extends s0 {
    public static Set d() {
        return f0.f11759a;
    }

    public static LinkedHashSet e(Object... objArr) {
        rd.m.e(objArr, "elements");
        return (LinkedHashSet) o.d0(objArr, new LinkedHashSet(m0.e(objArr.length)));
    }

    public static final Set f(Set set) {
        rd.m.e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : s0.c(set.iterator().next()) : d();
    }

    public static Set g(Object... objArr) {
        rd.m.e(objArr, "elements");
        return o.w0(objArr);
    }
}
