package f7;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class s extends e7.c implements Serializable {
    protected final i7.s D;

    public s(e7.c cVar, i7.s sVar) {
        super(cVar);
        this.D = sVar;
    }

    protected s L(i7.s sVar, i6.l lVar) {
        return new s(this, sVar, lVar);
    }

    @Override // e7.c
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public s w(i7.s sVar) {
        return L(i7.s.a(sVar, this.D), new i6.l(sVar.c(this.f11622c.getValue())));
    }

    @Override // e7.c
    protected p6.p g(k kVar, Class cls, d0 d0Var) {
        JavaType javaType = this.f11626g;
        p6.p pVarE0 = javaType != null ? d0Var.e0(d0Var.G(javaType, cls), this) : d0Var.g0(cls, this);
        i7.s sVarA = this.D;
        if (pVarE0.e() && (pVarE0 instanceof t)) {
            sVarA = i7.s.a(sVarA, ((t) pVarE0).f12887v);
        }
        p6.p pVarH = pVarE0.h(sVarA);
        this.f11634x = this.f11634x.i(cls, pVarH);
        return pVarH;
    }

    @Override // e7.c
    public void l(p6.p pVar) {
        if (pVar != null) {
            i7.s sVarA = this.D;
            if (pVar.e() && (pVar instanceof t)) {
                sVarA = i7.s.a(sVarA, ((t) pVar).f12887v);
            }
            pVar = pVar.h(sVarA);
        }
        super.l(pVar);
    }

    @Override // e7.c
    public void z(Object obj, e6.g gVar, d0 d0Var) {
        Object objP = p(obj);
        if (objP == null) {
            return;
        }
        p6.p pVarG = this.f11631u;
        if (pVarG == null) {
            Class<?> cls = objP.getClass();
            k kVar = this.f11634x;
            p6.p pVarJ = kVar.j(cls);
            pVarG = pVarJ == null ? g(kVar, cls, d0Var) : pVarJ;
        }
        Object obj2 = this.f11636z;
        if (obj2 != null) {
            if (e7.c.C == obj2) {
                if (pVarG.d(d0Var, objP)) {
                    return;
                }
            } else if (obj2.equals(objP)) {
                return;
            }
        }
        if (objP == obj && i(obj, gVar, d0Var, pVarG)) {
            return;
        }
        if (!pVarG.e()) {
            gVar.C0(this.f11622c);
        }
        a7.h hVar = this.f11633w;
        if (hVar == null) {
            pVarG.f(objP, gVar, d0Var);
        } else {
            pVarG.g(objP, gVar, d0Var, hVar);
        }
    }

    protected s(s sVar, i7.s sVar2, i6.l lVar) {
        super(sVar, lVar);
        this.D = sVar2;
    }
}
