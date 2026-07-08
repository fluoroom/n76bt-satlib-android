package ne;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f22671a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f22672b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f22673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f22674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f22675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Method f22676d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f22673a = method;
            this.f22674b = method2;
            this.f22675c = method3;
            this.f22676d = method4;
        }

        public final Method a() {
            return this.f22674b;
        }

        public final Method b() {
            return this.f22676d;
        }

        public final Method c() {
            return this.f22675c;
        }

        public final Method d() {
            return this.f22673a;
        }
    }

    private b() {
    }

    private final a a() {
        try {
            return new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    private final a b() {
        a aVar = f22672b;
        if (aVar != null) {
            return aVar;
        }
        a aVarA = a();
        f22672b = aVarA;
        return aVarA;
    }

    public final Class[] c(Class cls) throws IllegalAccessException, InvocationTargetException {
        rd.m.e(cls, "clazz");
        Method methodA = b().a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(cls, null);
        rd.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) objInvoke;
    }

    public final Object[] d(Class cls) {
        rd.m.e(cls, "clazz");
        Method methodB = b().b();
        if (methodB == null) {
            return null;
        }
        return (Object[]) methodB.invoke(cls, null);
    }

    public final Boolean e(Class cls) throws IllegalAccessException, InvocationTargetException {
        rd.m.e(cls, "clazz");
        Method methodC = b().c();
        if (methodC == null) {
            return null;
        }
        Object objInvoke = methodC.invoke(cls, null);
        rd.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    public final Boolean f(Class cls) throws IllegalAccessException, InvocationTargetException {
        rd.m.e(cls, "clazz");
        Method methodD = b().d();
        if (methodD == null) {
            return null;
        }
        Object objInvoke = methodD.invoke(cls, null);
        rd.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }
}
