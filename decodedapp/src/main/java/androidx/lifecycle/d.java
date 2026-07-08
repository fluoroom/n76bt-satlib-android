package androidx.lifecycle;

import androidx.lifecycle.m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static d f2607c = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f2608a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f2609b = new HashMap();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f2610a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f2611b;

        a(Map map) {
            this.f2611b = map;
            for (Map.Entry entry : map.entrySet()) {
                m.a aVar = (m.a) entry.getValue();
                List arrayList = (List) this.f2610a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f2610a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        private static void b(List list, t tVar, m.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(tVar, aVar, obj);
                }
            }
        }

        void a(t tVar, m.a aVar, Object obj) {
            b((List) this.f2610a.get(aVar), tVar, aVar, obj);
            b((List) this.f2610a.get(m.a.ON_ANY), tVar, aVar, obj);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f2612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f2613b;

        b(int i10, Method method) {
            this.f2612a = i10;
            this.f2613b = method;
            method.setAccessible(true);
        }

        void a(t tVar, m.a aVar, Object obj) {
            try {
                int i10 = this.f2612a;
                if (i10 == 0) {
                    this.f2613b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f2613b.invoke(obj, tVar);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f2613b.invoke(obj, tVar, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2612a == bVar.f2612a && this.f2613b.getName().equals(bVar.f2613b.getName());
        }

        public int hashCode() {
            return (this.f2612a * 31) + this.f2613b.getName().hashCode();
        }
    }

    d() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i10;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f2611b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f2611b.entrySet()) {
                e(map, (b) entry.getKey(), (m.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            d0 d0Var = (d0) method.getAnnotation(d0.class);
            if (d0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!t.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                m.a aVarValue = d0Var.value();
                if (parameterTypes.length > 1) {
                    if (!m.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != m.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i10, method), aVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f2608a.put(cls, aVar);
        this.f2609b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map map, b bVar, m.a aVar, Class cls) {
        m.a aVar2 = (m.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f2613b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class cls) {
        a aVar = (a) this.f2608a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.f2609b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((d0) method.getAnnotation(d0.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f2609b.put(cls, Boolean.FALSE);
        return false;
    }
}
