package j9;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import com.facebook.stetho.websocket.CloseCodes;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static Typeface a(Context context, Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT < 31 || (i10 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i10 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, h0.a.b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, CloseCodes.NORMAL_CLOSURE), typeface.isItalic());
    }
}
