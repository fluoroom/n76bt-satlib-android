package xg;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a */
    private static final Collection f32101a = qg.k.O(qg.k.g(ServiceLoader.load(tg.b0.class, tg.b0.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f32101a;
    }

    public static final void b(Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }
}
