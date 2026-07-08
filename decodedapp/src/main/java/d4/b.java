package d4;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static int a(int[] iArr, int i10) {
        int length = iArr.length - 1;
        int i11 = 0;
        int i12 = -1;
        double d10 = Double.MAX_VALUE;
        while (i11 <= length) {
            int i13 = ((length - i11) / 2) + i11;
            int iAbs = Math.abs(iArr[i13] - i10);
            if (iAbs == 0) {
                return i13;
            }
            double d11 = iAbs;
            if (d11 < d10) {
                i12 = i13;
                d10 = d11;
            }
            if (iArr[i13] < i10) {
                i11 = i13 + 1;
            } else {
                length = i13 - 1;
            }
        }
        return i12;
    }

    public static long[] b(List list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) list.get(i10)).longValue();
        }
        return jArr;
    }
}
