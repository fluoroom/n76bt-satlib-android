package s6;

import com.fasterxml.jackson.databind.JavaType;
import d6.k0;
import d6.o0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p6.l;
import p6.q;
import t6.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends p6.h implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected transient LinkedHashMap f26944v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f26945w;

    public static final class a extends l {
        public a(n nVar) {
            super(nVar, (m) null);
        }

        @Override // s6.l
        public l i1(p6.g gVar) {
            return new a(this, gVar);
        }

        @Override // s6.l
        public l j1(p6.g gVar, e6.j jVar, p6.k kVar) {
            return new a(this, gVar, jVar, kVar);
        }

        @Override // s6.l
        public l m1(n nVar) {
            return new a(this, nVar);
        }

        private a(a aVar, p6.g gVar, e6.j jVar, p6.k kVar) {
            super(aVar, gVar, jVar, kVar);
        }

        private a(a aVar, n nVar) {
            super(aVar, nVar);
        }

        private a(a aVar, p6.g gVar) {
            super(aVar, gVar);
        }
    }

    protected l(n nVar, m mVar) {
        super(nVar, mVar);
    }

    @Override // p6.h
    public final p6.q G0(x6.b bVar, Object obj) {
        p6.q qVar;
        if (obj == null) {
            return null;
        }
        if (obj instanceof p6.q) {
            qVar = (p6.q) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == q.a.class || i7.h.J(cls)) {
                return null;
            }
            if (!p6.q.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<KeyDeserializer>");
            }
            this.f23977c.w();
            qVar = (p6.q) i7.h.l(cls, this.f23977c.b());
        }
        if (qVar instanceof s) {
            ((s) qVar).c(this);
        }
        return qVar;
    }

    @Override // p6.h
    public p6.l H(x6.b bVar, Object obj) {
        p6.l lVar;
        if (obj == null) {
            return null;
        }
        if (obj instanceof p6.l) {
            lVar = (p6.l) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + obj.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == l.a.class || i7.h.J(cls)) {
                return null;
            }
            if (!p6.l.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonDeserializer>");
            }
            this.f23977c.w();
            lVar = (p6.l) i7.h.l(cls, this.f23977c.b());
        }
        if (lVar instanceof s) {
            ((s) lVar).c(this);
        }
        return lVar;
    }

    @Override // p6.h
    public z W(Object obj, k0 k0Var, o0 o0Var) {
        if (obj == null) {
            return null;
        }
        k0.a aVarF = k0Var.f(obj);
        LinkedHashMap linkedHashMap = this.f26944v;
        if (linkedHashMap == null) {
            this.f26944v = new LinkedHashMap();
        } else {
            z zVar = (z) linkedHashMap.get(aVarF);
            if (zVar != null) {
                return zVar;
            }
        }
        List list = this.f26945w;
        if (list == null) {
            this.f26945w = new ArrayList(8);
        } else {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        o0Var.a(this);
        this.f26945w.add(null);
        z zVarK1 = k1(aVarF);
        zVarK1.d(null);
        this.f26944v.put(aVarF, zVarK1);
        return zVarK1;
    }

    protected Object h1(e6.j jVar, JavaType javaType, p6.l lVar, Object obj) throws p6.m {
        String strC = this.f23977c.T(javaType).c();
        e6.m mVarN = jVar.n();
        e6.m mVar = e6.m.START_OBJECT;
        if (mVarN != mVar) {
            X0(javaType, mVar, "Current token not START_OBJECT (needed to unwrap root name %s), but %s", i7.h.V(strC), jVar.n());
        }
        e6.m mVarX0 = jVar.X0();
        e6.m mVar2 = e6.m.FIELD_NAME;
        if (mVarX0 != mVar2) {
            X0(javaType, mVar2, "Current token not FIELD_NAME (to contain expected root name %s), but %s", i7.h.V(strC), jVar.n());
        }
        String strL = jVar.l();
        if (!strC.equals(strL)) {
            T0(javaType, strL, "Root name (%s) does not match expected (%s) for type %s", i7.h.V(strL), i7.h.V(strC), i7.h.G(javaType));
        }
        jVar.X0();
        Object objE = obj == null ? lVar.e(jVar, this) : lVar.f(jVar, this, obj);
        e6.m mVarX02 = jVar.X0();
        e6.m mVar3 = e6.m.END_OBJECT;
        if (mVarX02 != mVar3) {
            X0(javaType, mVar3, "Current token not END_OBJECT (to match wrapper object with root name %s), but %s", i7.h.V(strC), jVar.n());
        }
        return objE;
    }

    public abstract l i1(p6.g gVar);

    public abstract l j1(p6.g gVar, e6.j jVar, p6.k kVar);

    protected z k1(k0.a aVar) {
        return new z(aVar);
    }

    public Object l1(e6.j jVar, JavaType javaType, p6.l lVar, Object obj) {
        return this.f23977c.y0() ? h1(jVar, javaType, lVar, obj) : obj == null ? lVar.e(jVar, this) : lVar.f(jVar, this, obj);
    }

    public abstract l m1(n nVar);

    protected l(l lVar, p6.g gVar, e6.j jVar, p6.k kVar) {
        super(lVar, gVar, jVar, kVar);
    }

    protected l(l lVar, p6.g gVar) {
        super(lVar, gVar);
    }

    protected l(l lVar, n nVar) {
        super(lVar, nVar);
    }
}
