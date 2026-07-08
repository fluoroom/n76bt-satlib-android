package com.fasterxml.jackson.databind.type;

import com.facebook.stetho.server.http.HttpStatus;
import com.fasterxml.jackson.databind.JavaType;
import i7.h;
import i7.p;
import i7.r;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import p6.n;

/* JADX INFO: loaded from: classes.dex */
public class c implements Serializable {
    protected static final SimpleType A;
    protected static final SimpleType B;
    protected static final SimpleType C;
    protected static final SimpleType D;
    protected static final SimpleType E;
    protected static final SimpleType F;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final JavaType[] f7118e = new JavaType[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final c f7119f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final b f7120g = b.i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Class f7121h = String.class;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Class f7122r = Object.class;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Class f7123s = Comparable.class;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Class f7124t = Enum.class;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Class f7125u = n.class;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Class f7126v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Class f7127w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Class f7128x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected static final SimpleType f7129y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static final SimpleType f7130z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final r f7131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final h7.d[] f7132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final d f7133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final ClassLoader f7134d;

    static {
        Class cls = Boolean.TYPE;
        f7126v = cls;
        Class cls2 = Integer.TYPE;
        f7127w = cls2;
        Class cls3 = Long.TYPE;
        f7128x = cls3;
        f7129y = new SimpleType(cls);
        f7130z = new SimpleType(cls2);
        A = new SimpleType(cls3);
        B = new SimpleType(String.class);
        C = new SimpleType(Object.class);
        D = new SimpleType(Comparable.class);
        E = new SimpleType(Enum.class);
        F = new SimpleType(n.class);
    }

    private c() {
        this(null);
    }

    public static c T() {
        return f7119f;
    }

    private b b(JavaType javaType, int i10, Class cls, boolean z10) {
        PlaceholderForType[] placeholderForTypeArr = new PlaceholderForType[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            placeholderForTypeArr[i11] = new PlaceholderForType(i11);
        }
        JavaType javaTypeI = i(null, cls, b.e(cls, placeholderForTypeArr)).i(javaType.r());
        if (javaTypeI == null) {
            throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", javaType.r().getName(), cls.getName()));
        }
        String strV = v(javaType, javaTypeI);
        if (strV == null || z10) {
            JavaType[] javaTypeArr = new JavaType[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                JavaType javaTypeO0 = placeholderForTypeArr[i12].o0();
                if (javaTypeO0 == null) {
                    javaTypeO0 = b0();
                }
                javaTypeArr[i12] = javaTypeO0;
            }
            return b.e(cls, javaTypeArr);
        }
        throw new IllegalArgumentException("Failed to specialize base type " + javaType.c() + " as " + cls.getName() + ", problem: " + strV);
    }

    public static JavaType b0() {
        return T().w();
    }

    private JavaType c(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaTypeW;
        List listL = bVar.l();
        if (listL.isEmpty()) {
            javaTypeW = w();
        } else {
            if (listL.size() != 1) {
                throw new IllegalArgumentException("Strange Collection type " + cls.getName() + ": cannot determine type parameters");
            }
            javaTypeW = (JavaType) listL.get(0);
        }
        return CollectionType.s0(cls, bVar, javaType, javaTypeArr, javaTypeW);
    }

    private JavaType p(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaTypeW;
        b bVar2;
        JavaType javaType2;
        JavaType[] javaTypeArr2;
        JavaType javaType3;
        JavaType javaType4;
        Class cls2;
        if (cls == Properties.class) {
            javaTypeW = B;
        } else {
            List listL = bVar.l();
            int size = listL.size();
            if (size != 0) {
                if (size != 2) {
                    throw new IllegalArgumentException(String.format("Strange Map type %s with %d type parameter%s (%s), can not resolve", h.Y(cls), Integer.valueOf(size), size == 1 ? "" : "s", bVar));
                }
                JavaType javaType5 = (JavaType) listL.get(0);
                bVar2 = bVar;
                javaType2 = javaType;
                javaTypeArr2 = javaTypeArr;
                javaType3 = (JavaType) listL.get(1);
                javaType4 = javaType5;
                cls2 = cls;
                return MapType.u0(cls2, bVar2, javaType2, javaTypeArr2, javaType4, javaType3);
            }
            javaTypeW = w();
        }
        cls2 = cls;
        bVar2 = bVar;
        javaType2 = javaType;
        javaTypeArr2 = javaTypeArr;
        javaType4 = javaTypeW;
        javaType3 = javaType4;
        return MapType.u0(cls2, bVar2, javaType2, javaTypeArr2, javaType4, javaType3);
    }

    private JavaType r(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaTypeW;
        List listL = bVar.l();
        if (listL.isEmpty()) {
            javaTypeW = w();
        } else {
            if (listL.size() != 1) {
                throw new IllegalArgumentException("Strange Reference type " + cls.getName() + ": cannot determine type parameters");
            }
            javaTypeW = (JavaType) listL.get(0);
        }
        return ReferenceType.s0(cls, bVar, javaType, javaTypeArr, javaTypeW);
    }

    private String v(JavaType javaType, JavaType javaType2) {
        List listL = javaType.j().l();
        List listL2 = javaType2.j().l();
        int size = listL2.size();
        int size2 = listL.size();
        int i10 = 0;
        while (i10 < size2) {
            JavaType javaType3 = (JavaType) listL.get(i10);
            JavaType javaTypeB0 = i10 < size ? (JavaType) listL2.get(i10) : b0();
            if (!x(javaType3, javaTypeB0) && !javaType3.C(Object.class) && ((i10 != 0 || !javaType.T() || !javaTypeB0.C(Object.class)) && (!javaType3.R() || !javaType3.a0(javaTypeB0.r())))) {
                return String.format("Type parameter #%d/%d differs; can not specialize %s with %s", Integer.valueOf(i10 + 1), Integer.valueOf(size2), javaType3.c(), javaTypeB0.c());
            }
            i10++;
        }
        return null;
    }

    private boolean x(JavaType javaType, JavaType javaType2) {
        if (javaType2 instanceof PlaceholderForType) {
            ((PlaceholderForType) javaType2).p0(javaType);
            return true;
        }
        if (javaType.r() != javaType2.r()) {
            return false;
        }
        List listL = javaType.j().l();
        List listL2 = javaType2.j().l();
        int size = listL.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!x((JavaType) listL.get(i10), (JavaType) listL2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    protected Class A(String str, boolean z10, ClassLoader classLoader) {
        return Class.forName(str, true, classLoader);
    }

    public CollectionType C(Class cls, JavaType javaType) {
        b bVarG = b.g(cls, javaType);
        CollectionType collectionType = (CollectionType) i(null, cls, bVarG);
        if (bVarG.p() && javaType != null) {
            JavaType javaTypeK = collectionType.i(Collection.class).k();
            if (!javaTypeK.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", h.Y(cls), javaType, javaTypeK));
            }
        }
        return collectionType;
    }

    public CollectionType D(Class cls, Class cls2) {
        return C(cls, i(null, cls2, f7120g));
    }

    public JavaType G(String str) {
        return this.f7133c.c(str);
    }

    public JavaType H(JavaType javaType, Class cls) {
        Class clsR = javaType.r();
        if (clsR == cls) {
            return javaType;
        }
        JavaType javaTypeI = javaType.i(cls);
        if (javaTypeI != null) {
            return javaTypeI;
        }
        if (cls.isAssignableFrom(clsR)) {
            throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), javaType));
        }
        throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), javaType));
    }

    public MapType K(Class cls, JavaType javaType, JavaType javaType2) {
        b bVarH = b.h(cls, new JavaType[]{javaType, javaType2});
        MapType mapType = (MapType) i(null, cls, bVarH);
        if (bVarH.p()) {
            JavaType javaTypeI = mapType.i(Map.class);
            JavaType javaTypeQ = javaTypeI.q();
            if (!javaTypeQ.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", h.Y(cls), javaType, javaTypeQ));
            }
            JavaType javaTypeK = javaTypeI.k();
            if (!javaTypeK.equals(javaType2)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", h.Y(cls), javaType2, javaTypeK));
            }
        }
        return mapType;
    }

    public MapType L(Class cls, Class cls2, Class cls3) {
        JavaType javaTypeI;
        JavaType javaTypeI2;
        if (cls == Properties.class) {
            javaTypeI = B;
            javaTypeI2 = javaTypeI;
        } else {
            b bVar = f7120g;
            javaTypeI = i(null, cls2, bVar);
            javaTypeI2 = i(null, cls3, bVar);
        }
        return K(cls, javaTypeI, javaTypeI2);
    }

    public JavaType N(Class cls, b bVar) {
        return a(cls, i(null, cls, bVar));
    }

    public JavaType O(JavaType javaType, Class cls) {
        return Q(javaType, cls, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        if (r0 == java.util.EnumSet.class) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JavaType Q(com.fasterxml.jackson.databind.JavaType r4, java.lang.Class r5, boolean r6) {
        /*
            r3 = this;
            java.lang.Class r0 = r4.r()
            if (r0 != r5) goto L7
            goto L62
        L7:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 0
            if (r0 != r1) goto L14
            com.fasterxml.jackson.databind.type.b r6 = com.fasterxml.jackson.databind.type.c.f7120g
            com.fasterxml.jackson.databind.JavaType r5 = r3.i(r2, r5, r6)
            goto L97
        L14:
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 == 0) goto L9c
            boolean r1 = r4.L()
            if (r1 == 0) goto L70
            boolean r1 = r4.T()
            if (r1 == 0) goto L47
            java.lang.Class<java.util.HashMap> r0 = java.util.HashMap.class
            if (r5 == r0) goto L36
            java.lang.Class<java.util.LinkedHashMap> r0 = java.util.LinkedHashMap.class
            if (r5 == r0) goto L36
            java.lang.Class<java.util.EnumMap> r0 = java.util.EnumMap.class
            if (r5 == r0) goto L36
            java.lang.Class<java.util.TreeMap> r0 = java.util.TreeMap.class
            if (r5 != r0) goto L70
        L36:
            com.fasterxml.jackson.databind.JavaType r6 = r4.q()
            com.fasterxml.jackson.databind.JavaType r0 = r4.k()
            com.fasterxml.jackson.databind.type.b r6 = com.fasterxml.jackson.databind.type.b.c(r5, r6, r0)
            com.fasterxml.jackson.databind.JavaType r5 = r3.i(r2, r5, r6)
            goto L97
        L47:
            boolean r1 = r4.H()
            if (r1 == 0) goto L70
            java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
            if (r5 == r1) goto L63
            java.lang.Class<java.util.LinkedList> r1 = java.util.LinkedList.class
            if (r5 == r1) goto L63
            java.lang.Class<java.util.HashSet> r1 = java.util.HashSet.class
            if (r5 == r1) goto L63
            java.lang.Class<java.util.TreeSet> r1 = java.util.TreeSet.class
            if (r5 != r1) goto L5e
            goto L63
        L5e:
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            if (r0 != r1) goto L70
        L62:
            return r4
        L63:
            com.fasterxml.jackson.databind.JavaType r6 = r4.k()
            com.fasterxml.jackson.databind.type.b r6 = com.fasterxml.jackson.databind.type.b.b(r5, r6)
            com.fasterxml.jackson.databind.JavaType r5 = r3.i(r2, r5, r6)
            goto L97
        L70:
            com.fasterxml.jackson.databind.type.b r0 = r4.j()
            boolean r0 = r0.p()
            if (r0 == 0) goto L81
            com.fasterxml.jackson.databind.type.b r6 = com.fasterxml.jackson.databind.type.c.f7120g
            com.fasterxml.jackson.databind.JavaType r5 = r3.i(r2, r5, r6)
            goto L97
        L81:
            java.lang.reflect.TypeVariable[] r0 = r5.getTypeParameters()
            int r0 = r0.length
            if (r0 != 0) goto L8f
            com.fasterxml.jackson.databind.type.b r6 = com.fasterxml.jackson.databind.type.c.f7120g
            com.fasterxml.jackson.databind.JavaType r5 = r3.i(r2, r5, r6)
            goto L97
        L8f:
            com.fasterxml.jackson.databind.type.b r6 = r3.b(r4, r0, r5, r6)
            com.fasterxml.jackson.databind.JavaType r5 = r3.i(r2, r5, r6)
        L97:
            com.fasterxml.jackson.databind.JavaType r4 = r5.g0(r4)
            return r4
        L9c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = i7.h.Y(r5)
            java.lang.String r4 = i7.h.G(r4)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r5
            r5 = 1
            r0[r5] = r4
            java.lang.String r4 = "Class %s not subtype of %s"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r6.<init>(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.c.Q(com.fasterxml.jackson.databind.JavaType, java.lang.Class, boolean):com.fasterxml.jackson.databind.JavaType");
    }

    public JavaType R(Type type) {
        return g(null, type, f7120g);
    }

    public JavaType S(n6.b bVar) {
        return g(null, bVar.d(), f7120g);
    }

    public Class W(String str) throws ClassNotFoundException {
        Throwable thF;
        Class clsE;
        if (str.indexOf(46) < 0 && (clsE = e(str)) != null) {
            return clsE;
        }
        ClassLoader classLoaderY = Y();
        if (classLoaderY == null) {
            classLoaderY = Thread.currentThread().getContextClassLoader();
        }
        if (classLoaderY != null) {
            try {
                return A(str, true, classLoaderY);
            } catch (Exception e10) {
                thF = h.F(e10);
            }
        } else {
            thF = null;
        }
        try {
            return z(str);
        } catch (Exception e11) {
            if (thF == null) {
                thF = h.F(e11);
            }
            h.k0(thF);
            throw new ClassNotFoundException(thF.getMessage(), thF);
        }
    }

    public JavaType[] X(JavaType javaType, Class cls) {
        JavaType javaTypeI = javaType.i(cls);
        return javaTypeI == null ? f7118e : javaTypeI.j().r();
    }

    public ClassLoader Y() {
        return this.f7134d;
    }

    public JavaType Z(Type type, b bVar) {
        return g(null, type, bVar);
    }

    protected JavaType a(Type type, JavaType javaType) {
        if (this.f7132b == null) {
            return javaType;
        }
        javaType.j();
        h7.d[] dVarArr = this.f7132b;
        if (dVarArr.length <= 0) {
            return javaType;
        }
        h7.d dVar = dVarArr[0];
        throw null;
    }

    public JavaType a0(Class cls) {
        return d(cls, f7120g, null, null);
    }

    protected JavaType d(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaTypeF;
        return (!bVar.p() || (javaTypeF = f(cls)) == null) ? q(cls, bVar, javaType, javaTypeArr) : javaTypeF;
    }

    protected Class e(String str) {
        if ("int".equals(str)) {
            return Integer.TYPE;
        }
        if ("long".equals(str)) {
            return Long.TYPE;
        }
        if ("float".equals(str)) {
            return Float.TYPE;
        }
        if ("double".equals(str)) {
            return Double.TYPE;
        }
        if ("boolean".equals(str)) {
            return Boolean.TYPE;
        }
        if ("byte".equals(str)) {
            return Byte.TYPE;
        }
        if ("char".equals(str)) {
            return Character.TYPE;
        }
        if ("short".equals(str)) {
            return Short.TYPE;
        }
        if ("void".equals(str)) {
            return Void.TYPE;
        }
        return null;
    }

    protected JavaType f(Class cls) {
        if (cls.isPrimitive()) {
            if (cls == f7126v) {
                return f7129y;
            }
            if (cls == f7127w) {
                return f7130z;
            }
            if (cls == f7128x) {
                return A;
            }
            return null;
        }
        if (cls == f7121h) {
            return B;
        }
        if (cls == f7122r) {
            return C;
        }
        if (cls == f7125u) {
            return F;
        }
        return null;
    }

    protected JavaType g(h7.b bVar, Type type, b bVar2) {
        JavaType javaTypeO;
        if (type instanceof Class) {
            javaTypeO = i(bVar, (Class) type, f7120g);
        } else if (type instanceof ParameterizedType) {
            javaTypeO = j(bVar, (ParameterizedType) type, bVar2);
        } else {
            if (type instanceof JavaType) {
                return (JavaType) type;
            }
            if (type instanceof GenericArrayType) {
                javaTypeO = h(bVar, (GenericArrayType) type, bVar2);
            } else if (type instanceof TypeVariable) {
                javaTypeO = k(bVar, (TypeVariable) type, bVar2);
            } else {
                if (!(type instanceof WildcardType)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unrecognized Type: ");
                    sb2.append(type == null ? "[null]" : type.toString());
                    throw new IllegalArgumentException(sb2.toString());
                }
                javaTypeO = o(bVar, (WildcardType) type, bVar2);
            }
        }
        return a(type, javaTypeO);
    }

    protected JavaType h(h7.b bVar, GenericArrayType genericArrayType, b bVar2) {
        return ArrayType.n0(g(bVar, genericArrayType.getGenericComponentType(), bVar2), bVar2);
    }

    protected JavaType i(h7.b bVar, Class cls, b bVar2) {
        h7.b bVarB;
        JavaType[] javaTypeArrT;
        Class cls2;
        b bVar3;
        c cVar;
        JavaType javaTypeL;
        JavaType javaTypeF = f(cls);
        if (javaTypeF != null) {
            return javaTypeF;
        }
        Object objA = (bVar2 == null || bVar2.p()) ? cls : bVar2.a(cls);
        JavaType javaTypeS = null;
        JavaType javaTypeB0 = objA == null ? null : (JavaType) this.f7131a.get(objA);
        if (javaTypeB0 != null) {
            return javaTypeB0;
        }
        if (bVar == null) {
            bVarB = new h7.b(cls);
        } else {
            h7.b bVarC = bVar.c(cls);
            if (bVarC != null) {
                ResolvedRecursiveType resolvedRecursiveType = new ResolvedRecursiveType(cls, f7120g);
                bVarC.a(resolvedRecursiveType);
                return resolvedRecursiveType;
            }
            bVarB = bVar.b(cls);
        }
        h7.b bVar4 = bVarB;
        if (cls.isArray()) {
            javaTypeL = ArrayType.n0(g(bVar4, cls.getComponentType(), bVar2), bVar2);
            cVar = this;
        } else {
            if (cls.isInterface()) {
                javaTypeArrT = t(bVar4, cls, bVar2);
            } else {
                javaTypeS = s(bVar4, cls, bVar2);
                javaTypeArrT = t(bVar4, cls, bVar2);
            }
            JavaType[] javaTypeArr = javaTypeArrT;
            JavaType javaType = javaTypeS;
            if (cls == Properties.class) {
                SimpleType simpleType = B;
                cls2 = cls;
                bVar3 = bVar2;
                javaTypeB0 = MapType.u0(cls2, bVar3, javaType, javaTypeArr, simpleType, simpleType);
            } else {
                cls2 = cls;
                bVar3 = bVar2;
                if (javaType != null) {
                    javaTypeB0 = javaType.b0(cls2, bVar3, javaType, javaTypeArr);
                }
            }
            cVar = this;
            if (javaTypeB0 == null) {
                javaTypeL = cVar.l(bVar4, cls2, bVar3, javaType, javaTypeArr);
                cVar = this;
                if (javaTypeL == null && (javaTypeL = cVar.n(bVar4, cls2, bVar3, javaType, javaTypeArr)) == null) {
                    javaTypeL = q(cls2, bVar3, javaType, javaTypeArr);
                }
            } else {
                javaTypeL = javaTypeB0;
            }
        }
        bVar4.d(javaTypeL);
        if (objA != null && !javaTypeL.A()) {
            cVar.f7131a.putIfAbsent(objA, javaTypeL);
        }
        return javaTypeL;
    }

    protected JavaType j(h7.b bVar, ParameterizedType parameterizedType, b bVar2) {
        b bVarE;
        Class cls = (Class) parameterizedType.getRawType();
        if (cls == f7124t) {
            return E;
        }
        if (cls == f7123s) {
            return D;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
        if (length == 0) {
            bVarE = f7120g;
        } else {
            JavaType[] javaTypeArr = new JavaType[length];
            for (int i10 = 0; i10 < length; i10++) {
                javaTypeArr[i10] = g(bVar, actualTypeArguments[i10], bVar2);
            }
            bVarE = b.e(cls, javaTypeArr);
        }
        return i(bVar, cls, bVarE);
    }

    protected JavaType k(h7.b bVar, TypeVariable typeVariable, b bVar2) {
        Type[] bounds;
        String name = typeVariable.getName();
        if (bVar2 == null) {
            throw new IllegalArgumentException("Null `bindings` passed (type variable \"" + name + "\")");
        }
        JavaType javaTypeJ = bVar2.j(name);
        if (javaTypeJ != null) {
            return javaTypeJ;
        }
        if (bVar2.n(name)) {
            return C;
        }
        b bVarS = bVar2.s(name);
        synchronized (typeVariable) {
            bounds = typeVariable.getBounds();
        }
        return g(bVar, bounds[0], bVarS);
    }

    protected JavaType l(h7.b bVar, Class cls, b bVar2, JavaType javaType, JavaType[] javaTypeArr) {
        if (bVar2 == null) {
            bVar2 = f7120g;
        }
        if (cls == Map.class) {
            return p(cls, bVar2, javaType, javaTypeArr);
        }
        if (cls == Collection.class) {
            return c(cls, bVar2, javaType, javaTypeArr);
        }
        if (cls == AtomicReference.class) {
            return r(cls, bVar2, javaType, javaTypeArr);
        }
        return null;
    }

    protected JavaType n(h7.b bVar, Class cls, b bVar2, JavaType javaType, JavaType[] javaTypeArr) {
        for (JavaType javaType2 : javaTypeArr) {
            JavaType javaTypeB0 = javaType2.b0(cls, bVar2, javaType, javaTypeArr);
            if (javaTypeB0 != null) {
                return javaTypeB0;
            }
        }
        return null;
    }

    protected JavaType o(h7.b bVar, WildcardType wildcardType, b bVar2) {
        return g(bVar, wildcardType.getUpperBounds()[0], bVar2);
    }

    protected JavaType q(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new SimpleType(cls, bVar, javaType, javaTypeArr);
    }

    protected JavaType s(h7.b bVar, Class cls, b bVar2) {
        Type typeD = h.D(cls);
        if (typeD == null) {
            return null;
        }
        return g(bVar, typeD, bVar2);
    }

    protected JavaType[] t(h7.b bVar, Class cls, b bVar2) {
        Type[] typeArrC = h.C(cls);
        if (typeArrC == null || typeArrC.length == 0) {
            return f7118e;
        }
        int length = typeArrC.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i10 = 0; i10 < length; i10++) {
            javaTypeArr[i10] = g(bVar, typeArrC[i10], bVar2);
        }
        return javaTypeArr;
    }

    protected JavaType w() {
        return C;
    }

    protected Class z(String str) {
        return Class.forName(str);
    }

    protected c(r rVar) {
        this.f7131a = rVar == null ? new p(16, HttpStatus.HTTP_OK) : rVar;
        this.f7133c = new d(this);
        this.f7132b = null;
        this.f7134d = null;
    }
}
