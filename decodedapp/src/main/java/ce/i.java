package ce;

import dd.d0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import rd.f0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i implements ce.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f4735e = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Member f4736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f4737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f4738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f4739d;

    public static final class a extends i implements ce.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f4740f;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Constructor constructor, Object obj) {
            rd.m.e(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            rd.m.d(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            rd.m.d(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : ed.j.p(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.f4740f = obj;
        }

        @Override // ce.h
        public Object i(Object[] objArr) {
            rd.m.e(objArr, "args");
            a(objArr);
            Constructor constructor = (Constructor) h();
            f0 f0Var = new f0(3);
            f0Var.a(this.f4740f);
            f0Var.b(objArr);
            f0Var.a(null);
            return constructor.newInstance(f0Var.d(new Object[f0Var.c()]));
        }
    }

    public static final class b extends i {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(Constructor constructor) {
            rd.m.e(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            rd.m.d(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            rd.m.d(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : ed.j.p(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // ce.h
        public Object i(Object[] objArr) {
            rd.m.e(objArr, "args");
            a(objArr);
            Constructor constructor = (Constructor) h();
            f0 f0Var = new f0(2);
            f0Var.b(objArr);
            f0Var.a(null);
            return constructor.newInstance(f0Var.d(new Object[f0Var.c()]));
        }
    }

    public static final class c extends i implements ce.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f4741f;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Constructor constructor, Object obj) {
            rd.m.e(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            rd.m.d(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            rd.m.d(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.f4741f = obj;
        }

        @Override // ce.h
        public Object i(Object[] objArr) {
            rd.m.e(objArr, "args");
            a(objArr);
            Constructor constructor = (Constructor) h();
            f0 f0Var = new f0(2);
            f0Var.a(this.f4741f);
            f0Var.b(objArr);
            return constructor.newInstance(f0Var.d(new Object[f0Var.c()]));
        }
    }

    public static final class d {
        public /* synthetic */ d(rd.h hVar) {
            this();
        }

        private d() {
        }
    }

    public static final class e extends i {
        /* JADX WARN: Illegal instructions before constructor call */
        public e(Constructor constructor) {
            rd.m.e(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            rd.m.d(declaringClass, "getDeclaringClass(...)");
            Class declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            rd.m.d(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // ce.h
        public Object i(Object[] objArr) {
            rd.m.e(objArr, "args");
            a(objArr);
            return ((Constructor) h()).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    public static abstract class f extends i {

        public static final class a extends f implements ce.g {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Object f4742f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, null);
                rd.m.e(field, "field");
                this.f4742f = obj;
            }

            @Override // ce.i.f, ce.h
            public Object i(Object[] objArr) {
                rd.m.e(objArr, "args");
                a(objArr);
                return ((Field) h()).get(this.f4742f);
            }
        }

        public static final class b extends f implements ce.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, null);
                rd.m.e(field, "field");
            }
        }

        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, null);
                rd.m.e(field, "field");
            }
        }

        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, null);
                rd.m.e(field, "field");
            }

            @Override // ce.i
            public void a(Object[] objArr) {
                rd.m.e(objArr, "args");
                super.a(objArr);
                b(ed.j.E(objArr));
            }
        }

        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field) {
                super(field, false, null);
                rd.m.e(field, "field");
            }
        }

        public /* synthetic */ f(Field field, boolean z10, rd.h hVar) {
            this(field, z10);
        }

        @Override // ce.h
        public Object i(Object[] objArr) {
            rd.m.e(objArr, "args");
            a(objArr);
            return ((Field) h()).get(e() != null ? ed.j.D(objArr) : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private f(Field field, boolean z10) {
            Type genericType = field.getGenericType();
            rd.m.d(genericType, "getGenericType(...)");
            super(field, genericType, z10 ? field.getDeclaringClass() : null, new Type[0], null);
        }
    }

    public static abstract class g extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f4743f;

        public static final class a extends g implements ce.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Object f4744g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z10, Object obj) {
                super(field, z10, false, null);
                rd.m.e(field, "field");
                this.f4744g = obj;
            }

            @Override // ce.i.g, ce.h
            public Object i(Object[] objArr) throws IllegalAccessException {
                rd.m.e(objArr, "args");
                a(objArr);
                ((Field) h()).set(this.f4744g, ed.j.D(objArr));
                return d0.f10897a;
            }
        }

        public static final class b extends g implements ce.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z10) {
                super(field, z10, false, null);
                rd.m.e(field, "field");
            }

            @Override // ce.i.g, ce.h
            public Object i(Object[] objArr) throws IllegalAccessException {
                rd.m.e(objArr, "args");
                a(objArr);
                ((Field) h()).set(null, ed.j.T(objArr));
                return d0.f10897a;
            }
        }

        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z10) {
                super(field, z10, true, null);
                rd.m.e(field, "field");
            }
        }

        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z10) {
                super(field, z10, true, null);
                rd.m.e(field, "field");
            }

            @Override // ce.i.g, ce.i
            public void a(Object[] objArr) {
                rd.m.e(objArr, "args");
                super.a(objArr);
                b(ed.j.E(objArr));
            }
        }

        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z10) {
                super(field, z10, false, null);
                rd.m.e(field, "field");
            }
        }

        public /* synthetic */ g(Field field, boolean z10, boolean z11, rd.h hVar) {
            this(field, z10, z11);
        }

        @Override // ce.i
        public void a(Object[] objArr) {
            rd.m.e(objArr, "args");
            super.a(objArr);
            if (this.f4743f && ed.j.T(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // ce.h
        public Object i(Object[] objArr) throws IllegalAccessException {
            rd.m.e(objArr, "args");
            a(objArr);
            ((Field) h()).set(e() != null ? ed.j.D(objArr) : null, ed.j.T(objArr));
            return d0.f10897a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private g(Field field, boolean z10, boolean z11) {
            Class cls = Void.TYPE;
            rd.m.d(cls, "TYPE");
            super(field, cls, z11 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()}, null);
            this.f4743f = z10;
        }
    }

    public static abstract class h extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f4745f;

        public static final class a extends h implements ce.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Object f4746g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, null, 4, null);
                rd.m.e(method, "method");
                this.f4746g = obj;
            }

            @Override // ce.h
            public Object i(Object[] objArr) {
                rd.m.e(objArr, "args");
                a(objArr);
                return f(this.f4746g, objArr);
            }
        }

        public static final class b extends h implements ce.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, null, 4, null);
                rd.m.e(method, "method");
            }

            @Override // ce.h
            public Object i(Object[] objArr) {
                rd.m.e(objArr, "args");
                a(objArr);
                return f(null, objArr);
            }
        }

        public static final class c extends h implements ce.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final boolean f4747g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Object f4748h;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(Method method, boolean z10, Object obj) {
                rd.m.e(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                rd.m.d(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : ed.j.p(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.f4747g = z10;
                this.f4748h = obj;
            }

            @Override // ce.h
            public Object i(Object[] objArr) {
                rd.m.e(objArr, "args");
                a(objArr);
                f0 f0Var = new f0(2);
                f0Var.a(this.f4748h);
                f0Var.b(objArr);
                return f(null, f0Var.d(new Object[f0Var.c()]));
            }

            public final Object l() {
                return this.f4748h;
            }

            public final boolean m() {
                return this.f4747g;
            }
        }

        public static final class d extends h implements ce.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Object[] f4749g;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(Method method, Object[] objArr) {
                rd.m.e(method, "method");
                rd.m.e(objArr, "boundReceiverComponents");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                rd.m.d(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) ed.j.A(genericParameterTypes, objArr.length).toArray(new Type[0]), null);
                this.f4749g = objArr;
            }

            @Override // ce.h
            public Object i(Object[] objArr) {
                rd.m.e(objArr, "args");
                a(objArr);
                f0 f0Var = new f0(2);
                f0Var.b(this.f4749g);
                f0Var.b(objArr);
                return f(null, f0Var.d(new Object[f0Var.c()]));
            }

            public final Object[] l() {
                return this.f4749g;
            }

            public final int m() {
                return this.f4749g.length;
            }
        }

        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, false, null, 6, null);
                rd.m.e(method, "method");
            }

            @Override // ce.h
            public Object i(Object[] objArr) {
                rd.m.e(objArr, "args");
                a(objArr);
                return f(objArr[0], objArr.length <= 1 ? new Object[0] : ed.j.p(objArr, 1, objArr.length));
            }
        }

        public static final class f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, true, null, 4, null);
                rd.m.e(method, "method");
            }

            @Override // ce.h
            public Object i(Object[] objArr) {
                rd.m.e(objArr, "args");
                a(objArr);
                b(ed.j.E(objArr));
                return f(null, objArr.length <= 1 ? new Object[0] : ed.j.p(objArr, 1, objArr.length));
            }
        }

        public static final class g extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Method method) {
                super(method, false, null, 6, null);
                rd.m.e(method, "method");
            }

            @Override // ce.h
            public Object i(Object[] objArr) {
                rd.m.e(objArr, "args");
                a(objArr);
                return f(null, objArr);
            }
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, rd.h hVar) {
            this(method, z10, typeArr);
        }

        protected final Object f(Object obj, Object[] objArr) {
            rd.m.e(objArr, "args");
            return this.f4745f ? d0.f10897a : ((Method) h()).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, int i10, rd.h hVar) {
            z10 = (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10;
            if ((i10 & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                rd.m.d(typeArr, "getGenericParameterTypes(...)");
            }
            this(method, z10, typeArr, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private h(Method method, boolean z10, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            rd.m.d(genericReturnType, "getGenericReturnType(...)");
            super(method, genericReturnType, z10 ? method.getDeclaringClass() : null, typeArr, null);
            this.f4745f = rd.m.a(g(), Void.TYPE);
        }
    }

    public /* synthetic */ i(Member member, Type type, Class cls, Type[] typeArr, rd.h hVar) {
        this(member, type, cls, typeArr);
    }

    public void a(Object[] objArr) {
        c(objArr);
    }

    protected final void b(Object obj) {
        if (obj == null || !this.f4736a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public void c(Object[] objArr) {
        rd.m.e(objArr, "args");
        if (j.a(this) == objArr.length) {
            return;
        }
        throw new IllegalArgumentException("Callable expects " + j.a(this) + " arguments, but " + objArr.length + " were provided.");
    }

    public boolean d() {
        return false;
    }

    public final Class e() {
        return this.f4738c;
    }

    @Override // ce.h
    public final Type g() {
        return this.f4737b;
    }

    @Override // ce.h
    public final Member h() {
        return this.f4736a;
    }

    @Override // ce.h
    public List j() {
        return this.f4739d;
    }

    @Override // ce.h
    public boolean k() {
        return d();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private i(java.lang.reflect.Member r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f4736a = r1
            r0.f4737b = r2
            r0.f4738c = r3
            if (r3 == 0) goto L27
            rd.f0 r1 = new rd.f0
            r2 = 2
            r1.<init>(r2)
            r1.a(r3)
            r1.b(r4)
            int r2 = r1.c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.d(r2)
            java.util.List r1 = ed.q.n(r1)
            if (r1 != 0) goto L2b
        L27:
            java.util.List r1 = ed.j.k0(r4)
        L2b:
            r0.f4739d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.i.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }
}
