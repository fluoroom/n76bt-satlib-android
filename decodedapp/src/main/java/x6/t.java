package x6;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import x6.v;

/* JADX INFO: loaded from: classes.dex */
public class t extends v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f31810a = Object.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f31811b = String.class;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class f31812c = p6.n.class;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final s f31813d = s.K(null, SimpleType.n0(String.class), e.h(String.class));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final s f31814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final s f31815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final s f31816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final s f31817h;

    static {
        Class cls = Boolean.TYPE;
        f31814e = s.K(null, SimpleType.n0(cls), e.h(cls));
        Class cls2 = Integer.TYPE;
        f31815f = s.K(null, SimpleType.n0(cls2), e.h(cls2));
        Class cls3 = Long.TYPE;
        f31816g = s.K(null, SimpleType.n0(cls3), e.h(cls3));
        f31817h = s.K(null, SimpleType.n0(Object.class), e.h(Object.class));
    }

    protected s f(r6.q qVar, JavaType javaType) {
        if (h(javaType)) {
            return s.K(qVar, javaType, i(qVar, javaType, qVar));
        }
        return null;
    }

    protected s g(r6.q qVar, JavaType javaType) {
        Class<?> clsR = javaType.r();
        if (clsR.isPrimitive()) {
            if (clsR == Integer.TYPE) {
                return f31815f;
            }
            if (clsR == Long.TYPE) {
                return f31816g;
            }
            if (clsR == Boolean.TYPE) {
                return f31814e;
            }
            return null;
        }
        if (!i7.h.N(clsR)) {
            if (f31812c.isAssignableFrom(clsR)) {
                return s.K(qVar, javaType, e.h(clsR));
            }
            return null;
        }
        if (clsR == f31810a) {
            return f31817h;
        }
        if (clsR == f31811b) {
            return f31813d;
        }
        if (clsR == Integer.class) {
            return f31815f;
        }
        if (clsR == Long.class) {
            return f31816g;
        }
        if (clsR == Boolean.class) {
            return f31814e;
        }
        return null;
    }

    protected boolean h(JavaType javaType) {
        if (javaType.L() && !javaType.G()) {
            Class clsR = javaType.r();
            if (i7.h.N(clsR) && (Collection.class.isAssignableFrom(clsR) || Map.class.isAssignableFrom(clsR))) {
                return true;
            }
        }
        return false;
    }

    protected d i(r6.q qVar, JavaType javaType, v.a aVar) {
        return e.i(qVar, javaType, aVar);
    }

    protected f0 j(r6.q qVar, JavaType javaType, v.a aVar, boolean z10) {
        d dVarI = i(qVar, javaType, aVar);
        return l(qVar, dVarI, javaType, z10, javaType.X() ? qVar.f().c(qVar, dVarI) : qVar.f().b(qVar, dVarI));
    }

    protected f0 k(r6.q qVar, JavaType javaType, v.a aVar, p6.c cVar, boolean z10) {
        d dVarI = i(qVar, javaType, aVar);
        return l(qVar, dVarI, javaType, z10, qVar.f().a(qVar, dVarI, cVar));
    }

    protected f0 l(r6.q qVar, d dVar, JavaType javaType, boolean z10, a aVar) {
        return new f0(qVar, z10, javaType, dVar, aVar);
    }

    @Override // x6.v
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public s a(r6.q qVar, JavaType javaType, v.a aVar) {
        s sVarG = g(qVar, javaType);
        return sVarG == null ? s.K(qVar, javaType, i(qVar, javaType, aVar)) : sVarG;
    }

    @Override // x6.v
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public s b(p6.g gVar, JavaType javaType, v.a aVar) {
        s sVarG = g(gVar, javaType);
        return (sVarG == null && (sVarG = f(gVar, javaType)) == null) ? s.J(j(gVar, javaType, aVar, false)) : sVarG;
    }

    @Override // x6.v
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public s c(p6.g gVar, JavaType javaType, v.a aVar) {
        s sVarG = g(gVar, javaType);
        return (sVarG == null && (sVarG = f(gVar, javaType)) == null) ? s.J(j(gVar, javaType, aVar, false)) : sVarG;
    }

    @Override // x6.v
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public s d(p6.g gVar, JavaType javaType, v.a aVar, p6.c cVar) {
        return s.J(k(gVar, javaType, aVar, cVar, false));
    }

    @Override // x6.v
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public s e(p6.b0 b0Var, JavaType javaType, v.a aVar) {
        s sVarG = g(b0Var, javaType);
        return (sVarG == null && (sVarG = f(b0Var, javaType)) == null) ? s.L(j(b0Var, javaType, aVar, true)) : sVarG;
    }
}
