package k2;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19105a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f19106b = new HashMap();

    s() {
    }

    private Map b(boolean z10) {
        return z10 ? this.f19106b : this.f19105a;
    }

    l a(i2.f fVar, boolean z10) {
        return (l) b(z10).get(fVar);
    }

    void c(i2.f fVar, l lVar) {
        b(lVar.p()).put(fVar, lVar);
    }

    void d(i2.f fVar, l lVar) {
        Map mapB = b(lVar.p());
        if (lVar.equals(mapB.get(fVar))) {
            mapB.remove(fVar);
        }
    }
}
