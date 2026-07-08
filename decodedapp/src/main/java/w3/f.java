package w3;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static void a(short[] sArr, int i10, int i11, float f10) {
        int i12 = i11 + i10;
        if (f10 <= 1.0f) {
            while (i10 < i12) {
                sArr[i10] = (short) (sArr[i10] * f10);
                i10++;
            }
            return;
        }
        while (i10 < i12) {
            int i13 = (int) (sArr[i10] * f10);
            if (i13 < -32768) {
                sArr[i10] = Short.MIN_VALUE;
            } else if (i13 > 32767) {
                sArr[i10] = Short.MAX_VALUE;
            } else {
                sArr[i10] = (short) i13;
            }
            i10++;
        }
    }

    public static void b(short[] sArr, int i10, int i11, float f10, float f11) {
        float f12 = (f11 - f10) / i11;
        int i12 = i11 + i10;
        while (i10 < i12) {
            int i13 = (int) (sArr[i10] * f10);
            if (i13 < -32768) {
                sArr[i10] = Short.MIN_VALUE;
            } else if (i13 > 32767) {
                sArr[i10] = Short.MAX_VALUE;
            } else {
                sArr[i10] = (short) i13;
            }
            f10 += f12;
            i10++;
        }
    }

    public static double c(double d10) {
        return Math.pow(10.0d, d10 / 20.0d);
    }
}
