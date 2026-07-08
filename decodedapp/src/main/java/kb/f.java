package kb;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f19597a;

    public static Context a() {
        Context context = f19597a;
        if (context == null) {
            return null;
        }
        return context;
    }

    public static File b(String str) {
        return k.s(a(), str);
    }

    public static void c(Context context) {
        f19597a = context;
    }

    public static String d() {
        return a() == null ? "" : a().getPackageName();
    }

    public static File e() {
        return b(null);
    }
}
