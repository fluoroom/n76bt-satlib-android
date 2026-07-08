package zh;

import android.graphics.Bitmap;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
class c extends e {
    c(Bitmap bitmap) {
        super(bitmap);
    }

    @Override // zh.e
    protected void a(Bitmap bitmap) {
        this.f33324a = new byte[this.f33325b * 2 * this.f33326c];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f33326c; i11++) {
            for (int i12 = 0; i12 < this.f33325b; i12 += 2) {
                this.f33324a[i10] = (byte) f.d(bitmap.getPixel(i12, i11));
                int iB = f.b(bitmap.getPixel(i12, i11));
                int i13 = i12 + 1;
                int iB2 = f.b(bitmap.getPixel(i13, i11));
                byte[] bArr = this.f33324a;
                bArr[i10 + 1] = (byte) ((iB + iB2) / 2);
                bArr[i10 + 2] = (byte) f.d(bitmap.getPixel(i13, i11));
                i10 += 4;
                this.f33324a[i10 + 3] = (byte) ((f.c(bitmap.getPixel(i12, i11)) + f.c(bitmap.getPixel(i13, i11))) / 2);
            }
        }
    }

    @Override // zh.e
    public int b(int i10, int i11) {
        return this.f33324a[(this.f33325b * 2 * i11) + (((i10 & (-2)) << 1) | 1)] & MessagePack.Code.EXT_TIMESTAMP;
    }

    @Override // zh.e
    public int c(int i10, int i11) {
        return this.f33324a[(this.f33325b * 2 * i11) + ((i10 << 1) | 3)] & MessagePack.Code.EXT_TIMESTAMP;
    }

    @Override // zh.e
    public int e(int i10, int i11) {
        return this.f33324a[(this.f33325b * 2 * i11) + (i10 * 2)] & MessagePack.Code.EXT_TIMESTAMP;
    }
}
