package a6;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static String a(int i10, int i11, int i12, boolean z10) {
        return b(i10, i11, i12, z10, true);
    }

    public static String b(int i10, int i11, int i12, boolean z10, boolean z11) {
        return c(i10, i11, i12, z10, z11);
    }

    public static String c(long j10, int i10, int i11, boolean z10, boolean z11) {
        int iD;
        int i12;
        if (!z11 && j10 != 0 && (i12 = i10 - i11) > (iD = d(j10))) {
            i11 += i12 - iD;
        }
        BigDecimal bigDecimalDivide = new BigDecimal(j10).divide(new BigDecimal(10).pow(i10), i11, RoundingMode.HALF_UP);
        return ((j10 < 0 || !z10) ? "" : "+") + bigDecimalDivide.toPlainString();
    }

    public static int d(long j10) {
        String string = Long.toString(j10);
        int i10 = 0;
        for (int length = string.length() - 1; length >= 0 && string.charAt(length) == '0'; length--) {
            i10++;
        }
        return i10;
    }

    public static int e(int i10, int i11, int i12, int i13) {
        int iPow = (int) Math.pow(10.0d, i13);
        int i14 = i12 - (i12 % (iPow * 10));
        int i15 = (i14 + iPow) - 1;
        int i16 = 0;
        int i17 = 0;
        while (i16 < 10 && i14 <= i11) {
            if (i15 >= i10) {
                i17 |= 1 << i16;
            }
            i16++;
            i14 += iPow;
            i15 += iPow;
        }
        return i17;
    }
}
