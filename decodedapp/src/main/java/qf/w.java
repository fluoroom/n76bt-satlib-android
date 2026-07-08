package qf;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {
    public static final he.b a(Collection collection) {
        Integer numD;
        rd.m.e(collection, "descriptors");
        collection.isEmpty();
        Iterator it = collection.iterator();
        he.b bVar = null;
        while (it.hasNext()) {
            he.b bVar2 = (he.b) it.next();
            if (bVar == null || ((numD = he.t.d(bVar.getVisibility(), bVar2.getVisibility())) != null && numD.intValue() < 0)) {
                bVar = bVar2;
            }
        }
        rd.m.b(bVar);
        return bVar;
    }
}
