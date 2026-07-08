package ne;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends y implements cf.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Constructor f22722a;

    public t(Constructor constructor) {
        rd.m.e(constructor, "member");
        this.f22722a = constructor;
    }

    @Override // ne.y
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public Constructor Q() {
        return this.f22722a;
    }

    @Override // cf.z
    public List getTypeParameters() {
        TypeVariable[] typeParameters = Q().getTypeParameters();
        rd.m.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new f0(typeVariable));
        }
        return arrayList;
    }

    @Override // cf.k
    public List i() {
        Type[] genericParameterTypes = Q().getGenericParameterTypes();
        rd.m.b(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return ed.q.k();
        }
        Class declaringClass = Q().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) ed.j.p(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = Q().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + Q());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            rd.m.b(parameterAnnotations);
            parameterAnnotations = (Annotation[][]) ed.j.p(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        rd.m.b(genericParameterTypes);
        rd.m.b(parameterAnnotations);
        return R(genericParameterTypes, parameterAnnotations, Q().isVarArgs());
    }
}
