package b7;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public class l extends s implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final a7.c f3703c;

    public l(JavaType javaType, com.fasterxml.jackson.databind.type.c cVar, a7.c cVar2) {
        super(javaType, cVar);
        this.f3703c = cVar2;
    }

    public static l i(JavaType javaType, r6.q qVar, a7.c cVar) {
        return new l(javaType, qVar.D(), cVar);
    }

    @Override // a7.f
    public String a(Object obj) {
        return g(obj, obj.getClass(), this.f3727a);
    }

    @Override // a7.f
    public String b() {
        return "class name used as type id";
    }

    @Override // a7.f
    public JavaType d(p6.e eVar, String str) {
        return h(str, eVar);
    }

    @Override // a7.f
    public String e(Object obj, Class cls) {
        return g(obj, cls, this.f3727a);
    }

    protected String g(Object obj, Class cls, com.fasterxml.jackson.databind.type.c cVar) {
        if (i7.h.M(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (name.startsWith("java.util.")) {
            if (obj instanceof EnumSet) {
                return cVar.D(EnumSet.class, i7.h.u((EnumSet) obj)).c();
            }
            if (obj instanceof EnumMap) {
                return cVar.L(EnumMap.class, i7.h.t((EnumMap) obj), Object.class).c();
            }
        } else if (name.indexOf(36) >= 0 && i7.h.E(cls) != null && i7.h.E(this.f3728b.r()) == null) {
            return this.f3728b.r().getName();
        }
        return name;
    }

    protected JavaType h(String str, p6.e eVar) throws p6.m {
        JavaType javaTypeS = eVar.s(this.f3728b, str, this.f3703c);
        return (javaTypeS == null && (eVar instanceof p6.h)) ? ((p6.h) eVar).v0(this.f3728b, str, this, "no such class found") : javaTypeS;
    }
}
