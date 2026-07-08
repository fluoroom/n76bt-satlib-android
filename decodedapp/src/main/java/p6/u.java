package p6;

import com.fasterxml.jackson.databind.JavaType;
import d6.r;
import e7.j;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import p6.t;
import s6.l;
import x6.i0;
import x6.y;

/* JADX INFO: loaded from: classes.dex */
public class u extends e6.n implements Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static final b f24028w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected static final r6.a f24029x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final e6.e f24030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected com.fasterxml.jackson.databind.type.c f24031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected a7.d f24032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final r6.h f24033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final r6.d f24034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected i0 f24035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected b0 f24036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected e7.j f24037h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected e7.q f24038r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected g f24039s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected s6.l f24040t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected Set f24041u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final ConcurrentHashMap f24042v;

    class a implements t.a {
        a() {
        }

        @Override // p6.t.a
        public void a(Class cls, Class cls2) {
            u.this.n(cls, cls2);
        }

        @Override // p6.t.a
        public void b(a7.b... bVarArr) {
            u.this.C(bVarArr);
        }

        @Override // p6.t.a
        public void c(s6.o oVar) {
            s6.n nVarO = u.this.f24040t.f23976b.o(oVar);
            u uVar = u.this;
            uVar.f24040t = uVar.f24040t.m1(nVarO);
        }
    }

    static {
        x6.a0 a0Var = new x6.a0();
        f24028w = a0Var;
        f24029x = new r6.a(null, a0Var, null, com.fasterxml.jackson.databind.type.c.T(), null, i7.a0.f15830v, null, Locale.getDefault(), null, e6.b.a(), b7.m.f3704a, new y.b());
    }

    public u() {
        this(null, null, null);
    }

    private final void l(e6.g gVar, Object obj, b0 b0Var) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            j(b0Var).P0(gVar, obj);
            if (b0Var.q0(c0.FLUSH_AFTER_WRITE_VALUE)) {
                gVar.flush();
            }
            closeable.close();
        } catch (Exception e10) {
            i7.h.j(null, closeable, e10);
        }
    }

    public u A(t tVar) {
        Object objC;
        d("module", tVar);
        if (tVar.b() == null) {
            throw new IllegalArgumentException("Module without defined name");
        }
        if (tVar.e() == null) {
            throw new IllegalArgumentException("Module without defined version");
        }
        Iterator it = tVar.a().iterator();
        while (it.hasNext()) {
            A((t) it.next());
        }
        if (w(r.IGNORE_DUPLICATE_MODULE_REGISTRATIONS) && (objC = tVar.c()) != null) {
            if (this.f24041u == null) {
                this.f24041u = new LinkedHashSet();
            }
            if (!this.f24041u.add(objC)) {
                return this;
            }
        }
        tVar.d(new a());
        return this;
    }

    public void C(a7.b... bVarArr) {
        v().e(bVarArr);
    }

    public u D(r.b bVar) {
        this.f24033d.g(bVar);
        return this;
    }

    public u G(r.b bVar) {
        return D(bVar);
    }

    public u H(r.a aVar) {
        G(r.b.a(aVar, aVar));
        return this;
    }

    public e6.j K(e6.w wVar) {
        d("n", wVar);
        return new d7.u((n) wVar, this);
    }

    public w L() {
        return h(t());
    }

    @Override // e6.n
    public Object a(e6.j jVar, n6.b bVar) {
        d("p", jVar);
        return i(s(), jVar, this.f24031b.S(bVar));
    }

    @Override // e6.n
    public Object b(e6.w wVar, Class cls) throws e6.k {
        Object objB0;
        if (wVar == null) {
            return null;
        }
        try {
            return (e6.w.class.isAssignableFrom(cls) && cls.isAssignableFrom(wVar.getClass())) ? wVar : (wVar.c() == e6.m.VALUE_EMBEDDED_OBJECT && (wVar instanceof d7.s) && ((objB0 = ((d7.s) wVar).b0()) == null || cls.isInstance(objB0))) ? objB0 : x(K(wVar), cls);
        } catch (e6.k e10) {
            throw e10;
        } catch (IOException e11) {
            throw new IllegalArgumentException(e11.getMessage(), e11);
        }
    }

    @Override // e6.n
    public void c(e6.g gVar, Object obj) throws IOException {
        d("g", gVar);
        b0 b0VarT = t();
        if (b0VarT.q0(c0.INDENT_OUTPUT) && gVar.v() == null) {
            gVar.T(b0VarT.l0());
        }
        if (b0VarT.q0(c0.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            l(gVar, obj, b0VarT);
            return;
        }
        j(b0VarT).P0(gVar, obj);
        if (b0VarT.q0(c0.FLUSH_AFTER_WRITE_VALUE)) {
            gVar.flush();
        }
    }

    protected final void d(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }

    protected l e(h hVar, JavaType javaType) {
        l lVar = (l) this.f24042v.get(javaType);
        if (lVar != null) {
            return lVar;
        }
        l lVarX = hVar.X(javaType);
        if (lVarX != null) {
            this.f24042v.put(javaType, lVarX);
            return lVarX;
        }
        return (l) hVar.q(javaType, "Cannot find a deserializer for type " + javaType);
    }

    protected e6.m f(e6.j jVar, JavaType javaType) throws v6.f {
        this.f24039s.s0(jVar);
        e6.m mVarN = jVar.n();
        if (mVarN != null) {
            return mVarN;
        }
        e6.m mVarX0 = jVar.X0();
        if (mVarX0 != null) {
            return mVarX0;
        }
        throw v6.f.v(jVar, javaType, "No content to map due to end-of-input");
    }

    protected v g(g gVar, JavaType javaType, Object obj, e6.c cVar, k kVar) {
        return new v(this, gVar, javaType, obj, cVar, kVar);
    }

    protected w h(b0 b0Var) {
        return new w(this, b0Var);
    }

    protected Object i(g gVar, e6.j jVar, JavaType javaType) throws v6.f {
        e6.m mVarF = f(jVar, javaType);
        s6.l lVarP = p(jVar, gVar);
        Object objA = mVarF == e6.m.VALUE_NULL ? e(lVarP, javaType).a(lVarP) : (mVarF == e6.m.END_ARRAY || mVarF == e6.m.END_OBJECT) ? null : lVarP.l1(jVar, javaType, e(lVarP, javaType), null);
        jVar.k();
        if (gVar.x0(i.FAIL_ON_TRAILING_TOKENS)) {
            k(jVar, lVarP, javaType);
        }
        return objA;
    }

    protected e7.j j(b0 b0Var) {
        return this.f24037h.N0(b0Var, this.f24038r);
    }

    protected final void k(e6.j jVar, h hVar, JavaType javaType) throws v6.f {
        e6.m mVarX0 = jVar.X0();
        if (mVarX0 != null) {
            hVar.V0(i7.h.e0(javaType), jVar, mVarX0);
        }
    }

    public u n(Class cls, Class cls2) {
        this.f24035f.b(cls, cls2);
        return this;
    }

    public u o(r rVar, boolean z10) {
        this.f24036g = (b0) (z10 ? this.f24036g.i0(rVar) : this.f24036g.j0(rVar));
        this.f24039s = (g) (z10 ? this.f24039s.i0(rVar) : this.f24039s.j0(rVar));
        return this;
    }

    protected s6.l p(e6.j jVar, g gVar) {
        return this.f24040t.j1(gVar, jVar, null);
    }

    protected x6.v q() {
        return new x6.t();
    }

    public u r(c0 c0Var) {
        this.f24036g = this.f24036g.r0(c0Var);
        return this;
    }

    public g s() {
        return this.f24039s;
    }

    public b0 t() {
        return this.f24036g;
    }

    public a7.d v() {
        return this.f24032c;
    }

    public boolean w(r rVar) {
        return this.f24036g.L(rVar);
    }

    public Object x(e6.j jVar, Class cls) {
        d("p", jVar);
        return i(s(), jVar, this.f24031b.R(cls));
    }

    public v z(Class cls) {
        return g(s(), cls == null ? null : this.f24031b.R(cls), null, null, null);
    }

    public u(e6.e eVar) {
        this(eVar, null, null);
    }

    public u(e6.e eVar, e7.j jVar, s6.l lVar) {
        this.f24042v = new ConcurrentHashMap(64, 0.6f, 2);
        if (eVar == null) {
            this.f24030a = new s(this);
        } else {
            this.f24030a = eVar;
            if (eVar.o() == null) {
                eVar.q(this);
            }
        }
        this.f24032c = new b7.o();
        i7.y yVar = new i7.y();
        this.f24031b = com.fasterxml.jackson.databind.type.c.T();
        i0 i0Var = new i0(null);
        this.f24035f = i0Var;
        r6.a aVarN = f24029x.n(q());
        r6.h hVar = new r6.h();
        this.f24033d = hVar;
        r6.d dVar = new r6.d();
        this.f24034e = dVar;
        this.f24036g = new b0(aVarN, this.f24032c, i0Var, yVar, hVar, r6.l.a());
        this.f24039s = new g(aVarN, this.f24032c, i0Var, yVar, hVar, dVar, r6.l.a());
        boolean zP = this.f24030a.p();
        b0 b0Var = this.f24036g;
        r rVar = r.SORT_PROPERTIES_ALPHABETICALLY;
        if (b0Var.L(rVar) ^ zP) {
            o(rVar, zP);
        }
        this.f24037h = jVar == null ? new j.a() : jVar;
        this.f24040t = lVar == null ? new l.a(s6.f.f26939t) : lVar;
        this.f24038r = e7.f.f11646d;
    }
}
