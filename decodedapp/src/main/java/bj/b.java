package bj;

import j$.util.Optional;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Constructor f4116c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f4117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f4118b;

    private static class a {
    }

    static {
        Constructor constructor = null;
        try {
            try {
                Optional.class.getMethod("stream", null);
            } catch (NoSuchMethodException unused) {
                Constructor declaredConstructor = bj.a.a().getDeclaredConstructor(Class.class);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
                constructor = declaredConstructor;
            }
        } catch (Throwable unused2) {
        }
        f4116c = constructor;
    }

    private b(Class cls, Object obj) {
        this.f4117a = cls;
        this.f4118b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.AccessibleObject a(java.lang.reflect.AccessibleObject r2) {
        /*
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            boolean r0 = r2 instanceof java.lang.reflect.Member
            if (r0 == 0) goto L24
            r0 = r2
            java.lang.reflect.Member r0 = (java.lang.reflect.Member) r0
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L24
            java.lang.Class r0 = r0.getDeclaringClass()
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L24
            goto L2e
        L24:
            boolean r0 = r2.isAccessible()
            if (r0 != 0) goto L2e
            r0 = 1
            r2.setAccessible(r0)
        L2e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.b.a(java.lang.reflect.AccessibleObject):java.lang.reflect.AccessibleObject");
    }

    private Method d(String str, Class[] clsArr) throws NoSuchMethodException {
        Class clsO = o();
        try {
            return clsO.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return clsO.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    clsO = clsO.getSuperclass();
                }
            } while (clsO != null);
            throw new NoSuchMethodException();
        }
    }

    private Field f(String str) {
        Class clsO = o();
        try {
            return (Field) a(clsO.getField(str));
        } catch (NoSuchFieldException e10) {
            do {
                try {
                    return (Field) a(clsO.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    clsO = clsO.getSuperclass();
                    if (clsO == null) {
                        throw new c(e10);
                    }
                }
            } while (clsO == null);
            throw new c(e10);
        }
    }

    private boolean i(Method method, String str, Class[] clsArr) {
        return method.getName().equals(str) && j(method.getParameterTypes(), clsArr);
    }

    private boolean j(Class[] clsArr, Class[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < clsArr2.length; i10++) {
            if (clsArr2[i10] != a.class && !q(clsArr[i10]).isAssignableFrom(q(clsArr2[i10]))) {
                return false;
            }
        }
        return true;
    }

    private static b k(Class cls, Object obj) {
        return new b(cls, obj);
    }

    public static b l(Object obj) {
        return new b(obj == null ? Object.class : obj.getClass(), obj);
    }

    private static b m(Method method, Object obj, Object... objArr) {
        try {
            a(method);
            if (method.getReturnType() != Void.TYPE) {
                return l(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return l(obj);
        } catch (Exception e10) {
            throw new c(e10);
        }
    }

    private Method n(String str, Class[] clsArr) throws NoSuchMethodException {
        Class clsO = o();
        for (Method method : clsO.getMethods()) {
            if (i(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : clsO.getDeclaredMethods()) {
                if (i(method2, str, clsArr)) {
                    return method2;
                }
            }
            clsO = clsO.getSuperclass();
        } while (clsO != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + o() + ".");
    }

    private static Class[] p(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            clsArr[i10] = obj == null ? a.class : obj.getClass();
        }
        return clsArr;
    }

    public static Class q(Class cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    public b b(String str) {
        return c(str, new Object[0]);
    }

    public b c(String str, Object... objArr) {
        Class[] clsArrP = p(objArr);
        try {
            try {
                return m(d(str, clsArrP), this.f4118b, objArr);
            } catch (NoSuchMethodException unused) {
                return m(n(str, clsArrP), this.f4118b, objArr);
            }
        } catch (NoSuchMethodException e10) {
            throw new c(e10);
        }
    }

    public b e(String str) {
        try {
            Field fieldF = f(str);
            return k(fieldF.getType(), fieldF.get(this.f4118b));
        } catch (Exception e10) {
            throw new c(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f4118b.equals(((b) obj).g());
        }
        return false;
    }

    public Object g() {
        return this.f4118b;
    }

    public Object h(String str) {
        return e(str).g();
    }

    public int hashCode() {
        return this.f4118b.hashCode();
    }

    public Class o() {
        return this.f4117a;
    }

    public String toString() {
        return String.valueOf(this.f4118b);
    }
}
