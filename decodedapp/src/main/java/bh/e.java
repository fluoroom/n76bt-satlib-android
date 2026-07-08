package bh;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Intent f4051a = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));

    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List a(android.content.Context r10) {
        /*
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            r3 = 64
            if (r1 < r2) goto L15
            r1 = 131136(0x20040, float:1.8376E-40)
            goto L17
        L15:
            r1 = 64
        L17:
            android.content.Intent r2 = bh.e.f4051a
            r4 = 0
            android.content.pm.ResolveInfo r5 = r10.resolveActivity(r2, r4)
            if (r5 == 0) goto L25
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            java.lang.String r5 = r5.packageName
            goto L26
        L25:
            r5 = 0
        L26:
            java.util.List r1 = r10.queryIntentActivities(r2, r1)
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            boolean r6 = c(r2)
            if (r6 != 0) goto L41
            goto L2e
        L41:
            android.content.pm.ActivityInfo r6 = r2.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            java.lang.String r6 = r6.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            android.content.pm.PackageInfo r6 = r10.getPackageInfo(r6, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            android.content.pm.ActivityInfo r7 = r2.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            java.lang.String r7 = r7.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            boolean r7 = b(r10, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            if (r7 == 0) goto L6c
            bh.c r7 = new bh.c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            r8 = 1
            r7.<init>(r6, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            android.content.pm.ActivityInfo r9 = r2.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            java.lang.String r9 = r9.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            boolean r9 = r9.equals(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            if (r9 == 0) goto L69
            r0.add(r4, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            goto L6d
        L67:
            goto L2e
        L69:
            r0.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
        L6c:
            r8 = 0
        L6d:
            bh.c r7 = new bh.c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            r7.<init>(r6, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            android.content.pm.ActivityInfo r2 = r2.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            java.lang.String r2 = r2.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            boolean r2 = r2.equals(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            if (r2 == 0) goto L80
            r0.add(r8, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            goto L2e
        L80:
            r0.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            goto L2e
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.e.a(android.content.Context):java.util.List");
    }

    private static boolean b(PackageManager packageManager, String str) {
        Intent intent = new Intent();
        intent.setAction("android.support.customtabs.action.CustomTabsService");
        intent.setPackage(str);
        return packageManager.resolveService(intent, 0) != null;
    }

    private static boolean c(ResolveInfo resolveInfo) {
        IntentFilter intentFilter = resolveInfo.filter;
        if (intentFilter == null || !intentFilter.hasAction("android.intent.action.VIEW") || !resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") || resolveInfo.filter.schemesIterator() == null || resolveInfo.filter.authoritiesIterator() != null) {
            return false;
        }
        Iterator<String> itSchemesIterator = resolveInfo.filter.schemesIterator();
        boolean zEquals = false;
        boolean zEquals2 = false;
        while (itSchemesIterator.hasNext()) {
            String next = itSchemesIterator.next();
            zEquals |= "http".equals(next);
            zEquals2 |= "https".equals(next);
            if (zEquals && zEquals2) {
                return true;
            }
        }
        return false;
    }

    public static c d(Context context, d dVar) {
        c cVar = null;
        for (c cVar2 : a(context)) {
            if (dVar.a(cVar2)) {
                if (cVar2.f4050d.booleanValue()) {
                    return cVar2;
                }
                if (cVar == null) {
                    cVar = cVar2;
                }
            }
        }
        return cVar;
    }
}
