package e7;

import com.fasterxml.jackson.databind.JavaType;
import d6.r;
import java.io.Serializable;
import p6.d0;
import x6.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends c implements Serializable {
    protected s(u uVar, i7.b bVar, JavaType javaType, p6.p pVar, a7.h hVar, JavaType javaType2, r.b bVar2, Class[] clsArr) {
        super(uVar, uVar.y(), bVar, javaType, pVar, hVar, javaType2, L(bVar2), N(bVar2), clsArr);
    }

    protected static boolean L(r.b bVar) {
        r.a aVarH;
        return (bVar == null || (aVarH = bVar.h()) == r.a.ALWAYS || aVarH == r.a.USE_DEFAULTS) ? false : true;
    }

    protected static Object N(r.b bVar) {
        if (bVar == null) {
            return Boolean.FALSE;
        }
        r.a aVarH = bVar.h();
        if (aVarH == r.a.ALWAYS || aVarH == r.a.NON_NULL || aVarH == r.a.USE_DEFAULTS) {
            return null;
        }
        return c.C;
    }

    protected abstract Object O(Object obj, e6.g gVar, d0 d0Var);

    public abstract s Q(r6.q qVar, x6.d dVar, u uVar, JavaType javaType);

    @Override // e7.c
    public void x(Object obj, e6.g gVar, d0 d0Var) {
        Object objO = O(obj, gVar, d0Var);
        if (objO == null) {
            p6.p pVar = this.f11632v;
            if (pVar != null) {
                pVar.f(null, gVar, d0Var);
                return;
            } else {
                gVar.E0();
                return;
            }
        }
        p6.p pVarG = this.f11631u;
        if (pVarG == null) {
            Class<?> cls = objO.getClass();
            f7.k kVar = this.f11634x;
            p6.p pVarJ = kVar.j(cls);
            pVarG = pVarJ == null ? g(kVar, cls, d0Var) : pVarJ;
        }
        Object obj2 = this.f11636z;
        if (obj2 != null) {
            if (c.C == obj2) {
                if (pVarG.d(d0Var, objO)) {
                    C(obj, gVar, d0Var);
                    return;
                }
            } else if (obj2.equals(objO)) {
                C(obj, gVar, d0Var);
                return;
            }
        }
        if (objO == obj && i(obj, gVar, d0Var, pVarG)) {
            return;
        }
        a7.h hVar = this.f11633w;
        if (hVar == null) {
            pVarG.f(objO, gVar, d0Var);
        } else {
            pVarG.g(objO, gVar, d0Var, hVar);
        }
    }

    @Override // e7.c
    public void z(Object obj, e6.g gVar, d0 d0Var) {
        Object objO = O(obj, gVar, d0Var);
        if (objO == null) {
            if (this.f11632v != null) {
                gVar.C0(this.f11622c);
                this.f11632v.f(null, gVar, d0Var);
                return;
            }
            return;
        }
        p6.p pVarG = this.f11631u;
        if (pVarG == null) {
            Class<?> cls = objO.getClass();
            f7.k kVar = this.f11634x;
            p6.p pVarJ = kVar.j(cls);
            pVarG = pVarJ == null ? g(kVar, cls, d0Var) : pVarJ;
        }
        Object obj2 = this.f11636z;
        if (obj2 != null) {
            if (c.C == obj2) {
                if (pVarG.d(d0Var, objO)) {
                    return;
                }
            } else if (obj2.equals(objO)) {
                return;
            }
        }
        if (objO == obj && i(obj, gVar, d0Var, pVarG)) {
            return;
        }
        gVar.C0(this.f11622c);
        a7.h hVar = this.f11633w;
        if (hVar == null) {
            pVarG.f(objO, gVar, d0Var);
        } else {
            pVarG.g(objO, gVar, d0Var, hVar);
        }
    }
}
