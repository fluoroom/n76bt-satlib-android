package ne;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import ne.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends y implements cf.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f22726a;

    public z(Method method) {
        rd.m.e(method, "member");
        this.f22726a = method;
    }

    @Override // cf.r
    public boolean L() {
        return r() != null;
    }

    @Override // ne.y
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public Method Q() {
        return this.f22726a;
    }

    @Override // cf.r
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public e0 g() {
        e0.a aVar = e0.f22688a;
        Type genericReturnType = Q().getGenericReturnType();
        rd.m.d(genericReturnType, "getGenericReturnType(...)");
        return aVar.a(genericReturnType);
    }

    @Override // cf.z
    public List getTypeParameters() {
        TypeVariable<Method>[] typeParameters = Q().getTypeParameters();
        rd.m.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new f0(typeVariable));
        }
        return arrayList;
    }

    @Override // cf.r
    public List i() {
        Type[] genericParameterTypes = Q().getGenericParameterTypes();
        rd.m.d(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = Q().getParameterAnnotations();
        rd.m.d(parameterAnnotations, "getParameterAnnotations(...)");
        return R(genericParameterTypes, parameterAnnotations, Q().isVarArgs());
    }

    @Override // cf.r
    public cf.b r() {
        Object defaultValue = Q().getDefaultValue();
        if (defaultValue != null) {
            return h.f22699b.a(defaultValue, null);
        }
        return null;
    }
}
