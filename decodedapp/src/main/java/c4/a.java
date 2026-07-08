package c4;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i11 + i10;
        while (i10 < i13) {
            int i14 = sArr[i10] >> i12;
            if (i14 == -1) {
                i14 = 0;
            }
            sArr[i10] = (short) (i14 << i12);
            i10++;
        }
    }
}
