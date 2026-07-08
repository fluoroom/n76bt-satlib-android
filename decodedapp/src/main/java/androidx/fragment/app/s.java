package androidx.fragment.app;

import androidx.fragment.app.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.collection.i f2449a = new androidx.collection.i();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return o.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        androidx.collection.i iVar = f2449a;
        androidx.collection.i iVar2 = (androidx.collection.i) iVar.get(classLoader);
        if (iVar2 == null) {
            iVar2 = new androidx.collection.i();
            iVar.put(classLoader, iVar2);
        }
        Class cls = (Class) iVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        iVar2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new o.k("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new o.k("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    public abstract o a(ClassLoader classLoader, String str);
}
