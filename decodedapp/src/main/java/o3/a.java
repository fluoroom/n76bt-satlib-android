package o3;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static int a(int i10, float f10) {
        return (((int) (f10 * Color.alpha(i10))) << 24) | (16777215 & i10);
    }
}
