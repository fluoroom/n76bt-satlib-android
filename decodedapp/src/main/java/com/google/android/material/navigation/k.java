package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class k extends FrameLayout implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f8127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f8129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.appcompat.view.menu.j f8130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f8131e;

    k(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(u8.h.f28681j, (ViewGroup) this, true);
        this.f8127a = (TextView) findViewById(u8.f.O);
    }

    private void a() {
        androidx.appcompat.view.menu.j jVar = this.f8130d;
        if (jVar != null) {
            setVisibility((!jVar.isVisible() || (!this.f8128b && this.f8129c)) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public androidx.appcompat.view.menu.j getItemData() {
        return this.f8130d;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void initialize(androidx.appcompat.view.menu.j jVar, int i10) {
        this.f8130d = jVar;
        jVar.setCheckable(false);
        this.f8127a.setText(jVar.getTitle());
        a();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
    }

    @Override // com.google.android.material.navigation.g
    public void setExpanded(boolean z10) {
        this.f8128b = z10;
        a();
    }

    public void setIcon(Drawable drawable) {
    }

    @Override // com.google.android.material.navigation.g
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f8129c = z10;
        a();
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.j.m(this.f8127a, i10);
        ColorStateList colorStateList = this.f8131e;
        if (colorStateList != null) {
            this.f8127a.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f8131e = colorStateList;
        if (colorStateList != null) {
            this.f8127a.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
    }
}
