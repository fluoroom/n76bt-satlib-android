package wh;

import java.io.EOFException;
import vh.c0;
import vh.i0;
import vh.r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a */
    private static final byte[] f31436a = r0.a("0123456789abcdef");

    /* JADX INFO: renamed from: b */
    private static final long[] f31437b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final long b(vh.e eVar, vh.h hVar, long j10, long j11, int i10, int i11) {
        i0 i0Var;
        int i12;
        long j12 = j10;
        long size = j11;
        rd.m.e(eVar, "<this>");
        rd.m.e(hVar, "bytes");
        long j13 = i11;
        vh.b.b(hVar.Q(), i10, j13);
        if (i11 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long size2 = 0;
        if (j12 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j12).toString());
        }
        if (j12 > size) {
            throw new IllegalArgumentException(("fromIndex > toIndex: " + j12 + " > " + size).toString());
        }
        if (size > eVar.size()) {
            size = eVar.size();
        }
        long j14 = -1;
        if (j12 == size || (i0Var = eVar.f30774a) == null) {
            return -1L;
        }
        if (eVar.size() - j12 >= j12) {
            while (true) {
                long j15 = ((long) (i0Var.f30811c - i0Var.f30810b)) + size2;
                if (j15 > j12) {
                    break;
                }
                i0Var = i0Var.f30814f;
                rd.m.b(i0Var);
                size2 = j15;
            }
            byte[] bArrV = hVar.v();
            byte b10 = bArrV[i10];
            long jMin = Math.min(size, (eVar.size() - j13) + 1);
            while (size2 < jMin) {
                byte[] bArr = i0Var.f30809a;
                long j16 = j12;
                int iMin = (int) Math.min(i0Var.f30811c, (((long) i0Var.f30810b) + jMin) - size2);
                i12 = (int) ((((long) i0Var.f30810b) + j16) - size2);
                while (i12 < iMin) {
                    if (bArr[i12] != b10 || !e(i0Var, i12 + 1, bArrV, i10 + 1, i11)) {
                        i12++;
                    }
                }
                size2 += (long) (i0Var.f30811c - i0Var.f30810b);
                i0Var = i0Var.f30814f;
                rd.m.b(i0Var);
                j12 = size2;
            }
            return -1L;
        }
        size2 = eVar.size();
        while (size2 > j12) {
            i0Var = i0Var.f30815g;
            rd.m.b(i0Var);
            size2 -= (long) (i0Var.f30811c - i0Var.f30810b);
            j14 = j14;
        }
        long j17 = j14;
        byte[] bArrV2 = hVar.v();
        byte b11 = bArrV2[i10];
        long jMin2 = Math.min(size, (eVar.size() - j13) + 1);
        while (size2 < jMin2) {
            byte[] bArr2 = i0Var.f30809a;
            long j18 = j12;
            int iMin2 = (int) Math.min(i0Var.f30811c, (((long) i0Var.f30810b) + jMin2) - size2);
            i12 = (int) ((((long) i0Var.f30810b) + j18) - size2);
            while (i12 < iMin2) {
                if (bArr2[i12] != b11 || !e(i0Var, i12 + 1, bArrV2, i10 + 1, i11)) {
                    i12++;
                }
            }
            size2 += (long) (i0Var.f30811c - i0Var.f30810b);
            i0Var = i0Var.f30814f;
            rd.m.b(i0Var);
            j12 = size2;
        }
        return j17;
        return ((long) (i12 - i0Var.f30810b)) + size2;
    }

    public static final int c(long j10) {
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j10)) * 10) >>> 5;
        return iNumberOfLeadingZeros + (j10 > f31437b[iNumberOfLeadingZeros] ? 1 : 0);
    }

    public static final byte[] d() {
        return f31436a;
    }

    public static final boolean e(i0 i0Var, int i10, byte[] bArr, int i11, int i12) {
        rd.m.e(i0Var, "segment");
        rd.m.e(bArr, "bytes");
        int i13 = i0Var.f30811c;
        byte[] bArr2 = i0Var.f30809a;
        while (i11 < i12) {
            if (i10 == i13) {
                i0Var = i0Var.f30814f;
                rd.m.b(i0Var);
                byte[] bArr3 = i0Var.f30809a;
                bArr2 = bArr3;
                i10 = i0Var.f30810b;
                i13 = i0Var.f30811c;
            }
            if (bArr2[i10] != bArr[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String f(vh.e eVar, long j10) throws EOFException {
        rd.m.e(eVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (eVar.G(j11) == 13) {
                String strO = eVar.o(j11);
                eVar.skip(2L);
                return strO;
            }
        }
        String strO2 = eVar.o(j10);
        eVar.skip(1L);
        return strO2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0064, code lost:
    
        if (r19 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0066, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0087, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a5 A[LOOP:0: B:63:0x0026->B:101:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int g(vh.e r17, vh.c0 r18, boolean r19) {
        /*
            r0 = r17
            java.lang.String r1 = "<this>"
            rd.m.e(r0, r1)
            java.lang.String r1 = "options"
            r2 = r18
            rd.m.e(r2, r1)
            vh.i0 r0 = r0.f30774a
            r1 = -2
            r3 = -1
            if (r0 != 0) goto L18
            if (r19 == 0) goto L17
            return r1
        L17:
            return r3
        L18:
            byte[] r4 = r0.f30809a
            int r5 = r0.f30810b
            int r6 = r0.f30811c
            int[] r2 = r2.h()
            r7 = 0
            r9 = r0
            r8 = 0
            r10 = -1
        L26:
            int r11 = r8 + 1
            r12 = r2[r8]
            int r8 = r8 + 2
            r11 = r2[r11]
            if (r11 == r3) goto L31
            r10 = r11
        L31:
            if (r9 != 0) goto L34
            goto L64
        L34:
            r11 = 0
            if (r12 >= 0) goto L7d
            int r12 = r12 * (-1)
            int r13 = r8 + r12
        L3b:
            int r12 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + 1
            r8 = r2[r8]
            if (r5 == r8) goto L48
            goto L87
        L48:
            if (r14 != r13) goto L4c
            r5 = 1
            goto L4d
        L4c:
            r5 = 0
        L4d:
            if (r12 != r6) goto L6d
            rd.m.b(r9)
            vh.i0 r4 = r9.f30814f
            rd.m.b(r4)
            int r6 = r4.f30810b
            byte[] r8 = r4.f30809a
            int r9 = r4.f30811c
            if (r4 != r0) goto L67
            if (r5 == 0) goto L64
            r4 = r8
            r8 = r11
            goto L70
        L64:
            if (r19 == 0) goto L87
            return r1
        L67:
            r16 = r8
            r8 = r4
            r4 = r16
            goto L70
        L6d:
            r8 = r9
            r9 = r6
            r6 = r12
        L70:
            if (r5 == 0) goto L78
            r5 = r2[r14]
            r13 = r6
            r6 = r9
            r9 = r8
            goto La2
        L78:
            r5 = r6
            r6 = r9
            r9 = r8
            r8 = r14
            goto L3b
        L7d:
            int r13 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + r12
        L85:
            if (r8 != r14) goto L88
        L87:
            return r10
        L88:
            r15 = r2[r8]
            if (r5 != r15) goto La9
            int r8 = r8 + r12
            r5 = r2[r8]
            if (r13 != r6) goto La2
            vh.i0 r9 = r9.f30814f
            rd.m.b(r9)
            int r4 = r9.f30810b
            byte[] r6 = r9.f30809a
            int r8 = r9.f30811c
            r13 = r4
            r4 = r6
            r6 = r8
            if (r9 != r0) goto La2
            r9 = r11
        La2:
            if (r5 < 0) goto La5
            return r5
        La5:
            int r8 = -r5
            r5 = r13
            goto L26
        La9:
            int r8 = r8 + 1
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.a.g(vh.e, vh.c0, boolean):int");
    }

    public static /* synthetic */ int h(vh.e eVar, c0 c0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return g(eVar, c0Var, z10);
    }
}
