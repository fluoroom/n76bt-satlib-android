package dk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Constructor f11165a;

    static Object a(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = f11165a;
        if (declaredConstructor == null) {
            declaredConstructor = bj.a.a().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f11165a = declaredConstructor;
        }
        return m.a(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
