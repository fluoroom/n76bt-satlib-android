package u6;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends c0 implements s6.i, s6.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final i7.j f28195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final JavaType f28196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final p6.l f28197g;

    public b0(i7.j jVar) {
        super(Object.class);
        this.f28195e = jVar;
        this.f28196f = null;
        this.f28197g = null;
    }

    @Override // p6.l, s6.r
    public Object a(p6.h hVar) {
        return e1(this.f28197g.a(hVar));
    }

    @Override // p6.l, s6.r
    public Object b(p6.h hVar) {
        return e1(this.f28197g.b(hVar));
    }

    @Override // s6.s
    public void c(p6.h hVar) {
        s6.r rVar = this.f28197g;
        if (rVar == null || !(rVar instanceof s6.s)) {
            return;
        }
        ((s6.s) rVar).c(hVar);
    }

    @Override // s6.i
    public p6.l d(p6.h hVar, p6.d dVar) {
        p6.l lVar = this.f28197g;
        if (lVar != null) {
            p6.l lVarP0 = hVar.p0(lVar, dVar, this.f28196f);
            return lVarP0 != this.f28197g ? i1(this.f28195e, this.f28196f, lVarP0) : this;
        }
        JavaType javaTypeA = this.f28195e.a(hVar.l());
        return i1(this.f28195e, javaTypeA, hVar.Q(javaTypeA, dVar));
    }

    @Override // p6.l
    public Object e(e6.j jVar, p6.h hVar) {
        Object objE = this.f28197g.e(jVar, hVar);
        if (objE == null) {
            return null;
        }
        return g1(objE);
    }

    protected Object e1(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f28195e.convert(obj);
    }

    @Override // p6.l
    public Object f(e6.j jVar, p6.h hVar, Object obj) {
        return this.f28196f.r().isAssignableFrom(obj.getClass()) ? this.f28197g.f(jVar, hVar, obj) : f1(jVar, hVar, obj);
    }

    protected Object f1(e6.j jVar, p6.h hVar, Object obj) {
        throw new UnsupportedOperationException(String.format("Cannot update object of type %s (using deserializer for type %s)" + obj.getClass().getName(), this.f28196f));
    }

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        Object objE = this.f28197g.e(jVar, hVar);
        if (objE == null) {
            return null;
        }
        return g1(objE);
    }

    protected Object g1(Object obj) {
        return this.f28195e.convert(obj);
    }

    @Override // p6.l
    public Object h(e6.j jVar, p6.h hVar, a7.e eVar, Object obj) {
        return !this.f28196f.r().isAssignableFrom(obj.getClass()) ? f1(jVar, hVar, obj) : this.f28197g.f(jVar, hVar, obj);
    }

    public p6.l h1(p6.l lVar) {
        i7.h.o0(b0.class, this, "replaceDelegatee");
        return lVar == this.f28197g ? this : new b0(this.f28195e, this.f28196f, lVar);
    }

    protected b0 i1(i7.j jVar, JavaType javaType, p6.l lVar) {
        i7.h.o0(b0.class, this, "withDelegate");
        return new b0(jVar, javaType, lVar);
    }

    @Override // p6.l
    public i7.a j() {
        return this.f28197g.j();
    }

    @Override // p6.l
    public Object k(p6.h hVar) {
        return e1(this.f28197g.k(hVar));
    }

    @Override // p6.l
    public Collection l() {
        return this.f28197g.l();
    }

    @Override // u6.c0, p6.l
    public Class p() {
        return this.f28197g.p();
    }

    @Override // p6.l
    public boolean q() {
        p6.l lVar = this.f28197g;
        return lVar != null && lVar.q();
    }

    @Override // p6.l
    public h7.c r() {
        return this.f28197g.r();
    }

    @Override // p6.l
    public Boolean s(p6.g gVar) {
        return this.f28197g.s(gVar);
    }

    @Override // p6.l
    public p6.l t(i7.s sVar) {
        i7.h.o0(b0.class, this, "unwrappingDeserializer");
        return h1(this.f28197g.t(sVar));
    }

    public b0(i7.j jVar, JavaType javaType, p6.l lVar) {
        super(javaType);
        this.f28195e = jVar;
        this.f28196f = javaType;
        this.f28197g = lVar;
    }
}
