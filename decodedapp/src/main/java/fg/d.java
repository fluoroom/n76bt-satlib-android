package fg;

import eg.c1;
import eg.e0;
import eg.i0;
import eg.l0;
import eg.l2;
import eg.u0;
import eg.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final l2 a(Collection collection) {
        c1 c1VarV0;
        rd.m.e(collection, "types");
        int size = collection.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (l2) ed.q.v0(collection);
        }
        ArrayList arrayList = new ArrayList(ed.q.v(collection, 10));
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            l2 l2Var = (l2) it.next();
            z10 = z10 || v0.a(l2Var);
            if (l2Var instanceof c1) {
                c1VarV0 = (c1) l2Var;
            } else {
                if (!(l2Var instanceof i0)) {
                    throw new dd.o();
                }
                if (e0.a(l2Var)) {
                    return l2Var;
                }
                c1VarV0 = ((i0) l2Var).V0();
                z11 = true;
            }
            arrayList.add(c1VarV0);
        }
        if (z10) {
            return gg.l.d(gg.k.D0, collection.toString());
        }
        if (!z11) {
            return z.f13089a.d(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(ed.q.v(collection, 10));
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList2.add(l0.d((l2) it2.next()));
        }
        z zVar = z.f13089a;
        return u0.e(zVar.d(arrayList), zVar.d(arrayList2));
    }
}
