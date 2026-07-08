package a6;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f352a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return sb2.toString();
            }
            if (z10) {
                z10 = false;
            } else {
                sb2.append(charSequence);
            }
            sb2.append(charSequence2);
            i10 = i11;
        }
    }

    public static String b(CharSequence charSequence, byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (byte b10 : bArr) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(charSequence);
            }
            sb2.append((int) b10);
        }
        return sb2.toString();
    }

    public static String c(CharSequence charSequence, long[] jArr) {
        if (jArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (long j10 : jArr) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(charSequence);
            }
            sb2.append(j10);
        }
        return sb2.toString();
    }
}
