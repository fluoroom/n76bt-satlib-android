package i0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f15660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f15661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f15662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f15663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f15664e;

    static class a {
        static boolean a() {
            return Trace.isEnabled();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f15660a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f15661b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f15662c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f15663d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f15664e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.a();
        }
        try {
            return ((Boolean) f15661b.invoke(null, Long.valueOf(f15660a))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }
}
