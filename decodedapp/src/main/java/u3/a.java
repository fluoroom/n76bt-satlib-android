package u3;

import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends View {
    public static ColorStateList a(int i10, int i11) {
        return new ColorStateList(new int[][]{View.SELECTED_STATE_SET, View.PRESSED_ENABLED_STATE_SET, View.FOCUSED_STATE_SET, View.EMPTY_STATE_SET}, new int[]{i11, i11, i11, i10});
    }
}
