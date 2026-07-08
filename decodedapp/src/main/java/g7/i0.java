package g7;

import com.fasterxml.jackson.databind.JavaType;
import d6.k;
import d6.r;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends p6.p implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f13604b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Class f13605a;

    protected i0(Class cls) {
        this.f13605a = cls;
    }

    protected static final boolean j(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    protected static final boolean k(Collection collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }

    @Override // p6.p
    public Class c() {
        return this.f13605a;
    }

    @Override // p6.p
    public abstract void f(Object obj, e6.g gVar, p6.d0 d0Var);

    protected p6.p l(p6.d0 d0Var, p6.d dVar) {
        Object objG;
        if (dVar == null) {
            return null;
        }
        x6.k kVarH = dVar.h();
        p6.b bVarI0 = d0Var.i0();
        if (kVarH == null || (objG = bVarI0.g(kVarH)) == null) {
            return null;
        }
        return d0Var.G0(kVarH, objG);
    }

    protected p6.p n(p6.d0 d0Var, p6.d dVar, p6.p pVar) {
        Object obj = f13604b;
        Map identityHashMap = (Map) d0Var.j0(obj);
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap();
            d0Var.H0(obj, identityHashMap);
        } else if (identityHashMap.get(dVar) != null) {
            return pVar;
        }
        identityHashMap.put(dVar, Boolean.TRUE);
        try {
            p6.p pVarO = o(d0Var, dVar, pVar);
            return pVarO != null ? d0Var.u0(pVarO, dVar) : pVar;
        } finally {
            identityHashMap.remove(dVar);
        }
    }

    protected p6.p o(p6.d0 d0Var, p6.d dVar, p6.p pVar) {
        x6.k kVarH;
        Object objG0;
        p6.b bVarI0 = d0Var.i0();
        if (!j(bVarI0, dVar) || (kVarH = dVar.h()) == null || (objG0 = bVarI0.g0(kVarH)) == null) {
            return pVar;
        }
        i7.j jVarJ = d0Var.j(dVar.h(), objG0);
        JavaType javaTypeB = jVarJ.b(d0Var.l());
        if (pVar == null && !javaTypeB.S()) {
            pVar = d0Var.d0(javaTypeB);
        }
        return new d0(jVarJ, javaTypeB, pVar);
    }

    protected Boolean p(p6.d0 d0Var, p6.d dVar, Class cls, k.a aVar) {
        k.d dVarQ = q(d0Var, dVar, cls);
        if (dVarQ != null) {
            return dVarQ.e(aVar);
        }
        return null;
    }

    protected k.d q(p6.d0 d0Var, p6.d dVar, Class cls) {
        return dVar != null ? dVar.f(d0Var.k(), cls) : d0Var.m0(cls);
    }

    protected r.b r(p6.d0 d0Var, p6.d dVar, Class cls) {
        return dVar != null ? dVar.e(d0Var.k(), cls) : d0Var.n0(cls);
    }

    protected e7.m s(p6.d0 d0Var, Object obj, Object obj2) {
        d0Var.o0();
        android.support.v4.media.session.b.a(d0Var.r(c(), "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured"));
        return null;
    }

    protected boolean t(p6.p pVar) {
        return i7.h.P(pVar);
    }

    public void v(p6.d0 d0Var, Throwable th2, Object obj, int i10) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        i7.h.i0(th2);
        boolean z10 = d0Var == null || d0Var.y0(p6.c0.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z10 || !(th2 instanceof e6.d)) {
                throw ((IOException) th2);
            }
        } else if (!z10) {
            i7.h.k0(th2);
        }
        throw p6.m.r(th2, obj, i10);
    }

    public void w(p6.d0 d0Var, Throwable th2, Object obj, String str) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        i7.h.i0(th2);
        boolean z10 = d0Var == null || d0Var.y0(p6.c0.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z10 || !(th2 instanceof e6.d)) {
                throw ((IOException) th2);
            }
        } else if (!z10) {
            i7.h.k0(th2);
        }
        throw p6.m.s(th2, obj, str);
    }

    protected i0(JavaType javaType) {
        this.f13605a = javaType.r();
    }

    protected i0(Class cls, boolean z10) {
        this.f13605a = cls;
    }

    protected i0(i0 i0Var) {
        this.f13605a = i0Var.f13605a;
    }
}
