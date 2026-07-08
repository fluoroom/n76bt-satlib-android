package mi;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class p {

    /* JADX INFO: renamed from: d */
    private static final Map f22345d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    private static final a[] f22346e = new a[4];

    /* JADX INFO: renamed from: a */
    private List f22347a;

    /* JADX INFO: renamed from: b */
    private final boolean f22348b;

    /* JADX INFO: renamed from: c */
    private final boolean f22349c;

    static class a {

        /* JADX INFO: renamed from: a */
        final List f22350a = new ArrayList();

        /* JADX INFO: renamed from: b */
        final Map f22351b = new HashMap();

        /* JADX INFO: renamed from: c */
        final Map f22352c = new HashMap();

        /* JADX INFO: renamed from: d */
        final StringBuilder f22353d = new StringBuilder(128);

        /* JADX INFO: renamed from: e */
        Class f22354e;

        /* JADX INFO: renamed from: f */
        Class f22355f;

        /* JADX INFO: renamed from: g */
        boolean f22356g;

        a() {
        }

        private boolean b(Method method, Class cls) {
            this.f22353d.setLength(0);
            this.f22353d.append(method.getName());
            StringBuilder sb2 = this.f22353d;
            sb2.append('>');
            sb2.append(cls.getName());
            String string = this.f22353d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class cls2 = (Class) this.f22352c.put(string, declaringClass);
            if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f22352c.put(string, cls2);
            return false;
        }

        boolean a(Method method, Class cls) {
            Object objPut = this.f22351b.put(cls, method);
            if (objPut == null) {
                return true;
            }
            if (objPut instanceof Method) {
                if (!b((Method) objPut, cls)) {
                    throw new IllegalStateException();
                }
                this.f22351b.put(cls, this);
            }
            return b(method, cls);
        }

        void c(Class cls) {
            this.f22355f = cls;
            this.f22354e = cls;
            this.f22356g = false;
        }

        void d() {
            if (this.f22356g) {
                this.f22355f = null;
                return;
            }
            Class superclass = this.f22355f.getSuperclass();
            this.f22355f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.f22355f = null;
            }
        }

        void e() {
            this.f22350a.clear();
            this.f22351b.clear();
            this.f22352c.clear();
            this.f22353d.setLength(0);
            this.f22354e = null;
            this.f22355f = null;
            this.f22356g = false;
        }
    }

    p(List list, boolean z10, boolean z11) {
        this.f22347a = list;
        this.f22348b = z10;
        this.f22349c = z11;
    }

    private List b(Class cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f22355f != null) {
            f(aVarG);
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    private List c(Class cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f22355f != null) {
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    private void d(a aVar) {
        Method[] methods;
        try {
            try {
                methods = aVar.f22355f.getDeclaredMethods();
            } catch (LinkageError e10) {
                String str = "Could not inspect methods of " + aVar.f22355f.getName();
                throw new e(this.f22349c ? str + ". Please consider using EventBus annotation processor to avoid reflection." : str + ". Please make this class visible to EventBus annotation processor to avoid reflection.", e10);
            }
        } catch (Throwable unused) {
            methods = aVar.f22355f.getMethods();
            aVar.f22356g = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    m mVar = (m) method.getAnnotation(m.class);
                    if (mVar != null) {
                        Class<?> cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.f22350a.add(new o(method, cls, mVar.threadMode(), mVar.priority(), mVar.sticky()));
                        }
                    }
                } else if (this.f22348b && method.isAnnotationPresent(m.class)) {
                    throw new e("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.f22348b && method.isAnnotationPresent(m.class)) {
                throw new e((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    private List e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f22350a);
        aVar.e();
        synchronized (f22346e) {
            int i10 = 0;
            while (true) {
                if (i10 >= 4) {
                    break;
                }
                try {
                    a[] aVarArr = f22346e;
                    if (aVarArr[i10] == null) {
                        aVarArr[i10] = aVar;
                        break;
                    }
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    private oi.a f(a aVar) {
        aVar.getClass();
        List list = this.f22347a;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        return null;
    }

    private a g() {
        synchronized (f22346e) {
            for (int i10 = 0; i10 < 4; i10++) {
                try {
                    a[] aVarArr = f22346e;
                    a aVar = aVarArr[i10];
                    if (aVar != null) {
                        aVarArr[i10] = null;
                        return aVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new a();
        }
    }

    List a(Class cls) {
        Map map = f22345d;
        List list = (List) map.get(cls);
        if (list != null) {
            return list;
        }
        List listC = this.f22349c ? c(cls) : b(cls);
        if (!listC.isEmpty()) {
            map.put(cls, listC);
            return listC;
        }
        throw new e("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}
