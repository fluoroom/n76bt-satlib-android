package lf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.a;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static final List a(List list) {
        m.e(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a.e.c cVar = (a.e.c) it.next();
            int iD = cVar.D();
            for (int i10 = 0; i10 < iD; i10++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
