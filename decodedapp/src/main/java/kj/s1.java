package kj;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class s1 {

    class b implements t1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ yj.b f20224a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ xi.b f20225b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ xi.f f20226c;

        b(yj.b bVar, xi.b bVar2, xi.f fVar) {
            this.f20224a = bVar;
            this.f20225b = bVar2;
            this.f20226c = fVar;
        }

        @Override // kj.t1
        public t1 d() {
            return s1.g(this.f20224a, r().b(f()).o(), this.f20225b.l());
        }

        @Override // yj.g0
        public /* synthetic */ double e(yj.g0 g0Var) {
            return yj.f0.a(this, g0Var);
        }

        @Override // kj.t1
        public xi.f f() {
            return this.f20226c;
        }

        @Override // yj.g0
        public yj.b getDate() {
            return this.f20224a;
        }

        @Override // kj.t1
        public /* synthetic */ xi.f q(xi.f fVar) {
            return s1.a(this, fVar);
        }

        @Override // kj.t1
        public xi.b r() {
            return this.f20225b;
        }
    }

    public static xi.f a(t1 t1Var, xi.f fVar) {
        return t1Var.r().b(t1Var.f().a(fVar));
    }

    public static t1 b(yj.b bVar, t1 t1Var, t1 t1Var2) {
        return g(bVar, d(t1Var, t1Var2), c(t1Var, t1Var2));
    }

    public static xi.b c(t1 t1Var, t1 t1Var2) {
        return t1Var.r().c(t1Var2.r(), xi.c.FRAME_TRANSFORM);
    }

    public static xi.f d(t1 t1Var, t1 t1Var2) {
        return t1Var.f().a(t1Var.r().a(t1Var2.f()));
    }

    public static t1 e() {
        return new a();
    }

    public static t1 f(yj.b bVar, xi.b bVar2) {
        return g(bVar, xi.f.f32232d, bVar2);
    }

    public static t1 g(yj.b bVar, xi.f fVar, xi.b bVar2) {
        return new b(bVar, bVar2, fVar);
    }

    class a implements t1 {
        a() {
        }

        public xi.f a(xi.f fVar) {
            return new xi.f(fVar.j(), fVar.k(), fVar.l());
        }

        @Override // yj.g0
        public /* synthetic */ double e(yj.g0 g0Var) {
            return yj.f0.a(this, g0Var);
        }

        @Override // kj.t1
        public xi.f f() {
            return xi.f.f32232d;
        }

        @Override // yj.g0
        public yj.b getDate() {
            return yj.b.P;
        }

        @Override // kj.t1
        public xi.f q(xi.f fVar) {
            return a(fVar);
        }

        @Override // kj.t1
        public xi.b r() {
            return xi.b.f32203e;
        }

        @Override // kj.t1
        public t1 d() {
            return this;
        }
    }
}
