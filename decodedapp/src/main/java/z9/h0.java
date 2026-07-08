package z9;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f33033a = c();

    class a extends h0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f33034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f33035c;

        a(Method method, Object obj) {
            this.f33034b = method;
            this.f33035c = obj;
        }

        @Override // z9.h0
        public Object d(Class cls) {
            h0.b(cls);
            return this.f33034b.invoke(this.f33035c, cls);
        }
    }

    class b extends h0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f33036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f33037c;

        b(Method method, int i10) {
            this.f33036b = method;
            this.f33037c = i10;
        }

        @Override // z9.h0
        public Object d(Class cls) {
            h0.b(cls);
            return this.f33036b.invoke(null, cls, Integer.valueOf(this.f33037c));
        }
    }

    class c extends h0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f33038b;

        c(Method method) {
            this.f33038b = method;
        }

        @Override // z9.h0
        public Object d(Class cls) {
            h0.b(cls);
            return this.f33038b.invoke(null, cls, Object.class);
        }
    }

    class d extends h0 {
        d() {
        }

        @Override // z9.h0
        public Object d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class cls) {
        String strT = t.t(cls);
        if (strT == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strT);
    }

    private static h0 c() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, iIntValue);
                } catch (Exception unused2) {
                    return new d();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        }
    }

    public abstract Object d(Class cls);
}
