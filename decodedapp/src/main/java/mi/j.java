package mi;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f22329d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f22330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    q f22331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j f22332c;

    private j(Object obj, q qVar) {
        this.f22330a = obj;
        this.f22331b = qVar;
    }

    static j a(q qVar, Object obj) {
        List list = f22329d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new j(obj, qVar);
                }
                j jVar = (j) list.remove(size - 1);
                jVar.f22330a = obj;
                jVar.f22331b = qVar;
                jVar.f22332c = null;
                return jVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void b(j jVar) {
        jVar.f22330a = null;
        jVar.f22331b = null;
        jVar.f22332c = null;
        List list = f22329d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(jVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
