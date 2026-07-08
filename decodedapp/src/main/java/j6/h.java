package j6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f18441a;

    static {
        byte[] bArr = new byte[256];
        f18441a = bArr;
        Arrays.fill(bArr, (byte) -1);
        for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
            f18441a[c10] = (byte) (c10 - '0');
        }
        for (char c11 = 'A'; c11 <= 'F'; c11 = (char) (c11 + 1)) {
            f18441a[c11] = (byte) (c11 - '7');
        }
        for (char c12 = 'a'; c12 <= 'f'; c12 = (char) (c12 + 1)) {
            f18441a[c12] = (byte) (c12 - 'W');
        }
        f18441a[46] = -4;
    }

    h() {
    }

    protected static char a(CharSequence charSequence, int i10, int i11) {
        if (i10 < i11) {
            return charSequence.charAt(i10);
        }
        return (char) 0;
    }

    protected static int b(int i10, int i11, int i12) {
        if ((((i10 - i12) - i11) | i11 | i12) >= 0) {
            return i12 + i11;
        }
        throw new IllegalArgumentException("offset < 0 or length > str.length");
    }

    protected static int c(char c10) {
        if (c10 < 128) {
            return f18441a[c10];
        }
        return -1;
    }
}
