package g7;

import d6.k;
import j$.util.Objects;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class m extends h0 implements e7.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final i7.l f13610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Boolean f13611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final i7.l f13612e;

    public m(i7.l lVar, Boolean bool) {
        super(lVar.c(), false);
        this.f13610c = lVar;
        this.f13611d = bool;
        this.f13612e = null;
    }

    public static m A(Class cls, p6.b0 b0Var, p6.c cVar, k.d dVar) {
        return new m(i7.l.b(b0Var, cls), x(cls, dVar, true, null), C(b0Var, cls, cVar.s()));
    }

    protected static i7.l C(p6.b0 b0Var, Class cls, x6.d dVar) {
        x6.z.a(b0Var.g().p(b0Var, dVar), b0Var.b());
        return null;
    }

    protected static Boolean x(Class cls, k.d dVar, boolean z10, Boolean bool) {
        k.c cVarI = dVar == null ? null : dVar.i();
        if (cVarI == null || cVarI == k.c.ANY || cVarI == k.c.SCALAR) {
            return bool;
        }
        if (cVarI == k.c.STRING || cVarI == k.c.NATURAL) {
            return Boolean.FALSE;
        }
        if (cVarI.a() || cVarI == k.c.ARRAY) {
            return Boolean.TRUE;
        }
        throw new IllegalArgumentException(String.format("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", cVarI, cls.getName(), z10 ? Name.LABEL : "property"));
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final void f(Enum r22, e6.g gVar, p6.d0 d0Var) {
        i7.l lVar = this.f13612e;
        if (lVar != null) {
            gVar.c1(lVar.d(r22));
            return;
        }
        if (z(d0Var)) {
            gVar.H0(r22.ordinal());
        } else if (d0Var.y0(p6.c0.WRITE_ENUMS_USING_TO_STRING)) {
            gVar.d1(r22.toString());
        } else {
            gVar.c1(this.f13610c.d(r22));
        }
    }

    @Override // e7.i
    public p6.p a(p6.d0 d0Var, p6.d dVar) {
        k.d dVarQ = q(d0Var, dVar, c());
        if (dVarQ != null) {
            Boolean boolX = x(c(), dVarQ, false, this.f13611d);
            if (!Objects.equals(boolX, this.f13611d)) {
                return new m(this.f13610c, boolX);
            }
        }
        return this;
    }

    protected final boolean z(p6.d0 d0Var) {
        Boolean bool = this.f13611d;
        return bool != null ? bool.booleanValue() : d0Var.y0(p6.c0.WRITE_ENUMS_USING_INDEX);
    }

    public m(i7.l lVar, Boolean bool, i7.l lVar2) {
        super(lVar.c(), false);
        this.f13610c = lVar;
        this.f13611d = bool;
        this.f13612e = lVar2;
    }
}
