package i6;

import com.facebook.stetho.websocket.CloseCodes;
import j6.d0;
import j6.z;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f15804a = String.valueOf(Long.MIN_VALUE).substring(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f15805b = String.valueOf(Long.MAX_VALUE);

    public static boolean a(String str, boolean z10) {
        String str2 = z10 ? f15804a : f15805b;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            int iCharAt = str.charAt(i10) - str2.charAt(i10);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static boolean b(char[] cArr, int i10, int i11, boolean z10) {
        String str = z10 ? f15804a : f15805b;
        int length = str.length();
        if (i11 < length) {
            return true;
        }
        if (i11 > length) {
            return false;
        }
        for (int i12 = 0; i12 < length; i12++) {
            int iCharAt = cArr[i10 + i12] - str.charAt(i12);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static int c(String str, int i10) {
        String strTrim;
        int length;
        if (str == null || (length = (strTrim = str.trim()).length()) == 0) {
            return i10;
        }
        int i11 = 0;
        char cCharAt = strTrim.charAt(0);
        if (cCharAt == '+') {
            strTrim = strTrim.substring(1);
            length = strTrim.length();
        } else if (cCharAt == '-') {
            i11 = 1;
        }
        while (i11 < length) {
            char cCharAt2 = strTrim.charAt(i11);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                try {
                    return (int) i(strTrim, true);
                } catch (NumberFormatException unused) {
                    return i10;
                }
            }
            i11++;
        }
        try {
            return Integer.parseInt(strTrim);
        } catch (NumberFormatException unused2) {
            return i10;
        }
    }

    public static long d(String str, long j10) {
        String strTrim;
        int length;
        if (str == null || (length = (strTrim = str.trim()).length()) == 0) {
            return j10;
        }
        int i10 = 0;
        char cCharAt = strTrim.charAt(0);
        if (cCharAt == '+') {
            strTrim = strTrim.substring(1);
            length = strTrim.length();
        } else if (cCharAt == '-') {
            i10 = 1;
        }
        while (i10 < length) {
            char cCharAt2 = strTrim.charAt(i10);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                try {
                    return (long) i(strTrim, true);
                } catch (NumberFormatException unused) {
                    return j10;
                }
            }
            i10++;
        }
        try {
            return Long.parseLong(strTrim);
        } catch (NumberFormatException unused2) {
            return j10;
        }
    }

    public static BigDecimal e(String str, boolean z10) {
        return z10 ? a.f(str) : a.b(str);
    }

    public static BigInteger f(String str) {
        return new BigInteger(str);
    }

    public static BigInteger g(String str, boolean z10) {
        return z10 ? b.a(str) : f(str);
    }

    public static double h(String str) {
        return i(str, false);
    }

    public static double i(String str, boolean z10) {
        return z10 ? z.a(str) : Double.parseDouble(str);
    }

    public static float j(String str, boolean z10) {
        return z10 ? d0.a(str) : Float.parseFloat(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0073, code lost:
    
        return java.lang.Integer.parseInt(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int k(java.lang.String r10) {
        /*
            r0 = 0
            char r1 = r10.charAt(r0)
            int r2 = r10.length()
            r3 = 45
            r4 = 1
            if (r1 != r3) goto Lf
            r0 = 1
        Lf:
            r3 = 2
            r5 = 10
            if (r0 == 0) goto L24
            if (r2 == r4) goto L1f
            if (r2 <= r5) goto L19
            goto L1f
        L19:
            char r1 = r10.charAt(r4)
            r4 = 2
            goto L2d
        L1f:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L24:
            r6 = 9
            if (r2 <= r6) goto L2d
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L2d:
            r6 = 57
            if (r1 > r6) goto L83
            r7 = 48
            if (r1 >= r7) goto L36
            goto L83
        L36:
            int r1 = r1 - r7
            if (r4 >= r2) goto L7e
            int r8 = r4 + 1
            char r9 = r10.charAt(r4)
            if (r9 > r6) goto L79
            if (r9 >= r7) goto L44
            goto L79
        L44:
            int r1 = r1 * 10
            int r9 = r9 - r7
            int r1 = r1 + r9
            if (r8 >= r2) goto L7e
            int r4 = r4 + r3
            char r3 = r10.charAt(r8)
            if (r3 > r6) goto L74
            if (r3 >= r7) goto L54
            goto L74
        L54:
            int r1 = r1 * 10
            int r3 = r3 - r7
            int r1 = r1 + r3
            if (r4 >= r2) goto L7e
        L5a:
            int r3 = r4 + 1
            char r4 = r10.charAt(r4)
            if (r4 > r6) goto L6f
            if (r4 >= r7) goto L65
            goto L6f
        L65:
            int r1 = r1 * 10
            int r4 = r4 + (-48)
            int r1 = r1 + r4
            if (r3 < r2) goto L6d
            goto L7e
        L6d:
            r4 = r3
            goto L5a
        L6f:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L74:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L79:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L7e:
            if (r0 == 0) goto L82
            int r10 = -r1
            return r10
        L82:
            return r1
        L83:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.i.k(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int l(char[] cArr, int i10, int i11) {
        if (i11 > 0 && cArr[i10] == '+') {
            i10++;
            i11--;
        }
        int i12 = cArr[(i10 + i11) - 1] - '0';
        switch (i11) {
            case 2:
                return i12 + ((cArr[i10] - '0') * 10);
            case 3:
                i12 += (cArr[i10] - '0') * 100;
                i10++;
                return i12 + ((cArr[i10] - '0') * 10);
            case 4:
                i12 += (cArr[i10] - '0') * CloseCodes.NORMAL_CLOSURE;
                i10++;
                i12 += (cArr[i10] - '0') * 100;
                i10++;
                return i12 + ((cArr[i10] - '0') * 10);
            case 5:
                i12 += (cArr[i10] - '0') * 10000;
                i10++;
                i12 += (cArr[i10] - '0') * CloseCodes.NORMAL_CLOSURE;
                i10++;
                i12 += (cArr[i10] - '0') * 100;
                i10++;
                return i12 + ((cArr[i10] - '0') * 10);
            case 6:
                i12 += (cArr[i10] - '0') * 100000;
                i10++;
                i12 += (cArr[i10] - '0') * 10000;
                i10++;
                i12 += (cArr[i10] - '0') * CloseCodes.NORMAL_CLOSURE;
                i10++;
                i12 += (cArr[i10] - '0') * 100;
                i10++;
                return i12 + ((cArr[i10] - '0') * 10);
            case 7:
                i12 += (cArr[i10] - '0') * 1000000;
                i10++;
                i12 += (cArr[i10] - '0') * 100000;
                i10++;
                i12 += (cArr[i10] - '0') * 10000;
                i10++;
                i12 += (cArr[i10] - '0') * CloseCodes.NORMAL_CLOSURE;
                i10++;
                i12 += (cArr[i10] - '0') * 100;
                i10++;
                return i12 + ((cArr[i10] - '0') * 10);
            case 8:
                i12 += (cArr[i10] - '0') * 10000000;
                i10++;
                i12 += (cArr[i10] - '0') * 1000000;
                i10++;
                i12 += (cArr[i10] - '0') * 100000;
                i10++;
                i12 += (cArr[i10] - '0') * 10000;
                i10++;
                i12 += (cArr[i10] - '0') * CloseCodes.NORMAL_CLOSURE;
                i10++;
                i12 += (cArr[i10] - '0') * 100;
                i10++;
                return i12 + ((cArr[i10] - '0') * 10);
            case 9:
                i12 += (cArr[i10] - '0') * 100000000;
                i10++;
                i12 += (cArr[i10] - '0') * 10000000;
                i10++;
                i12 += (cArr[i10] - '0') * 1000000;
                i10++;
                i12 += (cArr[i10] - '0') * 100000;
                i10++;
                i12 += (cArr[i10] - '0') * 10000;
                i10++;
                i12 += (cArr[i10] - '0') * CloseCodes.NORMAL_CLOSURE;
                i10++;
                i12 += (cArr[i10] - '0') * 100;
                i10++;
                return i12 + ((cArr[i10] - '0') * 10);
            default:
                return i12;
        }
    }

    public static long m(String str) {
        return str.length() <= 9 ? k(str) : Long.parseLong(str);
    }

    public static long n(char[] cArr, int i10, int i11) {
        int i12 = i11 - 9;
        return (((long) l(cArr, i10, i12)) * 1000000000) + ((long) l(cArr, i10 + i12, 9));
    }

    public static long o(char[] cArr, int i10, boolean z10) {
        long j10 = 0;
        for (int i11 = 0; i11 < 19; i11++) {
            j10 = (j10 * 10) + ((long) (cArr[i10 + i11] - '0'));
        }
        return z10 ? -j10 : j10;
    }
}
