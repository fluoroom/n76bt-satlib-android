package s6;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import d6.k;
import java.io.Serializable;
import java.util.HashMap;
import p6.l;
import u6.b0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final i7.p f26946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final HashMap f26947b;

    public m() {
        this(2000);
    }

    private boolean h(JavaType javaType) {
        if (!javaType.L()) {
            return false;
        }
        JavaType javaTypeK = javaType.k();
        if (javaTypeK == null || (javaTypeK.w() == null && javaTypeK.v() == null)) {
            return javaType.T() && javaType.q().w() != null;
        }
        return true;
    }

    private Class i(Object obj, String str, Class cls) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Class) {
            Class cls2 = (Class) obj;
            if (cls2 == cls || i7.h.J(cls2)) {
                return null;
            }
            return cls2;
        }
        throw new IllegalStateException("AnnotationIntrospector." + str + "() returned value of type " + obj.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
    }

    private JavaType p(p6.h hVar, x6.b bVar, JavaType javaType) {
        Object objF;
        p6.l lVarH;
        JavaType javaTypeQ;
        Object objX;
        p6.q qVarG0;
        p6.b bVarZ = hVar.Z();
        if (bVarZ == null) {
            return javaType;
        }
        if (javaType.T() && (javaTypeQ = javaType.q()) != null && javaTypeQ.w() == null && (objX = bVarZ.x(bVar)) != null && (qVarG0 = hVar.G0(bVar, objX)) != null) {
            javaType = ((MapLikeType) javaType).q0(qVarG0);
        }
        JavaType javaTypeK = javaType.k();
        if (javaTypeK != null && javaTypeK.w() == null && (objF = bVarZ.f(bVar)) != null) {
            if (objF instanceof p6.l) {
                lVarH = (p6.l) objF;
            } else {
                Class clsI = i(objF, "findContentDeserializer", l.a.class);
                lVarH = clsI != null ? hVar.H(bVar, clsI) : null;
            }
            if (lVarH != null) {
                javaType = javaType.o0(lVarH);
            }
        }
        return bVarZ.H0(hVar.k(), bVar, javaType);
    }

    protected p6.l a(p6.h hVar, n nVar, JavaType javaType) throws v6.b {
        p6.l lVarC;
        try {
            lVarC = c(hVar, nVar, javaType);
        } catch (IllegalArgumentException e10) {
            hVar.q(javaType, i7.h.o(e10));
            lVarC = null;
        }
        if (lVarC == null) {
            return null;
        }
        boolean z10 = !h(javaType) && lVarC.q();
        if (lVarC instanceof s) {
            this.f26947b.put(javaType, lVarC);
            ((s) lVarC).c(hVar);
            this.f26947b.remove(javaType);
        }
        if (z10) {
            this.f26946a.b(javaType, lVarC);
        }
        return lVarC;
    }

    protected p6.l b(p6.h hVar, n nVar, JavaType javaType) {
        p6.l lVar;
        synchronized (this.f26947b) {
            try {
                p6.l lVarE = e(javaType);
                if (lVarE != null) {
                    return lVarE;
                }
                int size = this.f26947b.size();
                if (size > 0 && (lVar = (p6.l) this.f26947b.get(javaType)) != null) {
                    return lVar;
                }
                try {
                    return a(hVar, nVar, javaType);
                } finally {
                    if (size == 0 && this.f26947b.size() > 0) {
                        this.f26947b.clear();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected p6.l c(p6.h hVar, n nVar, JavaType javaType) {
        p6.g gVarK = hVar.k();
        if (javaType.D() || javaType.T() || javaType.H()) {
            javaType = nVar.n(gVarK, javaType);
        }
        p6.c cVarU0 = gVarK.u0(javaType);
        p6.l lVarL = l(hVar, cVarU0.s());
        if (lVarL != null) {
            return lVarL;
        }
        JavaType javaTypeP = p(hVar, cVarU0.s(), javaType);
        if (javaTypeP != javaType) {
            cVarU0 = gVarK.u0(javaTypeP);
            javaType = javaTypeP;
        }
        Class clsL = cVarU0.l();
        if (clsL != null) {
            return nVar.c(hVar, javaType, cVarU0, clsL);
        }
        i7.j jVarF = cVarU0.f();
        if (jVarF == null) {
            return d(hVar, nVar, javaType, cVarU0);
        }
        JavaType javaTypeA = jVarF.a(hVar.l());
        if (!javaTypeA.C(javaType.r())) {
            cVarU0 = gVarK.u0(javaTypeA);
        }
        return new b0(jVarF, javaTypeA, d(hVar, nVar, javaTypeA, cVarU0));
    }

    protected p6.l d(p6.h hVar, n nVar, JavaType javaType, p6.c cVar) {
        p6.g gVarK = hVar.k();
        if (javaType.O()) {
            return nVar.f(hVar, javaType, cVar);
        }
        if (javaType.L()) {
            if (javaType.G()) {
                return nVar.a(hVar, (ArrayType) javaType, cVar);
            }
            if (javaType.T() && cVar.g(null).i() != k.c.OBJECT) {
                MapLikeType mapLikeType = (MapLikeType) javaType;
                return mapLikeType instanceof MapType ? nVar.h(hVar, (MapType) mapLikeType, cVar) : nVar.i(hVar, mapLikeType, cVar);
            }
            if (javaType.H() && cVar.g(null).i() != k.c.OBJECT) {
                CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
                return collectionLikeType instanceof CollectionType ? nVar.d(hVar, (CollectionType) collectionLikeType, cVar) : nVar.e(hVar, collectionLikeType, cVar);
            }
        }
        return javaType.b() ? nVar.j(hVar, (ReferenceType) javaType, cVar) : p6.n.class.isAssignableFrom(javaType.r()) ? nVar.k(gVarK, javaType, cVar) : nVar.b(hVar, javaType, cVar);
    }

    protected p6.l e(JavaType javaType) {
        if (javaType == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        }
        if (h(javaType)) {
            return null;
        }
        return (p6.l) this.f26946a.get(javaType);
    }

    protected p6.q f(p6.h hVar, JavaType javaType) {
        return (p6.q) hVar.q(javaType, "Cannot find a (Map) Key deserializer for type " + javaType);
    }

    protected p6.l g(p6.h hVar, JavaType javaType) {
        if (i7.h.L(javaType.r())) {
            return (p6.l) hVar.q(javaType, "Cannot find a Value deserializer for type " + javaType);
        }
        return (p6.l) hVar.q(javaType, "Cannot find a Value deserializer for abstract type " + javaType);
    }

    protected i7.j j(p6.h hVar, x6.b bVar) {
        Object objL = hVar.Z().l(bVar);
        if (objL == null) {
            return null;
        }
        return hVar.j(bVar, objL);
    }

    protected p6.l k(p6.h hVar, x6.b bVar, p6.l lVar) {
        i7.j jVarJ = j(hVar, bVar);
        return jVarJ == null ? lVar : new b0(jVarJ, jVarJ.a(hVar.l()), lVar);
    }

    protected p6.l l(p6.h hVar, x6.b bVar) {
        Object objN = hVar.Z().n(bVar);
        if (objN == null) {
            return null;
        }
        return k(hVar, bVar, hVar.H(bVar, objN));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p6.q n(p6.h hVar, n nVar, JavaType javaType) {
        p6.q qVarG = nVar.g(hVar, javaType);
        if (qVarG == 0) {
            return f(hVar, javaType);
        }
        if (qVarG instanceof s) {
            ((s) qVarG).c(hVar);
        }
        return qVarG;
    }

    public p6.l o(p6.h hVar, n nVar, JavaType javaType) {
        p6.l lVarE = e(javaType);
        if (lVarE != null) {
            return lVarE;
        }
        p6.l lVarB = b(hVar, nVar, javaType);
        return lVarB == null ? g(hVar, javaType) : lVarB;
    }

    public m(int i10) {
        this.f26947b = new HashMap(8);
        this.f26946a = new i7.p(Math.min(64, i10 >> 2), i10);
    }
}
