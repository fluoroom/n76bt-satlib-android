package om.sstvencoder.Modes;

import android.graphics.Bitmap;
import zh.e;
import zh.g;

/* JADX INFO: loaded from: classes3.dex */
@yh.c(height = 240, width = 320)
@a(name = "Robot 36")
public class Robot36 extends Mode {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e f23758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f23759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f23760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f23761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final double f23762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f23763l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final double f23764m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f23765n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final double f23766o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f23767p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final double f23768q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final double f23769r;

    Robot36(Bitmap bitmap, ai.a aVar) {
        super(bitmap, aVar);
        this.f23758g = g.a(this.f23745a, 17);
        this.f23746b = 8;
        this.f23759h = d(88.0d);
        this.f23760i = d(44.0d);
        this.f23761j = d(9.0d);
        this.f23762k = 1200.0d;
        this.f23763l = d(3.0d);
        this.f23764m = 1500.0d;
        this.f23765n = d(1.5d);
        this.f23766o = 1900.0d;
        this.f23767p = d(4.5d);
        this.f23768q = 1500.0d;
        this.f23769r = 2300.0d;
    }

    private void n() {
        for (int i10 = 0; i10 < this.f23765n; i10++) {
            j(this.f23766o);
        }
    }

    private void o(double d10) {
        for (int i10 = 0; i10 < this.f23767p; i10++) {
            j(d10);
        }
    }

    private void p() {
        for (int i10 = 0; i10 < this.f23763l; i10++) {
            j(this.f23764m);
        }
    }

    private void q() {
        for (int i10 = 0; i10 < this.f23761j; i10++) {
            j(this.f23762k);
        }
    }

    private void r(int i10) {
        for (int i11 = 0; i11 < this.f23760i; i11++) {
            e eVar = this.f23758g;
            i(eVar.b((eVar.d() * i11) / this.f23760i, i10));
        }
    }

    private void s(int i10) {
        for (int i11 = 0; i11 < this.f23760i; i11++) {
            e eVar = this.f23758g;
            i(eVar.c((eVar.d() * i11) / this.f23760i, i10));
        }
    }

    private void t(int i10) {
        for (int i11 = 0; i11 < this.f23759h; i11++) {
            e eVar = this.f23758g;
            i(eVar.e((eVar.d() * i11) / this.f23759h, i10));
        }
    }

    @Override // om.sstvencoder.Modes.Mode, yh.a
    public /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    @Override // om.sstvencoder.Modes.Mode, yh.a
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // om.sstvencoder.Modes.Mode, yh.a
    public /* bridge */ /* synthetic */ int c() {
        return super.c();
    }

    @Override // om.sstvencoder.Modes.Mode
    protected int h() {
        return this.f23745a.getHeight() * (this.f23761j + this.f23763l + this.f23759h + this.f23767p + this.f23765n + this.f23760i);
    }

    @Override // om.sstvencoder.Modes.Mode, yh.a
    public /* bridge */ /* synthetic */ void k(boolean z10) {
        super.k(z10);
    }

    @Override // om.sstvencoder.Modes.Mode
    protected void m() {
        q();
        p();
        t(this.f23747c);
        if (this.f23747c % 2 == 0) {
            o(this.f23768q);
            n();
            s(this.f23747c);
        } else {
            o(this.f23769r);
            n();
            r(this.f23747c);
        }
    }
}
