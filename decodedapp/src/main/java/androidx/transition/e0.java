package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f3378a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f3379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f3380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Field f3381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f3382e;

    static class a {
        static float a(View view) {
            return view.getTransitionAlpha();
        }

        static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    e0() {
    }

    private void b() {
        if (f3380c) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f3379b = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e10) {
            Log.i("ViewUtilsApi19", "Failed to retrieve setFrame method", e10);
        }
        f3380c = true;
    }

    public void a(View view) {
    }

    public float c(View view) {
        if (f3378a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f3378a = false;
            }
        }
        return view.getAlpha();
    }

    public void d(View view) {
    }

    public void e(View view, int i10, int i11, int i12, int i13) {
        b();
        Method method = f3379b;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    public void f(View view, float f10) {
        if (f3378a) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f3378a = false;
            }
        }
        view.setAlpha(f10);
    }

    public void g(View view, int i10) {
        if (!f3382e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f3381d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f3382e = true;
        }
        Field field = f3381d;
        if (field != null) {
            try {
                f3381d.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void h(View view, Matrix matrix);

    public abstract void i(View view, Matrix matrix);
}
