package u6;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends c0 implements s6.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final JavaType f28377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final s6.w f28378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final a7.e f28379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final p6.l f28380h;

    public z(JavaType javaType, s6.w wVar, a7.e eVar, p6.l lVar) {
        super(javaType);
        this.f28378f = wVar;
        this.f28377e = javaType;
        this.f28380h = lVar;
        this.f28379g = eVar;
    }

    @Override // u6.c0
    public s6.w W0() {
        return this.f28378f;
    }

    @Override // u6.c0
    public JavaType X0() {
        return this.f28377e;
    }

    @Override // p6.l, s6.r
    public abstract Object a(p6.h hVar);

    @Override // s6.i
    public p6.l d(p6.h hVar, p6.d dVar) {
        p6.l lVar = this.f28380h;
        p6.l lVarQ = lVar == null ? hVar.Q(this.f28377e.a(), dVar) : hVar.p0(lVar, dVar, this.f28377e.a());
        a7.e eVarG = this.f28379g;
        if (eVarG != null) {
            eVarG = eVarG.g(dVar);
        }
        return (lVarQ == this.f28380h && eVarG == this.f28379g) ? this : h1(eVarG, lVarQ);
    }

    @Override // p6.l
    public Object e(e6.j jVar, p6.h hVar) {
        s6.w wVar = this.f28378f;
        if (wVar != null) {
            return f(jVar, hVar, wVar.A(hVar));
        }
        a7.e eVar = this.f28379g;
        return f1(eVar == null ? this.f28380h.e(jVar, hVar) : this.f28380h.g(jVar, hVar, eVar));
    }

    public abstract Object e1(Object obj);

    @Override // p6.l
    public Object f(e6.j jVar, p6.h hVar, Object obj) throws v6.b {
        Object objE;
        if (this.f28380h.s(hVar.k()).equals(Boolean.FALSE) || this.f28379g != null) {
            a7.e eVar = this.f28379g;
            objE = eVar == null ? this.f28380h.e(jVar, hVar) : this.f28380h.g(jVar, hVar, eVar);
        } else {
            Object objE1 = e1(obj);
            if (objE1 == null) {
                a7.e eVar2 = this.f28379g;
                return f1(eVar2 == null ? this.f28380h.e(jVar, hVar) : this.f28380h.g(jVar, hVar, eVar2));
            }
            objE = this.f28380h.f(jVar, hVar, objE1);
        }
        return g1(obj, objE);
    }

    public abstract Object f1(Object obj);

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        if (jVar.N0(e6.m.VALUE_NULL)) {
            return a(hVar);
        }
        a7.e eVar2 = this.f28379g;
        return eVar2 == null ? e(jVar, hVar) : f1(eVar2.c(jVar, hVar));
    }

    public abstract Object g1(Object obj, Object obj2);

    protected abstract z h1(a7.e eVar, p6.l lVar);

    @Override // p6.l
    public i7.a j() {
        return i7.a.DYNAMIC;
    }

    @Override // p6.l
    public h7.c r() {
        p6.l lVar = this.f28380h;
        return lVar != null ? lVar.r() : super.r();
    }
}
