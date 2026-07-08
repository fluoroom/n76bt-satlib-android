package aj;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long[] f634a = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final AtomicReference f635b = new AtomicReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f636c = a.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicReference f637d = new AtomicReference(null);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double[] f638a;

        private a(int i10, double[] dArr) {
            if (i10 < 0) {
                throw new ui.e(ui.d.NUMBER_TOO_SMALL, Integer.valueOf(i10), 0);
            }
            this.f638a = new double[i10];
            int length = (dArr == null || dArr.length <= 2) ? 2 : dArr.length <= i10 ? dArr.length : i10;
            for (int i11 = 2; i11 < length; i11++) {
                this.f638a[i11] = dArr[i11];
            }
            while (length < i10) {
                double[] dArr2 = this.f638a;
                dArr2[length] = dArr2[length - 1] + d.y(length);
                length++;
            }
        }

        public static a a() {
            return new a(0, null);
        }
    }

    public static long a(int i10) {
        if (i10 < 0) {
            throw new ui.e(ui.d.FACTORIAL_NEGATIVE_PARAMETER, Integer.valueOf(i10));
        }
        if (i10 <= 20) {
            return f634a[i10];
        }
        throw new ui.e(ui.d.NUMBER_TOO_LARGE, Integer.valueOf(i10), 20);
    }
}
