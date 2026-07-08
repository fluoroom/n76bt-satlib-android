package cb;

import android.content.res.Resources;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static boolean a(Resources resources) {
        return resources.getConfiguration().getLayoutDirection() == 1;
    }

    public static int b(Resources resources, float f10) {
        return (int) (f10 * resources.getDisplayMetrics().density);
    }

    public static int c(Resources resources, float f10) {
        return (int) TypedValue.applyDimension(2, f10, resources.getDisplayMetrics());
    }
}
