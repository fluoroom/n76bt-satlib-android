package dk;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public interface i {

    public static abstract class a {
        protected static Type a(int i10, ParameterizedType parameterizedType) {
            return e0.g(i10, parameterizedType);
        }

        protected static Class b(Type type) {
            return e0.h(type);
        }

        public i c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, a0 a0Var) {
            return null;
        }

        public abstract i d(Type type, Annotation[] annotationArr, a0 a0Var);

        public i e(Type type, Annotation[] annotationArr, a0 a0Var) {
            return null;
        }
    }

    Object convert(Object obj);
}
