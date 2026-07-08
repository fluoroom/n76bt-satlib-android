package fc;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static void a(Set set, a aVar) {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.equals(aVar)) {
                    set.remove(aVar2);
                } else if (aVar2 instanceof g) {
                    a aVarA = aVar2;
                    while (aVarA instanceof g) {
                        aVarA = ((g) aVarA).a();
                    }
                    if (aVarA == null || aVarA.equals(aVar)) {
                        set.remove(aVar2);
                    }
                }
            }
        }
    }
}
