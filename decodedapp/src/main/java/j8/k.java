package j8;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
final class k extends m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final char[] f18543h;

    k(String str, String str2) {
        j jVar = new j("base16()", "0123456789ABCDEF".toCharArray());
        super(jVar, null);
        this.f18543h = new char[WXMediaMessage.TITLE_LENGTH_LIMIT];
        h.a(jVar.f18536b.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.f18543h[i10] = jVar.a(i10 >>> 4);
            this.f18543h[i10 | 256] = jVar.a(i10 & 15);
        }
    }

    @Override // j8.m, j8.n
    final void a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        h.c(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & MessagePack.Code.EXT_TIMESTAMP;
            appendable.append(this.f18543h[i13]);
            appendable.append(this.f18543h[i13 | 256]);
        }
    }
}
