package b7;

import com.fasterxml.jackson.databind.JavaType;
import d6.e0;
import i7.b0;

/* JADX INFO: loaded from: classes.dex */
public class h extends a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final e0.a f3699r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final boolean f3700s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final String f3701t;

    public h(h hVar, p6.d dVar) {
        super(hVar, dVar);
        p6.d dVar2 = this.f3721c;
        this.f3701t = dVar2 == null ? String.format("missing type id property '%s'", this.f3723e) : String.format("missing type id property '%s' (for POJO property '%s')", this.f3723e, dVar2.getName());
        this.f3699r = hVar.f3699r;
        this.f3700s = hVar.f3700s;
    }

    protected Object A(e6.j jVar, p6.h hVar, b0 b0Var, String str) {
        if (!l()) {
            Object objA = a7.e.a(jVar, hVar, this.f3720b);
            if (objA != null) {
                return objA;
            }
            if (jVar.S0()) {
                return super.c(jVar, hVar);
            }
            if (jVar.N0(e6.m.VALUE_STRING) && hVar.D0(p6.i.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jVar.C0().trim().isEmpty()) {
                return null;
            }
        }
        p6.l lVarO = o(hVar);
        if (lVarO == null) {
            JavaType javaTypeQ = this.f3700s ? q(hVar, str) : this.f3720b;
            if (javaTypeQ == null) {
                return null;
            }
            lVarO = hVar.Q(javaTypeQ, this.f3721c);
        }
        if (b0Var != null) {
            b0Var.A0();
            jVar = b0Var.v1(jVar);
            jVar.X0();
        }
        return lVarO.e(jVar, hVar);
    }

    @Override // b7.a, a7.e
    public Object c(e6.j jVar, p6.h hVar) {
        return jVar.N0(e6.m.START_ARRAY) ? super.d(jVar, hVar) : e(jVar, hVar);
    }

    @Override // b7.a, a7.e
    public Object e(e6.j jVar, p6.h hVar) throws e6.f {
        String strK0;
        Object objH0;
        if (jVar.e() && (objH0 = jVar.H0()) != null) {
            return n(jVar, hVar, objH0);
        }
        e6.m mVarN = jVar.n();
        b0 b0VarZ = null;
        if (mVarN == e6.m.START_OBJECT) {
            mVarN = jVar.X0();
        } else if (mVarN != e6.m.FIELD_NAME) {
            return A(jVar, hVar, null, this.f3701t);
        }
        boolean zE0 = hVar.E0(p6.r.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (mVarN == e6.m.FIELD_NAME) {
            String strL = jVar.l();
            jVar.X0();
            if ((strL.equals(this.f3723e) || (zE0 && strL.equalsIgnoreCase(this.f3723e))) && (strK0 = jVar.K0()) != null) {
                return z(jVar, hVar, b0VarZ, strK0);
            }
            if (b0VarZ == null) {
                b0VarZ = hVar.z(jVar);
            }
            b0VarZ.D0(strL);
            b0VarZ.z1(jVar);
            mVarN = jVar.X0();
        }
        return A(jVar, hVar, b0VarZ, this.f3701t);
    }

    @Override // b7.a, a7.e
    public a7.e g(p6.d dVar) {
        return dVar == this.f3721c ? this : new h(this, dVar);
    }

    @Override // b7.a, a7.e
    public e0.a k() {
        return this.f3699r;
    }

    protected Object z(e6.j jVar, p6.h hVar, b0 b0Var, String str) throws p6.m, e6.f {
        p6.l lVarP = p(hVar, str);
        if (this.f3724f) {
            if (b0Var == null) {
                b0Var = hVar.z(jVar);
            }
            b0Var.D0(jVar.l());
            b0Var.d1(str);
        }
        if (b0Var != null) {
            jVar.k();
            jVar = o6.k.i1(false, b0Var.v1(jVar), jVar);
        }
        if (jVar.n() != e6.m.END_OBJECT) {
            jVar.X0();
        }
        return lVarP.e(jVar, hVar);
    }

    public h(JavaType javaType, a7.f fVar, String str, boolean z10, JavaType javaType2, e0.a aVar, boolean z11) {
        String str2;
        super(javaType, fVar, str, z10, javaType2);
        p6.d dVar = this.f3721c;
        if (dVar == null) {
            str2 = String.format("missing type id property '%s'", this.f3723e);
        } else {
            str2 = String.format("missing type id property '%s' (for POJO property '%s')", this.f3723e, dVar.getName());
        }
        this.f3701t = str2;
        this.f3699r = aVar;
        this.f3700s = z11;
    }
}
