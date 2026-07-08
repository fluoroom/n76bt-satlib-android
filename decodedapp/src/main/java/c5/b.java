package c5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ void a(com.dw.ht.map.ui.a aVar, ArrayList arrayList, Long l10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onOverlaysChanged");
        }
        if ((i10 & 2) != 0) {
            l10 = null;
        }
        aVar.n(arrayList, l10);
    }
}
