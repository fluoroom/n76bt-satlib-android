package of;

import androidx.appcompat.widget.ActivityChooserView;
import com.facebook.stetho.common.Utf8Charset;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import of.p;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23433d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InputStream f23435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23436g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23440k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23437h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23439j = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23441l = 64;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23442m = 67108864;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f23430a = new byte[4096];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23432c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23434e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23438i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f23431b = false;

    private e(InputStream inputStream) {
        this.f23435f = inputStream;
    }

    public static int A(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw k.k();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw k.k();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw k.f();
    }

    private void M() {
        int i10 = this.f23432c + this.f23433d;
        this.f23432c = i10;
        int i11 = this.f23438i + i10;
        int i12 = this.f23439j;
        if (i11 <= i12) {
            this.f23433d = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f23433d = i13;
        this.f23432c = i10 - i13;
    }

    private void N(int i10) throws k {
        if (!S(i10)) {
            throw k.k();
        }
    }

    private void R(int i10) throws k {
        if (i10 < 0) {
            throw k.g();
        }
        int i11 = this.f23438i;
        int i12 = this.f23434e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f23439j;
        if (i13 > i14) {
            Q((i14 - i11) - i12);
            throw k.k();
        }
        int i15 = this.f23432c;
        int i16 = i15 - i12;
        this.f23434e = i15;
        N(1);
        while (true) {
            int i17 = i10 - i16;
            int i18 = this.f23432c;
            if (i17 <= i18) {
                this.f23434e = i17;
                return;
            } else {
                i16 += i18;
                this.f23434e = i18;
                N(1);
            }
        }
    }

    private boolean S(int i10) throws IOException {
        int i11 = this.f23434e;
        int i12 = i11 + i10;
        int i13 = this.f23432c;
        if (i12 <= i13) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f23438i + i11 + i10 <= this.f23439j && this.f23435f != null) {
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f23430a;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f23438i += i11;
                this.f23432c -= i11;
                this.f23434e = 0;
            }
            InputStream inputStream = this.f23435f;
            byte[] bArr2 = this.f23430a;
            int i14 = this.f23432c;
            int i15 = inputStream.read(bArr2, i14, bArr2.length - i14);
            if (i15 == 0 || i15 < -1 || i15 > this.f23430a.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i15);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i15 > 0) {
                this.f23432c += i15;
                if ((this.f23438i + i10) - this.f23442m > 0) {
                    throw k.j();
                }
                M();
                if (this.f23432c >= i10) {
                    return true;
                }
                return S(i10);
            }
        }
        return false;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    private void d(int i10) throws k {
        if (this.f23432c - this.f23434e < i10) {
            N(i10);
        }
    }

    public static e g(InputStream inputStream) {
        return new e(inputStream);
    }

    private byte[] w(int i10) throws k {
        if (i10 <= 0) {
            if (i10 == 0) {
                return j.f23478a;
            }
            throw k.g();
        }
        int i11 = this.f23438i;
        int i12 = this.f23434e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f23439j;
        if (i13 > i14) {
            Q((i14 - i11) - i12);
            throw k.k();
        }
        if (i10 < 4096) {
            byte[] bArr = new byte[i10];
            int i15 = this.f23432c - i12;
            System.arraycopy(this.f23430a, i12, bArr, 0, i15);
            this.f23434e = this.f23432c;
            int i16 = i10 - i15;
            d(i16);
            System.arraycopy(this.f23430a, 0, bArr, i15, i16);
            this.f23434e = i16;
            return bArr;
        }
        int i17 = this.f23432c;
        this.f23438i = i11 + i17;
        this.f23434e = 0;
        this.f23432c = 0;
        int length = i17 - i12;
        int i18 = i10 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i18 > 0) {
            int iMin = Math.min(i18, 4096);
            byte[] bArr2 = new byte[iMin];
            int i19 = 0;
            while (i19 < iMin) {
                InputStream inputStream = this.f23435f;
                int i20 = inputStream == null ? -1 : inputStream.read(bArr2, i19, iMin - i19);
                if (i20 == -1) {
                    throw k.k();
                }
                this.f23438i += i20;
                i19 += i20;
            }
            i18 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(this.f23430a, i12, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r2[r7] < 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long B() {
        /*
            r10 = this;
            int r0 = r10.f23434e
            int r1 = r10.f23432c
            if (r1 != r0) goto L8
            goto Lb6
        L8:
            byte[] r2 = r10.f23430a
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L14
            r10.f23434e = r3
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r3
            r5 = 9
            if (r1 >= r5) goto L1b
            goto Lb6
        L1b:
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r3 = r3 ^ r4
            long r3 = (long) r3
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2e
            r5 = -128(0xffffffffffffff80, double:NaN)
        L2b:
            long r3 = r3 ^ r5
            goto Lbb
        L2e:
            int r7 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            long r8 = (long) r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L40
            r0 = 16256(0x3f80, double:8.0315E-320)
        L3c:
            long r3 = r3 ^ r0
        L3d:
            r1 = r7
            goto Lbb
        L40:
            int r1 = r0 + 4
            r7 = r2[r7]
            int r7 = r7 << 21
            long r7 = (long) r7
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L50
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L2b
        L50:
            int r7 = r0 + 5
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 28
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L61
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3c
        L61:
            int r1 = r0 + 6
            r7 = r2[r7]
            long r7 = (long) r7
            r9 = 35
            long r7 = r7 << r9
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L74
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L2b
        L74:
            int r7 = r0 + 7
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 42
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L87
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3c
        L87:
            int r1 = r0 + 8
            r7 = r2[r7]
            long r7 = (long) r7
            r9 = 49
            long r7 = r7 << r9
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L9a
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L2b
        L9a:
            int r7 = r0 + 9
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 56
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L3d
            int r1 = r0 + 10
            r0 = r2[r7]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto Lbb
        Lb6:
            long r0 = r10.C()
            return r0
        Lbb:
            r10.f23434e = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: of.e.B():long");
    }

    long C() throws k {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bV = v();
            j10 |= ((long) (bV & 127)) << i10;
            if ((bV & 128) == 0) {
                return j10;
            }
        }
        throw k.f();
    }

    public int D() {
        return x();
    }

    public long E() {
        return y();
    }

    public int F() {
        return b(z());
    }

    public long G() {
        return c(B());
    }

    public String H() {
        int iZ = z();
        int i10 = this.f23432c;
        int i11 = this.f23434e;
        if (iZ > i10 - i11 || iZ <= 0) {
            return iZ == 0 ? "" : new String(w(iZ), Utf8Charset.NAME);
        }
        String str = new String(this.f23430a, i11, iZ, Utf8Charset.NAME);
        this.f23434e += iZ;
        return str;
    }

    public String I() throws k {
        byte[] bArrW;
        int iZ = z();
        int i10 = this.f23434e;
        if (iZ <= this.f23432c - i10 && iZ > 0) {
            bArrW = this.f23430a;
            this.f23434e = i10 + iZ;
        } else {
            if (iZ == 0) {
                return "";
            }
            bArrW = w(iZ);
            i10 = 0;
        }
        if (x.f(bArrW, i10, i10 + iZ)) {
            return new String(bArrW, i10, iZ, Utf8Charset.NAME);
        }
        throw k.d();
    }

    public int J() throws k {
        if (f()) {
            this.f23436g = 0;
            return 0;
        }
        int iZ = z();
        this.f23436g = iZ;
        if (y.a(iZ) != 0) {
            return this.f23436g;
        }
        throw k.c();
    }

    public int K() {
        return z();
    }

    public long L() {
        return B();
    }

    public boolean O(int i10, f fVar) throws k {
        int iB = y.b(i10);
        if (iB == 0) {
            long jS = s();
            fVar.n0(i10);
            fVar.y0(jS);
            return true;
        }
        if (iB == 1) {
            long jY = y();
            fVar.n0(i10);
            fVar.U(jY);
            return true;
        }
        if (iB == 2) {
            d dVarK = k();
            fVar.n0(i10);
            fVar.O(dVarK);
            return true;
        }
        if (iB == 3) {
            fVar.n0(i10);
            P(fVar);
            int iC = y.c(y.a(i10), 4);
            a(iC);
            fVar.n0(iC);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw k.e();
        }
        int iX = x();
        fVar.n0(i10);
        fVar.T(iX);
        return true;
    }

    public void P(f fVar) throws k {
        int iJ;
        do {
            iJ = J();
            if (iJ == 0) {
                return;
            }
        } while (O(iJ, fVar));
    }

    public void Q(int i10) throws k {
        int i11 = this.f23432c;
        int i12 = this.f23434e;
        if (i10 > i11 - i12 || i10 < 0) {
            R(i10);
        } else {
            this.f23434e = i12 + i10;
        }
    }

    public void a(int i10) throws k {
        if (this.f23436g != i10) {
            throw k.b();
        }
    }

    public int e() {
        int i10 = this.f23439j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f23438i + this.f23434e);
    }

    public boolean f() {
        return this.f23434e == this.f23432c && !S(1);
    }

    public void h(int i10) {
        this.f23439j = i10;
        M();
    }

    public int i(int i10) throws k {
        if (i10 < 0) {
            throw k.g();
        }
        int i11 = i10 + this.f23438i + this.f23434e;
        int i12 = this.f23439j;
        if (i11 > i12) {
            throw k.k();
        }
        this.f23439j = i11;
        M();
        return i12;
    }

    public boolean j() {
        return B() != 0;
    }

    public d k() {
        int iZ = z();
        int i10 = this.f23432c;
        int i11 = this.f23434e;
        if (iZ > i10 - i11 || iZ <= 0) {
            return iZ == 0 ? d.f23423a : new o(w(iZ));
        }
        d cVar = (this.f23431b && this.f23437h) ? new c(this.f23430a, this.f23434e, iZ) : d.f(this.f23430a, i11, iZ);
        this.f23434e += iZ;
        return cVar;
    }

    public double l() {
        return Double.longBitsToDouble(y());
    }

    public int m() {
        return z();
    }

    public int n() {
        return x();
    }

    public long o() {
        return y();
    }

    public float p() {
        return Float.intBitsToFloat(x());
    }

    public void q(int i10, p.a aVar, g gVar) throws k {
        int i11 = this.f23440k;
        if (i11 >= this.f23441l) {
            throw k.h();
        }
        this.f23440k = i11 + 1;
        aVar.S(this, gVar);
        a(y.c(i10, 4));
        this.f23440k--;
    }

    public int r() {
        return z();
    }

    public long s() {
        return B();
    }

    public p t(r rVar, g gVar) throws k {
        int iZ = z();
        if (this.f23440k >= this.f23441l) {
            throw k.h();
        }
        int i10 = i(iZ);
        this.f23440k++;
        p pVar = (p) rVar.b(this, gVar);
        a(0);
        this.f23440k--;
        h(i10);
        return pVar;
    }

    public void u(p.a aVar, g gVar) throws k {
        int iZ = z();
        if (this.f23440k >= this.f23441l) {
            throw k.h();
        }
        int i10 = i(iZ);
        this.f23440k++;
        aVar.S(this, gVar);
        a(0);
        this.f23440k--;
        h(i10);
    }

    public byte v() throws k {
        if (this.f23434e == this.f23432c) {
            N(1);
        }
        byte[] bArr = this.f23430a;
        int i10 = this.f23434e;
        this.f23434e = i10 + 1;
        return bArr[i10];
    }

    public int x() throws k {
        int i10 = this.f23434e;
        if (this.f23432c - i10 < 4) {
            N(4);
            i10 = this.f23434e;
        }
        byte[] bArr = this.f23430a;
        this.f23434e = i10 + 4;
        return ((bArr[i10 + 3] & MessagePack.Code.EXT_TIMESTAMP) << 24) | (bArr[i10] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((bArr[i10 + 2] & MessagePack.Code.EXT_TIMESTAMP) << 16);
    }

    public long y() throws k {
        int i10 = this.f23434e;
        if (this.f23432c - i10 < 8) {
            N(8);
            i10 = this.f23434e;
        }
        byte[] bArr = this.f23430a;
        this.f23434e = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public int z() {
        int i10;
        int i11 = this.f23434e;
        int i12 = this.f23432c;
        if (i12 != i11) {
            byte[] bArr = this.f23430a;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f23434e = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                long j10 = i15;
                if (j10 < 0) {
                    i10 = (int) ((-128) ^ j10);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    long j11 = i17;
                    if (j11 >= 0) {
                        i10 = (int) (16256 ^ j11);
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        long j12 = i19;
                        if (j12 < 0) {
                            i10 = (int) ((-2080896) ^ j12);
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (int) (((long) (i19 ^ (b11 << 28))) ^ 266354560);
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f23434e = i14;
                return i10;
            }
        }
        return (int) C();
    }
}
