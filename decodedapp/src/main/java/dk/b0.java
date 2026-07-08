package dk;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
abstract class b0 {
    b0() {
    }

    static b0 b(a0 a0Var, Class cls, Method method) {
        y yVarB = y.b(a0Var, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (e0.j(genericReturnType)) {
            throw e0.n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return p.f(a0Var, method, yVarB);
        }
        throw e0.n(method, "Service methods cannot return void.", new Object[0]);
    }

    abstract Object a(Object obj, Object[] objArr);
}
