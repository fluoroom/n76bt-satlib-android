package p6;

import com.fasterxml.jackson.databind.JavaType;
import h6.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class v extends e6.n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final g f24044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final s6.l f24045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final e6.e f24046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final boolean f24047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h6.b f24048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final JavaType f24049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final l f24050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Object f24051h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final ConcurrentHashMap f24052r;

    protected v(u uVar, g gVar, JavaType javaType, Object obj, e6.c cVar, k kVar) {
        this.f24044a = gVar;
        this.f24045b = uVar.f24040t;
        this.f24052r = uVar.f24042v;
        this.f24046c = uVar.f24030a;
        this.f24049f = javaType;
        this.f24051h = obj;
        this.f24047d = gVar.y0();
        this.f24050g = k(javaType);
        this.f24048e = null;
    }

    @Override // e6.n
    public Object a(e6.j jVar, n6.b bVar) {
        d("p", jVar);
        return s(bVar).t(jVar);
    }

    @Override // e6.n
    public Object b(e6.w wVar, Class cls) throws e6.k {
        d("n", wVar);
        try {
            return v(x(wVar), cls);
        } catch (e6.k e10) {
            throw e10;
        } catch (IOException e11) {
            throw m.n(e11);
        }
    }

    @Override // e6.n
    public void c(e6.g gVar, Object obj) {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    protected final void d(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }

    protected Object e(e6.j jVar, Object obj) throws v6.f {
        s6.l lVarN = n(jVar);
        e6.m mVarI = i(lVarN, jVar);
        if (mVarI == e6.m.VALUE_NULL) {
            if (obj == null) {
                obj = h(lVarN).a(lVarN);
            }
        } else if (mVarI != e6.m.END_ARRAY && mVarI != e6.m.END_OBJECT) {
            obj = lVarN.l1(jVar, this.f24049f, h(lVarN), this.f24051h);
        }
        jVar.k();
        if (this.f24044a.x0(i.FAIL_ON_TRAILING_TOKENS)) {
            l(jVar, lVarN, this.f24049f);
        }
        return obj;
    }

    protected Object f(e6.j jVar) {
        Object objL1;
        try {
            s6.l lVarN = n(jVar);
            e6.m mVarI = i(lVarN, jVar);
            if (mVarI == e6.m.VALUE_NULL) {
                objL1 = this.f24051h;
                if (objL1 == null) {
                    objL1 = h(lVarN).a(lVarN);
                }
            } else {
                objL1 = (mVarI == e6.m.END_ARRAY || mVarI == e6.m.END_OBJECT) ? this.f24051h : lVarN.l1(jVar, this.f24049f, h(lVarN), this.f24051h);
            }
            if (this.f24044a.x0(i.FAIL_ON_TRAILING_TOKENS)) {
                l(jVar, lVarN, this.f24049f);
            }
            if (jVar != null) {
                jVar.close();
            }
            return objL1;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (jVar != null) {
                    try {
                        jVar.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    protected e6.j g(e6.j jVar, boolean z10) {
        return (this.f24048e == null || h6.a.class.isInstance(jVar)) ? jVar : new h6.a(jVar, this.f24048e, b.a.ONLY_INCLUDE_ALL, z10);
    }

    protected l h(h hVar) throws v6.b {
        l lVar = this.f24050g;
        if (lVar != null) {
            return lVar;
        }
        JavaType javaType = this.f24049f;
        if (javaType == null) {
            hVar.q(null, "No value type configured for ObjectReader");
        }
        l lVar2 = (l) this.f24052r.get(javaType);
        if (lVar2 != null) {
            return lVar2;
        }
        l lVarX = hVar.X(javaType);
        if (lVarX == null) {
            hVar.q(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this.f24052r.put(javaType, lVarX);
        return lVarX;
    }

    protected e6.m i(h hVar, e6.j jVar) throws v6.f {
        this.f24044a.t0(jVar, null);
        e6.m mVarN = jVar.n();
        if (mVarN != null) {
            return mVarN;
        }
        e6.m mVarX0 = jVar.X0();
        if (mVarX0 == null) {
            hVar.P0(this.f24049f, "No content to map due to end-of-input", new Object[0]);
        }
        return mVarX0;
    }

    protected v j(v vVar, g gVar, JavaType javaType, l lVar, Object obj, e6.c cVar, k kVar, s6.k kVar2) {
        return new v(vVar, gVar, javaType, lVar, obj, cVar, kVar, kVar2);
    }

    protected l k(JavaType javaType) {
        if (javaType == null || !this.f24044a.x0(i.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        l lVarX = (l) this.f24052r.get(javaType);
        if (lVarX == null) {
            try {
                lVarX = o().X(javaType);
                if (lVarX != null) {
                    this.f24052r.put(javaType, lVarX);
                }
            } catch (e6.d unused) {
            }
        }
        return lVarX;
    }

    protected final void l(e6.j jVar, h hVar, JavaType javaType) throws v6.f {
        Object obj;
        e6.m mVarX0 = jVar.X0();
        if (mVarX0 != null) {
            Class<?> clsE0 = i7.h.e0(javaType);
            if (clsE0 == null && (obj = this.f24051h) != null) {
                clsE0 = obj.getClass();
            }
            hVar.V0(clsE0, jVar, mVarX0);
        }
    }

    protected s6.l n(e6.j jVar) {
        return this.f24045b.j1(this.f24044a, jVar, null);
    }

    protected s6.l o() {
        return this.f24045b.i1(this.f24044a);
    }

    public e6.j p(String str) {
        d("content", str);
        return this.f24044a.t0(this.f24046c.n(str), null);
    }

    public v q(JavaType javaType) {
        if (javaType != null && javaType.equals(this.f24049f)) {
            return this;
        }
        return j(this, this.f24044a, javaType, k(javaType), this.f24051h, null, null, null);
    }

    public v r(Class cls) {
        return q(this.f24044a.e(cls));
    }

    public v s(n6.b bVar) {
        return q(this.f24044a.D().R(bVar.d()));
    }

    public Object t(e6.j jVar) {
        d("p", jVar);
        return e(jVar, this.f24051h);
    }

    public Object v(e6.j jVar, Class cls) {
        d("p", jVar);
        return r(cls).t(jVar);
    }

    public Object w(String str) throws e6.k {
        try {
            return f(g(p(str), false));
        } catch (e6.k e10) {
            throw e10;
        } catch (IOException e11) {
            throw m.n(e11);
        }
    }

    public e6.j x(e6.w wVar) {
        d("n", wVar);
        return new d7.u((n) wVar, z(null));
    }

    public v z(Object obj) {
        if (obj == this.f24051h) {
            return this;
        }
        if (obj == null) {
            return j(this, this.f24044a, this.f24049f, this.f24050g, null, null, null, null);
        }
        JavaType javaTypeE = this.f24049f;
        if (javaTypeE == null) {
            javaTypeE = this.f24044a.e(obj.getClass());
        }
        return j(this, this.f24044a, javaTypeE, this.f24050g, obj, null, null, null);
    }

    protected v(v vVar, g gVar, JavaType javaType, l lVar, Object obj, e6.c cVar, k kVar, s6.k kVar2) {
        this.f24044a = gVar;
        this.f24045b = vVar.f24045b;
        this.f24052r = vVar.f24052r;
        this.f24046c = vVar.f24046c;
        this.f24049f = javaType;
        this.f24050g = lVar;
        this.f24051h = obj;
        this.f24047d = gVar.y0();
        this.f24048e = vVar.f24048e;
    }
}
