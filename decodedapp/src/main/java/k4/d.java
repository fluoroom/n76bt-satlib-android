package k4;

import android.content.Context;
import com.dw.ht.utils.NotificationManager;
import d5.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void a(Context context, b bVar) {
        g gVarJ = g.j(context.getContentResolver(), bVar.f19384c);
        if (gVarJ == null) {
            return;
        }
        int i10 = gVarJ.f10639w;
        if (i10 == 4 || i10 == 5) {
            NotificationManager.f6876a.c(context, gVarJ);
        } else {
            NotificationManager.f6876a.d(context, gVarJ);
        }
    }
}
