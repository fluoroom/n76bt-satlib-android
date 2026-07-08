package jh;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final List a(List list) {
        rd.m.e(list, "addresses");
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((InetAddress) obj) instanceof Inet6Address) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        dd.q qVar = new dd.q(arrayList, arrayList2);
        List list2 = (List) qVar.a();
        List list3 = (List) qVar.b();
        return (list2.isEmpty() || list3.isEmpty()) ? list : fh.m.v(list2, list3);
    }
}
