package g7;

import com.fasterxml.jackson.databind.JavaType;
import d6.e0;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class s extends i0 implements e7.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final x6.k f13617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final a7.h f13618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final p6.p f13619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final p6.d f13620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final JavaType f13621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final boolean f13622h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected transient f7.k f13623r;

    static class a extends a7.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final a7.h f13624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final Object f13625b;

        public a(a7.h hVar, Object obj) {
            this.f13624a = hVar;
            this.f13625b = obj;
        }

        @Override // a7.h
        public a7.h a(p6.d dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // a7.h
        public String b() {
            return this.f13624a.b();
        }

        @Override // a7.h
        public e0.a c() {
            return this.f13624a.c();
        }

        @Override // a7.h
        public n6.c g(e6.g gVar, n6.c cVar) {
            cVar.f22546a = this.f13625b;
            return this.f13624a.g(gVar, cVar);
        }

        @Override // a7.h
        public n6.c h(e6.g gVar, n6.c cVar) {
            return this.f13624a.h(gVar, cVar);
        }
    }

    public s(x6.k kVar, a7.h hVar, p6.p pVar) {
        super(kVar.f());
        this.f13617c = kVar;
        this.f13621g = kVar.f();
        this.f13618d = hVar;
        this.f13619e = pVar;
        this.f13620f = null;
        this.f13622h = true;
        this.f13623r = f7.k.c();
    }

    private static final Class z(Class cls) {
        return cls == null ? Object.class : cls;
    }

    protected boolean A(Class cls, p6.p pVar) {
        if (cls.isPrimitive()) {
            if (cls != Integer.TYPE && cls != Boolean.TYPE && cls != Double.TYPE) {
                return false;
            }
        } else if (cls != String.class && cls != Integer.class && cls != Boolean.class && cls != Double.class) {
            return false;
        }
        return t(pVar);
    }

    protected s C(p6.d dVar, a7.h hVar, p6.p pVar, boolean z10) {
        return (this.f13620f == dVar && this.f13618d == hVar && this.f13619e == pVar && z10 == this.f13622h) ? this : new s(this, dVar, hVar, pVar, z10);
    }

    @Override // e7.i
    public p6.p a(p6.d0 d0Var, p6.d dVar) {
        a7.h hVarA = this.f13618d;
        if (hVarA != null) {
            hVarA = hVarA.a(dVar);
        }
        p6.p pVar = this.f13619e;
        if (pVar != null) {
            return C(dVar, hVarA, d0Var.t0(pVar, dVar), this.f13622h);
        }
        if (!d0Var.x0(p6.r.USE_STATIC_TYPING) && !this.f13621g.Q()) {
            return dVar != this.f13620f ? C(dVar, hVarA, pVar, this.f13622h) : this;
        }
        p6.p pVarZ = d0Var.Z(this.f13621g, dVar);
        return C(dVar, hVarA, pVarZ, A(this.f13621g.r(), pVarZ));
    }

    @Override // p6.p
    public boolean d(p6.d0 d0Var, Object obj) {
        Object objO = this.f13617c.o(obj);
        if (objO == null) {
            return true;
        }
        p6.p pVarX = this.f13619e;
        if (pVarX == null) {
            try {
                pVarX = x(d0Var, objO.getClass());
            } catch (p6.m e10) {
                throw new p6.a0(e10);
            }
        }
        return pVarX.d(d0Var, objO);
    }

    @Override // g7.i0, p6.p
    public void f(Object obj, e6.g gVar, p6.d0 d0Var) throws IOException {
        Object objO;
        try {
            objO = this.f13617c.o(obj);
        } catch (Exception e10) {
            w(d0Var, e10, obj, this.f13617c.d() + "()");
            objO = null;
        }
        if (objO == null) {
            d0Var.N(gVar);
            return;
        }
        p6.p pVarX = this.f13619e;
        if (pVarX == null) {
            pVarX = x(d0Var, objO.getClass());
        }
        a7.h hVar = this.f13618d;
        if (hVar != null) {
            pVarX.g(objO, gVar, d0Var, hVar);
        } else {
            pVarX.f(objO, gVar, d0Var);
        }
    }

    @Override // p6.p
    public void g(Object obj, e6.g gVar, p6.d0 d0Var, a7.h hVar) throws IOException {
        Object objO;
        try {
            objO = this.f13617c.o(obj);
        } catch (Exception e10) {
            w(d0Var, e10, obj, this.f13617c.d() + "()");
            objO = null;
        }
        if (objO == null) {
            d0Var.N(gVar);
            return;
        }
        p6.p pVarX = this.f13619e;
        if (pVarX == null) {
            pVarX = x(d0Var, objO.getClass());
        } else if (this.f13622h) {
            n6.c cVarG = hVar.g(gVar, hVar.d(obj, e6.m.VALUE_STRING));
            pVarX.f(objO, gVar, d0Var);
            hVar.h(gVar, cVarG);
            return;
        }
        pVarX.g(objO, gVar, d0Var, new a(hVar, obj));
    }

    public String toString() {
        return "(@JsonValue serializer for method " + this.f13617c.k() + "#" + this.f13617c.d() + ")";
    }

    protected p6.p x(p6.d0 d0Var, Class cls) {
        p6.p pVarJ = this.f13623r.j(cls);
        if (pVarJ != null) {
            return pVarJ;
        }
        if (!this.f13621g.z()) {
            p6.p pVarA0 = d0Var.a0(cls, this.f13620f);
            this.f13623r = this.f13623r.b(cls, pVarA0).f12864b;
            return pVarA0;
        }
        JavaType javaTypeG = d0Var.G(this.f13621g, cls);
        p6.p pVarZ = d0Var.Z(javaTypeG, this.f13620f);
        this.f13623r = this.f13623r.a(javaTypeG, pVarZ).f12864b;
        return pVarZ;
    }

    public s(s sVar, p6.d dVar, a7.h hVar, p6.p pVar, boolean z10) {
        super(z(sVar.c()));
        this.f13617c = sVar.f13617c;
        this.f13621g = sVar.f13621g;
        this.f13618d = hVar;
        this.f13619e = pVar;
        this.f13620f = dVar;
        this.f13622h = z10;
        this.f13623r = f7.k.c();
    }
}
