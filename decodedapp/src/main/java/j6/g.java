package j6;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: loaded from: classes.dex */
abstract class g extends c {
    g() {
    }

    private long f(CharSequence charSequence, int i10, int i11, int i12, boolean z10, boolean z11) {
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        boolean z12;
        int i17;
        g gVar;
        int i18;
        boolean z13;
        int i19;
        int i20 = -1;
        int i21 = i10;
        long j11 = 0;
        char cCharAt = 0;
        boolean z14 = false;
        while (true) {
            if (i21 >= i12) {
                break;
            }
            cCharAt = charSequence.charAt(i21);
            if (!k.b(cCharAt)) {
                if (cCharAt != '.') {
                    break;
                }
                z14 |= i20 >= 0;
                i20 = i21;
            } else {
                j11 = ((j11 * 10) + ((long) cCharAt)) - 48;
            }
            i21++;
        }
        if (i20 < 0) {
            i14 = i21 - i10;
            i20 = i21;
            i13 = 0;
        } else {
            i13 = (i20 - i21) + 1;
            i14 = (i21 - i10) - 1;
        }
        if ((cCharAt | ' ') == 101) {
            i15 = i21 + 1;
            char cA = h.a(charSequence, i15, i12);
            boolean z15 = cA == '-';
            if (z15 || cA == '+') {
                i15 = i21 + 2;
                cA = h.a(charSequence, i15, i12);
            }
            boolean z16 = z14 | (!k.b(cA));
            int i22 = 0;
            do {
                if (i22 < 1024) {
                    i22 = ((i22 * 10) + cA) - 48;
                }
                i15++;
                cA = h.a(charSequence, i15, i12);
            } while (k.b(cA));
            if (z15) {
                i22 = -i22;
            }
            i13 += i22;
            int i23 = i22;
            cCharAt = cA;
            i16 = i23;
            z14 = z16;
        } else {
            i15 = i21;
            i16 = 0;
        }
        if ((cCharAt | '\"') == 102) {
            i15++;
        }
        int iK = k(charSequence, i15, i12);
        if (z14 || iK < i12 || (!z11 && i14 == 0)) {
            throw new NumberFormatException("illegal syntax");
        }
        if (i14 > 19) {
            int i24 = i10;
            int i25 = 0;
            long j12 = 0;
            while (i24 < i21) {
                char cCharAt2 = charSequence.charAt(i24);
                if (cCharAt2 != '.') {
                    if (Long.compare(j12 ^ Long.MIN_VALUE, 1000000000000000000L ^ Long.MIN_VALUE) >= 0) {
                        break;
                    }
                    j12 = ((j12 * 10) + ((long) cCharAt2)) - 48;
                } else {
                    i25++;
                }
                i24++;
            }
            i17 = (i20 - i24) + i25 + i16;
            j10 = j12;
            z12 = i24 < i21;
            gVar = this;
            z13 = z10;
            i19 = i13;
            i18 = i11;
        } else {
            j10 = j11;
            z12 = false;
            i17 = 0;
            gVar = this;
            i18 = i11;
            z13 = z10;
            i19 = i13;
        }
        return gVar.l(charSequence, i18, i12, z13, j10, i19, z12, i17);
    }

    private long h(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        int i13;
        int iMin;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        boolean z11;
        int i18 = -1;
        int i19 = i10;
        long j11 = 0;
        char cCharAt = 0;
        boolean z12 = false;
        while (true) {
            if (i19 >= i12) {
                break;
            }
            cCharAt = charSequence.charAt(i19);
            int iC = h.c(cCharAt);
            if (iC < 0) {
                if (iC != -4) {
                    break;
                }
                z12 |= i18 >= 0;
                int i20 = i19;
                while (i20 < i12 - 8) {
                    long jH = k.h(charSequence, i20 + 1);
                    if (jH < 0) {
                        break;
                    }
                    j11 = (j11 << 32) + jH;
                    i20 += 8;
                }
                int i21 = i19;
                i19 = i20;
                i18 = i21;
            } else {
                j11 = (j11 << 4) | ((long) iC);
            }
            i19++;
        }
        if (i18 < 0) {
            i13 = i19 - i10;
            i18 = i19;
            iMin = 0;
        } else {
            i13 = (i19 - i10) - 1;
            iMin = Math.min((i18 - i19) + 1, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) * 4;
        }
        boolean z13 = (cCharAt | ' ') == 112;
        if (z13) {
            i14 = i19 + 1;
            char cA = h.a(charSequence, i14, i12);
            boolean z14 = cA == '-';
            if (z14 || cA == '+') {
                i14 = i19 + 2;
                cA = h.a(charSequence, i14, i12);
            }
            boolean z15 = z12 | (!k.b(cA));
            int i22 = 0;
            do {
                if (i22 < 1024) {
                    i22 = ((i22 * 10) + cA) - 48;
                }
                i14++;
                cA = h.a(charSequence, i14, i12);
            } while (k.b(cA));
            if (z14) {
                i22 = -i22;
            }
            iMin += i22;
            int i23 = i22;
            cCharAt = cA;
            i15 = i23;
            z12 = z15;
        } else {
            i14 = i19;
            i15 = 0;
        }
        if ((cCharAt | '\"') == 102) {
            i14++;
        }
        int iK = k(charSequence, i14, i12);
        if (z12 || iK < i12 || i13 == 0 || !z13) {
            throw new NumberFormatException("illegal syntax");
        }
        if (i13 > 16) {
            int i24 = i10;
            int i25 = 0;
            long j12 = 0;
            while (i24 < i19) {
                int iC2 = h.c(charSequence.charAt(i24));
                if (iC2 < 0) {
                    i25++;
                } else {
                    if (Long.compare(j12 ^ Long.MIN_VALUE, 1000000000000000000L ^ Long.MIN_VALUE) >= 0) {
                        break;
                    }
                    j12 = (j12 << 4) | ((long) iC2);
                }
                i24++;
            }
            boolean z16 = i24 < i19;
            int i26 = i25;
            iK = i24;
            i17 = i26;
            i16 = i15;
            j10 = j12;
            z11 = z16;
        } else {
            i16 = i15;
            j10 = j11;
            i17 = 0;
            z11 = false;
        }
        return m(charSequence, i11, i12, z10, j10, iMin, z11, (((i18 - iK) + i17) * 4) + i16);
    }

    private long i(CharSequence charSequence, int i10, int i11, boolean z10) {
        if (charSequence.charAt(i10) == 'N') {
            int i12 = i10 + 2;
            if (i12 < i11 && charSequence.charAt(i10 + 1) == 'a' && charSequence.charAt(i12) == 'N' && k(charSequence, i10 + 3, i11) == i11) {
                return d();
            }
        } else {
            int i13 = i10 + 7;
            if (i13 < i11 && charSequence.charAt(i10) == 'I' && charSequence.charAt(i10 + 1) == 'n' && charSequence.charAt(i10 + 2) == 'f' && charSequence.charAt(i10 + 3) == 'i' && charSequence.charAt(i10 + 4) == 'n' && charSequence.charAt(i10 + 5) == 'i' && charSequence.charAt(i10 + 6) == 't' && charSequence.charAt(i13) == 'y' && k(charSequence, i10 + 8, i11) == i11) {
                return z10 ? e() : j();
            }
        }
        throw new NumberFormatException("illegal syntax");
    }

    private static int k(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11 && charSequence.charAt(i10) <= ' ') {
            i10++;
        }
        return i10;
    }

    abstract long d();

    abstract long e();

    public final long g(CharSequence charSequence, int i10, int i11) {
        int i12;
        int iB = h.b(charSequence.length(), i10, i11);
        int iK = k(charSequence, i10, iB);
        if (iK == iB) {
            throw new NumberFormatException("illegal syntax");
        }
        char cCharAt = charSequence.charAt(iK);
        boolean z10 = cCharAt == '-';
        if ((z10 || cCharAt == '+') && (cCharAt = h.a(charSequence, (iK = iK + 1), iB)) == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        if (cCharAt >= 'I') {
            return i(charSequence, iK, iB, z10);
        }
        boolean z11 = cCharAt == '0';
        if (z11) {
            int i13 = iK + 1;
            if ((h.a(charSequence, i13, iB) | ' ') == 120) {
                return h(charSequence, iK + 2, i10, iB, z10);
            }
            i12 = i13;
        } else {
            i12 = iK;
        }
        return f(charSequence, i12, i10, iB, z10, z11);
    }

    abstract long j();

    abstract long l(CharSequence charSequence, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13);

    abstract long m(CharSequence charSequence, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13);
}
