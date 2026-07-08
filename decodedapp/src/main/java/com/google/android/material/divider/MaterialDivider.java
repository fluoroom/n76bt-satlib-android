package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.m;
import j9.c;
import m9.h;
import q9.a;
import u8.b;
import u8.d;
import u8.k;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f7827f = k.f28748x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f7828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7832e;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f28564t);
    }

    public int getDividerColor() {
        return this.f7830c;
    }

    public int getDividerInsetEnd() {
        return this.f7832e;
    }

    public int getDividerInsetStart() {
        return this.f7831d;
    }

    public int getDividerThickness() {
        return this.f7829b;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = getLayoutDirection() == 1;
        int i11 = z10 ? this.f7832e : this.f7831d;
        if (z10) {
            width = getWidth();
            i10 = this.f7831d;
        } else {
            width = getWidth();
            i10 = this.f7832e;
        }
        this.f7828a.setBounds(i11, 0, width - i10, getBottom() - getTop());
        this.f7828a.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f7829b;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f7830c != i10) {
            this.f7830c = i10;
            this.f7828a.c0(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(b0.b.b(getContext(), i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f7832e = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f7831d = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f7829b != i10) {
            this.f7829b = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f7827f;
        super(a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f7828a = new h();
        TypedArray typedArrayI = m.i(context2, attributeSet, l.H3, i10, i11, new int[0]);
        this.f7829b = typedArrayI.getDimensionPixelSize(l.L3, getResources().getDimensionPixelSize(d.L));
        this.f7831d = typedArrayI.getDimensionPixelOffset(l.K3, 0);
        this.f7832e = typedArrayI.getDimensionPixelOffset(l.J3, 0);
        setDividerColor(c.a(context2, typedArrayI, l.I3).getDefaultColor());
        typedArrayI.recycle();
    }
}
