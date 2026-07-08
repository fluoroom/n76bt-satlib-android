package ld;

import ed.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: ld.a$a, reason: collision with other inner class name */
    private static final class C0273a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0273a f20543a = new C0273a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f20544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f20545c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            m.b(methods);
            int length = methods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (m.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    m.d(parameterTypes, "getParameterTypes(...)");
                    if (m.a(j.Y(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i11++;
            }
            f20544b = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (m.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f20545c = method;
        }

        private C0273a() {
        }
    }

    public void a(Throwable th2, Throwable th3) throws IllegalAccessException, InvocationTargetException {
        m.e(th2, "cause");
        m.e(th3, "exception");
        Method method = C0273a.f20544b;
        if (method != null) {
            method.invoke(th2, th3);
        }
    }

    public vd.c b() {
        return new vd.b();
    }
}
