package zh;

import android.graphics.Bitmap;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
class d extends e {
    d(Bitmap bitmap) {
        super(bitmap);
    }

    @Override // zh.e
    protected void a(Bitmap bitmap) {
        this.f33324a = new byte[((this.f33325b * 3) * this.f33326c) / 2];
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
                int iB = f.b(bitmap.getPixel(i14, i13));
                int i15 = i14 + 1;
                int iB2 = f.b(bitmap.getPixel(i15, i13));
                int i16 = i13 + 1;
                int iB3 = f.b(bitmap.getPixel(i14, i16));
                this.f33324a[i10] = (byte) ((((iB + iB2) + iB3) + f.b(bitmap.getPixel(i15, i16))) / 4);
                i14 += 2;
                i10++;
            }
        }
        for (int i17 = 0; i17 < this.f33326c; i17 += 2) {
            int i18 = 0;
            while (i18 < this.f33325b) {
                int iC = f.c(bitmap.getPixel(i18, i17));
                int i19 = i18 + 1;
                int iC2 = f.c(bitmap.getPixel(i19, i17));
                int i20 = i17 + 1;
                int iC3 = f.c(bitmap.getPixel(i18, i20));
                this.f33324a[i10] = (byte) ((((iC + iC2) + iC3) + f.c(bitmap.getPixel(i19, i20))) / 4);
                i18 += 2;
                i10++;
            }
        }
    }

    @Override // zh.e
    public int b(int i10, int i11) {
        byte[] bArr = this.f33324a;
        int i12 = this.f33325b;
        return bArr[(this.f33326c * i12) + ((i12 >> 1) * (i11 >> 1)) + (i10 >> 1)] & MessagePack.Code.EXT_TIMESTAMP;
    }

    @Override // zh.e
    public int c(int i10, int i11) {
        byte[] bArr = this.f33324a;
        int i12 = this.f33325b;
        return bArr[(((i12 * 5) * this.f33326c) >> 2) + ((i12 >> 1) * (i11 >> 1)) + (i10 >> 1)] & MessagePack.Code.EXT_TIMESTAMP;
    }

    @Override // zh.e
    public int e(int i10, int i11) {
        return this.f33324a[(this.f33325b * i11) + i10] & MessagePack.Code.EXT_TIMESTAMP;
    }
}
