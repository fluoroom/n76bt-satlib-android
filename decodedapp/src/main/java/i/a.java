package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ResourceManagerInternal;
import b0.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static ColorStateList a(Context context, int i10) {
        return b.c(context, i10);
    }

    public static Drawable b(Context context, int i10) {
        return ResourceManagerInternal.get().getDrawable(context, i10);
    }
}
