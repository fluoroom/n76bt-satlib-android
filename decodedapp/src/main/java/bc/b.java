package bc;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ByteBuffer f3748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f3750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f3751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f3752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f3753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f3754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f3755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f3756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f3757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f3758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f3759l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    a f3760m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final i f3761n;

    /* JADX INFO: renamed from: bc.b$b, reason: collision with other inner class name */
    public static final class C0058b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0058b f3762a = new C0058b();

        @Override // bc.b.a
        public ByteBuffer a(int i10) {
            return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public b(int i10, a aVar, ByteBuffer byteBuffer, i iVar) {
        this.f3750c = 1;
        this.f3751d = null;
        this.f3752e = 0;
        this.f3753f = false;
        this.f3754g = false;
        this.f3756i = new int[16];
        this.f3757j = 0;
        this.f3758k = 0;
        this.f3759l = false;
        i10 = i10 <= 0 ? WXMediaMessage.DESCRIPTION_LENGTH_LIMIT : i10;
        this.f3760m = aVar;
        if (byteBuffer != null) {
            this.f3748a = byteBuffer;
            byteBuffer.clear();
            this.f3748a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f3748a = aVar.a(i10);
        }
        this.f3761n = iVar;
        this.f3749b = this.f3748a.capacity();
    }

    static ByteBuffer v(ByteBuffer byteBuffer, a aVar) {
        int i10;
        int iCapacity = byteBuffer.capacity();
        if (iCapacity == 0) {
            i10 = WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
        } else {
            i10 = 2147483639;
            if (iCapacity == 2147483639) {
                throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
            }
            if (((-1073741824) & iCapacity) == 0) {
                i10 = iCapacity << 1;
            }
        }
        byteBuffer.position(0);
        ByteBuffer byteBufferA = aVar.a(i10);
        byteBufferA.position(byteBufferA.clear().capacity() - iCapacity);
        byteBufferA.put(byteBuffer);
        return byteBufferA;
    }

    public void A(boolean z10) {
        ByteBuffer byteBuffer = this.f3748a;
        int i10 = this.f3749b - 1;
        this.f3749b = i10;
        byteBuffer.put(i10, z10 ? (byte) 1 : (byte) 0);
    }

    public void B(byte b10) {
        ByteBuffer byteBuffer = this.f3748a;
        int i10 = this.f3749b - 1;
        this.f3749b = i10;
        byteBuffer.put(i10, b10);
    }

    public void C(int i10) {
        ByteBuffer byteBuffer = this.f3748a;
        int i11 = this.f3749b - 4;
        this.f3749b = i11;
        byteBuffer.putInt(i11, i10);
    }

    public void D(long j10) {
        ByteBuffer byteBuffer = this.f3748a;
        int i10 = this.f3749b - 8;
        this.f3749b = i10;
        byteBuffer.putLong(i10, j10);
    }

    public void E(short s10) {
        ByteBuffer byteBuffer = this.f3748a;
        int i10 = this.f3749b - 2;
        this.f3749b = i10;
        byteBuffer.putShort(i10, s10);
    }

    public byte[] F() {
        return G(this.f3749b, this.f3748a.capacity() - this.f3749b);
    }

    public byte[] G(int i10, int i11) {
        t();
        byte[] bArr = new byte[i11];
        this.f3748a.position(i10);
        this.f3748a.get(bArr);
        return bArr;
    }

    public void H(int i10) {
        this.f3751d[i10] = x();
    }

    public void I(int i10) {
        w();
        int[] iArr = this.f3751d;
        if (iArr == null || iArr.length < i10) {
            this.f3751d = new int[i10];
        }
        this.f3752e = i10;
        Arrays.fill(this.f3751d, 0, i10, 0);
        this.f3753f = true;
        this.f3755h = x();
    }

    public void J(int i10, int i11, int i12) {
        w();
        this.f3758k = i11;
        int i13 = i10 * i11;
        z(4, i13);
        z(i12, i13);
        this.f3753f = true;
    }

    public void a(int i10) {
        if (i10 != x()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void b(int i10, boolean z10, boolean z11) {
        if (this.f3759l || z10 != z11) {
            c(z10);
            H(i10);
        }
    }

    public void c(boolean z10) {
        z(1, 0);
        A(z10);
    }

    public void d(byte b10) {
        z(1, 0);
        B(b10);
    }

    public void e(int i10) {
        z(4, 0);
        C(i10);
    }

    public void f(int i10, int i11, int i12) {
        if (this.f3759l || i11 != i12) {
            e(i11);
            H(i10);
        }
    }

    public void g(int i10, long j10, long j11) {
        if (this.f3759l || j10 != j11) {
            h(j10);
            H(i10);
        }
    }

    public void h(long j10) {
        z(8, 0);
        D(j10);
    }

    public void i(int i10) {
        z(4, 0);
        C((x() - i10) + 4);
    }

    public void j(int i10, int i11, int i12) {
        if (this.f3759l || i11 != i12) {
            i(i11);
            H(i10);
        }
    }

    public void k(int i10, short s10, int i11) {
        if (this.f3759l || s10 != i11) {
            l(s10);
            H(i10);
        }
    }

    public void l(short s10) {
        z(2, 0);
        E(s10);
    }

    public void m(int i10, int i11, int i12) {
        if (i11 != i12) {
            a(i11);
            H(i10);
        }
    }

    public int n(CharSequence charSequence) {
        int iB = this.f3761n.b(charSequence);
        d((byte) 0);
        J(1, iB, 1);
        ByteBuffer byteBuffer = this.f3748a;
        int i10 = this.f3749b - iB;
        this.f3749b = i10;
        byteBuffer.position(i10);
        this.f3761n.a(charSequence, this.f3748a);
        return q();
    }

    public int o(int[] iArr) {
        w();
        J(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            i(iArr[length]);
        }
        return q();
    }

    public int p() {
        int i10;
        if (this.f3751d == null || !this.f3753f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        e(0);
        int iX = x();
        int i11 = this.f3752e - 1;
        while (i11 >= 0 && this.f3751d[i11] == 0) {
            i11--;
        }
        for (int i12 = i11; i12 >= 0; i12--) {
            int i13 = this.f3751d[i12];
            l((short) (i13 != 0 ? iX - i13 : 0));
        }
        l((short) (iX - this.f3755h));
        l((short) ((i11 + 3) * 2));
        int i14 = 0;
        loop2: while (true) {
            if (i14 >= this.f3757j) {
                i10 = 0;
                break;
            }
            int iCapacity = this.f3748a.capacity() - this.f3756i[i14];
            int i15 = this.f3749b;
            short s10 = this.f3748a.getShort(iCapacity);
            if (s10 == this.f3748a.getShort(i15)) {
                for (int i16 = 2; i16 < s10; i16 += 2) {
                    if (this.f3748a.getShort(iCapacity + i16) != this.f3748a.getShort(i15 + i16)) {
                        break;
                    }
                }
                i10 = this.f3756i[i14];
                break loop2;
            }
            i14++;
        }
        if (i10 != 0) {
            int iCapacity2 = this.f3748a.capacity() - iX;
            this.f3749b = iCapacity2;
            this.f3748a.putInt(iCapacity2, i10 - iX);
        } else {
            int i17 = this.f3757j;
            int[] iArr = this.f3756i;
            if (i17 == iArr.length) {
                this.f3756i = Arrays.copyOf(iArr, i17 * 2);
            }
            int[] iArr2 = this.f3756i;
            int i18 = this.f3757j;
            this.f3757j = i18 + 1;
            iArr2[i18] = x();
            ByteBuffer byteBuffer = this.f3748a;
            byteBuffer.putInt(byteBuffer.capacity() - iX, x() - iX);
        }
        this.f3753f = false;
        return iX;
    }

    public int q() {
        if (!this.f3753f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f3753f = false;
        C(this.f3758k);
        return x();
    }

    public void r(int i10) {
        s(i10, false);
    }

    protected void s(int i10, boolean z10) {
        z(this.f3750c, (z10 ? 4 : 0) + 4);
        i(i10);
        if (z10) {
            e(this.f3748a.capacity() - this.f3749b);
        }
        this.f3748a.position(this.f3749b);
        this.f3754g = true;
    }

    public void t() {
        if (!this.f3754g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public b u(boolean z10) {
        this.f3759l = z10;
        return this;
    }

    public void w() {
        if (this.f3753f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int x() {
        return this.f3748a.capacity() - this.f3749b;
    }

    public void y(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer byteBuffer = this.f3748a;
            int i12 = this.f3749b - 1;
            this.f3749b = i12;
            byteBuffer.put(i12, (byte) 0);
        }
    }

    public void z(int i10, int i11) {
        if (i10 > this.f3750c) {
            this.f3750c = i10;
        }
        int i12 = ((~((this.f3748a.capacity() - this.f3749b) + i11)) + 1) & (i10 - 1);
        while (this.f3749b < i12 + i10 + i11) {
            int iCapacity = this.f3748a.capacity();
            ByteBuffer byteBuffer = this.f3748a;
            ByteBuffer byteBufferV = v(byteBuffer, this.f3760m);
            this.f3748a = byteBufferV;
            if (byteBuffer != byteBufferV) {
                this.f3760m.b(byteBuffer);
            }
            this.f3749b += this.f3748a.capacity() - iCapacity;
        }
        y(i12);
    }

    public b(int i10) {
        this(i10, C0058b.f3762a, null, i.c());
    }

    public b() {
        this(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);
    }

    public static abstract class a {
        public abstract ByteBuffer a(int i10);

        public void b(ByteBuffer byteBuffer) {
        }
    }
}
