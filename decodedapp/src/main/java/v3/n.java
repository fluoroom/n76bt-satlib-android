package v3;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Locale f29586a = Locale.getDefault();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static LocaleList f29587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Locale f29588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static LocaleList f29589d;

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            f29587b = LocaleList.getDefault();
        }
    }

    public static LocaleList a(Locale locale, LocaleList localeList) {
        if (locale == null) {
            return localeList;
        }
        if (localeList == null) {
            m.a();
            return l.a(new Locale[]{locale});
        }
        int iIndexOf = localeList.indexOf(locale);
        if (iIndexOf == 0) {
            return localeList;
        }
        int size = localeList.size();
        Locale[] localeArr = new Locale[(iIndexOf < 0 ? 1 : 0) + size];
        if (iIndexOf > 0) {
            int i10 = 0;
            while (i10 < iIndexOf) {
                int i11 = i10 + 1;
                localeArr[i11] = (Locale) localeList.get(i10).clone();
                i10 = i11;
            }
            for (int i12 = iIndexOf + 1; i12 < size; i12++) {
                localeArr[i12] = (Locale) localeList.get(i12).clone();
            }
        } else {
            int i13 = 0;
            while (i13 < size) {
                int i14 = i13 + 1;
                localeArr[i14] = (Locale) localeList.get(i13).clone();
                i13 = i14;
            }
        }
        localeArr[0] = (Locale) locale.clone();
        return l.a(localeArr);
    }

    public static void b(Resources resources) {
        Configuration configuration = resources.getConfiguration();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (f29588c == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = f29589d;
            if (localeList != null) {
                configuration.setLocales(localeList);
            } else {
                configuration.setLocales(a(f29588c, configuration.getLocales()));
            }
        } else {
            configuration.locale = f29588c;
        }
        resources.updateConfiguration(configuration, displayMetrics);
    }
}
