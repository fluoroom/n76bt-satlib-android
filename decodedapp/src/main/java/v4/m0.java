package v4;

import android.location.Location;
import android.text.TextUtils;
import java.util.Locale;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class m0 {
    public static r1 b(n0 n0Var) {
        return null;
    }

    public static xdsopl.robot36.a c(n0 n0Var) {
        return null;
    }

    public static boolean e(n0 n0Var, v vVar, q0 q0Var) {
        return n0Var.a(vVar, q0Var.a(n0Var.d().f29640g));
    }

    public static long h(String str) {
        try {
            return Long.parseLong(str.replaceAll(":", ""), 16);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static long i(String str) {
        return h(str) + 562949953421310L;
    }

    public static String j(long j10) {
        return l(j10) >= 0 ? k(j10) : String.format(Locale.ENGLISH, "%X", Long.valueOf(j10));
    }

    public static String k(long j10) {
        long jL = l(j10);
        if (jL < 0) {
            return null;
        }
        String[] strArr = new String[6];
        for (int i10 = 0; i10 < 6; i10++) {
            strArr[i10] = String.format(Locale.ENGLISH, "%02X", Long.valueOf((jL >> 40) & 255));
            jL <<= 8;
        }
        return TextUtils.join(":", strArr);
    }

    public static long l(long j10) {
        if (j10 <= 281474976710655L) {
            return j10;
        }
        if (562949953421310L > j10 || j10 > 844424930131964L) {
            return -1L;
        }
        return j10 - 562949953421310L;
    }

    public static void a(n0 n0Var) {
    }

    public static void d(n0 n0Var, n0.b bVar) {
    }

    public static void f(n0 n0Var, Location location) {
    }

    public static void g(n0 n0Var, n0.b bVar) {
    }
}
