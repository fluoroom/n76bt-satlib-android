package bc;

import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f3746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3747b;

    public a(int i10) {
        this(new byte[i10]);
    }

    @Override // bc.e
    public int a() {
        return this.f3747b;
    }

    @Override // bc.f
    public void b(double d10) {
        n(this.f3747b, d10);
        this.f3747b += 8;
    }

    @Override // bc.f
    public void c(short s10) {
        r(this.f3747b, s10);
        this.f3747b += 2;
    }

    @Override // bc.f
    public void clear() {
        this.f3747b = 0;
    }

    @Override // bc.e
    public String d(int i10, int i11) {
        return j.e(this.f3746a, i10, i11);
    }

    @Override // bc.e
    public byte[] data() {
        return this.f3746a;
    }

    @Override // bc.f
    public int e() {
        return this.f3747b;
    }

    @Override // bc.f
    public void f(float f10) {
        o(this.f3747b, f10);
        this.f3747b += 4;
    }

    @Override // bc.f
    public void g(int i10) {
        p(this.f3747b, i10);
        this.f3747b += 4;
    }

    @Override // bc.e
    public byte get(int i10) {
        return this.f3746a[i10];
    }

    @Override // bc.e
    public double getDouble(int i10) {
        return Double.longBitsToDouble(getLong(i10));
    }

    @Override // bc.e
    public float getFloat(int i10) {
        return Float.intBitsToFloat(getInt(i10));
    }

    @Override // bc.e
    public int getInt(int i10) {
        byte[] bArr = this.f3746a;
        return (bArr[i10] & MessagePack.Code.EXT_TIMESTAMP) | (bArr[i10 + 3] << 24) | ((bArr[i10 + 2] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8);
    }

    @Override // bc.e
    public long getLong(int i10) {
        byte[] bArr = this.f3746a;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40);
        return (((long) bArr[i10 + 7]) << 56) | j10 | ((255 & ((long) bArr[i10 + 6])) << 48);
    }

    @Override // bc.e
    public short getShort(int i10) {
        byte[] bArr = this.f3746a;
        return (short) ((bArr[i10] & MessagePack.Code.EXT_TIMESTAMP) | (bArr[i10 + 1] << 8));
    }

    @Override // bc.f
    public void h(byte[] bArr, int i10, int i11) {
        m(this.f3747b, bArr, i10, i11);
        this.f3747b += i11;
    }

    @Override // bc.f
    public void i(byte b10) {
        l(this.f3747b, b10);
        this.f3747b++;
    }

    @Override // bc.f
    public void j(long j10) {
        q(this.f3747b, j10);
        this.f3747b += 8;
    }

    public boolean k(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Capacity may not be negative (likely a previous int overflow)");
        }
        byte[] bArr = this.f3746a;
        if (bArr.length >= i10) {
            return true;
        }
        int length = bArr.length;
        int i11 = length + (length >> 1);
        if (i11 >= i10) {
            i10 = i11;
        }
        this.f3746a = Arrays.copyOf(bArr, i10);
        return true;
    }

    public void l(int i10, byte b10) {
        k(i10 + 1);
        this.f3746a[i10] = b10;
    }

    public void m(int i10, byte[] bArr, int i11, int i12) {
        k((i12 - i11) + i10);
        System.arraycopy(bArr, i11, this.f3746a, i10, i12);
    }

    public void n(int i10, double d10) {
        k(i10 + 8);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        int i11 = (int) jDoubleToRawLongBits;
        byte[] bArr = this.f3746a;
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
        int i12 = (int) (jDoubleToRawLongBits >> 32);
        bArr[i10 + 4] = (byte) (i12 & 255);
        bArr[i10 + 5] = (byte) ((i12 >> 8) & 255);
        bArr[i10 + 6] = (byte) ((i12 >> 16) & 255);
        bArr[i10 + 7] = (byte) ((i12 >> 24) & 255);
    }

    public void o(int i10, float f10) {
        k(i10 + 4);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        byte[] bArr = this.f3746a;
        bArr[i10] = (byte) (iFloatToRawIntBits & 255);
        bArr[i10 + 1] = (byte) ((iFloatToRawIntBits >> 8) & 255);
        bArr[i10 + 2] = (byte) ((iFloatToRawIntBits >> 16) & 255);
        bArr[i10 + 3] = (byte) ((iFloatToRawIntBits >> 24) & 255);
    }

    public void p(int i10, int i11) {
        k(i10 + 4);
        byte[] bArr = this.f3746a;
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
    }

    public void q(int i10, long j10) {
        k(i10 + 8);
        int i11 = (int) j10;
        byte[] bArr = this.f3746a;
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
        int i12 = (int) (j10 >> 32);
        bArr[i10 + 4] = (byte) (i12 & 255);
        bArr[i10 + 5] = (byte) ((i12 >> 8) & 255);
        bArr[i10 + 6] = (byte) ((i12 >> 16) & 255);
        bArr[i10 + 7] = (byte) ((i12 >> 24) & 255);
    }

    public void r(int i10, short s10) {
        k(i10 + 2);
        byte[] bArr = this.f3746a;
        bArr[i10] = (byte) (s10 & 255);
        bArr[i10 + 1] = (byte) ((s10 >> 8) & 255);
    }

    public a(byte[] bArr) {
        this.f3746a = bArr;
        this.f3747b = 0;
    }

    public a(byte[] bArr, int i10) {
        this.f3746a = bArr;
        this.f3747b = i10;
    }
}
