package e1;

import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final s0 a(v0.c cVar, yd.c cVar2, a aVar) {
        m.e(cVar, "factory");
        m.e(cVar2, "modelClass");
        m.e(aVar, "extras");
        try {
            try {
                return cVar.b(cVar2, aVar);
            } catch (AbstractMethodError unused) {
                return cVar.c(pd.a.b(cVar2), aVar);
            }
        } catch (AbstractMethodError unused2) {
            return cVar.a(pd.a.b(cVar2));
        }
    }
}
