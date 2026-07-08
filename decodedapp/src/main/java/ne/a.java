package ne;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22667a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C0303a f22668b;

    /* JADX INFO: renamed from: ne.a$a, reason: collision with other inner class name */
    public static final class C0303a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f22669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f22670b;

        public C0303a(Method method, Method method2) {
            this.f22669a = method;
            this.f22670b = method2;
        }

        public final Method a() {
            return this.f22670b;
        }

        public final Method b() {
            return this.f22669a;
        }
    }

    private a() {
    }

    private final C0303a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0303a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new C0303a(null, null);
        }
    }

    private final C0303a b(Object obj) {
        C0303a c0303a = f22668b;
        if (c0303a != null) {
            return c0303a;
        }
        C0303a c0303aA = a(obj);
        f22668b = c0303aA;
        return c0303aA;
    }

    public final Method c(Object obj) throws IllegalAccessException, InvocationTargetException {
        rd.m.e(obj, "recordComponent");
        Method methodA = b(obj).a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(obj, null);
        rd.m.c(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    public final Class d(Object obj) throws IllegalAccessException, InvocationTargetException {
        rd.m.e(obj, "recordComponent");
        Method methodB = b(obj).b();
        if (methodB == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(obj, null);
        rd.m.c(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }
}
