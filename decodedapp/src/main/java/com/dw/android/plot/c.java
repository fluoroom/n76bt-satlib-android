package com.dw.android.plot;

import a6.k;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Paint f5270o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Paint f5271p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f5272q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f5273r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f5274s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f5275t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f5276u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f5277v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f5278w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f5279x;

    public c(PlotView plotView, boolean z10) {
        super(plotView, z10);
        this.f5270o = new Paint(this.f5257j);
        this.f5271p = new Paint(this.f5257j);
        this.f5257j.setTextAlign(Paint.Align.LEFT);
        this.f5257j.setTextSize(k.b(plotView.getContext(), 12.0f));
        this.f5257j.setAntiAlias(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n() {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dw.android.plot.c.n():void");
    }

    @Override // q3.c
    public void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        Canvas canvas2 = canvas;
        float f14 = this.f5273r;
        if (f14 < this.f5252e.f5228d || f14 <= 0.0f) {
            return;
        }
        float f15 = this.f5277v;
        float f16 = this.f5276u;
        float f17 = this.f5274s;
        float f18 = this.f5275t;
        canvas2.translate(this.f5253f, this.f5254g);
        int i10 = (this.f24294b - this.f5254g) - this.f5256i;
        int i11 = (this.f24295c - this.f5253f) - this.f5255h;
        int i12 = this.f5272q;
        float f19 = f17 + i12;
        float f20 = f18 - i12;
        float f21 = f19 + i12;
        float f22 = f20 - i12;
        int i13 = 0;
        while (f15 < f16) {
            if (i13 % 10 == 0) {
                canvas2.drawLine(f15, f17, f15, f18, this.f5257j);
                f10 = f17;
                f11 = f18;
                canvas2 = canvas;
            } else {
                f10 = f17;
                f11 = f18;
                if (i13 % 5 == 0) {
                    canvas2 = canvas;
                    canvas2.drawLine(f15, f19, f15, f20, this.f5270o);
                } else {
                    canvas2 = canvas;
                    f12 = f21;
                    f13 = f22;
                    canvas2.drawLine(f15, f12, f15, f13, this.f5271p);
                    f15 += f14;
                    i13++;
                    f21 = f12;
                    f22 = f13;
                    f17 = f10;
                    f18 = f11;
                }
            }
            f12 = f21;
            f13 = f22;
            f15 += f14;
            i13++;
            f21 = f12;
            f22 = f13;
            f17 = f10;
            f18 = f11;
        }
        if (this.f5279x != null) {
            this.f5257j.setTextAlign(Paint.Align.LEFT);
            canvas2.drawText(this.f5279x, 3.0f, i10 - 3, this.f5257j);
        }
        if (this.f5278w != null) {
            this.f5257j.setTextAlign(Paint.Align.CENTER);
            canvas2.drawText(this.f5278w, i11 / 2, i10 - 3, this.f5257j);
        }
    }

    @Override // com.dw.android.plot.a, q3.a
    protected void g() {
        n();
        super.g();
    }

    @Override // com.dw.android.plot.a, q3.a
    protected void h() {
        n();
        super.h();
    }

    @Override // com.dw.android.plot.a
    protected void i() {
        n();
        super.i();
    }

    @Override // com.dw.android.plot.a
    public void j(int i10) {
        this.f5270o.setColor(o3.a.a(i10, 0.5f));
        this.f5271p.setColor(o3.a.a(i10, 0.25f));
        super.j(i10);
    }

    public void m(int i10) {
        if (this.f5272q == i10) {
            return;
        }
        this.f5272q = i10;
        i();
    }
}
