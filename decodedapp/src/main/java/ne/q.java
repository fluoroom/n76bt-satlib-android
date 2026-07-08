package ne;

import he.v1;
import he.w1;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends u implements j, a0, cf.g {

    /* JADX INFO: renamed from: a */
    private final Class f22713a;

    static final /* synthetic */ class a extends rd.l implements qd.l {

        /* JADX INFO: renamed from: s */
        public static final a f22714s = new a();

        a() {
            super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: p */
        public final Boolean l(Member member) {
            rd.m.e(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    static final /* synthetic */ class b extends rd.l implements qd.l {

        /* JADX INFO: renamed from: s */
        public static final b f22715s = new b();

        b() {
            super(1, t.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: p */
        public final t l(Constructor constructor) {
            rd.m.e(constructor, "p0");
            return new t(constructor);
        }
    }

    static final /* synthetic */ class c extends rd.l implements qd.l {

        /* JADX INFO: renamed from: s */
        public static final c f22716s = new c();

        c() {
            super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: p */
        public final Boolean l(Member member) {
            rd.m.e(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    static final /* synthetic */ class d extends rd.l implements qd.l {

        /* JADX INFO: renamed from: s */
        public static final d f22717s = new d();

        d() {
            super(1, w.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: p */
        public final w l(Field field) {
            rd.m.e(field, "p0");
            return new w(field);
        }
    }

    static final /* synthetic */ class e extends rd.l implements qd.l {

        /* JADX INFO: renamed from: s */
        public static final e f22718s = new e();

        e() {
            super(1, z.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: p */
        public final z l(Method method) {
            rd.m.e(method, "p0");
            return new z(method);
        }
    }

    public q(Class cls) {
        rd.m.e(cls, "klass");
        this.f22713a = cls;
    }

    public static final boolean P(Class cls) {
        String simpleName = cls.getSimpleName();
        rd.m.d(simpleName, "getSimpleName(...)");
        return simpleName.length() == 0;
    }

    public static final mf.f Q(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!mf.f.j(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return mf.f.h(simpleName);
        }
        return null;
    }

    public static final boolean R(q qVar, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        if (!qVar.B()) {
            return true;
        }
        rd.m.b(method);
        return !qVar.b0(method);
    }

    private final boolean b0(Method method) {
        String name = method.getName();
        if (rd.m.a(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            rd.m.d(parameterTypes, "getParameterTypes(...)");
            return parameterTypes.length == 0;
        }
        if (rd.m.a(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // cf.g
    public boolean B() {
        return this.f22713a.isEnum();
    }

    @Override // cf.g
    public boolean D() throws IllegalAccessException, InvocationTargetException {
        Boolean boolF = ne.b.f22671a.f(this.f22713a);
        if (boolF != null) {
            return boolF.booleanValue();
        }
        return false;
    }

    @Override // cf.g
    public boolean G() {
        return this.f22713a.isInterface();
    }

    @Override // cf.s
    public boolean H() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // cf.g
    public cf.d0 I() {
        return null;
    }

    @Override // cf.s
    public boolean O() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // cf.g
    /* JADX INFO: renamed from: V */
    public List getConstructors() {
        Constructor<?>[] declaredConstructors = this.f22713a.getDeclaredConstructors();
        rd.m.d(declaredConstructors, "getDeclaredConstructors(...)");
        return qg.k.O(qg.k.H(qg.k.y(ed.j.x(declaredConstructors), a.f22714s), b.f22715s));
    }

    @Override // ne.j
    /* JADX INFO: renamed from: W */
    public Class w() {
        return this.f22713a;
    }

    @Override // cf.g
    /* JADX INFO: renamed from: X */
    public List getFields() {
        Field[] declaredFields = this.f22713a.getDeclaredFields();
        rd.m.d(declaredFields, "getDeclaredFields(...)");
        return qg.k.O(qg.k.H(qg.k.y(ed.j.x(declaredFields), c.f22716s), d.f22717s));
    }

    @Override // cf.g
    /* JADX INFO: renamed from: Y */
    public List K() {
        Class<?>[] declaredClasses = this.f22713a.getDeclaredClasses();
        rd.m.d(declaredClasses, "getDeclaredClasses(...)");
        return qg.k.O(qg.k.I(qg.k.y(ed.j.x(declaredClasses), n.f22710a), o.f22711a));
    }

    @Override // cf.g
    /* JADX INFO: renamed from: Z */
    public List getMethods() {
        Method[] declaredMethods = this.f22713a.getDeclaredMethods();
        rd.m.d(declaredMethods, "getDeclaredMethods(...)");
        return qg.k.O(qg.k.H(qg.k.x(ed.j.x(declaredMethods), new p(this)), e.f22718s));
    }

    @Override // cf.d
    public /* bridge */ /* synthetic */ cf.a a(mf.c cVar) {
        return a(cVar);
    }

    @Override // cf.g
    /* JADX INFO: renamed from: a0 */
    public q k() {
        Class<?> declaringClass = this.f22713a.getDeclaringClass();
        if (declaringClass != null) {
            return new q(declaringClass);
        }
        return null;
    }

    @Override // cf.g
    public mf.c d() {
        return f.e(this.f22713a).a();
    }

    @Override // cf.g
    public Collection e() {
        Class cls;
        cls = Object.class;
        if (rd.m.a(this.f22713a, cls)) {
            return ed.q.k();
        }
        rd.f0 f0Var = new rd.f0(2);
        Type genericSuperclass = this.f22713a.getGenericSuperclass();
        f0Var.a(genericSuperclass != null ? genericSuperclass : Object.class);
        f0Var.b(this.f22713a.getGenericInterfaces());
        List listN = ed.q.n(f0Var.d(new Type[f0Var.c()]));
        ArrayList arrayList = new ArrayList(ed.q.v(listN, 10));
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(new s((Type) it.next()));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && rd.m.a(this.f22713a, ((q) obj).f22713a);
    }

    @Override // cf.d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // ne.a0
    public int getModifiers() {
        return this.f22713a.getModifiers();
    }

    @Override // cf.t
    public mf.f getName() {
        if (!this.f22713a.isAnonymousClass()) {
            mf.f fVarH = mf.f.h(this.f22713a.getSimpleName());
            rd.m.b(fVarH);
            return fVarH;
        }
        String name = this.f22713a.getName();
        rd.m.d(name, "getName(...)");
        mf.f fVarH2 = mf.f.h(rg.q.P0(name, ".", null, 2, null));
        rd.m.b(fVarH2);
        return fVarH2;
    }

    @Override // cf.z
    public List getTypeParameters() {
        TypeVariable[] typeParameters = this.f22713a.getTypeParameters();
        rd.m.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new f0(typeVariable));
        }
        return arrayList;
    }

    @Override // cf.s
    public w1 getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? v1.h.f15333c : Modifier.isPrivate(modifiers) ? v1.e.f15330c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? le.c.f20549c : le.b.f20548c : le.a.f20547c;
    }

    public int hashCode() {
        return this.f22713a.hashCode();
    }

    @Override // cf.g
    public Collection l() {
        Object[] objArrD = ne.b.f22671a.d(this.f22713a);
        if (objArrD == null) {
            objArrD = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrD.length);
        for (Object obj : objArrD) {
            arrayList.add(new d0(obj));
        }
        return arrayList;
    }

    @Override // cf.d
    public boolean m() {
        return false;
    }

    @Override // cf.s
    public boolean o() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // cf.g
    public boolean q() {
        return this.f22713a.isAnnotation();
    }

    @Override // cf.g
    public boolean s() throws IllegalAccessException, InvocationTargetException {
        Boolean boolE = ne.b.f22671a.e(this.f22713a);
        if (boolE != null) {
            return boolE.booleanValue();
        }
        return false;
    }

    public String toString() {
        return q.class.getName() + ": " + this.f22713a;
    }

    @Override // cf.g
    public boolean u() {
        return false;
    }

    @Override // ne.j, cf.d
    public g a(mf.c cVar) {
        Annotation[] declaredAnnotations;
        rd.m.e(cVar, "fqName");
        AnnotatedElement annotatedElementW = w();
        if (annotatedElementW == null || (declaredAnnotations = annotatedElementW.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, cVar);
    }

    @Override // ne.j, cf.d
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listB;
        AnnotatedElement annotatedElementW = w();
        return (annotatedElementW == null || (declaredAnnotations = annotatedElementW.getDeclaredAnnotations()) == null || (listB = k.b(declaredAnnotations)) == null) ? ed.q.k() : listB;
    }
}
