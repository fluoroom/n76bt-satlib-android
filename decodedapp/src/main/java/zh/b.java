package zh;

import android.graphics.Bitmap;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
class b extends e {
    b(Bitmap bitmap) {
        super(bitmap);
    }

    @Override // zh.e
    protected void a(Bitmap bitmap) {
        this.f33324a = new byte[this.f33325b * 2 * this.f33326c];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f33326c; i11++) {
            int i12 = 0;
            while (i12 < this.f33325b) {
                this.f33324a[i10] = (byte) f.d(bitmap.getPixel(i12, i11));
                i12++;
                i10++;
            }
        }
        for (int i13 = 0; i13 < this.f33326c; i13 += 2) {
            int i14 = 0;
            while (i14 < this.f33325b) {
                this.f33324a[i10] = (byte) ((f.b(bitmap.getPixel(i14, i13)) + f.b(bitmap.getPixel(i14, i13 + 1))) / 2);
                i14++;
                i10++;
            }
        }
        for (int i15 = 0; i15 < this.f33326c; i15 += 2) {
            int i16 = 0;
            while (i16 < this.f33325b) {
                this.f33324a[i10] = (byte) ((f.c(bitmap.getPixel(i16, i15)) + f.c(bitmap.getPixel(i16, i15 + 1))) / 2);
                i16++;
                i10++;
            }
        }
    }

    @Override // zh.e
    public int b(int i10, int i11) {
        byte[] bArr = this.f33324a;
        int i12 = this.f33325b;
        return bArr[(this.f33326c * i12) + (i12 * (i11 >> 1)) + i10] & MessagePack.Code.EXT_TIMESTAMP;
    }

    @Override // zh.e
    public int c(int i10, int i11) {
        byte[] bArr = this.f33324a;
        int i12 = this.f33325b;
        return bArr[(((i12 * 3) * this.f33326c) >> 1) + (i12 * (i11 >> 1)) + i10] & MessagePack.Code.EXT_TIMESTAMP;
    }

    @Override // zh.e
    public int e(int i10, int i11) {
        return this.f33324a[(this.f33325b * i11) + i10] & MessagePack.Code.EXT_TIMESTAMP;
    }
}
