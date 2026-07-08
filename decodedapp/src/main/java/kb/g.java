package kb;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f19598a = false;

    public static String a(Context context, String str, String str2) {
        if (context != null && str2 != null && str != null) {
            if ("com.tencent.mobileqq".equals(str2)) {
                return c(context, str, "com.tencent.mobileqq");
            }
            if ("com.tencent.tim".equals(str2)) {
                return c(context, str, "com.tencent.tim");
            }
        }
        return null;
    }

    private static boolean b(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 3) {
            return false;
        }
        for (String str2 : strArrSplit) {
            try {
                Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return true;
    }

    private static String c(Context context, String str, String str2) {
        if (!f19598a) {
            return null;
        }
        try {
            Cursor cursorD = d(context, str, str2);
            if (cursorD == null) {
                jb.a.f("openSDK_LOG.OpenApiProviderUtils", "queryTargetAppVersion null");
                return null;
            }
            if (cursorD.getCount() <= 0) {
                jb.a.f("openSDK_LOG.OpenApiProviderUtils", "queryTargetAppVersion empty");
                return null;
            }
            cursorD.moveToFirst();
            String string = cursorD.getString(0);
            cursorD.close();
            jb.a.i("openSDK_LOG.OpenApiProviderUtils", "AppVersion: " + string);
            return b(string) ? string : "UNKNOWN";
        } catch (Exception e10) {
            jb.a.g("openSDK_LOG.OpenApiProviderUtils", "queryTargetAppVersion exception: ", e10);
            return null;
        }
    }

    private static Cursor d(Context context, String str, String str2) {
        if (context == null) {
            return null;
        }
        try {
            return context.getContentResolver().query(Uri.parse("content://" + str2 + ".openapi.provider/query_app_version"), new String[0], "appid=? and pkgName=?", new String[]{str, context.getPackageName()}, null);
        } catch (Exception e10) {
            jb.a.g("openSDK_LOG.OpenApiProviderUtils", "query exception: ", e10);
            return null;
        }
    }
}
