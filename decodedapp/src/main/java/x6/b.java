package x6;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    protected b() {
    }

    public abstract AnnotatedElement b();

    public abstract Annotation c(Class cls);

    public abstract String d();

    public abstract Class e();

    public abstract boolean equals(Object obj);

    public abstract JavaType f();

    public abstract boolean g(Class cls);

    public abstract boolean h(Class[] clsArr);

    public abstract int hashCode();

    public abstract String toString();
}
