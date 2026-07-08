package om.sstvencoder.ColorPalette;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f23697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f23698b = new Paint();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f23699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f23700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f23703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f23704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f23705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f23706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f23707k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f23708l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23709m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f23710n;

    a(int[] iArr, float f10) {
        this.f23697a = iArr;
        this.f23700d = f10;
        this.f23708l = f10 * 3.0f;
        i();
        this.f23699c = new RectF();
        this.f23709m = 0;
        this.f23710n = false;
    }

    private void f(Canvas canvas) {
        float f10 = this.f23706j / 2.0f;
        RectF rectF = this.f23699c;
        RectF rectF2 = new RectF(rectF.left - f10, rectF.top - f10, rectF.right + f10, rectF.bottom + f10);
        Paint.Style style = this.f23698b.getStyle();
        j();
        float f11 = this.f23708l;
        canvas.drawRoundRect(rectF2, f11, f11, this.f23698b);
        this.f23698b.setStyle(style);
    }

    static int[] g() {
        return new int[]{-16777216, -7829368, -3355444, -1, -256, -16711681, -16711936, -65281, -65536, -16776961};
    }

    private int h(int i10, int i11) {
        return i10 <= i11 ? i10 : i11;
    }

    private void i() {
        this.f23698b.setStyle(Paint.Style.FILL);
        this.f23698b.setAntiAlias(true);
    }

    private void j() {
        this.f23698b.setStyle(Paint.Style.STROKE);
        this.f23698b.setStrokeWidth(this.f23707k);
        this.f23698b.setColor(-1);
    }

    private void k(int i10) {
        int i11 = i10 / this.f23701e;
        float f10 = this.f23706j;
        float f11 = this.f23705i;
        float f12 = ((i10 - (r0 * i11)) * (f11 + f10)) + f10;
        float f13 = f10 + (i11 * (f11 + f10));
        this.f23699c.set(f12, f13, f12 + f11, f11 + f13);
        this.f23709m = i10;
    }

    private void l() {
        float f10 = (this.f23703g * 6.0f) / ((this.f23701e * 7.0f) + 1.0f);
        this.f23705i = f10;
        this.f23706j = f10 / 6.0f;
    }

    private void m() {
        int length = this.f23697a.length;
        float f10 = this.f23700d * 96.0f;
        this.f23705i = f10;
        float f11 = f10 / 6.0f;
        this.f23706j = f11;
        int iH = h((int) (((this.f23703g - f11) / (f10 + f11)) + 0.5f), length);
        this.f23701e = iH;
        this.f23702f = ((length + iH) - 1) / iH;
        l();
        while (true) {
            float f12 = this.f23702f;
            float f13 = this.f23705i;
            float f14 = this.f23706j;
            if ((f12 * (f13 + f14)) + f14 <= this.f23704h) {
                return;
            }
            int i10 = this.f23701e + 1;
            this.f23701e = i10;
            this.f23702f = ((length + i10) - 1) / i10;
            l();
        }
    }

    @Override // om.sstvencoder.ColorPalette.b
    public void a(Canvas canvas) {
        if (this.f23710n) {
            float f10 = this.f23706j;
            float f11 = this.f23701e * (this.f23705i + f10);
            float f12 = f10;
            for (int i10 : this.f23697a) {
                float f13 = this.f23705i;
                RectF rectF = new RectF(f10, f12, f10 + f13, f13 + f12);
                this.f23698b.setColor(i10);
                float f14 = this.f23708l;
                canvas.drawRoundRect(rectF, f14, f14, this.f23698b);
                float f15 = this.f23705i;
                float f16 = this.f23706j;
                f10 += f15 + f16;
                if (f10 > f11) {
                    f12 += f15 + f16;
                    f10 = f16;
                }
            }
            f(canvas);
        }
    }

    @Override // om.sstvencoder.ColorPalette.b
    public boolean b(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f23697a;
            if (i11 >= iArr.length) {
                return false;
            }
            if (i10 == iArr[i11]) {
                if (this.f23710n) {
                    k(i11);
                    return true;
                }
                this.f23709m = i11;
                return true;
            }
            i11++;
        }
    }

    @Override // om.sstvencoder.ColorPalette.b
    public boolean c(float f10, float f11) {
        int i10;
        int i11;
        if (this.f23710n && !this.f23699c.contains(f10, f11)) {
            float f12 = this.f23705i;
            float f13 = this.f23706j;
            int i12 = (int) (f10 / (f12 + f13));
            int i13 = (int) (f11 / (f12 + f13));
            if (i13 >= 0 && i13 < this.f23702f && i12 >= 0 && i12 < (i10 = this.f23701e) && (i11 = (i10 * i13) + i12) < this.f23697a.length && i11 != this.f23709m) {
                float f14 = (i12 * (f12 + f13)) + f13;
                float f15 = f13 + (i13 * (f12 + f13));
                if (f14 <= f10 && f10 <= f14 + f12 && f15 <= f11 && f11 <= f15 + f12) {
                    this.f23699c.set(f14, f15, f14 + f12, f12 + f15);
                    this.f23709m = i11;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // om.sstvencoder.ColorPalette.b
    public int d() {
        return this.f23697a[this.f23709m];
    }

    @Override // om.sstvencoder.ColorPalette.b
    public void e(float f10, float f11) {
        boolean z10 = f10 > 0.0f && f11 > 0.0f;
        this.f23710n = z10;
        if (z10) {
            if (this.f23703g == f10 && this.f23704h == f11) {
                return;
            }
            this.f23703g = f10;
            this.f23704h = f11;
            m();
            this.f23707k = this.f23706j / 6.0f;
            k(this.f23709m);
        }
    }
}
