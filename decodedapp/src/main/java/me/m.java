package me;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f21980a = new m();

    private m() {
    }

    public final String a(Constructor constructor) {
        rd.m.e(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator itA = rd.c.a(constructor.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            rd.m.b(cls);
            sb2.append(ne.f.f(cls));
        }
        sb2.append(")V");
        String string = sb2.toString();
        rd.m.d(string, "toString(...)");
        return string;
    }

    public final String b(Field field) {
        rd.m.e(field, "field");
        Class<?> type = field.getType();
        rd.m.d(type, "getType(...)");
        return ne.f.f(type);
    }

    public final String c(Method method) {
        rd.m.e(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator itA = rd.c.a(method.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            rd.m.b(cls);
            sb2.append(ne.f.f(cls));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        rd.m.d(returnType, "getReturnType(...)");
        sb2.append(ne.f.f(returnType));
        String string = sb2.toString();
        rd.m.d(string, "toString(...)");
        return string;
    }
}
