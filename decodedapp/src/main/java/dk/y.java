package dk;

import com.facebook.stetho.server.http.HttpHeaders;
import dk.u;
import eh.c0;
import eh.f0;
import eh.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f11275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f11276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final eh.z f11277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f11278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f11279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final eh.y f11280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final eh.b0 f11281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f11282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f11283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f11284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final u[] f11285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f11286l;

    static final class a {

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final Pattern f11287y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final Pattern f11288z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a0 f11289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f11290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Method f11291c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Annotation[] f11292d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Annotation[][] f11293e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Type[] f11294f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f11295g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f11296h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f11297i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f11298j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f11299k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f11300l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f11301m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f11302n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f11303o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f11304p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f11305q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f11306r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        String f11307s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        eh.y f11308t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        eh.b0 f11309u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Set f11310v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        u[] f11311w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f11312x;

        a(a0 a0Var, Class cls, Method method) {
            this.f11289a = a0Var;
            this.f11290b = cls;
            this.f11291c = method;
            this.f11292d = method.getAnnotations();
            this.f11294f = method.getGenericParameterTypes();
            this.f11293e = method.getParameterAnnotations();
        }

        private static Class a(Class cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private eh.y c(String[] strArr, boolean z10) {
            y.a aVar = new y.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw e0.n(this.f11291c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f11309u = eh.b0.e(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw e0.o(this.f11291c, e10, "Malformed content type: %s", strTrim);
                    }
                } else if (z10) {
                    aVar.e(strSubstring, strTrim);
                } else {
                    aVar.a(strSubstring, strTrim);
                }
            }
            return aVar.f();
        }

        private void d(String str, String str2, boolean z10) {
            String str3 = this.f11303o;
            if (str3 != null) {
                throw e0.n(this.f11291c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f11303o = str;
            this.f11304p = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f11287y.matcher(strSubstring).find()) {
                    throw e0.n(this.f11291c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f11307s = str2;
            this.f11310v = h(str2);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof ek.b) {
                d("DELETE", ((ek.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof ek.f) {
                d("GET", ((ek.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof ek.g) {
                d("HEAD", ((ek.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof ek.n) {
                d("PATCH", ((ek.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof ek.o) {
                d("POST", ((ek.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof ek.p) {
                d("PUT", ((ek.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof ek.m) {
                d("OPTIONS", ((ek.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof ek.h) {
                ek.h hVar = (ek.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof ek.k) {
                ek.k kVar = (ek.k) annotation;
                String[] strArrValue = kVar.value();
                if (strArrValue.length == 0) {
                    throw e0.n(this.f11291c, "@Headers annotation is empty.", new Object[0]);
                }
                this.f11308t = c(strArrValue, kVar.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof ek.l) {
                if (this.f11305q) {
                    throw e0.n(this.f11291c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f11306r = true;
            } else if (annotation instanceof ek.e) {
                if (this.f11306r) {
                    throw e0.n(this.f11291c, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f11305q = true;
            }
        }

        private u f(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            u uVar;
            if (annotationArr != null) {
                uVar = null;
                for (Annotation annotation : annotationArr) {
                    u uVarG = g(i10, type, annotationArr, annotation);
                    if (uVarG != null) {
                        if (uVar != null) {
                            throw e0.p(this.f11291c, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        uVar = uVarG;
                    }
                }
            } else {
                uVar = null;
            }
            if (uVar != null) {
                return uVar;
            }
            if (z10) {
                try {
                    if (e0.h(type) == hd.e.class) {
                        this.f11312x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw e0.p(this.f11291c, i10, "No Retrofit annotation found.", new Object[0]);
        }

        private u g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof ek.y) {
                j(i10, type);
                if (this.f11302n) {
                    throw e0.p(this.f11291c, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f11298j) {
                    throw e0.p(this.f11291c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f11299k) {
                    throw e0.p(this.f11291c, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f11300l) {
                    throw e0.p(this.f11291c, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f11301m) {
                    throw e0.p(this.f11291c, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f11307s != null) {
                    throw e0.p(this.f11291c, i10, "@Url cannot be used with @%s URL", this.f11303o);
                }
                this.f11302n = true;
                if (type == eh.z.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new u.p(this.f11291c, i10);
                }
                throw e0.p(this.f11291c, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof ek.s) {
                j(i10, type);
                if (this.f11299k) {
                    throw e0.p(this.f11291c, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f11300l) {
                    throw e0.p(this.f11291c, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f11301m) {
                    throw e0.p(this.f11291c, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f11302n) {
                    throw e0.p(this.f11291c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f11307s == null) {
                    throw e0.p(this.f11291c, i10, "@Path can only be used with relative url on @%s", this.f11303o);
                }
                this.f11298j = true;
                ek.s sVar = (ek.s) annotation;
                String strValue = sVar.value();
                i(i10, strValue);
                return new u.k(this.f11291c, i10, strValue, this.f11289a.i(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof ek.t) {
                j(i10, type);
                ek.t tVar = (ek.t) annotation;
                String strValue2 = tVar.value();
                boolean zEncoded = tVar.encoded();
                Class clsH = e0.h(type);
                this.f11299k = true;
                if (!Iterable.class.isAssignableFrom(clsH)) {
                    return clsH.isArray() ? new u.l(strValue2, this.f11289a.i(a(clsH.getComponentType()), annotationArr), zEncoded).b() : new u.l(strValue2, this.f11289a.i(type, annotationArr), zEncoded);
                }
                if (type instanceof ParameterizedType) {
                    return new u.l(strValue2, this.f11289a.i(e0.g(0, (ParameterizedType) type), annotationArr), zEncoded).c();
                }
                throw e0.p(this.f11291c, i10, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ek.v) {
                j(i10, type);
                boolean zEncoded2 = ((ek.v) annotation).encoded();
                Class clsH2 = e0.h(type);
                this.f11300l = true;
                if (!Iterable.class.isAssignableFrom(clsH2)) {
                    return clsH2.isArray() ? new u.n(this.f11289a.i(a(clsH2.getComponentType()), annotationArr), zEncoded2).b() : new u.n(this.f11289a.i(type, annotationArr), zEncoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new u.n(this.f11289a.i(e0.g(0, (ParameterizedType) type), annotationArr), zEncoded2).c();
                }
                throw e0.p(this.f11291c, i10, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ek.u) {
                j(i10, type);
                Class clsH3 = e0.h(type);
                this.f11301m = true;
                if (!Map.class.isAssignableFrom(clsH3)) {
                    throw e0.p(this.f11291c, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeI = e0.i(type, clsH3, Map.class);
                if (!(typeI instanceof ParameterizedType)) {
                    throw e0.p(this.f11291c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeI;
                Type typeG = e0.g(0, parameterizedType);
                if (String.class == typeG) {
                    return new u.m(this.f11291c, i10, this.f11289a.i(e0.g(1, parameterizedType), annotationArr), ((ek.u) annotation).encoded());
                }
                throw e0.p(this.f11291c, i10, "@QueryMap keys must be of type String: " + typeG, new Object[0]);
            }
            if (annotation instanceof ek.i) {
                j(i10, type);
                ek.i iVar = (ek.i) annotation;
                String strValue3 = iVar.value();
                Class clsH4 = e0.h(type);
                if (!Iterable.class.isAssignableFrom(clsH4)) {
                    return clsH4.isArray() ? new u.f(strValue3, this.f11289a.i(a(clsH4.getComponentType()), annotationArr), iVar.allowUnsafeNonAsciiValues()).b() : new u.f(strValue3, this.f11289a.i(type, annotationArr), iVar.allowUnsafeNonAsciiValues());
                }
                if (type instanceof ParameterizedType) {
                    return new u.f(strValue3, this.f11289a.i(e0.g(0, (ParameterizedType) type), annotationArr), iVar.allowUnsafeNonAsciiValues()).c();
                }
                throw e0.p(this.f11291c, i10, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ek.j) {
                if (type == eh.y.class) {
                    return new u.h(this.f11291c, i10);
                }
                j(i10, type);
                Class clsH5 = e0.h(type);
                if (!Map.class.isAssignableFrom(clsH5)) {
                    throw e0.p(this.f11291c, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type typeI2 = e0.i(type, clsH5, Map.class);
                if (!(typeI2 instanceof ParameterizedType)) {
                    throw e0.p(this.f11291c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                Type typeG2 = e0.g(0, parameterizedType2);
                if (String.class == typeG2) {
                    return new u.g(this.f11291c, i10, this.f11289a.i(e0.g(1, parameterizedType2), annotationArr), ((ek.j) annotation).allowUnsafeNonAsciiValues());
                }
                throw e0.p(this.f11291c, i10, "@HeaderMap keys must be of type String: " + typeG2, new Object[0]);
            }
            if (annotation instanceof ek.c) {
                j(i10, type);
                if (!this.f11305q) {
                    throw e0.p(this.f11291c, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                ek.c cVar = (ek.c) annotation;
                String strValue4 = cVar.value();
                boolean zEncoded3 = cVar.encoded();
                this.f11295g = true;
                Class clsH6 = e0.h(type);
                if (!Iterable.class.isAssignableFrom(clsH6)) {
                    return clsH6.isArray() ? new u.d(strValue4, this.f11289a.i(a(clsH6.getComponentType()), annotationArr), zEncoded3).b() : new u.d(strValue4, this.f11289a.i(type, annotationArr), zEncoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new u.d(strValue4, this.f11289a.i(e0.g(0, (ParameterizedType) type), annotationArr), zEncoded3).c();
                }
                throw e0.p(this.f11291c, i10, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ek.d) {
                j(i10, type);
                if (!this.f11305q) {
                    throw e0.p(this.f11291c, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class clsH7 = e0.h(type);
                if (!Map.class.isAssignableFrom(clsH7)) {
                    throw e0.p(this.f11291c, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeI3 = e0.i(type, clsH7, Map.class);
                if (!(typeI3 instanceof ParameterizedType)) {
                    throw e0.p(this.f11291c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                Type typeG3 = e0.g(0, parameterizedType3);
                if (String.class == typeG3) {
                    i iVarI = this.f11289a.i(e0.g(1, parameterizedType3), annotationArr);
                    this.f11295g = true;
                    return new u.e(this.f11291c, i10, iVarI, ((ek.d) annotation).encoded());
                }
                throw e0.p(this.f11291c, i10, "@FieldMap keys must be of type String: " + typeG3, new Object[0]);
            }
            if (annotation instanceof ek.q) {
                j(i10, type);
                if (!this.f11306r) {
                    throw e0.p(this.f11291c, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                ek.q qVar = (ek.q) annotation;
                this.f11296h = true;
                String strValue5 = qVar.value();
                Class clsH8 = e0.h(type);
                if (strValue5.isEmpty()) {
                    if (!Iterable.class.isAssignableFrom(clsH8)) {
                        if (clsH8.isArray()) {
                            if (c0.c.class.isAssignableFrom(clsH8.getComponentType())) {
                                return u.o.f11253a.b();
                            }
                            throw e0.p(this.f11291c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        if (c0.c.class.isAssignableFrom(clsH8)) {
                            return u.o.f11253a;
                        }
                        throw e0.p(this.f11291c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (type instanceof ParameterizedType) {
                        if (c0.c.class.isAssignableFrom(e0.h(e0.g(0, (ParameterizedType) type)))) {
                            return u.o.f11253a.c();
                        }
                        throw e0.p(this.f11291c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    throw e0.p(this.f11291c, i10, clsH8.getSimpleName() + " must include generic type (e.g., " + clsH8.getSimpleName() + "<String>)", new Object[0]);
                }
                eh.y yVarF = eh.y.f("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                if (!Iterable.class.isAssignableFrom(clsH8)) {
                    if (!clsH8.isArray()) {
                        if (c0.c.class.isAssignableFrom(clsH8)) {
                            throw e0.p(this.f11291c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        return new u.i(this.f11291c, i10, yVarF, this.f11289a.g(type, annotationArr, this.f11292d));
                    }
                    Class clsA = a(clsH8.getComponentType());
                    if (c0.c.class.isAssignableFrom(clsA)) {
                        throw e0.p(this.f11291c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new u.i(this.f11291c, i10, yVarF, this.f11289a.g(clsA, annotationArr, this.f11292d)).b();
                }
                if (type instanceof ParameterizedType) {
                    Type typeG4 = e0.g(0, (ParameterizedType) type);
                    if (c0.c.class.isAssignableFrom(e0.h(typeG4))) {
                        throw e0.p(this.f11291c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new u.i(this.f11291c, i10, yVarF, this.f11289a.g(typeG4, annotationArr, this.f11292d)).c();
                }
                throw e0.p(this.f11291c, i10, clsH8.getSimpleName() + " must include generic type (e.g., " + clsH8.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ek.r) {
                j(i10, type);
                if (!this.f11306r) {
                    throw e0.p(this.f11291c, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.f11296h = true;
                Class clsH9 = e0.h(type);
                if (!Map.class.isAssignableFrom(clsH9)) {
                    throw e0.p(this.f11291c, i10, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type typeI4 = e0.i(type, clsH9, Map.class);
                if (!(typeI4 instanceof ParameterizedType)) {
                    throw e0.p(this.f11291c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                Type typeG5 = e0.g(0, parameterizedType4);
                if (String.class == typeG5) {
                    Type typeG6 = e0.g(1, parameterizedType4);
                    if (c0.c.class.isAssignableFrom(e0.h(typeG6))) {
                        throw e0.p(this.f11291c, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new u.j(this.f11291c, i10, this.f11289a.g(typeG6, annotationArr, this.f11292d), ((ek.r) annotation).encoding());
                }
                throw e0.p(this.f11291c, i10, "@PartMap keys must be of type String: " + typeG5, new Object[0]);
            }
            if (annotation instanceof ek.a) {
                j(i10, type);
                if (this.f11305q || this.f11306r) {
                    throw e0.p(this.f11291c, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.f11297i) {
                    throw e0.p(this.f11291c, i10, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    i iVarG = this.f11289a.g(type, annotationArr, this.f11292d);
                    this.f11297i = true;
                    return new u.c(this.f11291c, i10, iVarG);
                } catch (RuntimeException e10) {
                    throw e0.q(this.f11291c, e10, i10, "Unable to create @Body converter for %s", type);
                }
            }
            if (!(annotation instanceof ek.x)) {
                return null;
            }
            j(i10, type);
            Class clsA2 = a(e0.h(type));
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                u uVar = this.f11311w[i11];
                if ((uVar instanceof u.q) && ((u.q) uVar).f11256a.equals(clsA2)) {
                    throw e0.p(this.f11291c, i10, "@Tag type " + clsA2.getName() + " is duplicate of " + v.f11258b.a(this.f11291c, i11) + " and would always overwrite its value.", new Object[0]);
                }
            }
            return new u.q(clsA2);
        }

        static Set h(String str) {
            Matcher matcher = f11287y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i10, String str) {
            if (!f11288z.matcher(str).matches()) {
                throw e0.p(this.f11291c, i10, "@Path parameter name must match %s. Found: %s", f11287y.pattern(), str);
            }
            if (!this.f11310v.contains(str)) {
                throw e0.p(this.f11291c, i10, "URL \"%s\" does not contain \"{%s}\".", this.f11307s, str);
            }
        }

        private void j(int i10, Type type) {
            if (e0.j(type)) {
                throw e0.p(this.f11291c, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        y b() {
            for (Annotation annotation : this.f11292d) {
                e(annotation);
            }
            if (this.f11303o == null) {
                throw e0.n(this.f11291c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f11304p) {
                if (this.f11306r) {
                    throw e0.n(this.f11291c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f11305q) {
                    throw e0.n(this.f11291c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f11293e.length;
            this.f11311w = new u[length];
            int i10 = length - 1;
            int i11 = 0;
            while (true) {
                boolean z10 = true;
                if (i11 >= length) {
                    break;
                }
                u[] uVarArr = this.f11311w;
                Type type = this.f11294f[i11];
                Annotation[] annotationArr = this.f11293e[i11];
                if (i11 != i10) {
                    z10 = false;
                }
                uVarArr[i11] = f(i11, type, annotationArr, z10);
                i11++;
            }
            if (this.f11307s == null && !this.f11302n) {
                throw e0.n(this.f11291c, "Missing either @%s URL or @Url parameter.", this.f11303o);
            }
            boolean z11 = this.f11305q;
            if (!z11 && !this.f11306r && !this.f11304p && this.f11297i) {
                throw e0.n(this.f11291c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z11 && !this.f11295g) {
                throw e0.n(this.f11291c, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f11306r || this.f11296h) {
                return new y(this);
            }
            throw e0.n(this.f11291c, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    y(a aVar) {
        this.f11275a = aVar.f11290b;
        this.f11276b = aVar.f11291c;
        this.f11277c = aVar.f11289a.f11113c;
        this.f11278d = aVar.f11303o;
        this.f11279e = aVar.f11307s;
        this.f11280f = aVar.f11308t;
        this.f11281g = aVar.f11309u;
        this.f11282h = aVar.f11304p;
        this.f11283i = aVar.f11305q;
        this.f11284j = aVar.f11306r;
        this.f11285k = aVar.f11311w;
        this.f11286l = aVar.f11312x;
    }

    static y b(a0 a0Var, Class cls, Method method) {
        return new a(a0Var, cls, method).b();
    }

    f0 a(Object obj, Object[] objArr) {
        u[] uVarArr = this.f11285k;
        int length = objArr.length;
        if (length != uVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + uVarArr.length + ")");
        }
        x xVar = new x(this.f11278d, this.f11277c, this.f11279e, this.f11280f, this.f11281g, this.f11282h, this.f11283i, this.f11284j);
        if (this.f11286l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            uVarArr[i10].a(xVar, objArr[i10]);
        }
        return xVar.k().p(q.class, new q(this.f11275a, obj, this.f11276b, arrayList)).a();
    }
}
