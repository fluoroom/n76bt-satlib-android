package gj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f14628a = new ArrayList();

    public void a(d dVar) {
        this.f14628a.add(dVar);
    }

    public h b(h hVar) {
        h hVarA;
        while (true) {
            for (boolean z10 = true; z10; z10 = false) {
                Iterator it = this.f14628a.iterator();
                while (it.hasNext()) {
                    hVarA = ((d) it.next()).a(hVar);
                    if (hVarA != hVar) {
                        break;
                    }
                }
            }
            return hVar;
            hVar = hVarA;
        }
    }

    public void c() {
        this.f14628a.clear();
    }
}
