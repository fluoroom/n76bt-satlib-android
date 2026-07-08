package db;

import android.content.Context;
import eb.b;
import java.lang.reflect.Method;
import kb.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Class f10882a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Class f10883b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f10884c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f10885d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f10886e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Method f10887f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f10888g = false;

    public static boolean a(Context context, b bVar) {
        return h.c(context, bVar.g()).i("Common_ta_enable");
    }

    public static void b(Context context, b bVar) {
        try {
            if (a(context, bVar)) {
                f10887f.invoke(f10882a, Boolean.TRUE);
            } else {
                f10887f.invoke(f10882a, Boolean.FALSE);
            }
        } catch (Exception e10) {
            jb.a.f("OpenConfig", "checkStatStatus exception: " + e10.toString());
        }
    }

    public static void c(Context context, b bVar) {
        String str = "Aqc" + bVar.g();
        try {
            f10882a = Class.forName("com.tencent.stat.StatConfig");
            Class<?> cls = Class.forName("com.tencent.stat.StatService");
            f10883b = cls;
            f10884c = cls.getMethod("reportQQ", Context.class, String.class);
            f10885d = f10883b.getMethod("trackCustomEvent", Context.class, String.class, String[].class);
            Class cls2 = f10883b;
            Class<?> cls3 = Integer.TYPE;
            f10886e = cls2.getMethod("commitEvents", Context.class, cls3);
            Class cls4 = f10882a;
            Class<?> cls5 = Boolean.TYPE;
            f10887f = cls4.getMethod("setEnableStatService", cls5);
            b(context, bVar);
            f10882a.getMethod("setAutoExceptionCaught", cls5).invoke(f10882a, Boolean.FALSE);
            f10882a.getMethod("setEnableSmartReporting", cls5).invoke(f10882a, Boolean.TRUE);
            f10882a.getMethod("setSendPeriodMinutes", cls3).invoke(f10882a, 1440);
            Class<?> cls6 = Class.forName("com.tencent.stat.StatReportStrategy");
            f10882a.getMethod("setStatSendStrategy", cls6).invoke(f10882a, cls6.getField("PERIOD").get(null));
            f10883b.getMethod("startStatService", Context.class, String.class, String.class).invoke(f10883b, context, str, Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null));
            f10888g = true;
        } catch (Exception e10) {
            jb.a.f("OpenConfig", "start4QQConnect exception: " + e10.toString());
        }
    }
}
