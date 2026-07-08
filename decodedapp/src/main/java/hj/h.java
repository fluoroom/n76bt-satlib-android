package hj;

import java.util.Iterator;
import java.util.List;
import zj.a1;

/* JADX INFO: loaded from: classes3.dex */
public class h extends a {
    public h(String str, List list) {
        super(f.UNSUPPORTED_PARAMETER_NAME, str, d(list));
    }

    private static String d(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a1 a1Var = (a1) it.next();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(a1Var.a());
        }
        if (sb2.length() == 0) {
            sb2.append("<none>");
        }
        return sb2.toString();
    }
}
