package com.google.android.material.navigation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class b extends FrameLayout implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f8044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8045c;

    b(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(u8.h.f28680i, (ViewGroup) this, true);
        a();
    }

    public void a() {
        setVisibility((!this.f8045c || (!this.f8043a && this.f8044b)) ? 8 : 0);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public androidx.appcompat.view.menu.j getItemData() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void initialize(androidx.appcompat.view.menu.j jVar, int i10) {
        a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setDividersEnabled(boolean z10) {
        this.f8045c = z10;
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
    }

    @Override // com.google.android.material.navigation.g
    public void setExpanded(boolean z10) {
        this.f8043a = z10;
        a();
    }

    public void setIcon(Drawable drawable) {
    }

    @Override // com.google.android.material.navigation.g
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f8044b = z10;
        a();
    }

    public void setTitle(CharSequence charSequence) {
    }
}
