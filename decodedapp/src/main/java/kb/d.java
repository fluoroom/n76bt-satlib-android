package kb;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT == 26 && c(activity)) {
            jb.a.i("ActivityFixUtils", "onCreate fixOrientation when Oreo, result = " + d(activity));
        }
    }

    public static boolean b(Activity activity) {
        if (Build.VERSION.SDK_INT != 26 || !c(activity)) {
            return false;
        }
        jb.a.i("ActivityFixUtils", "avoid calling setRequestedOrientation when Oreo.");
        return true;
    }

    private static boolean c(Activity activity) {
        Throwable th2;
        boolean zBooleanValue;
        Method method;
        try {
            TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get(null));
            method = ActivityInfo.class.getMethod("isTranslucentOrFloating", TypedArray.class);
            method.setAccessible(true);
            zBooleanValue = ((Boolean) method.invoke(null, typedArrayObtainStyledAttributes)).booleanValue();
        } catch (Throwable th3) {
            th2 = th3;
            zBooleanValue = false;
        }
        try {
            method.setAccessible(false);
            return zBooleanValue;
        } catch (Throwable th4) {
            th2 = th4;
            jb.a.g("ActivityFixUtils", "isTranslucentOrFloating exception", th2);
            return zBooleanValue;
        }
    }

    private static boolean d(Activity activity) {
        try {
            Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
            declaredField.setAccessible(true);
            ((ActivityInfo) declaredField.get(activity)).screenOrientation = -1;
            declaredField.setAccessible(false);
            return true;
        } catch (Throwable th2) {
            jb.a.g("ActivityFixUtils", "fixOrientation exception", th2);
            return false;
        }
    }
}
