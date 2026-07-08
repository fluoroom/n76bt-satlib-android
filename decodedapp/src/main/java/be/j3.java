package be;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(Class cls) {
        rd.m.b(cls);
        return ne.f.f(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        rd.m.d(parameterTypes, "getParameterTypes(...)");
        sb2.append(ed.j.S(parameterTypes, "", "(", ")", 0, null, i3.f3896a, 24, null));
        Class<?> returnType = method.getReturnType();
        rd.m.d(returnType, "getReturnType(...)");
        sb2.append(ne.f.f(returnType));
        return sb2.toString();
    }
}
