package com.simplecityapps.recyclerview_fastscroll.views;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import androidx.annotation.Keep;
import cb.a;

/* JADX INFO: loaded from: classes3.dex */
public class FastScrollPopup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FastScrollRecyclerView f10207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources f10208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10210d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f10218l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Paint f10219m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ObjectAnimator f10222p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f10223q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10224r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f10225s;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Path f10211e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RectF f10212f = new RectF();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10214h = -16777216;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Rect f10215i = new Rect();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Rect f10216j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f10217k = new Rect();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Rect f10220n = new Rect();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f10221o = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f10213g = new Paint(1);

    FastScrollPopup(Resources resources, FastScrollRecyclerView fastScrollRecyclerView) {
        this.f10208b = resources;
        this.f10207a = fastScrollRecyclerView;
        Paint paint = new Paint(1);
        this.f10219m = paint;
        paint.setAlpha(0);
        k(a.c(this.f10208b, 32.0f));
        e(a.b(this.f10208b, 62.0f));
    }

    private float[] b() {
        if (this.f10225s == 1) {
            int i10 = this.f10210d;
            return new float[]{i10, i10, i10, i10, i10, i10, i10, i10};
        }
        if (a.a(this.f10208b)) {
            int i11 = this.f10210d;
            return new float[]{i11, i11, i11, i11, i11, i11, 0.0f, 0.0f};
        }
        int i12 = this.f10210d;
        return new float[]{i12, i12, i12, i12, 0.0f, 0.0f, i12, i12};
    }

    public void a(boolean z10) {
        if (this.f10223q != z10) {
            this.f10223q = z10;
            ObjectAnimator objectAnimator = this.f10222p;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", z10 ? 1.0f : 0.0f);
            this.f10222p = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(z10 ? 200L : 150L);
            this.f10222p.start();
        }
    }

    public void c(Canvas canvas) {
        float fHeight;
        if (d()) {
            int iSave = canvas.save();
            Rect rect = this.f10217k;
            canvas.translate(rect.left, rect.top);
            this.f10216j.set(this.f10217k);
            this.f10216j.offsetTo(0, 0);
            this.f10211e.reset();
            this.f10212f.set(this.f10216j);
            float[] fArrB = b();
            if (this.f10224r == 1) {
                Paint.FontMetrics fontMetrics = this.f10219m.getFontMetrics();
                fHeight = ((this.f10217k.height() - fontMetrics.ascent) - fontMetrics.descent) / 2.0f;
            } else {
                fHeight = (this.f10217k.height() + this.f10220n.height()) / 2.0f;
            }
            this.f10211e.addRoundRect(this.f10212f, fArrB, Path.Direction.CW);
            this.f10213g.setAlpha((int) (Color.alpha(this.f10214h) * this.f10221o));
            this.f10219m.setAlpha((int) (this.f10221o * 255.0f));
            canvas.drawPath(this.f10211e, this.f10213g);
            canvas.drawText(this.f10218l, (this.f10217k.width() - this.f10220n.width()) / 2.0f, fHeight, this.f10219m);
            canvas.restoreToCount(iSave);
        }
    }

    public boolean d() {
        return this.f10221o > 0.0f && !TextUtils.isEmpty(this.f10218l);
    }

    public void e(int i10) {
        this.f10209c = i10;
        this.f10210d = i10 / 2;
        this.f10207a.invalidate(this.f10217k);
    }

    public void f(int i10) {
        this.f10214h = i10;
        this.f10213g.setColor(i10);
        this.f10207a.invalidate(this.f10217k);
    }

    public void g(int i10) {
        this.f10225s = i10;
    }

    @Keep
    public float getAlpha() {
        return this.f10221o;
    }

    public void h(int i10) {
        this.f10224r = i10;
    }

    public void i(String str) {
        if (str.equals(this.f10218l)) {
            return;
        }
        this.f10218l = str;
        this.f10219m.getTextBounds(str, 0, str.length(), this.f10220n);
        this.f10220n.right = (int) (r0.left + this.f10219m.measureText(str));
    }

    public void j(int i10) {
        this.f10219m.setColor(i10);
        this.f10207a.invalidate(this.f10217k);
    }

    public void k(int i10) {
        this.f10219m.setTextSize(i10);
        this.f10207a.invalidate(this.f10217k);
    }

    public void l(Typeface typeface) {
        this.f10219m.setTypeface(typeface);
        this.f10207a.invalidate(this.f10217k);
    }

    public Rect m(FastScrollRecyclerView fastScrollRecyclerView, int i10) {
        this.f10215i.set(this.f10217k);
        if (d()) {
            int scrollBarWidth = fastScrollRecyclerView.getScrollBarWidth();
            int iRound = Math.round((this.f10209c - this.f10220n.height()) / 10.0f);
            int i11 = this.f10209c;
            int iMax = Math.max(i11, this.f10220n.width() + (iRound * 10));
            if (this.f10225s == 1) {
                this.f10217k.left = (fastScrollRecyclerView.getWidth() - iMax) / 2;
                Rect rect = this.f10217k;
                rect.right = rect.left + iMax;
                rect.top = (fastScrollRecyclerView.getHeight() - i11) / 2;
            } else {
                if (a.a(this.f10208b)) {
                    this.f10217k.left = fastScrollRecyclerView.getScrollBarWidth() * 2;
                    Rect rect2 = this.f10217k;
                    rect2.right = rect2.left + iMax;
                } else {
                    this.f10217k.right = fastScrollRecyclerView.getWidth() - (fastScrollRecyclerView.getScrollBarWidth() * 2);
                    Rect rect3 = this.f10217k;
                    rect3.left = rect3.right - iMax;
                }
                this.f10217k.top = (((fastScrollRecyclerView.getPaddingTop() - fastScrollRecyclerView.getPaddingBottom()) + i10) - i11) + (fastScrollRecyclerView.getScrollBarThumbHeight() / 2);
                this.f10217k.top = Math.max(fastScrollRecyclerView.getPaddingTop() + scrollBarWidth, Math.min(this.f10217k.top, ((fastScrollRecyclerView.getPaddingTop() + fastScrollRecyclerView.getHeight()) - scrollBarWidth) - i11));
            }
            Rect rect4 = this.f10217k;
            rect4.bottom = rect4.top + i11;
        } else {
            this.f10217k.setEmpty();
        }
        this.f10215i.union(this.f10217k);
        return this.f10215i;
    }

    @Keep
    public void setAlpha(float f10) {
        this.f10221o = f10;
        this.f10207a.invalidate(this.f10217k);
    }
}
