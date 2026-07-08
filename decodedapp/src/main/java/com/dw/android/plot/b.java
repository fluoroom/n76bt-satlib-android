package com.dw.android.plot;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: loaded from: classes.dex */
public class b extends q3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PlotView f5262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f5263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f5264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q3.b f5265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f5266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f5268j = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.m();
        }
    }

    public b(PlotView plotView) {
        this.f5262d = plotView;
        Paint paint = new Paint();
        this.f5263e = paint;
        paint.setColor(-16777216);
        this.f5263e.setStyle(Paint.Style.STROKE);
        this.f5263e.setStrokeWidth(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        int length;
        int iC;
        float[] fArr = this.f5264f;
        q3.b bVar = this.f5265g;
        if (bVar != null) {
            bVar.s((int) this.f24293a.left);
            length = this.f5265g.d();
            if (fArr == null || fArr.length < length) {
                fArr = new float[length];
            }
            iC = this.f5265g.c(fArr, 0, length);
        } else if (fArr != null) {
            length = fArr.length;
            iC = length;
        } else {
            length = 0;
            iC = 0;
        }
        if (fArr == null || iC == 0) {
            this.f5262d.f();
            this.f5267i = 0;
            return;
        }
        float fE = e();
        float[] fArr2 = this.f5266h;
        if (fArr2 == null || fArr2.length < (length * 4) + 4) {
            this.f5266h = new float[(length * 4) + 4];
        }
        float[] fArr3 = this.f5266h;
        fArr3[0] = 0.0f;
        fArr3[1] = 0.0f;
        float f10 = f();
        int i10 = 2;
        for (int i11 = 0; i11 < iC; i11++) {
            float f11 = i11 * fE;
            float f12 = fArr[i11] * f10;
            float[] fArr4 = this.f5266h;
            fArr4[i10] = f11;
            fArr4[i10 + 1] = f12;
            int i12 = i10 + 3;
            fArr4[i10 + 2] = f11;
            i10 += 4;
            fArr4[i12] = f12;
        }
        float[] fArr5 = this.f5266h;
        fArr5[i10] = fArr5[i10 - 2];
        fArr5[i10 + 1] = fArr5[i10 - 1];
        this.f5267i = i10 + 2;
        this.f5262d.f();
    }

    @Override // q3.c
    public void a(Canvas canvas) {
        if (this.f5267i == 0) {
            q3.b bVar = this.f5265g;
            if (bVar == null || !bVar.q()) {
                return;
            }
            this.f5262d.postDelayed(this.f5268j, 100L);
            return;
        }
        canvas.translate((-(this.f24293a.left % 1.0f)) * e(), this.f24294b / 2);
        canvas.scale(1.0f, -1.0f);
        canvas.drawLines(this.f5266h, 0, this.f5267i, this.f5263e);
        q3.b bVar2 = this.f5265g;
        if (bVar2 == null || !bVar2.q()) {
            return;
        }
        this.f5262d.post(this.f5268j);
    }

    @Override // q3.a, q3.c
    public int b() {
        int length;
        q3.b bVar = this.f5265g;
        if (bVar == null || (length = bVar.length() - this.f5265g.d()) <= 0) {
            return 0;
        }
        return (int) (length * e());
    }

    @Override // q3.a
    protected void g() {
        super.g();
        m();
    }

    @Override // q3.a
    protected void h() {
        super.h();
        if (this.f5265g != null) {
            double dCeil = Math.ceil(this.f24293a.width());
            if (dCeil >= 2.147483645E9d) {
                this.f5265g.g(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            } else {
                this.f5265g.g(((int) dCeil) + 2);
            }
        }
        m();
    }

    public void j(int i10) {
        this.f5263e.setColor(i10);
    }

    public void k(q3.b bVar) {
        this.f5264f = null;
        this.f5265g = bVar;
        h();
    }

    public void l(float f10) {
        this.f5263e.setStrokeWidth(f10);
    }
}
