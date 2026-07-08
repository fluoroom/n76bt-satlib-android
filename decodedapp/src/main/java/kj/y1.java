package kj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class y1 implements yj.e0, b1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y1 f20277d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yj.b f20278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zj.y0 f20279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zj.b f20280c;

    public y1(yj.b bVar, zj.y0 y0Var, zj.b bVar2) {
        this.f20278a = bVar;
        this.f20279b = y0Var;
        this.f20280c = bVar2;
    }

    private static xi.f b(y1 y1Var, y1 y1Var2) {
        xi.f fVarO = y1Var.f20279b.o();
        xi.b bVarR = y1Var.f20280c.r();
        xi.f fVarG = y1Var.f20280c.g();
        xi.f fVarK = y1Var.f20280c.k();
        xi.f fVarT = y1Var2.f20279b.t();
        xi.f fVarS = y1Var2.f20279b.s();
        return fVarO.a(bVarR.a(new xi.f(1.0d, y1Var2.f20279b.o(), 2.0d, xi.f.d(fVarG, fVarS), 1.0d, xi.f.d(fVarG, xi.f.d(fVarG, fVarT)), 1.0d, xi.f.d(fVarK, fVarT))));
    }

    private static xi.f c(y1 y1Var, y1 y1Var2) {
        xi.f fVarG = y1Var.f20280c.g();
        xi.f fVarK = y1Var.f20280c.k();
        xi.b bVarR = y1Var2.f20280c.r();
        return new xi.f(1.0d, y1Var2.f20280c.k(), 1.0d, bVarR.b(fVarK), -1.0d, xi.f.d(y1Var2.f20280c.g(), bVarR.b(fVarG)));
    }

    public static y1 k(yj.b bVar, zj.d dVar, zj.c cVar, Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            y1 y1Var = (y1) it.next();
            arrayList.add(new zj.k1(y1Var.getDate(), y1Var.f(), y1Var.s(), y1Var.h()));
            arrayList2.add(new zj.f1(y1Var.getDate(), y1Var.r(), y1Var.g(), y1Var.j()));
        }
        return new y1(bVar, (zj.k1) new zj.o1(arrayList.size(), dVar).a(bVar, arrayList), (zj.f1) new zj.g1(arrayList.size(), cVar).a(bVar, arrayList2));
    }

    @Override // yj.g0
    public /* synthetic */ double e(yj.g0 g0Var) {
        return yj.f0.a(this, g0Var);
    }

    @Override // kj.t1
    public xi.f f() {
        return this.f20279b.t();
    }

    @Override // kj.b1
    public xi.f g() {
        return this.f20280c.g();
    }

    @Override // yj.g0
    public yj.b getDate() {
        return this.f20278a;
    }

    public xi.f h() {
        return this.f20279b.o();
    }

    @Override // kj.t1
    /* JADX INFO: renamed from: i */
    public y1 d() {
        xi.b bVarR = this.f20280c.r();
        xi.f fVarG = this.f20280c.g();
        xi.f fVarK = this.f20280c.k();
        xi.f fVarB = bVarR.b(this.f20279b.t());
        xi.f fVarB2 = bVarR.b(this.f20279b.s());
        xi.f fVarB3 = bVarR.b(this.f20279b.o());
        xi.f fVarO = fVarB.o();
        xi.f fVarD = xi.f.d(fVarG, fVarB);
        return new y1(getDate(), new zj.y0(fVarO, fVarD.r(fVarB2), new xi.f(-1.0d, fVarB3, 2.0d, xi.f.d(fVarG, fVarB2), 1.0d, xi.f.d(fVarK, fVarB), -1.0d, xi.f.d(fVarG, fVarD))), this.f20280c.l());
    }

    public xi.f j() {
        return this.f20280c.k();
    }

    @Override // yj.e0
    /* JADX INFO: renamed from: l */
    public y1 a(double d10) {
        return m(new yj.y(d10));
    }

    public y1 m(yj.y yVar) {
        return new y1(this.f20278a.f0(yVar), (zj.y0) this.f20279b.w(yVar), (zj.b) this.f20280c.p(yVar));
    }

    @Override // kj.b1
    public /* synthetic */ zj.y0 n(zj.y0 y0Var) {
        return a1.a(this, y0Var);
    }

    public t1 o(double d10) {
        return s1.g(this.f20278a.a(d10), this.f20279b.v(d10), this.f20280c.o(d10));
    }

    public t1 p() {
        return s1.g(this.f20278a, this.f20279b.t(), this.f20280c.r());
    }

    @Override // kj.t1
    public /* synthetic */ xi.f q(xi.f fVar) {
        return s1.a(this, fVar);
    }

    @Override // kj.t1
    public xi.b r() {
        return this.f20280c.r();
    }

    @Override // kj.b1
    public xi.f s() {
        return this.f20279b.s();
    }

    public zj.k1 t(zj.k1 k1Var) {
        return this.f20280c.c(new zj.k1(k1Var.getDate(), 1.0d, k1Var, 1.0d, this.f20279b));
    }

    public y1(yj.b bVar, xi.f fVar) {
        this(bVar, new zj.y0(fVar), zj.b.f33345d);
    }

    public y1(yj.b bVar, xi.b bVar2) {
        this(bVar, zj.y0.f33561d, new zj.b(bVar2));
    }

    public y1(yj.b bVar, zj.y0 y0Var) {
        this(bVar, y0Var, zj.b.f33345d);
    }

    public y1(yj.b bVar, xi.b bVar2, xi.f fVar) {
        this(bVar, zj.y0.f33561d, new zj.b(bVar2, fVar, xi.f.f32232d));
    }

    public y1(yj.b bVar, y1 y1Var, y1 y1Var2) {
        this(bVar, new zj.y0(s1.d(y1Var, y1Var2), a1.d(y1Var, y1Var2), b(y1Var, y1Var2)), new zj.b(s1.c(y1Var, y1Var2), a1.c(y1Var, y1Var2), c(y1Var, y1Var2)));
    }

    private static class a extends y1 {
        a() {
            super(yj.b.P, zj.y0.f33561d, zj.b.f33345d);
        }

        @Override // kj.y1, kj.b1
        public zj.y0 n(zj.y0 y0Var) {
            return new zj.y0(y0Var.t(), y0Var.s());
        }

        @Override // kj.y1
        public t1 o(double d10) {
            return p();
        }

        @Override // kj.y1
        public t1 p() {
            return s1.e();
        }

        @Override // kj.y1, kj.t1
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public y1 d() {
            return this;
        }

        @Override // kj.y1, yj.e0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public y1 a(double d10) {
            return this;
        }

        @Override // kj.y1
        public y1 m(yj.y yVar) {
            return this;
        }

        @Override // kj.y1, kj.t1
        public xi.f q(xi.f fVar) {
            return fVar;
        }

        @Override // kj.y1
        public zj.k1 t(zj.k1 k1Var) {
            return k1Var;
        }
    }
}
