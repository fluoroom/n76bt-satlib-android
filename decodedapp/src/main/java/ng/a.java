package ng;

import java.util.Collection;
import java.util.LinkedHashSet;
import og.j;
import rd.m;
import xf.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final Collection a(Collection collection, Collection collection2) {
        m.e(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final j b(Iterable iterable) {
        m.e(iterable, "scopes");
        j jVar = new j();
        for (Object obj : iterable) {
            k kVar = (k) obj;
            if (kVar != null && kVar != k.b.f32079b) {
                jVar.add(obj);
            }
        }
        return jVar;
    }
}
