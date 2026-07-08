package ne;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f22678a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f22679b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f22680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f22681b;

        public a(Method method, Method method2) {
            this.f22680a = method;
            this.f22681b = method2;
        }

        public final Method a() {
            return this.f22681b;
        }

        public final Method b() {
            return this.f22680a;
        }
    }

    private c() {
    }

    public final a a(Member member) {
        rd.m.e(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", null), f.j(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    public final List b(Member member) throws IllegalAccessException, InvocationTargetException {
        Method methodA;
        rd.m.e(member, "member");
        a aVarA = f22679b;
        if (aVarA == null) {
            synchronized (this) {
                aVarA = f22679b;
                if (aVarA == null) {
                    aVarA = f22678a.a(member);
                    f22679b = aVarA;
                }
            }
        }
        Method methodB = aVarA.b();
        if (methodB == null || (methodA = aVarA.a()) == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(member, null);
        rd.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodA.invoke(obj, null);
            rd.m.c(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
