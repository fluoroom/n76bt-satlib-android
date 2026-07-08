package com.dw.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.dw.android.widget.b;
import com.dw.widget.LinearLayoutEx;

/* JADX INFO: loaded from: classes.dex */
public class CSFrameLayout extends FrameLayout implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f5280a;

    public CSFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f5280a = new b(this, context, attributeSet, i10, i11);
    }

    @Override // com.dw.android.widget.b.a
    public void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.f5280a.a(canvas);
    }

    public b getCSHelper() {
        return this.f5280a;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        return this.f5280a == null ? super.isOpaque() : super.isOpaque() && this.f5280a.c();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f5280a.f(i10, i11, i12, i13);
    }

    public void setCornerRadius(int i10) {
        this.f5280a.h(i10);
    }

    public void setOnSizeChangingListener(LinearLayoutEx.d dVar) {
        this.f5280a.i(dVar);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        b bVar = this.f5280a;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        b bVar = this.f5280a;
        if (bVar != null) {
            bVar.e();
        }
    }

    public void setRising(int i10) {
        this.f5280a.j(i10);
    }

    public void setRisingGravity(int i10) {
        this.f5280a.l(i10);
    }

    public void setSinkGravity(int i10) {
        this.f5280a.n(i10);
    }
}
