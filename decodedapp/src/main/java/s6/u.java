package s6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.io.Serializable;
import p6.y;
import x6.e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends x6.x implements Serializable {

    /* JADX INFO: renamed from: w */
    protected static final p6.l f26961w = new t6.h("No _valueDeserializer assigned");

    /* JADX INFO: renamed from: c */
    protected final y f26962c;

    /* JADX INFO: renamed from: d */
    protected final JavaType f26963d;

    /* JADX INFO: renamed from: e */
    protected final y f26964e;

    /* JADX INFO: renamed from: f */
    protected final transient i7.b f26965f;

    /* JADX INFO: renamed from: g */
    protected final p6.l f26966g;

    /* JADX INFO: renamed from: h */
    protected final a7.e f26967h;

    /* JADX INFO: renamed from: r */
    protected final r f26968r;

    /* JADX INFO: renamed from: s */
    protected String f26969s;

    /* JADX INFO: renamed from: t */
    protected e0 f26970t;

    /* JADX INFO: renamed from: u */
    protected i7.e0 f26971u;

    /* JADX INFO: renamed from: v */
    protected int f26972v;

    public static abstract class a extends u {

        /* JADX INFO: renamed from: x */
        protected final u f26973x;

        protected a(u uVar) {
            super(uVar);
            this.f26973x = uVar;
        }

        @Override // s6.u
        public boolean A() {
            return this.f26973x.A();
        }

        @Override // s6.u
        public boolean C() {
            return this.f26973x.C();
        }

        @Override // s6.u
        public boolean D() {
            return this.f26973x.D();
        }

        @Override // s6.u
        public boolean H() {
            return this.f26973x.H();
        }

        @Override // s6.u
        public void L(Object obj, Object obj2) {
            this.f26973x.L(obj, obj2);
        }

        @Override // s6.u
        public Object N(Object obj, Object obj2) {
            return this.f26973x.N(obj, obj2);
        }

        @Override // s6.u
        public boolean S(Class cls) {
            return this.f26973x.S(cls);
        }

        @Override // s6.u
        public u T(y yVar) {
            return Z(this.f26973x.T(yVar));
        }

        @Override // s6.u
        public u W(r rVar) {
            return Z(this.f26973x.W(rVar));
        }

        @Override // s6.u
        public u Y(p6.l lVar) {
            return Z(this.f26973x.Y(lVar));
        }

        protected u Z(u uVar) {
            return uVar == this.f26973x ? this : a0(uVar);
        }

        protected abstract u a0(u uVar);

        @Override // s6.u, p6.d
        public x6.k h() {
            return this.f26973x.h();
        }

        @Override // s6.u
        public void k(int i10) {
            this.f26973x.k(i10);
        }

        @Override // s6.u
        public void q(p6.g gVar) {
            this.f26973x.q(gVar);
        }

        @Override // s6.u
        public int r() {
            return this.f26973x.r();
        }

        @Override // s6.u
        public Object s() {
            return this.f26973x.s();
        }

        @Override // s6.u
        public String t() {
            return this.f26973x.t();
        }

        @Override // s6.u
        public e0 w() {
            return this.f26973x.w();
        }

        @Override // s6.u
        public p6.l x() {
            return this.f26973x.x();
        }

        @Override // s6.u
        public a7.e z() {
            return this.f26973x.z();
        }
    }

    protected u(x6.u uVar, JavaType javaType, a7.e eVar, i7.b bVar) {
        this(uVar.a(), javaType, uVar.D(), eVar, bVar, uVar.d());
    }

    public boolean A() {
        p6.l lVar = this.f26966g;
        return (lVar == null || lVar == f26961w) ? false : true;
    }

    public boolean C() {
        return this.f26967h != null;
    }

    public boolean D() {
        return this.f26971u != null;
    }

    public boolean G() {
        return false;
    }

    public boolean H() {
        return false;
    }

    public abstract void L(Object obj, Object obj2);

    public abstract Object N(Object obj, Object obj2);

    public void O(String str) {
        this.f26969s = str;
    }

    public void Q(e0 e0Var) {
        this.f26970t = e0Var;
    }

    public void R(Class[] clsArr) {
        if (clsArr == null) {
            this.f26971u = null;
        } else {
            this.f26971u = i7.e0.a(clsArr);
        }
    }

    public boolean S(Class cls) {
        i7.e0 e0Var = this.f26971u;
        return e0Var == null || e0Var.b(cls);
    }

    public abstract u T(y yVar);

    public abstract u W(r rVar);

    public u X(String str) {
        y yVar = this.f26962c;
        y yVar2 = yVar == null ? new y(str) : yVar.j(str);
        return yVar2 == this.f26962c ? this : T(yVar2);
    }

    public abstract u Y(p6.l lVar);

    @Override // p6.d
    public y a() {
        return this.f26962c;
    }

    protected IOException g(e6.j jVar, Exception exc) throws IOException {
        i7.h.j0(exc);
        i7.h.k0(exc);
        Throwable thF = i7.h.F(exc);
        throw p6.m.k(jVar, i7.h.o(thF), thF);
    }

    @Override // p6.d, i7.t
    public final String getName() {
        return this.f26962c.c();
    }

    @Override // p6.d
    public JavaType getType() {
        return this.f26963d;
    }

    @Override // p6.d
    public abstract x6.k h();

    protected void i(e6.j jVar, Exception exc, Object obj) throws IOException {
        if (!(exc instanceof IllegalArgumentException)) {
            g(jVar, exc);
            return;
        }
        String strH = i7.h.h(obj);
        StringBuilder sb2 = new StringBuilder("Problem deserializing property '");
        sb2.append(getName());
        sb2.append("' (expected type: ");
        sb2.append(getType());
        sb2.append("; actual type: ");
        sb2.append(strH);
        sb2.append(")");
        String strO = i7.h.o(exc);
        if (strO != null) {
            sb2.append(", problem: ");
            sb2.append(strO);
        } else {
            sb2.append(" (no error message provided)");
        }
        throw p6.m.k(jVar, sb2.toString(), exc);
    }

    protected void j(Exception exc, Object obj) throws IOException {
        i(null, exc, obj);
    }

    public void k(int i10) {
        if (this.f26972v == -1) {
            this.f26972v = i10;
            return;
        }
        throw new IllegalStateException("Property '" + getName() + "' already had index (" + this.f26972v + "), trying to assign " + i10);
    }

    public final Object l(e6.j jVar, p6.h hVar) {
        if (jVar.N0(e6.m.VALUE_NULL)) {
            return this.f26968r.a(hVar);
        }
        a7.e eVar = this.f26967h;
        if (eVar != null) {
            return this.f26966g.g(jVar, hVar, eVar);
        }
        Object objE = this.f26966g.e(jVar, hVar);
        return objE == null ? this.f26968r.a(hVar) : objE;
    }

    public abstract void n(e6.j jVar, p6.h hVar, Object obj);

    public abstract Object o(e6.j jVar, p6.h hVar, Object obj);

    public final Object p(e6.j jVar, p6.h hVar, Object obj) throws v6.b {
        if (jVar.N0(e6.m.VALUE_NULL)) {
            if (!t6.q.d(this.f26968r)) {
                return this.f26968r.a(hVar);
            }
        } else {
            if (this.f26967h != null) {
                return hVar.Q(hVar.l().R(obj.getClass()), this).f(jVar, hVar, obj);
            }
            Object objF = this.f26966g.f(jVar, hVar, obj);
            if (objF != null) {
                return objF;
            }
            if (!t6.q.d(this.f26968r)) {
                return this.f26968r.a(hVar);
            }
        }
        return obj;
    }

    public int r() {
        throw new IllegalStateException(String.format("Internal error: no creator index for property '%s' (of type %s)", getName(), getClass().getName()));
    }

    public Object s() {
        return null;
    }

    public String t() {
        return this.f26969s;
    }

    public String toString() {
        return "[property '" + getName() + "']";
    }

    public r v() {
        return this.f26968r;
    }

    public e0 w() {
        return this.f26970t;
    }

    public p6.l x() {
        p6.l lVar = this.f26966g;
        if (lVar == f26961w) {
            return null;
        }
        return lVar;
    }

    public a7.e z() {
        return this.f26967h;
    }

    protected u(y yVar, JavaType javaType, y yVar2, a7.e eVar, i7.b bVar, p6.x xVar) {
        super(xVar);
        this.f26972v = -1;
        if (yVar == null) {
            this.f26962c = y.f24080e;
        } else {
            this.f26962c = yVar.g();
        }
        this.f26963d = javaType;
        this.f26964e = yVar2;
        this.f26965f = bVar;
        this.f26971u = null;
        this.f26967h = eVar != null ? eVar.g(this) : eVar;
        p6.l lVar = f26961w;
        this.f26966g = lVar;
        this.f26968r = lVar;
    }

    protected u(y yVar, JavaType javaType, p6.x xVar, p6.l lVar) {
        super(xVar);
        this.f26972v = -1;
        if (yVar == null) {
            this.f26962c = y.f24080e;
        } else {
            this.f26962c = yVar.g();
        }
        this.f26963d = javaType;
        this.f26964e = null;
        this.f26965f = null;
        this.f26971u = null;
        this.f26967h = null;
        this.f26966g = lVar;
        this.f26968r = lVar;
    }

    public void K() {
    }

    public void q(p6.g gVar) {
    }

    protected u(u uVar) {
        super(uVar);
        this.f26972v = -1;
        this.f26962c = uVar.f26962c;
        this.f26963d = uVar.f26963d;
        this.f26964e = uVar.f26964e;
        this.f26965f = uVar.f26965f;
        this.f26966g = uVar.f26966g;
        this.f26967h = uVar.f26967h;
        this.f26969s = uVar.f26969s;
        this.f26972v = uVar.f26972v;
        this.f26971u = uVar.f26971u;
        this.f26970t = uVar.f26970t;
        this.f26968r = uVar.f26968r;
    }

    protected u(u uVar, p6.l lVar, r rVar) {
        super(uVar);
        this.f26972v = -1;
        this.f26962c = uVar.f26962c;
        this.f26963d = uVar.f26963d;
        this.f26964e = uVar.f26964e;
        this.f26965f = uVar.f26965f;
        this.f26967h = uVar.f26967h;
        this.f26969s = uVar.f26969s;
        this.f26972v = uVar.f26972v;
        if (lVar == null) {
            this.f26966g = f26961w;
        } else {
            this.f26966g = lVar;
        }
        this.f26971u = uVar.f26971u;
        this.f26970t = uVar.f26970t;
        this.f26968r = rVar == f26961w ? this.f26966g : rVar;
    }

    protected u(u uVar, y yVar) {
        super(uVar);
        this.f26972v = -1;
        this.f26962c = yVar;
        this.f26963d = uVar.f26963d;
        this.f26964e = uVar.f26964e;
        this.f26965f = uVar.f26965f;
        this.f26966g = uVar.f26966g;
        this.f26967h = uVar.f26967h;
        this.f26969s = uVar.f26969s;
        this.f26972v = uVar.f26972v;
        this.f26971u = uVar.f26971u;
        this.f26970t = uVar.f26970t;
        this.f26968r = uVar.f26968r;
    }
}
