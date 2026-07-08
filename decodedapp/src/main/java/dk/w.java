package dk;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: loaded from: classes3.dex */
class w {

    static final class a extends w {
        a() {
        }

        @Override // dk.w
        Object b(Method method, Class cls, Object obj, Object[] objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return n.a(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        @Override // dk.w
        boolean c(Method method) {
            return method.isDefault();
        }
    }

    static class b extends w {
        b() {
        }

        @Override // dk.w
        String a(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (!parameter.isNamePresent()) {
                return super.a(method, i10);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // dk.w
        Object b(Method method, Class cls, Object obj, Object[] objArr) {
            return n.a(method, cls, obj, objArr);
        }

        @Override // dk.w
        boolean c(Method method) {
            return method.isDefault();
        }
    }

    w() {
    }

    String a(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    Object b(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    boolean c(Method method) {
        return false;
    }
}
