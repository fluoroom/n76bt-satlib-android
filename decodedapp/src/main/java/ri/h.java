package ri;

/* JADX INFO: loaded from: classes3.dex */
public class h extends l implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f26100c = new h(3.141592653589793d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f26101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f26102b;

    public h(double d10, double d11) {
        this.f26101a = d10;
        this.f26102b = d11;
    }

    @Override // pi.b
    public /* synthetic */ aj.f S() {
        return d.m(this);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public h R() {
        return Double.doubleToLongBits(this.f26101a) < 0 ? negate() : this;
    }

    @Override // pi.e
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public h H(h hVar) {
        return new h(this.f26101a + hVar.f26101a, this.f26102b + hVar.f26102b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        int iCompare = Double.compare(this.f26101a, hVar.s());
        return iCompare == 0 ? Double.compare(this.f26102b, hVar.d0()) : iCompare;
    }

    @Override // ri.e
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public h G(double d10, double d11) {
        return new h(d10, this.f26102b * d11);
    }

    @Override // pi.b
    public /* synthetic */ pi.b a() {
        return d.a(this);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public h x(double d10) {
        double d11 = 1.0d / d10;
        return new h(this.f26101a * d11, this.f26102b * d11);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public h T(h hVar) {
        double d10 = hVar.f26101a;
        double d11 = 1.0d / d10;
        double d12 = d11 * d11;
        double d13 = this.f26101a;
        return new h(d13 * d11, aj.i.d(this.f26102b, d10, -d13, hVar.f26102b) * d12);
    }

    @Override // pi.e
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public i q() {
        return i.c();
    }

    @Override // pi.b
    public /* synthetic */ pi.b d(int i10) {
        return d.i(this, i10);
    }

    public double d0() {
        return this.f26102b;
    }

    @Override // pi.b
    public /* synthetic */ pi.b e() {
        return d.n(this);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public h D() {
        return f26100c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f26101a == hVar.f26101a && this.f26102b == hVar.f26102b) {
                return true;
            }
        }
        return false;
    }

    @Override // pi.b
    public /* synthetic */ pi.b f() {
        return d.e(this);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public h C(double d10, h hVar, double d11, h hVar2) {
        return new h(aj.i.d(d10, hVar.f26101a, d11, hVar2.f26101a), aj.i.d(d10, hVar.f26102b, d11, hVar2.f26102b));
    }

    @Override // pi.b
    public /* synthetic */ pi.b g() {
        return d.k(this);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public h v(double d10, h hVar, double d11, h hVar2, double d12, h hVar3) {
        return new h(aj.i.e(d10, hVar.f26101a, d11, hVar2.f26101a, d12, hVar3.f26101a), aj.i.e(d10, hVar.f26102b, d11, hVar2.f26102b, d12, hVar3.f26102b));
    }

    @Override // ri.f
    public double getValue() {
        return this.f26101a;
    }

    @Override // pi.b
    public /* synthetic */ pi.b h() {
        return d.p(this);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public h r(h hVar, h hVar2, h hVar3, h hVar4) {
        return new h(aj.i.d(hVar.f26101a, hVar2.f26101a, hVar3.f26101a, hVar4.f26101a), aj.i.f(hVar.f26101a, hVar2.f26102b, hVar.f26102b, hVar2.f26101a, hVar3.f26101a, hVar4.f26102b, hVar3.f26102b, hVar4.f26101a));
    }

    public int hashCode() {
        return (453 - (o4.c.a(this.f26101a) * 19)) + (o4.c.a(this.f26102b) * 37);
    }

    @Override // pi.b
    public /* synthetic */ pi.b i() {
        return d.c(this);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public h K(double d10) {
        return new h(this.f26101a * d10, this.f26102b * d10);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public h L(int i10) {
        double d10 = i10;
        return new h(this.f26101a * d10, this.f26102b * d10);
    }

    @Override // pi.e
    public /* synthetic */ pi.b k() {
        return d.g(this);
    }

    @Override // pi.e
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public h N(h hVar) {
        double d10 = this.f26101a;
        double d11 = hVar.f26101a;
        return new h(d10 * d11, aj.i.d(this.f26102b, d11, d10, hVar.f26102b));
    }

    @Override // pi.b
    public /* synthetic */ pi.b l() {
        return d.t(this);
    }

    @Override // pi.e
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public h negate() {
        return new h(-this.f26101a, -this.f26102b);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public h w(double d10) {
        return new h(d10, 0.0d);
    }

    @Override // pi.b
    public /* synthetic */ pi.b n() {
        return d.r(this);
    }

    @Override // pi.b
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public h O(h hVar) {
        return new h(this.f26101a - hVar.f26101a, this.f26102b - hVar.f26102b);
    }

    @Override // ri.f
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public h A(double d10) {
        return new h(d10, this.f26102b);
    }

    @Override // pi.b
    public /* bridge */ /* synthetic */ pi.e a() {
        return a();
    }

    @Override // pi.b
    public /* bridge */ /* synthetic */ pi.e d(int i10) {
        return d(i10);
    }

    @Override // pi.b
    public /* bridge */ /* synthetic */ pi.e e() {
        return e();
    }

    @Override // pi.b
    public /* bridge */ /* synthetic */ pi.e f() {
        return f();
    }

    @Override // pi.b
    public /* bridge */ /* synthetic */ pi.e g() {
        return g();
    }

    @Override // pi.b
    public /* bridge */ /* synthetic */ pi.e h() {
        return h();
    }

    @Override // pi.b
    public /* bridge */ /* synthetic */ pi.e i() {
        return i();
    }

    @Override // pi.e
    public /* bridge */ /* synthetic */ pi.e k() {
        return k();
    }

    @Override // pi.b
    public /* bridge */ /* synthetic */ pi.e l() {
        return l();
    }

    @Override // pi.b
    public /* bridge */ /* synthetic */ pi.e n() {
        return n();
    }
}
