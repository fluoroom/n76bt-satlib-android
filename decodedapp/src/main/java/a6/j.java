package a6;

import android.content.res.Resources;
import android.text.format.DateUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends DateUtils {
    public static CharSequence a(Resources resources, long j10, long j11) {
        return b(resources, j10, 0L, j11);
    }

    public static CharSequence b(Resources resources, long j10, long j11, long j12) {
        if (j10 >= 3600000 && j12 >= 3600000) {
            int i10 = (int) ((j10 + 1800000) / 3600000);
            return resources.getQuantityString(k3.i.f19230a, i10, Integer.valueOf(i10));
        }
        if (j10 >= 60000 && j12 >= 60000) {
            int i11 = (int) ((j10 + 30000) / 60000);
            return resources.getQuantityString(k3.i.f19231b, i11, Integer.valueOf(i11));
        }
        if (j10 < 1000 && j11 < 1000) {
            return String.format("%d ms", Long.valueOf(j10));
        }
        long j13 = j10 % 1000;
        if (j13 != 0) {
            return String.format(resources.getQuantityText(k3.i.f19232c, j10 > 1000 ? 2 : 1).toString().replace("%d", "%d.%s").replace("1", "%d.%s"), Long.valueOf(j10 / 1000), w.f(String.format("%03d", Long.valueOf(j13)), '0'));
        }
        int i12 = (int) ((j10 + 500) / 1000);
        return resources.getQuantityString(k3.i.f19232c, i12, Integer.valueOf(i12));
    }
}
