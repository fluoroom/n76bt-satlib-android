package j6;

/* JADX INFO: loaded from: classes.dex */
abstract class a extends h {
    a() {
    }

    protected static void d(boolean z10, int i10, int i11, int i12, long j10) {
        if (z10 || i10 < i11) {
            throw new NumberFormatException("illegal syntax");
        }
        if (j10 <= -2147483648L || j10 > 2147483647L || i12 > 646456993) {
            throw new NumberFormatException("value exceeds limits");
        }
    }

    protected static boolean e(int i10) {
        return i10 >= 32;
    }
}
