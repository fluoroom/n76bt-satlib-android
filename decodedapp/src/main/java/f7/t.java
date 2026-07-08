package f7;

import java.io.IOException;
import java.io.Serializable;
import java.util.Set;
import p6.c0;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class t extends g7.d implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final i7.s f12887v;

    public t(g7.d dVar, i7.s sVar) {
        super(dVar, sVar);
        this.f12887v = sVar;
    }

    @Override // g7.d
    protected g7.d N(Set set, Set set2) {
        return new t(this, set, set2);
    }

    @Override // g7.d
    public g7.d O(Object obj) {
        return new t(this, this.f13589r, obj);
    }

    @Override // g7.d
    public g7.d Q(i iVar) {
        return new t(this, iVar);
    }

    @Override // g7.d
    protected g7.d R(e7.c[] cVarArr, e7.c[] cVarArr2) {
        return new t(this, cVarArr, cVarArr2);
    }

    @Override // p6.p
    public boolean e() {
        return true;
    }

    @Override // g7.i0, p6.p
    public final void f(Object obj, e6.g gVar, d0 d0Var) throws IOException {
        gVar.H(obj);
        if (this.f13589r != null) {
            A(obj, gVar, d0Var, false);
        } else if (this.f13587g != null) {
            L(obj, gVar, d0Var);
        } else {
            K(obj, gVar, d0Var);
        }
    }

    @Override // g7.d, p6.p
    public void g(Object obj, e6.g gVar, d0 d0Var, a7.h hVar) throws IOException {
        if (d0Var.y0(c0.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            d0Var.r(c(), "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
        }
        gVar.H(obj);
        if (this.f13589r != null) {
            z(obj, gVar, d0Var, hVar);
        } else if (this.f13587g != null) {
            L(obj, gVar, d0Var);
        } else {
            K(obj, gVar, d0Var);
        }
    }

    @Override // p6.p
    public p6.p h(i7.s sVar) {
        return new t(this, sVar);
    }

    public String toString() {
        return "UnwrappingBeanSerializer for " + c().getName();
    }

    public t(t tVar, i iVar) {
        super(tVar, iVar);
        this.f12887v = tVar.f12887v;
    }

    public t(t tVar, i iVar, Object obj) {
        super(tVar, iVar, obj);
        this.f12887v = tVar.f12887v;
    }

    protected t(t tVar, Set set, Set set2) {
        super(tVar, set, set2);
        this.f12887v = tVar.f12887v;
    }

    protected t(t tVar, e7.c[] cVarArr, e7.c[] cVarArr2) {
        super(tVar, cVarArr, cVarArr2);
        this.f12887v = tVar.f12887v;
    }

    @Override // g7.d
    protected g7.d D() {
        return this;
    }
}
