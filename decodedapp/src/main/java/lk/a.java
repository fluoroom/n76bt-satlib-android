package lk;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: lk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0278a {
        boolean a(Object obj);
    }

    public static void a(List list, List list2, InterfaceC0278a interfaceC0278a) {
        if (interfaceC0278a == null) {
            list2.addAll(list);
            return;
        }
        for (Object obj : list) {
            if (interfaceC0278a.a(obj)) {
                list2.add(obj);
            }
        }
    }

    public static void b(Object[] objArr, List list, InterfaceC0278a interfaceC0278a) {
        a(Arrays.asList(objArr), list, interfaceC0278a);
    }

    public static void c(List list, InterfaceC0278a interfaceC0278a) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (interfaceC0278a.a(it.next())) {
                it.remove();
            }
        }
    }
}
