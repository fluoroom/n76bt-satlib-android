package j6;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f18443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18444c;

    public i(long j10) {
        if (j10 <= 0 || j10 >= 2147483647L) {
            throw new IllegalArgumentException("numBits=" + j10);
        }
        int i10 = (((int) ((j10 + 63) >>> 6)) + 1) << 1;
        this.f18442a = i10;
        this.f18443b = new int[i10];
        this.f18444c = i10;
    }

    private int d(int i10) {
        return this.f18443b[i10];
    }

    private void e(int i10, int i11) {
        this.f18443b[i10] = i11;
    }

    public void a(int i10) {
        if (i10 == 0) {
            return;
        }
        long j10 = ((long) i10) & 4294967295L;
        int i11 = this.f18442a;
        while (true) {
            i11--;
            if (j10 == 0) {
                this.f18444c = Math.min(this.f18444c, i11 + 1);
                return;
            } else {
                long jD = (((long) d(i11)) & 4294967295L) + j10;
                e(i11, (int) jD);
                j10 = jD >>> 32;
            }
        }
    }

    public void b(int i10, int i11) {
        long j10 = ((long) i10) & 4294967295L;
        long j11 = i11;
        int i12 = this.f18442a;
        while (true) {
            i12--;
            if (i12 < this.f18444c) {
                break;
            }
            long jD = ((((long) d(i12)) & 4294967295L) * j10) + j11;
            e(i12, (int) jD);
            j11 = jD >>> 32;
        }
        if (j11 != 0) {
            e(i12, (int) j11);
            this.f18444c = i12;
        }
    }

    public BigInteger c() {
        byte[] bArr = new byte[this.f18443b.length << 2];
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).asIntBuffer();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f18443b;
            if (i10 >= iArr.length) {
                return new BigInteger(bArr);
            }
            intBufferAsIntBuffer.put(i10, iArr[i10]);
            i10++;
        }
    }
}
