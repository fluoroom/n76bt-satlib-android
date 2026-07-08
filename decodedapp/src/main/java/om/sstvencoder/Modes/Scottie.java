package om.sstvencoder.Modes;

import android.graphics.Bitmap;
import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
abstract class Scottie extends Mode {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f23782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f23783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f23784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double f23785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f23786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final double f23787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected double f23788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f23789n;

    Scottie(Bitmap bitmap, ai.a aVar) {
        super(bitmap, aVar);
        this.f23782g = d(9.0d);
        this.f23783h = 1200.0d;
        this.f23784i = d(1.5d);
        this.f23785j = 1500.0d;
        this.f23786k = d(1.5d);
        this.f23787l = 1500.0d;
    }

    private void n(int i10) {
        for (int i11 = 0; i11 < this.f23789n; i11++) {
            i(Color.blue(t(i11, i10)));
        }
    }

    private void o(int i10) {
        for (int i11 = 0; i11 < this.f23789n; i11++) {
            i(Color.green(t(i11, i10)));
        }
    }

    private void p(int i10) {
        for (int i11 = 0; i11 < this.f23789n; i11++) {
            i(Color.red(t(i11, i10)));
        }
    }

    private void q() {
        for (int i10 = 0; i10 < this.f23786k; i10++) {
            j(this.f23787l);
        }
    }

    private void r() {
        for (int i10 = 0; i10 < this.f23784i; i10++) {
            j(this.f23785j);
        }
    }

    private void s() {
        for (int i10 = 0; i10 < this.f23782g; i10++) {
            j(this.f23783h);
        }
    }

    private int t(int i10, int i11) {
        return this.f23745a.getPixel((i10 * this.f23745a.getWidth()) / this.f23789n, i11);
    }

    @Override // om.sstvencoder.Modes.Mode
    protected int h() {
        int i10 = (this.f23786k * 2) + (this.f23789n * 3);
        int i11 = this.f23782g;
        return i11 + (this.f23745a.getHeight() * (i10 + i11 + this.f23784i));
    }

    @Override // om.sstvencoder.Modes.Mode
    protected void m() {
        if (this.f23747c == 0) {
            s();
        }
        q();
        o(this.f23747c);
        q();
        n(this.f23747c);
        s();
        r();
        p(this.f23747c);
    }
}
