package aj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f683c = Double.doubleToRawLongBits(0.0d);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f684d = Double.doubleToRawLongBits(-0.0d);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f685e = Float.floatToRawIntBits(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f686f = Float.floatToRawIntBits(-0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f681a = Double.longBitsToDouble(4368491638549381120L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f682b = Double.longBitsToDouble(4503599627370496L);

    public static boolean a(double d10, double d11) {
        return b(d10, d11, 1);
    }

    public static boolean b(double d10, double d11, int i10) {
        long j10;
        long j11;
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(d11);
        if (((jDoubleToRawLongBits ^ jDoubleToRawLongBits2) & Long.MIN_VALUE) != 0) {
            if (jDoubleToRawLongBits < jDoubleToRawLongBits2) {
                j10 = jDoubleToRawLongBits2 - f683c;
                j11 = jDoubleToRawLongBits - f684d;
            } else {
                long j12 = jDoubleToRawLongBits - f683c;
                long j13 = jDoubleToRawLongBits2 - f684d;
                j10 = j12;
                j11 = j13;
            }
            long j14 = i10;
            if (j10 > j14 || j11 > j14 - j10) {
                return false;
            }
        } else if (d.d(jDoubleToRawLongBits - jDoubleToRawLongBits2) > i10) {
            return false;
        }
        return (Double.isNaN(d10) || Double.isNaN(d11)) ? false : true;
    }
}
