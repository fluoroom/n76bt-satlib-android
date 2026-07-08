package com.facebook.stetho.inspector.elements.android.window;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import j$.util.DesugarCollections;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class WindowRootViewCompactV16Impl extends WindowRootViewCompat {
    private Context mContext;

    WindowRootViewCompactV16Impl(Context context) {
        this.mContext = context;
    }

    private static Object getOuter(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("mWindowManager");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            declaredField.setAccessible(false);
            return obj2;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static List<View> getWindowViews(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return DesugarCollections.unmodifiableList(Arrays.asList((View[]) declaredField.get(obj)));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.facebook.stetho.inspector.elements.android.window.WindowRootViewCompat
    public List<View> getRootViews() {
        return getWindowViews(getOuter((WindowManager) this.mContext.getSystemService("window")));
    }
}
