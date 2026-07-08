package l3;

import a0.k;
import a0.u;
import android.app.Notification;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static void a(Service service) {
        b(service, k3.f.f19189i, new k.d(service, e.f20374b).q(-2).c());
    }

    public static void b(Service service, int i10, Notification notification) {
        c(service, i10, notification, -1);
    }

    public static void c(Service service, int i10, Notification notification, int i11) {
        try {
            u.a(service, i10, notification, i11);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        try {
            return Build.VERSION.SDK_INT >= 26 ? context.startForegroundService(intent) : context.startService(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static ComponentName e(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 26) {
            try {
                return context.startService(intent);
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }
        try {
            return context.startService(intent);
        } catch (Exception unused) {
            intent.putExtra("com.dw.android.app.ServiceUtils.EXTRA_IS_FOREGROUND", true);
            try {
                return context.startForegroundService(intent);
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
    }
}
