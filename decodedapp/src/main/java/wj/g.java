package wj;

import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import yj.g0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static /* synthetic */ double b(SortedSet sortedSet, double d10, pj.d dVar, boolean z10) {
        yj.b date = dVar.getDate();
        double dX = Double.POSITIVE_INFINITY;
        if (!z10) {
            ArrayList arrayList = new ArrayList(sortedSet);
            Collections.reverse(arrayList);
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                yj.b date2 = ((g0) it.next()).getDate();
                if (date.Z(date2)) {
                    dX = date.X(date2);
                    break;
                }
            }
        } else {
            Iterator it2 = sortedSet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                yj.b date3 = ((g0) it2.next()).getDate();
                if (date.a0(date3)) {
                    dX = date3.X(date);
                    break;
                }
            }
        }
        return aj.d.b(dX) + (d10 / 2.0d);
    }

    public static c c(g0... g0VarArr) {
        return (g0VarArr == null || g0VarArr.length < 2) ? f() : b.b(e(g0VarArr) * 0.5d);
    }

    public static c d(g0... g0VarArr) {
        if (g0VarArr == null || g0VarArr.length < 2) {
            return f();
        }
        final double dE = e(g0VarArr);
        final TreeSet treeSet = new TreeSet(new yj.g());
        treeSet.addAll(Arrays.asList(g0VarArr));
        return new c() { // from class: wj.d
            @Override // wj.c
            public final double a(pj.d dVar, boolean z10) {
                return g.b(treeSet, dE, dVar, z10);
            }
        };
    }

    public static double e(g0... g0VarArr) {
        double D = 1.0E10d;
        for (final g0 g0Var : g0VarArr) {
            Optional optionalMin = DesugarArrays.stream(g0VarArr).map(new Function() { // from class: wj.e
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    g0 g0Var2 = g0Var;
                    g0 g0Var3 = (g0) obj;
                    return Double.valueOf(!g0Var3.getDate().c0(g0Var2.getDate()) ? aj.d.b(g0Var3.e(g0Var2)) : Double.POSITIVE_INFINITY);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).min(new Comparator() { // from class: wj.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
            });
            if (optionalMin.isPresent()) {
                D = aj.d.D(D, ((Double) optionalMin.get()).doubleValue());
            }
        }
        return D;
    }

    public static c f() {
        return b.b(1.0E10d);
    }
}
