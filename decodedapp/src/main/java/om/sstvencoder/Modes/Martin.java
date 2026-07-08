package om.sstvencoder.Modes;

import android.graphics.Bitmap;
import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
abstract class Martin extends Mode {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f23737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f23738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f23739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double f23740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f23741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final double f23742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected double f23743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f23744n;

    Martin(Bitmap bitmap, ai.a aVar) {
        super(bitmap, aVar);
        this.f23737g = d(4.862d);
        this.f23738h = 1200.0d;
        this.f23739i = d(0.572d);
        this.f23740j = 1500.0d;
        this.f23741k = d(0.572d);
        this.f23742l = 1500.0d;
    }

    private void n(int i10) {
        for (int i11 = 0; i11 < this.f23744n; i11++) {
            i(Color.blue(t(i11, i10)));
        }
    }

    private void o(int i10) {
        for (int i11 = 0; i11 < this.f23744n; i11++) {
            i(Color.green(t(i11, i10)));
        }
    }

    private void p(int i10) {
        for (int i11 = 0; i11 < this.f23744n; i11++) {
            i(Color.red(t(i11, i10)));
        }
    }

    private void q() {
        for (int i10 = 0; i10 < this.f23741k; i10++) {
            j(this.f23742l);
        }
    }

    private void r() {
        for (int i10 = 0; i10 < this.f23739i; i10++) {
            j(this.f23740j);
        }
    }

    private void s() {
        for (int i10 = 0; i10 < this.f23737g; i10++) {
            j(this.f23738h);
        }
    }

    private int t(int i10, int i11) {
        return this.f23745a.getPixel((i10 * this.f23745a.getWidth()) / this.f23744n, i11);
    }

    @Override // om.sstvencoder.Modes.Mode
    protected int h() {
        return this.f23745a.getHeight() * (this.f23737g + this.f23739i + ((this.f23741k + this.f23744n) * 3));
    }

    @Override // om.sstvencoder.Modes.Mode
    protected void m() {
        s();
        r();
        o(this.f23747c);
        q();
        n(this.f23747c);
        q();
        p(this.f23747c);
        q();
    }
}
