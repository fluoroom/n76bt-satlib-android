package t6;

import d6.k0;

/* JADX INFO: loaded from: classes.dex */
public final class u extends s6.u {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final s f27544x;

    public u(s sVar, p6.x xVar) {
        super(sVar.f27537b, sVar.c(), xVar, sVar.b());
        this.f27544x = sVar;
    }

    @Override // s6.u
    public void L(Object obj, Object obj2) {
        N(obj, obj2);
    }

    @Override // s6.u
    public Object N(Object obj, Object obj2) {
        s6.u uVar = this.f27544x.f27540e;
        if (uVar != null) {
            return uVar.N(obj, obj2);
        }
        throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
    }

    @Override // s6.u
    public s6.u T(p6.y yVar) {
        return new u(this, yVar);
    }

    @Override // s6.u
    public s6.u W(s6.r rVar) {
        return new u(this, this.f26966g, rVar);
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
        return new u(this, lVar, rVar);
    }

    @Override // s6.u, p6.d
    public x6.k h() {
        return null;
    }

    @Override // s6.u
    public void n(e6.j jVar, p6.h hVar, Object obj) {
        o(jVar, hVar, obj);
    }

    @Override // s6.u
    public Object o(e6.j jVar, p6.h hVar, Object obj) {
        if (jVar.N0(e6.m.VALUE_NULL)) {
            return null;
        }
        Object objE = this.f26966g.e(jVar, hVar);
        s sVar = this.f27544x;
        k0 k0Var = sVar.f27538c;
        sVar.getClass();
        hVar.W(objE, k0Var, null).b(obj);
        s6.u uVar = this.f27544x.f27540e;
        return uVar != null ? uVar.N(obj, objE) : obj;
    }

    protected u(u uVar, p6.l lVar, s6.r rVar) {
        super(uVar, lVar, rVar);
        this.f27544x = uVar.f27544x;
    }

    protected u(u uVar, p6.y yVar) {
        super(uVar, yVar);
        this.f27544x = uVar.f27544x;
    }
}
