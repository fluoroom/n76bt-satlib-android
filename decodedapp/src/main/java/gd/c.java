package gd;

import java.util.Comparator;
import qd.l;
import rd.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static Comparator b(final l... lVarArr) {
        m.e(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            return new Comparator() { // from class: gd.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return c.c(lVarArr, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(l[] lVarArr, Object obj, Object obj2) {
        return e(obj, obj2, lVarArr);
    }

    public static int d(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    private static final int e(Object obj, Object obj2, l[] lVarArr) {
        for (l lVar : lVarArr) {
            int iD = d((Comparable) lVar.l(obj), (Comparable) lVar.l(obj2));
            if (iD != 0) {
                return iD;
            }
        }
        return 0;
    }

    public static Comparator f() {
        f fVar = f.f13790a;
        m.c(fVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return fVar;
    }
}
