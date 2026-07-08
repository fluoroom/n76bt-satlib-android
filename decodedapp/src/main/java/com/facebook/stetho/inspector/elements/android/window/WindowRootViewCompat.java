package com.facebook.stetho.inspector.elements.android.window;

import android.content.Context;
import android.view.View;
import com.facebook.stetho.common.Util;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class WindowRootViewCompat {
    private static WindowRootViewCompat sInstance;

    public static WindowRootViewCompat get(Context context) {
        WindowRootViewCompat windowRootViewCompat = sInstance;
        if (windowRootViewCompat != null) {
            return windowRootViewCompat;
        }
        Util.throwIfNull(context);
        WindowRootViewCompactV19Impl windowRootViewCompactV19Impl = new WindowRootViewCompactV19Impl();
        sInstance = windowRootViewCompactV19Impl;
        return windowRootViewCompactV19Impl;
    }

    public abstract List<View> getRootViews();
}
