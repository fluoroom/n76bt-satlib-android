package p1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f23847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f23848b;

    public static void a(String str) {
        b.a(f(str));
    }

    public static void b() {
        b.b();
    }

    private static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 29 ? c.a() : e();
    }

    private static boolean e() {
        try {
            if (f23848b == null) {
                f23847a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f23848b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f23848b.invoke(null, Long.valueOf(f23847a))).booleanValue();
        } catch (Exception e10) {
            c("isTagEnabled", e10);
            return false;
        }
    }

    private static String f(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
