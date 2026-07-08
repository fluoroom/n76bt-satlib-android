package b8;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f3737a;

    public b(Context context) {
        this.f3737a = context;
    }

    public ApplicationInfo a(String str, int i10) {
        return this.f3737a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence b(String str) {
        Context context = this.f3737a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo c(String str, int i10) {
        return this.f3737a.getPackageManager().getPackageInfo(str, i10);
    }

    public final boolean d(int i10, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f3737a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
