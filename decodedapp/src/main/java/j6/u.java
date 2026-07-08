package j6;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
class u extends b {
    u() {
    }

    private BigInteger h(CharSequence charSequence, int i10, int i11, boolean z10) {
        int i12 = i11 - i10;
        if (b.f(i12)) {
            return j(charSequence, i10, i11, z10);
        }
        int i13 = (i12 & 7) + i10;
        long jM = k.m(charSequence, i10, i13);
        boolean z11 = jM >= 0;
        while (i13 < i11) {
            int iF = k.f(charSequence, i13);
            z11 &= iF >= 0;
            jM = (jM * 100000000) + ((long) iF);
            i13 += 8;
        }
        if (!z11) {
            throw new NumberFormatException("illegal syntax");
        }
        if (z10) {
            jM = -jM;
        }
        return BigInteger.valueOf(jM);
    }

    private BigInteger i(CharSequence charSequence, int i10, int i11, boolean z10) {
        boolean z11;
        int i12;
        int iK = k(charSequence, i10, i11);
        int i13 = i11 - iK;
        if (i13 <= 0) {
            return BigInteger.ZERO;
        }
        b.e(i13);
        byte[] bArr = new byte[((i13 + 1) >> 1) + 1];
        if ((i13 & 1) != 0) {
            int i14 = iK + 1;
            int iC = h.c(charSequence.charAt(iK));
            bArr[1] = (byte) iC;
            i12 = 2;
            z11 = iC < 0;
            iK = i14;
        } else {
            z11 = false;
            i12 = 1;
        }
        int i15 = ((i11 - iK) & 7) + iK;
        while (iK < i15) {
            char cCharAt = charSequence.charAt(iK);
            char cCharAt2 = charSequence.charAt(iK + 1);
            int iC2 = h.c(cCharAt);
            int iC3 = h.c(cCharAt2);
            int i16 = i12 + 1;
            bArr[i12] = (byte) ((iC2 << 4) | iC3);
            z11 |= iC3 < 0 || iC2 < 0;
            iK += 2;
            i12 = i16;
        }
        while (iK < i11) {
            long jH = k.h(charSequence, iK);
            k.n(bArr, i12, (int) jH);
            z11 |= jH < 0;
            iK += 8;
            i12 += 4;
        }
        if (z11) {
            throw new NumberFormatException("illegal syntax");
        }
        BigInteger bigInteger = new BigInteger(bArr);
        return z10 ? bigInteger.negate() : bigInteger;
    }

    private BigInteger j(CharSequence charSequence, int i10, int i11, boolean z10) {
        int iK = k(charSequence, i10, i11);
        b.d(i11 - iK);
        BigInteger bigIntegerB = e0.b(charSequence, iK, i11, m.e(iK, i11), 400);
        return z10 ? bigIntegerB.negate() : bigIntegerB;
    }

    private int k(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11 && charSequence.charAt(i10) == '0') {
            i10++;
        }
        return i10;
    }

    public BigInteger g(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        try {
            int iB = h.b(charSequence.length(), i10, i11);
            char cCharAt = charSequence.charAt(i10);
            boolean z10 = cCharAt == '-';
            if (z10 || cCharAt == '+') {
                i13 = i10 + 1;
                if (h.a(charSequence, i13, iB) == 0) {
                    throw new NumberFormatException("illegal syntax");
                }
            } else {
                i13 = i10;
            }
            return i12 != 10 ? i12 != 16 ? new BigInteger(charSequence.subSequence(i10, i11).toString(), i12) : i(charSequence, i13, iB, z10) : h(charSequence, i13, iB, z10);
        } catch (ArithmeticException e10) {
            NumberFormatException numberFormatException = new NumberFormatException("value exceeds limits");
            numberFormatException.initCause(e10);
            throw numberFormatException;
        }
    }
}
