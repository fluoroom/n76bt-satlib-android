package j8;

import java.io.IOException;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
final class l extends m {
    l(String str, String str2, Character ch2) {
        j jVar = new j(str, str2.toCharArray());
        super(jVar, ch2);
        h.a(jVar.f18536b.length == 64);
    }

    @Override // j8.m, j8.n
    final void a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        h.c(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & MessagePack.Code.EXT_TIMESTAMP;
            int i15 = ((bArr[i12 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (i14 << 16) | (bArr[i12 + 2] & MessagePack.Code.EXT_TIMESTAMP);
            appendable.append(this.f18544f.a(i15 >>> 18));
            appendable.append(this.f18544f.a((i15 >>> 12) & 63));
            appendable.append(this.f18544f.a((i15 >>> 6) & 63));
            appendable.append(this.f18544f.a(i15 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            e(appendable, bArr, i12, i11 - i12);
        }
    }
}
