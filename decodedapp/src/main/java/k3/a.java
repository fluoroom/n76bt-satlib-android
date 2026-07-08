package k3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.stetho.common.Utf8Charset;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19146a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f19147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f19148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static File f19149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Thread.UncaughtExceptionHandler f19150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f19151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f19152g;

    private a() {
    }

    private final String a(CharSequence charSequence, Thread thread, Throwable th2) {
        PackageInfo packageInfo;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            Context context = f19151f;
            Context context2 = null;
            if (context == null) {
                m.o("context");
                context = null;
            }
            PackageManager packageManager = context.getPackageManager();
            Context context3 = f19151f;
            if (context3 == null) {
                m.o("context");
            } else {
                context2 = context3;
            }
            packageInfo = packageManager.getPackageInfo(context2.getApplicationInfo().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = new PackageInfo();
        }
        if (!TextUtils.isEmpty(charSequence)) {
            printWriter.println(charSequence);
        }
        printWriter.println("System information:");
        printWriter.println("MANUFACTURER=" + Build.MANUFACTURER);
        printWriter.println("MODEL=" + Build.MODEL);
        printWriter.println("RELEASE=" + Build.VERSION.RELEASE);
        printWriter.println("API_LEVEL=" + Build.VERSION.SDK_INT);
        printWriter.println("FINGERPRINT=" + Build.FINGERPRINT);
        printWriter.println("Package info:");
        printWriter.printf("Version code=%d\n", Integer.valueOf(packageInfo.versionCode));
        printWriter.printf("Version name=%s\n", packageInfo.versionName);
        if (thread != null) {
            printWriter.println("Thread info:");
            printWriter.printf("Name=%s\n", thread.getName());
        }
        if (th2 != null) {
            printWriter.println("Exception:");
            printWriter.println(th2.toString());
            printWriter.println("Stack trace:");
            th2.printStackTrace(printWriter);
        }
        String string = stringWriter.toString();
        m.d(string, "toString(...)");
        return string;
    }

    private final void c(Thread thread, Throwable th2) {
        CharSequence text;
        PackageInfo packageInfo;
        Context context = null;
        if (f19148c == 0) {
            text = null;
        } else {
            Context context2 = f19151f;
            if (context2 == null) {
                m.o("context");
                context2 = null;
            }
            text = context2.getResources().getText(f19148c);
        }
        String strA = a(text, thread, th2);
        Context context3 = f19151f;
        if (context3 == null) {
            m.o("context");
            context3 = null;
        }
        a6.e.a(context3, strA, null, null);
        File file = f19149d;
        if (file != null) {
            try {
                file.getParentFile().mkdirs();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), Utf8Charset.NAME);
                outputStreamWriter.write(strA);
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
        String str = f19147b;
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            Context context4 = f19151f;
            if (context4 == null) {
                m.o("context");
                context4 = null;
            }
            PackageManager packageManager = context4.getPackageManager();
            Context context5 = f19151f;
            if (context5 == null) {
                m.o("context");
                context5 = null;
            }
            packageInfo = packageManager.getPackageInfo(context5.getApplicationInfo().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = new PackageInfo();
        }
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:" + f19147b + "?subject=" + Uri.encode("error_report:" + packageInfo.packageName) + "&body=" + Uri.encode(Uri.encode(strA))));
        intent.putExtra("android.intent.extra.EMAIL", f19147b);
        String str2 = packageInfo.packageName;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("error_report:");
        sb2.append(str2);
        intent.putExtra("android.intent.extra.SUBJECT", sb2.toString());
        intent.putExtra("android.intent.extra.TEXT", strA);
        intent.setFlags(268435456);
        Context context6 = f19151f;
        if (context6 == null) {
            m.o("context");
        } else {
            context = context6;
        }
        context.startActivity(intent);
    }

    public final void b(Context context, File file, String str, int i10) {
        m.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        m.d(applicationContext, "getApplicationContext(...)");
        f19151f = applicationContext;
        f19149d = file;
        f19147b = str;
        f19148c = i10;
        if (f19150e == null) {
            f19150e = Thread.getDefaultUncaughtExceptionHandler();
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
        if (m.a(f19150e, this)) {
            f19150e = null;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        m.e(thread, "thread");
        m.e(th2, "ex");
        if (f19152g) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f19150e;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th2);
                return;
            }
            return;
        }
        f19152g = true;
        c(thread, th2);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = f19150e;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th2);
        }
    }
}
