package s7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import org.simpleframework.xml.strategy.Name;
import v7.p1;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f26992a = h.f26996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f26993b = new e();

    e() {
    }

    public static e e() {
        return f26993b;
    }

    public Intent a(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            int i11 = p1.f30465c;
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && com.google.android.gms.common.util.e.d(context)) {
            int i12 = p1.f30465c;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f26992a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(b8.c.a(context).c(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        int i13 = p1.f30465c;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(Name.MARK, "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent b(Context context, int i10, int i11) {
        return c(context, i10, i11, null);
    }

    public PendingIntent c(Context context, int i10, int i11, String str) {
        Intent intentA = a(context, i10, str);
        if (intentA == null) {
            return null;
        }
        return a0.q.b(context, i11, intentA, 134217728, false);
    }

    public String d(int i10) {
        return h.a(i10);
    }

    public int f(Context context) {
        return g(context, f26992a);
    }

    public int g(Context context, int i10) {
        int iE = h.e(context, i10);
        if (h.f(context, iE)) {
            return 18;
        }
        return iE;
    }

    public boolean h(Context context, String str) {
        return h.i(context, str);
    }

    public boolean i(int i10) {
        return h.h(i10);
    }
}
