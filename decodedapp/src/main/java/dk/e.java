package dk;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public interface e {

    public static abstract class a {
        protected static Type b(int i10, ParameterizedType parameterizedType) {
            return e0.g(i10, parameterizedType);
        }

        protected static Class c(Type type) {
            return e0.h(type);
        }

        public abstract e a(Type type, Annotation[] annotationArr, a0 a0Var);
    }

    Type a();

    Object b(d dVar);
}
