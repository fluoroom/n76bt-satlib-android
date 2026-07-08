package g7;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class r extends b {
    public r(JavaType javaType, boolean z10, a7.h hVar) {
        super(Iterable.class, javaType, z10, hVar, (p6.p) null);
    }

    public boolean H(Iterable iterable) {
        if (iterable == null) {
            return false;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        return !it.hasNext();
    }

    @Override // p6.p
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public boolean d(p6.d0 d0Var, Iterable iterable) {
        return !iterable.iterator().hasNext();
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void f(Iterable iterable, e6.g gVar, p6.d0 d0Var) {
        if (((this.f13569f == null && d0Var.y0(p6.c0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f13569f == Boolean.TRUE) && H(iterable)) {
            D(iterable, gVar, d0Var);
            return;
        }
        gVar.X0(iterable);
        D(iterable, gVar, d0Var);
        gVar.z0();
    }

    @Override // g7.b
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void D(Iterable iterable, e6.g gVar, p6.d0 d0Var) {
        p6.p pVar;
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            a7.h hVar = this.f13570g;
            Class<?> cls = null;
            p6.p pVarG0 = null;
            do {
                Object next = it.next();
                if (next == null) {
                    d0Var.N(gVar);
                } else {
                    p6.p pVar2 = this.f13571h;
                    if (pVar2 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            pVarG0 = d0Var.g0(cls2, this.f13567d);
                            cls = cls2;
                        }
                        pVar = pVarG0;
                    } else {
                        pVar = pVarG0;
                        pVarG0 = pVar2;
                    }
                    if (hVar == null) {
                        pVarG0.f(next, gVar, d0Var);
                    } else {
                        pVarG0.g(next, gVar, d0Var, hVar);
                    }
                    pVarG0 = pVar;
                }
            } while (it.hasNext());
        }
    }

    @Override // g7.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public r G(p6.d dVar, a7.h hVar, p6.p pVar, Boolean bool) {
        return new r(this, dVar, hVar, pVar, bool);
    }

    @Override // e7.h
    public e7.h x(a7.h hVar) {
        return new r(this, this.f13567d, hVar, this.f13571h, this.f13569f);
    }

    public r(r rVar, p6.d dVar, a7.h hVar, p6.p pVar, Boolean bool) {
        super(rVar, dVar, hVar, pVar, bool);
    }
}
