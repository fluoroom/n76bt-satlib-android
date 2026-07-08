package ci;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f4893a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f4894b = new ArrayList();

    a() {
    }

    private h e(String str) {
        String strB = o.b(str);
        for (h hVar : this.f4894b) {
            if (strB.equals(hVar.j()) || strB.equals(hVar.i())) {
                return hVar;
            }
        }
        return null;
    }

    void a(String str) {
        this.f4893a.add(str);
    }

    void b(h hVar) {
        this.f4894b.add(hVar);
    }

    public List c() {
        return this.f4893a;
    }

    public boolean d(String str) {
        return this.f4894b.contains(e(str));
    }
}
