package o6;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q f23218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final ThreadLocal f23219b;

    static {
        boolean zEquals;
        try {
            zEquals = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            zEquals = false;
        }
        f23218a = zEquals ? q.a() : null;
        f23219b = new ThreadLocal();
    }

    public static a a() {
        ThreadLocal threadLocal = f23219b;
        SoftReference softReference = (SoftReference) threadLocal.get();
        a aVar = softReference == null ? null : (a) softReference.get();
        if (aVar == null) {
            aVar = new a();
            q qVar = f23218a;
            threadLocal.set(qVar != null ? qVar.c(aVar) : new SoftReference(aVar));
        }
        return aVar;
    }
}
