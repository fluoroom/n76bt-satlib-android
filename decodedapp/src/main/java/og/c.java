package og;

import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final boolean a(Throwable th2) {
        m.e(th2, "<this>");
        Class<?> superclass = th2.getClass();
        while (!m.a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable th2) throws Throwable {
        m.e(th2, "e");
        throw th2;
    }
}
