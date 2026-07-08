package k4;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static PowerManager.WakeLock f19378a;

    public static void a(Context context) {
        if (f19378a != null) {
            return;
        }
        PowerManager.WakeLock wakeLockB = b(context);
        f19378a = wakeLockB;
        wakeLockB.acquire(600000L);
    }

    public static PowerManager.WakeLock b(Context context) {
        return ((PowerManager) context.getSystemService("power")).newWakeLock(1, "AlarmAlertWakeLock");
    }

    public static void c() {
        PowerManager.WakeLock wakeLock = f19378a;
        if (wakeLock != null) {
            wakeLock.release();
            f19378a = null;
        }
    }
}
