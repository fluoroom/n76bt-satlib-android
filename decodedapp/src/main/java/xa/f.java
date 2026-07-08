package xa;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import rd.m;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f31845a = new f();

    private f() {
    }

    public static final double g() throws Throwable {
        try {
            String strH = h("ro.build.version.emui");
            m.b(strH);
            String strSubstring = strH.substring(q.c0(strH, "_", 0, false, 6, null) + 1);
            m.d(strSubstring, "substring(...)");
            return Double.parseDouble(strSubstring);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 4.0d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String h(java.lang.String r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Exception while closing InputStream"
            java.lang.String r1 = "RomUtils--->"
            java.lang.String r2 = "propName"
            rd.m.e(r7, r2)
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r4.<init>()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r5 = "getprop "
            r4.append(r5)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r4.append(r7)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.Process r3 = r3.exec(r4)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r3 = 1024(0x400, float:1.435E-42)
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r3 = r4.readLine()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.lang.String r5 = "readLine(...)"
            rd.m.d(r3, r5)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            r4.close()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            r4.close()     // Catch: java.io.IOException -> L43
            return r3
        L43:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
            return r3
        L48:
            r7 = move-exception
            r2 = r4
            goto L70
        L4b:
            r3 = move-exception
            goto L51
        L4d:
            r7 = move-exception
            goto L70
        L4f:
            r3 = move-exception
            r4 = r2
        L51:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r5.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = "Unable to read sysprop "
            r5.append(r6)     // Catch: java.lang.Throwable -> L48
            r5.append(r7)     // Catch: java.lang.Throwable -> L48
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> L48
            android.util.Log.e(r1, r7, r3)     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L6f
            r4.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
        L6f:
            return r2
        L70:
            if (r2 == 0) goto L7a
            r2.close()     // Catch: java.io.IOException -> L76
            goto L7a
        L76:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L7a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.f.h(java.lang.String):java.lang.String");
    }

    public final boolean a() {
        String str = Build.MANUFACTURER;
        m.d(str, "MANUFACTURER");
        if (q.P(str, "QiKU", false, 2, null)) {
            return true;
        }
        m.d(str, "MANUFACTURER");
        return q.P(str, "360", false, 2, null);
    }

    public final boolean b() {
        String str = Build.MANUFACTURER;
        m.d(str, "MANUFACTURER");
        return q.P(str, "HUAWEI", false, 2, null);
    }

    public final boolean c() throws Throwable {
        String strH = h("ro.build.display.id");
        if (TextUtils.isEmpty(strH)) {
            return false;
        }
        m.b(strH);
        if (q.P(strH, "flyme", false, 2, null)) {
            return true;
        }
        Locale locale = Locale.getDefault();
        m.d(locale, "getDefault(...)");
        String lowerCase = strH.toLowerCase(locale);
        m.d(lowerCase, "toLowerCase(...)");
        return q.P(lowerCase, "flyme", false, 2, null);
    }

    public final boolean d() {
        return !TextUtils.isEmpty(h("ro.miui.ui.version.name"));
    }

    public final boolean e() {
        String str = Build.MANUFACTURER;
        m.d(str, "MANUFACTURER");
        if (q.P(str, "OPPO", false, 2, null)) {
            return true;
        }
        m.d(str, "MANUFACTURER");
        return q.P(str, "oppo", false, 2, null);
    }

    public final boolean f() {
        String str = Build.MANUFACTURER;
        m.d(str, "MANUFACTURER");
        if (q.P(str, "VIVO", false, 2, null)) {
            return true;
        }
        m.d(str, "MANUFACTURER");
        return q.P(str, "vivo", false, 2, null);
    }
}
