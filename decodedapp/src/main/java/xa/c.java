package xa;

import android.app.AppOpsManager;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.util.Log;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static void a(Fragment fragment) throws Throwable {
        int iD = d();
        if (iD == 5) {
            e(fragment);
            return;
        }
        if (iD == 6) {
            f(fragment);
            return;
        }
        if (iD == 7) {
            g(fragment);
            return;
        }
        if (iD >= 8) {
            h(fragment);
            return;
        }
        Log.e("MiuiUtils", "this is a special MIUI rom version, its version code " + iD);
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
            Log.e("MiuiUtils", Log.getStackTraceString(e10));
            return false;
        }
    }

    public static int d() throws Throwable {
        String strH = f.h("ro.miui.ui.version.name");
        if (strH == null) {
            return -1;
        }
        try {
            return Integer.parseInt(strH.substring(1));
        } catch (Exception e10) {
            Log.e("MiuiUtils", "get miui version code error, version : " + strH);
            Log.e("MiuiUtils", Log.getStackTraceString(e10));
            return -1;
        }
    }

    public static void e(Fragment fragment) {
        String packageName = fragment.getActivity().getPackageName();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", packageName, null));
        if (i(intent, fragment.getActivity())) {
            fragment.startActivityForResult(intent, 199);
        } else {
            Log.e("MiuiUtils", "intent is not available!");
        }
    }

    public static void f(Fragment fragment) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
        intent.putExtra("extra_pkgname", fragment.getActivity().getPackageName());
        if (i(intent, fragment.getActivity())) {
            fragment.startActivityForResult(intent, 199);
        } else {
            Log.e("MiuiUtils", "Intent is not available!");
        }
    }

    public static void g(Fragment fragment) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
        intent.putExtra("extra_pkgname", fragment.getActivity().getPackageName());
        if (i(intent, fragment.getActivity())) {
            fragment.startActivityForResult(intent, 199);
        } else {
            Log.e("MiuiUtils", "Intent is not available!");
        }
    }

    public static void h(Fragment fragment) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
        intent.putExtra("extra_pkgname", fragment.getActivity().getPackageName());
        if (i(intent, fragment.getActivity())) {
            fragment.startActivityForResult(intent, 199);
            return;
        }
        Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent2.setPackage("com.miui.securitycenter");
        intent2.putExtra("extra_pkgname", fragment.getActivity().getPackageName());
        if (i(intent2, fragment.getActivity())) {
            fragment.startActivityForResult(intent2, 199);
        } else {
            Log.e("MiuiUtils", "Intent is not available!");
        }
    }

    private static boolean i(Intent intent, Context context) {
        return intent != null && context.getPackageManager().queryIntentActivities(intent, WXMediaMessage.THUMB_LENGTH_LIMIT).size() > 0;
    }
}
