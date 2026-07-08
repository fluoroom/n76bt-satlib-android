package androidx.lifecycle;

import android.app.Application;
import e1.a;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f2697b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.c f2698c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e1.d f2699a;

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public static /* synthetic */ v0 c(b bVar, y0 y0Var, c cVar, e1.a aVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = f1.h.f12772a.b(y0Var);
            }
            if ((i10 & 4) != 0) {
                aVar = f1.h.f12772a.a(y0Var);
            }
            return bVar.b(y0Var, cVar, aVar);
        }

        public final v0 a(x0 x0Var, c cVar, e1.a aVar) {
            rd.m.e(x0Var, "store");
            rd.m.e(cVar, "factory");
            rd.m.e(aVar, "extras");
            return new v0(x0Var, cVar, aVar);
        }

        public final v0 b(y0 y0Var, c cVar, e1.a aVar) {
            rd.m.e(y0Var, "owner");
            rd.m.e(cVar, "factory");
            rd.m.e(aVar, "extras");
            return new v0(y0Var.U(), cVar, aVar);
        }

        private b() {
        }
    }

    public interface c {
        s0 a(Class cls);

        s0 b(yd.c cVar, e1.a aVar);

        s0 c(Class cls, e1.a aVar);
    }

    public static class d implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static d f2705b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2704a = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a.c f2706c = v0.f2698c;

        public static final class a {
            public /* synthetic */ a(rd.h hVar) {
                this();
            }

            public final d a() {
                if (d.f2705b == null) {
                    d.f2705b = new d();
                }
                d dVar = d.f2705b;
                rd.m.b(dVar);
                return dVar;
            }

            private a() {
            }
        }

        @Override // androidx.lifecycle.v0.c
        public s0 a(Class cls) {
            rd.m.e(cls, "modelClass");
            return f1.e.f12767a.a(cls);
        }

        @Override // androidx.lifecycle.v0.c
        public s0 b(yd.c cVar, e1.a aVar) {
            rd.m.e(cVar, "modelClass");
            rd.m.e(aVar, "extras");
            return c(pd.a.b(cVar), aVar);
        }

        @Override // androidx.lifecycle.v0.c
        public s0 c(Class cls, e1.a aVar) {
            rd.m.e(cls, "modelClass");
            rd.m.e(aVar, "extras");
            return a(cls);
        }
    }

    public static class e {
        public abstract void d(s0 s0Var);
    }

    public static final class f implements a.c {
    }

    static {
        a.C0153a c0153a = e1.a.f11334b;
        f2698c = new f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v0(x0 x0Var, c cVar) {
        this(x0Var, cVar, null, 4, null);
        rd.m.e(x0Var, "store");
        rd.m.e(cVar, "factory");
    }

    public s0 a(Class cls) {
        rd.m.e(cls, "modelClass");
        return c(pd.a.e(cls));
    }

    public final s0 b(String str, yd.c cVar) {
        rd.m.e(str, "key");
        rd.m.e(cVar, "modelClass");
        return this.f2699a.d(cVar, str);
    }

    public final s0 c(yd.c cVar) {
        rd.m.e(cVar, "modelClass");
        return e1.d.e(this.f2699a, cVar, null, 2, null);
    }

    public static class a extends d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C0036a f2700e = new C0036a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static a f2701f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a.c f2702g;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Application f2703d;

        /* JADX INFO: renamed from: androidx.lifecycle.v0$a$a, reason: collision with other inner class name */
        public static final class C0036a {
            public /* synthetic */ C0036a(rd.h hVar) {
                this();
            }

            public final a a(Application application) {
                rd.m.e(application, "application");
                if (a.f2701f == null) {
                    a.f2701f = new a(application);
                }
                a aVar = a.f2701f;
                rd.m.b(aVar);
                return aVar;
            }

            private C0036a() {
            }
        }

        public static final class b implements a.c {
        }

        static {
            a.C0153a c0153a = e1.a.f11334b;
            f2702g = new b();
        }

        private a(Application application, int i10) {
            this.f2703d = application;
        }

        private final s0 h(Class cls, Application application) {
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                s0 s0Var = (s0) cls.getConstructor(Application.class).newInstance(application);
                rd.m.b(s0Var);
                return s0Var;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        @Override // androidx.lifecycle.v0.d, androidx.lifecycle.v0.c
        public s0 a(Class cls) {
            rd.m.e(cls, "modelClass");
            Application application = this.f2703d;
            if (application != null) {
                return h(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.v0.d, androidx.lifecycle.v0.c
        public s0 c(Class cls, e1.a aVar) {
            rd.m.e(cls, "modelClass");
            rd.m.e(aVar, "extras");
            if (this.f2703d != null) {
                return a(cls);
            }
            Application application = (Application) aVar.a(f2702g);
            if (application != null) {
                return h(cls, application);
            }
            if (androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(cls);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            rd.m.e(application, "application");
        }
    }

    private v0(e1.d dVar) {
        this.f2699a = dVar;
    }

    public /* synthetic */ v0(x0 x0Var, c cVar, e1.a aVar, int i10, rd.h hVar) {
        this(x0Var, cVar, (i10 & 4) != 0 ? a.b.f11336c : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v0(x0 x0Var, c cVar, e1.a aVar) {
        this(new e1.d(x0Var, cVar, aVar));
        rd.m.e(x0Var, "store");
        rd.m.e(cVar, "factory");
        rd.m.e(aVar, "defaultCreationExtras");
    }
}
