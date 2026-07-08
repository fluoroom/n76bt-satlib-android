package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f2708a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f2709b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f2710c = new HashMap();

    private y() {
    }

    private final j a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            rd.m.b(objNewInstance);
            android.support.v4.media.session.b.a(objNewInstance);
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Constructor b(Class cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            rd.m.b(name);
            if (name.length() != 0) {
                rd.m.b(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                rd.m.d(canonicalName, "substring(...)");
            }
            rd.m.b(canonicalName);
            String strC = c(canonicalName);
            if (name.length() != 0) {
                strC = name + '.' + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            rd.m.c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String str) {
        rd.m.e(str, "className");
        return rg.q.F(str, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class cls) {
        Map map = f2709b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class cls) {
        return cls != null && s.class.isAssignableFrom(cls);
    }

    public static final q f(Object obj) {
        rd.m.e(obj, "object");
        boolean z10 = obj instanceof q;
        boolean z11 = obj instanceof g;
        if (z10 && z11) {
            return new h((g) obj, (q) obj);
        }
        if (z11) {
            return new h((g) obj, null);
        }
        if (z10) {
            return (q) obj;
        }
        Class<?> cls = obj.getClass();
        y yVar = f2708a;
        if (yVar.d(cls) != 2) {
            return new g0(obj);
        }
        Object obj2 = f2710c.get(cls);
        rd.m.b(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            yVar.a((Constructor) list.get(0), obj);
            return new r0(null);
        }
        int size = list.size();
        j[] jVarArr = new j[size];
        for (int i10 = 0; i10 < size; i10++) {
            f2708a.a((Constructor) list.get(i10), obj);
            jVarArr[i10] = null;
        }
        return new e(jVarArr);
    }

    private final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f2710c.put(cls, ed.q.e(constructorB));
            return 2;
        }
        if (d.f2607c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            rd.m.b(superclass);
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f2710c.get(superclass);
            rd.m.b(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Iterator itA = rd.c.a(cls.getInterfaces());
        while (itA.hasNext()) {
            Class cls2 = (Class) itA.next();
            if (e(cls2)) {
                rd.m.b(cls2);
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f2710c.get(cls2);
                rd.m.b(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f2710c.put(cls, arrayList);
        return 2;
    }
}
