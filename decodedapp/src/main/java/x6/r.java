package x6;

import java.lang.annotation.Annotation;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r implements i7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected HashMap f31800a;

    public r() {
    }

    public static r f(r rVar, r rVar2) {
        HashMap map;
        HashMap map2;
        if (rVar == null || (map = rVar.f31800a) == null || map.isEmpty()) {
            return rVar2;
        }
        if (rVar2 == null || (map2 = rVar2.f31800a) == null || map2.isEmpty()) {
            return rVar;
        }
        HashMap map3 = new HashMap();
        for (Annotation annotation : rVar2.f31800a.values()) {
            map3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : rVar.f31800a.values()) {
            map3.put(annotation2.annotationType(), annotation2);
        }
        return new r(map3);
    }

    public static r g(Class cls, Annotation annotation) {
        HashMap map = new HashMap(4);
        map.put(cls, annotation);
        return new r(map);
    }

    @Override // i7.b
    public Annotation a(Class cls) {
        HashMap map = this.f31800a;
        if (map == null) {
            return null;
        }
        return (Annotation) map.get(cls);
    }

    @Override // i7.b
    public boolean b(Class cls) {
        HashMap map = this.f31800a;
        if (map == null) {
            return false;
        }
        return map.containsKey(cls);
    }

    @Override // i7.b
    public boolean c(Class[] clsArr) {
        if (this.f31800a != null) {
            for (Class cls : clsArr) {
                if (this.f31800a.containsKey(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected final boolean d(Annotation annotation) {
        if (this.f31800a == null) {
            this.f31800a = new HashMap();
        }
        Annotation annotation2 = (Annotation) this.f31800a.put(annotation.annotationType(), annotation);
        return annotation2 == null || !annotation2.equals(annotation);
    }

    public boolean e(Annotation annotation) {
        return d(annotation);
    }

    @Override // i7.b
    public int size() {
        HashMap map = this.f31800a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public String toString() {
        HashMap map = this.f31800a;
        return map == null ? "[null]" : map.toString();
    }

    r(HashMap map) {
        this.f31800a = map;
    }
}
