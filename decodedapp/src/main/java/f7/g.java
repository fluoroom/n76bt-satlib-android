package f7;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Iterator;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class g extends g7.b {
    public g(JavaType javaType, boolean z10, a7.h hVar) {
        super(Iterator.class, javaType, z10, hVar, (p6.p) null);
    }

    protected void H(Iterator it, e6.g gVar, d0 d0Var) {
        a7.h hVar = this.f13570g;
        k kVar = this.f13572r;
        do {
            Object next = it.next();
            if (next == null) {
                d0Var.N(gVar);
            } else {
                Class<?> cls = next.getClass();
                p6.p pVarJ = kVar.j(cls);
                if (pVarJ == null) {
                    pVarJ = this.f13566c.z() ? A(kVar, d0Var.G(this.f13566c, cls), d0Var) : C(kVar, cls, d0Var);
                    kVar = this.f13572r;
                }
                if (hVar == null) {
                    pVarJ.f(next, gVar, d0Var);
                } else {
                    pVarJ.g(next, gVar, d0Var, hVar);
                }
            }
        } while (it.hasNext());
    }

    @Override // p6.p
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public boolean d(d0 d0Var, Iterator it) {
        return !it.hasNext();
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void f(Iterator it, e6.g gVar, d0 d0Var) {
        gVar.X0(it);
        D(it, gVar, d0Var);
        gVar.z0();
    }

    @Override // g7.b
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void D(Iterator it, e6.g gVar, d0 d0Var) {
        if (it.hasNext()) {
            p6.p pVar = this.f13571h;
            if (pVar == null) {
                H(it, gVar, d0Var);
                return;
            }
            a7.h hVar = this.f13570g;
            do {
                Object next = it.next();
                if (next == null) {
                    d0Var.N(gVar);
                } else if (hVar == null) {
                    pVar.f(next, gVar, d0Var);
                } else {
                    pVar.g(next, gVar, d0Var, hVar);
                }
            } while (it.hasNext());
        }
    }

    @Override // g7.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public g G(p6.d dVar, a7.h hVar, p6.p pVar, Boolean bool) {
        return new g(this, dVar, hVar, pVar, bool);
    }

    @Override // e7.h
    public e7.h x(a7.h hVar) {
        return new g(this, this.f13567d, hVar, this.f13571h, this.f13569f);
    }

    public g(g gVar, p6.d dVar, a7.h hVar, p6.p pVar, Boolean bool) {
        super(gVar, dVar, hVar, pVar, bool);
    }
}
