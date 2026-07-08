package com.dw.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import k3.g;
import k3.l;

/* JADX INFO: loaded from: classes.dex */
public class CardHeaderView extends LinearLayoutCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f5282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f5283b;

    public CardHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void c(CharSequence charSequence, CharSequence charSequence2) {
        TextView textView = this.f5282a;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
        this.f5283b.setText(charSequence2);
    }

    public CharSequence getLeftText() {
        return this.f5282a.getText();
    }

    public CharSequence getRightText() {
        return this.f5283b.getText();
    }

    public void setFont(y5.b bVar) {
        throw null;
    }

    public void setHeaderText(CharSequence charSequence) {
        c(charSequence, "");
    }

    public void setLeftText(CharSequence charSequence) {
        this.f5282a.setText(charSequence);
    }

    public void setRightText(CharSequence charSequence) {
        this.f5283b.setText(charSequence);
    }

    public CardHeaderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        View.inflate(context, g.f19216j, this);
        setOrientation(1);
        this.f5282a = (TextView) findViewById(k3.f.N);
        this.f5283b = (TextView) findViewById(k3.f.O);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.C, i10, 0);
        try {
            c(typedArrayObtainStyledAttributes.getString(l.D), typedArrayObtainStyledAttributes.getString(l.E));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setLeftText(int i10) {
        this.f5282a.setText(i10);
    }

    public void setRightText(int i10) {
        this.f5283b.setText(i10);
    }
}
