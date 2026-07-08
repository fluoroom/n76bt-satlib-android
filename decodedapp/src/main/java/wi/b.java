package wi;

import ui.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static c a(c cVar) {
        double dI = cVar.I();
        if (dI != 0.0d) {
            return cVar.U(1.0d / dI);
        }
        throw new g(a.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR, new Object[0]);
    }
}
