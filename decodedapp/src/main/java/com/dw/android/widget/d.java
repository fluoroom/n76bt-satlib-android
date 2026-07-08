package com.dw.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.dw.android.widget.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends TintTextView implements b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f5426b;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f5426b = new b(this, context, attributeSet, i10, i11);
    }

    @Override // com.dw.android.widget.b.a
    public void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.f5426b.a(canvas);
    }

    public b getCSHelper() {
        return this.f5426b;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        return this.f5426b == null ? super.isOpaque() : super.isOpaque() && this.f5426b.c();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f5426b.f(i10, i11, i12, i13);
    }

    public void setCornerRadius(int i10) {
        this.f5426b.h(i10);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        b bVar = this.f5426b;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        b bVar = this.f5426b;
        if (bVar != null) {
            bVar.e();
        }
    }

    public void setRising(int i10) {
        this.f5426b.j(i10);
    }

    public void setRisingGravity(int i10) {
        this.f5426b.l(i10);
    }

    public void setSinkGravity(int i10) {
        this.f5426b.n(i10);
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet, i10, 0);
    }
}
