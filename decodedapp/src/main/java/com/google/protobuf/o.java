package com.google.protobuf;

import com.google.protobuf.z2;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f9232b = Logger.getLogger(o.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f9233c = y2.J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9234a;

    private static abstract class b extends o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final byte[] f9235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f9236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f9237f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f9238g;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f9235d = bArr;
            this.f9236e = bArr.length;
        }

        final void W0(byte b10) {
            byte[] bArr = this.f9235d;
            int i10 = this.f9237f;
            this.f9237f = i10 + 1;
            bArr[i10] = b10;
            this.f9238g++;
        }

        final void X0(int i10) {
            byte[] bArr = this.f9235d;
            int i11 = this.f9237f;
            int i12 = i11 + 1;
            this.f9237f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f9237f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f9237f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f9237f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f9238g += 4;
        }

        final void Y0(long j10) {
            byte[] bArr = this.f9235d;
            int i10 = this.f9237f;
            int i11 = i10 + 1;
            this.f9237f = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f9237f = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f9237f = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f9237f = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f9237f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f9237f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f9237f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f9237f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f9238g += 8;
        }

        final void Z0(int i10) {
            if (i10 >= 0) {
                b1(i10);
            } else {
                c1(i10);
            }
        }

        final void a1(int i10, int i11) {
            b1(a3.c(i10, i11));
        }

        final void b1(int i10) {
            if (!o.f9233c) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f9235d;
                    int i11 = this.f9237f;
                    this.f9237f = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    this.f9238g++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f9235d;
                int i12 = this.f9237f;
                this.f9237f = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f9238g++;
                return;
            }
            long j10 = this.f9237f;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f9235d;
                int i13 = this.f9237f;
                this.f9237f = i13 + 1;
                y2.Q(bArr3, i13, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f9235d;
            int i14 = this.f9237f;
            this.f9237f = i14 + 1;
            y2.Q(bArr4, i14, (byte) i10);
            this.f9238g += (int) (((long) this.f9237f) - j10);
        }

        final void c1(long j10) {
            if (!o.f9233c) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f9235d;
                    int i10 = this.f9237f;
                    this.f9237f = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    this.f9238g++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f9235d;
                int i11 = this.f9237f;
                this.f9237f = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f9238g++;
                return;
            }
            long j11 = this.f9237f;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f9235d;
                int i12 = this.f9237f;
                this.f9237f = i12 + 1;
                y2.Q(bArr3, i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f9235d;
            int i13 = this.f9237f;
            this.f9237f = i13 + 1;
            y2.Q(bArr4, i13, (byte) j10);
            this.f9238g += (int) (((long) this.f9237f) - j11);
        }

        @Override // com.google.protobuf.o
        public final int k0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class c extends o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f9239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f9240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f9241f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f9242g;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f9239d = bArr;
            this.f9240e = i10;
            this.f9242g = i10;
            this.f9241f = i12;
        }

        @Override // com.google.protobuf.o
        public final void D0(int i10, int i11) throws d {
            R0(i10, 0);
            E0(i11);
        }

        @Override // com.google.protobuf.o
        public final void E0(int i10) throws d {
            if (i10 >= 0) {
                T0(i10);
            } else {
                V0(i10);
            }
        }

        @Override // com.google.protobuf.o
        public final void H0(int i10, l1 l1Var) throws d {
            R0(i10, 2);
            I0(l1Var);
        }

        @Override // com.google.protobuf.o
        public final void I0(l1 l1Var) throws d {
            T0(l1Var.getSerializedSize());
            l1Var.writeTo(this);
        }

        @Override // com.google.protobuf.o
        public final void J0(int i10, l1 l1Var) throws d {
            R0(1, 3);
            S0(2, i10);
            H0(3, l1Var);
            R0(1, 4);
        }

        @Override // com.google.protobuf.o
        public final void K0(int i10, l lVar) throws d {
            R0(1, 3);
            S0(2, i10);
            q0(3, lVar);
            R0(1, 4);
        }

        @Override // com.google.protobuf.o
        public final void P0(int i10, String str) throws d {
            R0(i10, 2);
            Q0(str);
        }

        @Override // com.google.protobuf.o
        public final void Q0(String str) throws d {
            int i10 = this.f9242g;
            try {
                int iY = o.Y(str.length() * 3);
                int iY2 = o.Y(str.length());
                if (iY2 != iY) {
                    T0(z2.j(str));
                    this.f9242g = z2.i(str, this.f9239d, this.f9242g, k0());
                    return;
                }
                int i11 = i10 + iY2;
                this.f9242g = i11;
                int i12 = z2.i(str, this.f9239d, i11, k0());
                this.f9242g = i10;
                T0((i12 - i10) - iY2);
                this.f9242g = i12;
            } catch (z2.d e10) {
                this.f9242g = i10;
                e0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // com.google.protobuf.o
        public final void R0(int i10, int i11) throws d {
            T0(a3.c(i10, i11));
        }

        @Override // com.google.protobuf.o
        public final void S0(int i10, int i11) throws d {
            R0(i10, 0);
            T0(i11);
        }

        @Override // com.google.protobuf.o
        public final void T0(int i10) throws d {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f9239d;
                    int i11 = this.f9242g;
                    this.f9242g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9242g), Integer.valueOf(this.f9241f), 1), e10);
                }
            }
            byte[] bArr2 = this.f9239d;
            int i12 = this.f9242g;
            this.f9242g = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.protobuf.o
        public final void U0(int i10, long j10) throws d {
            R0(i10, 0);
            V0(j10);
        }

        @Override // com.google.protobuf.o
        public final void V0(long j10) throws d {
            if (o.f9233c && k0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f9239d;
                    int i10 = this.f9242g;
                    this.f9242g = i10 + 1;
                    y2.Q(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f9239d;
                int i11 = this.f9242g;
                this.f9242g = i11 + 1;
                y2.Q(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f9239d;
                    int i12 = this.f9242g;
                    this.f9242g = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9242g), Integer.valueOf(this.f9241f), 1), e10);
                }
            }
            byte[] bArr4 = this.f9239d;
            int i13 = this.f9242g;
            this.f9242g = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void W0(ByteBuffer byteBuffer) throws d {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f9239d, this.f9242g, iRemaining);
                this.f9242g += iRemaining;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9242g), Integer.valueOf(this.f9241f), Integer.valueOf(iRemaining)), e10);
            }
        }

        public final void X0(byte[] bArr, int i10, int i11) throws d {
            try {
                System.arraycopy(bArr, i10, this.f9239d, this.f9242g, i11);
                this.f9242g += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9242g), Integer.valueOf(this.f9241f), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.google.protobuf.k
        public final void a(ByteBuffer byteBuffer) throws d {
            W0(byteBuffer);
        }

        @Override // com.google.protobuf.o, com.google.protobuf.k
        public final void b(byte[] bArr, int i10, int i11) throws d {
            X0(bArr, i10, i11);
        }

        @Override // com.google.protobuf.o
        public void d0() {
        }

        @Override // com.google.protobuf.o
        public final int k0() {
            return this.f9241f - this.f9242g;
        }

        @Override // com.google.protobuf.o
        public final void l0(byte b10) throws d {
            try {
                byte[] bArr = this.f9239d;
                int i10 = this.f9242g;
                this.f9242g = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9242g), Integer.valueOf(this.f9241f), 1), e10);
            }
        }

        @Override // com.google.protobuf.o
        public final void m0(int i10, boolean z10) throws d {
            R0(i10, 0);
            l0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.o
        public final void p0(byte[] bArr, int i10, int i11) throws d {
            T0(i11);
            X0(bArr, i10, i11);
        }

        @Override // com.google.protobuf.o
        public final void q0(int i10, l lVar) throws d {
            R0(i10, 2);
            r0(lVar);
        }

        @Override // com.google.protobuf.o
        public final void r0(l lVar) throws d {
            T0(lVar.size());
            lVar.Y(this);
        }

        @Override // com.google.protobuf.o
        public final void w0(int i10, int i11) throws d {
            R0(i10, 5);
            x0(i11);
        }

        @Override // com.google.protobuf.o
        public final void x0(int i10) throws d {
            try {
                byte[] bArr = this.f9239d;
                int i11 = this.f9242g;
                int i12 = i11 + 1;
                this.f9242g = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f9242g = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f9242g = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f9242g = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9242g), Integer.valueOf(this.f9241f), 1), e10);
            }
        }

        @Override // com.google.protobuf.o
        public final void y0(int i10, long j10) throws d {
            R0(i10, 1);
            z0(j10);
        }

        @Override // com.google.protobuf.o
        public final void z0(long j10) throws d {
            try {
                byte[] bArr = this.f9239d;
                int i10 = this.f9242g;
                int i11 = i10 + 1;
                this.f9242g = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f9242g = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f9242g = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f9242g = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f9242g = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f9242g = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f9242g = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f9242g = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9242g), Integer.valueOf(this.f9241f), 1), e10);
            }
        }
    }

    public static class d extends IOException {
        d(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        d(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    private static final class e extends b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final OutputStream f9243h;

        e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f9243h = outputStream;
        }

        private void d1() throws IOException {
            this.f9243h.write(this.f9235d, 0, this.f9237f);
            this.f9237f = 0;
        }

        private void e1(int i10) throws IOException {
            if (this.f9236e - this.f9237f < i10) {
                d1();
            }
        }

        @Override // com.google.protobuf.o
        public void D0(int i10, int i11) throws IOException {
            e1(20);
            a1(i10, 0);
            Z0(i11);
        }

        @Override // com.google.protobuf.o
        public void E0(int i10) throws IOException {
            if (i10 >= 0) {
                T0(i10);
            } else {
                V0(i10);
            }
        }

        @Override // com.google.protobuf.o
        public void H0(int i10, l1 l1Var) throws IOException {
            R0(i10, 2);
            I0(l1Var);
        }

        @Override // com.google.protobuf.o
        public void I0(l1 l1Var) throws IOException {
            T0(l1Var.getSerializedSize());
            l1Var.writeTo(this);
        }

        @Override // com.google.protobuf.o
        public void J0(int i10, l1 l1Var) throws IOException {
            R0(1, 3);
            S0(2, i10);
            H0(3, l1Var);
            R0(1, 4);
        }

        @Override // com.google.protobuf.o
        public void K0(int i10, l lVar) throws IOException {
            R0(1, 3);
            S0(2, i10);
            q0(3, lVar);
            R0(1, 4);
        }

        @Override // com.google.protobuf.o
        public void P0(int i10, String str) throws IOException {
            R0(i10, 2);
            Q0(str);
        }

        @Override // com.google.protobuf.o
        public void Q0(String str) throws IOException {
            int iJ;
            try {
                int length = str.length() * 3;
                int iY = o.Y(length);
                int i10 = iY + length;
                int i11 = this.f9236e;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int i12 = z2.i(str, bArr, 0, length);
                    T0(i12);
                    b(bArr, 0, i12);
                    return;
                }
                if (i10 > i11 - this.f9237f) {
                    d1();
                }
                int iY2 = o.Y(str.length());
                int i13 = this.f9237f;
                try {
                    if (iY2 == iY) {
                        int i14 = i13 + iY2;
                        this.f9237f = i14;
                        int i15 = z2.i(str, this.f9235d, i14, this.f9236e - i14);
                        this.f9237f = i13;
                        iJ = (i15 - i13) - iY2;
                        b1(iJ);
                        this.f9237f = i15;
                    } else {
                        iJ = z2.j(str);
                        b1(iJ);
                        this.f9237f = z2.i(str, this.f9235d, this.f9237f, iJ);
                    }
                    this.f9238g += iJ;
                } catch (z2.d e10) {
                    this.f9238g -= this.f9237f - i13;
                    this.f9237f = i13;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (z2.d e12) {
                e0(str, e12);
            }
        }

        @Override // com.google.protobuf.o
        public void R0(int i10, int i11) throws IOException {
            T0(a3.c(i10, i11));
        }

        @Override // com.google.protobuf.o
        public void S0(int i10, int i11) throws IOException {
            e1(20);
            a1(i10, 0);
            b1(i11);
        }

        @Override // com.google.protobuf.o
        public void T0(int i10) throws IOException {
            e1(5);
            b1(i10);
        }

        @Override // com.google.protobuf.o
        public void U0(int i10, long j10) throws IOException {
            e1(20);
            a1(i10, 0);
            c1(j10);
        }

        @Override // com.google.protobuf.o
        public void V0(long j10) throws IOException {
            e1(10);
            c1(j10);
        }

        @Override // com.google.protobuf.k
        public void a(ByteBuffer byteBuffer) throws IOException {
            f1(byteBuffer);
        }

        @Override // com.google.protobuf.o, com.google.protobuf.k
        public void b(byte[] bArr, int i10, int i11) throws IOException {
            g1(bArr, i10, i11);
        }

        @Override // com.google.protobuf.o
        public void d0() throws IOException {
            if (this.f9237f > 0) {
                d1();
            }
        }

        public void f1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i10 = this.f9236e;
            int i11 = this.f9237f;
            if (i10 - i11 >= iRemaining) {
                byteBuffer.get(this.f9235d, i11, iRemaining);
                this.f9237f += iRemaining;
                this.f9238g += iRemaining;
                return;
            }
            int i12 = i10 - i11;
            byteBuffer.get(this.f9235d, i11, i12);
            int i13 = iRemaining - i12;
            this.f9237f = this.f9236e;
            this.f9238g += i12;
            d1();
            while (true) {
                int i14 = this.f9236e;
                if (i13 <= i14) {
                    byteBuffer.get(this.f9235d, 0, i13);
                    this.f9237f = i13;
                    this.f9238g += i13;
                    return;
                } else {
                    byteBuffer.get(this.f9235d, 0, i14);
                    this.f9243h.write(this.f9235d, 0, this.f9236e);
                    int i15 = this.f9236e;
                    i13 -= i15;
                    this.f9238g += i15;
                }
            }
        }

        public void g1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f9236e;
            int i13 = this.f9237f;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f9235d, i13, i11);
                this.f9237f += i11;
                this.f9238g += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f9235d, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f9237f = this.f9236e;
            this.f9238g += i14;
            d1();
            if (i16 <= this.f9236e) {
                System.arraycopy(bArr, i15, this.f9235d, 0, i16);
                this.f9237f = i16;
            } else {
                this.f9243h.write(bArr, i15, i16);
            }
            this.f9238g += i16;
        }

        @Override // com.google.protobuf.o
        public void l0(byte b10) throws IOException {
            if (this.f9237f == this.f9236e) {
                d1();
            }
            W0(b10);
        }

        @Override // com.google.protobuf.o
        public void m0(int i10, boolean z10) throws IOException {
            e1(11);
            a1(i10, 0);
            W0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.o
        public void p0(byte[] bArr, int i10, int i11) throws IOException {
            T0(i11);
            g1(bArr, i10, i11);
        }

        @Override // com.google.protobuf.o
        public void q0(int i10, l lVar) throws IOException {
            R0(i10, 2);
            r0(lVar);
        }

        @Override // com.google.protobuf.o
        public void r0(l lVar) throws IOException {
            T0(lVar.size());
            lVar.Y(this);
        }

        @Override // com.google.protobuf.o
        public void w0(int i10, int i11) throws IOException {
            e1(14);
            a1(i10, 5);
            X0(i11);
        }

        @Override // com.google.protobuf.o
        public void x0(int i10) throws IOException {
            e1(4);
            X0(i10);
        }

        @Override // com.google.protobuf.o
        public void y0(int i10, long j10) throws IOException {
            e1(18);
            a1(i10, 1);
            Y0(j10);
        }

        @Override // com.google.protobuf.o
        public void z0(long j10) throws IOException {
            e1(8);
            Y0(j10);
        }
    }

    public static int A(long j10) {
        return a0(j10);
    }

    public static int B(int i10, t0 t0Var) {
        return (W(1) * 2) + X(2, i10) + C(3, t0Var);
    }

    public static int C(int i10, t0 t0Var) {
        return W(i10) + D(t0Var);
    }

    public static int D(t0 t0Var) {
        return E(t0Var.a());
    }

    static int E(int i10) {
        return Y(i10) + i10;
    }

    public static int F(int i10, l1 l1Var) {
        return (W(1) * 2) + X(2, i10) + G(3, l1Var);
    }

    public static int G(int i10, l1 l1Var) {
        return W(i10) + I(l1Var);
    }

    static int H(int i10, l1 l1Var, h2 h2Var) {
        return W(i10) + J(l1Var, h2Var);
    }

    public static int I(l1 l1Var) {
        return E(l1Var.getSerializedSize());
    }

    static int J(l1 l1Var, h2 h2Var) {
        return E(((com.google.protobuf.b) l1Var).getSerializedSize(h2Var));
    }

    static int K(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int L(int i10, l lVar) {
        return (W(1) * 2) + X(2, i10) + h(3, lVar);
    }

    public static int M(int i10, int i11) {
        return W(i10) + N(i11);
    }

    public static int N(int i10) {
        return 4;
    }

    public static int O(int i10, long j10) {
        return W(i10) + P(j10);
    }

    public static int P(long j10) {
        return 8;
    }

    public static int Q(int i10, int i11) {
        return W(i10) + R(i11);
    }

    public static int R(int i10) {
        return Y(b0(i10));
    }

    public static int S(int i10, long j10) {
        return W(i10) + T(j10);
    }

    public static int T(long j10) {
        return a0(c0(j10));
    }

    public static int U(int i10, String str) {
        return W(i10) + V(str);
    }

    public static int V(String str) {
        int length;
        try {
            length = z2.j(str);
        } catch (z2.d unused) {
            length = str.getBytes(o0.f9245b).length;
        }
        return E(length);
    }

    public static int W(int i10) {
        return Y(a3.c(i10, 0));
    }

    public static int X(int i10, int i11) {
        return W(i10) + Y(i11);
    }

    public static int Y(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int Z(int i10, long j10) {
        return W(i10) + a0(j10);
    }

    public static int a0(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int b0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long c0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int e(int i10, boolean z10) {
        return W(i10) + f(z10);
    }

    public static int f(boolean z10) {
        return 1;
    }

    public static int g(byte[] bArr) {
        return E(bArr.length);
    }

    public static o g0(OutputStream outputStream) {
        return h0(outputStream, 4096);
    }

    public static int h(int i10, l lVar) {
        return W(i10) + i(lVar);
    }

    public static o h0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    public static int i(l lVar) {
        return E(lVar.size());
    }

    public static o i0(byte[] bArr) {
        return j0(bArr, 0, bArr.length);
    }

    public static int j(int i10, double d10) {
        return W(i10) + k(d10);
    }

    public static o j0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int k(double d10) {
        return 8;
    }

    public static int l(int i10, int i11) {
        return W(i10) + m(i11);
    }

    public static int m(int i10) {
        return y(i10);
    }

    public static int n(int i10, int i11) {
        return W(i10) + o(i11);
    }

    public static int o(int i10) {
        return 4;
    }

    public static int p(int i10, long j10) {
        return W(i10) + q(j10);
    }

    public static int q(long j10) {
        return 8;
    }

    public static int r(int i10, float f10) {
        return W(i10) + s(f10);
    }

    public static int s(float f10) {
        return 4;
    }

    public static int t(int i10, l1 l1Var) {
        return (W(i10) * 2) + l1Var.getSerializedSize();
    }

    static int u(int i10, l1 l1Var, h2 h2Var) {
        return (W(i10) * 2) + w(l1Var, h2Var);
    }

    public static int v(l1 l1Var) {
        return l1Var.getSerializedSize();
    }

    static int w(l1 l1Var, h2 h2Var) {
        return ((com.google.protobuf.b) l1Var).getSerializedSize(h2Var);
    }

    public static int x(int i10, int i11) {
        return W(i10) + y(i11);
    }

    public static int y(int i10) {
        if (i10 >= 0) {
            return Y(i10);
        }
        return 10;
    }

    public static int z(int i10, long j10) {
        return W(i10) + A(j10);
    }

    public final void A0(float f10) {
        x0(Float.floatToRawIntBits(f10));
    }

    public final void B0(int i10, l1 l1Var) {
        R0(i10, 3);
        C0(l1Var);
        R0(i10, 4);
    }

    public final void C0(l1 l1Var) {
        l1Var.writeTo(this);
    }

    public abstract void D0(int i10, int i11);

    public abstract void E0(int i10);

    public final void F0(int i10, long j10) {
        U0(i10, j10);
    }

    public final void G0(long j10) {
        V0(j10);
    }

    public abstract void H0(int i10, l1 l1Var);

    public abstract void I0(l1 l1Var);

    public abstract void J0(int i10, l1 l1Var);

    public abstract void K0(int i10, l lVar);

    public final void L0(int i10) {
        x0(i10);
    }

    public final void M0(long j10) {
        z0(j10);
    }

    public final void N0(int i10) {
        T0(b0(i10));
    }

    public final void O0(long j10) {
        V0(c0(j10));
    }

    public abstract void P0(int i10, String str);

    public abstract void Q0(String str);

    public abstract void R0(int i10, int i11);

    public abstract void S0(int i10, int i11);

    public abstract void T0(int i10);

    public abstract void U0(int i10, long j10);

    public abstract void V0(long j10);

    @Override // com.google.protobuf.k
    public abstract void b(byte[] bArr, int i10, int i11);

    public final void d() {
        if (k0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void d0();

    final void e0(String str, z2.d dVar) throws d {
        f9232b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(o0.f9245b);
        try {
            T0(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new d(e10);
        }
    }

    boolean f0() {
        return this.f9234a;
    }

    public abstract int k0();

    public abstract void l0(byte b10);

    public abstract void m0(int i10, boolean z10);

    public final void n0(boolean z10) {
        l0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void o0(byte[] bArr) {
        p0(bArr, 0, bArr.length);
    }

    abstract void p0(byte[] bArr, int i10, int i11);

    public abstract void q0(int i10, l lVar);

    public abstract void r0(l lVar);

    public final void s0(int i10, double d10) {
        y0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void t0(double d10) {
        z0(Double.doubleToRawLongBits(d10));
    }

    public final void u0(int i10, int i11) {
        D0(i10, i11);
    }

    public final void v0(int i10) {
        E0(i10);
    }

    public abstract void w0(int i10, int i11);

    public abstract void x0(int i10);

    public abstract void y0(int i10, long j10);

    public abstract void z0(long j10);

    private o() {
    }
}
