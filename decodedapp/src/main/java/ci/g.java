package ci;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f4905a;

    public g(String str) {
        super(str);
    }

    private static String a(List list) {
        StringBuffer stringBuffer = new StringBuffer("Missing required option");
        stringBuffer.append(list.size() == 1 ? "" : "s");
        stringBuffer.append(": ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    public g(List list) {
        this(a(list));
        this.f4905a = list;
    }
}
