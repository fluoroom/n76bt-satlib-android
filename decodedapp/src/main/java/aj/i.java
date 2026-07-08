package aj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static void a(double[] dArr, double[] dArr2) {
        b(dArr, dArr2, true);
    }

    public static boolean b(double[] dArr, double[] dArr2, boolean z10) {
        if (dArr.length == dArr2.length) {
            return true;
        }
        if (z10) {
            throw new ui.e(ui.d.DIMENSIONS_MISMATCH, Integer.valueOf(dArr.length), Integer.valueOf(dArr2.length));
        }
        return false;
    }

    public static boolean c(double[] dArr, double[] dArr2) {
        if (dArr == null || dArr2 == null) {
            return !((dArr == null) ^ (dArr2 == null));
        }
        if (dArr.length != dArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < dArr.length; i10++) {
            if (!l.a(dArr[i10], dArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    public static double d(double d10, double d11, double d12, double d13) {
        double dLongBitsToDouble = Double.longBitsToDouble(Double.doubleToRawLongBits(d10) & (-134217728));
        double d14 = d10 - dLongBitsToDouble;
        double dLongBitsToDouble2 = Double.longBitsToDouble(Double.doubleToRawLongBits(d11) & (-134217728));
        double d15 = d11 - dLongBitsToDouble2;
        double d16 = d10 * d11;
        double d17 = (d14 * d15) - (((d16 - (dLongBitsToDouble * dLongBitsToDouble2)) - (d14 * dLongBitsToDouble2)) - (dLongBitsToDouble * d15));
        double dLongBitsToDouble3 = Double.longBitsToDouble(Double.doubleToRawLongBits(d12) & (-134217728));
        double d18 = d12 - dLongBitsToDouble3;
        double dLongBitsToDouble4 = Double.longBitsToDouble((-134217728) & Double.doubleToRawLongBits(d13));
        double d19 = d13 - dLongBitsToDouble4;
        double d20 = d12 * d13;
        double d21 = (d18 * d19) - (((d20 - (dLongBitsToDouble3 * dLongBitsToDouble4)) - (d18 * dLongBitsToDouble4)) - (dLongBitsToDouble3 * d19));
        double d22 = d16 + d20;
        double d23 = d22 - d20;
        double d24 = d17 + d21 + (d20 - (d22 - d23)) + (d16 - d23) + d22;
        return (Double.isNaN(d24) || d24 == 0.0d) ? d22 : d24;
    }

    public static double e(double d10, double d11, double d12, double d13, double d14, double d15) {
        double dLongBitsToDouble = Double.longBitsToDouble(Double.doubleToRawLongBits(d10) & (-134217728));
        double d16 = d10 - dLongBitsToDouble;
        double dLongBitsToDouble2 = Double.longBitsToDouble(Double.doubleToRawLongBits(d11) & (-134217728));
        double d17 = d11 - dLongBitsToDouble2;
        double d18 = d10 * d11;
        double d19 = (d16 * d17) - (((d18 - (dLongBitsToDouble * dLongBitsToDouble2)) - (d16 * dLongBitsToDouble2)) - (dLongBitsToDouble * d17));
        double dLongBitsToDouble3 = Double.longBitsToDouble(Double.doubleToRawLongBits(d12) & (-134217728));
        double d20 = d12 - dLongBitsToDouble3;
        double dLongBitsToDouble4 = Double.longBitsToDouble(Double.doubleToRawLongBits(d13) & (-134217728));
        double d21 = d13 - dLongBitsToDouble4;
        double d22 = d12 * d13;
        double d23 = (d20 * d21) - (((d22 - (dLongBitsToDouble3 * dLongBitsToDouble4)) - (d20 * dLongBitsToDouble4)) - (dLongBitsToDouble3 * d21));
        double dLongBitsToDouble5 = Double.longBitsToDouble(Double.doubleToRawLongBits(d14) & (-134217728));
        double d24 = d14 - dLongBitsToDouble5;
        double dLongBitsToDouble6 = Double.longBitsToDouble((-134217728) & Double.doubleToRawLongBits(d15));
        double d25 = d15 - dLongBitsToDouble6;
        double d26 = d14 * d15;
        double d27 = (d24 * d25) - (((d26 - (dLongBitsToDouble5 * dLongBitsToDouble6)) - (d24 * dLongBitsToDouble6)) - (dLongBitsToDouble5 * d25));
        double d28 = d18 + d22;
        double d29 = d28 - d22;
        double d30 = (d22 - (d28 - d29)) + (d18 - d29);
        double d31 = d28 + d26;
        double d32 = d31 - d26;
        double d33 = d19 + d23 + d27 + d30 + (d26 - (d31 - d32)) + (d28 - d32) + d31;
        return (Double.isNaN(d33) || d33 == 0.0d) ? d31 : d33;
    }

    public static double f(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        double dLongBitsToDouble = Double.longBitsToDouble(Double.doubleToRawLongBits(d10) & (-134217728));
        double d18 = d10 - dLongBitsToDouble;
        double dLongBitsToDouble2 = Double.longBitsToDouble(Double.doubleToRawLongBits(d11) & (-134217728));
        double d19 = d11 - dLongBitsToDouble2;
        double d20 = d10 * d11;
        double d21 = (d18 * d19) - (((d20 - (dLongBitsToDouble * dLongBitsToDouble2)) - (d18 * dLongBitsToDouble2)) - (dLongBitsToDouble * d19));
        double dLongBitsToDouble3 = Double.longBitsToDouble(Double.doubleToRawLongBits(d12) & (-134217728));
        double d22 = d12 - dLongBitsToDouble3;
        double dLongBitsToDouble4 = Double.longBitsToDouble(Double.doubleToRawLongBits(d13) & (-134217728));
        double d23 = d13 - dLongBitsToDouble4;
        double d24 = d12 * d13;
        double d25 = (d22 * d23) - (((d24 - (dLongBitsToDouble3 * dLongBitsToDouble4)) - (d22 * dLongBitsToDouble4)) - (dLongBitsToDouble3 * d23));
        double dLongBitsToDouble5 = Double.longBitsToDouble(Double.doubleToRawLongBits(d14) & (-134217728));
        double d26 = d14 - dLongBitsToDouble5;
        double dLongBitsToDouble6 = Double.longBitsToDouble(Double.doubleToRawLongBits(d15) & (-134217728));
        double d27 = d15 - dLongBitsToDouble6;
        double d28 = d14 * d15;
        double d29 = (d26 * d27) - (((d28 - (dLongBitsToDouble5 * dLongBitsToDouble6)) - (d26 * dLongBitsToDouble6)) - (dLongBitsToDouble5 * d27));
        double dLongBitsToDouble7 = Double.longBitsToDouble(Double.doubleToRawLongBits(d16) & (-134217728));
        double d30 = d16 - dLongBitsToDouble7;
        double dLongBitsToDouble8 = Double.longBitsToDouble((-134217728) & Double.doubleToRawLongBits(d17));
        double d31 = d17 - dLongBitsToDouble8;
        double d32 = d16 * d17;
        double d33 = (d30 * d31) - (((d32 - (dLongBitsToDouble7 * dLongBitsToDouble8)) - (d30 * dLongBitsToDouble8)) - (dLongBitsToDouble7 * d31));
        double d34 = d20 + d24;
        double d35 = d34 - d24;
        double d36 = (d24 - (d34 - d35)) + (d20 - d35);
        double d37 = d34 + d28;
        double d38 = d37 - d28;
        double d39 = (d28 - (d37 - d38)) + (d34 - d38);
        double d40 = d37 + d32;
        double d41 = d40 - d32;
        double d42 = d21 + d25 + d29 + d33 + d36 + d39 + (d32 - (d40 - d41)) + (d37 - d41) + d40;
        return (Double.isNaN(d42) || d42 == 0.0d) ? d40 : d42;
    }

    public static double g(double[] dArr, double[] dArr2) {
        a(dArr, dArr2);
        int length = dArr.length;
        if (length == 1) {
            return dArr[0] * dArr2[0];
        }
        double[] dArr3 = new double[length];
        double d10 = 0.0d;
        for (int i10 = 0; i10 < length; i10++) {
            double d11 = dArr[i10];
            double dLongBitsToDouble = Double.longBitsToDouble(Double.doubleToRawLongBits(d11) & (-134217728));
            double d12 = d11 - dLongBitsToDouble;
            double d13 = dArr2[i10];
            double dLongBitsToDouble2 = Double.longBitsToDouble(Double.doubleToRawLongBits(d13) & (-134217728));
            double d14 = d13 - dLongBitsToDouble2;
            double d15 = d11 * d13;
            dArr3[i10] = d15;
            d10 += (d12 * d14) - (((d15 - (dLongBitsToDouble * dLongBitsToDouble2)) - (d12 * dLongBitsToDouble2)) - (dLongBitsToDouble * d14));
        }
        double d16 = dArr3[0];
        double d17 = dArr3[1];
        double d18 = d16 + d17;
        double d19 = d18 - d17;
        double d20 = (d17 - (d18 - d19)) + (d16 - d19);
        int i11 = length - 1;
        int i12 = 1;
        while (i12 < i11) {
            i12++;
            double d21 = dArr3[i12];
            double d22 = d18 + d21;
            double d23 = d22 - d21;
            d20 += (d21 - (d22 - d23)) + (d18 - d23);
            d18 = d22;
        }
        double d24 = d18 + d10 + d20;
        if (!Double.isNaN(d24) && d24 != 0.0d) {
            return d24;
        }
        double d25 = dArr[0] * dArr2[0];
        for (int i13 = 1; i13 < length; i13++) {
            d25 += dArr[i13] * dArr2[i13];
        }
        return d25;
    }
}
