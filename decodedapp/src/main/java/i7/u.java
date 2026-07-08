package i7;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f15926a;

    static {
        f15926a = System.getProperty("org.graalvm.nativeimage.imagecode") != null;
    }

    private static boolean a() {
        return f15926a && "runtime".equals(System.getProperty("org.graalvm.nativeimage.imagecode"));
    }

    public static boolean b(Throwable th2) {
        if (!a()) {
            return false;
        }
        if (th2 instanceof InvocationTargetException) {
            th2 = th2.getCause();
        }
        return th2.getClass().getName().equals("com.oracle.svm.core.jdk.UnsupportedFeatureError");
    }

    public static boolean c(Class cls) {
        if (a()) {
            return (cls.getDeclaredFields().length == 0 || h.U(cls)) && cls.getDeclaredMethods().length == 0 && cls.getDeclaredConstructors().length == 0;
        }
        return false;
    }
}
