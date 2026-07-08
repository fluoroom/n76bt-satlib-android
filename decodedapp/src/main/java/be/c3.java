package be;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c3 {

    public static class a extends b implements qd.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qd.a f3834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile SoftReference f3835c;

        public a(Object obj, qd.a aVar) {
            if (aVar == null) {
                g(0);
            }
            this.f3835c = null;
            this.f3834b = aVar;
            if (obj != null) {
                this.f3835c = new SoftReference(b(obj));
            }
        }

        private static /* synthetic */ void g(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // be.c3.b, qd.a
        public Object a() {
            Object obj;
            SoftReference softReference = this.f3835c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return e(obj);
            }
            Object objA = this.f3834b.a();
            this.f3835c = new SoftReference(b(objA));
            return objA;
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Object f3836a = new a();

        static class a {
            a() {
            }
        }

        public abstract Object a();

        protected Object b(Object obj) {
            return obj == null ? f3836a : obj;
        }

        public final Object d(Object obj, Object obj2) {
            return a();
        }

        protected Object e(Object obj) {
            if (obj == f3836a) {
                return null;
            }
            return obj;
        }
    }

    private static /* synthetic */ void a(int i10) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static a b(Object obj, qd.a aVar) {
        if (aVar == null) {
            a(0);
        }
        return new a(obj, aVar);
    }

    public static a c(qd.a aVar) {
        if (aVar == null) {
            a(1);
        }
        return b(null, aVar);
    }
}
