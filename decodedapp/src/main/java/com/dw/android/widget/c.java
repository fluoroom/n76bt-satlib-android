package com.dw.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatLinearLayout;
import com.dw.android.widget.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends AppCompatLinearLayout implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f5425a;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f5425a = new b(this, context, attributeSet, i10, i11);
    }

    @Override // com.dw.android.widget.b.a
    public void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.f5425a.a(canvas);
    }

    public b getCSHelper() {
        return this.f5425a;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        return this.f5425a == null ? super.isOpaque() : super.isOpaque() && this.f5425a.c();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f5425a.f(i10, i11, i12, i13);
    }

    public void setCornerRadius(int i10) {
        this.f5425a.h(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        b bVar = this.f5425a;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        b bVar = this.f5425a;
        if (bVar != null) {
            bVar.e();
        }
    }

    public void setRising(int i10) {
        this.f5425a.j(i10);
    }

    public void setRisingGravity(int i10) {
        this.f5425a.l(i10);
    }

    public void setSinkGravity(int i10) {
        this.f5425a.n(i10);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(context, attributeSet, i10, 0);
    }
}
