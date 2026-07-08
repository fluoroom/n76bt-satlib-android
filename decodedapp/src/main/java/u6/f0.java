package u6;

import com.fasterxml.jackson.databind.JavaType;
import d6.h;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import u6.d0;

/* JADX INFO: loaded from: classes.dex */
public class f0 implements s6.p, Serializable {
    public static /* synthetic */ boolean b(x6.c cVar) {
        return (((x6.l) cVar.f31661a).x() == 1 && ((x6.l) cVar.f31661a).A(0) == String.class && cVar.f31662b != h.a.PROPERTIES) ? false : true;
    }

    private static p6.q c(p6.g gVar, x6.k kVar) {
        if (kVar instanceof x6.f) {
            Constructor constructorB = ((x6.f) kVar).b();
            if (gVar.b()) {
                i7.h.g(constructorB, gVar.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new d0.c(constructorB);
        }
        Method methodB = ((x6.l) kVar).b();
        if (gVar.b()) {
            i7.h.g(methodB, gVar.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new d0.d(methodB);
    }

    private static x6.l d(List list) {
        Iterator it = list.iterator();
        x6.l lVar = null;
        while (it.hasNext()) {
            x6.c cVar = (x6.c) it.next();
            if (cVar.f31662b != null) {
                if (lVar != null) {
                    throw new IllegalArgumentException("Multiple suitable annotated Creator factory methods to be used as the Key deserializer for type " + i7.h.Y(((x6.l) cVar.f31661a).k()));
                }
                lVar = (x6.l) cVar.f31661a;
            }
        }
        return lVar;
    }

    private static x6.c e(p6.c cVar) {
        for (x6.c cVar2 : cVar.u()) {
            x6.f fVar = (x6.f) cVar2.f31661a;
            if (fVar.x() == 1 && String.class == fVar.A(0)) {
                return cVar2;
            }
        }
        return null;
    }

    public static p6.q f(p6.g gVar, JavaType javaType, p6.l lVar) {
        return new d0.a(javaType.r(), lVar);
    }

    public static p6.q g(i7.k kVar, i7.k kVar2) {
        return new d0.b(kVar, null, kVar2);
    }

    public static p6.q h(i7.k kVar, x6.l lVar, i7.k kVar2) {
        return new d0.b(kVar, lVar, kVar2);
    }

    public static p6.q i(p6.g gVar, JavaType javaType) {
        p6.c cVarW0 = gVar.w0(javaType);
        x6.c cVarE = e(cVarW0);
        if (cVarE != null && cVarE.f31662b != null) {
            return c(gVar, (x6.k) cVarE.f31661a);
        }
        List listW = cVarW0.w();
        Collection.EL.removeIf(listW, new Predicate() { // from class: u6.e0
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return f0.b((x6.c) obj);
            }
        });
        x6.l lVarD = d(listW);
        if (lVarD != null) {
            return c(gVar, lVarD);
        }
        if (cVarE != null) {
            return c(gVar, (x6.k) cVarE.f31661a);
        }
        if (listW.isEmpty()) {
            return null;
        }
        return c(gVar, (x6.k) ((x6.c) listW.get(0)).f31661a);
    }

    @Override // s6.p
    public p6.q a(JavaType javaType, p6.g gVar, p6.c cVar) {
        Class clsR = javaType.r();
        if (clsR.isPrimitive()) {
            clsR = i7.h.p0(clsR);
        }
        return d0.g(clsR);
    }
}
