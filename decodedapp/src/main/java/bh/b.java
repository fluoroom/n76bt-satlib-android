package bh;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f4046a;

    public b(d... dVarArr) {
        this.f4046a = Arrays.asList(dVarArr);
    }

    @Override // bh.d
    public boolean a(c cVar) {
        Iterator it = this.f4046a.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).a(cVar)) {
                return true;
            }
        }
        return false;
    }
}
