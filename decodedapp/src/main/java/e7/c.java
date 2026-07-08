package e7;

import com.fasterxml.jackson.databind.JavaType;
import d6.r;
import f7.k;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import p6.b0;
import p6.c0;
import p6.d0;
import p6.y;
import x6.u;

/* JADX INFO: loaded from: classes.dex */
public class c extends n implements Serializable {
    public static final Object C = r.a.NON_EMPTY;
    protected final Class[] A;
    protected transient HashMap B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final i6.l f11622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final y f11623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final JavaType f11624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final JavaType f11625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected JavaType f11626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final transient i7.b f11627h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final x6.k f11628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected transient Method f11629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected transient Field f11630t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected p6.p f11631u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected p6.p f11632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected a7.h f11633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected transient f7.k f11634x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected final boolean f11635y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected final Object f11636z;

    public c(u uVar, x6.k kVar, i7.b bVar, JavaType javaType, p6.p pVar, a7.h hVar, JavaType javaType2, boolean z10, Object obj, Class[] clsArr) {
        super(uVar);
        this.f11628r = kVar;
        this.f11627h = bVar;
        this.f11622c = new i6.l(uVar.getName());
        this.f11623d = uVar.D();
        this.f11624e = javaType;
        this.f11631u = pVar;
        this.f11634x = pVar == null ? f7.k.c() : null;
        this.f11633w = hVar;
        this.f11625f = javaType2;
        if (kVar instanceof x6.i) {
            this.f11629s = null;
            this.f11630t = (Field) kVar.n();
        } else if (kVar instanceof x6.l) {
            this.f11629s = (Method) kVar.n();
            this.f11630t = null;
        } else {
            this.f11629s = null;
            this.f11630t = null;
        }
        this.f11635y = z10;
        this.f11636z = obj;
        this.f11632v = null;
        this.A = clsArr;
    }

    public void A(Object obj, e6.g gVar, d0 d0Var) {
        if (gVar.k()) {
            return;
        }
        gVar.P0(this.f11622c.getValue());
    }

    public void C(Object obj, e6.g gVar, d0 d0Var) {
        p6.p pVar = this.f11632v;
        if (pVar != null) {
            pVar.f(null, gVar, d0Var);
        } else {
            gVar.E0();
        }
    }

    public void D(JavaType javaType) {
        this.f11626g = javaType;
    }

    public c G(i7.s sVar) {
        return new f7.s(this, sVar);
    }

    public boolean H() {
        return this.f11635y;
    }

    public boolean K(y yVar) {
        y yVar2 = this.f11623d;
        return yVar2 != null ? yVar2.equals(yVar) : yVar.f(this.f11622c.getValue()) && !yVar.d();
    }

    @Override // p6.d
    public y a() {
        return new y(this.f11622c.getValue());
    }

    protected p6.p g(f7.k kVar, Class cls, d0 d0Var) {
        JavaType javaType = this.f11626g;
        k.d dVarE = javaType != null ? kVar.e(d0Var.G(javaType, cls), d0Var, this) : kVar.f(cls, d0Var, this);
        f7.k kVar2 = dVarE.f12864b;
        if (kVar != kVar2) {
            this.f11634x = kVar2;
        }
        return dVarE.f12863a;
    }

    @Override // p6.d, i7.t
    public String getName() {
        return this.f11622c.getValue();
    }

    @Override // p6.d
    public JavaType getType() {
        return this.f11624e;
    }

    @Override // p6.d
    public x6.k h() {
        return this.f11628r;
    }

    protected boolean i(Object obj, e6.g gVar, d0 d0Var, p6.p pVar) throws v6.b {
        if (pVar.i()) {
            return false;
        }
        if (d0Var.y0(c0.FAIL_ON_SELF_REFERENCES)) {
            if (!(pVar instanceof g7.d)) {
                return false;
            }
            d0Var.q(getType(), "Direct self-reference leading to cycle");
            return false;
        }
        if (!d0Var.y0(c0.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        }
        if (this.f11632v == null) {
            return true;
        }
        if (!gVar.s().h()) {
            gVar.C0(this.f11622c);
        }
        this.f11632v.f(null, gVar, d0Var);
        return true;
    }

    protected c j(y yVar) {
        return new c(this, yVar);
    }

    public void k(p6.p pVar) {
        p6.p pVar2 = this.f11632v;
        if (pVar2 != null && pVar2 != pVar) {
            throw new IllegalStateException(String.format("Cannot override _nullSerializer: had a %s, trying to set to %s", i7.h.h(this.f11632v), i7.h.h(pVar)));
        }
        this.f11632v = pVar;
    }

    public void l(p6.p pVar) {
        p6.p pVar2 = this.f11631u;
        if (pVar2 != null && pVar2 != pVar) {
            throw new IllegalStateException(String.format("Cannot override _serializer: had a %s, trying to set to %s", i7.h.h(this.f11631u), i7.h.h(pVar)));
        }
        this.f11631u = pVar;
    }

    public void n(a7.h hVar) {
        this.f11633w = hVar;
    }

    public void o(b0 b0Var) {
        this.f11628r.i(b0Var.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public final Object p(Object obj) {
        Method method = this.f11629s;
        return method == null ? this.f11630t.get(obj) : method.invoke(obj, null);
    }

    public JavaType q() {
        return this.f11625f;
    }

    public a7.h r() {
        return this.f11633w;
    }

    public Class[] s() {
        return this.A;
    }

    public boolean t() {
        return this.f11632v != null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("property '");
        sb2.append(getName());
        sb2.append("' (");
        if (this.f11629s != null) {
            sb2.append("via method ");
            sb2.append(this.f11629s.getDeclaringClass().getName());
            sb2.append("#");
            sb2.append(this.f11629s.getName());
        } else if (this.f11630t != null) {
            sb2.append("field \"");
            sb2.append(this.f11630t.getDeclaringClass().getName());
            sb2.append("#");
            sb2.append(this.f11630t.getName());
        } else {
            sb2.append("virtual");
        }
        if (this.f11631u == null) {
            sb2.append(", no static serializer");
        } else {
            sb2.append(", static serializer of type " + this.f11631u.getClass().getName());
        }
        sb2.append(')');
        return sb2.toString();
    }

    public boolean v() {
        return this.f11631u != null;
    }

    public c w(i7.s sVar) {
        String strC = sVar.c(this.f11622c.getValue());
        return strC.equals(this.f11622c.toString()) ? this : j(y.a(strC));
    }

    public void x(Object obj, e6.g gVar, d0 d0Var) {
        Method method = this.f11629s;
        Object objInvoke = method == null ? this.f11630t.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
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
            Class<?> cls = objInvoke.getClass();
            f7.k kVar = this.f11634x;
            p6.p pVarJ = kVar.j(cls);
            pVarG = pVarJ == null ? g(kVar, cls, d0Var) : pVarJ;
        }
        Object obj2 = this.f11636z;
        if (obj2 != null) {
            if (C == obj2) {
                if (pVarG.d(d0Var, objInvoke)) {
                    C(obj, gVar, d0Var);
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                C(obj, gVar, d0Var);
                return;
            }
        }
        if (objInvoke == obj && i(obj, gVar, d0Var, pVarG)) {
            return;
        }
        a7.h hVar = this.f11633w;
        if (hVar == null) {
            pVarG.f(objInvoke, gVar, d0Var);
        } else {
            pVarG.g(objInvoke, gVar, d0Var, hVar);
        }
    }

    public void z(Object obj, e6.g gVar, d0 d0Var) {
        Method method = this.f11629s;
        Object objInvoke = method == null ? this.f11630t.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            Object obj2 = this.f11636z;
            if ((obj2 == null || !d0Var.w0(obj2)) && this.f11632v != null) {
                gVar.C0(this.f11622c);
                this.f11632v.f(null, gVar, d0Var);
                return;
            }
            return;
        }
        p6.p pVarG = this.f11631u;
        if (pVarG == null) {
            Class<?> cls = objInvoke.getClass();
            f7.k kVar = this.f11634x;
            p6.p pVarJ = kVar.j(cls);
            pVarG = pVarJ == null ? g(kVar, cls, d0Var) : pVarJ;
        }
        Object obj3 = this.f11636z;
        if (obj3 != null) {
            if (C == obj3) {
                if (pVarG.d(d0Var, objInvoke)) {
                    return;
                }
            } else if (obj3.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj && i(obj, gVar, d0Var, pVarG)) {
            return;
        }
        gVar.C0(this.f11622c);
        a7.h hVar = this.f11633w;
        if (hVar == null) {
            pVarG.f(objInvoke, gVar, d0Var);
        } else {
            pVarG.g(objInvoke, gVar, d0Var, hVar);
        }
    }

    protected c(c cVar) {
        this(cVar, cVar.f11622c);
    }

    protected c(c cVar, y yVar) {
        super(cVar);
        this.f11622c = new i6.l(yVar.c());
        this.f11623d = cVar.f11623d;
        this.f11627h = cVar.f11627h;
        this.f11624e = cVar.f11624e;
        this.f11628r = cVar.f11628r;
        this.f11629s = cVar.f11629s;
        this.f11630t = cVar.f11630t;
        this.f11631u = cVar.f11631u;
        this.f11632v = cVar.f11632v;
        if (cVar.B != null) {
            this.B = new HashMap(cVar.B);
        }
        this.f11625f = cVar.f11625f;
        this.f11634x = cVar.f11634x;
        this.f11635y = cVar.f11635y;
        this.f11636z = cVar.f11636z;
        this.A = cVar.A;
        this.f11633w = cVar.f11633w;
        this.f11626g = cVar.f11626g;
    }

    protected c(c cVar, i6.l lVar) {
        super(cVar);
        this.f11622c = lVar;
        this.f11623d = cVar.f11623d;
        this.f11628r = cVar.f11628r;
        this.f11627h = cVar.f11627h;
        this.f11624e = cVar.f11624e;
        this.f11629s = cVar.f11629s;
        this.f11630t = cVar.f11630t;
        this.f11631u = cVar.f11631u;
        this.f11632v = cVar.f11632v;
        if (cVar.B != null) {
            this.B = new HashMap(cVar.B);
        }
        this.f11625f = cVar.f11625f;
        this.f11634x = cVar.f11634x;
        this.f11635y = cVar.f11635y;
        this.f11636z = cVar.f11636z;
        this.A = cVar.A;
        this.f11633w = cVar.f11633w;
        this.f11626g = cVar.f11626g;
    }
}
