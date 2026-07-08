package om.sstvencoder.Modes;

import android.graphics.Bitmap;
import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
@yh.c(height = 256, width = 320)
@a(name = "Wraase SC2 180")
class Wraase extends Mode {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f23790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f23791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f23792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double f23793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f23794k;

    Wraase(Bitmap bitmap, ai.a aVar) {
        super(bitmap, aVar);
        this.f23746b = 55;
        this.f23794k = d(235.0d);
        this.f23790g = d(5.5225d);
        this.f23791h = 1200.0d;
        this.f23792i = d(0.5d);
        this.f23793j = 1500.0d;
    }

    private void n(int i10) {
        for (int i11 = 0; i11 < this.f23794k; i11++) {
            i(Color.blue(s(i11, i10)));
        }
    }

    private void o(int i10) {
        for (int i11 = 0; i11 < this.f23794k; i11++) {
            i(Color.green(s(i11, i10)));
        }
    }

    private void p() {
        for (int i10 = 0; i10 < this.f23792i; i10++) {
            j(this.f23793j);
        }
    }

    private void q(int i10) {
        for (int i11 = 0; i11 < this.f23794k; i11++) {
            i(Color.red(s(i11, i10)));
        }
    }

    private void r() {
        for (int i10 = 0; i10 < this.f23790g; i10++) {
            j(this.f23791h);
        }
    }

    private int s(int i10, int i11) {
        return this.f23745a.getPixel((i10 * this.f23745a.getWidth()) / this.f23794k, i11);
    }

    @Override // om.sstvencoder.Modes.Mode
    protected int h() {
        return this.f23745a.getHeight() * (this.f23790g + this.f23792i + (this.f23794k * 3));
    }

    @Override // om.sstvencoder.Modes.Mode
    protected void m() {
        r();
        p();
        q(this.f23747c);
        o(this.f23747c);
        n(this.f23747c);
    }
}
