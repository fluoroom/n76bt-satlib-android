package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a */
    private static final List f2676a = ed.q.n(Application.class, i0.class);

    /* JADX INFO: renamed from: b */
    private static final List f2677b = ed.q.e(i0.class);

    public static final Constructor c(Class cls, List list) {
        rd.m.e(cls, "modelClass");
        rd.m.e(list, "signature");
        Iterator itA = rd.c.a(cls.getConstructors());
        while (itA.hasNext()) {
            Constructor constructor = (Constructor) itA.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            rd.m.d(parameterTypes, "getParameterTypes(...)");
            List listK0 = ed.j.k0(parameterTypes);
            if (rd.m.a(list, listK0)) {
                rd.m.c(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == listK0.size() && listK0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final s0 d(Class cls, Constructor constructor, Object... objArr) {
        rd.m.e(cls, "modelClass");
        rd.m.e(constructor, "constructor");
        rd.m.e(objArr, "params");
        try {
            return (s0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
