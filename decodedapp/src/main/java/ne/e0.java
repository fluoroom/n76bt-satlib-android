package ne;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 implements cf.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22688a = new a(null);

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final e0 a(Type type) {
            rd.m.e(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new c0(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) ? new m(type) : type instanceof WildcardType ? new h0((WildcardType) type) : new s(type);
        }

        private a() {
        }
    }

    protected abstract Type P();

    @Override // cf.d
    public cf.a a(mf.c cVar) {
        Object obj;
        rd.m.e(cVar, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            mf.b bVarH = ((cf.a) next).h();
            if (rd.m.a(bVarH != null ? bVarH.a() : null, cVar)) {
                obj = next;
                break;
            }
        }
        return (cf.a) obj;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e0) && rd.m.a(P(), ((e0) obj).P());
    }

    public int hashCode() {
        return P().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + P();
    }
}
