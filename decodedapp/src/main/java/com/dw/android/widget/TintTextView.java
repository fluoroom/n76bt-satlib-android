package com.dw.android.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public class TintTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u3.b f5383a;

    public TintTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        u3.b bVar = this.f5383a;
        if (bVar != null) {
            bVar.a();
        }
    }

    public ColorStateList getTintList() {
        u3.b bVar = this.f5383a;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getTintMode() {
        u3.b bVar = this.f5383a;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u3.b bVar = this.f5383a;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u3.b bVar = this.f5383a;
        if (bVar != null) {
            bVar.g();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        u3.b bVar = this.f5383a;
        if (bVar != null) {
            bVar.e(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        u3.b bVar = this.f5383a;
        if (bVar != null) {
            bVar.f(mode);
        }
    }

    public TintTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5383a = new u3.b(this, attributeSet, i10, 0);
    }
}
