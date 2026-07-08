package be;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap f3802a = new ConcurrentHashMap();

    public static final me.k a(Class cls) {
        rd.m.e(cls, "<this>");
        ClassLoader classLoaderJ = ne.f.j(cls);
        m3 m3Var = new m3(classLoaderJ);
        ConcurrentMap concurrentMap = f3802a;
        WeakReference weakReference = (WeakReference) concurrentMap.get(m3Var);
        if (weakReference != null) {
            me.k kVar = (me.k) weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(m3Var, weakReference);
        }
        me.k kVarA = me.k.f21975c.a(classLoaderJ);
        while (true) {
            try {
                ConcurrentMap concurrentMap2 = f3802a;
                WeakReference weakReference2 = (WeakReference) concurrentMap2.putIfAbsent(m3Var, new WeakReference(kVarA));
                if (weakReference2 == null) {
                    return kVarA;
                }
                me.k kVar2 = (me.k) weakReference2.get();
                if (kVar2 != null) {
                    return kVar2;
                }
                concurrentMap2.remove(m3Var, weakReference2);
            } finally {
                m3Var.a(null);
            }
        }
    }
}
