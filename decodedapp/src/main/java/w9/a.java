package w9;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {
    public static int a(long j10) {
        return j10 > 2147483647L ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : j10 < -2147483648L ? RtlSpacingHelper.UNDEFINED : (int) j10;
    }

    public static Integer b(String str) {
        return c(str, 10);
    }

    public static Integer c(String str, int i10) {
        Long lA = c.a(str, i10);
        if (lA == null || lA.longValue() != lA.intValue()) {
            return null;
        }
        return Integer.valueOf(lA.intValue());
    }
}
