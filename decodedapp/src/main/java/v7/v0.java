package v7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f30483a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f30484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f30485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f30486d;

    public static int a(Context context) {
        b(context);
        return f30486d;
    }

    private static void b(Context context) {
        synchronized (f30483a) {
            try {
                if (f30484b) {
                    return;
                }
                f30484b = true;
                try {
                    Bundle bundle = b8.c.a(context).a(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f30485c = bundle.getString("com.google.app.id");
                    f30486d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
