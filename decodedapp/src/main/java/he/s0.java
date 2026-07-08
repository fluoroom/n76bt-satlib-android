package he;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s0 {
    public static final void a(o0 o0Var, mf.c cVar, Collection collection) {
        rd.m.e(o0Var, "<this>");
        rd.m.e(cVar, "fqName");
        rd.m.e(collection, "packageFragments");
        if (o0Var instanceof t0) {
            ((t0) o0Var).b(cVar, collection);
        } else {
            collection.addAll(o0Var.a(cVar));
        }
    }

    public static final boolean b(o0 o0Var, mf.c cVar) {
        rd.m.e(o0Var, "<this>");
        rd.m.e(cVar, "fqName");
        return o0Var instanceof t0 ? ((t0) o0Var).c(cVar) : c(o0Var, cVar).isEmpty();
    }

    public static final List c(o0 o0Var, mf.c cVar) {
        rd.m.e(o0Var, "<this>");
        rd.m.e(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        a(o0Var, cVar, arrayList);
        return arrayList;
    }
}
