package i3;

/* JADX INFO: loaded from: classes.dex */
abstract class a {
    static void a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, boolean z10) {
        if (!z10) {
            System.arraycopy(bArr, i10, bArr2, i11, i12);
            return;
        }
        int i13 = (i10 + i12) - 1;
        for (int i14 = i11; i14 < i11 + i12; i14++) {
            bArr2[i14] = bArr[i13];
            i13--;
        }
    }
}
