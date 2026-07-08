package x6;

import com.fasterxml.jackson.databind.JavaType;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import x6.j0;

/* JADX INFO: loaded from: classes.dex */
abstract class c0 {
    static com.fasterxml.jackson.databind.type.b a(Method method, JavaType javaType, j0 j0Var) {
        JavaType javaTypeK;
        TypeVariable typeVariableB;
        TypeVariable<Method>[] typeParameters = method.getTypeParameters();
        if (typeParameters.length == 0 || javaType.j().p()) {
            return null;
        }
        Type genericReturnType = method.getGenericReturnType();
        if (!(genericReturnType instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
        if (!Objects.equals(javaType.r(), parameterizedType.getRawType())) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        ArrayList arrayList2 = new ArrayList(typeParameters.length);
        for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
            TypeVariable typeVariableD = d(actualTypeArguments[i10]);
            if (typeVariableD != null) {
                String name = typeVariableD.getName();
                if (name == null || (javaTypeK = javaType.j().k(i10)) == null || (typeVariableB = b(typeParameters, name)) == null) {
                    return null;
                }
                if (g(j0Var, javaTypeK, typeVariableB.getBounds())) {
                    int iIndexOf = arrayList.indexOf(name);
                    if (iIndexOf != -1) {
                        JavaType javaType2 = (JavaType) arrayList2.get(iIndexOf);
                        if (javaTypeK.equals(javaType2)) {
                            continue;
                        } else {
                            boolean Z = javaType2.Z(javaTypeK.r());
                            boolean Z2 = javaTypeK.Z(javaType2.r());
                            if (!Z && !Z2) {
                                return null;
                            }
                            if ((Z ^ Z2) && Z2) {
                                arrayList2.set(iIndexOf, javaTypeK);
                            }
                        }
                    } else {
                        arrayList.add(name);
                        arrayList2.add(javaTypeK);
                    }
                } else {
                    continue;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return com.fasterxml.jackson.databind.type.b.f(arrayList, arrayList2);
    }

    private static TypeVariable b(TypeVariable[] typeVariableArr, String str) {
        if (typeVariableArr != null && str != null) {
            for (TypeVariable typeVariable : typeVariableArr) {
                if (str.equals(typeVariable.getName())) {
                    return typeVariable;
                }
            }
        }
        return null;
    }

    private static ParameterizedType c(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return c(upperBounds[0]);
            }
        }
        return null;
    }

    private static TypeVariable d(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return d(upperBounds[0]);
            }
        }
        return null;
    }

    public static j0 e(Method method, JavaType javaType, com.fasterxml.jackson.databind.type.c cVar, j0 j0Var) {
        com.fasterxml.jackson.databind.type.b bVarA = a(method, javaType, j0Var);
        return bVarA == null ? j0Var : new j0.a(cVar, bVarA);
    }

    private static boolean f(j0 j0Var, JavaType javaType, Type type) {
        if (!javaType.Z(j0Var.a(type).r())) {
            return false;
        }
        ParameterizedType parameterizedTypeC = c(type);
        if (parameterizedTypeC == null || !Objects.equals(javaType.r(), parameterizedTypeC.getRawType())) {
            return true;
        }
        Type[] actualTypeArguments = parameterizedTypeC.getActualTypeArguments();
        com.fasterxml.jackson.databind.type.b bVarJ = javaType.j();
        if (bVarJ.q() != actualTypeArguments.length) {
            return false;
        }
        for (int i10 = 0; i10 < bVarJ.q(); i10++) {
            if (!f(j0Var, bVarJ.k(i10), actualTypeArguments[i10])) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(j0 j0Var, JavaType javaType, Type[] typeArr) {
        for (Type type : typeArr) {
            if (!f(j0Var, javaType, type)) {
                return false;
            }
        }
        return true;
    }
}
