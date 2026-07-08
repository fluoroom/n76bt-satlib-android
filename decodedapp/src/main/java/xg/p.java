package xg;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import tg.o1;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f32141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o1 f32142b;

    static {
        p pVar = new p();
        f32141a = pVar;
        y.f("kotlinx.coroutines.fast.service.loader", true);
        f32142b = pVar.a();
    }

    private p() {
    }

    private final o1 a() {
        Object next;
        o1 o1VarE;
        try {
            List listO = qg.k.O(qg.k.g(ServiceLoader.load(o.class, o.class.getClassLoader()).iterator()));
            Iterator it = listO.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((o) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((o) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            o oVar = (o) next;
            if (oVar != null && (o1VarE = q.e(oVar, listO)) != null) {
                return o1VarE;
            }
            q.b(null, null, 3, null);
            return null;
        } catch (Throwable th2) {
            q.b(th2, null, 2, null);
            return null;
        }
    }
}
