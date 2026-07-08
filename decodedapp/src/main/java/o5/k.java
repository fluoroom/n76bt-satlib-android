package o5;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static int a(byte[] bArr, int i10, int i11, boolean z10) {
        int i12 = 0;
        if ((i11 < 0) || (i11 > 4)) {
            throw new IndexOutOfBoundsException("Length must be between 0 and 4");
        }
        int i13 = (i11 - 1) * 8;
        if (z10) {
            for (int i14 = (i11 + i10) - 1; i14 >= i10; i14--) {
                i12 |= (bArr[i14] & 255) << i13;
                i13 -= 8;
            }
            return i12;
        }
        for (int i15 = i10; i15 < i10 + i11; i15++) {
            i12 |= (bArr[i15] & 255) << i13;
            i13 -= 8;
        }
        return i12;
    }

    public static String b(int i10) {
        return String.format(Locale.ENGLISH, "%04X", Integer.valueOf(i10 & 65535));
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(String.format(Locale.ENGLISH, "%02x ", Byte.valueOf(b10)));
        }
        return sb2.toString();
    }

    public static void d(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, boolean z10) {
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
