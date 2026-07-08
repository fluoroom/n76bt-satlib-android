package p6;

import com.fasterxml.jackson.databind.JavaType;
import d6.k;
import d6.k0;
import d6.r;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 extends e {

    /* JADX INFO: renamed from: v */
    public static final p f23959v = new f7.c("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");

    /* JADX INFO: renamed from: w */
    protected static final p f23960w = new f7.q();

    /* JADX INFO: renamed from: a */
    protected final b0 f23961a;

    /* JADX INFO: renamed from: b */
    protected final Class f23962b;

    /* JADX INFO: renamed from: c */
    protected final e7.q f23963c;

    /* JADX INFO: renamed from: d */
    protected final e7.p f23964d;

    /* JADX INFO: renamed from: e */
    protected transient r6.j f23965e;

    /* JADX INFO: renamed from: f */
    protected p f23966f;

    /* JADX INFO: renamed from: g */
    protected p f23967g;

    /* JADX INFO: renamed from: h */
    protected p f23968h;

    /* JADX INFO: renamed from: r */
    protected p f23969r;

    /* JADX INFO: renamed from: s */
    protected final f7.m f23970s;

    /* JADX INFO: renamed from: t */
    protected DateFormat f23971t;

    /* JADX INFO: renamed from: u */
    protected final boolean f23972u;

    public d0() {
        this.f23966f = f23960w;
        this.f23968h = g7.u.f13642c;
        this.f23969r = f23959v;
        this.f23961a = null;
        this.f23963c = null;
        this.f23964d = new e7.p();
        this.f23970s = null;
        this.f23962b = null;
        this.f23965e = null;
        this.f23972u = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected p A(p pVar) {
        if (pVar instanceof e7.o) {
            ((e7.o) pVar).b(this);
        }
        return pVar;
    }

    public m A0(String str, Object... objArr) {
        return m.i(p0(), b(str, objArr));
    }

    public Object B0(Class cls, String str, Throwable th2) throws m {
        throw v6.b.v(p0(), str, i(cls)).q(th2);
    }

    protected void C(Object obj, JavaType javaType) throws v6.b {
        if (javaType.W() && i7.h.p0(javaType.r()).isAssignableFrom(obj.getClass())) {
            return;
        }
        q(javaType, String.format("Incompatible types: declared root type (%s) vs %s", javaType, i7.h.h(obj)));
    }

    public Object C0(c cVar, x6.u uVar, String str, Object... objArr) throws v6.b {
        throw v6.b.w(p0(), String.format("Invalid definition for property %s (of type %s): %s", uVar != null ? c(uVar.getName()) : "N/A", cVar != null ? i7.h.Y(cVar.q()) : "N/A", b(str, objArr)), cVar, uVar);
    }

    public final boolean D() {
        return this.f23961a.b();
    }

    public Object D0(c cVar, String str, Object... objArr) throws v6.b {
        throw v6.b.w(p0(), String.format("Invalid type definition for type %s: %s", cVar != null ? i7.h.Y(cVar.q()) : "N/A", b(str, objArr)), cVar, null);
    }

    public void E0(String str, Object... objArr) throws m {
        throw A0(str, objArr);
    }

    public void F0(Throwable th2, String str, Object... objArr) throws m {
        throw m.j(p0(), b(str, objArr), th2);
    }

    public JavaType G(JavaType javaType, Class cls) {
        return javaType.C(cls) ? javaType : k().D().Q(javaType, cls, true);
    }

    public abstract p G0(x6.b bVar, Object obj);

    public void H(long j10, e6.g gVar) {
        if (y0(c0.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            gVar.D0(String.valueOf(j10));
        } else {
            gVar.D0(x().format(new Date(j10)));
        }
    }

    public d0 H0(Object obj, Object obj2) {
        this.f23965e = this.f23965e.c(obj, obj2);
        return this;
    }

    public void K(Date date, e6.g gVar) {
        if (y0(c0.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            gVar.D0(String.valueOf(date.getTime()));
        } else {
            gVar.D0(x().format(date));
        }
    }

    public final void L(Date date, e6.g gVar) {
        if (y0(c0.WRITE_DATES_AS_TIMESTAMPS)) {
            gVar.I0(date.getTime());
        } else {
            gVar.d1(x().format(date));
        }
    }

    public final void N(e6.g gVar) {
        if (this.f23972u) {
            gVar.E0();
        } else {
            this.f23968h.f(null, gVar, this);
        }
    }

    public final void O(Object obj, e6.g gVar) {
        if (obj != null) {
            c0(obj.getClass(), true, null).f(obj, gVar, this);
        } else if (this.f23972u) {
            gVar.E0();
        } else {
            this.f23968h.f(null, gVar, this);
        }
    }

    public p Q(JavaType javaType, d dVar) {
        p pVarF = this.f23970s.f(javaType);
        return (pVarF == null && (pVarF = this.f23964d.i(javaType)) == null && (pVarF = t(javaType)) == null) ? s0(javaType.r()) : u0(pVarF, dVar);
    }

    public p R(Class cls, d dVar) {
        p pVarG = this.f23970s.g(cls);
        return (pVarG == null && (pVarG = this.f23964d.j(cls)) == null && (pVarG = this.f23964d.i(this.f23961a.e(cls))) == null && (pVarG = v(cls)) == null) ? s0(cls) : u0(pVarG, dVar);
    }

    public p S(JavaType javaType, d dVar) {
        return z(this.f23963c.a(this, javaType, this.f23967g), dVar);
    }

    public p T(Class cls, d dVar) {
        return S(this.f23961a.e(cls), dVar);
    }

    public p W(JavaType javaType, d dVar) {
        return this.f23969r;
    }

    public p X(d dVar) {
        return this.f23968h;
    }

    public abstract f7.u Y(Object obj, k0 k0Var);

    public p Z(JavaType javaType, d dVar) {
        p pVarF = this.f23970s.f(javaType);
        return (pVarF == null && (pVarF = this.f23964d.i(javaType)) == null && (pVarF = t(javaType)) == null) ? s0(javaType.r()) : t0(pVarF, dVar);
    }

    public p a0(Class cls, d dVar) {
        p pVarG = this.f23970s.g(cls);
        return (pVarG == null && (pVarG = this.f23964d.j(cls)) == null && (pVarG = this.f23964d.i(this.f23961a.e(cls))) == null && (pVarG = v(cls)) == null) ? s0(cls) : t0(pVarG, dVar);
    }

    public p b0(JavaType javaType, boolean z10, d dVar) throws m {
        p pVarD = this.f23970s.d(javaType);
        if (pVarD != null) {
            return pVarD;
        }
        p pVarG = this.f23964d.g(javaType);
        if (pVarG != null) {
            return pVarG;
        }
        p pVarE0 = e0(javaType, dVar);
        a7.h hVarC = this.f23963c.c(this.f23961a, javaType);
        if (hVarC != null) {
            pVarE0 = new f7.p(hVarC.a(dVar), pVarE0);
        }
        if (z10) {
            this.f23964d.d(javaType, pVarE0);
        }
        return pVarE0;
    }

    public p c0(Class cls, boolean z10, d dVar) {
        p pVarE = this.f23970s.e(cls);
        if (pVarE != null) {
            return pVarE;
        }
        p pVarH = this.f23964d.h(cls);
        if (pVarH != null) {
            return pVarH;
        }
        p pVarG0 = g0(cls, dVar);
        e7.q qVar = this.f23963c;
        b0 b0Var = this.f23961a;
        a7.h hVarC = qVar.c(b0Var, b0Var.e(cls));
        if (hVarC != null) {
            pVarG0 = new f7.p(hVarC.a(dVar), pVarG0);
        }
        if (z10) {
            this.f23964d.e(cls, pVarG0);
        }
        return pVarG0;
    }

    public p d0(JavaType javaType) {
        p pVarF = this.f23970s.f(javaType);
        return (pVarF == null && (pVarF = this.f23964d.i(javaType)) == null && (pVarF = t(javaType)) == null) ? s0(javaType.r()) : pVarF;
    }

    public p e0(JavaType javaType, d dVar) throws m {
        if (javaType == null) {
            E0("Null passed for `valueType` of `findValueSerializer()`", new Object[0]);
        }
        p pVarF = this.f23970s.f(javaType);
        return (pVarF == null && (pVarF = this.f23964d.i(javaType)) == null && (pVarF = t(javaType)) == null) ? s0(javaType.r()) : u0(pVarF, dVar);
    }

    public p f0(Class cls) {
        p pVarG = this.f23970s.g(cls);
        return (pVarG == null && (pVarG = this.f23964d.j(cls)) == null && (pVarG = this.f23964d.i(this.f23961a.e(cls))) == null && (pVarG = v(cls)) == null) ? s0(cls) : pVarG;
    }

    public p g0(Class cls, d dVar) {
        p pVarG = this.f23970s.g(cls);
        return (pVarG == null && (pVarG = this.f23964d.j(cls)) == null && (pVarG = this.f23964d.i(this.f23961a.e(cls))) == null && (pVarG = v(cls)) == null) ? s0(cls) : u0(pVarG, dVar);
    }

    public final Class h0() {
        return this.f23962b;
    }

    public final b i0() {
        return this.f23961a.g();
    }

    public Object j0(Object obj) {
        return this.f23965e.a(obj);
    }

    @Override // p6.e
    /* JADX INFO: renamed from: k0 */
    public final b0 k() {
        return this.f23961a;
    }

    @Override // p6.e
    public final com.fasterxml.jackson.databind.type.c l() {
        return this.f23961a.D();
    }

    public p l0() {
        return this.f23968h;
    }

    public final k.d m0(Class cls) {
        return this.f23961a.p(cls);
    }

    @Override // p6.e
    public m n(JavaType javaType, String str, String str2) {
        return v6.e.z(null, a(String.format("Could not resolve type id '%s' as a subtype of %s", str, i7.h.G(javaType)), str2), javaType, str);
    }

    public final r.b n0(Class cls) {
        return this.f23961a.q(cls);
    }

    public final e7.k o0() {
        this.f23961a.n0();
        return null;
    }

    public abstract e6.g p0();

    @Override // p6.e
    public Object q(JavaType javaType, String str) throws v6.b {
        throw v6.b.v(p0(), str, javaType);
    }

    public Locale q0() {
        return this.f23961a.x();
    }

    public TimeZone r0() {
        return this.f23961a.C();
    }

    public p s0(Class cls) {
        return cls == Object.class ? this.f23966f : new f7.q(cls);
    }

    protected p t(JavaType javaType) throws m {
        p pVarW;
        try {
            pVarW = w(javaType);
        } catch (IllegalArgumentException e10) {
            F0(e10, i7.h.o(e10), new Object[0]);
            pVarW = null;
        }
        if (pVarW != null) {
            this.f23964d.b(javaType, pVarW, this);
        }
        return pVarW;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p t0(p pVar, d dVar) {
        return (pVar == 0 || !(pVar instanceof e7.i)) ? pVar : ((e7.i) pVar).a(this, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p u0(p pVar, d dVar) {
        return (pVar == 0 || !(pVar instanceof e7.i)) ? pVar : ((e7.i) pVar).a(this, dVar);
    }

    protected p v(Class cls) throws v6.b {
        p pVarW;
        JavaType javaTypeE = this.f23961a.e(cls);
        try {
            pVarW = w(javaTypeE);
        } catch (IllegalArgumentException e10) {
            q(javaTypeE, i7.h.o(e10));
            pVarW = null;
        }
        if (pVarW != null) {
            this.f23964d.c(cls, javaTypeE, pVarW, this);
        }
        return pVarW;
    }

    public abstract Object v0(x6.u uVar, Class cls);

    protected p w(JavaType javaType) {
        return this.f23963c.b(this, javaType);
    }

    public abstract boolean w0(Object obj);

    protected final DateFormat x() {
        DateFormat dateFormat = this.f23971t;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.f23961a.k().clone();
        this.f23971t = dateFormat2;
        return dateFormat2;
    }

    public final boolean x0(r rVar) {
        return this.f23961a.L(rVar);
    }

    public final boolean y0(c0 c0Var) {
        return this.f23961a.q0(c0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected p z(p pVar, d dVar) {
        if (pVar instanceof e7.o) {
            ((e7.o) pVar).b(this);
        }
        return u0(pVar, dVar);
    }

    public final boolean z0(r6.k kVar) {
        return this.f23961a.N(kVar);
    }

    protected d0(d0 d0Var, b0 b0Var, e7.q qVar) {
        this.f23966f = f23960w;
        this.f23968h = g7.u.f13642c;
        p pVar = f23959v;
        this.f23969r = pVar;
        this.f23963c = qVar;
        this.f23961a = b0Var;
        e7.p pVar2 = d0Var.f23964d;
        this.f23964d = pVar2;
        this.f23966f = d0Var.f23966f;
        this.f23967g = d0Var.f23967g;
        p pVar3 = d0Var.f23968h;
        this.f23968h = pVar3;
        this.f23969r = d0Var.f23969r;
        this.f23972u = pVar3 == pVar;
        this.f23962b = b0Var.X();
        this.f23965e = b0Var.Y();
        this.f23970s = pVar2.f();
    }
}
