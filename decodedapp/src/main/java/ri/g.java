package ri;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class g implements f, Serializable {

    /* JADX INFO: renamed from: a */
    private final b f26098a;

    /* JADX INFO: renamed from: b */
    private final double[] f26099b;

    g(b bVar, double[] dArr) {
        this.f26098a = bVar;
        this.f26099b = (double[]) dArr.clone();
    }

    @Override // pi.b
    public /* synthetic */ pi.e L(int i10) {
        return pi.a.c(this, i10);
    }

    @Override // pi.b
    public /* synthetic */ pi.e Q() {
        return pi.a.b(this);
    }

    @Override // pi.b
    public aj.f S() {
        g gVarB = this.f26098a.b();
        g gVarB2 = this.f26098a.b();
        this.f26098a.f().z(this.f26099b, 0, gVarB.f26099b, 0, gVarB2.f26099b, 0);
        return new aj.f(gVarB, gVarB2);
    }

    public double[] W() {
        return (double[]) this.f26099b.clone();
    }

    public b X() {
        return this.f26098a;
    }

    public int Y() {
        return X().f().p();
    }

    public int Z() {
        return X().f().q();
    }

    @Override // pi.b
    /* JADX INFO: renamed from: a0 */
    public g D() {
        return this.f26098a.g().d();
    }

    @Override // ri.f, pi.b
    public /* synthetic */ pi.b add(double d10) {
        return c.a(this, d10);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: b */
    public g R() {
        return Double.doubleToLongBits(this.f26099b[0]) < 0 ? negate() : this;
    }

    @Override // pi.b
    /* JADX INFO: renamed from: b0 */
    public g C(double d10, g gVar, double d11, g gVar2) {
        this.f26098a.d(gVar.f26098a);
        this.f26098a.d(gVar2.f26098a);
        g gVarB = this.f26098a.b();
        this.f26098a.f().u(d10, gVar.f26099b, 0, d11, gVar2.f26099b, 0, gVarB.f26099b, 0);
        return gVarB;
    }

    @Override // pi.e
    /* JADX INFO: renamed from: c */
    public g H(g gVar) {
        this.f26098a.d(gVar.f26098a);
        g gVarB = this.f26098a.b();
        this.f26098a.f().a(this.f26099b, 0, gVar.f26099b, 0, gVarB.f26099b, 0);
        return gVarB;
    }

    @Override // pi.b
    /* JADX INFO: renamed from: c0 */
    public g v(double d10, g gVar, double d11, g gVar2, double d12, g gVar3) {
        this.f26098a.d(gVar.f26098a);
        this.f26098a.d(gVar2.f26098a);
        this.f26098a.d(gVar3.f26098a);
        g gVarB = this.f26098a.b();
        this.f26098a.f().t(d10, gVar.f26099b, 0, d11, gVar2.f26099b, 0, d12, gVar3.f26099b, 0, gVarB.f26099b, 0);
        return gVarB;
    }

    @Override // pi.b
    /* JADX INFO: renamed from: d0 */
    public g r(g gVar, g gVar2, g gVar3, g gVar4) {
        double d10 = aj.i.d(gVar.getValue(), gVar2.getValue(), gVar3.getValue(), gVar4.getValue());
        double[] dArrW = gVar.N(gVar2).H(gVar3.N(gVar4)).W();
        dArrW[0] = d10;
        return this.f26098a.c(dArrW);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: e0 */
    public g K(double d10) {
        g gVarB = this.f26098a.b();
        int i10 = 0;
        while (true) {
            double[] dArr = gVarB.f26099b;
            if (i10 >= dArr.length) {
                return gVarB;
            }
            dArr[i10] = this.f26099b[i10] * d10;
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (Y() == gVar.Y() && Z() == gVar.Z() && aj.i.c(this.f26099b, gVar.f26099b)) {
                return true;
            }
        }
        return false;
    }

    @Override // pi.b
    public /* synthetic */ pi.e f() {
        return pi.a.a(this);
    }

    @Override // pi.e
    /* JADX INFO: renamed from: f0 */
    public g N(g gVar) {
        this.f26098a.d(gVar.f26098a);
        g gVarB = this.f26098a.b();
        this.f26098a.f().v(this.f26099b, 0, gVar.f26099b, 0, gVarB.f26099b, 0);
        return gVarB;
    }

    @Override // pi.e
    /* JADX INFO: renamed from: g0 */
    public g negate() {
        g gVarB = this.f26098a.b();
        int i10 = 0;
        while (true) {
            double[] dArr = gVarB.f26099b;
            if (i10 >= dArr.length) {
                return gVarB;
            }
            dArr[i10] = -this.f26099b[i10];
            i10++;
        }
    }

    @Override // ri.f
    public double getValue() {
        return this.f26099b[0];
    }

    @Override // pi.b
    /* JADX INFO: renamed from: h0 */
    public g w(double d10) {
        return this.f26098a.e(d10);
    }

    public int hashCode() {
        return (Y() * 229) + 227 + (Z() * 233) + (aj.j.e(this.f26099b) * 239);
    }

    @Override // pi.e
    /* JADX INFO: renamed from: i0 */
    public g k() {
        g gVarB = this.f26098a.b();
        this.f26098a.f().w(this.f26099b, 0, gVarB.f26099b, 0);
        return gVarB;
    }

    @Override // pi.e
    public /* synthetic */ boolean isZero() {
        return pi.d.a(this);
    }

    @Override // ri.f, pi.b
    public /* synthetic */ pi.b j(double d10) {
        return c.d(this, d10);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: j0 */
    public g d(int i10) {
        g gVarB = this.f26098a.b();
        this.f26098a.f().x(this.f26099b, 0, i10, gVarB.f26099b, 0);
        return gVarB;
    }

    void k0(int i10, double d10) {
        this.f26099b[i10] = d10;
    }

    @Override // pi.b
    /* JADX INFO: renamed from: l0 */
    public g g() {
        g gVarB = this.f26098a.b();
        this.f26098a.f().y(this.f26099b, 0, gVarB.f26099b, 0);
        return gVarB;
    }

    @Override // pi.b
    /* JADX INFO: renamed from: m0 */
    public g e() {
        g gVarB = this.f26098a.b();
        this.f26098a.f().A(this.f26099b, 0, gVarB.f26099b, 0);
        return gVarB;
    }

    @Override // pi.b
    /* JADX INFO: renamed from: n0 */
    public g h() {
        g gVarB = this.f26098a.b();
        this.f26098a.f().B(this.f26099b, 0, gVarB.f26099b, 0);
        return gVarB;
    }

    @Override // pi.b
    /* JADX INFO: renamed from: o */
    public g a() {
        g gVarB = this.f26098a.b();
        this.f26098a.f().b(this.f26099b, 0, gVarB.f26099b, 0);
        return gVarB;
    }

    @Override // pi.b
    /* JADX INFO: renamed from: o0 */
    public g n() {
        return N(this);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: p */
    public g i() {
        g gVarB = this.f26098a.b();
        this.f26098a.f().c(this.f26099b, 0, gVarB.f26099b, 0);
        return gVarB;
    }

    @Override // pi.b
    /* JADX INFO: renamed from: p0 */
    public g O(g gVar) {
        this.f26098a.d(gVar.f26098a);
        g gVarB = this.f26098a.b();
        this.f26098a.f().C(this.f26099b, 0, gVar.f26099b, 0, gVarB.f26099b, 0);
        return gVarB;
    }

    @Override // pi.e
    public pi.c q() {
        return this.f26098a.g();
    }

    @Override // pi.b
    /* JADX INFO: renamed from: q0 */
    public g l() {
        g gVarB = this.f26098a.b();
        this.f26098a.f().D(this.f26099b, 0, gVarB.f26099b, 0);
        return gVarB;
    }

    @Override // ri.f
    /* JADX INFO: renamed from: r0 */
    public g A(double d10) {
        g gVarB = this.f26098a.b();
        double[] dArr = this.f26099b;
        System.arraycopy(dArr, 1, gVarB.f26099b, 1, dArr.length - 1);
        gVarB.f26099b[0] = d10;
        return gVarB;
    }

    @Override // pi.e
    public /* synthetic */ double s() {
        return c.c(this);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: t */
    public g x(double d10) {
        g gVarB = this.f26098a.b();
        double d11 = 1.0d / d10;
        int i10 = 0;
        while (true) {
            double[] dArr = gVarB.f26099b;
            if (i10 >= dArr.length) {
                return gVarB;
            }
            dArr[i10] = this.f26099b[i10] * d11;
            i10++;
        }
    }

    @Override // pi.b
    /* JADX INFO: renamed from: z */
    public g T(g gVar) {
        this.f26098a.d(gVar.f26098a);
        g gVarB = this.f26098a.b();
        this.f26098a.f().n(this.f26099b, 0, gVar.f26099b, 0, gVarB.f26099b, 0);
        return gVarB;
    }

    @Override // pi.b
    public /* bridge */ /* synthetic */ pi.e add(double d10) {
        return add(d10);
    }

    @Override // pi.b
    public /* bridge */ /* synthetic */ pi.e j(double d10) {
        return j(d10);
    }

    g(b bVar) {
        this.f26098a = bVar;
        this.f26099b = new double[bVar.f().s()];
    }
}
