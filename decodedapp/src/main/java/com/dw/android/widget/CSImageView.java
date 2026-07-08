package com.dw.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.dw.android.widget.b;

/* JADX INFO: loaded from: classes.dex */
public class CSImageView extends AppCompatImageView implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f5281a;

    public CSImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f5281a = new b(this, context, attributeSet, i10, i11);
    }

    @Override // com.dw.android.widget.b.a
    public void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.f5281a.a(canvas);
    }

    public b getCSHelper() {
        return this.f5281a;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean isOpaque() {
        return this.f5281a == null ? super.isOpaque() : super.isOpaque() && this.f5281a.c();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f5281a.f(i10, i11, i12, i13);
    }

    public void setCornerRadius(int i10) {
        this.f5281a.h(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        b bVar = this.f5281a;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        b bVar = this.f5281a;
        if (bVar != null) {
            bVar.e();
        }
    }

    public void setRising(int i10) {
        this.f5281a.j(i10);
    }

    public void setRisingGravity(int i10) {
        this.f5281a.l(i10);
    }

    public void setSinkGravity(int i10) {
        this.f5281a.n(i10);
    }

    public CSImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet, i10, 0);
    }
}
