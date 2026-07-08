package r6;

import com.fasterxml.jackson.databind.JavaType;
import d6.b0;
import d6.f;
import d6.k;
import d6.p;
import d6.r;
import d6.s;
import java.io.Serializable;
import p6.y;
import x6.i0;
import x6.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends q implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected static final g f25573v = g.a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f25574w = p6.r.e();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f25575x = (((p6.r.AUTO_DETECT_FIELDS.g() | p6.r.AUTO_DETECT_GETTERS.g()) | p6.r.AUTO_DETECT_IS_GETTERS.g()) | p6.r.AUTO_DETECT_SETTERS.g()) | p6.r.AUTO_DETECT_CREATORS.g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final i0 f25576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final a7.d f25577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final y f25578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Class f25579h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final j f25580r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final i7.y f25581s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final h f25582t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final l f25583u;

    protected r(a aVar, a7.d dVar, i0 i0Var, i7.y yVar, h hVar, l lVar) {
        super(aVar, f25574w);
        this.f25576e = i0Var;
        this.f25577f = dVar;
        this.f25581s = yVar;
        this.f25578g = null;
        this.f25579h = null;
        this.f25580r = j.b();
        this.f25582t = hVar;
        this.f25583u = lVar;
    }

    protected abstract r S(long j10);

    public y T(JavaType javaType) {
        y yVar = this.f25578g;
        return yVar != null ? yVar : this.f25581s.a(javaType, this);
    }

    public y W(Class cls) {
        y yVar = this.f25578g;
        return yVar != null ? yVar : this.f25581s.b(cls, this);
    }

    public final Class X() {
        return this.f25579h;
    }

    public final j Y() {
        return this.f25580r;
    }

    public final l Z() {
        return this.f25583u;
    }

    @Override // x6.v.a
    public final Class a(Class cls) {
        return this.f25576e.a(cls);
    }

    public Boolean a0(Class cls) {
        Boolean boolG;
        g gVarB = this.f25582t.b(cls);
        return (gVarB == null || (boolG = gVarB.g()) == null) ? this.f25582t.d() : boolG;
    }

    public final p.a b0(Class cls) {
        p.a aVarC;
        g gVarB = this.f25582t.b(cls);
        if (gVarB == null || (aVarC = gVarB.c()) == null) {
            return null;
        }
        return aVarC;
    }

    public final p.a c0(Class cls, x6.d dVar) {
        p6.b bVarG = g();
        return p.a.k(bVarG == null ? null : bVarG.X(this, dVar), b0(cls));
    }

    public final r.b d0() {
        return this.f25582t.c();
    }

    public final s.a e0(Class cls, x6.d dVar) {
        p6.b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        return bVarG.a0(this, dVar);
    }

    public final l0 f0() {
        l0 l0VarF = this.f25582t.f();
        long j10 = this.f25571a;
        long j11 = f25575x;
        if ((j10 & j11) == j11) {
            return l0VarF;
        }
        if (!L(p6.r.AUTO_DETECT_FIELDS)) {
            l0VarF = l0VarF.h(f.c.NONE);
        }
        if (!L(p6.r.AUTO_DETECT_GETTERS)) {
            l0VarF = l0VarF.j(f.c.NONE);
        }
        if (!L(p6.r.AUTO_DETECT_IS_GETTERS)) {
            l0VarF = l0VarF.k(f.c.NONE);
        }
        if (!L(p6.r.AUTO_DETECT_SETTERS)) {
            l0VarF = l0VarF.c(f.c.NONE);
        }
        return !L(p6.r.AUTO_DETECT_CREATORS) ? l0VarF.i(f.c.NONE) : l0VarF;
    }

    public final y g0() {
        return this.f25578g;
    }

    public final a7.d h0() {
        return this.f25577f;
    }

    public final r i0(p6.r... rVarArr) {
        long jG = this.f25571a;
        for (p6.r rVar : rVarArr) {
            jG |= rVar.g();
        }
        return jG == this.f25571a ? this : S(jG);
    }

    @Override // r6.q
    public final g j(Class cls) {
        g gVarB = this.f25582t.b(cls);
        return gVarB == null ? f25573v : gVarB;
    }

    public final r j0(p6.r... rVarArr) {
        long j10 = this.f25571a;
        for (p6.r rVar : rVarArr) {
            j10 &= ~rVar.g();
        }
        return j10 == this.f25571a ? this : S(j10);
    }

    @Override // r6.q
    public final r.b l(Class cls, Class cls2) {
        r.b bVarE = j(cls2).e();
        r.b bVarQ = q(cls);
        return bVarQ == null ? bVarE : bVarQ.n(bVarE);
    }

    @Override // r6.q
    public Boolean o() {
        return this.f25582t.d();
    }

    @Override // r6.q
    public final k.d p(Class cls) {
        return this.f25582t.a(cls);
    }

    @Override // r6.q
    public final r.b q(Class cls) {
        r.b bVarD = j(cls).d();
        r.b bVarD0 = d0();
        return bVarD0 == null ? bVarD : bVarD0.n(bVarD);
    }

    @Override // r6.q
    public final b0.a s() {
        return this.f25582t.e();
    }

    @Override // r6.q
    public final l0 v(Class cls, x6.d dVar) {
        l0 l0VarP = i7.h.N(cls) ? l0.a.p() : f0();
        p6.b bVarG = g();
        if (bVarG != null) {
            l0VarP = bVarG.e(dVar, l0VarP);
        }
        g gVarB = this.f25582t.b(cls);
        if (gVarB == null) {
            return l0VarP;
        }
        gVarB.i();
        return l0VarP.e(null);
    }

    protected r(r rVar, long j10) {
        super(rVar, j10);
        this.f25576e = rVar.f25576e;
        this.f25577f = rVar.f25577f;
        this.f25581s = rVar.f25581s;
        this.f25578g = rVar.f25578g;
        this.f25579h = rVar.f25579h;
        this.f25580r = rVar.f25580r;
        this.f25582t = rVar.f25582t;
        this.f25583u = rVar.f25583u;
    }
}
