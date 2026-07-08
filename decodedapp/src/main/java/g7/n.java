package g7;

import com.fasterxml.jackson.databind.JavaType;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class n extends b {
    public n(JavaType javaType) {
        super(EnumSet.class, javaType, true, (a7.h) null, (p6.p) null);
    }

    @Override // p6.p
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public boolean d(p6.d0 d0Var, EnumSet enumSet) {
        return enumSet.isEmpty();
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void f(EnumSet enumSet, e6.g gVar, p6.d0 d0Var) {
        int size = enumSet.size();
        if (size == 1 && ((this.f13569f == null && d0Var.y0(p6.c0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f13569f == Boolean.TRUE)) {
            D(enumSet, gVar, d0Var);
            return;
        }
        gVar.Y0(enumSet, size);
        D(enumSet, gVar, d0Var);
        gVar.z0();
    }

    @Override // g7.b
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void D(EnumSet enumSet, e6.g gVar, p6.d0 d0Var) {
        p6.p pVarR = this.f13571h;
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            Enum r12 = (Enum) it.next();
            if (pVarR == null) {
                pVarR = d0Var.R(r12.getDeclaringClass(), this.f13567d);
            }
            pVarR.f(r12, gVar, d0Var);
        }
    }

    @Override // g7.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public n G(p6.d dVar, a7.h hVar, p6.p pVar, Boolean bool) {
        return new n(this, dVar, hVar, pVar, bool);
    }

    public n(n nVar, p6.d dVar, a7.h hVar, p6.p pVar, Boolean bool) {
        super(nVar, dVar, hVar, pVar, bool);
    }

    @Override // e7.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public n x(a7.h hVar) {
        return this;
    }
}
