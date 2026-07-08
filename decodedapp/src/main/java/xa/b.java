package xa;

import android.app.AppOpsManager;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static void a(Fragment fragment) {
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.putExtra("packageName", fragment.getActivity().getPackageName());
            fragment.startActivityForResult(intent, 199);
        } catch (Exception e10) {
            try {
                Log.e("MeizuUtils", "获取悬浮窗权限, 打开AppSecActivity失败, " + Log.getStackTraceString(e10));
                wa.c.c(fragment);
            } catch (Exception e11) {
                Log.e("MeizuUtils", "获取悬浮窗权限失败, 通用获取方法失败, " + Log.getStackTraceString(e11));
            }
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
            Log.e("MeizuUtils", Log.getStackTraceString(e10));
            return false;
        }
    }
}
