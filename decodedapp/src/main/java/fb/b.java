package fb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static void a(Intent intent) {
        if (intent != null) {
            intent.setFlags((~(67 | 128)) & intent.getFlags());
        }
    }

    public static boolean b(Activity activity) {
        ComponentName callingActivity;
        String packageName;
        if (activity == null || (callingActivity = activity.getCallingActivity()) == null || (packageName = callingActivity.getPackageName()) == null) {
            return true;
        }
        return !packageName.equals(activity.getPackageName());
    }
}
