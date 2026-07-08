package com.dw.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;
import k3.k;
import k3.l;

/* JADX INFO: loaded from: classes.dex */
public class LabelView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f6948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RectF f6949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Paint f6950d;

    public LabelView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6950d = new Paint(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f19280g1, i10, 0);
        this.f6948b = typedArrayObtainStyledAttributes.getDimension(l.f19285h1, 4.0f);
        this.f6947a = typedArrayObtainStyledAttributes.getColor(l.f19290i1, -16034924);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getColor() {
        return this.f6947a;
    }

    public float getRadius() {
        return this.f6948b;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f6949c != null) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            canvas.save();
            canvas.translate(scrollX, scrollY);
            RectF rectF = this.f6949c;
            float f10 = this.f6948b;
            canvas.drawRoundRect(rectF, f10, f10, this.f6950d);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f6949c = new RectF(0.0f, 0.5f, i10, i11 - 1.5f);
        super.onSizeChanged(i10, i11, i12, i13);
    }

    public void setColor(int i10) {
        if (this.f6947a == i10) {
            return;
        }
        this.f6947a = i10;
        this.f6950d.setColor(i10);
        invalidate();
    }

    public void setRadius(float f10) {
        this.f6948b = f10;
    }

    public LabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.f19246d);
    }
}
