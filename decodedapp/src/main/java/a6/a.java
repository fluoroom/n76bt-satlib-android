package a6;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(int i10, int i11, int i12) {
        if (i11 < 0 || i12 > i10) {
            throw new ArrayIndexOutOfBoundsException("start < 0 || end > len. start=" + i11 + ", end=" + i12 + ", len=" + i10);
        }
        if (i11 <= i12) {
            return;
        }
        throw new IllegalArgumentException("start > end: " + i11 + " > " + i12);
    }

    public static void b(short[] sArr, int i10, int i11, short s10) {
        a(sArr.length, i10, i11);
        while (i10 < i11) {
            sArr[i10] = s10;
            i10++;
        }
    }
}
