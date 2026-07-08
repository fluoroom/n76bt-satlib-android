package dd;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static void a(Throwable th2, Throwable th3) throws IllegalAccessException, InvocationTargetException {
        rd.m.e(th2, "<this>");
        rd.m.e(th3, "exception");
        if (th2 != th3) {
            ld.b.f20546a.a(th2, th3);
        }
    }
}
