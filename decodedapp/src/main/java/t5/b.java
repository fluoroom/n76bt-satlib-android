package t5;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static void a(short s10, byte[] bArr, int i10) {
        bArr[i10] = (byte) (s10 >>> 8);
        bArr[i10 + 1] = (byte) s10;
    }

    public static void b(byte[] bArr, short[] sArr, int i10, int i11, int i12) {
        while (true) {
            int i13 = i12 - 1;
            if (i12 <= 0) {
                return;
            }
            int i14 = i11 + 1;
            short s10 = sArr[i11];
            int i15 = i10 + 1;
            bArr[i10] = (byte) (s10 >> 8);
            i10 += 2;
            bArr[i15] = (byte) s10;
            i11 = i14;
            i12 = i13;
        }
    }
}
