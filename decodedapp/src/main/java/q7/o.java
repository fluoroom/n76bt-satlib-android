package q7;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a */
    private static final y7.a f24389a = new y7.a("GoogleSignInCommon", new String[0]);

    public static t7.h a(t7.g gVar, Context context, boolean z10) {
        f24389a.a("Signing out", new Object[0]);
        c(context);
        return z10 ? t7.i.b(Status.f7192f, gVar) : gVar.a(new k(gVar));
    }

    public static t7.h b(t7.g gVar, Context context, boolean z10) {
        f24389a.a("Revoking access", new Object[0]);
        String strE = c.b(context).e();
        c(context);
        return z10 ? f.a(strE) : gVar.a(new m(gVar));
    }

    private static void c(Context context) {
        p.a(context).b();
        Iterator it = t7.g.b().iterator();
        while (it.hasNext()) {
            ((t7.g) it.next()).e();
        }
        u7.e.a();
    }
}
