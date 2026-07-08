package q3;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final RectF f24293a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f24294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f24295c;

    @Override // q3.c
    public int b() {
        return 0;
    }

    @Override // q3.c
    public void c(int i10, int i11) {
        if (i10 == this.f24295c && i11 == this.f24294b) {
            return;
        }
        this.f24294b = i11;
        this.f24295c = i10;
        g();
    }

    @Override // q3.c
    public void d(RectF rectF) {
        if (this.f24293a.equals(rectF)) {
            return;
        }
        RectF rectF2 = this.f24293a;
        rectF2.top = rectF.top;
        rectF2.bottom = rectF.bottom;
        rectF2.left = rectF.left;
        rectF2.right = rectF.right;
        h();
    }

    public float e() {
        if (this.f24293a.width() == 0.0f) {
            return 1.0f;
        }
        return Math.abs(this.f24295c / this.f24293a.width());
    }

    public float f() {
        if (this.f24293a.height() == 0.0f) {
            return 1.0f;
        }
        return Math.abs(this.f24294b / this.f24293a.height());
    }

    protected void g() {
    }

    protected void h() {
    }
}
