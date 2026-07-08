package x5;

import org.msgpack.core.MessagePack;
import t5.b;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b6.a f31646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f31647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31648c;

    /* JADX INFO: renamed from: x5.a$a, reason: collision with other inner class name */
    public static class C0426a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f31650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f31651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f31652d;

        public C0426a() {
            this(1504);
        }

        public C0426a(int i10) {
            this.f31652d = new byte[i10];
        }
    }

    public a(int i10) {
        this(i10, false);
    }

    private boolean b(C0426a c0426a) {
        int iK;
        if (this.f31646a.c() == 0 || (iK = this.f31646a.k((byte) 126)) < 0) {
            return false;
        }
        this.f31646a.a(iK + 1);
        int iK2 = this.f31646a.k((byte) 126);
        if (iK2 < 0) {
            this.f31646a.f(1);
            return false;
        }
        if (iK2 < 1) {
            this.f31646a.a(iK2);
            return false;
        }
        byte[] bArr = this.f31647b;
        this.f31646a.l(bArr, 0, iK2);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iK2) {
            byte b10 = bArr[i10];
            if (b10 == 125) {
                i10++;
                bArr[i11] = (byte) (bArr[i10] ^ 32);
                i11++;
            } else {
                bArr[i11] = b10;
                i11++;
            }
            i10++;
        }
        byte b11 = bArr[0];
        int i12 = 2;
        if (b11 == -1) {
            int i13 = i11 - 6;
            c0426a.f31650b = i13;
            if (i13 < 0 || bArr[1] != 3 || (this.f31648c && !t5.a.a(bArr, 0, i11))) {
                return false;
            }
            c0426a.f31649a = ((bArr[2] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (bArr[3] & MessagePack.Code.EXT_TIMESTAMP);
            System.arraycopy(bArr, 4, c0426a.f31652d, 0, c0426a.f31650b);
            c0426a.f31651c = true;
            return true;
        }
        if (this.f31648c && (b11 & MessagePack.Code.NIL) == 192 && i11 > 4 && !t5.a.a(bArr, 0, i11)) {
            return false;
        }
        if ((b11 & 128) == 128) {
            c0426a.f31650b = i11 - 2;
            if ((b11 & MessagePack.Code.NIL) == 192) {
                c0426a.f31650b = i11 - 4;
            }
            if (i11 < 0) {
                return false;
            }
            c0426a.f31649a = ((b11 & 63) << 8) | (bArr[1] & MessagePack.Code.EXT_TIMESTAMP);
        } else {
            c0426a.f31650b = i11 - 1;
            c0426a.f31649a = b11 & 127;
            i12 = 1;
        }
        System.arraycopy(bArr, i12, c0426a.f31652d, 0, c0426a.f31650b);
        c0426a.f31651c = false;
        return true;
    }

    public static int c(int i10, boolean z10, byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        int i14;
        byte[] bArr3 = new byte[i13 + 4];
        int i15 = i11 + 1;
        bArr[i11] = 126;
        if (i10 > 127 || z10) {
            bArr3[0] = (byte) (((i10 >> 8) & 255) | (z10 ? 192 : 128));
            i14 = 1;
        } else {
            i14 = 0;
        }
        int i16 = i14 + 1;
        bArr3[i14] = (byte) (i10 & 255);
        int i17 = i13 + i12;
        while (i12 < i17) {
            bArr3[i16] = bArr2[i12];
            i12++;
            i16++;
        }
        if (z10) {
            int iC = t5.a.c(bArr3, 0, i16) ^ 65535;
            int i18 = i16 + 1;
            bArr3[i16] = (byte) (iC & 255);
            i16 += 2;
            bArr3[i18] = (byte) ((iC >> 8) & 255);
        }
        for (int i19 = 0; i19 < i16; i19++) {
            byte b10 = bArr3[i19];
            if (b10 == 126 || b10 == 125) {
                int i20 = i15 + 1;
                bArr[i15] = 125;
                i15 += 2;
                bArr[i20] = (byte) (b10 ^ 32);
            } else {
                bArr[i15] = b10;
                i15++;
            }
        }
        bArr[i15] = 126;
        return (i15 + 1) - i11;
    }

    public static int d(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, boolean z10) {
        int i13 = i11 + 6;
        byte[] bArr3 = new byte[i13];
        bArr2[i12] = 126;
        bArr3[0] = -1;
        bArr3[1] = 3;
        b.a((short) 33, bArr3, 2);
        int i14 = i11 + i10;
        int i15 = 4;
        while (i10 < i14) {
            bArr3[i15] = bArr[i10];
            i10++;
            i15++;
        }
        int iC = t5.a.c(bArr3, 0, i11 + 4) ^ 65535;
        bArr3[i15] = (byte) (iC & 255);
        bArr3[i15 + 1] = (byte) ((iC >> 8) & 255);
        int i16 = i12 + 1;
        for (int i17 = 0; i17 < i13; i17++) {
            byte b10 = bArr3[i17];
            if ((z10 && b10 < 32) || b10 == 126 || b10 == 125) {
                int i18 = i16 + 1;
                bArr2[i16] = 125;
                i16 += 2;
                bArr2[i18] = (byte) (b10 ^ 32);
            } else {
                bArr2[i16] = b10;
                i16++;
            }
        }
        bArr2[i16] = 126;
        return (i16 + 1) - i12;
    }

    public int a() {
        return this.f31646a.c();
    }

    public boolean e(C0426a c0426a) {
        int i10 = 0;
        while (true) {
            int iC = this.f31646a.c();
            if (iC == i10) {
                return false;
            }
            if (b(c0426a)) {
                return true;
            }
            i10 = iC;
        }
    }

    public int f(byte[] bArr, int i10, int i11) {
        return this.f31646a.m(bArr, i10, i11);
    }

    public a(int i10, boolean z10) {
        this.f31647b = new byte[1504];
        this.f31646a = new b6.a(i10);
        this.f31648c = z10;
    }
}
