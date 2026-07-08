package be;

/* JADX INFO: loaded from: classes3.dex */
public class j extends ke.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d1 f3897a;

    public j(d1 d1Var) {
        rd.m.e(d1Var, "container");
        this.f3897a = d1Var;
    }

    @Override // ke.o, he.o
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public z a(he.z zVar, dd.d0 d0Var) {
        rd.m.e(zVar, "descriptor");
        rd.m.e(d0Var, "data");
        return new i1(this.f3897a, zVar);
    }

    @Override // he.o
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public z l(he.y0 y0Var, dd.d0 d0Var) {
        rd.m.e(y0Var, "descriptor");
        rd.m.e(d0Var, "data");
        int i10 = (y0Var.g0() != null ? 1 : 0) + (y0Var.l0() != null ? 1 : 0);
        if (y0Var.j0()) {
            if (i10 == 0) {
                return new k1(this.f3897a, y0Var);
            }
            if (i10 == 1) {
                return new m1(this.f3897a, y0Var);
            }
            if (i10 == 2) {
                return new o1(this.f3897a, y0Var);
            }
        } else {
            if (i10 == 0) {
                return new c2(this.f3897a, y0Var);
            }
            if (i10 == 1) {
                return new f2(this.f3897a, y0Var);
            }
            if (i10 == 2) {
                return new i2(this.f3897a, y0Var);
            }
        }
        throw new z2("Unsupported property: " + y0Var);
    }
}
