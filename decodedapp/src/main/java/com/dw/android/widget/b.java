package com.dw.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.dw.widget.LinearLayoutEx;
import k3.l;
import m0.o0;
import u3.s;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayoutEx.d f5411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f5412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f5413c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    View f5415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Path f5417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5418h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5422l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5423m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final RectF f5414d = new RectF();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f5419i = new Rect();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f5420j = new Rect();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f5424n = true;

    public interface a {
        void b(Canvas canvas);
    }

    public b(View view, Context context, AttributeSet attributeSet, int i10, int i11) {
        if (!(view instanceof a)) {
            throw new IllegalArgumentException("view mast implement CornerView");
        }
        this.f5415e = view;
        this.f5412b = e.d(this);
        d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f19254b0, i10, i11);
        g(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f19264d0, 0), typedArrayObtainStyledAttributes.getInt(l.f19259c0, 112));
        k(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f19269e0, 0), typedArrayObtainStyledAttributes.getInt(l.f19274f0, 119));
        m(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f19279g0, 0), typedArrayObtainStyledAttributes.getInt(l.f19284h0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void d() {
        int paddingLeft = this.f5415e.getPaddingLeft();
        int paddingRight = this.f5415e.getPaddingRight();
        Rect rect = this.f5420j;
        int i10 = rect.left;
        if (i10 == paddingRight && rect.right == paddingLeft) {
            Rect rect2 = this.f5419i;
            int i11 = rect2.left;
            rect2.left = rect2.right;
            rect2.right = i11;
        } else {
            if (i10 != paddingLeft) {
                this.f5419i.left = paddingLeft;
            }
            if (rect.right != paddingRight) {
                this.f5419i.right = paddingRight;
            }
        }
        if (rect.top != this.f5415e.getPaddingTop()) {
            this.f5419i.top = this.f5415e.getPaddingTop();
        }
        if (this.f5420j.bottom != this.f5415e.getPaddingBottom()) {
            this.f5419i.bottom = this.f5415e.getPaddingBottom();
        }
    }

    private void k(int i10, int i11) {
        boolean z10 = (this.f5416f == i10 && this.f5418h == i11) ? false : true;
        this.f5416f = i10;
        this.f5418h = i11;
        if (i10 > 0 && i11 != 0) {
            this.f5415e.setWillNotDraw(false);
            o0.x0(this.f5415e, 1, null);
        }
        if (z10) {
            o();
        }
    }

    private void o() {
        if (this.f5423m) {
            return;
        }
        this.f5423m = true;
        int i10 = this.f5416f;
        int i11 = this.f5418h;
        double d10 = i10;
        int iFloor = (int) Math.floor(0.6d * d10);
        int iCeil = (int) Math.ceil(d10 * 1.4d);
        Rect rect = this.f5420j;
        int i12 = (i11 & 3) == 3 ? i10 : 0;
        Rect rect2 = this.f5419i;
        int i13 = i12 + rect2.left;
        rect.left = i13;
        if ((i11 & 48) != 48) {
            iFloor = 0;
        }
        int i14 = iFloor + rect2.top;
        rect.top = i14;
        if ((i11 & 5) != 5) {
            i10 = 0;
        }
        int i15 = i10 + rect2.right;
        rect.right = i15;
        if ((i11 & 80) != 80) {
            iCeil = 0;
        }
        int i16 = iCeil + rect2.bottom;
        rect.bottom = i16;
        this.f5415e.setPadding(i13, i14, i15, i16);
        this.f5423m = false;
    }

    public void a(Canvas canvas) {
        if (this.f5416f > 0 && !canvas.isHardwareAccelerated()) {
            if (this.f5424n) {
                canvas.save();
                canvas.clipPath(this.f5417g, Region.Op.DIFFERENCE);
            }
            s.a(canvas, this.f5414d, this.f5412b.e(), this.f5416f);
            if (this.f5424n) {
                canvas.restore();
            }
        }
        if (this.f5412b.f()) {
            this.f5412b.b(canvas);
        } else {
            ((a) this.f5415e).b(canvas);
            b(canvas);
        }
    }

    void b(Canvas canvas) {
        Canvas canvas2;
        Paint paint = this.f5413c;
        if (paint == null) {
            return;
        }
        View view = this.f5415e;
        int width = view.getWidth();
        int height = view.getHeight();
        int i10 = this.f5421k;
        float f10 = i10 * 1.3f;
        float f11 = i10 * 0.2f;
        int i11 = this.f5422l;
        canvas.save();
        canvas.translate(view.getScrollX(), view.getScrollY());
        if ((i11 & 48) == 48) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, width, f10, paint);
        } else {
            canvas2 = canvas;
        }
        if ((i11 & 80) == 80) {
            canvas2.save();
            canvas2.rotate(180.0f);
            canvas2.translate(-width, ((-height) - f11) - f11);
            canvas2.drawRect(0.0f, 0.0f, width, f10, paint);
            canvas2.restore();
        }
        if ((i11 & 3) == 3) {
            canvas2.save();
            canvas2.rotate(-90.0f);
            canvas2.translate(-height, -f11);
            canvas2.drawRect(0.0f, 0.0f, height, f10, paint);
            canvas2.restore();
        }
        if ((i11 & 5) == 5) {
            canvas2.save();
            canvas2.rotate(90.0f);
            canvas2.translate(0.0f, (-width) - f11);
            canvas2.drawRect(0.0f, 0.0f, height, f10, paint);
            canvas2.restore();
        }
        canvas2.restore();
    }

    public boolean c() {
        return this.f5412b.e() <= 0;
    }

    public void e() {
        if (this.f5423m) {
            return;
        }
        d();
        o();
    }

    public void f(int i10, int i11, int i12, int i13) {
        this.f5414d.left = this.f5415e.getPaddingLeft();
        this.f5414d.top = this.f5415e.getPaddingTop();
        this.f5414d.bottom = i11 - this.f5415e.getPaddingBottom();
        this.f5414d.right = i10 - this.f5415e.getPaddingRight();
        this.f5412b.i();
        if (this.f5416f > 0) {
            Path path = this.f5417g;
            if (path == null) {
                this.f5417g = new Path();
            } else {
                path.reset();
            }
            float fE = this.f5412b.e();
            this.f5417g.addRoundRect(this.f5414d, fE, fE, Path.Direction.CW);
            if (this.f5412b.f() && (this.f5412b.c() & 112) != 112) {
                this.f5412b.a(this.f5417g);
            }
        } else {
            this.f5417g = null;
        }
        LinearLayoutEx.d dVar = this.f5411a;
        if (dVar != null) {
            dVar.a(this.f5415e, i10, i11, i12, i13);
        }
    }

    public void g(int i10, int i11) {
        this.f5412b.g(i10, i11);
    }

    public void h(int i10) {
        this.f5412b.h(i10);
    }

    public void i(LinearLayoutEx.d dVar) {
        this.f5411a = dVar;
    }

    public void j(int i10) {
        k(i10, this.f5418h);
    }

    public void l(int i10) {
        k(this.f5416f, i10);
    }

    public void m(int i10, int i11) {
        boolean z10 = this.f5421k > 0 && this.f5422l > 0;
        this.f5421k = i10;
        this.f5422l = i11;
        if (z10 != (i10 > 0 && i11 > 0)) {
            if (!z10) {
                this.f5415e.setWillNotDraw(false);
            }
            this.f5415e.invalidate();
        }
        if (i10 == 0 || i11 == 0) {
            this.f5413c = null;
            return;
        }
        Paint paint = new Paint(1);
        this.f5413c = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i10 * 1.2f, 1140850688, 0, Shader.TileMode.CLAMP));
    }

    public void n(int i10) {
        m(this.f5421k, i10);
    }
}
