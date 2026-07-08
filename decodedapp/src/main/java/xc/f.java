package xc;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static void a(ck.b bVar, AtomicInteger atomicInteger, a aVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thB = aVar.b();
            if (thB != null) {
                bVar.onError(thB);
            } else {
                bVar.onComplete();
            }
        }
    }

    public static void b(ck.b bVar, Throwable th2, AtomicInteger atomicInteger, a aVar) {
        if (!aVar.a(th2)) {
            yc.a.n(th2);
        } else if (atomicInteger.getAndIncrement() == 0) {
            bVar.onError(aVar.b());
        }
    }

    public static void c(ck.b bVar, Object obj, AtomicInteger atomicInteger, a aVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bVar.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thB = aVar.b();
                if (thB != null) {
                    bVar.onError(thB);
                } else {
                    bVar.onComplete();
                }
            }
        }
    }
}
