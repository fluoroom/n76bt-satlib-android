package ui;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static String a(c cVar, String str, String str2, Locale locale) {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle(str, locale, new i());
            if (bundle.getLocale().getLanguage().equals(locale.getLanguage())) {
                String string = bundle.getString(str2);
                if (!string.isEmpty()) {
                    if (!string.toLowerCase(locale).contains("missing translation")) {
                        return string;
                    }
                }
            }
        } catch (MissingResourceException unused) {
        }
        return cVar.F();
    }
}
