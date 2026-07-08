package z9;

import com.google.gson.reflect.TypeToken;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f33046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f33048c;

    public t(Map map, boolean z10, List list) {
        this.f33046a = map;
        this.f33047b = z10;
        this.f33048c = list;
    }

    private static b0 A(final Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new b0() { // from class: z9.s
                @Override // z9.b0
                public final Object a() {
                    return t.k(type);
                }
            };
        }
        if (cls == EnumMap.class) {
            return new b0() { // from class: z9.b
                @Override // z9.b0
                public final Object a() {
                    return t.f(type);
                }
            };
        }
        return null;
    }

    private b0 B(final Class cls) {
        if (this.f33047b) {
            return new b0() { // from class: z9.q
                @Override // z9.b0
                public final Object a() {
                    return t.e(cls);
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new b0() { // from class: z9.r
            @Override // z9.b0
            public final Object a() {
                return t.m(str);
            }
        };
    }

    public static /* synthetic */ Map a() {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Collection b() {
        return new ArrayList();
    }

    public static /* synthetic */ Map c() {
        return new LinkedHashMap();
    }

    public static /* synthetic */ Object d(String str) {
        throw new com.google.gson.l(str);
    }

    public static /* synthetic */ Object e(Class cls) {
        try {
            return h0.f33033a.d(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    public static /* synthetic */ Object f(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new com.google.gson.l("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new com.google.gson.l("Invalid EnumMap type: " + type.toString());
    }

    public static /* synthetic */ Map g() {
        return new ConcurrentSkipListMap();
    }

    public static /* synthetic */ Map h() {
        return new TreeMap();
    }

    public static /* synthetic */ Object i(String str) {
        throw new com.google.gson.l(str);
    }

    public static /* synthetic */ Collection j() {
        return new LinkedHashSet();
    }

    public static /* synthetic */ Object k(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new com.google.gson.l("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new com.google.gson.l("Invalid EnumSet type: " + type.toString());
    }

    public static /* synthetic */ Object l(String str) {
        throw new com.google.gson.l(str);
    }

    public static /* synthetic */ Object m(String str) {
        throw new com.google.gson.l(str);
    }

    public static /* synthetic */ Map n() {
        return new z();
    }

    public static /* synthetic */ Object o(String str) {
        throw new com.google.gson.l(str);
    }

    public static /* synthetic */ Collection p() {
        return new TreeSet();
    }

    public static /* synthetic */ Object q(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw ba.a.e(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + ba.a.c(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + ba.a.c(constructor) + "' with no args", e12.getCause());
        }
    }

    public static /* synthetic */ Collection r() {
        return new ArrayDeque();
    }

    public static /* synthetic */ Object s(String str) {
        throw new com.google.gson.l(str);
    }

    static String t(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + g0.a("r8-abstract-class");
    }

    private static boolean v(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length != 0 && v.k(actualTypeArguments[0]) == String.class;
    }

    private static b0 w(Class cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new b0() { // from class: z9.m
                @Override // z9.b0
                public final Object a() {
                    return t.b();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new b0() { // from class: z9.n
                @Override // z9.b0
                public final Object a() {
                    return t.j();
                }
            };
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new b0() { // from class: z9.o
                @Override // z9.b0
                public final Object a() {
                    return t.p();
                }
            };
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new b0() { // from class: z9.p
                @Override // z9.b0
                public final Object a() {
                    return t.r();
                }
            };
        }
        return null;
    }

    private static b0 x(Class cls, com.google.gson.t tVar) {
        final String strP;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            com.google.gson.t tVar2 = com.google.gson.t.ALLOW;
            if (tVar == tVar2 || (e0.a(declaredConstructor, null) && (tVar != com.google.gson.t.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (tVar != tVar2 || (strP = ba.a.p(declaredConstructor)) == null) ? new b0() { // from class: z9.j
                    @Override // z9.b0
                    public final Object a() {
                        return t.q(declaredConstructor);
                    }
                } : new b0() { // from class: z9.i
                    @Override // z9.b0
                    public final Object a() {
                        return t.i(strP);
                    }
                };
            }
            final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
            return new b0() { // from class: z9.h
                @Override // z9.b0
                public final Object a() {
                    return t.l(str);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static b0 y(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return w(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return z(type, cls);
        }
        return null;
    }

    private static b0 z(Type type, Class cls) {
        if (cls.isAssignableFrom(z.class) && v(type)) {
            return new b0() { // from class: z9.c
                @Override // z9.b0
                public final Object a() {
                    return t.n();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new b0() { // from class: z9.d
                @Override // z9.b0
                public final Object a() {
                    return t.c();
                }
            };
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new b0() { // from class: z9.e
                @Override // z9.b0
                public final Object a() {
                    return t.h();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new b0() { // from class: z9.f
                @Override // z9.b0
                public final Object a() {
                    return t.a();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new b0() { // from class: z9.g
                @Override // z9.b0
                public final Object a() {
                    return t.g();
                }
            };
        }
        return null;
    }

    public String toString() {
        return this.f33046a.toString();
    }

    public b0 u(TypeToken typeToken, boolean z10) {
        Type typeD = typeToken.d();
        Class clsC = typeToken.c();
        android.support.v4.media.session.b.a(this.f33046a.get(typeD));
        android.support.v4.media.session.b.a(this.f33046a.get(clsC));
        b0 b0VarA = A(typeD, clsC);
        if (b0VarA != null) {
            return b0VarA;
        }
        com.google.gson.t tVarB = e0.b(this.f33048c, clsC);
        b0 b0VarX = x(clsC, tVarB);
        if (b0VarX != null) {
            return b0VarX;
        }
        b0 b0VarY = y(typeD, clsC);
        if (b0VarY != null) {
            return b0VarY;
        }
        final String strT = t(clsC);
        if (strT != null) {
            return new b0() { // from class: z9.a
                @Override // z9.b0
                public final Object a() {
                    return t.o(strT);
                }
            };
        }
        if (!z10) {
            final String str = "Unable to create instance of " + clsC + "; Register an InstanceCreator or a TypeAdapter for this type.";
            return new b0() { // from class: z9.k
                @Override // z9.b0
                public final Object a() {
                    return t.d(str);
                }
            };
        }
        if (tVarB == com.google.gson.t.ALLOW) {
            return B(clsC);
        }
        final String str2 = "Unable to create instance of " + clsC + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new b0() { // from class: z9.l
            @Override // z9.b0
            public final Object a() {
                return t.s(str2);
            }
        };
    }
}
