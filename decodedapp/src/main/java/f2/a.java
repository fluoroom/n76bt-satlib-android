package f2;

import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f12773a = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 3];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = b10 & MessagePack.Code.EXT_TIMESTAMP;
            int i12 = i10 * 3;
            char[] cArr2 = f12773a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[b10 & 15];
            cArr[i12 + 2] = ' ';
        }
        return new String(cArr);
    }
}
