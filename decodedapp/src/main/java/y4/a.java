package y4;

import a6.v;
import d5.a;
import rd.m;
import v4.p0;
import v4.q0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.d f32375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a.d f32377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f32381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f32382h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f32383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d f32384s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f32385t;

    public a() {
        a.d dVar = a.d.FM;
        this.f32375a = dVar;
        this.f32377c = dVar;
        this.f32381g = e.f32419b;
        this.f32382h = c.f32399b;
        this.f32384s = d.f32412a;
    }

    @Override // v4.q0
    public byte[] a(int i10) {
        int i11 = i10 >= 137 ? 16 : 14;
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = 0;
        }
        v vVar = new v(bArr);
        vVar.n(this.f32375a.ordinal(), 2).n(this.f32376b, 30).n(this.f32377c.ordinal(), 2).n(this.f32378d, 30).n(this.f32379e, 16).n(this.f32380f, 16).p(this.f32383r).n(this.f32381g.ordinal(), 3).n(this.f32382h.ordinal(), 4).n(0, 6).n(this.f32384s.ordinal(), 2);
        if (i10 >= 137) {
            vVar.n(this.f32385t, 16);
        }
        return bArr;
    }

    @Override // v4.q0
    public /* synthetic */ byte[] b() {
        return p0.a(this);
    }

    public final c c() {
        return this.f32382h;
    }

    public final a.d d() {
        return this.f32375a;
    }

    public final int e() {
        return this.f32379e;
    }

    public final int f() {
        return this.f32376b;
    }

    public final a.d g() {
        return this.f32377c;
    }

    public final int h() {
        return this.f32378d;
    }

    public final void i(int i10) {
        this.f32385t = i10;
    }

    public final void j(c cVar) {
        m.e(cVar, "<set-?>");
        this.f32382h = cVar;
    }

    public final void k(d dVar) {
        m.e(dVar, "<set-?>");
        this.f32384s = dVar;
    }

    public final void l(a.d dVar) {
        m.e(dVar, "<set-?>");
        this.f32375a = dVar;
    }

    public final void m(int i10) {
        this.f32379e = i10;
    }

    public final void n(int i10) {
        this.f32376b = i10;
    }

    public final void o(a.d dVar) {
        m.e(dVar, "<set-?>");
        this.f32377c = dVar;
    }

    public final void p(int i10) {
        this.f32380f = i10;
    }

    public final void q(int i10) {
        this.f32378d = i10;
    }

    public final void r(boolean z10) {
        this.f32383r = z10;
    }

    public String toString() {
        return "FreqModeParameter(rxModulation=" + this.f32375a + ", rx_freq=" + this.f32376b + ", txModulation=" + this.f32377c + ", tx_freq=" + this.f32378d + ", rx_ctcss_dcs=" + this.f32379e + ", tx_ctcss_dcs=" + this.f32380f + ", step=" + this.f32381g + ", mode=" + this.f32382h + ", tx_power=" + this.f32383r + ')';
    }

    public a(b bVar) {
        m.e(bVar, "status");
        a.d dVar = a.d.FM;
        this.f32375a = dVar;
        this.f32377c = dVar;
        this.f32381g = e.f32419b;
        this.f32382h = c.f32399b;
        this.f32384s = d.f32412a;
        this.f32375a = bVar.c();
        this.f32376b = bVar.e();
        this.f32379e = bVar.d();
        this.f32377c = bVar.k();
        this.f32378d = bVar.m();
        this.f32380f = bVar.l();
        this.f32381g = bVar.i();
        this.f32382h = bVar.b();
        this.f32383r = bVar.o();
    }
}
