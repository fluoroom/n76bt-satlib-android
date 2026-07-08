package g7;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends i0 implements e7.i, e7.o {

    /* JADX INFO: renamed from: c */
    protected final i7.j f13592c;

    /* JADX INFO: renamed from: d */
    protected final JavaType f13593d;

    /* JADX INFO: renamed from: e */
    protected final p6.p f13594e;

    public d0(i7.j jVar, JavaType javaType, p6.p pVar) {
        super(javaType);
        this.f13592c = jVar;
        this.f13593d = javaType;
        this.f13594e = pVar;
    }

    protected d0 A(i7.j jVar, JavaType javaType, p6.p pVar) {
        i7.h.o0(d0.class, this, "withDelegate");
        return new d0(jVar, javaType, pVar);
    }

    @Override // e7.i
    public p6.p a(p6.d0 d0Var, p6.d dVar) {
        p6.p pVarU0 = this.f13594e;
        JavaType javaTypeB = this.f13593d;
        if (pVarU0 == null) {
            if (javaTypeB == null) {
                javaTypeB = this.f13592c.b(d0Var.l());
            }
            if (!javaTypeB.S()) {
                pVarU0 = d0Var.d0(javaTypeB);
            }
        }
        if (pVarU0 instanceof e7.i) {
            pVarU0 = d0Var.u0(pVarU0, dVar);
        }
        return (pVarU0 == this.f13594e && javaTypeB == this.f13593d) ? this : A(this.f13592c, javaTypeB, pVarU0);
    }

    @Override // e7.o
    public void b(p6.d0 d0Var) {
        Object obj = this.f13594e;
        if (obj == null || !(obj instanceof e7.o)) {
            return;
        }
        ((e7.o) obj).b(d0Var);
    }

    @Override // p6.p
    public boolean d(p6.d0 d0Var, Object obj) {
        Object objZ = z(obj);
        if (objZ == null) {
            return true;
        }
        p6.p pVar = this.f13594e;
        return pVar == null ? obj == null : pVar.d(d0Var, objZ);
    }

    @Override // g7.i0, p6.p
    public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
        Object objZ = z(obj);
        if (objZ == null) {
            d0Var.N(gVar);
            return;
        }
        p6.p pVarX = this.f13594e;
        if (pVarX == null) {
            pVarX = x(objZ, d0Var);
        }
        pVarX.f(objZ, gVar, d0Var);
    }

    @Override // p6.p
    public void g(Object obj, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
        Object objZ = z(obj);
        p6.p pVarX = this.f13594e;
        if (pVarX == null) {
            pVarX = x(obj, d0Var);
        }
        pVarX.g(objZ, gVar, d0Var, hVar);
    }

    protected p6.p x(Object obj, p6.d0 d0Var) {
        return d0Var.f0(obj.getClass());
    }

    protected Object z(Object obj) {
        return this.f13592c.convert(obj);
    }
}
