package ed;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y extends x {
    public static List L(List list) {
        rd.m.e(list, "<this>");
        return new q0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M(List list, int i10) {
        if (i10 >= 0 && i10 <= s.m(list)) {
            return s.m(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new xd.c(0, s.m(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int N(List list, int i10) {
        return s.m(list) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O(List list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new xd.c(0, list.size()) + "].");
    }
}
