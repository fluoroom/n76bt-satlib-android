package f7;

import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.util.List;
import p6.c0;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g7.b {
    public e(JavaType javaType, boolean z10, a7.h hVar, p6.p pVar) {
        super(List.class, javaType, z10, hVar, pVar);
    }

    @Override // p6.p
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public boolean d(d0 d0Var, List list) {
        return list.isEmpty();
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void f(List list, e6.g gVar, d0 d0Var) throws IOException {
        int size = list.size();
        if (size == 1 && ((this.f13569f == null && d0Var.y0(c0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f13569f == Boolean.TRUE)) {
            D(list, gVar, d0Var);
            return;
        }
        gVar.Y0(list, size);
        D(list, gVar, d0Var);
        gVar.z0();
    }

    @Override // g7.b
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void D(List list, e6.g gVar, d0 d0Var) throws IOException {
        p6.p pVar = this.f13571h;
        if (pVar != null) {
            N(list, gVar, d0Var, pVar);
            return;
        }
        if (this.f13570g != null) {
            O(list, gVar, d0Var);
            return;
        }
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i10 = 0;
        try {
            k kVar = this.f13572r;
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj == null) {
                    d0Var.N(gVar);
                } else {
                    Class<?> cls = obj.getClass();
                    p6.p pVarJ = kVar.j(cls);
                    if (pVarJ == null) {
                        pVarJ = this.f13566c.z() ? A(kVar, d0Var.G(this.f13566c, cls), d0Var) : C(kVar, cls, d0Var);
                        kVar = this.f13572r;
                    }
                    pVarJ.f(obj, gVar, d0Var);
                }
                i10++;
            }
        } catch (Exception e10) {
            v(d0Var, e10, list, i10);
        }
    }

    public void N(List list, e6.g gVar, d0 d0Var, p6.p pVar) throws IOException {
        int size = list.size();
        if (size == 0) {
            return;
        }
        a7.h hVar = this.f13570g;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == null) {
                try {
                    d0Var.N(gVar);
                } catch (Exception e10) {
                    v(d0Var, e10, list, i10);
                }
            } else if (hVar == null) {
                pVar.f(obj, gVar, d0Var);
            } else {
                pVar.g(obj, gVar, d0Var, hVar);
            }
        }
    }

    public void O(List list, e6.g gVar, d0 d0Var) throws IOException {
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i10 = 0;
        try {
            a7.h hVar = this.f13570g;
            k kVar = this.f13572r;
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj == null) {
                    d0Var.N(gVar);
                } else {
                    Class<?> cls = obj.getClass();
                    p6.p pVarJ = kVar.j(cls);
                    if (pVarJ == null) {
                        pVarJ = this.f13566c.z() ? A(kVar, d0Var.G(this.f13566c, cls), d0Var) : C(kVar, cls, d0Var);
                        kVar = this.f13572r;
                    }
                    pVarJ.g(obj, gVar, d0Var, hVar);
                }
                i10++;
            }
        } catch (Exception e10) {
            v(d0Var, e10, list, i10);
        }
    }

    @Override // g7.b
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public e G(p6.d dVar, a7.h hVar, p6.p pVar, Boolean bool) {
        return new e(this, dVar, hVar, pVar, bool);
    }

    @Override // e7.h
    public e7.h x(a7.h hVar) {
        return new e(this, this.f13567d, hVar, this.f13571h, this.f13569f);
    }

    public e(e eVar, p6.d dVar, a7.h hVar, p6.p pVar, Boolean bool) {
        super(eVar, dVar, hVar, pVar, bool);
    }
}
