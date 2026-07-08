package j6;

/* JADX INFO: loaded from: classes.dex */
abstract class b extends h {
    b() {
    }

    protected static void d(int i10) {
        if (i10 > 646456993) {
            throw new NumberFormatException("value exceeds limits");
        }
    }

    protected static void e(int i10) {
        if (i10 > 536870912) {
            throw new NumberFormatException("value exceeds limits");
        }
    }

    protected static boolean f(int i10) {
        return i10 > 18;
    }
}
