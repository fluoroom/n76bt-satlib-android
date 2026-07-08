package om.sstvencoder.Modes;

import android.graphics.Bitmap;
import zh.e;
import zh.g;

/* JADX INFO: loaded from: classes3.dex */
abstract class PD extends Mode {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e f23751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f23752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final double f23753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f23754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final double f23755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected double f23756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f23757m;

    PD(Bitmap bitmap, ai.a aVar) {
        super(bitmap, aVar);
        this.f23751g = g.a(this.f23745a, 1345336372);
        this.f23752h = d(20.0d);
        this.f23753i = 1200.0d;
        this.f23754j = d(2.08d);
        this.f23755k = 1500.0d;
    }

    private void n() {
        for (int i10 = 0; i10 < this.f23754j; i10++) {
            j(this.f23755k);
        }
    }

    private void o() {
        for (int i10 = 0; i10 < this.f23752h; i10++) {
            j(this.f23753i);
        }
    }

    private void p(int i10) {
        for (int i11 = 0; i11 < this.f23757m; i11++) {
            e eVar = this.f23751g;
            i(eVar.b((eVar.d() * i11) / this.f23757m, i10));
        }
    }

    private void q(int i10) {
        for (int i11 = 0; i11 < this.f23757m; i11++) {
            e eVar = this.f23751g;
            i(eVar.c((eVar.d() * i11) / this.f23757m, i10));
        }
    }

    private void r(int i10) {
        for (int i11 = 0; i11 < this.f23757m; i11++) {
            e eVar = this.f23751g;
            i(eVar.e((eVar.d() * i11) / this.f23757m, i10));
        }
    }

    @Override // om.sstvencoder.Modes.Mode, yh.a
    public int c() {
        return this.f23745a.getHeight() / 2;
    }

    @Override // om.sstvencoder.Modes.Mode
    protected int h() {
        return (this.f23745a.getHeight() / 2) * (this.f23752h + this.f23754j + (this.f23757m * 4));
    }

    @Override // om.sstvencoder.Modes.Mode
    protected void m() {
        o();
        n();
        r(this.f23747c);
        q(this.f23747c);
        p(this.f23747c);
        int i10 = this.f23747c + 1;
        this.f23747c = i10;
        r(i10);
    }
}
