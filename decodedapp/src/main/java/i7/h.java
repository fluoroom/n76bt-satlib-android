package i7;

import com.fasterxml.jackson.databind.JavaType;
import e6.g;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f15886a = Object.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Annotation[] f15887b = new Annotation[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a[] f15888c = new a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Iterator f15889d = Collections.emptyIterator();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Constructor f15890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient Annotation[] f15891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private transient Annotation[][] f15892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f15893d = -1;

        public a(Constructor constructor) {
            this.f15890a = constructor;
        }

        public Constructor a() {
            return this.f15890a;
        }

        public Annotation[] b() {
            Annotation[] annotationArr = this.f15891b;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[] declaredAnnotations = this.f15890a.getDeclaredAnnotations();
            this.f15891b = declaredAnnotations;
            return declaredAnnotations;
        }

        public Class c() {
            return this.f15890a.getDeclaringClass();
        }

        public int d() {
            int i10 = this.f15893d;
            if (i10 >= 0) {
                return i10;
            }
            int parameterCount = this.f15890a.getParameterCount();
            this.f15893d = parameterCount;
            return parameterCount;
        }

        public Annotation[][] e() {
            Annotation[][] annotationArr = this.f15892c;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[][] parameterAnnotations = this.f15890a.getParameterAnnotations();
            this.f15892c = parameterAnnotations;
            return parameterAnnotations;
        }
    }

    private static class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final b f15894e = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Field f15895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Field f15896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f15897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f15898d;

        private b() {
            String string;
            Field fieldD;
            String string2;
            Field fieldD2 = null;
            try {
                fieldD = d(EnumSet.class, "elementType", Class.class);
                string = null;
            } catch (Exception e10) {
                string = e10.toString();
                fieldD = null;
            }
            this.f15895a = fieldD;
            this.f15897c = string;
            try {
                fieldD2 = d(EnumMap.class, "keyType", Class.class);
                string2 = null;
            } catch (Exception e11) {
                string2 = e11.toString();
            }
            this.f15896b = fieldD2;
            this.f15898d = string2;
        }

        private Object c(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        private static Field d(Class cls, String str, Class cls2) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    field.setAccessible(true);
                    return field;
                }
            }
            throw new IllegalStateException(String.format("No field named '%s' in class '%s'", str, cls.getName()));
        }

        public Class a(EnumMap enumMap) {
            Field field = this.f15896b;
            if (field != null) {
                return (Class) c(enumMap, field);
            }
            throw new IllegalStateException("Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: " + this.f15898d);
        }

        public Class b(EnumSet enumSet) {
            Field field = this.f15895a;
            if (field != null) {
                return (Class) c(enumSet, field);
            }
            throw new IllegalStateException("Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: " + this.f15897c);
        }
    }

    public static a[] A(Class cls) {
        if (cls.isInterface() || S(cls)) {
            return f15888c;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10] = new a(declaredConstructors[i10]);
        }
        return aVarArr;
    }

    public static Class B(Class cls) {
        if (S(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static Type[] C(Class cls) {
        return cls.getGenericInterfaces();
    }

    public static Type D(Class cls) {
        return cls.getGenericSuperclass();
    }

    public static Class E(Class cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (I(cls)) {
                    return null;
                }
                return B(cls);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public static Throwable F(Throwable th2) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        return th2;
    }

    public static String G(JavaType javaType) {
        if (javaType == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append('`');
        sb2.append(javaType.c());
        sb2.append('`');
        return sb2.toString();
    }

    public static boolean H(Object obj, Class cls) {
        return obj != null && obj.getClass() == cls;
    }

    public static boolean I(Class cls) {
        return (S(cls) || cls.getEnclosingMethod() == null) ? false : true;
    }

    public static boolean J(Class cls) {
        return cls == Void.class || cls == Void.TYPE || cls == q6.k.class;
    }

    public static boolean K(Class cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    public static boolean L(Class cls) {
        return (cls.getModifiers() & 1536) == 0;
    }

    public static boolean M(Class cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    public static boolean N(Class cls) {
        String name = cls.getName();
        return name.startsWith("java.") || name.startsWith("javax.");
    }

    public static boolean O(Class cls) {
        return cls.getAnnotation(q6.b.class) != null;
    }

    public static boolean P(Object obj) {
        return obj == null || O(obj.getClass());
    }

    public static String Q(Class cls, boolean z10) {
        try {
            boolean zIsStatic = Modifier.isStatic(cls.getModifiers());
            if (!zIsStatic && I(cls)) {
                return "local/anonymous";
            }
            if (z10 || zIsStatic) {
                return null;
            }
            if (B(cls) != null) {
                return "non-static member class";
            }
            return null;
        } catch (NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public static boolean R(Class cls) {
        return (Modifier.isStatic(cls.getModifiers()) || B(cls) == null) ? false : true;
    }

    public static boolean S(Class cls) {
        return cls == f15886a || cls.isPrimitive();
    }

    public static boolean T(Class cls) {
        String name = cls.getName();
        return name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.");
    }

    public static boolean U(Class cls) {
        Class superclass = cls.getSuperclass();
        return superclass != null && "com.android.tools.r8.RecordTag".equals(superclass.getName());
    }

    public static String V(String str) {
        return str == null ? "[null]" : d(str);
    }

    public static String W(p6.y yVar) {
        return yVar == null ? "[null]" : d(yVar.c());
    }

    public static String X(t tVar) {
        return tVar == null ? "[null]" : d(tVar.getName());
    }

    public static String Y(Class cls) {
        if (cls == null) {
            return "[null]";
        }
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i10 > 0) {
            StringBuilder sb2 = new StringBuilder(simpleName);
            do {
                sb2.append("[]");
                i10--;
            } while (i10 > 0);
            simpleName = sb2.toString();
        }
        return e(simpleName);
    }

    public static Object Z(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }

    private static void a(Class cls, Class cls2, Collection collection, boolean z10) {
        if (cls == cls2 || cls == null || cls == Object.class) {
            return;
        }
        if (z10) {
            if (collection.contains(cls)) {
                return;
            } else {
                collection.add(cls);
            }
        }
        for (Class cls3 : c(cls)) {
            a(cls3, cls2, collection, true);
        }
        a(cls.getSuperclass(), cls2, collection, true);
    }

    public static String a0(String str) {
        return str == null ? "" : str;
    }

    private static Method[] b(Class cls, Throwable th2) {
        throw new IllegalArgumentException(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", cls.getName(), th2.getClass().getName(), th2.getMessage()), th2);
    }

    public static String b0(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    private static Class[] c(Class cls) {
        return cls.getInterfaces();
    }

    public static Class c0(Class cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static String d(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('\'');
        sb2.append(str);
        sb2.append('\'');
        return sb2.toString();
    }

    public static String d0(Object obj, String str) {
        return obj == null ? str : String.format("\"%s\"", obj);
    }

    public static String e(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('`');
        sb2.append(str);
        sb2.append('`');
        return sb2.toString();
    }

    public static Class e0(JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return javaType.r();
    }

    public static String f(Class cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    public static void f0(Throwable th2) {
        g0(th2, th2.getMessage());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(Member member, boolean z10) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers()) && (!z10 || N(declaringClass))) {
                return;
            }
            accessibleObject.setAccessible(true);
        } catch (SecurityException e10) {
            if (accessibleObject.isAccessible()) {
                return;
            }
            throw new IllegalArgumentException("Cannot access " + member + " (from class " + member.getDeclaringClass().getName() + "; failed to set access: " + e10.getMessage());
        } catch (RuntimeException e11) {
            if (!"InaccessibleObjectException".equals(e11.getClass().getSimpleName())) {
                throw e11;
            }
            throw new IllegalArgumentException(String.format("Failed to call `setAccess()` on %s '%s' (of class %s) due to `%s`, problem: %s", member.getClass().getSimpleName(), member.getName(), Y(member.getDeclaringClass()), e11.getClass().getName(), e11.getMessage()), e11);
        }
    }

    public static void g0(Throwable th2, String str) {
        k0(th2);
        i0(th2);
        throw new IllegalArgumentException(str, th2);
    }

    public static String h(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return Y(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static Object h0(p6.h hVar, IOException iOException) throws p6.m {
        if (iOException instanceof p6.m) {
            throw ((p6.m) iOException);
        }
        throw p6.m.l(hVar, iOException.getMessage()).q(iOException);
    }

    public static Class i(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    public static Throwable i0(Throwable th2) {
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        return th2;
    }

    public static void j(e6.g gVar, Closeable closeable, Exception exc) throws IOException {
        if (gVar != null) {
            gVar.r(g.b.AUTO_CLOSE_JSON_CONTENT);
            try {
                gVar.close();
            } catch (Exception e10) {
                exc.addSuppressed(e10);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e11) {
                exc.addSuppressed(e11);
            }
        }
        j0(exc);
        k0(exc);
        throw new RuntimeException(exc);
    }

    public static Throwable j0(Throwable th2) throws IOException {
        if (th2 instanceof IOException) {
            throw ((IOException) th2);
        }
        return th2;
    }

    public static void k(e6.g gVar, Exception exc) throws IOException {
        gVar.r(g.b.AUTO_CLOSE_JSON_CONTENT);
        try {
            gVar.close();
        } catch (Exception e10) {
            exc.addSuppressed(e10);
        }
        j0(exc);
        k0(exc);
        throw new RuntimeException(exc);
    }

    public static Throwable k0(Throwable th2) {
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        return th2;
    }

    public static Object l(Class cls, boolean z10) {
        Constructor constructorQ = q(cls, z10);
        if (constructorQ == null) {
            throw new IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
        }
        try {
            return constructorQ.newInstance(null);
        } catch (Exception e10) {
            n0(e10, "Failed to instantiate class " + cls.getName() + ", problem: " + e10.getMessage());
            return null;
        }
    }

    public static Throwable l0(Throwable th2) {
        return j0(F(th2));
    }

    public static Object m(Class cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Character.TYPE) {
            return (char) 0;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static void m0(Throwable th2) {
        f0(F(th2));
    }

    public static Iterator n() {
        return f15889d;
    }

    public static void n0(Throwable th2, String str) {
        g0(F(th2), str);
    }

    public static String o(Throwable th2) {
        return th2 instanceof e6.d ? ((e6.d) th2).b() : (!(th2 instanceof InvocationTargetException) || th2.getCause() == null) ? th2.getMessage() : th2.getCause().getMessage();
    }

    public static void o0(Class cls, Object obj, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", obj.getClass().getName(), cls.getName(), str));
        }
    }

    public static Annotation[] p(Class cls) {
        return S(cls) ? f15887b : cls.getDeclaredAnnotations();
    }

    public static Class p0(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static Constructor q(Class cls, boolean z10) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (z10) {
                g(declaredConstructor, z10);
                return declaredConstructor;
            }
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                return declaredConstructor;
            }
            throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e10) {
            n0(e10, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e10.getMessage());
            return null;
        }
    }

    public static Class r(Class cls) {
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static Class s(Enum r02) {
        return r02.getDeclaringClass();
    }

    public static Class t(EnumMap enumMap) {
        return !enumMap.isEmpty() ? s((Enum) enumMap.keySet().iterator().next()) : b.f15894e.a(enumMap);
    }

    public static Class u(EnumSet enumSet) {
        return !enumSet.isEmpty() ? s((Enum) enumSet.iterator().next()) : b.f15894e.b(enumSet);
    }

    public static Enum v(Class cls, Class cls2) {
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                String name = field.getName();
                for (Enum r82 : (Enum[]) cls.getEnumConstants()) {
                    if (name.equals(r82.name())) {
                        return r82;
                    }
                }
            }
        }
        return null;
    }

    public static List w(Class cls, Class cls2, boolean z10) {
        if (cls == null || cls == cls2 || cls == Object.class) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(8);
        a(cls, cls2, arrayList, z10);
        return arrayList;
    }

    public static List x(Class cls, Class cls2, boolean z10) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z10) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    public static String y(Object obj) {
        if (obj == null) {
            return "unknown";
        }
        return Y(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static Method[] z(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (Exception e10) {
            return b(cls, e10);
        } catch (NoClassDefFoundError e11) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                return b(cls, e11);
            }
            try {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (Exception e12) {
                    return b(cls, e12);
                }
            } catch (ClassNotFoundException e13) {
                e11.addSuppressed(e13);
                return b(cls, e11);
            }
        }
    }
}
