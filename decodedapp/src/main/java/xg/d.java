package xg;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final void a(hd.i iVar, Throwable th2) {
        Iterator it = c.a().iterator();
        while (it.hasNext()) {
            try {
                ((tg.b0) it.next()).T(iVar, th2);
            } catch (Throwable th3) {
                c.b(tg.c0.b(th2, th3));
            }
        }
        try {
            dd.b.a(th2, new e(iVar));
        } catch (Throwable unused) {
        }
        c.b(th2);
    }
}
