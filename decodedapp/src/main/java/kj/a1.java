package kj;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a1 {

    class a implements b1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ yj.b f19987a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ zj.y0 f19988b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ xi.b f19989c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ xi.f f19990d;

        a(yj.b bVar, zj.y0 y0Var, xi.b bVar2, xi.f fVar) {
            this.f19987a = bVar;
            this.f19988b = y0Var;
            this.f19989c = bVar2;
            this.f19990d = fVar;
        }

        @Override // yj.g0
        public /* synthetic */ double e(yj.g0 g0Var) {
            return yj.f0.a(this, g0Var);
        }

        @Override // kj.t1
        public xi.f f() {
            return this.f19988b.t();
        }

        @Override // kj.b1
        public xi.f g() {
            return this.f19990d;
        }

        @Override // yj.g0
        public yj.b getDate() {
            return this.f19987a;
        }

        @Override // kj.b1
        public /* synthetic */ zj.y0 n(zj.y0 y0Var) {
            return a1.a(this, y0Var);
        }

        @Override // kj.t1
        public /* synthetic */ xi.f q(xi.f fVar) {
            return s1.a(this, fVar);
        }

        @Override // kj.t1
        public xi.b r() {
            return this.f19989c;
        }

        @Override // kj.b1
        public xi.f s() {
            return this.f19988b.s();
        }

        @Override // kj.t1
        public b1 d() {
            xi.b bVarR = r();
            xi.f fVarB = bVarR.b(f());
            xi.f fVarO = fVarB.o();
            xi.f fVarR = xi.f.d(g(), fVarB).r(r().b(s()));
            xi.b bVarL = bVarR.l();
            return a1.g(getDate(), new zj.y0(fVarO, fVarR), bVarL, bVarL.b(g()).o());
        }
    }

    public static zj.y0 a(b1 b1Var, zj.y0 y0Var) {
        xi.f fVarQ = b1Var.q(y0Var.t());
        return new zj.y0(fVarQ, b1Var.r().b(y0Var.s().a(b1Var.s())).r(xi.f.d(b1Var.g(), fVarQ)));
    }

    public static b1 b(yj.b bVar, b1 b1Var, b1 b1Var2) {
        return g(bVar, new zj.y0(s1.d(b1Var, b1Var2), d(b1Var, b1Var2)), s1.c(b1Var, b1Var2), c(b1Var, b1Var2));
    }

    public static xi.f c(b1 b1Var, b1 b1Var2) {
        xi.f fVarG = b1Var.g();
        return b1Var2.g().a(b1Var2.r().b(fVarG));
    }

    public static xi.f d(b1 b1Var, b1 b1Var2) {
        return b1Var.s().a(b1Var.r().a(b1Var2.s().a(xi.f.d(b1Var.g(), b1Var2.f()))));
    }

    public static b1 e() {
        return y1.f20277d;
    }

    public static b1 f(yj.b bVar, xi.b bVar2, xi.f fVar) {
        return g(bVar, zj.y0.f33561d, bVar2, fVar);
    }

    public static b1 g(yj.b bVar, zj.y0 y0Var, xi.b bVar2, xi.f fVar) {
        return new a(bVar, y0Var, bVar2, fVar);
    }
}
