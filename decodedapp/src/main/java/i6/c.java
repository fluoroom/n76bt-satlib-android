package i6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final char[] f15772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final char[] f15773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final byte[] f15774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final byte[] f15775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final int[] f15776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final int[] f15777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final int[] f15778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final int[] f15779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final int[] f15780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final int[] f15781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final int[] f15782k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final int[] f15783l;

    private static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f15784b = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[][] f15785a = new int[128][];

        private a() {
        }

        public int[] a(int i10) {
            int[] iArrCopyOf = this.f15785a[i10];
            if (iArrCopyOf == null) {
                iArrCopyOf = Arrays.copyOf(c.f15782k, 128);
                if (iArrCopyOf[i10] == 0) {
                    iArrCopyOf[i10] = -1;
                }
                this.f15785a[i10] = iArrCopyOf;
            }
            return iArrCopyOf;
        }
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f15772a = charArray;
        f15773b = "0123456789abcdef".toCharArray();
        int length = charArray.length;
        f15774c = new byte[length];
        f15775d = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            f15774c[i10] = (byte) f15772a[i10];
            f15775d[i10] = (byte) f15773b[i10];
        }
        int[] iArr = new int[256];
        for (int i11 = 0; i11 < 32; i11++) {
            iArr[i11] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f15776e = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i12 = 128; i12 < 256; i12++) {
            iArr2[i12] = (i12 & 224) == 192 ? 2 : (i12 & 240) == 224 ? 3 : (i12 & 248) == 240 ? 4 : -1;
        }
        f15777f = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i13 = 33; i13 < 256; i13++) {
            if (Character.isJavaIdentifierPart((char) i13)) {
                iArr3[i13] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f15778g = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f15779h = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f15777f;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f15780i = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        f15781j = iArr7;
        int[] iArr8 = new int[128];
        for (int i14 = 0; i14 < 32; i14++) {
            iArr8[i14] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f15782k = iArr8;
        int[] iArr9 = new int[256];
        f15783l = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i15 = 0; i15 < 10; i15++) {
            f15783l[i15 + 48] = i15;
        }
        for (int i16 = 0; i16 < 6; i16++) {
            int[] iArr10 = f15783l;
            int i17 = i16 + 10;
            iArr10[i16 + 97] = i17;
            iArr10[i16 + 65] = i17;
        }
    }

    public static void a(StringBuilder sb2, String str) {
        int[] iArr = f15782k;
        int length = iArr.length;
        int length2 = str.length();
        for (int i10 = 0; i10 < length2; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= length || iArr[cCharAt] == 0) {
                sb2.append(cCharAt);
            } else {
                sb2.append('\\');
                int i11 = iArr[cCharAt];
                if (i11 < 0) {
                    sb2.append('u');
                    sb2.append('0');
                    sb2.append('0');
                    char[] cArr = f15772a;
                    sb2.append(cArr[cCharAt >> 4]);
                    sb2.append(cArr[cCharAt & 15]);
                } else {
                    sb2.append((char) i11);
                }
            }
        }
    }

    public static int b(int i10) {
        return f15783l[i10 & 255];
    }

    public static byte[] c(boolean z10) {
        return (byte[]) (z10 ? f15774c.clone() : f15775d.clone());
    }

    public static char[] d(boolean z10) {
        return (char[]) (z10 ? f15772a.clone() : f15773b.clone());
    }

    public static int[] e() {
        return f15782k;
    }

    public static int[] f(int i10) {
        return i10 == 34 ? f15782k : a.f15784b.a(i10);
    }

    public static int[] g() {
        return f15776e;
    }

    public static int[] h() {
        return f15778g;
    }

    public static char i(int i10) {
        return f15772a[i10];
    }
}
