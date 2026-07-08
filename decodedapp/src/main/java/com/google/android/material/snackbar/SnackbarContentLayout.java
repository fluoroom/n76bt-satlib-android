package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import h9.d;
import u8.f;

/* JADX INFO: loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f8232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Button f8233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeInterpolator f8234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8235d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8234c = d.g(context, u8.b.G, v8.a.f30493b);
    }

    private static void d(View view, int i10, int i11) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i10, view.getPaddingEnd(), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean e(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f8232a.getPaddingTop() == i11 && this.f8232a.getPaddingBottom() == i12) {
            return z10;
        }
        d(this.f8232a, i11, i12);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i10, int i11) {
        this.f8232a.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f8232a.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f8234c).setStartDelay(j11).start();
        if (this.f8233b.getVisibility() == 0) {
            this.f8233b.setAlpha(0.0f);
            this.f8233b.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f8234c).setStartDelay(j11).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i10, int i11) {
        this.f8232a.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f8232a.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f8234c).setStartDelay(j11).start();
        if (this.f8233b.getVisibility() == 0) {
            this.f8233b.setAlpha(1.0f);
            this.f8233b.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f8234c).setStartDelay(j11).start();
        }
    }

    void c(float f10) {
        if (f10 != 1.0f) {
            this.f8233b.setTextColor(c9.a.k(c9.a.d(this, u8.b.f28552h), this.f8233b.getCurrentTextColor(), f10));
        }
    }

    public Button getActionView() {
        return this.f8233b;
    }

    public TextView getMessageView() {
        return this.f8232a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f8232a = (TextView) findViewById(f.R);
        this.f8233b = (Button) findViewById(f.Q);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(u8.d.f28607n);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(u8.d.f28605m);
        Layout layout = this.f8232a.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f8235d <= 0 || this.f8233b.getMeasuredWidth() <= this.f8235d) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f8235d = i10;
    }
}
