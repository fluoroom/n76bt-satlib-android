package xf;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {
    public static final Set a(Iterable iterable) {
        rd.m.e(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setF = ((k) it.next()).f();
            if (setF == null) {
                return null;
            }
            ed.q.A(hashSet, setF);
        }
        return hashSet;
    }
}
