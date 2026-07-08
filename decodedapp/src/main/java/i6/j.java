package i6;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.facebook.stetho.websocket.CloseCodes;
import s4.d4;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f15806a = 1000000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f15807b = 1000000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f15808c = 1000000000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f15809d = -2147483648L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f15810e = 2147483647L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f15811f = String.valueOf(RtlSpacingHelper.UNDEFINED);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f15812g = String.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f15813h = new int[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f15814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f15815j;

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 10; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                int i13 = 0;
                while (i13 < 10) {
                    f15813h[i10] = ((i11 + 48) << 16) | ((i12 + 48) << 8) | (i13 + 48);
                    i13++;
                    i10++;
                }
            }
        }
        f15814i = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        f15815j = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    private static int a(int i10, char[] cArr, int i11) {
        int i12 = f15813h[i10];
        cArr[i11] = (char) (i12 >> 16);
        int i13 = i11 + 2;
        cArr[i11 + 1] = (char) ((i12 >> 8) & 127);
        int i14 = i11 + 3;
        cArr[i13] = (char) (i12 & 127);
        return i14;
    }

    private static int b(int i10, char[] cArr, int i11) {
        int i12 = f15813h[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                cArr[i11] = (char) (i12 >> 16);
                i11++;
            }
            cArr[i11] = (char) ((i12 >> 8) & 127);
            i11++;
        }
        int i13 = i11 + 1;
        cArr[i11] = (char) (i12 & 127);
        return i13;
    }

    private static int c(int i10, char[] cArr, int i11) {
        int i12 = i10 / CloseCodes.NORMAL_CLOSURE;
        int i13 = i10 - (i12 * CloseCodes.NORMAL_CLOSURE);
        int i14 = i12 / CloseCodes.NORMAL_CLOSURE;
        int[] iArr = f15813h;
        int i15 = iArr[i14];
        cArr[i11] = (char) (i15 >> 16);
        cArr[i11 + 1] = (char) ((i15 >> 8) & 127);
        cArr[i11 + 2] = (char) (i15 & 127);
        int i16 = iArr[i12 - (i14 * CloseCodes.NORMAL_CLOSURE)];
        cArr[i11 + 3] = (char) (i16 >> 16);
        cArr[i11 + 4] = (char) ((i16 >> 8) & 127);
        cArr[i11 + 5] = (char) (i16 & 127);
        int i17 = iArr[i13];
        cArr[i11 + 6] = (char) (i17 >> 16);
        int i18 = i11 + 8;
        cArr[i11 + 7] = (char) ((i17 >> 8) & 127);
        int i19 = i11 + 9;
        cArr[i18] = (char) (i17 & 127);
        return i19;
    }

    private static int d(char[] cArr, int i10) {
        String str = f15811f;
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return i10 + length;
    }

    private static int e(char[] cArr, int i10) {
        String str = f15812g;
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return i10 + length;
    }

    private static int f(int i10, char[] cArr, int i11) {
        if (i10 < f15806a) {
            if (i10 < 1000) {
                return b(i10, cArr, i11);
            }
            int i12 = i10 / CloseCodes.NORMAL_CLOSURE;
            return g(cArr, i11, i12, i10 - (i12 * CloseCodes.NORMAL_CLOSURE));
        }
        int i13 = i10 / CloseCodes.NORMAL_CLOSURE;
        int i14 = i10 - (i13 * CloseCodes.NORMAL_CLOSURE);
        int i15 = i13 / CloseCodes.NORMAL_CLOSURE;
        int i16 = i13 - (i15 * CloseCodes.NORMAL_CLOSURE);
        int iB = b(i15, cArr, i11);
        int[] iArr = f15813h;
        int i17 = iArr[i16];
        cArr[iB] = (char) (i17 >> 16);
        cArr[iB + 1] = (char) ((i17 >> 8) & 127);
        cArr[iB + 2] = (char) (i17 & 127);
        int i18 = iArr[i14];
        cArr[iB + 3] = (char) (i18 >> 16);
        int i19 = iB + 5;
        cArr[iB + 4] = (char) ((i18 >> 8) & 127);
        int i20 = iB + 6;
        cArr[i19] = (char) (i18 & 127);
        return i20;
    }

    private static int g(char[] cArr, int i10, int i11, int i12) {
        int[] iArr = f15813h;
        int i13 = iArr[i11];
        if (i11 > 9) {
            if (i11 > 99) {
                cArr[i10] = (char) (i13 >> 16);
                i10++;
            }
            cArr[i10] = (char) ((i13 >> 8) & 127);
            i10++;
        }
        cArr[i10] = (char) (i13 & 127);
        int i14 = iArr[i12];
        cArr[i10 + 1] = (char) (i14 >> 16);
        int i15 = i10 + 3;
        cArr[i10 + 2] = (char) ((i14 >> 8) & 127);
        int i16 = i10 + 4;
        cArr[i15] = (char) (i14 & 127);
        return i16;
    }

    public static boolean h(double d10) {
        return !f6.b.a(d10);
    }

    public static boolean i(float f10) {
        return !d4.a(f10);
    }

    public static int j(int i10, char[] cArr, int i11) {
        int i12;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                return d(cArr, i11);
            }
            cArr[i11] = '-';
            i10 = -i10;
            i11++;
        }
        if (i10 < f15806a) {
            if (i10 >= 1000) {
                int i13 = i10 / CloseCodes.NORMAL_CLOSURE;
                return a(i10 - (i13 * CloseCodes.NORMAL_CLOSURE), cArr, b(i13, cArr, i11));
            }
            if (i10 >= 10) {
                return b(i10, cArr, i11);
            }
            cArr[i11] = (char) (i10 + 48);
            return i11 + 1;
        }
        int i14 = f15807b;
        if (i10 < i14) {
            int i15 = i10 / CloseCodes.NORMAL_CLOSURE;
            int i16 = i10 - (i15 * CloseCodes.NORMAL_CLOSURE);
            int i17 = i15 / CloseCodes.NORMAL_CLOSURE;
            return a(i16, cArr, a(i15 - (i17 * CloseCodes.NORMAL_CLOSURE), cArr, b(i17, cArr, i11)));
        }
        int i18 = i10 - i14;
        if (i18 >= i14) {
            i18 -= i14;
            i12 = i11 + 1;
            cArr[i11] = '2';
        } else {
            i12 = i11 + 1;
            cArr[i11] = '1';
        }
        return c(i18, cArr, i12);
    }

    public static int k(long j10, char[] cArr, int i10) {
        int iC;
        if (j10 < 0) {
            if (j10 > f15809d) {
                return j((int) j10, cArr, i10);
            }
            if (j10 == Long.MIN_VALUE) {
                return e(cArr, i10);
            }
            cArr[i10] = '-';
            j10 = -j10;
            i10++;
        } else if (j10 <= f15810e) {
            return j((int) j10, cArr, i10);
        }
        long j11 = f15808c;
        long j12 = j10 / j11;
        long j13 = j10 - (j12 * j11);
        if (j12 < j11) {
            iC = f((int) j12, cArr, i10);
        } else {
            long j14 = j12 / j11;
            int iB = b((int) j14, cArr, i10);
            iC = c((int) (j12 - (j11 * j14)), cArr, iB);
        }
        return c((int) j13, cArr, iC);
    }

    public static String l(double d10) {
        return m(d10, false);
    }

    public static String m(double d10, boolean z10) {
        return z10 ? k6.a.p(d10) : Double.toString(d10);
    }

    public static String n(float f10) {
        return o(f10, false);
    }

    public static String o(float f10, boolean z10) {
        return z10 ? k6.b.o(f10) : Float.toString(f10);
    }

    public static String p(int i10) {
        String[] strArr = f15814i;
        if (i10 < strArr.length) {
            if (i10 >= 0) {
                return strArr[i10];
            }
            int i11 = (-i10) - 1;
            String[] strArr2 = f15815j;
            if (i11 < strArr2.length) {
                return strArr2[i11];
            }
        }
        return Integer.toString(i10);
    }

    public static String q(long j10) {
        return (j10 > 2147483647L || j10 < -2147483648L) ? Long.toString(j10) : p((int) j10);
    }
}
