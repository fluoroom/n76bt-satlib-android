package butterknife;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ButterKnife {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f4191a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Map f4192b = new LinkedHashMap();

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    public static Unbinder a(Object obj, View view) {
        Class<?> cls = obj.getClass();
        if (f4191a) {
            Log.d("ButterKnife", "Looking up binding for " + cls.getName());
        }
        Constructor constructorB = b(cls);
        if (constructorB == null) {
            return Unbinder.f4209a;
        }
        try {
            return (Unbinder) constructorB.newInstance(obj, view);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Unable to invoke " + constructorB, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Unable to invoke " + constructorB, e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unable to create binding instance.", cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Constructor b(Class cls) {
        Constructor constructorB;
        Map map = f4192b;
        Constructor constructor = (Constructor) map.get(cls);
        if (constructor != null || map.containsKey(cls)) {
            if (f4191a) {
                Log.d("ButterKnife", "HIT: Cached in binding map.");
            }
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("androidx.")) {
            if (!f4191a) {
                return null;
            }
            Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
            return null;
        }
        try {
            constructorB = cls.getClassLoader().loadClass(name + "_ViewBinding").getConstructor(cls, View.class);
            if (f4191a) {
                Log.d("ButterKnife", "HIT: Loaded binding class and constructor.");
            }
        } catch (ClassNotFoundException unused) {
            if (f4191a) {
                Log.d("ButterKnife", "Not found. Trying superclass " + cls.getSuperclass().getName());
            }
            constructorB = b(cls.getSuperclass());
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Unable to find binding constructor for " + name, e10);
        }
        f4192b.put(cls, constructorB);
        return constructorB;
    }
}
