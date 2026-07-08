package com.dw.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import k3.g;
import k3.l;

/* JADX INFO: loaded from: classes.dex */
public class TowLineTextView extends LinearLayoutCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f5384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f5385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f5386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f5387d;

    public TowLineTextView(Context context) {
        this(context, null);
    }

    private void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        d(context);
        this.f5386c = (TextView) findViewById(k3.f.P);
        this.f5387d = (TextView) findViewById(k3.f.J);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.O3, i10, i11);
        try {
            setTitle(typedArrayObtainStyledAttributes.getString(l.Q3));
            setSummary(typedArrayObtainStyledAttributes.getString(l.P3));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    protected void d(Context context) {
        View.inflate(context, g.f19223q, this);
        setOrientation(1);
    }

    public CharSequence getSummary() {
        return this.f5385b;
    }

    public TextView getSummaryView() {
        return this.f5387d;
    }

    public CharSequence getTitle() {
        return this.f5384a;
    }

    public TextView getTitleView() {
        return this.f5386c;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setSummary(int i10) {
        setSummary(getContext().getText(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public TowLineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5384a = "";
        this.f5385b = "";
        c(context, attributeSet, 0, 0);
    }

    public void setSummary(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.f5385b = charSequence;
        if (this.f5387d == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f5387d.setVisibility(8);
        } else {
            this.f5387d.setText(charSequence);
            this.f5387d.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.f5384a = charSequence;
        if (this.f5386c == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f5386c.setVisibility(8);
        } else {
            this.f5386c.setText(charSequence);
            this.f5386c.setVisibility(0);
        }
    }

    public TowLineTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5384a = "";
        this.f5385b = "";
        c(context, attributeSet, i10, 0);
    }
}
