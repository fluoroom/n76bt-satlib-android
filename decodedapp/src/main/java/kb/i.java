package kb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a */
    private static ConcurrentHashMap f19609a = new ConcurrentHashMap();

    public static int a(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str != null && str2 == null) {
            return 1;
        }
        if (str == null && str2 != null) {
            return -1;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int i10 = 0;
        while (i10 < strArrSplit.length && i10 < strArrSplit2.length) {
            try {
                int i11 = Integer.parseInt(strArrSplit[i10]);
                int i12 = Integer.parseInt(strArrSplit2[i10]);
                if (i11 < i12) {
                    return -1;
                }
                if (i11 > i12) {
                    return 1;
                }
                i10++;
            } catch (NumberFormatException unused) {
                return str.compareTo(str2);
            }
        }
        if (strArrSplit.length > i10) {
            return 1;
        }
        return strArrSplit2.length > i10 ? -1 : 0;
    }

    public static String b(int i10) {
        if (i10 == 10103) {
            return "shareToQQ";
        }
        if (i10 == 10104) {
            return "shareToQzone";
        }
        if (i10 == 10105) {
            return "addToQQFavorites";
        }
        if (i10 == 10106) {
            return "sendToMyComputer";
        }
        if (i10 == 10107) {
            return "shareToTroopBar";
        }
        if (i10 == 11101) {
            return "action_login";
        }
        if (i10 == 10100) {
            return "action_request";
        }
        if (i10 != 10114) {
            return null;
        }
        return "action_common_channel";
    }

    public static String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        try {
            return applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th2) {
            jb.a.g("openSDK_LOG.SystemUtils", "getAppName exception", th2);
            try {
                int i10 = applicationInfo.labelRes;
                return i10 <= 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i10);
            } catch (Throwable th3) {
                jb.a.g("openSDK_LOG.SystemUtils", "getAppName getLabel exception", th3);
                return "";
            }
        }
    }

    public static String d(Context context, String str) {
        String strA = g.a(context, g(), str);
        if (strA != null && !"UNKNOWN".equals(strA)) {
            return strA;
        }
        PackageInfo packageInfoH = h(context, str);
        if (packageInfoH != null) {
            return packageInfoH.versionName;
        }
        jb.a.f("openSDK_LOG.SystemUtils", "getAppVersionName return null. package= " + str);
        return null;
    }

    public static boolean e(Context context) {
        boolean zJ = j(context, "com.tencent.mobileqq");
        jb.a.i("openSDK_LOG.SystemUtils", "isQQInstalled " + zJ);
        return zJ;
    }

    public static int f(Context context, String str) {
        return a(d(context, "com.tencent.mobileqq"), str);
    }

    private static String g() {
        String strK = ib.b.k();
        if (strK != null && !strK.isEmpty()) {
            return strK;
        }
        jb.a.f("openSDK_LOG.SystemUtils", "getAppId error: " + strK);
        return strK;
    }

    private static PackageInfo h(Context context, String str) {
        if (context == null || str == null) {
            return null;
        }
        synchronized (i.class) {
            try {
                if (!f19609a.containsKey(str)) {
                    PackageInfo packageInfoI = i(context, str);
                    f19609a.put(str, new gb.c(str, packageInfoI));
                    return packageInfoI;
                }
                gb.c cVar = (gb.c) f19609a.get(str);
                if (cVar == null) {
                    jb.a.f("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper is null");
                    return null;
                }
                PackageInfo packageInfo = cVar.f13779b;
                if (packageInfo == null) {
                    jb.a.f("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper packageInfo is null");
                }
                return packageInfo;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static PackageInfo i(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo;
            }
            jb.a.f("openSDK_LOG.SystemUtils", "realGetPackageInfo null. packageName= " + str);
            return packageInfo;
        } catch (Exception e10) {
            if (e10 instanceof PackageManager.NameNotFoundException) {
                jb.a.f("openSDK_LOG.SystemUtils", "realGetPackageInfo NameNotFoundException. packageName= " + str);
                return null;
            }
            jb.a.g("openSDK_LOG.SystemUtils", "realGetPackageInfo Exception. packageName= " + str, e10);
            return null;
        }
    }

    private static boolean j(Context context, String str) {
        return (g.a(context, g(), str) == null && h(context, str) == null) ? false : true;
    }
}
