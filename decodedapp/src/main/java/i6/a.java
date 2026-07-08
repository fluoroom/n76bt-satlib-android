package i6;

import com.facebook.stetho.websocket.CloseCodes;
import j6.r;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private static int a(int i10, long j10) {
        long j11 = ((long) i10) - j10;
        if (j11 <= 2147483647L && j11 >= -2147483648L) {
            return (int) j11;
        }
        throw new NumberFormatException("Scale out of range: " + j11 + " while adjusting scale " + i10 + " to exponent " + j10);
    }

    public static BigDecimal b(String str) {
        return c(str.toCharArray());
    }

    public static BigDecimal c(char[] cArr) {
        return d(cArr, 0, cArr.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.math.BigDecimal d(char[] r3, int r4, int r5) {
        /*
            r0 = 500(0x1f4, float:7.0E-43)
            if (r5 >= r0) goto Le
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> La java.lang.ArithmeticException -> Lc
            r0.<init>(r3, r4, r5)     // Catch: java.lang.NumberFormatException -> La java.lang.ArithmeticException -> Lc
            return r0
        La:
            r0 = move-exception
            goto L15
        Lc:
            r0 = move-exception
            goto L15
        Le:
            int r0 = r5 / 10
            java.math.BigDecimal r3 = e(r3, r4, r5, r0)     // Catch: java.lang.NumberFormatException -> La java.lang.ArithmeticException -> Lc
            return r3
        L15:
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L1d
            java.lang.String r0 = "Not a valid number representation"
        L1d:
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r5 > r1) goto L27
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3, r4, r5)
            goto L4a
        L27:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = new java.lang.String
            char[] r4 = java.util.Arrays.copyOfRange(r3, r4, r1)
            r2.<init>(r4)
            r5.append(r2)
            java.lang.String r4 = "(truncated, full length is "
            r5.append(r4)
            int r3 = r3.length
            r5.append(r3)
            java.lang.String r3 = " chars)"
            r5.append(r3)
            java.lang.String r1 = r5.toString()
        L4a:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Value \""
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = "\" can not be represented as `java.math.BigDecimal`, reason: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.a.d(char[], int, int):java.math.BigDecimal");
    }

    private static BigDecimal e(char[] cArr, int i10, int i11, int i12) {
        int i13;
        BigDecimal bigDecimalG;
        int i14 = i10 + i11;
        int i15 = i10;
        int i16 = i15;
        int i17 = -1;
        int iA = 0;
        int i18 = -1;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (i15 < i14) {
            char c10 = cArr[i15];
            if (c10 != '+') {
                if (c10 == 'E' || c10 == 'e') {
                    if (i17 >= 0) {
                        throw new NumberFormatException("Multiple exponent markers");
                    }
                    i17 = i15;
                } else if (c10 != '-') {
                    if (c10 != '.') {
                        if (i18 >= 0 && i17 == -1) {
                            iA++;
                        }
                    } else {
                        if (i18 >= 0) {
                            throw new NumberFormatException("Multiple decimal points");
                        }
                        i18 = i15;
                    }
                } else if (i17 >= 0) {
                    if (z11) {
                        throw new NumberFormatException("Multiple signs in exponent");
                    }
                    z11 = true;
                } else {
                    if (z10) {
                        throw new NumberFormatException("Multiple signs in number");
                    }
                    i16 = i15 + 1;
                    z10 = true;
                    z12 = true;
                }
            } else if (i17 >= 0) {
                if (z11) {
                    throw new NumberFormatException("Multiple signs in exponent");
                }
                z11 = true;
            } else {
                if (z10) {
                    throw new NumberFormatException("Multiple signs in number");
                }
                i16 = i15 + 1;
                z10 = true;
            }
            i15++;
        }
        if (i17 >= 0) {
            i13 = Integer.parseInt(new String(cArr, i17 + 1, (i14 - i17) - 1));
            iA = a(iA, i13);
            i14 = i17;
        } else {
            i13 = 0;
        }
        if (i18 >= 0) {
            int i19 = (i14 - i18) - 1;
            bigDecimalG = g(cArr, i16, i18 - i16, i13, i12).add(g(cArr, i18 + 1, i19, i13 - i19, i12));
        } else {
            bigDecimalG = g(cArr, i16, i14 - i16, i13, i12);
        }
        if (iA != 0) {
            bigDecimalG = bigDecimalG.setScale(iA);
        }
        return z12 ? bigDecimalG.negate() : bigDecimalG;
    }

    public static BigDecimal f(String str) {
        try {
            return r.a(str);
        } catch (NumberFormatException e10) {
            if (str.length() > 1000) {
                str = str.substring(0, CloseCodes.NORMAL_CLOSURE) + " [truncated]";
            }
            throw new NumberFormatException("Value \"" + str + "\" can not be represented as `java.math.BigDecimal`, reason: " + e10.getMessage());
        }
    }

    private static BigDecimal g(char[] cArr, int i10, int i11, int i12, int i13) {
        if (i11 <= i13) {
            return i11 == 0 ? BigDecimal.ZERO : new BigDecimal(cArr, i10, i11).scaleByPowerOfTen(i12);
        }
        int i14 = i11 / 2;
        return g(cArr, i10, i14, (i12 + i11) - i14, i13).add(g(cArr, i10 + i14, i11 - i14, i12, i13));
    }
}
