package md;

import java.lang.reflect.InvocationTargetException;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends ld.a {

    /* JADX INFO: renamed from: md.a$a, reason: collision with other inner class name */
    private static final class C0288a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0288a f21957a = new C0288a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f21958b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f21958b = num;
        }

        private C0288a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0288a.f21958b;
        return num == null || num.intValue() >= i10;
    }

    @Override // ld.a
    public void a(Throwable th2, Throwable th3) throws IllegalAccessException, InvocationTargetException {
        m.e(th2, "cause");
        m.e(th3, "exception");
        if (c(19)) {
            th2.addSuppressed(th3);
        } else {
            super.a(th2, th3);
        }
    }
}
