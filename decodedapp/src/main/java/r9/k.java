package r9;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j f25638a = d();

    private static final class b implements j {
        private b() {
        }
    }

    static String a(String str) {
        if (e(str)) {
            return null;
        }
        return str;
    }

    static String b(double d10) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d10));
    }

    static String c(String str, Object... objArr) {
        return p.c(str, objArr);
    }

    private static j d() {
        return new b();
    }

    static boolean e(String str) {
        return str == null || str.isEmpty();
    }

    static String f(Object obj) {
        return String.valueOf(obj);
    }
}
