package w9;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static int a(int i10, int i11) {
        return (int) (b(i10) % b(i11));
    }

    public static long b(int i10) {
        return ((long) i10) & 4294967295L;
    }
}
