package i0;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static f a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? f.i(a.a(configuration)) : f.a(configuration.locale);
    }
}
