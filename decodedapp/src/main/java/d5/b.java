package d5;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.dw.ht.Main;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a */
    public static final b f10596a = new b();

    /* JADX INFO: renamed from: b */
    private static final SharedPreferences f10597b;

    /* JADX INFO: renamed from: c */
    private static final Set f10598c;

    static {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Main.f5555g);
        rd.m.b(defaultSharedPreferences);
        f10597b = defaultSharedPreferences;
        Set<String> stringSet = defaultSharedPreferences.getStringSet("aprs.following", new HashSet());
        rd.m.b(stringSet);
        f10598c = stringSet;
    }

    private b() {
    }

    public final void a() {
        f10598c.clear();
        f10597b.edit().remove("aprs.following").apply();
    }

    public final String[] b() {
        return (String[]) f10598c.toArray(new String[0]);
    }
}
