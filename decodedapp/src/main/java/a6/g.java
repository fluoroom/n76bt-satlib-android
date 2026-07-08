package a6;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static int a(int i10) {
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                return i12;
            }
        }
        return i10;
    }

    public static int b(int i10) {
        return a(i10 * 8) / 8;
    }
}
