package j6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.NavigableMap;

/* JADX INFO: loaded from: classes.dex */
final class q extends a {
    public BigDecimal f(CharSequence charSequence, int i10, int i11) {
        boolean z10;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j11;
        int iK;
        int i17 = i10;
        try {
            int iB = h.b(charSequence.length(), i17, i11);
            if (a.e(i11)) {
                return g(charSequence, i10, i11);
            }
            char cA = h.a(charSequence, i17, iB);
            boolean z11 = cA == '-';
            if ((z11 || cA == '+') && (cA = h.a(charSequence, (i17 = i17 + 1), iB)) == 0) {
                throw new NumberFormatException("illegal syntax");
            }
            int i18 = -1;
            int i19 = i17;
            long j12 = 0;
            boolean z12 = false;
            while (i19 < iB) {
                cA = charSequence.charAt(i19);
                if (!k.b(cA)) {
                    if (cA != '.') {
                        break;
                    }
                    z12 |= i18 >= 0;
                    int i20 = i19;
                    while (i20 < iB - 4 && (iK = k.k(charSequence, i20 + 1)) >= 0) {
                        j12 = (j12 * 10000) + ((long) iK);
                        i20 += 4;
                    }
                    int i21 = i19;
                    i19 = i20;
                    i18 = i21;
                } else {
                    j12 = ((j12 * 10) + ((long) cA)) - 48;
                }
                i19++;
            }
            if (i18 < 0) {
                i13 = i19 - i17;
                i12 = i19;
                j10 = 0;
                z10 = true;
            } else {
                z10 = true;
                j10 = (i18 - i19) + 1;
                i12 = i18;
                i13 = (i19 - i17) - 1;
            }
            if ((cA | ' ') == 101) {
                int i22 = i19 + 1;
                char cA2 = h.a(charSequence, i22, iB);
                boolean z13 = cA2 == '-';
                if (z13 || cA2 == '+') {
                    i22 = i19 + 2;
                    cA2 = h.a(charSequence, i22, iB);
                }
                z12 |= !k.b(cA2);
                long j13 = 0;
                while (true) {
                    if (j13 < 2147483647L) {
                        i14 = i17;
                        i16 = i22;
                        j13 = ((j13 * 10) + ((long) cA2)) - 48;
                    } else {
                        i14 = i17;
                        i16 = i22;
                    }
                    j11 = j13;
                    i15 = i16 + 1;
                    cA2 = h.a(charSequence, i15, iB);
                    if (!k.b(cA2)) {
                        break;
                    }
                    j13 = j11;
                    i22 = i15;
                    i17 = i14;
                }
                if (z13) {
                    j11 = -j11;
                }
                j10 += j11;
            } else {
                i14 = i17;
                i15 = i19;
                i19 = iB;
            }
            if (i13 != 0) {
                z10 = false;
            }
            long j14 = j10;
            int i23 = i13;
            a.d(z12 | z10, i15, iB, i23, j14);
            if (i23 >= 19) {
                return h(charSequence, i14, i12, i12 + 1, i19, z11, (int) j14);
            }
            if (z11) {
                j12 = -j12;
            }
            return new BigDecimal(j12).scaleByPowerOfTen((int) j14);
        } catch (ArithmeticException e10) {
            NumberFormatException numberFormatException = new NumberFormatException("value exceeds limits");
            numberFormatException.initCause(e10);
            throw numberFormatException;
        }
    }

    BigDecimal g(CharSequence charSequence, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        long j10;
        int i15;
        int i16;
        int i17;
        boolean z10;
        int i18;
        long j11;
        int i19 = i10;
        int i20 = i19 + i11;
        char cA = h.a(charSequence, i19, i20);
        boolean z11 = cA == '-';
        if ((z11 || cA == '+') && (cA = h.a(charSequence, (i19 = i19 + 1), i20)) == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        int i21 = i19;
        while (true) {
            i12 = i20 - 8;
            if (i21 >= i12 || !k.d(charSequence, i21)) {
                break;
            }
            i21 += 8;
        }
        while (i21 < i20 && charSequence.charAt(i21) == '0') {
            i21++;
        }
        int i22 = i21;
        while (i22 < i12 && k.c(charSequence, i22)) {
            i22 += 8;
        }
        while (i22 < i20) {
            cA = charSequence.charAt(i22);
            if (!k.b(cA)) {
                break;
            }
            i22++;
        }
        if (cA == '.') {
            int i23 = i22 + 1;
            while (i23 < i12 && k.d(charSequence, i23)) {
                i23 += 8;
            }
            while (i23 < i20 && charSequence.charAt(i23) == '0') {
                i23++;
            }
            int i24 = i23;
            while (i24 < i12 && k.c(charSequence, i24)) {
                i24 += 8;
            }
            while (i24 < i20) {
                cA = charSequence.charAt(i24);
                if (!k.b(cA)) {
                    break;
                }
                i24++;
            }
            i14 = i23;
            i13 = i22;
            i22 = i24;
        } else {
            i13 = -1;
            i14 = -1;
        }
        if (i13 < 0) {
            i15 = i22 - i21;
            i14 = i22;
            i13 = i14;
            j10 = 0;
        } else {
            j10 = (i13 - i22) + 1;
            i15 = i21 == i13 ? i22 - i14 : (i22 - i21) - 1;
        }
        if ((cA | ' ') == 101) {
            int i25 = i22 + 1;
            char cA2 = h.a(charSequence, i25, i20);
            boolean z12 = cA2 == '-';
            if (z12 || cA2 == '+') {
                i25 = i22 + 2;
                cA2 = h.a(charSequence, i25, i20);
            }
            z10 = !k.b(cA2);
            long j12 = 0;
            while (true) {
                if (j12 < 2147483647L) {
                    i18 = i20;
                    j12 = ((j12 * 10) + ((long) cA2)) - 48;
                } else {
                    i18 = i20;
                }
                j11 = j12;
                i25++;
                i16 = i18;
                char cA3 = h.a(charSequence, i25, i16);
                if (!k.b(cA3)) {
                    break;
                }
                i20 = i16;
                cA2 = cA3;
                j12 = j11;
            }
            if (z12) {
                j11 = -j11;
            }
            j10 += j11;
            i17 = i25;
        } else {
            i16 = i20;
            i17 = i22;
            z10 = false;
            i22 = i16;
        }
        long j13 = j10;
        a.d(z10 | (i19 == i13 && i13 == i22), i17, i16, i15, j13);
        return h(charSequence, i21, i13, i14, i22, z11, (int) j13);
    }

    BigDecimal h(CharSequence charSequence, int i10, int i11, int i12, int i13, boolean z10, int i14) {
        BigInteger bigIntegerNegate;
        BigInteger bigIntegerA;
        int i15 = (i13 - i11) - 1;
        int i16 = i13 - i12;
        int i17 = i11 - i10;
        NavigableMap navigableMapC = null;
        if (i17 <= 0) {
            bigIntegerNegate = BigInteger.ZERO;
        } else if (i17 > 400) {
            navigableMapC = m.c();
            m.f(navigableMapC, i10, i11);
            bigIntegerNegate = e0.b(charSequence, i10, i11, navigableMapC, 400);
        } else {
            bigIntegerNegate = e0.a(charSequence, i10, i11);
        }
        if (i15 > 0) {
            if (i16 > 400) {
                if (navigableMapC == null) {
                    navigableMapC = m.c();
                }
                m.f(navigableMapC, i12, i13);
                bigIntegerA = e0.b(charSequence, i12, i13, navigableMapC, 400);
            } else {
                bigIntegerA = e0.a(charSequence, i12, i13);
            }
            if (bigIntegerNegate.signum() != 0) {
                bigIntegerA = n.k(bigIntegerNegate, m.a(navigableMapC, i15)).add(bigIntegerA);
            }
            bigIntegerNegate = bigIntegerA;
        }
        if (z10) {
            bigIntegerNegate = bigIntegerNegate.negate();
        }
        return new BigDecimal(bigIntegerNegate, -i14);
    }
}
