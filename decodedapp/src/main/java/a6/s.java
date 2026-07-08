package a6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static Object a(Object obj, String str) throws NoSuchMethodException {
        Method methodD = d(obj.getClass(), str, null);
        methodD.setAccessible(true);
        return methodD.invoke(obj, null);
    }

    public static Object b(Object obj, String str, Object obj2, Class cls) throws NoSuchMethodException {
        Method methodD = d(obj.getClass(), str, new Class[]{cls});
        methodD.setAccessible(true);
        return methodD.invoke(obj, obj2);
    }

    public static Object c(Class cls, Object obj, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static Method d(Class cls, String str, Class[] clsArr) throws NoSuchMethodException {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            while (cls != null) {
                try {
                    return cls.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                    cls = cls.getSuperclass();
                }
            }
            throw e10;
        }
    }
}
