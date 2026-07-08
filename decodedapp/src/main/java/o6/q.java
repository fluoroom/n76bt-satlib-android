package o6;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f23267a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f23268b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReferenceQueue f23269c = new ReferenceQueue();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final q f23270a = new q();
    }

    q() {
    }

    public static q a() {
        return a.f23270a;
    }

    private void b() {
        while (true) {
            SoftReference softReference = (SoftReference) this.f23269c.poll();
            if (softReference == null) {
                return;
            } else {
                this.f23268b.remove(softReference);
            }
        }
    }

    public SoftReference c(o6.a aVar) {
        SoftReference softReference = new SoftReference(aVar, this.f23269c);
        this.f23268b.put(softReference, Boolean.TRUE);
        b();
        return softReference;
    }
}
