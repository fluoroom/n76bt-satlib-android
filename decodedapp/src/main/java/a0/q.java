package a0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    static int a(boolean z10, int i10) {
        int i11;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 31) {
                i11 = 33554432;
                return i11 | i10;
            }
            return i10;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            i11 = 67108864;
            return i11 | i10;
        }
        return i10;
    }

    public static PendingIntent b(Context context, int i10, Intent intent, int i11, boolean z10) {
        return PendingIntent.getActivity(context, i10, intent, a(z10, i11));
    }
}
