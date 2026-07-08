package xa;

import android.app.AppOpsManager;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.util.Log;
import android.widget.Toast;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static void a(Fragment fragment) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity"));
            if (f.g() == 3.1d) {
                fragment.startActivityForResult(intent, 199);
            } else {
                intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.notificationmanager.ui.NotificationManagmentActivity"));
                fragment.startActivityForResult(intent, 199);
            }
        } catch (ActivityNotFoundException e10) {
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName("com.Android.settings", "com.android.settings.permission.TabItem"));
            fragment.startActivityForResult(intent2, 199);
            e10.printStackTrace();
            Log.e("HuaweiUtils", Log.getStackTraceString(e10));
        } catch (SecurityException e11) {
            Intent intent3 = new Intent();
            intent3.setFlags(268435456);
            intent3.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            fragment.startActivityForResult(intent3, 199);
            Log.e("HuaweiUtils", Log.getStackTraceString(e11));
        } catch (Exception e12) {
            Toast.makeText(fragment.getActivity(), "进入设置页面失败，请手动设置", 1).show();
            Log.e("HuaweiUtils", Log.getStackTraceString(e12));
        }
    }

    public static boolean b(Context context) {
        return c(context, 24);
    }

    private static boolean c(Context context, int i10) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        try {
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, Integer.valueOf(i10), Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
        } catch (Exception e10) {
            Log.e("HuaweiUtils", Log.getStackTraceString(e10));
            return false;
        }
    }
}
