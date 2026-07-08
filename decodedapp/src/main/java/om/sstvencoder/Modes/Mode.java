package om.sstvencoder.Modes;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
abstract class Mode implements yh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Bitmap f23745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f23746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f23747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ai.a f23748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f23749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f23750f;

    protected Mode(Bitmap bitmap, ai.a aVar) {
        this.f23748d = aVar;
        this.f23749e = aVar.j();
        this.f23745a = bitmap;
    }

    private void e() {
        Bitmap bitmap = this.f23745a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f23745a.recycle();
        this.f23745a = null;
    }

    private int f() {
        return (d(300.0d) * 2) + d(10.0d) + (d(30.0d) * 10);
    }

    private int g() {
        return f() + h();
    }

    private void l() {
        int iD = d(300.0d);
        int iD2 = d(10.0d);
        int iD3 = d(30.0d);
        double[] dArr = {1300.0d, 1100.0d};
        for (int i10 = 0; i10 < iD; i10++) {
            j(1900.0d);
        }
        for (int i11 = 0; i11 < iD2; i11++) {
            j(1200.0d);
        }
        for (int i12 = 0; i12 < iD; i12++) {
            j(1900.0d);
        }
        for (int i13 = 0; i13 < iD3; i13++) {
            j(1200.0d);
        }
        int i14 = 0;
        for (int i15 = 0; i15 < 7; i15++) {
            int i16 = (this.f23746b >> i15) & 1;
            i14 ^= i16;
            for (int i17 = 0; i17 < iD3; i17++) {
                j(dArr[i16]);
            }
        }
        for (int i18 = 0; i18 < iD3; i18++) {
            j(dArr[i14]);
        }
        for (int i19 = 0; i19 < iD3; i19++) {
            j(1200.0d);
        }
    }

    @Override // yh.a
    public boolean a() {
        if (this.f23747c >= this.f23745a.getHeight()) {
            return false;
        }
        m();
        this.f23747c++;
        return true;
    }

    @Override // yh.a
    public void b() {
        this.f23750f = 0.0d;
        this.f23747c = 0;
        this.f23748d.l(g());
        l();
    }

    @Override // yh.a
    public int c() {
        return this.f23745a.getHeight();
    }

    protected int d(double d10) {
        return (int) Math.round((d10 * this.f23749e) / 1000.0d);
    }

    protected abstract int h();

    protected void i(int i10) {
        j(((((double) i10) * 800.0d) / 255.0d) + 1500.0d);
    }

    protected void j(double d10) {
        double d11 = (this.f23750f + (((d10 * 2.0d) * 3.141592653589793d) / this.f23749e)) % 6.283185307179586d;
        this.f23750f = d11;
        this.f23748d.p(Math.sin(d11));
    }

    @Override // yh.a
    public void k(boolean z10) {
        this.f23748d.k(z10);
        e();
    }

    protected abstract void m();
}
