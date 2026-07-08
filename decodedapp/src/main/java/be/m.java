package be;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import lf.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    public static final class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f3925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f3926b;

        /* JADX INFO: renamed from: be.m$a$a, reason: collision with other inner class name */
        public static final class C0060a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return gd.a.d(((Method) obj).getName(), ((Method) obj2).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls) {
            super(null);
            rd.m.e(cls, "jClass");
            this.f3925a = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            rd.m.d(declaredMethods, "getDeclaredMethods(...)");
            this.f3926b = ed.j.b0(declaredMethods, new C0060a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Method method) {
            Class<?> returnType = method.getReturnType();
            rd.m.d(returnType, "getReturnType(...)");
            return ne.f.f(returnType);
        }

        @Override // be.m
        public String a() {
            return ed.q.i0(this.f3926b, "", "<init>(", ")V", 0, null, l.f3906a, 24, null);
        }

        public final List d() {
            return this.f3926b;
        }
    }

    public static final class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Constructor f3927a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(null);
            rd.m.e(constructor, "constructor");
            this.f3927a = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Class cls) {
            rd.m.b(cls);
            return ne.f.f(cls);
        }

        @Override // be.m
        public String a() {
            Class<?>[] parameterTypes = this.f3927a.getParameterTypes();
            rd.m.d(parameterTypes, "getParameterTypes(...)");
            return ed.j.S(parameterTypes, "", "<init>(", ")V", 0, null, n.f3940a, 24, null);
        }

        public final Constructor d() {
            return this.f3927a;
        }
    }

    public static final class c extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f3928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            rd.m.e(method, "method");
            this.f3928a = method;
        }

        @Override // be.m
        public String a() {
            return j3.d(this.f3928a);
        }

        public final Method b() {
            return this.f3928a;
        }
    }

    public static final class d extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d.b f3929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f3930b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d.b bVar) {
            super(null);
            rd.m.e(bVar, "signature");
            this.f3929a = bVar;
            this.f3930b = bVar.a();
        }

        @Override // be.m
        public String a() {
            return this.f3930b;
        }

        public final String b() {
            return this.f3929a.d();
        }
    }

    public static final class e extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d.b f3931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f3932b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d.b bVar) {
            super(null);
            rd.m.e(bVar, "signature");
            this.f3931a = bVar;
            this.f3932b = bVar.a();
        }

        @Override // be.m
        public String a() {
            return this.f3932b;
        }

        public final String b() {
            return this.f3931a.d();
        }

        public final String c() {
            return this.f3931a.e();
        }
    }

    public /* synthetic */ m(rd.h hVar) {
        this();
    }

    public abstract String a();

    private m() {
    }
}
