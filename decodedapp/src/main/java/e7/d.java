package e7;

import com.fasterxml.jackson.databind.JavaType;
import f7.t;
import java.io.IOException;
import java.util.Set;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class d extends g7.d {
    public d(JavaType javaType, e eVar, c[] cVarArr, c[] cVarArr2) {
        super(javaType, eVar, cVarArr, cVarArr2);
    }

    public static d S(JavaType javaType, e eVar) {
        return new d(javaType, eVar, g7.d.f13582u, null);
    }

    @Override // g7.d
    protected g7.d D() {
        return (this.f13589r == null && this.f13586f == null && this.f13587g == null) ? new f7.b(this) : this;
    }

    @Override // g7.d
    protected g7.d N(Set set, Set set2) {
        return new d(this, set, set2);
    }

    @Override // g7.d
    public g7.d O(Object obj) {
        return new d(this, this.f13589r, obj);
    }

    @Override // g7.d
    public g7.d Q(f7.i iVar) {
        return new d(this, iVar, this.f13587g);
    }

    @Override // g7.d
    protected g7.d R(c[] cVarArr, c[] cVarArr2) {
        return new d(this, cVarArr, cVarArr2);
    }

    @Override // g7.i0, p6.p
    public final void f(Object obj, e6.g gVar, d0 d0Var) throws IOException {
        if (this.f13589r != null) {
            gVar.H(obj);
            A(obj, gVar, d0Var, true);
            return;
        }
        gVar.a1(obj);
        if (this.f13587g != null) {
            L(obj, gVar, d0Var);
        } else {
            K(obj, gVar, d0Var);
        }
        gVar.A0();
    }

    @Override // p6.p
    public p6.p h(i7.s sVar) {
        return new t(this, sVar);
    }

    public String toString() {
        return "BeanSerializer for " + c().getName();
    }

    protected d(g7.d dVar, f7.i iVar, Object obj) {
        super(dVar, iVar, obj);
    }

    protected d(g7.d dVar, Set set, Set set2) {
        super(dVar, set, set2);
    }

    protected d(g7.d dVar, c[] cVarArr, c[] cVarArr2) {
        super(dVar, cVarArr, cVarArr2);
    }
}
