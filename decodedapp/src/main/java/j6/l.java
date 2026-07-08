package j6;

/* JADX INFO: loaded from: classes.dex */
abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f18448a = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    static float a(float f10, int i10) {
        return f10 * Float.intBitsToFloat((i10 + 127) << 23);
    }

    static float b(boolean z10, long j10, int i10, boolean z11, int i11) {
        if (j10 == 0) {
            return z10 ? -0.0f : 0.0f;
        }
        if (!z11) {
            if (-45 > i10 || i10 > 38) {
                return Float.NaN;
            }
            return c(z10, j10, i10);
        }
        if (-45 <= i11 && i11 <= 38) {
            float fC = c(z10, j10, i11);
            float fC2 = c(z10, j10 + 1, i11);
            if (!Float.isNaN(fC) && fC2 == fC) {
                return fC;
            }
        }
        return Float.NaN;
    }

    static float c(boolean z10, long j10, int i10) {
        if (-10 <= i10 && i10 <= 10 && Long.compare(j10 ^ Long.MIN_VALUE, 16777215 ^ Long.MIN_VALUE) <= 0) {
            float f10 = j10;
            float f11 = i10 < 0 ? f10 / f18448a[-i10] : f10 * f18448a[i10];
            return z10 ? -f11 : f11;
        }
        long j11 = j.f18445a[i10 + 325];
        long j12 = ((((long) i10) * 217706) >> 16) + 191;
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j10);
        long jH = m.h(j10 << iNumberOfLeadingZeros, j11);
        long j13 = jH >>> 63;
        long j14 = jH >>> ((int) (38 + j13));
        int i11 = iNumberOfLeadingZeros + ((int) (j13 ^ 1));
        long j15 = jH & 274877906943L;
        if (j15 != 274877906943L) {
            if (j15 != 0 || (3 & j14) != 1) {
                long j16 = (j14 + 1) >>> 1;
                if (j16 >= 16777216) {
                    i11--;
                    j16 = 8388608;
                }
                long j17 = j16 & (-8388609);
                long j18 = j12 - ((long) i11);
                if (j18 >= 1 && j18 <= 254) {
                    return Float.intBitsToFloat((int) (j17 | (j18 << 23) | (z10 ? 2147483648L : 0L)));
                }
            }
        }
        return Float.NaN;
    }

    static float d(boolean z10, long j10, int i10, boolean z11, int i11) {
        if (z11) {
            i10 = i11;
        }
        if (-126 > i10 || i10 > 127) {
            return Float.NaN;
        }
        float fA = a(j10 + (j10 < 0 ? 1.8446744E19f : 0.0f), i10);
        return z10 ? -fA : fA;
    }
}
