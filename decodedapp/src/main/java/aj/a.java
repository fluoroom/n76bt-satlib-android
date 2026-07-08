package aj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static int a(int i10, int i11) {
        long j10 = ((long) i10) + ((long) i11);
        if (j10 < -2147483648L || j10 > 2147483647L) {
            throw new ui.g(ui.d.OVERFLOW_IN_ADDITION, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        return (int) j10;
    }

    public static int b(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        if (i10 == 0 || i11 == 0) {
            if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE) {
                throw new ui.g(ui.d.GCD_OVERFLOW_32_BITS, Integer.valueOf(i10), Integer.valueOf(i11));
            }
            return d.c(i10 + i11);
        }
        long j10 = i10;
        long j11 = i11;
        if (i10 < 0) {
            if (Integer.MIN_VALUE == i10) {
                i12 = i10;
                z10 = true;
            } else {
                i12 = -i10;
                z10 = false;
            }
            j10 = -j10;
        } else {
            i12 = i10;
            z10 = false;
        }
        if (i11 < 0) {
            if (Integer.MIN_VALUE == i11) {
                i13 = i11;
                z10 = true;
            } else {
                i13 = -i11;
            }
            j11 = -j11;
        } else {
            i13 = i11;
        }
        if (z10) {
            if (j10 == j11) {
                throw new ui.g(ui.d.GCD_OVERFLOW_32_BITS, Integer.valueOf(i10), Integer.valueOf(i11));
            }
            long j12 = j11 % j10;
            if (j12 == 0) {
                if (j10 <= 2147483647L) {
                    return (int) j10;
                }
                throw new ui.g(ui.d.GCD_OVERFLOW_32_BITS, Integer.valueOf(i10), Integer.valueOf(i11));
            }
            i13 = (int) j12;
            i12 = (int) (j10 % j12);
        }
        return c(i12, i13);
    }

    private static int c(int i10, int i11) {
        if (i10 == 0) {
            return i11;
        }
        if (i11 == 0) {
            return i10;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i10);
        int iNumberOfTrailingZeros2 = i10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(i11);
        int iMin = i11 >> iNumberOfTrailingZeros3;
        int iE = d.E(iNumberOfTrailingZeros, iNumberOfTrailingZeros3);
        while (iNumberOfTrailingZeros2 != iMin) {
            int i12 = iNumberOfTrailingZeros2 - iMin;
            iMin = Math.min(iNumberOfTrailingZeros2, iMin);
            int iAbs = Math.abs(i12);
            iNumberOfTrailingZeros2 = iAbs >> Integer.numberOfTrailingZeros(iAbs);
        }
        return iNumberOfTrailingZeros2 << iE;
    }

    public static int d(int i10, int i11) {
        long j10 = ((long) i10) * ((long) i11);
        if (j10 < -2147483648L || j10 > 2147483647L) {
            throw new ui.g(ui.d.ARITHMETIC_EXCEPTION, new Object[0]);
        }
        return (int) j10;
    }

    public static int e(int i10, int i11) {
        int iD = 1;
        if (i11 < 0) {
            throw new ui.e(ui.d.EXPONENT, Integer.valueOf(i11));
        }
        while (true) {
            if ((i11 & 1) != 0) {
                iD = d(iD, i10);
            }
            i11 >>= 1;
            if (i11 == 0) {
                return iD;
            }
            i10 = d(i10, i10);
        }
    }

    public static int f(int i10, int i11) {
        long j10 = ((long) i10) - ((long) i11);
        if (j10 < -2147483648L || j10 > 2147483647L) {
            throw new ui.g(ui.d.OVERFLOW_IN_SUBTRACTION, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        return (int) j10;
    }
}
