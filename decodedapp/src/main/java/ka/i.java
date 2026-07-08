package ka;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class i extends h {
    public i(ArrayList arrayList) {
        super(f(arrayList));
    }

    private static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList == null) {
            throw new IllegalArgumentException("Tracks cannot be null");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((q) it.next());
        }
        return arrayList2;
    }
}
