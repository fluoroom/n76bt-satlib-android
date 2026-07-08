package x6;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static p6.j a(Object obj, boolean z10) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException(String.format("AnnotationIntrospector returned EnumNamingStrategy definition of type %s; expected type `Class<EnumNamingStrategy>` instead", i7.h.h(obj)));
        }
        Class cls = (Class) obj;
        if (cls == p6.j.class) {
            return null;
        }
        if (!p6.j.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(String.format("Problem with AnnotationIntrospector returned Class %s; expected `Class<EnumNamingStrategy>`", i7.h.h(cls)));
        }
        android.support.v4.media.session.b.a(i7.h.l(cls, z10));
        return null;
    }
}
