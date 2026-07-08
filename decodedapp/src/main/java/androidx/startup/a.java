package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n1.b;
import n1.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f3239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f3240e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f3243c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f3242b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f3241a = new HashMap();

    a(Context context) {
        this.f3243c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object objB;
        if (p1.a.d()) {
            try {
                p1.a.a(cls.getSimpleName());
            } catch (Throwable th2) {
                p1.a.b();
                throw th2;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f3241a.containsKey(cls)) {
            objB = this.f3241a.get(cls);
        } else {
            set.add(cls);
            try {
                n1.a aVar = (n1.a) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = aVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!this.f3241a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objB = aVar.b(this.f3243c);
                set.remove(cls);
                this.f3241a.put(cls, objB);
            } catch (Throwable th3) {
                throw new c(th3);
            }
        }
        p1.a.b();
        return objB;
    }

    public static a e(Context context) {
        if (f3239d == null) {
            synchronized (f3240e) {
                try {
                    if (f3239d == null) {
                        f3239d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f3239d;
    }

    void a(Bundle bundle) {
        String string = this.f3243c.getString(b.f22398a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (n1.a.class.isAssignableFrom(cls)) {
                            this.f3242b.add(cls);
                        }
                    }
                }
                Iterator it = this.f3242b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c(e10);
            }
        }
    }

    void b(Class cls) {
        try {
            try {
                p1.a.a("Startup");
                a(this.f3243c.getPackageManager().getProviderInfo(new ComponentName(this.f3243c, (Class<?>) cls), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new c(e10);
            }
        } finally {
            p1.a.b();
        }
    }

    Object c(Class cls) {
        Object objD;
        synchronized (f3240e) {
            try {
                objD = this.f3241a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objD;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f3242b.contains(cls);
    }
}
