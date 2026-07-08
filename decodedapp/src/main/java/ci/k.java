package ci;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f4916a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f4917b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f4918c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f4919d = new HashMap();

    public k a(h hVar) {
        String strH = hVar.h();
        if (hVar.t()) {
            this.f4917b.put(hVar.i(), hVar);
        }
        if (hVar.z()) {
            if (this.f4918c.contains(strH)) {
                List list = this.f4918c;
                list.remove(list.indexOf(strH));
            }
            this.f4918c.add(strH);
        }
        this.f4916a.put(strH, hVar);
        return this;
    }

    public h b(String str) {
        String strB = o.b(str);
        return this.f4916a.containsKey(strB) ? (h) this.f4916a.get(strB) : (h) this.f4917b.get(strB);
    }

    public i c(h hVar) {
        android.support.v4.media.session.b.a(this.f4919d.get(hVar.h()));
        return null;
    }

    public List d() {
        return this.f4918c;
    }

    public boolean e(String str) {
        String strB = o.b(str);
        return this.f4916a.containsKey(strB) || this.f4917b.containsKey(strB);
    }

    List f() {
        return new ArrayList(this.f4916a.values());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ Options: [ short ");
        stringBuffer.append(this.f4916a.toString());
        stringBuffer.append(" ] [ long ");
        stringBuffer.append(this.f4917b);
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }
}
