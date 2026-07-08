package uj;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;
import yj.g0;
import zj.a1;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class j {
    public static d a(k kVar, g0... g0VarArr) {
        wj.c cVarD = wj.g.d(g0VarArr);
        d dVar = (d) ((d) ((d) new d(new g0[0]).v(cVarD)).B(wj.g.e(g0VarArr) / 2.0d).w(1.0E-10d)).u(new vj.c());
        TreeSet treeSet = new TreeSet(new yj.g());
        treeSet.addAll((Collection) DesugarArrays.stream(g0VarArr).map(new Function() { // from class: uj.i
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((g0) obj).getDate();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList()));
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            dVar.y((yj.b) it.next());
        }
        return dVar;
    }

    public static Stream b(k kVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(Arrays.asList(((a1) it.next()).c()));
        }
        return arrayList.isEmpty() ? Stream.CC.empty() : Stream.CC.of(kVar.b((g0[]) arrayList.toArray(new g0[0])));
    }
}
