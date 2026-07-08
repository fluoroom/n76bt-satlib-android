package com.dw.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import k3.g;

/* JADX INFO: loaded from: classes.dex */
public class CheckableLinearLayout extends LinearLayoutEx implements Checkable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CheckBox f6907g;

    public CheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CheckBox checkBox = (CheckBox) LayoutInflater.from(context).inflate(g.f19212f, (ViewGroup) null);
        checkBox.setClickable(false);
        checkBox.setFocusable(false);
        addView(checkBox, new LinearLayoutCompat.LayoutParams(-2, -1));
        this.f6907g = checkBox;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f6907g.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f6907g.setChecked(z10);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f6907g.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f6907g.toggle();
    }
}
