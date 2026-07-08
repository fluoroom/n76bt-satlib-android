package lb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import gb.d;
import kb.e;
import kb.f;
import kb.h;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f20531b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f20532c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f20533d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eb.c f20534a;

    private b(String str, Context context) {
        this.f20534a = eb.c.a(str, context);
        ib.b.a().e(str, context);
        e.a().b(context);
    }

    private static String a(Object... objArr) {
        if (objArr == null || objArr.length == 0 || objArr.length % 2 != 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10 += 2) {
            if (i10 > 0) {
                sb2.append('|');
            }
            sb2.append(objArr[i10]);
            sb2.append(':');
            sb2.append(objArr[i10 + 1]);
        }
        return sb2.toString();
    }

    private static void b(String str, Object obj) {
        ib.b.a().f(str, obj);
    }

    private static void c(String str, Object... objArr) {
        ib.b.a().g(str, a(objArr));
    }

    private static boolean d(Context context, String str) {
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.tauth.AuthActivity"), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            jb.a.f("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.tauth.AuthActivity" + (("没有在AndroidManifest.xml中检测到com.tencent.tauth.AuthActivity,请加上com.tencent.tauth.AuthActivity,并配置<data android:scheme=\"tencent" + str + "\" />,详细信息请查看官网文档.") + "\n配置示例如下: \n<activity\n     android:name=\"com.tencent.tauth.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n    <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent" + str + "\" />\n</intent-filter>\n</activity>"));
            return false;
        } catch (Throwable th2) {
            jb.a.g("openSDK_LOG.Tencent", "checkManifestConfig exception", th2);
        }
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.connect.common.AssistActivity"), 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
            jb.a.f("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.connect.common.AssistActivity\n" + ("没有在AndroidManifest.xml中检测到com.tencent.connect.common.AssistActivity,请加上com.tencent.connect.common.AssistActivity,详细信息请查看官网文档.\n配置示例如下: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"behind\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>"));
            return false;
        } catch (Throwable th3) {
            jb.a.g("openSDK_LOG.Tencent", "checkManifestConfig exception", th3);
            return true;
        }
    }

    public static synchronized b e(String str, Context context) {
        f.c(context.getApplicationContext());
        jb.a.i("openSDK_LOG.Tencent", "createInstance()  -- start, appId = " + str);
        if (TextUtils.isEmpty(str)) {
            jb.a.f("openSDK_LOG.Tencent", "appId should not be empty!");
            return null;
        }
        b bVar = f20531b;
        if (bVar == null) {
            f20531b = new b(str, context);
        } else if (!str.equals(bVar.g())) {
            f20531b.i(context);
            f20531b = new b(str, context);
        }
        if (!d(context, str)) {
            return null;
        }
        c("createInstance", "appid", str);
        hb.f.a().e(h.c(context, str));
        jb.a.i("openSDK_LOG.Tencent", "createInstance()  -- end");
        return f20531b;
    }

    public static boolean j(int i10, int i11, Intent intent, a aVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onActivityResultData() reqcode = ");
        sb2.append(i10);
        sb2.append(", resultcode = ");
        sb2.append(i11);
        sb2.append(", data = null ? ");
        sb2.append(intent == null);
        sb2.append(", listener = null ? ");
        sb2.append(aVar == null);
        jb.a.i("openSDK_LOG.Tencent", sb2.toString());
        c("onActivityResultData", "requestCode", Integer.valueOf(i10), "resultCode", Integer.valueOf(i11));
        return d.c().f(i10, i11, intent, aVar);
    }

    public String f() {
        String strF = this.f20534a.c().f();
        jb.a.i("openSDK_LOG.Tencent", "getAccessToken() accessToken = " + strF);
        c("getAccessToken", new Object[0]);
        return strF;
    }

    public String g() {
        String strG = this.f20534a.c().g();
        jb.a.i("openSDK_LOG.Tencent", "getAppId() appid =" + strG);
        b("getAppId", strG);
        return strG;
    }

    public String h() {
        String strH = this.f20534a.c().h();
        jb.a.i("openSDK_LOG.Tencent", "getOpenId() openid= " + strH);
        c("getOpenId", new Object[0]);
        return strH;
    }

    public void i(Context context) {
        jb.a.i("openSDK_LOG.Tencent", "logout()");
        c("logout", new Object[0]);
        this.f20534a.c().j(null, "0");
        this.f20534a.c().k(null);
        this.f20534a.c().i(this.f20534a.c().g());
    }
}
