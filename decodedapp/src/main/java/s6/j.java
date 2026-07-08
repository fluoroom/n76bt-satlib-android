package s6;

import com.fasterxml.jackson.databind.JavaType;
import d6.b;
import p6.y;

/* JADX INFO: loaded from: classes.dex */
public class j extends u {
    protected final int A;
    protected boolean B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final x6.o f26941x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected final b.a f26942y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected u f26943z;

    protected j(y yVar, JavaType javaType, y yVar2, a7.e eVar, i7.b bVar, x6.o oVar, int i10, b.a aVar, p6.x xVar) {
        super(yVar, javaType, yVar2, eVar, bVar, xVar);
        this.f26941x = oVar;
        this.A = i10;
        this.f26942y = aVar;
        this.f26943z = null;
    }

    private void Z(e6.j jVar, p6.h hVar) throws v6.b {
        String str = "No fallback setter/field defined for creator property " + i7.h.V(getName());
        if (hVar == null) {
            throw v6.b.x(jVar, str, getType());
        }
        hVar.q(getType(), str);
    }

    private final void a0() throws v6.b {
        if (this.f26943z == null) {
            Z(null, null);
        }
    }

    public static j b0(y yVar, JavaType javaType, y yVar2, a7.e eVar, i7.b bVar, x6.o oVar, int i10, b.a aVar, p6.x xVar) {
        return new j(yVar, javaType, yVar2, eVar, bVar, oVar, i10, aVar, xVar);
    }

    @Override // s6.u
    public boolean G() {
        return this.B;
    }

    @Override // s6.u
    public boolean H() {
        b.a aVar = this.f26942y;
        return (aVar == null || aVar.g(true)) ? false : true;
    }

    @Override // s6.u
    public void K() {
        this.B = true;
    }

    @Override // s6.u
    public void L(Object obj, Object obj2) throws v6.b {
        a0();
        this.f26943z.L(obj, obj2);
    }

    @Override // s6.u
    public Object N(Object obj, Object obj2) throws v6.b {
        a0();
        return this.f26943z.N(obj, obj2);
    }

    @Override // s6.u
    public u T(y yVar) {
        return new j(this, yVar);
    }

    @Override // s6.u
    public u W(r rVar) {
        return new j(this, this.f26966g, rVar);
    }

    @Override // s6.u
    public u Y(p6.l lVar) {
        p6.l lVar2 = this.f26966g;
        if (lVar2 == lVar) {
            return this;
        }
        r rVar = this.f26968r;
        if (lVar2 == rVar) {
            rVar = lVar;
        }
        return new j(this, lVar, rVar);
    }

    public void c0(u uVar) {
        this.f26943z = uVar;
    }

    @Override // x6.x, p6.d
    public p6.x d() {
        p6.x xVarD = super.d();
        u uVar = this.f26943z;
        return uVar != null ? xVarD.i(uVar.d().d()) : xVarD;
    }

    @Override // s6.u, p6.d
    public x6.k h() {
        return this.f26941x;
    }

    @Override // s6.u
    public void n(e6.j jVar, p6.h hVar, Object obj) throws v6.b {
        a0();
        this.f26943z.L(obj, l(jVar, hVar));
    }

    @Override // s6.u
    public Object o(e6.j jVar, p6.h hVar, Object obj) throws v6.b {
        a0();
        return this.f26943z.N(obj, l(jVar, hVar));
    }

    @Override // s6.u
    public void q(p6.g gVar) {
        u uVar = this.f26943z;
        if (uVar != null) {
            uVar.q(gVar);
        }
    }

    @Override // s6.u
    public int r() {
        return this.A;
    }

    @Override // s6.u
    public Object s() {
        b.a aVar = this.f26942y;
        if (aVar == null) {
            return null;
        }
        return aVar.e();
    }

    @Override // s6.u
    public String toString() {
        return "[creator property, name " + i7.h.V(getName()) + "; inject id '" + s() + "']";
    }

    protected j(j jVar, y yVar) {
        super(jVar, yVar);
        this.f26941x = jVar.f26941x;
        this.f26942y = jVar.f26942y;
        this.f26943z = jVar.f26943z;
        this.A = jVar.A;
        this.B = jVar.B;
    }

    protected j(j jVar, p6.l lVar, r rVar) {
        super(jVar, lVar, rVar);
        this.f26941x = jVar.f26941x;
        this.f26942y = jVar.f26942y;
        this.f26943z = jVar.f26943z;
        this.A = jVar.A;
        this.B = jVar.B;
    }
}
