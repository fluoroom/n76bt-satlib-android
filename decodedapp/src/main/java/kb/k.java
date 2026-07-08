package kb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.stetho.common.Utf8Charset;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONObject;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f19616a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f19617b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f19618c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f19619d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f19620e = -1;

    public static Bundle a(Bundle bundle, String str) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("result", str);
        return bundle;
    }

    public static Bundle b(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            try {
                for (String str2 : str.split("&")) {
                    String[] strArrJ = j(str2, "=");
                    if (strArrJ.length == 2) {
                        bundle.putString(URLDecoder.decode(strArrJ[0]), URLDecoder.decode(strArrJ[1]));
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return bundle;
    }

    public static Bundle c(String str, String str2, String str3, String str4, String str5, String str6) {
        return e(str, str3, str4, str2, str5, str6, "", "", "", "", "", "");
    }

    public static Bundle d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Bundle bundle = new Bundle();
        bundle.putString("openid", str);
        bundle.putString("report_type", str2);
        bundle.putString("act_type", str3);
        bundle.putString("via", str4);
        bundle.putString("app_id", str5);
        bundle.putString("type", str6);
        bundle.putString("login_status", str7);
        bundle.putString("need_user_auth", str8);
        bundle.putString("to_uin", str9);
        bundle.putString("call_source", str10);
        bundle.putString("to_type", str11);
        bundle.putString("platform", "1");
        return bundle;
    }

    public static Bundle e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        return a(d(str, str2, str3, str4, str5, str7, str8, str9, str10, str11, str12), str6);
    }

    public static String f(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Base64.encodeToString(str.getBytes(Utf8Charset.NAME), i10);
        } catch (UnsupportedEncodingException e10) {
            jb.a.f("openSDK_LOG.Util", "convert2Base64String exception: " + e10.getMessage());
            return "";
        }
    }

    public static String g(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            String string = Integer.toString(b10 & MessagePack.Code.EXT_TIMESTAMP, 16);
            if (string.length() == 1) {
                string = "0" + string;
            }
            sb2.append(string);
        }
        return sb2.toString();
    }

    private static void h(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(WXVideoFileObject.FILE_SIZE_LIMIT);
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str3));
        context.startActivity(intent);
    }

    public static boolean i(Context context, String str) {
        boolean zR;
        try {
            zR = r(context);
            try {
                if (zR) {
                    h(context, "com.tencent.mtt", "com.tencent.mtt.MainActivity", str);
                } else {
                    h(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                }
                return true;
            } catch (Exception unused) {
                if (!zR) {
                    try {
                        try {
                            h(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                            return true;
                        } catch (Exception unused2) {
                            h(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                            return true;
                        }
                    } catch (Exception unused3) {
                        return false;
                    }
                }
                try {
                    try {
                        try {
                            h(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                            return true;
                        } catch (Exception unused4) {
                            h(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                            return true;
                        }
                    } catch (Exception unused5) {
                        h(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                        return true;
                    }
                } catch (Exception unused6) {
                    return false;
                }
            }
        } catch (Exception unused7) {
            zR = false;
        }
    }

    public static String[] j(String str, String str2) {
        int iIndexOf = str.indexOf(str2);
        return iIndexOf == -1 ? new String[]{str} : new String[]{str.substring(0, iIndexOf), str.substring(iIndexOf + str2.length())};
    }

    public static String k() {
        File fileE = f.e();
        if (fileE == null) {
            return null;
        }
        if (!fileE.exists()) {
            fileE.mkdirs();
        }
        return fileE.toString();
    }

    public static void l(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            String str2 = packageInfo.versionName;
            f19617b = str2;
            f19616a = str2.substring(0, str2.lastIndexOf(46));
            String str3 = f19617b;
            f19619d = str3.substring(str3.lastIndexOf(46) + 1, f19617b.length());
            f19620e = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            jb.a.f("openSDK_LOG.Util", "getPackageInfo has exception: " + e10.getMessage());
        } catch (Exception e11) {
            jb.a.f("openSDK_LOG.Util", "getPackageInfo has exception: " + e11.getMessage());
        }
    }

    public static boolean m(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || t(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo[] allNetworkInfo = null;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th2) {
            jb.a.g("openSDK_LOG.Util", "Util.isNetWorkAvailable getConnectivity has exception", th2);
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return true;
        }
        try {
            allNetworkInfo = connectivityManager.getAllNetworkInfo();
        } catch (Exception e10) {
            jb.a.g("openSDK_LOG.Util", "Util.isNetWorkAvailable has exception: ", e10);
        }
        if (allNetworkInfo != null && allNetworkInfo.length != 0) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.isConnectedOrConnecting()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String n(Context context, String str) {
        if (context == null) {
            return "";
        }
        l(context, str);
        return f19617b;
    }

    public static String o(Context context, String str) {
        if (context == null) {
            return "";
        }
        l(context, str);
        return f19616a;
    }

    public static JSONObject p(String str) {
        if (str.equals("false")) {
            str = "{value : false}";
        }
        if (str.equals("true")) {
            str = "{value : true}";
        }
        if (str.contains("allback(")) {
            str = str.replaceFirst("[\\s\\S]*allback\\(([\\s\\S]*)\\);[^\\)]*\\z", "$1").trim();
        }
        if (str.contains("online[0]=")) {
            str = "{online:" + str.charAt(str.length() - 2) + "}";
        }
        return new JSONObject(str);
    }

    public static String q(Context context, String str) {
        if (context == null) {
            return "";
        }
        String strO = o(context, str);
        f19618c = strO;
        return strO;
    }

    private static boolean r(Context context) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.mtt", 64);
            String str = packageInfo.versionName;
            if (i.a(str, "4.3") >= 0 && !str.startsWith("4.4") && (signatureArr = packageInfo.signatures) != null) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(signatureArr[0].toByteArray());
                    String strG = g(messageDigest.digest());
                    messageDigest.reset();
                    if (strG.equals("d8391a394d4a179e6fe7bdb8a301258b")) {
                        return true;
                    }
                } catch (NoSuchAlgorithmException e10) {
                    jb.a.f("openSDK_LOG.Util", "isQQBrowerAvailable has exception: " + e10.getMessage());
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static File s(Context context, String str) {
        File[] externalFilesDirs;
        if (context == null) {
            return null;
        }
        try {
            externalFilesDirs = context.getExternalFilesDirs(str);
        } catch (Throwable th2) {
            jb.a.g("openSDK_LOG.Util", "getExternalFilesDirs exception", th2);
            externalFilesDirs = null;
        }
        if (externalFilesDirs == null || externalFilesDirs.length <= 0) {
            return null;
        }
        return externalFilesDirs[0];
    }

    private static boolean t(Context context, String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            return context.checkSelfPermission(str) != 0;
        } catch (Exception e10) {
            jb.a.g("openSDK_LOG.Util", "checkSelfPermission exception", e10);
            return false;
        }
    }

    public static byte[] u(String str) {
        try {
            return str.getBytes(Utf8Charset.NAME);
        } catch (UnsupportedEncodingException e10) {
            jb.a.g("openSDK_LOG.Util", "getBytesUTF8: UnsupportedEncodingException", e10);
            return new byte[0];
        }
    }

    public static String v(String str) {
        return f(str, 2);
    }
}
