package com.dw.android.plot;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends q3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f5251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final PlotView f5252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f5253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f5254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f5255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f5256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Paint f5257j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f5259l = -3.4028235E38f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f5260m = Float.MAX_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f5261n = Float.MAX_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f5258k = 10.0f;

    public a(PlotView plotView, boolean z10) {
        this.f5252e = plotView;
        this.f5251d = z10;
        Paint paint = new Paint();
        this.f5257j = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f5257j.setStrokeWidth(1.0f);
    }

    @Override // q3.a, q3.c
    public int b() {
        return 0;
    }

    @Override // q3.a
    protected void g() {
        super.g();
        this.f5252e.f();
    }

    @Override // q3.a
    protected void h() {
        super.h();
        this.f5252e.f();
    }

    protected void i() {
        this.f5252e.f();
    }

    public void j(int i10) {
        if (i10 == this.f5257j.getColor()) {
            return;
        }
        this.f5257j.setColor(i10);
        i();
    }

    public void k(float f10) {
        if (f10 == this.f5257j.getStrokeWidth()) {
            return;
        }
        this.f5257j.setStrokeWidth(f10);
        i();
    }

    public void l(float f10) {
        if (this.f5258k == f10) {
            return;
        }
        this.f5258k = f10;
        i();
    }
}
