package rc;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    static final class a extends hc.c {

        /* JADX INFO: renamed from: b */
        final Object f25923b;

        /* JADX INFO: renamed from: c */
        final mc.d f25924c;

        a(Object obj, mc.d dVar) {
            this.f25923b = obj;
            this.f25924c = dVar;
        }

        @Override // hc.c
        public void m(ck.b bVar) {
            try {
                ck.a aVar = (ck.a) oc.b.c(this.f25924c.apply(this.f25923b), "The mapper returned a null Publisher");
                if (!(aVar instanceof Callable)) {
                    aVar.a(bVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) aVar).call();
                    if (objCall == null) {
                        wc.b.a(bVar);
                    } else {
                        bVar.a(new wc.c(bVar, objCall));
                    }
                } catch (Throwable th2) {
                    lc.b.b(th2);
                    wc.b.d(th2, bVar);
                }
            } catch (Throwable th3) {
                wc.b.d(th3, bVar);
            }
        }
    }

    public static hc.c a(Object obj, mc.d dVar) {
        return yc.a.j(new a(obj, dVar));
    }

    public static boolean b(ck.a aVar, ck.b bVar, mc.d dVar) {
        if (!(aVar instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) aVar).call();
            if (objCall == null) {
                wc.b.a(bVar);
                return true;
            }
            try {
                ck.a aVar2 = (ck.a) oc.b.c(dVar.apply(objCall), "The mapper returned a null Publisher");
                if (aVar2 instanceof Callable) {
                    try {
                        Object objCall2 = ((Callable) aVar2).call();
                        if (objCall2 == null) {
                            wc.b.a(bVar);
                            return true;
                        }
                        bVar.a(new wc.c(bVar, objCall2));
                    } catch (Throwable th2) {
                        lc.b.b(th2);
                        wc.b.d(th2, bVar);
                        return true;
                    }
                } else {
                    aVar2.a(bVar);
                }
                return true;
            } catch (Throwable th3) {
                lc.b.b(th3);
                wc.b.d(th3, bVar);
                return true;
            }
        } catch (Throwable th4) {
            lc.b.b(th4);
            wc.b.d(th4, bVar);
            return true;
        }
    }
}
