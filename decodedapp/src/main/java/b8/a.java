package b8;

import android.content.Context;
import com.google.android.gms.common.util.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f3735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f3736b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f3735a;
        if (context2 != null && (bool = f3736b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f3736b = null;
        if (f.c()) {
            f3736b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f3736b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f3736b = Boolean.FALSE;
            }
        }
        f3735a = applicationContext;
        return f3736b.booleanValue();
    }
}
