package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Field f955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Field f959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Field f961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f962h;

    static void a(Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        if (i10 >= 24) {
            d(resources);
        } else if (i10 >= 23) {
            c(resources);
        } else {
            b(resources);
        }
    }

    private static void b(Resources resources) {
        Map map;
        if (!f956b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f955a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f956b = true;
        }
        Field field = f955a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    private static void c(Resources resources) {
        Object obj;
        if (!f956b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f955a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f956b = true;
        }
        Field field = f955a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    private static void d(Resources resources) {
        Object obj;
        if (!f962h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f961g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f962h = true;
        }
        Field field = f961g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f956b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f955a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f956b = true;
        }
        Field field2 = f955a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    private static void e(Object obj) {
        LongSparseArray longSparseArray;
        if (!f958d) {
            try {
                f957c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f958d = true;
        }
        Class cls = f957c;
        if (cls == null) {
            return;
        }
        if (!f960f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f959e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f960f = true;
        }
        Field field = f959e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
