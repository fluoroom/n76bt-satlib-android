package x6;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import x6.j0;
import x6.v;

/* JADX INFO: loaded from: classes.dex */
public class m extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v.a f31778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f31779e;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0 f31780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f31781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public q f31782c;

        public a(j0 j0Var, Method method, q qVar) {
            this.f31780a = j0Var;
            this.f31781b = method;
            this.f31782c = qVar;
        }

        public l a() {
            Method method = this.f31781b;
            if (method == null) {
                return null;
            }
            return new l(this.f31780a, method, this.f31782c.b(), null);
        }
    }

    m(p6.b bVar, v.a aVar, boolean z10) {
        super(bVar);
        this.f31778d = bVar == null ? null : aVar;
        this.f31779e = z10;
    }

    private void i(j0 j0Var, Class cls, Map map, Class cls2) {
        if (cls2 != null) {
            j(j0Var, cls, map, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : i7.h.z(cls)) {
            if (k(method)) {
                b0 b0Var = new b0(method);
                a aVar = (a) map.get(b0Var);
                if (aVar == null) {
                    map.put(b0Var, new a(j0Var, method, this.f31821a == null ? q.e() : e(method.getDeclaredAnnotations())));
                } else {
                    if (this.f31779e) {
                        aVar.f31782c = f(aVar.f31782c, method.getDeclaredAnnotations());
                    }
                    Method method2 = aVar.f31781b;
                    if (method2 == null) {
                        aVar.f31781b = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        aVar.f31781b = method;
                        aVar.f31780a = j0Var;
                    }
                }
            }
        }
    }

    private static boolean k(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || g.a(method) > 2) ? false : true;
    }

    public static n m(p6.b bVar, j0 j0Var, v.a aVar, com.fasterxml.jackson.databind.type.c cVar, JavaType javaType, List list, Class cls, boolean z10) {
        return new m(bVar, aVar, z10).l(cVar, j0Var, javaType, list, cls);
    }

    protected void j(j0 j0Var, Class cls, Map map, Class cls2) {
        if (this.f31821a == null) {
            return;
        }
        Iterator it = i7.h.w(cls2, cls, true).iterator();
        while (it.hasNext()) {
            for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                if (k(method)) {
                    b0 b0Var = new b0(method);
                    a aVar = (a) map.get(b0Var);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (aVar == null) {
                        map.put(b0Var, new a(j0Var, null, e(declaredAnnotations)));
                    } else {
                        aVar.f31782c = f(aVar.f31782c, declaredAnnotations);
                    }
                }
            }
        }
    }

    n l(com.fasterxml.jackson.databind.type.c cVar, j0 j0Var, JavaType javaType, List list, Class cls) {
        Class clsA;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i(j0Var, javaType.r(), linkedHashMap, cls);
        Iterator it = list.iterator();
        while (true) {
            Class clsA2 = null;
            if (!it.hasNext()) {
                break;
            }
            JavaType javaType2 = (JavaType) it.next();
            v.a aVar = this.f31778d;
            if (aVar != null) {
                clsA2 = aVar.a(javaType2.r());
            }
            i(new j0.a(cVar, javaType2.j()), javaType2.r(), linkedHashMap, clsA2);
        }
        v.a aVar2 = this.f31778d;
        if (aVar2 != null && (clsA = aVar2.a(Object.class)) != null) {
            j(j0Var, javaType.r(), linkedHashMap, clsA);
            if (this.f31821a != null && !linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    b0 b0Var = (b0) entry.getKey();
                    if ("hashCode".equals(b0Var.b()) && b0Var.a() == 0) {
                        try {
                            Method declaredMethod = Object.class.getDeclaredMethod(b0Var.b(), null);
                            if (declaredMethod != null) {
                                a aVar3 = (a) entry.getValue();
                                aVar3.f31782c = f(aVar3.f31782c, declaredMethod.getDeclaredAnnotations());
                                aVar3.f31781b = declaredMethod;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new n();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            l lVarA = ((a) entry2.getValue()).a();
            if (lVarA != null) {
                linkedHashMap2.put(entry2.getKey(), lVarA);
            }
        }
        return new n(linkedHashMap2);
    }
}
