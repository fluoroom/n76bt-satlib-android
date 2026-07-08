package qb;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 {
    public static void a(w0 w0Var) {
        Iterator it = p.b().a().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public static boolean b() {
        return p.b().c();
    }
}
