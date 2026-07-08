package com.dw.android.widget;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b f5427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f5428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f5429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected RectF f5430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f5431e;

    protected e(b bVar) {
        this.f5427a = bVar;
    }

    static e d(b bVar) {
        return new f(bVar);
    }

    public void a(Path path) {
        RectF rectF = this.f5430d;
        if (rectF == null) {
            return;
        }
        RectF rectF2 = this.f5427a.f5414d;
        if ((this.f5429c & 48) != 48) {
            rectF.offsetTo(rectF2.left, rectF2.top);
            RectF rectF3 = this.f5430d;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(rectF3, direction);
            this.f5430d.offset(rectF2.width() - this.f5430d.width(), 0.0f);
            path.addRect(this.f5430d, direction);
        }
        if ((this.f5429c & 80) != 80) {
            RectF rectF4 = this.f5430d;
            rectF4.offsetTo(rectF2.left, rectF2.bottom - rectF4.height());
            RectF rectF5 = this.f5430d;
            Path.Direction direction2 = Path.Direction.CW;
            path.addRect(rectF5, direction2);
            this.f5430d.offset(rectF2.width() - this.f5430d.width(), 0.0f);
            path.addRect(this.f5430d, direction2);
        }
    }

    public abstract void b(Canvas canvas);

    public int c() {
        return this.f5429c;
    }

    public int e() {
        return this.f5428b;
    }

    public boolean f() {
        return this.f5431e;
    }

    public void g(int i10, int i11) {
        if (this.f5428b == i10 && this.f5429c == i11) {
            return;
        }
        this.f5428b = i10;
        this.f5429c = i11;
        this.f5431e = i10 > 0 && (i11 & 112) != 0;
        i();
    }

    public void h(int i10) {
        g(i10, this.f5429c);
    }

    public void i() {
        if (!this.f5431e) {
            this.f5430d = null;
            return;
        }
        if ((this.f5429c & 112) == 112) {
            this.f5430d = null;
            return;
        }
        RectF rectF = this.f5427a.f5414d;
        float fWidth = this.f5428b + 1;
        if (fWidth > rectF.height() / 2.0f) {
            fWidth = rectF.height() / 2.0f;
        }
        float f10 = this.f5428b + 1;
        if (fWidth > rectF.width() / 2.0f) {
            fWidth = rectF.width() / 2.0f;
        }
        this.f5430d = new RectF(0.0f, 0.0f, f10, fWidth);
    }
}
