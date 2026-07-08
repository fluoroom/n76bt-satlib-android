package a6;

import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static void a(String str, byte[] bArr, int i10, int i11, String str2) {
        byte[] bytes;
        if (b(str)) {
            for (int i12 = i10; i12 < i10 + i11; i12++) {
                bArr[i12] = 0;
            }
            return;
        }
        if (str.length() > i11) {
            str = str.substring(0, i11);
        }
        Charset charsetForName = Charset.forName(str2);
        do {
            bytes = str.getBytes(charsetForName);
            if (bytes.length <= i11) {
                break;
            } else {
                str = str.substring(0, str.length() - 1);
            }
        } while (str.length() > 0);
        System.arraycopy(bytes, 0, bArr, i10, bytes.length);
        for (int length = bytes.length + i10; length < i10 + i11; length++) {
            bArr[length] = 0;
        }
    }

    public static boolean b(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String c(CharSequence charSequence, Iterable iterable) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Object obj : iterable) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(charSequence);
            }
            sb2.append(obj);
        }
        return sb2.toString();
    }

    public static String d(byte[] bArr, int i10, int i11) {
        return e(bArr, i10, i11, -1);
    }

    public static String e(byte[] bArr, int i10, int i11, int i12) {
        if (bArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        int i13 = i11 + i10;
        int i14 = 0;
        while (i10 < i13) {
            if (i14 == i12) {
                sb2.append("\n");
                i14 = 0;
            }
            sb2.append(String.format(Locale.ENGLISH, "%02x ", Byte.valueOf(bArr[i10])));
            i10++;
            i14++;
        }
        return sb2.toString();
    }

    public static String f(String str, char c10) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        while (length > 0 && str.charAt(length - 1) == c10) {
            length--;
        }
        return length < str.length() ? str.substring(0, length) : str;
    }
}
