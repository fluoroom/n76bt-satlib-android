package jd;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f18642a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f18643b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f18644c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f18645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f18646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f18647c;

        public a(Method method, Method method2, Method method3) {
            this.f18645a = method;
            this.f18646b = method2;
            this.f18647c = method3;
        }
    }

    private i() {
    }

    private final a a(jd.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f18644c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f18643b;
            f18644c = aVar3;
            return aVar3;
        }
    }

    public final String b(jd.a aVar) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        rd.m.e(aVar, "continuation");
        a aVarA = f18644c;
        if (aVarA == null) {
            aVarA = a(aVar);
        }
        if (aVarA != f18643b && (method = aVarA.f18645a) != null && (objInvoke = method.invoke(aVar.getClass(), null)) != null && (method2 = aVarA.f18646b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarA.f18647c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
