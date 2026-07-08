package me;

import ee.o;
import ef.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f21963a = new c();

    private c() {
    }

    private final sf.f a(Class cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
            rd.m.d(cls, "getComponentType(...)");
        }
        if (cls.isPrimitive()) {
            if (rd.m.a(cls, Void.TYPE)) {
                return new sf.f(mf.b.f21989d.c(o.a.f11871f.m()), i10);
            }
            ee.l lVarH = vf.e.e(cls.getName()).h();
            rd.m.d(lVarH, "getPrimitiveType(...)");
            return i10 > 0 ? new sf.f(mf.b.f21989d.c(lVarH.g()), i10 - 1) : new sf.f(mf.b.f21989d.c(lVarH.i()), i10);
        }
        mf.b bVarE = ne.f.e(cls);
        mf.b bVarM = ge.c.f13796a.m(bVarE.a());
        if (bVarM != null) {
            bVarE = bVarM;
        }
        return new sf.f(bVarE, i10);
    }

    private final void c(Class cls, x.d dVar) throws InvocationTargetException {
        Iterator itA = rd.c.a(cls.getDeclaredConstructors());
        while (itA.hasNext()) {
            Constructor constructor = (Constructor) itA.next();
            mf.f fVar = mf.h.f22019j;
            m mVar = m.f21980a;
            rd.m.b(constructor);
            x.e eVarA = dVar.a(fVar, mVar.a(constructor));
            if (eVarA != null) {
                Iterator itA2 = rd.c.a(constructor.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    rd.m.b(annotation);
                    f(eVarA, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                rd.m.b(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length2 = parameterAnnotations.length;
                    for (int i10 = 0; i10 < length2; i10++) {
                        Iterator itA3 = rd.c.a(parameterAnnotations[i10]);
                        while (itA3.hasNext()) {
                            Annotation annotation2 = (Annotation) itA3.next();
                            Class clsB = pd.a.b(pd.a.a(annotation2));
                            mf.b bVarE = ne.f.e(clsB);
                            rd.m.b(annotation2);
                            x.a aVarB = eVarA.b(i10 + length, bVarE, new b(annotation2));
                            if (aVarB != null) {
                                f21963a.h(aVarB, annotation2, clsB);
                            }
                        }
                    }
                }
                eVarA.a();
            }
        }
    }

    private final void d(Class cls, x.d dVar) throws InvocationTargetException {
        Iterator itA = rd.c.a(cls.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            mf.f fVarH = mf.f.h(field.getName());
            rd.m.d(fVarH, "identifier(...)");
            m mVar = m.f21980a;
            rd.m.b(field);
            x.c cVarB = dVar.b(fVarH, mVar.b(field), null);
            if (cVarB != null) {
                Iterator itA2 = rd.c.a(field.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    rd.m.b(annotation);
                    f(cVarB, annotation);
                }
                cVarB.a();
            }
        }
    }

    private final void e(Class cls, x.d dVar) throws InvocationTargetException {
        Iterator itA = rd.c.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            mf.f fVarH = mf.f.h(method.getName());
            rd.m.d(fVarH, "identifier(...)");
            m mVar = m.f21980a;
            rd.m.b(method);
            x.e eVarA = dVar.a(fVarH, mVar.c(method));
            if (eVarA != null) {
                Iterator itA2 = rd.c.a(method.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    rd.m.b(annotation);
                    f(eVarA, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                rd.m.d(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Iterator itA3 = rd.c.a(annotationArr[i10]);
                    while (itA3.hasNext()) {
                        Annotation annotation2 = (Annotation) itA3.next();
                        Class clsB = pd.a.b(pd.a.a(annotation2));
                        mf.b bVarE = ne.f.e(clsB);
                        rd.m.b(annotation2);
                        x.a aVarB = eVarA.b(i10, bVarE, new b(annotation2));
                        if (aVarB != null) {
                            f21963a.h(aVarB, annotation2, clsB);
                        }
                    }
                }
                eVarA.a();
            }
        }
    }

    private final void f(x.c cVar, Annotation annotation) throws InvocationTargetException {
        Class clsB = pd.a.b(pd.a.a(annotation));
        x.a aVarC = cVar.c(ne.f.e(clsB), new b(annotation));
        if (aVarC != null) {
            f21963a.h(aVarC, annotation, clsB);
        }
    }

    private final void g(x.a aVar, mf.f fVar, Object obj) throws InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (rd.m.a(enclosingClass, Class.class)) {
            rd.m.c(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.f(fVar, a((Class) obj));
            return;
        }
        if (i.f21973a.contains(enclosingClass)) {
            aVar.c(fVar, obj);
            return;
        }
        if (ne.f.l(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            rd.m.b(enclosingClass);
            mf.b bVarE = ne.f.e(enclosingClass);
            rd.m.c(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            mf.f fVarH = mf.f.h(((Enum) obj).name());
            rd.m.d(fVarH, "identifier(...)");
            aVar.d(fVar, bVarE, fVarH);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            rd.m.d(interfaces, "getInterfaces(...)");
            Class cls = (Class) ed.j.X(interfaces);
            rd.m.b(cls);
            x.a aVarE = aVar.e(fVar, ne.f.e(cls));
            if (aVarE == null) {
                return;
            }
            rd.m.c(obj, "null cannot be cast to non-null type kotlin.Annotation");
            h(aVarE, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        x.b bVarB = aVar.b(fVar);
        if (bVarB == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i10 = 0;
        if (componentType.isEnum()) {
            rd.m.b(componentType);
            mf.b bVarE2 = ne.f.e(componentType);
            rd.m.c(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i10 < length) {
                Object obj2 = objArr[i10];
                rd.m.c(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                mf.f fVarH2 = mf.f.h(((Enum) obj2).name());
                rd.m.d(fVarH2, "identifier(...)");
                bVarB.d(bVarE2, fVarH2);
                i10++;
            }
        } else if (rd.m.a(componentType, Class.class)) {
            rd.m.c(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i10 < length2) {
                Object obj3 = objArr2[i10];
                rd.m.c(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                bVarB.e(a((Class) obj3));
                i10++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            rd.m.c(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i10 < length3) {
                Object obj4 = objArr3[i10];
                rd.m.b(componentType);
                x.a aVarB = bVarB.b(ne.f.e(componentType));
                if (aVarB != null) {
                    rd.m.c(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    h(aVarB, (Annotation) obj4, componentType);
                }
                i10++;
            }
        } else {
            rd.m.c(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i10 < length4) {
                bVarB.c(objArr4[i10]);
                i10++;
            }
        }
        bVarB.a();
    }

    private final void h(x.a aVar, Annotation annotation, Class cls) throws InvocationTargetException {
        Iterator itA = rd.c.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                rd.m.b(objInvoke);
                mf.f fVarH = mf.f.h(method.getName());
                rd.m.d(fVarH, "identifier(...)");
                g(aVar, fVarH, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void b(Class cls, x.c cVar) {
        rd.m.e(cls, "klass");
        rd.m.e(cVar, "visitor");
        Iterator itA = rd.c.a(cls.getDeclaredAnnotations());
        while (itA.hasNext()) {
            Annotation annotation = (Annotation) itA.next();
            rd.m.b(annotation);
            f(cVar, annotation);
        }
        cVar.a();
    }

    public final void i(Class cls, x.d dVar) {
        rd.m.e(cls, "klass");
        rd.m.e(dVar, "memberVisitor");
        e(cls, dVar);
        c(cls, dVar);
        d(cls, dVar);
    }
}
