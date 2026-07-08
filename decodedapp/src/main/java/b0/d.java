package b0;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    static class a {
        static Object a(Intent intent, String str, Class cls) {
            return intent.getParcelableExtra(str, cls);
        }
    }

    public static Object a(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }
}
