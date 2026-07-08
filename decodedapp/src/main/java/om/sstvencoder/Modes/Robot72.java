package om.sstvencoder.Modes;

import android.graphics.Bitmap;
import zh.e;
import zh.g;

/* JADX INFO: loaded from: classes3.dex */
@yh.c(height = 240, width = 320)
@a(name = "Robot 72")
class Robot72 extends Mode {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e f23770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f23771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f23772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f23773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final double f23774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f23775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final double f23776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f23777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final double f23778o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f23779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final double f23780q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final double f23781r;

    Robot72(Bitmap bitmap, ai.a aVar) {
        super(bitmap, aVar);
        this.f23770g = g.a(this.f23745a, 20);
        this.f23746b = 12;
        this.f23771h = d(138.0d);
        this.f23772i = d(69.0d);
        this.f23773j = d(9.0d);
        this.f23774k = 1200.0d;
        this.f23775l = d(3.0d);
        this.f23776m = 1500.0d;
        this.f23777n = d(1.5d);
        this.f23778o = 1900.0d;
        this.f23779p = d(4.5d);
        this.f23780q = 1500.0d;
        this.f23781r = 2300.0d;
    }

    private void n() {
        for (int i10 = 0; i10 < this.f23777n; i10++) {
            j(this.f23778o);
        }
    }

    private void o(double d10) {
        for (int i10 = 0; i10 < this.f23779p; i10++) {
            j(d10);
        }
    }

    private void p() {
        for (int i10 = 0; i10 < this.f23775l; i10++) {
            j(this.f23776m);
        }
    }

    private void q() {
        for (int i10 = 0; i10 < this.f23773j; i10++) {
            j(this.f23774k);
        }
    }

    private void r(int i10) {
        for (int i11 = 0; i11 < this.f23772i; i11++) {
            e eVar = this.f23770g;
            i(eVar.b((eVar.d() * i11) / this.f23772i, i10));
        }
    }

    private void s(int i10) {
        for (int i11 = 0; i11 < this.f23772i; i11++) {
            e eVar = this.f23770g;
            i(eVar.c((eVar.d() * i11) / this.f23772i, i10));
        }
    }

    private void t(int i10) {
        for (int i11 = 0; i11 < this.f23771h; i11++) {
            e eVar = this.f23770g;
            i(eVar.e((eVar.d() * i11) / this.f23771h, i10));
        }
    }

    @Override // om.sstvencoder.Modes.Mode
    protected int h() {
        return this.f23745a.getHeight() * (this.f23773j + this.f23775l + this.f23771h + ((this.f23779p + this.f23777n + this.f23772i) * 2));
    }

    @Override // om.sstvencoder.Modes.Mode
    protected void m() {
        q();
        p();
        t(this.f23747c);
        o(this.f23780q);
        n();
        s(this.f23747c);
        o(this.f23781r);
        n();
        r(this.f23747c);
    }
}
