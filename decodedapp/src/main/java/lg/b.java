package lg;

import java.util.List;
import lg.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public final g a(he.z zVar) {
        rd.m.e(zVar, "functionDescriptor");
        for (h hVar : b()) {
            if (hVar.b(zVar)) {
                return hVar.a(zVar);
            }
        }
        return g.a.f20586b;
    }

    public abstract List b();
}
