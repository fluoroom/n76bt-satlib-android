package l3;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f20373a = "general";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f20374b = "background_tasks";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f20375c = "foreground_tasks";

    public static void a(Context context) {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class)) != null) {
            d.a();
            notificationManager.createNotificationChannel(c.a(f20373a, "General", 3));
            d.a();
            notificationManager.createNotificationChannel(c.a(f20375c, "Foreground tasks", 2));
            d.a();
            NotificationChannel notificationChannelA = c.a(f20374b, "Background tasks", 1);
            notificationChannelA.enableLights(false);
            notificationChannelA.enableVibration(false);
            notificationChannelA.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannelA);
        }
    }
}
