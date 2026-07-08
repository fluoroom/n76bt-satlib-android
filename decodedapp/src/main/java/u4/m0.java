package u4;

import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static int a(byte[] bArr, int i10) {
        int i11 = 0;
        int i12 = 1;
        for (int i13 = 0; i13 < 16; i13 += 8) {
            i11 = (int) (((long) i11) | (((long) (bArr[i10 + i12] & MessagePack.Code.EXT_TIMESTAMP)) << i13));
            i12--;
        }
        return i11;
    }
}
