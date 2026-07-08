package rj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f26157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f26158b;

    static {
        List listAsList = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        f26157a = new HashMap(listAsList.size());
        f26158b = new HashMap(listAsList.size());
        for (int i10 = 0; i10 < listAsList.size(); i10++) {
            int i11 = i10 + 10;
            f26157a.put((Character) listAsList.get(i10), Integer.valueOf(i11));
            f26158b.put(Integer.valueOf(i11), (Character) listAsList.get(i10));
        }
    }

    public static String a(String str, int i10, char c10, int i11, boolean z10, int i12) {
        return b(str, Integer.toString(i10), c10, i11, z10, i12);
    }

    public static String b(String str, String str2, char c10, int i10, boolean z10, int i11) {
        if (str2.length() > i10) {
            throw new hj.a(hj.f.TLE_INVALID_PARAMETER, Integer.valueOf(i11), str, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(c10);
        }
        if (!z10) {
            return (str2 + ((Object) sb2)).substring(0, i10);
        }
        String str3 = ((Object) sb2) + str2;
        int length = str3.length();
        return str3.substring(length - i10, length);
    }

    public static String c(int i10, String str) {
        if (i10 <= 99999) {
            return a(str, i10, '0', 5, true, i10);
        }
        int i11 = i10 / 10000;
        int i12 = i10 - (i11 * 10000);
        Character ch2 = (Character) f26158b.get(Integer.valueOf(i11));
        if (ch2 == null) {
            throw new hj.a(hj.f.TLE_INVALID_PARAMETER, Integer.valueOf(i10), str, "null");
        }
        return ch2 + a(str, i12, '0', 4, true, i10);
    }

    public static double d(String str, int i10, int i11) {
        String strTrim = str.substring(i10, i11 + i10).trim();
        if (strTrim.length() > 0) {
            return Double.parseDouble(strTrim.replace(' ', '0'));
        }
        return 0.0d;
    }

    public static int e(String str, int i10, int i11) {
        String strTrim = str.substring(i10, i11 + i10).trim();
        if (strTrim.length() > 0) {
            return Integer.parseInt(strTrim.replace(' ', '0'));
        }
        return 0;
    }

    public static int f(String str, int i10, int i11) {
        String strSubstring = str.substring(i10, i11 + i10);
        Integer num = (Integer) f26157a.get(Character.valueOf(strSubstring.charAt(0)));
        if (num != null) {
            return Integer.parseInt(strSubstring.substring(1)) + (num.intValue() * 10000);
        }
        String strTrim = strSubstring.trim();
        if (strTrim.length() > 0) {
            return Integer.parseInt(strTrim.replace(' ', '0'));
        }
        return 0;
    }

    public static int g(String str, int i10) {
        int iE = e(str, i10, 2);
        int i11 = iE + 2000;
        return i11 > 2056 ? iE + 1900 : i11;
    }
}
