package io.grpc.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class k2 implements k1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f16664b = Logger.getLogger(k2.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Constructor f16665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f16666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f16667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final RuntimeException f16668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object[] f16669g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f16670a;

    static {
        Method method;
        Method method2;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                method2 = cls.getMethod("sum", null);
                try {
                    Constructor<?>[] constructors = cls.getConstructors();
                    int length = constructors.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = constructors[i10];
                        if (constructor.getParameterTypes().length == 0) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                    f16664b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                    constructor = null;
                }
            } catch (Throwable th3) {
                th = th3;
                method2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            method = null;
            method2 = null;
        }
        if (th != null || constructor == null) {
            f16665c = null;
            f16666d = null;
            f16667e = null;
            f16668f = new RuntimeException(th);
        } else {
            f16665c = constructor;
            f16666d = method;
            f16667e = method2;
            f16668f = null;
        }
        f16669g = new Object[]{1L};
    }

    k2() {
        RuntimeException runtimeException = f16668f;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f16670a = f16665c.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    static boolean a() {
        return f16668f == null;
    }

    @Override // io.grpc.internal.k1
    public void add(long j10) {
        try {
            f16666d.invoke(this.f16670a, j10 == 1 ? f16669g : new Object[]{Long.valueOf(j10)});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
