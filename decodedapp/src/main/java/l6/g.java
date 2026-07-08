package l6;

import e6.g;
import e6.n;
import e6.o;
import e6.p;
import i6.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public class g extends b {
    protected static final char[] K = i6.c.d(true);
    protected static final char[] L = i6.c.d(false);
    protected final Writer B;
    protected char C;
    protected char[] D;
    protected int E;
    protected int F;
    protected int G;
    protected char[] H;
    protected p I;
    protected char[] J;

    public g(i6.f fVar, int i10, n nVar, Writer writer, char c10) {
        super(fVar, i10, nVar);
        this.B = writer;
        char[] cArrE = fVar.e();
        this.D = cArrE;
        this.G = cArrE.length;
        this.C = c10;
        if (c10 != '\"') {
            this.f20433u = i6.c.f(c10);
        }
    }

    private final void C1(p pVar) throws IOException {
        char[] cArrA = pVar.a();
        T0(cArrA, 0, cArrA.length);
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i10 = this.F;
        this.F = i10 + 1;
        cArr[i10] = this.C;
    }

    private void D1(String str) throws IOException {
        s1();
        int length = str.length();
        int i10 = 0;
        while (true) {
            int i11 = this.G;
            if (i10 + i11 > length) {
                i11 = length - i10;
            }
            int i12 = i10 + i11;
            str.getChars(i10, i12, this.D, 0);
            int i13 = this.f20434v;
            if (i13 != 0) {
                M1(i11, i13);
            } else {
                L1(i11);
            }
            if (i12 >= length) {
                return;
            } else {
                i10 = i12;
            }
        }
    }

    private final void E1() throws IOException {
        if (this.F + 4 >= this.G) {
            s1();
        }
        int i10 = this.F;
        char[] cArr = this.D;
        cArr[i10] = 'n';
        cArr[i10 + 1] = 'u';
        cArr[i10 + 2] = 'l';
        cArr[i10 + 3] = 'l';
        this.F = i10 + 4;
    }

    private void H1(int i10) throws IOException {
        if (this.F + 13 >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i11 = this.F;
        int i12 = i11 + 1;
        this.F = i12;
        cArr[i11] = this.C;
        int iJ = j.j(i10, cArr, i12);
        char[] cArr2 = this.D;
        this.F = iJ + 1;
        cArr2[iJ] = this.C;
    }

    private void I1(long j10) throws IOException {
        if (this.F + 23 >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i10 = this.F;
        int i11 = i10 + 1;
        this.F = i11;
        cArr[i10] = this.C;
        int iK = j.k(j10, cArr, i11);
        char[] cArr2 = this.D;
        this.F = iK + 1;
        cArr2[iK] = this.C;
    }

    private void J1(String str) throws IOException {
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i10 = this.F;
        this.F = i10 + 1;
        cArr[i10] = this.C;
        S0(str);
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr2 = this.D;
        int i11 = this.F;
        this.F = i11 + 1;
        cArr2[i11] = this.C;
    }

    private void K1(short s10) throws IOException {
        if (this.F + 8 >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i10 = this.F;
        int i11 = i10 + 1;
        this.F = i11;
        cArr[i10] = this.C;
        int iJ = j.j(s10, cArr, i11);
        char[] cArr2 = this.D;
        this.F = iJ + 1;
        cArr2[iJ] = this.C;
    }

    private void L1(int i10) throws IOException {
        char[] cArr;
        char c10;
        int[] iArr = this.f20433u;
        int length = iArr.length;
        int i11 = 0;
        int iT1 = 0;
        while (i11 < i10) {
            do {
                cArr = this.D;
                c10 = cArr[i11];
                if (c10 < length && iArr[c10] != 0) {
                    break;
                } else {
                    i11++;
                }
            } while (i11 < i10);
            int i12 = i11 - iT1;
            if (i12 > 0) {
                this.B.write(cArr, iT1, i12);
                if (i11 >= i10) {
                    return;
                }
            }
            int i13 = i11 + 1;
            iT1 = t1(this.D, i13, i10, c10, iArr[c10]);
            i11 = i13;
        }
    }

    private void M1(int i10, int i11) throws IOException {
        char[] cArr;
        char c10;
        int i12;
        int[] iArr = this.f20433u;
        int iMin = Math.min(iArr.length, i11 + 1);
        int i13 = 0;
        int iT1 = 0;
        int i14 = 0;
        while (i13 < i10) {
            do {
                cArr = this.D;
                c10 = cArr[i13];
                if (c10 >= iMin) {
                    if (c10 > i11) {
                        i12 = -1;
                        break;
                    }
                } else {
                    i14 = iArr[c10];
                    if (i14 == 0) {
                        break;
                        break;
                    }
                    break;
                }
                i13++;
            } while (i13 < i10);
            i12 = i14;
            int i15 = i13 - iT1;
            if (i15 > 0) {
                this.B.write(cArr, iT1, i15);
                if (i13 >= i10) {
                    return;
                }
            }
            int i16 = i13 + 1;
            iT1 = t1(this.D, i16, i10, c10, i12);
            i13 = i16;
            i14 = i12;
        }
    }

    private void N1(String str) throws IOException {
        int length = str.length();
        int i10 = this.G;
        if (length > i10) {
            D1(str);
            return;
        }
        if (this.F + length > i10) {
            s1();
        }
        str.getChars(0, length, this.D, this.F);
        int i11 = this.f20434v;
        if (i11 != 0) {
            R1(length, i11);
        } else {
            P1(length);
        }
    }

    private void O1(char[] cArr, int i10, int i11) throws IOException {
        int i12 = this.f20434v;
        if (i12 != 0) {
            S1(cArr, i10, i11, i12);
            return;
        }
        int i13 = i11 + i10;
        int[] iArr = this.f20433u;
        int length = iArr.length;
        while (i10 < i13) {
            int i14 = i10;
            do {
                char c10 = cArr[i14];
                if (c10 < length && iArr[c10] != 0) {
                    break;
                } else {
                    i14++;
                }
            } while (i14 < i13);
            int i15 = i14 - i10;
            if (i15 < 32) {
                if (this.F + i15 > this.G) {
                    s1();
                }
                if (i15 > 0) {
                    System.arraycopy(cArr, i10, this.D, this.F, i15);
                    this.F += i15;
                }
            } else {
                s1();
                this.B.write(cArr, i10, i15);
            }
            if (i14 >= i13) {
                return;
            }
            i10 = i14 + 1;
            char c11 = cArr[i14];
            r1(c11, iArr[c11]);
        }
    }

    private void P1(int i10) throws IOException {
        int i11;
        int i12 = this.F + i10;
        int[] iArr = this.f20433u;
        int length = iArr.length;
        while (this.F < i12) {
            do {
                char[] cArr = this.D;
                int i13 = this.F;
                char c10 = cArr[i13];
                if (c10 >= length || iArr[c10] == 0) {
                    i11 = i13 + 1;
                    this.F = i11;
                } else {
                    int i14 = this.E;
                    int i15 = i13 - i14;
                    if (i15 > 0) {
                        this.B.write(cArr, i14, i15);
                    }
                    char[] cArr2 = this.D;
                    int i16 = this.F;
                    this.F = i16 + 1;
                    char c11 = cArr2[i16];
                    u1(c11, iArr[c11]);
                }
            } while (i11 < i12);
            return;
        }
    }

    private void Q1(p pVar) throws IOException {
        char[] cArrA = pVar.a();
        int length = cArrA.length;
        if (length < 32) {
            if (length > this.G - this.F) {
                s1();
            }
            System.arraycopy(cArrA, 0, this.D, this.F, length);
            this.F += length;
        } else {
            s1();
            this.B.write(cArrA, 0, length);
        }
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i10 = this.F;
        this.F = i10 + 1;
        cArr[i10] = this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void R1(int r9, int r10) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8.F
            int r0 = r0 + r9
            int[] r9 = r8.f20433u
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        Lc:
            int r2 = r8.F
            if (r2 >= r0) goto L3a
        L10:
            char[] r2 = r8.D
            int r3 = r8.F
            char r4 = r2[r3]
            if (r4 >= r1) goto L1d
            r5 = r9[r4]
            if (r5 == 0) goto L34
            goto L20
        L1d:
            if (r4 <= r10) goto L34
            r5 = -1
        L20:
            int r6 = r8.E
            int r3 = r3 - r6
            if (r3 <= 0) goto L2a
            java.io.Writer r7 = r8.B
            r7.write(r2, r6, r3)
        L2a:
            int r2 = r8.F
            int r2 = r2 + 1
            r8.F = r2
            r8.u1(r4, r5)
            goto Lc
        L34:
            int r3 = r3 + 1
            r8.F = r3
            if (r3 < r0) goto L10
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.g.R1(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x001b A[PHI: r2
      0x001b: PHI (r2v6 int) = (r2v3 int), (r2v7 int) binds: [B:43:0x0017, B:41:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void S1(char[] r9, int r10, int r11, int r12) throws java.io.IOException {
        /*
            r8 = this;
            int r11 = r11 + r10
            int[] r0 = r8.f20433u
            int r1 = r0.length
            int r2 = r12 + 1
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
        Lb:
            if (r10 >= r11) goto L4f
            r3 = r10
        Le:
            char r4 = r9[r3]
            if (r4 >= r1) goto L17
            r2 = r0[r4]
            if (r2 == 0) goto L1b
            goto L1f
        L17:
            if (r4 <= r12) goto L1b
            r2 = -1
            goto L1f
        L1b:
            int r3 = r3 + 1
            if (r3 < r11) goto Le
        L1f:
            int r5 = r3 - r10
            r6 = 32
            if (r5 >= r6) goto L3e
            int r6 = r8.F
            int r6 = r6 + r5
            int r7 = r8.G
            if (r6 <= r7) goto L2f
            r8.s1()
        L2f:
            if (r5 <= 0) goto L46
            char[] r6 = r8.D
            int r7 = r8.F
            java.lang.System.arraycopy(r9, r10, r6, r7, r5)
            int r10 = r8.F
            int r10 = r10 + r5
            r8.F = r10
            goto L46
        L3e:
            r8.s1()
            java.io.Writer r6 = r8.B
            r6.write(r9, r10, r5)
        L46:
            if (r3 < r11) goto L49
            goto L4f
        L49:
            int r10 = r3 + 1
            r8.r1(r4, r2)
            goto Lb
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.g.S1(char[], int, int, int):void");
    }

    private char[] T1() {
        return this.f20437y ? K : L;
    }

    private void U1(String str) throws IOException {
        int i10 = this.G;
        int i11 = this.F;
        int i12 = i10 - i11;
        str.getChars(0, i12, this.D, i11);
        this.F += i12;
        s1();
        int length = str.length() - i12;
        while (true) {
            int i13 = this.G;
            if (length <= i13) {
                str.getChars(i12, i12 + length, this.D, 0);
                this.E = 0;
                this.F = length;
                return;
            } else {
                int i14 = i12 + i13;
                str.getChars(i12, i14, this.D, 0);
                this.E = 0;
                this.F = i13;
                s1();
                length -= i13;
                i12 = i14;
            }
        }
    }

    private char[] q1() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.H = cArr;
        return cArr;
    }

    private void r1(char c10, int i10) throws IOException {
        int i11;
        if (i10 >= 0) {
            if (this.F + 2 > this.G) {
                s1();
            }
            char[] cArr = this.D;
            int i12 = this.F;
            int i13 = i12 + 1;
            this.F = i13;
            cArr[i12] = '\\';
            this.F = i12 + 2;
            cArr[i13] = (char) i10;
            return;
        }
        if (i10 == -2) {
            this.I.getClass();
            String value = this.I.getValue();
            this.I = null;
            int length = value.length();
            if (this.F + length > this.G) {
                s1();
                if (length > this.G) {
                    this.B.write(value);
                    return;
                }
            }
            value.getChars(0, length, this.D, this.F);
            this.F += length;
            return;
        }
        if (this.F + 5 >= this.G) {
            s1();
        }
        int i14 = this.F;
        char[] cArr2 = this.D;
        char[] cArrT1 = T1();
        cArr2[i14] = '\\';
        int i15 = i14 + 2;
        cArr2[i14 + 1] = 'u';
        if (c10 > 255) {
            int i16 = c10 >> '\b';
            int i17 = i14 + 3;
            cArr2[i15] = cArrT1[(i16 & 255) >> 4];
            i11 = i14 + 4;
            cArr2[i17] = cArrT1[i16 & 15];
            c10 = (char) (c10 & 255);
        } else {
            int i18 = i14 + 3;
            cArr2[i15] = '0';
            i11 = i14 + 4;
            cArr2[i18] = '0';
        }
        cArr2[i11] = cArrT1[c10 >> 4];
        cArr2[i11 + 1] = cArrT1[c10 & 15];
        this.F = i11 + 2;
    }

    private int t1(char[] cArr, int i10, int i11, char c10, int i12) throws IOException {
        int i13;
        if (i12 >= 0) {
            if (i10 > 1 && i10 < i11) {
                int i14 = i10 - 2;
                cArr[i14] = '\\';
                cArr[i10 - 1] = (char) i12;
                return i14;
            }
            char[] cArrQ1 = this.H;
            if (cArrQ1 == null) {
                cArrQ1 = q1();
            }
            cArrQ1[1] = (char) i12;
            this.B.write(cArrQ1, 0, 2);
            return i10;
        }
        if (i12 == -2) {
            this.I.getClass();
            String value = this.I.getValue();
            this.I = null;
            int length = value.length();
            if (i10 < length || i10 >= i11) {
                this.B.write(value);
                return i10;
            }
            int i15 = i10 - length;
            value.getChars(0, length, cArr, i15);
            return i15;
        }
        char[] cArrT1 = T1();
        if (i10 <= 5 || i10 >= i11) {
            char[] cArrQ12 = this.H;
            if (cArrQ12 == null) {
                cArrQ12 = q1();
            }
            this.E = this.F;
            if (c10 <= 255) {
                cArrQ12[6] = cArrT1[c10 >> 4];
                cArrQ12[7] = cArrT1[c10 & 15];
                this.B.write(cArrQ12, 2, 6);
                return i10;
            }
            int i16 = c10 >> '\b';
            cArrQ12[10] = cArrT1[(i16 & 255) >> 4];
            cArrQ12[11] = cArrT1[i16 & 15];
            cArrQ12[12] = cArrT1[(c10 & 255) >> 4];
            cArrQ12[13] = cArrT1[c10 & 15];
            this.B.write(cArrQ12, 8, 6);
            return i10;
        }
        cArr[i10 - 6] = '\\';
        int i17 = i10 - 4;
        cArr[i10 - 5] = 'u';
        if (c10 > 255) {
            int i18 = c10 >> '\b';
            int i19 = i10 - 3;
            cArr[i17] = cArrT1[(i18 & 255) >> 4];
            i13 = i10 - 2;
            cArr[i19] = cArrT1[i18 & 15];
            c10 = (char) (c10 & 255);
        } else {
            int i20 = i10 - 3;
            cArr[i17] = '0';
            i13 = i10 - 2;
            cArr[i20] = '0';
        }
        cArr[i13] = cArrT1[c10 >> 4];
        cArr[i13 + 1] = cArrT1[c10 & 15];
        return i13 - 4;
    }

    private void u1(char c10, int i10) throws IOException {
        int i11;
        if (i10 >= 0) {
            int i12 = this.F;
            if (i12 >= 2) {
                int i13 = i12 - 2;
                this.E = i13;
                char[] cArr = this.D;
                cArr[i13] = '\\';
                cArr[i12 - 1] = (char) i10;
                return;
            }
            char[] cArrQ1 = this.H;
            if (cArrQ1 == null) {
                cArrQ1 = q1();
            }
            this.E = this.F;
            cArrQ1[1] = (char) i10;
            this.B.write(cArrQ1, 0, 2);
            return;
        }
        if (i10 == -2) {
            this.I.getClass();
            String value = this.I.getValue();
            this.I = null;
            int length = value.length();
            int i14 = this.F;
            if (i14 < length) {
                this.E = i14;
                this.B.write(value);
                return;
            } else {
                int i15 = i14 - length;
                this.E = i15;
                value.getChars(0, length, this.D, i15);
                return;
            }
        }
        char[] cArrT1 = T1();
        int i16 = this.F;
        if (i16 < 6) {
            char[] cArrQ12 = this.H;
            if (cArrQ12 == null) {
                cArrQ12 = q1();
            }
            this.E = this.F;
            if (c10 <= 255) {
                cArrQ12[6] = cArrT1[c10 >> 4];
                cArrQ12[7] = cArrT1[c10 & 15];
                this.B.write(cArrQ12, 2, 6);
                return;
            } else {
                int i17 = c10 >> '\b';
                cArrQ12[10] = cArrT1[(i17 & 255) >> 4];
                cArrQ12[11] = cArrT1[i17 & 15];
                cArrQ12[12] = cArrT1[(c10 & 255) >> 4];
                cArrQ12[13] = cArrT1[c10 & 15];
                this.B.write(cArrQ12, 8, 6);
                return;
            }
        }
        char[] cArr2 = this.D;
        int i18 = i16 - 6;
        this.E = i18;
        cArr2[i18] = '\\';
        cArr2[i16 - 5] = 'u';
        if (c10 > 255) {
            int i19 = c10 >> '\b';
            cArr2[i16 - 4] = cArrT1[(i19 & 255) >> 4];
            i11 = i16 - 3;
            cArr2[i11] = cArrT1[i19 & 15];
            c10 = (char) (c10 & 255);
        } else {
            cArr2[i16 - 4] = '0';
            i11 = i16 - 3;
            cArr2[i11] = '0';
        }
        cArr2[i11 + 1] = cArrT1[c10 >> 4];
        cArr2[i11 + 2] = cArrT1[c10 & 15];
    }

    private int v1(InputStream inputStream, byte[] bArr, int i10, int i11, int i12) {
        int i13;
        int i14 = 0;
        while (i10 < i11) {
            bArr[i14] = bArr[i10];
            i14++;
            i10++;
        }
        int iMin = Math.min(i12, bArr.length);
        do {
            int i15 = iMin - i14;
            if (i15 == 0 || (i13 = inputStream.read(bArr, i14, i15)) < 0) {
                return i14;
            }
            i14 += i13;
        } while (i14 < 3);
        return i14;
    }

    @Override // e6.g
    public void A0() throws IOException {
        if (!this.f12814h.i()) {
            a("Current context not Object but " + this.f12814h.l());
        }
        o oVar = this.f11507a;
        if (oVar != null) {
            oVar.h(this, this.f12814h.d());
        } else {
            if (this.F >= this.G) {
                s1();
            }
            char[] cArr = this.D;
            int i10 = this.F;
            this.F = i10 + 1;
            cArr[i10] = '}';
        }
        this.f12814h = this.f12814h.n();
    }

    protected final void A1(p pVar, boolean z10) throws IOException {
        if (this.f11507a != null) {
            F1(pVar, z10);
            return;
        }
        if (this.F + 1 >= this.G) {
            s1();
        }
        if (z10) {
            char[] cArr = this.D;
            int i10 = this.F;
            this.F = i10 + 1;
            cArr[i10] = ',';
        }
        if (this.f20436x) {
            char[] cArrA = pVar.a();
            T0(cArrA, 0, cArrA.length);
            return;
        }
        char[] cArr2 = this.D;
        int i11 = this.F;
        int i12 = i11 + 1;
        this.F = i12;
        cArr2[i11] = this.C;
        int iC = pVar.c(cArr2, i12);
        if (iC < 0) {
            C1(pVar);
            return;
        }
        int i13 = this.F + iC;
        this.F = i13;
        if (i13 >= this.G) {
            s1();
        }
        char[] cArr3 = this.D;
        int i14 = this.F;
        this.F = i14 + 1;
        cArr3[i14] = this.C;
    }

    protected final void B1(String str, boolean z10) throws IOException {
        if (this.f11507a != null) {
            G1(str, z10);
            return;
        }
        if (this.F + 1 >= this.G) {
            s1();
        }
        if (z10) {
            char[] cArr = this.D;
            int i10 = this.F;
            this.F = i10 + 1;
            cArr[i10] = ',';
        }
        if (this.f20436x) {
            N1(str);
            return;
        }
        char[] cArr2 = this.D;
        int i11 = this.F;
        this.F = i11 + 1;
        cArr2[i11] = this.C;
        N1(str);
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr3 = this.D;
        int i12 = this.F;
        this.F = i12 + 1;
        cArr3[i12] = this.C;
    }

    @Override // e6.g
    public void C0(p pVar) throws IOException {
        int iY = this.f12814h.y(pVar.getValue());
        if (iY == 4) {
            a("Can not write a field name, expecting a value");
        }
        A1(pVar, iY == 1);
    }

    @Override // e6.g
    public void D0(String str) throws IOException {
        int iY = this.f12814h.y(str);
        if (iY == 4) {
            a("Can not write a field name, expecting a value");
        }
        B1(str, iY == 1);
    }

    @Override // e6.g
    public void E0() throws IOException {
        n1("write a null");
        E1();
    }

    @Override // e6.g
    public void F0(double d10) throws IOException {
        if (this.f12813g || (j.h(d10) && w(g.b.QUOTE_NON_NUMERIC_NUMBERS))) {
            d1(j.m(d10, w(g.b.USE_FAST_DOUBLE_WRITER)));
        } else {
            n1("write a number");
            S0(j.m(d10, w(g.b.USE_FAST_DOUBLE_WRITER)));
        }
    }

    protected final void F1(p pVar, boolean z10) throws IOException {
        if (z10) {
            this.f11507a.c(this);
        } else {
            this.f11507a.j(this);
        }
        char[] cArrA = pVar.a();
        if (this.f20436x) {
            T0(cArrA, 0, cArrA.length);
            return;
        }
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i10 = this.F;
        this.F = i10 + 1;
        cArr[i10] = this.C;
        T0(cArrA, 0, cArrA.length);
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr2 = this.D;
        int i11 = this.F;
        this.F = i11 + 1;
        cArr2[i11] = this.C;
    }

    @Override // e6.g
    public void G0(float f10) throws IOException {
        if (this.f12813g || (j.i(f10) && w(g.b.QUOTE_NON_NUMERIC_NUMBERS))) {
            d1(j.o(f10, w(g.b.USE_FAST_DOUBLE_WRITER)));
        } else {
            n1("write a number");
            S0(j.o(f10, w(g.b.USE_FAST_DOUBLE_WRITER)));
        }
    }

    protected final void G1(String str, boolean z10) throws IOException {
        if (z10) {
            this.f11507a.c(this);
        } else {
            this.f11507a.j(this);
        }
        if (this.f20436x) {
            N1(str);
            return;
        }
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i10 = this.F;
        this.F = i10 + 1;
        cArr[i10] = this.C;
        N1(str);
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr2 = this.D;
        int i11 = this.F;
        this.F = i11 + 1;
        cArr2[i11] = this.C;
    }

    @Override // e6.g
    public void H0(int i10) throws IOException {
        n1("write a number");
        if (this.f12813g) {
            H1(i10);
            return;
        }
        if (this.F + 11 >= this.G) {
            s1();
        }
        this.F = j.j(i10, this.D, this.F);
    }

    @Override // e6.g
    public void I0(long j10) throws IOException {
        n1("write a number");
        if (this.f12813g) {
            I1(j10);
            return;
        }
        if (this.F + 21 >= this.G) {
            s1();
        }
        this.F = j.k(j10, this.D, this.F);
    }

    @Override // e6.g
    public void J0(String str) throws IOException {
        n1("write a number");
        if (str == null) {
            E1();
        } else if (this.f12813g) {
            J1(str);
        } else {
            S0(str);
        }
    }

    @Override // e6.g
    public void K0(BigDecimal bigDecimal) throws IOException {
        n1("write a number");
        if (bigDecimal == null) {
            E1();
        } else if (this.f12813g) {
            J1(j1(bigDecimal));
        } else {
            S0(j1(bigDecimal));
        }
    }

    @Override // e6.g
    public void L0(BigInteger bigInteger) throws IOException {
        n1("write a number");
        if (bigInteger == null) {
            E1();
        } else if (this.f12813g) {
            J1(bigInteger.toString());
        } else {
            S0(bigInteger.toString());
        }
    }

    @Override // e6.g
    public void M0(short s10) throws IOException {
        n1("write a number");
        if (this.f12813g) {
            K1(s10);
            return;
        }
        if (this.F + 6 >= this.G) {
            s1();
        }
        this.F = j.j(s10, this.D, this.F);
    }

    @Override // e6.g
    public void Q0(char c10) throws IOException {
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i10 = this.F;
        this.F = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // e6.g
    public void R0(p pVar) throws IOException {
        int iB = pVar.b(this.D, this.F);
        if (iB < 0) {
            S0(pVar.getValue());
        } else {
            this.F += iB;
        }
    }

    @Override // e6.g
    public void S0(String str) throws IOException {
        int length = str.length();
        int i10 = this.G - this.F;
        if (i10 == 0) {
            s1();
            i10 = this.G - this.F;
        }
        if (i10 < length) {
            U1(str);
        } else {
            str.getChars(0, length, this.D, this.F);
            this.F += length;
        }
    }

    @Override // e6.g
    public void T0(char[] cArr, int i10, int i11) throws IOException {
        l1(cArr, i10, i11);
        if (i11 >= 32) {
            s1();
            this.B.write(cArr, i10, i11);
        } else {
            if (i11 > this.G - this.F) {
                s1();
            }
            System.arraycopy(cArr, i10, this.D, this.F, i11);
            this.F += i11;
        }
    }

    @Override // e6.g
    public void W0() throws IOException {
        n1("start an array");
        this.f12814h = this.f12814h.o();
        o oVar = this.f11507a;
        if (oVar != null) {
            oVar.k(this);
            return;
        }
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i10 = this.F;
        this.F = i10 + 1;
        cArr[i10] = '[';
    }

    @Override // e6.g
    public void X0(Object obj) throws IOException {
        n1("start an array");
        this.f12814h = this.f12814h.p(obj);
        o oVar = this.f11507a;
        if (oVar != null) {
            oVar.k(this);
            return;
        }
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i10 = this.F;
        this.F = i10 + 1;
        cArr[i10] = '[';
    }

    @Override // e6.g
    public void Y0(Object obj, int i10) throws IOException {
        n1("start an array");
        this.f12814h = this.f12814h.p(obj);
        o oVar = this.f11507a;
        if (oVar != null) {
            oVar.k(this);
            return;
        }
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i11 = this.F;
        this.F = i11 + 1;
        cArr[i11] = '[';
    }

    @Override // e6.g
    public void Z0() throws IOException {
        n1("start an object");
        this.f12814h = this.f12814h.q();
        o oVar = this.f11507a;
        if (oVar != null) {
            oVar.d(this);
            return;
        }
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i10 = this.F;
        this.F = i10 + 1;
        cArr[i10] = '{';
    }

    @Override // e6.g
    public void a1(Object obj) throws IOException {
        n1("start an object");
        this.f12814h = this.f12814h.r(obj);
        o oVar = this.f11507a;
        if (oVar != null) {
            oVar.d(this);
            return;
        }
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i10 = this.F;
        this.F = i10 + 1;
        cArr[i10] = '{';
    }

    @Override // e6.g
    public void b1(Object obj, int i10) throws IOException {
        a1(obj);
    }

    @Override // e6.g
    public void c1(p pVar) throws IOException {
        n1("write a string");
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i10 = this.F;
        int i11 = i10 + 1;
        this.F = i11;
        cArr[i10] = this.C;
        int iC = pVar.c(cArr, i11);
        if (iC < 0) {
            Q1(pVar);
            return;
        }
        int i12 = this.F + iC;
        this.F = i12;
        if (i12 >= this.G) {
            s1();
        }
        char[] cArr2 = this.D;
        int i13 = this.F;
        this.F = i13 + 1;
        cArr2[i13] = this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0061  */
    @Override // f6.a, e6.g, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close() throws java.lang.Throwable {
        /*
            r2 = this;
            super.close()
            char[] r0 = r2.D     // Catch: java.io.IOException -> L1d
            if (r0 == 0) goto L29
            e6.g$b r0 = e6.g.b.AUTO_CLOSE_JSON_CONTENT     // Catch: java.io.IOException -> L1d
            boolean r0 = r2.w(r0)     // Catch: java.io.IOException -> L1d
            if (r0 == 0) goto L29
        Lf:
            e6.l r0 = r2.s()     // Catch: java.io.IOException -> L1d
            boolean r1 = r0.h()     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L1f
            r2.z0()     // Catch: java.io.IOException -> L1d
            goto Lf
        L1d:
            r0 = move-exception
            goto L2d
        L1f:
            boolean r0 = r0.i()     // Catch: java.io.IOException -> L1d
            if (r0 == 0) goto L29
            r2.A0()     // Catch: java.io.IOException -> L1d
            goto Lf
        L29:
            r2.s1()     // Catch: java.io.IOException -> L1d
            r0 = 0
        L2d:
            r1 = 0
            r2.E = r1
            r2.F = r1
            java.io.Writer r1 = r2.B
            if (r1 == 0) goto L65
            i6.f r1 = r2.f20432t     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            boolean r1 = r1.k()     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            if (r1 != 0) goto L59
            e6.g$b r1 = e6.g.b.AUTO_CLOSE_TARGET     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            boolean r1 = r2.w(r1)     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            if (r1 == 0) goto L47
            goto L59
        L47:
            e6.g$b r1 = e6.g.b.FLUSH_PASSED_TO_STREAM     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            boolean r1 = r2.w(r1)     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            if (r1 == 0) goto L65
            java.io.Writer r1 = r2.B     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            r1.flush()     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            goto L65
        L55:
            r1 = move-exception
            goto L5f
        L57:
            r1 = move-exception
            goto L5f
        L59:
            java.io.Writer r1 = r2.B     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            r1.close()     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            goto L65
        L5f:
            if (r0 == 0) goto L64
            r1.addSuppressed(r0)
        L64:
            throw r1
        L65:
            r2.w1()
            if (r0 != 0) goto L6b
            return
        L6b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.g.close():void");
    }

    @Override // e6.g
    public void d1(String str) throws IOException {
        n1("write a string");
        if (str == null) {
            E1();
            return;
        }
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i10 = this.F;
        this.F = i10 + 1;
        cArr[i10] = this.C;
        N1(str);
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr2 = this.D;
        int i11 = this.F;
        this.F = i11 + 1;
        cArr2[i11] = this.C;
    }

    @Override // e6.g
    public void e1(char[] cArr, int i10, int i11) throws IOException {
        n1("write a string");
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr2 = this.D;
        int i12 = this.F;
        this.F = i12 + 1;
        cArr2[i12] = this.C;
        O1(cArr, i10, i11);
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr3 = this.D;
        int i13 = this.F;
        this.F = i13 + 1;
        cArr3[i13] = this.C;
    }

    @Override // e6.g, java.io.Flushable
    public void flush() throws IOException {
        s1();
        if (this.B == null || !w(g.b.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.B.flush();
    }

    @Override // f6.a
    protected final void n1(String str) throws IOException {
        char c10;
        int iZ = this.f12814h.z();
        if (this.f11507a != null) {
            p1(str, iZ);
            return;
        }
        if (iZ == 1) {
            c10 = ',';
        } else {
            if (iZ != 2) {
                if (iZ != 3) {
                    if (iZ != 5) {
                        return;
                    }
                    o1(str);
                    return;
                } else {
                    p pVar = this.f20435w;
                    if (pVar != null) {
                        S0(pVar.getValue());
                        return;
                    }
                    return;
                }
            }
            c10 = ':';
        }
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i10 = this.F;
        this.F = i10 + 1;
        cArr[i10] = c10;
    }

    protected void s1() throws IOException {
        int i10 = this.F;
        int i11 = this.E;
        int i12 = i10 - i11;
        if (i12 > 0) {
            this.E = 0;
            this.F = 0;
            this.B.write(this.D, i11, i12);
        }
    }

    @Override // e6.g
    public int t0(e6.a aVar, InputStream inputStream, int i10) throws IOException {
        n1("write a binary value");
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i11 = this.F;
        this.F = i11 + 1;
        cArr[i11] = this.C;
        byte[] bArrD = this.f20432t.d();
        try {
            if (i10 < 0) {
                i10 = x1(aVar, inputStream, bArrD);
            } else {
                int iY1 = y1(aVar, inputStream, bArrD, i10);
                if (iY1 > 0) {
                    a("Too few bytes available: missing " + iY1 + " bytes (out of " + i10 + ")");
                }
            }
            this.f20432t.l(bArrD);
            if (this.F >= this.G) {
                s1();
            }
            char[] cArr2 = this.D;
            int i12 = this.F;
            this.F = i12 + 1;
            cArr2[i12] = this.C;
            return i10;
        } catch (Throwable th2) {
            this.f20432t.l(bArrD);
            throw th2;
        }
    }

    @Override // e6.g
    public void v0(e6.a aVar, byte[] bArr, int i10, int i11) throws IOException {
        k1(bArr, i10, i11);
        n1("write a binary value");
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr = this.D;
        int i12 = this.F;
        this.F = i12 + 1;
        cArr[i12] = this.C;
        z1(aVar, bArr, i10, i11 + i10);
        if (this.F >= this.G) {
            s1();
        }
        char[] cArr2 = this.D;
        int i13 = this.F;
        this.F = i13 + 1;
        cArr2[i13] = this.C;
    }

    protected void w1() {
        char[] cArr = this.D;
        if (cArr != null) {
            this.D = null;
            this.f20432t.m(cArr);
        }
        char[] cArr2 = this.J;
        if (cArr2 != null) {
            this.J = null;
            this.f20432t.n(cArr2);
        }
    }

    protected final int x1(e6.a aVar, InputStream inputStream, byte[] bArr) throws IOException {
        byte[] bArr2 = bArr;
        int i10 = this.G - 6;
        int i11 = 2;
        int i12 = -3;
        int iO = aVar.o() >> 2;
        int i13 = 0;
        int iV1 = 0;
        int i14 = 0;
        while (true) {
            if (i13 > i12) {
                iV1 = v1(inputStream, bArr2, i13, iV1, bArr2.length);
                if (iV1 < 3) {
                    break;
                }
                i12 = iV1 - 3;
                i13 = 0;
            }
            if (this.F > i10) {
                s1();
            }
            int i15 = i13 + 2;
            int i16 = ((bArr[i13 + 1] & MessagePack.Code.EXT_TIMESTAMP) | (bArr[i13] << 8)) << 8;
            i13 += 3;
            i14 += 3;
            int iJ = aVar.j(i16 | (bArr[i15] & MessagePack.Code.EXT_TIMESTAMP), this.D, this.F);
            this.F = iJ;
            iO--;
            if (iO <= 0) {
                char[] cArr = this.D;
                int i17 = iJ + 1;
                this.F = i17;
                cArr[iJ] = '\\';
                this.F = iJ + 2;
                cArr[i17] = 'n';
                iO = aVar.o() >> 2;
            }
            bArr2 = bArr;
        }
        if (iV1 <= 0) {
            return i14;
        }
        if (this.F > i10) {
            s1();
        }
        int i18 = bArr[0] << 16;
        if (1 < iV1) {
            i18 |= (bArr[1] & MessagePack.Code.EXT_TIMESTAMP) << 8;
        } else {
            i11 = 1;
        }
        int i19 = i14 + i11;
        this.F = aVar.l(i18, i11, this.D, this.F);
        return i19;
    }

    @Override // e6.g
    public void y0(boolean z10) throws IOException {
        int i10;
        n1("write a boolean value");
        if (this.F + 5 >= this.G) {
            s1();
        }
        int i11 = this.F;
        char[] cArr = this.D;
        if (z10) {
            cArr[i11] = 't';
            cArr[i11 + 1] = 'r';
            cArr[i11 + 2] = 'u';
            i10 = i11 + 3;
            cArr[i10] = 'e';
        } else {
            cArr[i11] = 'f';
            cArr[i11 + 1] = 'a';
            cArr[i11 + 2] = 'l';
            cArr[i11 + 3] = 's';
            i10 = i11 + 4;
            cArr[i10] = 'e';
        }
        this.F = i10 + 1;
    }

    protected final int y1(e6.a aVar, InputStream inputStream, byte[] bArr, int i10) throws IOException {
        int iV1;
        int i11 = this.G - 6;
        int i12 = 2;
        int iO = aVar.o() >> 2;
        int i13 = -3;
        int i14 = i10;
        int i15 = 0;
        int iV12 = 0;
        while (true) {
            if (i14 <= 2) {
                break;
            }
            if (i15 > i13) {
                iV12 = v1(inputStream, bArr, i15, iV12, i14);
                if (iV12 < 3) {
                    i15 = 0;
                    break;
                }
                i13 = iV12 - 3;
                i15 = 0;
            }
            if (this.F > i11) {
                s1();
            }
            int i16 = i15 + 2;
            int i17 = ((bArr[i15 + 1] & MessagePack.Code.EXT_TIMESTAMP) | (bArr[i15] << 8)) << 8;
            i15 += 3;
            i14 -= 3;
            int iJ = aVar.j(i17 | (bArr[i16] & MessagePack.Code.EXT_TIMESTAMP), this.D, this.F);
            this.F = iJ;
            iO--;
            if (iO <= 0) {
                char[] cArr = this.D;
                int i18 = iJ + 1;
                this.F = i18;
                cArr[iJ] = '\\';
                this.F = iJ + 2;
                cArr[i18] = 'n';
                iO = aVar.o() >> 2;
            }
        }
        if (i14 <= 0 || (iV1 = v1(inputStream, bArr, i15, iV12, i14)) <= 0) {
            return i14;
        }
        if (this.F > i11) {
            s1();
        }
        int i19 = bArr[0] << 16;
        if (1 < iV1) {
            i19 |= (bArr[1] & MessagePack.Code.EXT_TIMESTAMP) << 8;
        } else {
            i12 = 1;
        }
        this.F = aVar.l(i19, i12, this.D, this.F);
        return i14 - i12;
    }

    @Override // e6.g
    public void z0() throws IOException {
        if (!this.f12814h.h()) {
            a("Current context not Array but " + this.f12814h.l());
        }
        o oVar = this.f11507a;
        if (oVar != null) {
            oVar.f(this, this.f12814h.d());
        } else {
            if (this.F >= this.G) {
                s1();
            }
            char[] cArr = this.D;
            int i10 = this.F;
            this.F = i10 + 1;
            cArr[i10] = ']';
        }
        this.f12814h = this.f12814h.n();
    }

    protected final void z1(e6.a aVar, byte[] bArr, int i10, int i11) throws IOException {
        int iJ;
        int i12 = i11 - 3;
        int i13 = this.G - 6;
        int iO = aVar.o();
        loop0: while (true) {
            int i14 = iO >> 2;
            while (i10 <= i12) {
                if (this.F > i13) {
                    s1();
                }
                int i15 = i10 + 2;
                int i16 = ((bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP) | (bArr[i10] << 8)) << 8;
                i10 += 3;
                iJ = aVar.j(i16 | (bArr[i15] & MessagePack.Code.EXT_TIMESTAMP), this.D, this.F);
                this.F = iJ;
                i14--;
                if (i14 <= 0) {
                    break;
                }
            }
            char[] cArr = this.D;
            int i17 = iJ + 1;
            this.F = i17;
            cArr[iJ] = '\\';
            this.F = iJ + 2;
            cArr[i17] = 'n';
            iO = aVar.o();
        }
        int i18 = i11 - i10;
        if (i18 > 0) {
            if (this.F > i13) {
                s1();
            }
            int i19 = i10 + 1;
            int i20 = bArr[i10] << 16;
            if (i18 == 2) {
                i20 |= (bArr[i19] & MessagePack.Code.EXT_TIMESTAMP) << 8;
            }
            this.F = aVar.l(i20, i18, this.D, this.F);
        }
    }
}
