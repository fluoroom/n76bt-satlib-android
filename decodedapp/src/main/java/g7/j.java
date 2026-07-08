package g7;

import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class j extends b {
    public j(JavaType javaType, boolean z10, a7.h hVar, p6.p pVar) {
        super(Collection.class, javaType, z10, hVar, pVar);
    }

    @Override // p6.p
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public boolean d(p6.d0 d0Var, Collection collection) {
        return collection.isEmpty();
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void f(Collection collection, e6.g gVar, p6.d0 d0Var) throws IOException {
        int size = collection.size();
        if (size == 1 && ((this.f13569f == null && d0Var.y0(p6.c0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f13569f == Boolean.TRUE)) {
            D(collection, gVar, d0Var);
            return;
        }
        gVar.Y0(collection, size);
        D(collection, gVar, d0Var);
        gVar.z0();
    }

    @Override // g7.b
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void D(Collection collection, e6.g gVar, p6.d0 d0Var) throws IOException {
        gVar.H(collection);
        p6.p pVar = this.f13571h;
        if (pVar != null) {
            N(collection, gVar, d0Var, pVar);
            return;
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            f7.k kVar = this.f13572r;
            a7.h hVar = this.f13570g;
            int i10 = 0;
            do {
                try {
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
                    i10++;
                } catch (Exception e10) {
                    v(d0Var, e10, collection, i10);
                    return;
                }
            } while (it.hasNext());
        }
    }

    public void N(Collection collection, e6.g gVar, p6.d0 d0Var, p6.p pVar) throws IOException {
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            a7.h hVar = this.f13570g;
            int i10 = 0;
            do {
                Object next = it.next();
                if (next == null) {
                    try {
                        d0Var.N(gVar);
                    } catch (Exception e10) {
                        v(d0Var, e10, collection, i10);
                    }
                } else if (hVar == null) {
                    pVar.f(next, gVar, d0Var);
                } else {
                    pVar.g(next, gVar, d0Var, hVar);
                }
                i10++;
            } while (it.hasNext());
        }
    }

    @Override // g7.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public j G(p6.d dVar, a7.h hVar, p6.p pVar, Boolean bool) {
        return new j(this, dVar, hVar, pVar, bool);
    }

    @Override // e7.h
    public e7.h x(a7.h hVar) {
        return new j(this, this.f13567d, hVar, this.f13571h, this.f13569f);
    }

    public j(j jVar, p6.d dVar, a7.h hVar, p6.p pVar, Boolean bool) {
        super(jVar, dVar, hVar, pVar, bool);
    }
}
