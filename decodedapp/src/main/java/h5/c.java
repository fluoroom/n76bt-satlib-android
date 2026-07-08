package h5;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.util.ArraySet;
import com.benshikj.ht.R;
import java.util.Iterator;
import java.util.Set;
import l3.d;
import l3.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    private static void a(Context context) {
        d.a();
        NotificationChannel notificationChannelA = l3.c.a("call", context.getText(R.string.call), 4);
        notificationChannelA.setShowBadge(true);
        notificationChannelA.enableLights(true);
        notificationChannelA.enableVibration(true);
        notificationChannelA.setSound(null, new AudioAttributes.Builder().setUsage(5).build());
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelA);
    }

    private static Set b(Context context) {
        ArraySet arraySetA = a.a();
        arraySetA.add("call");
        arraySetA.add(e.f20374b);
        arraySetA.add(e.f20375c);
        arraySetA.add(e.f20373a);
        return arraySetA;
    }

    private static Set c(Context context) {
        ArraySet arraySetA = a.a();
        Iterator<NotificationChannel> it = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannels().iterator();
        while (it.hasNext()) {
            arraySetA.add(b.a(it.next()).getId());
        }
        return arraySetA;
    }

    public static void d(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        Set setB = b(context);
        Set<String> setC = c(context);
        if (setB.equals(setC)) {
            return;
        }
        for (String str : setC) {
            if (!setB.contains(str)) {
                notificationManager.deleteNotificationChannel(str);
            }
        }
        a(context);
        e.a(context);
    }
}
