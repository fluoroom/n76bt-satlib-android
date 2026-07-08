package com.google.protobuf;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.protobuf.l1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f9153f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f9154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f9155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f9156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    n f9157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9158e;

    private static final class b extends m {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f9159g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f9160h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f9161i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f9162j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f9163k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f9164l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f9165m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f9166n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f9167o;

        private void Y() {
            int i10 = this.f9161i + this.f9162j;
            this.f9161i = i10;
            int i11 = i10 - this.f9164l;
            int i12 = this.f9167o;
            if (i11 <= i12) {
                this.f9162j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f9162j = i13;
            this.f9161i = i10 - i13;
        }

        private void a0() throws p0 {
            if (this.f9161i - this.f9163k >= 10) {
                b0();
            } else {
                c0();
            }
        }

        private void b0() throws p0 {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f9159g;
                int i11 = this.f9163k;
                this.f9163k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw p0.e();
        }

        private void c0() throws p0 {
            for (int i10 = 0; i10 < 10; i10++) {
                if (S() >= 0) {
                    return;
                }
            }
            throw p0.e();
        }

        @Override // com.google.protobuf.m
        public l1 A(z1 z1Var, y yVar) throws p0 {
            int iC = C();
            b();
            int iP = p(iC);
            this.f9154a++;
            l1 l1Var = (l1) z1Var.parsePartialFrom(this, yVar);
            a(0);
            this.f9154a--;
            if (e() != 0) {
                throw p0.l();
            }
            o(iP);
            return l1Var;
        }

        @Override // com.google.protobuf.m
        public void B(l1.a aVar, y yVar) throws p0 {
            int iC = C();
            b();
            int iP = p(iC);
            this.f9154a++;
            aVar.mergeFrom(this, yVar);
            a(0);
            this.f9154a--;
            if (e() != 0) {
                throw p0.l();
            }
            o(iP);
        }

        @Override // com.google.protobuf.m
        public int C() {
            int i10;
            int i11 = this.f9163k;
            int i12 = this.f9161i;
            if (i12 != i11) {
                byte[] bArr = this.f9159g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f9163k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
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
                    this.f9163k = i14;
                    return i10;
                }
            }
            return (int) X();
        }

        @Override // com.google.protobuf.m
        public int E() {
            return U();
        }

        @Override // com.google.protobuf.m
        public long F() {
            return V();
        }

        @Override // com.google.protobuf.m
        public int G() {
            return m.c(C());
        }

        @Override // com.google.protobuf.m
        public long H() {
            return m.d(W());
        }

        @Override // com.google.protobuf.m
        public String I() throws p0 {
            int iC = C();
            if (iC > 0) {
                int i10 = this.f9161i;
                int i11 = this.f9163k;
                if (iC <= i10 - i11) {
                    String str = new String(this.f9159g, i11, iC, o0.f9245b);
                    this.f9163k += iC;
                    return str;
                }
            }
            if (iC == 0) {
                return "";
            }
            if (iC < 0) {
                throw p0.f();
            }
            throw p0.l();
        }

        @Override // com.google.protobuf.m
        public String J() throws p0 {
            int iC = C();
            if (iC > 0) {
                int i10 = this.f9161i;
                int i11 = this.f9163k;
                if (iC <= i10 - i11) {
                    String strH = z2.h(this.f9159g, i11, iC);
                    this.f9163k += iC;
                    return strH;
                }
            }
            if (iC == 0) {
                return "";
            }
            if (iC <= 0) {
                throw p0.f();
            }
            throw p0.l();
        }

        @Override // com.google.protobuf.m
        public int K() throws p0 {
            if (g()) {
                this.f9165m = 0;
                return 0;
            }
            int iC = C();
            this.f9165m = iC;
            if (a3.a(iC) != 0) {
                return this.f9165m;
            }
            throw p0.b();
        }

        @Override // com.google.protobuf.m
        public int L() {
            return C();
        }

        @Override // com.google.protobuf.m
        public long M() {
            return W();
        }

        @Override // com.google.protobuf.m
        public boolean Q(int i10) throws p0 {
            int iB = a3.b(i10);
            if (iB == 0) {
                a0();
                return true;
            }
            if (iB == 1) {
                Z(8);
                return true;
            }
            if (iB == 2) {
                Z(C());
                return true;
            }
            if (iB == 3) {
                R();
                a(a3.c(a3.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw p0.d();
            }
            Z(4);
            return true;
        }

        public byte S() throws p0 {
            int i10 = this.f9163k;
            if (i10 == this.f9161i) {
                throw p0.l();
            }
            byte[] bArr = this.f9159g;
            this.f9163k = i10 + 1;
            return bArr[i10];
        }

        public byte[] T(int i10) throws p0 {
            if (i10 > 0) {
                int i11 = this.f9161i;
                int i12 = this.f9163k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f9163k = i13;
                    return Arrays.copyOfRange(this.f9159g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw p0.l();
            }
            if (i10 == 0) {
                return o0.f9247d;
            }
            throw p0.f();
        }

        public int U() throws p0 {
            int i10 = this.f9163k;
            if (this.f9161i - i10 < 4) {
                throw p0.l();
            }
            byte[] bArr = this.f9159g;
            this.f9163k = i10 + 4;
            return ((bArr[i10 + 3] & MessagePack.Code.EXT_TIMESTAMP) << 24) | (bArr[i10] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((bArr[i10 + 2] & MessagePack.Code.EXT_TIMESTAMP) << 16);
        }

        public long V() throws p0 {
            int i10 = this.f9163k;
            if (this.f9161i - i10 < 8) {
                throw p0.l();
            }
            byte[] bArr = this.f9159g;
            this.f9163k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public long W() {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f9163k;
            int i11 = this.f9161i;
            if (i11 != i10) {
                byte[] bArr = this.f9159g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f9163k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                j13 = (-2080896) ^ i18;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i17 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i17]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i19 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i19;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j13 = j11 ^ j16;
                                }
                                j10 = j12 ^ j15;
                            }
                            i13 = i17;
                            j10 = j13;
                        }
                    }
                    this.f9163k = i13;
                    return j10;
                }
            }
            return X();
        }

        long X() throws p0 {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bS = S();
                j10 |= ((long) (bS & 127)) << i10;
                if ((bS & 128) == 0) {
                    return j10;
                }
            }
            throw p0.e();
        }

        public void Z(int i10) throws p0 {
            if (i10 >= 0) {
                int i11 = this.f9161i;
                int i12 = this.f9163k;
                if (i10 <= i11 - i12) {
                    this.f9163k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw p0.l();
            }
            throw p0.f();
        }

        @Override // com.google.protobuf.m
        public void a(int i10) throws p0 {
            if (this.f9165m != i10) {
                throw p0.a();
            }
        }

        @Override // com.google.protobuf.m
        public int e() {
            int i10 = this.f9167o;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - f();
        }

        @Override // com.google.protobuf.m
        public int f() {
            return this.f9163k - this.f9164l;
        }

        @Override // com.google.protobuf.m
        public boolean g() {
            return this.f9163k == this.f9161i;
        }

        @Override // com.google.protobuf.m
        public void o(int i10) {
            this.f9167o = i10;
            Y();
        }

        @Override // com.google.protobuf.m
        public int p(int i10) throws p0 {
            if (i10 < 0) {
                throw p0.f();
            }
            int iF = i10 + f();
            if (iF < 0) {
                throw p0.g();
            }
            int i11 = this.f9167o;
            if (iF > i11) {
                throw p0.l();
            }
            this.f9167o = iF;
            Y();
            return i11;
        }

        @Override // com.google.protobuf.m
        public boolean q() {
            return W() != 0;
        }

        @Override // com.google.protobuf.m
        public l r() {
            int iC = C();
            if (iC > 0) {
                int i10 = this.f9161i;
                int i11 = this.f9163k;
                if (iC <= i10 - i11) {
                    l lVarS = (this.f9160h && this.f9166n) ? l.S(this.f9159g, i11, iC) : l.h(this.f9159g, i11, iC);
                    this.f9163k += iC;
                    return lVarS;
                }
            }
            return iC == 0 ? l.f9119b : l.R(T(iC));
        }

        @Override // com.google.protobuf.m
        public double s() {
            return Double.longBitsToDouble(V());
        }

        @Override // com.google.protobuf.m
        public int t() {
            return C();
        }

        @Override // com.google.protobuf.m
        public int u() {
            return U();
        }

        @Override // com.google.protobuf.m
        public long v() {
            return V();
        }

        @Override // com.google.protobuf.m
        public float w() {
            return Float.intBitsToFloat(U());
        }

        @Override // com.google.protobuf.m
        public void x(int i10, l1.a aVar, y yVar) throws p0 {
            b();
            this.f9154a++;
            aVar.mergeFrom(this, yVar);
            a(a3.c(i10, 4));
            this.f9154a--;
        }

        @Override // com.google.protobuf.m
        public int y() {
            return C();
        }

        @Override // com.google.protobuf.m
        public long z() {
            return W();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f9167o = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f9159g = bArr;
            this.f9161i = i11 + i10;
            this.f9163k = i10;
            this.f9164l = i10;
            this.f9160h = z10;
        }
    }

    private static final class c extends m {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final InputStream f9168g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f9169h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f9170i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f9171j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f9172k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f9173l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f9174m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f9175n;

        private static int S(InputStream inputStream) throws p0 {
            try {
                return inputStream.available();
            } catch (p0 e10) {
                e10.i();
                throw e10;
            }
        }

        private static int T(InputStream inputStream, byte[] bArr, int i10, int i11) throws p0 {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (p0 e10) {
                e10.i();
                throw e10;
            }
        }

        private l U(int i10) throws IOException {
            byte[] bArrX = X(i10);
            if (bArrX != null) {
                return l.g(bArrX);
            }
            int i11 = this.f9172k;
            int i12 = this.f9170i;
            int length = i12 - i11;
            this.f9174m += i12;
            this.f9172k = 0;
            this.f9170i = 0;
            List<byte[]> listY = Y(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f9169h, i11, bArr, 0, length);
            for (byte[] bArr2 : listY) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return l.R(bArr);
        }

        private byte[] W(int i10, boolean z10) throws IOException {
            byte[] bArrX = X(i10);
            if (bArrX != null) {
                return z10 ? (byte[]) bArrX.clone() : bArrX;
            }
            int i11 = this.f9172k;
            int i12 = this.f9170i;
            int length = i12 - i11;
            this.f9174m += i12;
            this.f9172k = 0;
            this.f9170i = 0;
            List<byte[]> listY = Y(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f9169h, i11, bArr, 0, length);
            for (byte[] bArr2 : listY) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] X(int i10) throws p0 {
            if (i10 == 0) {
                return o0.f9247d;
            }
            if (i10 < 0) {
                throw p0.f();
            }
            int i11 = this.f9174m;
            int i12 = this.f9172k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f9156c > 0) {
                throw p0.k();
            }
            int i14 = this.f9175n;
            if (i13 > i14) {
                g0((i14 - i11) - i12);
                throw p0.l();
            }
            int i15 = this.f9170i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > S(this.f9168g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f9169h, this.f9172k, bArr, 0, i15);
            this.f9174m += this.f9170i;
            this.f9172k = 0;
            this.f9170i = 0;
            while (i15 < i10) {
                int iT = T(this.f9168g, bArr, i15, i10 - i15);
                if (iT == -1) {
                    throw p0.l();
                }
                this.f9174m += iT;
                i15 += iT;
            }
            return bArr;
        }

        private List Y(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f9168g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw p0.l();
                    }
                    this.f9174m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void d0() {
            int i10 = this.f9170i + this.f9171j;
            this.f9170i = i10;
            int i11 = this.f9174m + i10;
            int i12 = this.f9175n;
            if (i11 <= i12) {
                this.f9171j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f9171j = i13;
            this.f9170i = i10 - i13;
        }

        private void e0(int i10) throws p0 {
            if (l0(i10)) {
                return;
            }
            if (i10 <= (this.f9156c - this.f9174m) - this.f9172k) {
                throw p0.l();
            }
            throw p0.k();
        }

        private static long f0(InputStream inputStream, long j10) throws p0 {
            try {
                return inputStream.skip(j10);
            } catch (p0 e10) {
                e10.i();
                throw e10;
            }
        }

        private void h0(int i10) throws p0 {
            if (i10 < 0) {
                throw p0.f();
            }
            int i11 = this.f9174m;
            int i12 = this.f9172k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f9175n;
            if (i13 > i14) {
                g0((i14 - i11) - i12);
                throw p0.l();
            }
            this.f9174m = i11 + i12;
            int i15 = this.f9170i - i12;
            this.f9170i = 0;
            this.f9172k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jF0 = f0(this.f9168g, j10);
                    if (jF0 < 0 || jF0 > j10) {
                        throw new IllegalStateException(this.f9168g.getClass() + "#skip returned invalid result: " + jF0 + "\nThe InputStream implementation is buggy.");
                    }
                    if (jF0 == 0) {
                        break;
                    } else {
                        i15 += (int) jF0;
                    }
                } finally {
                    this.f9174m += i15;
                    d0();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f9170i;
            int i17 = i16 - this.f9172k;
            this.f9172k = i16;
            e0(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f9170i;
                if (i18 <= i19) {
                    this.f9172k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f9172k = i19;
                    e0(1);
                }
            }
        }

        private void i0() throws p0 {
            if (this.f9170i - this.f9172k >= 10) {
                j0();
            } else {
                k0();
            }
        }

        private void j0() throws p0 {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f9169h;
                int i11 = this.f9172k;
                this.f9172k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw p0.e();
        }

        private void k0() throws p0 {
            for (int i10 = 0; i10 < 10; i10++) {
                if (V() >= 0) {
                    return;
                }
            }
            throw p0.e();
        }

        private boolean l0(int i10) throws p0 {
            int i11 = this.f9172k;
            int i12 = i11 + i10;
            int i13 = this.f9170i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f9156c;
            int i15 = this.f9174m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f9175n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f9169h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f9174m += i11;
                this.f9170i -= i11;
                this.f9172k = 0;
            }
            InputStream inputStream = this.f9168g;
            byte[] bArr2 = this.f9169h;
            int i16 = this.f9170i;
            int iT = T(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f9156c - this.f9174m) - i16));
            if (iT == 0 || iT < -1 || iT > this.f9169h.length) {
                throw new IllegalStateException(this.f9168g.getClass() + "#read(byte[]) returned invalid result: " + iT + "\nThe InputStream implementation is buggy.");
            }
            if (iT <= 0) {
                return false;
            }
            this.f9170i += iT;
            d0();
            if (this.f9170i >= i10) {
                return true;
            }
            return l0(i10);
        }

        @Override // com.google.protobuf.m
        public l1 A(z1 z1Var, y yVar) throws p0 {
            int iC = C();
            b();
            int iP = p(iC);
            this.f9154a++;
            l1 l1Var = (l1) z1Var.parsePartialFrom(this, yVar);
            a(0);
            this.f9154a--;
            if (e() != 0) {
                throw p0.l();
            }
            o(iP);
            return l1Var;
        }

        @Override // com.google.protobuf.m
        public void B(l1.a aVar, y yVar) throws p0 {
            int iC = C();
            b();
            int iP = p(iC);
            this.f9154a++;
            aVar.mergeFrom(this, yVar);
            a(0);
            this.f9154a--;
            if (e() != 0) {
                throw p0.l();
            }
            o(iP);
        }

        @Override // com.google.protobuf.m
        public int C() {
            int i10;
            int i11 = this.f9172k;
            int i12 = this.f9170i;
            if (i12 != i11) {
                byte[] bArr = this.f9169h;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f9172k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
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
                    this.f9172k = i14;
                    return i10;
                }
            }
            return (int) c0();
        }

        @Override // com.google.protobuf.m
        public int E() {
            return Z();
        }

        @Override // com.google.protobuf.m
        public long F() {
            return a0();
        }

        @Override // com.google.protobuf.m
        public int G() {
            return m.c(C());
        }

        @Override // com.google.protobuf.m
        public long H() {
            return m.d(b0());
        }

        @Override // com.google.protobuf.m
        public String I() throws p0 {
            int iC = C();
            if (iC > 0) {
                int i10 = this.f9170i;
                int i11 = this.f9172k;
                if (iC <= i10 - i11) {
                    String str = new String(this.f9169h, i11, iC, o0.f9245b);
                    this.f9172k += iC;
                    return str;
                }
            }
            if (iC == 0) {
                return "";
            }
            if (iC < 0) {
                throw p0.f();
            }
            if (iC > this.f9170i) {
                return new String(W(iC, false), o0.f9245b);
            }
            e0(iC);
            String str2 = new String(this.f9169h, this.f9172k, iC, o0.f9245b);
            this.f9172k += iC;
            return str2;
        }

        @Override // com.google.protobuf.m
        public String J() throws IOException {
            byte[] bArrW;
            int iC = C();
            int i10 = this.f9172k;
            int i11 = this.f9170i;
            if (iC <= i11 - i10 && iC > 0) {
                bArrW = this.f9169h;
                this.f9172k = i10 + iC;
            } else {
                if (iC == 0) {
                    return "";
                }
                if (iC < 0) {
                    throw p0.f();
                }
                i10 = 0;
                if (iC <= i11) {
                    e0(iC);
                    bArrW = this.f9169h;
                    this.f9172k = iC;
                } else {
                    bArrW = W(iC, false);
                }
            }
            return z2.h(bArrW, i10, iC);
        }

        @Override // com.google.protobuf.m
        public int K() throws p0 {
            if (g()) {
                this.f9173l = 0;
                return 0;
            }
            int iC = C();
            this.f9173l = iC;
            if (a3.a(iC) != 0) {
                return this.f9173l;
            }
            throw p0.b();
        }

        @Override // com.google.protobuf.m
        public int L() {
            return C();
        }

        @Override // com.google.protobuf.m
        public long M() {
            return b0();
        }

        @Override // com.google.protobuf.m
        public boolean Q(int i10) throws p0 {
            int iB = a3.b(i10);
            if (iB == 0) {
                i0();
                return true;
            }
            if (iB == 1) {
                g0(8);
                return true;
            }
            if (iB == 2) {
                g0(C());
                return true;
            }
            if (iB == 3) {
                R();
                a(a3.c(a3.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw p0.d();
            }
            g0(4);
            return true;
        }

        public byte V() throws p0 {
            if (this.f9172k == this.f9170i) {
                e0(1);
            }
            byte[] bArr = this.f9169h;
            int i10 = this.f9172k;
            this.f9172k = i10 + 1;
            return bArr[i10];
        }

        public int Z() throws p0 {
            int i10 = this.f9172k;
            if (this.f9170i - i10 < 4) {
                e0(4);
                i10 = this.f9172k;
            }
            byte[] bArr = this.f9169h;
            this.f9172k = i10 + 4;
            return ((bArr[i10 + 3] & MessagePack.Code.EXT_TIMESTAMP) << 24) | (bArr[i10] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((bArr[i10 + 2] & MessagePack.Code.EXT_TIMESTAMP) << 16);
        }

        @Override // com.google.protobuf.m
        public void a(int i10) throws p0 {
            if (this.f9173l != i10) {
                throw p0.a();
            }
        }

        public long a0() throws p0 {
            int i10 = this.f9172k;
            if (this.f9170i - i10 < 8) {
                e0(8);
                i10 = this.f9172k;
            }
            byte[] bArr = this.f9169h;
            this.f9172k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public long b0() {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f9172k;
            int i11 = this.f9170i;
            if (i11 != i10) {
                byte[] bArr = this.f9169h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f9172k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                j13 = (-2080896) ^ i18;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i17 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i17]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i19 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i19;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j13 = j11 ^ j16;
                                }
                                j10 = j12 ^ j15;
                            }
                            i13 = i17;
                            j10 = j13;
                        }
                    }
                    this.f9172k = i13;
                    return j10;
                }
            }
            return c0();
        }

        long c0() throws p0 {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bV = V();
                j10 |= ((long) (bV & 127)) << i10;
                if ((bV & 128) == 0) {
                    return j10;
                }
            }
            throw p0.e();
        }

        @Override // com.google.protobuf.m
        public int e() {
            int i10 = this.f9175n;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - (this.f9174m + this.f9172k);
        }

        @Override // com.google.protobuf.m
        public int f() {
            return this.f9174m + this.f9172k;
        }

        @Override // com.google.protobuf.m
        public boolean g() {
            return this.f9172k == this.f9170i && !l0(1);
        }

        public void g0(int i10) throws p0 {
            int i11 = this.f9170i;
            int i12 = this.f9172k;
            if (i10 > i11 - i12 || i10 < 0) {
                h0(i10);
            } else {
                this.f9172k = i12 + i10;
            }
        }

        @Override // com.google.protobuf.m
        public void o(int i10) {
            this.f9175n = i10;
            d0();
        }

        @Override // com.google.protobuf.m
        public int p(int i10) throws p0 {
            if (i10 < 0) {
                throw p0.f();
            }
            int i11 = i10 + this.f9174m + this.f9172k;
            int i12 = this.f9175n;
            if (i11 > i12) {
                throw p0.l();
            }
            this.f9175n = i11;
            d0();
            return i12;
        }

        @Override // com.google.protobuf.m
        public boolean q() {
            return b0() != 0;
        }

        @Override // com.google.protobuf.m
        public l r() throws p0 {
            int iC = C();
            int i10 = this.f9170i;
            int i11 = this.f9172k;
            if (iC <= i10 - i11 && iC > 0) {
                l lVarH = l.h(this.f9169h, i11, iC);
                this.f9172k += iC;
                return lVarH;
            }
            if (iC == 0) {
                return l.f9119b;
            }
            if (iC >= 0) {
                return U(iC);
            }
            throw p0.f();
        }

        @Override // com.google.protobuf.m
        public double s() {
            return Double.longBitsToDouble(a0());
        }

        @Override // com.google.protobuf.m
        public int t() {
            return C();
        }

        @Override // com.google.protobuf.m
        public int u() {
            return Z();
        }

        @Override // com.google.protobuf.m
        public long v() {
            return a0();
        }

        @Override // com.google.protobuf.m
        public float w() {
            return Float.intBitsToFloat(Z());
        }

        @Override // com.google.protobuf.m
        public void x(int i10, l1.a aVar, y yVar) throws p0 {
            b();
            this.f9154a++;
            aVar.mergeFrom(this, yVar);
            a(a3.c(i10, 4));
            this.f9154a--;
        }

        @Override // com.google.protobuf.m
        public int y() {
            return C();
        }

        @Override // com.google.protobuf.m
        public long z() {
            return b0();
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f9175n = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            o0.b(inputStream, "input");
            this.f9168g = inputStream;
            this.f9169h = new byte[i10];
            this.f9170i = 0;
            this.f9172k = 0;
            this.f9174m = 0;
        }
    }

    private static final class d extends m {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ByteBuffer f9176g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f9177h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f9178i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f9179j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f9180k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f9181l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f9182m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f9183n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f9184o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f9185p;

        private int S(long j10) {
            return (int) (j10 - this.f9178i);
        }

        static boolean T() {
            return y2.K();
        }

        private void Z() {
            long j10 = this.f9179j + ((long) this.f9182m);
            this.f9179j = j10;
            int i10 = (int) (j10 - this.f9181l);
            int i11 = this.f9185p;
            if (i10 <= i11) {
                this.f9182m = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f9182m = i12;
            this.f9179j = j10 - ((long) i12);
        }

        private int a0() {
            return (int) (this.f9179j - this.f9180k);
        }

        private void c0() throws p0 {
            if (a0() >= 10) {
                d0();
            } else {
                e0();
            }
        }

        private void d0() throws p0 {
            for (int i10 = 0; i10 < 10; i10++) {
                long j10 = this.f9180k;
                this.f9180k = 1 + j10;
                if (y2.w(j10) >= 0) {
                    return;
                }
            }
            throw p0.e();
        }

        private void e0() throws p0 {
            for (int i10 = 0; i10 < 10; i10++) {
                if (U() >= 0) {
                    return;
                }
            }
            throw p0.e();
        }

        private ByteBuffer f0(long j10, long j11) {
            int iPosition = this.f9176g.position();
            int iLimit = this.f9176g.limit();
            ByteBuffer byteBuffer = this.f9176g;
            try {
                try {
                    byteBuffer.position(S(j10));
                    byteBuffer.limit(S(j11));
                    return this.f9176g.slice();
                } catch (IllegalArgumentException e10) {
                    p0 p0VarL = p0.l();
                    p0VarL.initCause(e10);
                    throw p0VarL;
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        @Override // com.google.protobuf.m
        public l1 A(z1 z1Var, y yVar) throws p0 {
            int iC = C();
            b();
            int iP = p(iC);
            this.f9154a++;
            l1 l1Var = (l1) z1Var.parsePartialFrom(this, yVar);
            a(0);
            this.f9154a--;
            if (e() != 0) {
                throw p0.l();
            }
            o(iP);
            return l1Var;
        }

        @Override // com.google.protobuf.m
        public void B(l1.a aVar, y yVar) throws p0 {
            int iC = C();
            b();
            int iP = p(iC);
            this.f9154a++;
            aVar.mergeFrom(this, yVar);
            a(0);
            this.f9154a--;
            if (e() != 0) {
                throw p0.l();
            }
            o(iP);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.protobuf.y2.w(r3) < 0) goto L34;
         */
        @Override // com.google.protobuf.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int C() {
            /*
                r10 = this;
                long r0 = r10.f9180k
                long r2 = r10.f9179j
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.protobuf.y2.w(r0)
                if (r4 < 0) goto L16
                r10.f9180k = r2
                return r4
            L16:
                long r5 = r10.f9179j
                long r5 = r5 - r2
                r7 = 9
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.protobuf.y2.w(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.y2.w(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.y2.w(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.y2.w(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.y2.w(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.y2.w(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.y2.w(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.google.protobuf.y2.w(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.protobuf.y2.w(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r10.Y()
                int r1 = (int) r0
                return r1
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r10.f9180k = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.m.d.C():int");
        }

        @Override // com.google.protobuf.m
        public int E() {
            return V();
        }

        @Override // com.google.protobuf.m
        public long F() {
            return W();
        }

        @Override // com.google.protobuf.m
        public int G() {
            return m.c(C());
        }

        @Override // com.google.protobuf.m
        public long H() {
            return m.d(X());
        }

        @Override // com.google.protobuf.m
        public String I() throws p0 {
            int iC = C();
            if (iC <= 0 || iC > a0()) {
                if (iC == 0) {
                    return "";
                }
                if (iC < 0) {
                    throw p0.f();
                }
                throw p0.l();
            }
            byte[] bArr = new byte[iC];
            long j10 = iC;
            y2.p(this.f9180k, bArr, 0L, j10);
            String str = new String(bArr, o0.f9245b);
            this.f9180k += j10;
            return str;
        }

        @Override // com.google.protobuf.m
        public String J() throws p0 {
            int iC = C();
            if (iC > 0 && iC <= a0()) {
                String strG = z2.g(this.f9176g, S(this.f9180k), iC);
                this.f9180k += (long) iC;
                return strG;
            }
            if (iC == 0) {
                return "";
            }
            if (iC <= 0) {
                throw p0.f();
            }
            throw p0.l();
        }

        @Override // com.google.protobuf.m
        public int K() throws p0 {
            if (g()) {
                this.f9183n = 0;
                return 0;
            }
            int iC = C();
            this.f9183n = iC;
            if (a3.a(iC) != 0) {
                return this.f9183n;
            }
            throw p0.b();
        }

        @Override // com.google.protobuf.m
        public int L() {
            return C();
        }

        @Override // com.google.protobuf.m
        public long M() {
            return X();
        }

        @Override // com.google.protobuf.m
        public boolean Q(int i10) throws p0 {
            int iB = a3.b(i10);
            if (iB == 0) {
                c0();
                return true;
            }
            if (iB == 1) {
                b0(8);
                return true;
            }
            if (iB == 2) {
                b0(C());
                return true;
            }
            if (iB == 3) {
                R();
                a(a3.c(a3.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw p0.d();
            }
            b0(4);
            return true;
        }

        public byte U() throws p0 {
            long j10 = this.f9180k;
            if (j10 == this.f9179j) {
                throw p0.l();
            }
            this.f9180k = 1 + j10;
            return y2.w(j10);
        }

        public int V() throws p0 {
            long j10 = this.f9180k;
            if (this.f9179j - j10 < 4) {
                throw p0.l();
            }
            this.f9180k = 4 + j10;
            return ((y2.w(j10 + 3) & MessagePack.Code.EXT_TIMESTAMP) << 24) | (y2.w(j10) & MessagePack.Code.EXT_TIMESTAMP) | ((y2.w(1 + j10) & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((y2.w(2 + j10) & MessagePack.Code.EXT_TIMESTAMP) << 16);
        }

        public long W() throws p0 {
            long j10 = this.f9180k;
            if (this.f9179j - j10 < 8) {
                throw p0.l();
            }
            this.f9180k = 8 + j10;
            return ((((long) y2.w(j10 + 7)) & 255) << 56) | (((long) y2.w(j10)) & 255) | ((((long) y2.w(1 + j10)) & 255) << 8) | ((((long) y2.w(2 + j10)) & 255) << 16) | ((((long) y2.w(3 + j10)) & 255) << 24) | ((((long) y2.w(4 + j10)) & 255) << 32) | ((((long) y2.w(5 + j10)) & 255) << 40) | ((((long) y2.w(6 + j10)) & 255) << 48);
        }

        public long X() {
            long j10;
            long j11;
            long j12;
            int i10;
            long j13 = this.f9180k;
            if (this.f9179j != j13) {
                long j14 = 1 + j13;
                byte bW = y2.w(j13);
                if (bW >= 0) {
                    this.f9180k = j14;
                    return bW;
                }
                if (this.f9179j - j14 >= 9) {
                    long j15 = 2 + j13;
                    int iW = (y2.w(j14) << 7) ^ bW;
                    if (iW >= 0) {
                        long j16 = 3 + j13;
                        int iW2 = iW ^ (y2.w(j15) << 14);
                        if (iW2 >= 0) {
                            j10 = iW2 ^ 16256;
                            j15 = j16;
                        } else {
                            j15 = 4 + j13;
                            int iW3 = iW2 ^ (y2.w(j16) << 21);
                            if (iW3 < 0) {
                                i10 = (-2080896) ^ iW3;
                            } else {
                                long j17 = 5 + j13;
                                long jW = ((long) iW3) ^ (((long) y2.w(j15)) << 28);
                                if (jW >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j18 = 6 + j13;
                                    long jW2 = jW ^ (((long) y2.w(j17)) << 35);
                                    if (jW2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j17 = 7 + j13;
                                        jW = jW2 ^ (((long) y2.w(j18)) << 42);
                                        if (jW >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j18 = 8 + j13;
                                            jW2 = jW ^ (((long) y2.w(j17)) << 49);
                                            if (jW2 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                long j19 = 9 + j13;
                                                long jW3 = (jW2 ^ (((long) y2.w(j18)) << 56)) ^ 71499008037633920L;
                                                if (jW3 < 0) {
                                                    long j20 = j13 + 10;
                                                    if (y2.w(j19) >= 0) {
                                                        j15 = j20;
                                                        j10 = jW3;
                                                    }
                                                } else {
                                                    j10 = jW3;
                                                    j15 = j19;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ jW2;
                                    j15 = j18;
                                }
                                j10 = j12 ^ jW;
                                j15 = j17;
                            }
                        }
                        this.f9180k = j15;
                        return j10;
                    }
                    i10 = iW ^ (-128);
                    j10 = i10;
                    this.f9180k = j15;
                    return j10;
                }
            }
            return Y();
        }

        long Y() throws p0 {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bU = U();
                j10 |= ((long) (bU & 127)) << i10;
                if ((bU & 128) == 0) {
                    return j10;
                }
            }
            throw p0.e();
        }

        @Override // com.google.protobuf.m
        public void a(int i10) throws p0 {
            if (this.f9183n != i10) {
                throw p0.a();
            }
        }

        public void b0(int i10) throws p0 {
            if (i10 >= 0 && i10 <= a0()) {
                this.f9180k += (long) i10;
            } else {
                if (i10 >= 0) {
                    throw p0.l();
                }
                throw p0.f();
            }
        }

        @Override // com.google.protobuf.m
        public int e() {
            int i10 = this.f9185p;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - f();
        }

        @Override // com.google.protobuf.m
        public int f() {
            return (int) (this.f9180k - this.f9181l);
        }

        @Override // com.google.protobuf.m
        public boolean g() {
            return this.f9180k == this.f9179j;
        }

        @Override // com.google.protobuf.m
        public void o(int i10) {
            this.f9185p = i10;
            Z();
        }

        @Override // com.google.protobuf.m
        public int p(int i10) throws p0 {
            if (i10 < 0) {
                throw p0.f();
            }
            int iF = i10 + f();
            int i11 = this.f9185p;
            if (iF > i11) {
                throw p0.l();
            }
            this.f9185p = iF;
            Z();
            return i11;
        }

        @Override // com.google.protobuf.m
        public boolean q() {
            return X() != 0;
        }

        @Override // com.google.protobuf.m
        public l r() throws p0 {
            int iC = C();
            if (iC <= 0 || iC > a0()) {
                if (iC == 0) {
                    return l.f9119b;
                }
                if (iC < 0) {
                    throw p0.f();
                }
                throw p0.l();
            }
            if (this.f9177h && this.f9184o) {
                long j10 = this.f9180k;
                long j11 = iC;
                ByteBuffer byteBufferF0 = f0(j10, j10 + j11);
                this.f9180k += j11;
                return l.Q(byteBufferF0);
            }
            byte[] bArr = new byte[iC];
            long j12 = iC;
            y2.p(this.f9180k, bArr, 0L, j12);
            this.f9180k += j12;
            return l.R(bArr);
        }

        @Override // com.google.protobuf.m
        public double s() {
            return Double.longBitsToDouble(W());
        }

        @Override // com.google.protobuf.m
        public int t() {
            return C();
        }

        @Override // com.google.protobuf.m
        public int u() {
            return V();
        }

        @Override // com.google.protobuf.m
        public long v() {
            return W();
        }

        @Override // com.google.protobuf.m
        public float w() {
            return Float.intBitsToFloat(V());
        }

        @Override // com.google.protobuf.m
        public void x(int i10, l1.a aVar, y yVar) throws p0 {
            b();
            this.f9154a++;
            aVar.mergeFrom(this, yVar);
            a(a3.c(i10, 4));
            this.f9154a--;
        }

        @Override // com.google.protobuf.m
        public int y() {
            return C();
        }

        @Override // com.google.protobuf.m
        public long z() {
            return X();
        }

        private d(ByteBuffer byteBuffer, boolean z10) {
            super();
            this.f9185p = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f9176g = byteBuffer;
            long jK = y2.k(byteBuffer);
            this.f9178i = jK;
            this.f9179j = ((long) byteBuffer.limit()) + jK;
            long jPosition = jK + ((long) byteBuffer.position());
            this.f9180k = jPosition;
            this.f9181l = jPosition;
            this.f9177h = z10;
        }
    }

    public static int D(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw p0.l();
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
                throw p0.l();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw p0.e();
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static m h(InputStream inputStream) {
        return i(inputStream, 4096);
    }

    public static m i(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? l(o0.f9247d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static m j(ByteBuffer byteBuffer) {
        return k(byteBuffer, false);
    }

    static m k(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return n(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && d.T()) {
            return new d(byteBuffer, z10);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return n(bArr, 0, iRemaining, true);
    }

    public static m l(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public static m m(byte[] bArr, int i10, int i11) {
        return n(bArr, i10, i11, false);
    }

    static m n(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.p(i11);
            return bVar;
        } catch (p0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract l1 A(z1 z1Var, y yVar);

    public abstract void B(l1.a aVar, y yVar);

    public abstract int C();

    public abstract int E();

    public abstract long F();

    public abstract int G();

    public abstract long H();

    public abstract String I();

    public abstract String J();

    public abstract int K();

    public abstract int L();

    public abstract long M();

    public final int N(int i10) {
        if (i10 >= 0) {
            int i11 = this.f9155b;
            this.f9155b = i10;
            return i11;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i10);
    }

    public final int O(int i10) {
        if (i10 >= 0) {
            int i11 = this.f9156c;
            this.f9156c = i10;
            return i11;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i10);
    }

    final boolean P() {
        return this.f9158e;
    }

    public abstract boolean Q(int i10);

    public void R() throws p0 {
        int iK;
        do {
            iK = K();
            if (iK == 0) {
                return;
            }
            b();
            this.f9154a++;
            this.f9154a--;
        } while (Q(iK));
    }

    public abstract void a(int i10);

    public void b() throws p0 {
        if (this.f9154a >= this.f9155b) {
            throw p0.h();
        }
    }

    public abstract int e();

    public abstract int f();

    public abstract boolean g();

    public abstract void o(int i10);

    public abstract int p(int i10);

    public abstract boolean q();

    public abstract l r();

    public abstract double s();

    public abstract int t();

    public abstract int u();

    public abstract long v();

    public abstract float w();

    public abstract void x(int i10, l1.a aVar, y yVar);

    public abstract int y();

    public abstract long z();

    private m() {
        this.f9155b = f9153f;
        this.f9156c = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f9158e = false;
    }
}
