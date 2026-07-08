package t6;

import t6.z;

/* JADX INFO: loaded from: classes.dex */
public class t extends s6.u {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final s6.u f27541x;

    public static final class a extends z.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t f27542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f27543d;

        public a(t tVar, s6.v vVar, Class cls, Object obj) {
            super(vVar, cls);
            this.f27542c = tVar;
            this.f27543d = obj;
        }
    }

    public t(s6.u uVar, x6.e0 e0Var) {
        super(uVar);
        this.f27541x = uVar;
        this.f26970t = e0Var;
    }

    @Override // s6.u
    public void L(Object obj, Object obj2) {
        this.f27541x.L(obj, obj2);
    }

    @Override // s6.u
    public Object N(Object obj, Object obj2) {
        return this.f27541x.N(obj, obj2);
    }

    @Override // s6.u
    public s6.u T(p6.y yVar) {
        return new t(this, yVar);
    }

    @Override // s6.u
    public s6.u W(s6.r rVar) {
        return new t(this, this.f26966g, rVar);
    }

    @Override // s6.u
    public s6.u Y(p6.l lVar) {
        p6.l lVar2 = this.f26966g;
        if (lVar2 == lVar) {
            return this;
        }
        s6.r rVar = this.f26968r;
        if (lVar2 == rVar) {
            rVar = lVar;
        }
        return new t(this, lVar, rVar);
    }

    @Override // s6.u, p6.d
    public x6.k h() {
        return this.f27541x.h();
    }

    @Override // s6.u
    public void n(e6.j jVar, p6.h hVar, Object obj) throws p6.m {
        o(jVar, hVar, obj);
    }

    @Override // s6.u
    public Object o(e6.j jVar, p6.h hVar, Object obj) throws p6.m {
        try {
            return N(obj, l(jVar, hVar));
        } catch (s6.v e10) {
            if (this.f26970t == null && this.f26966g.o() == null) {
                throw p6.m.k(jVar, "Unresolved forward reference but no identity info", e10);
            }
            e10.w().a(new a(this, e10, this.f26963d.r(), obj));
            return null;
        }
    }

    @Override // s6.u
    public void q(p6.g gVar) {
        s6.u uVar = this.f27541x;
        if (uVar != null) {
            uVar.q(gVar);
        }
    }

    @Override // s6.u
    public int r() {
        return this.f27541x.r();
    }

    public t(t tVar, p6.l lVar, s6.r rVar) {
        super(tVar, lVar, rVar);
        this.f27541x = tVar.f27541x;
        this.f26970t = tVar.f26970t;
    }

    public t(t tVar, p6.y yVar) {
        super(tVar, yVar);
        this.f27541x = tVar.f27541x;
        this.f26970t = tVar.f26970t;
    }
}
