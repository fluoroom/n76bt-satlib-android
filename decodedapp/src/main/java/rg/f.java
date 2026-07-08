package rg;

import org.msgpack.core.MessagePack;
import rg.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f26028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f26029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f26030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f26031d;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f26028a = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        f26029b = iArr2;
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f26030c = iArr3;
        long[] jArr = new long[256];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f26031d = jArr;
    }

    private static final int a(long j10) {
        if (0 <= j10 && j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) dd.z.g(dd.z.d(j10))));
    }

    private static final int b(byte[] bArr, int i10, String str, String str2, int[] iArr, char[] cArr, int i11) {
        return f(str2, cArr, c(bArr, i10, iArr, cArr, f(str, cArr, i11)));
    }

    private static final int c(byte[] bArr, int i10, int[] iArr, char[] cArr, int i11) {
        int i12 = iArr[bArr[i10] & MessagePack.Code.EXT_TIMESTAMP];
        cArr[i11] = (char) (i12 >> 8);
        cArr[i11 + 1] = (char) (i12 & 255);
        return i11 + 2;
    }

    private static final int d(int i10, int i11, int i12, int i13) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j10 = i11;
        return a((((long) i10) * (((((long) i12) + 2) + ((long) i13)) + j10)) - j10);
    }

    public static final int e(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i17 = i10 - 1;
        int i18 = i17 / i11;
        int i19 = (i11 - 1) / i12;
        int i20 = i10 % i11;
        if (i20 != 0) {
            i11 = i20;
        }
        int i21 = (i19 * i18) + ((i11 - 1) / i12);
        return a(((long) i18) + (((long) i21) * ((long) i13)) + (((long) ((i17 - i18) - i21)) * ((long) i14)) + (((long) i10) * (((long) i15) + 2 + ((long) i16))));
    }

    private static final int f(String str, char[] cArr, int i10) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                rd.m.c(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i10);
            } else {
                cArr[i10] = str.charAt(0);
            }
        }
        return i10 + str.length();
    }

    public static final String g(byte[] bArr, int i10, int i11, g gVar) {
        rd.m.e(bArr, "<this>");
        rd.m.e(gVar, "format");
        ed.d.f11750a.a(i10, i11, bArr.length);
        if (i10 == i11) {
            return "";
        }
        int[] iArr = gVar.d() ? f26029b : f26028a;
        g.a aVarC = gVar.c();
        return aVarC.i() ? j(bArr, i10, i11, aVarC, iArr) : m(bArr, i10, i11, aVarC, iArr);
    }

    public static final String h(byte[] bArr, g gVar) {
        rd.m.e(bArr, "<this>");
        rd.m.e(gVar, "format");
        return g(bArr, 0, bArr.length, gVar);
    }

    public static /* synthetic */ String i(byte[] bArr, g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = g.f26032d.a();
        }
        return h(bArr, gVar);
    }

    private static final String j(byte[] bArr, int i10, int i11, g.a aVar, int[] iArr) {
        return aVar.j() ? l(bArr, i10, i11, aVar, iArr) : k(bArr, i10, i11, aVar, iArr);
    }

    private static final String k(byte[] bArr, int i10, int i11, g.a aVar, int[] iArr) {
        String strC = aVar.c();
        String strE = aVar.e();
        String strD = aVar.d();
        char[] cArr = new char[d(i11 - i10, strD.length(), strC.length(), strE.length())];
        int iB = b(bArr, i10, strC, strE, iArr, cArr, 0);
        for (int i12 = i10 + 1; i12 < i11; i12++) {
            iB = b(bArr, i12, strC, strE, iArr, cArr, f(strD, cArr, iB));
        }
        return b0.t(cArr);
    }

    private static final String l(byte[] bArr, int i10, int i11, g.a aVar, int[] iArr) {
        int length = aVar.d().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 - i10;
        int iC = 0;
        if (length == 0) {
            char[] cArr = new char[a(((long) i12) * 2)];
            while (i10 < i11) {
                iC = c(bArr, i10, iArr, cArr, iC);
                i10++;
            }
            return b0.t(cArr);
        }
        char[] cArr2 = new char[a((((long) i12) * 3) - 1)];
        char cCharAt = aVar.d().charAt(0);
        int iC2 = c(bArr, i10, iArr, cArr2, 0);
        for (int i13 = i10 + 1; i13 < i11; i13++) {
            cArr2[iC2] = cCharAt;
            iC2 = c(bArr, i13, iArr, cArr2, iC2 + 1);
        }
        return b0.t(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String m(byte[] r17, int r18, int r19, rg.g.a r20, int[] r21) {
        /*
            r0 = r19
            int r2 = r20.g()
            int r3 = r20.f()
            java.lang.String r8 = r20.c()
            java.lang.String r9 = r20.e()
            java.lang.String r11 = r20.d()
            java.lang.String r12 = r20.h()
            int r1 = r0 - r18
            int r4 = r12.length()
            int r5 = r11.length()
            int r6 = r8.length()
            int r7 = r9.length()
            int r1 = e(r1, r2, r3, r4, r5, r6, r7)
            r7 = r9
            char[] r9 = new char[r1]
            r13 = 0
            r5 = r18
            r4 = 0
            r6 = 0
            r10 = 0
        L39:
            if (r5 >= r0) goto L72
            if (r6 != r2) goto L47
            int r6 = r4 + 1
            r10 = 10
            r9[r4] = r10
            r4 = r6
            r14 = 0
        L45:
            r15 = 0
            goto L51
        L47:
            if (r10 != r3) goto L4f
            int r4 = f(r12, r9, r4)
            r14 = r6
            goto L45
        L4f:
            r14 = r6
            r15 = r10
        L51:
            if (r15 == 0) goto L57
            int r4 = f(r11, r9, r4)
        L57:
            r10 = r4
            r6 = r8
            r4 = r17
            r8 = r21
            int r10 = b(r4, r5, r6, r7, r8, r9, r10)
            int r4 = r15 + 1
            int r8 = r14 + 1
            int r5 = r5 + 1
            r16 = r10
            r10 = r4
            r4 = r16
            r16 = r8
            r8 = r6
            r6 = r16
            goto L39
        L72:
            if (r4 != r1) goto L79
            java.lang.String r0 = rg.b0.t(r9)
            return r0
        L79:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.f.m(byte[], int, int, rg.g$a, int[]):java.lang.String");
    }
}
